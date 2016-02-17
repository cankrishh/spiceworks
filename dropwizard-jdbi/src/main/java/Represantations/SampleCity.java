package Represantations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by omprakash.yadav on 17/02/16.
 */
@AllArgsConstructor
public class SampleCity {
    @JsonProperty
    @Getter
    @Setter
    private int id;
    @JsonProperty
    @Getter
    @Setter
    private String name;

    public static class CityMapper implements ResultSetMapper<SampleCity> {

        @Override
        public SampleCity map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
            return new SampleCity(resultSet.getInt("id"), resultSet.getString("name"));
        }
    }

}
