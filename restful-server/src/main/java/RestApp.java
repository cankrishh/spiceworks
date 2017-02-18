import Resources.PersonService;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by omprakash.yadav on 15/02/16.
 */
public class RestApp extends Application<RestStubConfig>{

    public static void main(String[] args) throws Exception{
        new RestApp().run(args);
    }

    @Override
    public void run(RestStubConfig config, Environment environment){
        final PersonService personService =new PersonService();

        environment.jersey().register(personService);
    }

}
