package com.example.hzh.dialogtest;

/**
 * Created by Administrator on 2020/7/23.
 */

public class Contact {
    private String name;
    private String phone;



    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
