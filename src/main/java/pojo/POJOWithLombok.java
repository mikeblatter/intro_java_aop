package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

// Doesn't work, disabled lombok and enabled aspectj

public class POJOWithLombok {
    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;

    public POJOWithLombok(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
