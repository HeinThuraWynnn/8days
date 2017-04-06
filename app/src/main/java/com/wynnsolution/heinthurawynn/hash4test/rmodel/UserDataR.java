package com.wynnsolution.heinthurawynn.hash4test.rmodel;

import io.realm.RealmObject;

/**
 * Created by Hein Thura Wynn on 4/6/2017.
 */

public class UserDataR extends RealmObject {
    private String user_name;
    private String user_mail;
    private String user_password;
    private String user_address;
    private String user_education;

    public String getUser_uni() {
        return user_uni;
    }

    public void setUser_uni(String user_uni) {
        this.user_uni = user_uni;
    }

    private String user_uni;
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_mail() {
        return user_mail;
    }

    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_education() {
        return user_education;
    }

    public void setUser_education(String user_education) {
        this.user_education = user_education;
    }
}
