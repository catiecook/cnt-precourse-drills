package com.galvanize;

import java.util.ArrayList;

abstract class Business implements Addressable {
  private String name;
  private ArrayList<Address> addresses;

 //business constructor
  public Business(String name){
    this.name = name;
  }

  //getter
  public String getName() {
    return name;
  }

  //Address object
  public void addAddress(Address address){
    addresses.add(address);
  }

  public ArrayList<Address> getAddress() {
    return addresses;
  }

}
