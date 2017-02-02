package com.galvanize;

// import java.util.ArrayList;
import java.util.List;

interface Addressable {
  public List<Address> getAddresses();
  public void addAddress(Address address);
}
