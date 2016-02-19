package resources;

import Represantations.SampleCity;
import com.fasterxml.jackson.annotation.JsonProperty;
import dao.MyDAO;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by omprakash.yadav on 17/02/16.
 */
@Path("/city")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {

    private MyDAO dao;
    @JsonProperty
    String cityid;

    public SampleResource(MyDAO dao) {
        this.dao = dao;
    }
    @GET
    public Response getLol() {
        SampleCity sampleCity = getRandomCity();
        return Response.ok().entity(sampleCity).build();
    }
    private SampleCity getRandomCity() {
        List<SampleCity> cites = dao.getAllCity();
        return cites.get((int)(Math.random()*10)%2);
    }
    @GET
    @Path("/new/{id}")
    public Response createTable(@PathParam("id") int id ){
         cityid = makeNewCitytable(id);
        return Response.ok().entity(cityid).build();
    }
    private String makeNewCitytable(int id){
       dao.createNewTable("delhi1");
       return dao.findNameById(id);
    }

}
