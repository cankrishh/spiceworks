package Representation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Created by omprakash.yadav on 15/02/16.
 */
public class Person {

    @JsonProperty @Getter
    private int id;
    @JsonProperty @Getter
    private String firstName;
    @JsonProperty @Getter
    private String lastName;
    @JsonProperty @Getter
    private String email;


    public Person(){
    // deserialization
    }

    //constructor
    public Person(int id,String firstName, String lastName, String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }




}
