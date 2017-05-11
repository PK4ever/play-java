package controllers;


import com.evdb.javaapi.APIConfiguration;
import com.evdb.javaapi.EVDBAPIException;
import com.evdb.javaapi.EVDBRuntimeException;
import com.evdb.javaapi.data.Event;
import com.evdb.javaapi.data.Location;
import com.evdb.javaapi.data.request.EventSearchRequest;
import com.evdb.javaapi.operations.EventOperations;
import models.ApiConnector;
import models.EventfulModel;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.eventsSearched;
import views.html.liked;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by paulk4ever on 4/12/17.
 */
public class EventFullController extends Controller {
    public final FormFactory formFactory;
    ApiConnector apiConnector;

    @Inject
    public EventFullController(FormFactory formFactory){
        this.formFactory = formFactory;
        apiConnector = new ApiConnector();
    }

    public Result search() throws EVDBRuntimeException, EVDBAPIException {
        DynamicForm requestData = formFactory.form().bindFromRequest();
        String keyWord = requestData.get("Event");

        ArrayList<Event> arrayList = apiConnector.getEvents(keyWord);

        return ok(eventsSearched.render(arrayList));
    }
    public Result addName() throws EVDBRuntimeException, EVDBAPIException {
        DynamicForm requestData = formFactory.form().bindFromRequest();
        String title = requestData.get("name");
        String venue = requestData.get("venue");
        EventfulModel model = new EventfulModel();
        List<EventfulModel> searchModel = EventfulModel.find.where().findList();


        if (EventfulModel.find.where().eq("title", title).findUnique() != null){
            return ok(liked.render(searchModel));
        }

        model.setTitle(title);
        model.setVenue(venue);
        model.save();
        List<EventfulModel> newModel = EventfulModel.find.where().findList();
        return ok(liked.render(newModel));
    }

    public Result delete(){
        DynamicForm requestData = formFactory.form().bindFromRequest();
        String title = requestData.get("name");
        EventfulModel model = new EventfulModel();
        model.find.deleteById(title);
        List<EventfulModel> newModel = model.find.where().findList();
        return ok(liked.render(newModel));
    }


}
