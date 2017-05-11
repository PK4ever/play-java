package controllers;


import com.evdb.javaapi.EVDBAPIException;
import com.evdb.javaapi.EVDBRuntimeException;
import com.evdb.javaapi.data.Event;
import models.ApiConnector;
import models.EventfulModel;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.ArrayList;

/**
 * Created by paulk4ever on 4/27/17.
 */

public class RestfullController extends Controller{

    @Inject
    public RestfullController(){

    }
//    PUT
    public Result updateVote(String title){
        EventfulModel model = new EventfulModel();

//        EventfulModel event = EventfulModel.find.where().eq("title", title).findUnique();
        EventfulModel event = model.find.byId(title);
        ////WHEN THE TITLE HAS SPECIAL VALUES ie #, THE EVENT IS NEVER FOUND
        int votes = 0;
        if (event != null){
            votes = event.getVotes();

            votes = votes + 1;
            model.setTitle(title);
            model.setVotes(votes);
            model.update();
            return ok("updated vote for "+title+ "!!");

        }
        return ok("Event "+title+ " does not exist!");
    }

    //    POST
    public Result postAllEvents(String keyword) throws EVDBRuntimeException, EVDBAPIException {
        ApiConnector apiConnector = new ApiConnector();
        ArrayList<Event> list = apiConnector.getEvents(keyword);

        EventfulModel model;
        for (Event event: list){
            model = new EventfulModel();
            if (model.find.byId(event.getTitle()) == null) {
                model.setTitle(event.getTitle());
                model.setVenue(event.getVenueAddress());
                model.setVotes(0);
                model.save();
            }else{
                updateVote(event.getTitle());
            }
        }

        return ok("All events with keyword " +keyword+ " have been added!");
    }
//    DELETE
    public Result deleteEntry(String title){
        EventfulModel model = new EventfulModel();
        if(model.find.byId(title) != null){
            model.find.deleteById(title);
            return ok(title+ " has been deleted from the list!");
        }else{
            return ok(title+ " Does not exist in the database");

        }

    }
}
