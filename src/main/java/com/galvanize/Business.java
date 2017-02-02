package com.galvanize;

// import java.util.ArrayList;
import java.util.List;

abstract class Business implements Addressable {
  private String name;
  private List<Address> addresses;

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

  public List<Address> getAddress() {
    return addresses;
  }

}
