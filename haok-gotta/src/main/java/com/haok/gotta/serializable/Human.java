package com.haok.gotta.serializable;

import lombok.Data;

@Data
public class Human {
    private String gender;

    public Human(String gender) {
        this.gender = gender;
    }

}
