package dao;
import Represantations.SampleCity;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Define;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import org.skife.jdbi.v2.sqlobject.stringtemplate.UseStringTemplate3StatementLocator;

import java.util.List;

/**
 * Created by omprakash.yadav on 17/02/16.
 */
@UseStringTemplate3StatementLocator
@RegisterMapper(SampleCity.CityMapper.class)
public interface MyDAO {

    @SqlUpdate("create table <name> (id int primary key, name varchar(100))")
    void createNewTable(@Define("name") String name);

    @SqlUpdate("insert into city (id, name) values (:id, :name)")
    void insert(@Bind("id") int id, @Bind("name") String name);

    @SqlQuery("select name from city where id = :id")
    String findNameById(@Bind("id") int id);

    @SqlQuery("select * from city")
    List<SampleCity> getAllCity();
}
