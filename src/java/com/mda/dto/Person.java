/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mda.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thang
 */
@XmlRootElement
public class Person implements Serializable {

    //Profile
    //private String username;
    private String password;
    private String fullName;
    private String email;
    private int age;
    private String gender;
    private String avatar;
    private String phone;
    private String address;
    private String hobbies;

    //facebook account id
    private String facebookId;

    //Position
    private double longitude;
    private double latitude;
    private int lastKnown;

    //dating search options
    private boolean datingMen;
    private boolean datingWomen;
    private String datingProfile;
    private int datingAge;

    public Person() {
        this.password = "";
        this.fullName = "";
        this.email = "";
        this.age = 0;
        this.gender = "";
        this.avatar = "";
        this.phone = "";
        this.address = "";
        this.hobbies = "";
        
        this.longitude = 0;
        this.latitude = 0;
        this.lastKnown = 0;
        
        this.datingAge = 18;
        this.datingProfile = "";
        this.datingMen = true;
        this.datingWomen = true;
    }

    public Person(String password, String fullName, String email, int age, String gender) {
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getLastKnown() {
        return lastKnown;
    }

    public void setLastKnown(int lastKnown) {
        this.lastKnown = lastKnown;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public boolean isDatingMen() {
        return datingMen;
    }

    public void setDatingMen(boolean datingMen) {
        this.datingMen = datingMen;
    }

    public boolean isDatingWomen() {
        return datingWomen;
    }

    public void setDatingWomen(boolean datingWomen) {
        this.datingWomen = datingWomen;
    }

    public String getDatingProfile() {
        return datingProfile;
    }

    public void setDatingProfile(String dating_profile) {
        this.datingProfile = dating_profile;
    }

    public int getDatingAge() {
        return datingAge;
    }

    public void setDatingAge(int dating_age) {
        this.datingAge = dating_age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    
    @Override
    public String toString() {
        return "; Fullname: " + fullName + "; Gender: " + gender;
    }

}
