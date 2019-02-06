package com.androidtutorialshub.loginregister.model;

/**
 * Created by lalit on 9/12/2016.
 */
public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private String nurseName;
    private String age;
    private String phoneNumber;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNurseName() { return nurseName; }

    public void setNurseName(String nurseName) { this.nurseName = nurseName; }

    public String getAge() { return age; }

    public void setAge(String age) { this.age = age; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber (String phoneNumber) { this.phoneNumber = phoneNumber; }
}
