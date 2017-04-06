package com.wynnsolution.heinthurawynn.hash4test.parcel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Hein Thura Wynn on 4/5/2017.
 */

public class UserData implements Parcelable {

    private String user_name;
    private String user_email;
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

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
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

    public UserData(){

    }
    protected UserData(Parcel in) {

        user_name = in.readString();
        user_email = in.readString();
        user_password = in.readString();
        user_address = in.readString();
        user_education = in.readString();
        user_uni = in.readString();
    }

    public static final Creator<UserData> CREATOR = new Creator<UserData>() {
        @Override
        public UserData createFromParcel(Parcel in) {
            return new UserData(in);
        }

        @Override
        public UserData[] newArray(int size) {
            return new UserData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(user_name);
        dest.writeString(user_email);
        dest.writeString(user_password);
        dest.writeString(user_address);
        dest.writeString(user_education);
        dest.writeString(user_uni);
    }
}
