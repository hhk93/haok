package com.haok.gotta.serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Person implements Serializable {

    private static final long serialVersionUID = -8989716541521552638L;
    private String name;
    private String code;
    private String address;
    private String host;
    private static int phone;
    private String telenumber;

    public Person() {
        System.out.println("Person ...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", address='" + address + '\'' +
                ", host='" + host + '\'' +
                '}';
    }
}
