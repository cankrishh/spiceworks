import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;
import lombok.Getter;

/**
 * Created by omprakash.yadav on 15/02/16.
 */
public class RestStubConfig extends Configuration {

    @NotEmpty
    @JsonProperty
    @Getter
    @Setter
    private String version;
}
