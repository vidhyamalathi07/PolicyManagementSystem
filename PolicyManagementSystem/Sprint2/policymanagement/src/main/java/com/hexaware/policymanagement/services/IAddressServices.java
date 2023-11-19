package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.entities.Address;

public interface IAddressServices 
{

public boolean createAddress(Address address);
public boolean updateAddress(Address address);
public boolean deleteAddress(Address address);

public Address getAddressById(int address_id);

public List<Address> getAllAddress();

}

