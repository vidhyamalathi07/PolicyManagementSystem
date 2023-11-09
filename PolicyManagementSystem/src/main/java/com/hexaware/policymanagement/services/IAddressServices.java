package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.entity.Address;

public interface IAddressServices 
{

public Address createAddress(Address address);
public Address updateAddress(Address address);
public Address deleteAddress(Address address);
public List<Address> getAddressByCity(String city);
public List<Address> getAddressByState(String state);

public List<Address> getAllAddress();

}

