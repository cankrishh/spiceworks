package Resources;

import Representation.Person;
import persistence.PersonDB;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by omprakash.yadav on 15/02/16.
 */

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
public class PersonService {

    public PersonService(){

    }
    @GET
    @Path("/get/{id}")
    public Person getId(@PathParam("id") int id){
        return PersonDB.getById(id);
    }
    @GET
    @Path("/getAll")
    public List<Person> getAll(){
        return PersonDB.getAll();
    }

    @POST
    @Path("/save")
    public String save(Person person){
       return PersonDB.save(person);
    }

    @GET
    @Path("/remove")
    public void remove(){
         PersonDB.remove();
    }

}
