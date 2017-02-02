package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {
  private String name;
  private ArrayList <Address> addresses = new ArrayList<Address>();

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

  public List<Address> getAddresses() {
    return addresses;
  }

}
