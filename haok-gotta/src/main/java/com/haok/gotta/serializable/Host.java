package com.haok.gotta.serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Host implements Serializable {

    private int ip;

    private String name;

}
