package com.shucan.example.common.model;

import java.io.Serializable;

/**
 * @author: ningkun
 * @date: 2024-03-18 11:25
 */
public class User implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
