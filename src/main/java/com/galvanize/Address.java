package com.galvanize;

import java.util.ArrayList;

public class Address {
  //instance variables
  private String street;
  private String city;
  private String state;
  private String zip;

  //constructor
  public Address(String street, String city, String state, String zip) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  //getters

  public String getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZip() {
    return zip;
  }

  //setters

   public void setStreet(String street) {
     this.street = street;
  }

   public void setCity(String city) {
     this.city = city;
  }

   public void setState(String state) {
     this.state = state;
  }

   public void setZip(String zip) {
     this.zip = zip;
  }

  @Override public String toString() {
    StringBuilder result = new StringBuilder();
    result.append( street + ", " +  city + ", " +  state + " " +  zip);
    return result.toString();
  }

}
