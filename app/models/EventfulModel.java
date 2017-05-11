package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by paulk4ever on 4/18/17.
 */
@Entity
@Table(name="events")
public class EventfulModel extends Model {

    @Id
    @Constraints.Required
    public String title;

//    @Constraints.Required
    public String venue;

    public int votes;

    public static Finder<String, EventfulModel> find = new Finder<String, EventfulModel>(EventfulModel.class);

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public void setVotes(int votes){
        this.votes = votes;
    }
    public int getVotes(){
        return votes;
    }
}
