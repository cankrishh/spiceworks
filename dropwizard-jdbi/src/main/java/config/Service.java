package config;

import Represantations.SampleCity;
import dao.MyDAO;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import io.dropwizard.jdbi.DBIFactory;
import org.skife.jdbi.v2.DBI;
import resources.SampleResource;

/**
 * Created by omprakash.yadav on 17/02/16.
 */
public class Service extends Application<ExampleConfiguration>{

    public static void main(String[] args) throws Exception{
       new Service().run(args);

    }
    @Override
    public void run(ExampleConfiguration config , Environment environment){

            final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, config.getDataSourceFactory(),"mysql");
        final MyDAO dao = jdbi.onDemand(MyDAO.class);
        environment.jersey().register(new SampleResource(dao));
    }
}
