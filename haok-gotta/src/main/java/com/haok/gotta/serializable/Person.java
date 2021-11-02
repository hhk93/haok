package com.haok.gotta.serializable;

import lombok.experimental.Accessors;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

@Accessors(chain = true)
public class Person extends Human implements Serializable {

    private static final long serialVersionUID = -8989716541521552638L;
    private String name;
    private String code;
    private String address;
    private String host;
    private static int phone;
    private String telenumber;

    public Person(String gender, String name) {
        super(gender);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public static int getPhone() {
        return phone;
    }

    public static void setPhone(int phone) {
        Person.phone = phone;
    }

    public String getTelenumber() {
        return telenumber;
    }

    public void setTelenumber(String telenumber) {
        this.telenumber = telenumber;
    }


}
