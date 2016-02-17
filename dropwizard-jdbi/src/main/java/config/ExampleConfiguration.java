package config;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import dao.MyDAO;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import lombok.Getter;

/**
 * Created by omprakash.yadav on 17/02/16.
 */
public class ExampleConfiguration extends Configuration {

    @Valid
    @NotNull
    private DataSourceFactory database= new DataSourceFactory();

    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory() {
        return database;
    }
    public void setDatabase(DataSourceFactory database) {
        this.database = database;
    }
}
