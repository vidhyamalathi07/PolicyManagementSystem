package com.hexaware.policymanagement.services;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.policymanagement.entity.Address;

class AddressServicesImpTest {
	
	AddressServicesImp ia = new AddressServicesImp();


	@Test
	void testCreateAddress() 
	{
		Address a = new Address();
		boolean actual = ia.createAddress(a);
		assertEquals(false, actual);
	}
	
	
	@Test
	void testUpdateAddress()
	{
		Address a = new Address();
		boolean actual = ia.updateAddress(a);
		assertEquals(false, actual);
		
	}
	
	
	@Test
	void testDeleteAddress()
	{
		Address a = new Address();
		boolean actual = ia.deleteAddress(a);
		assertEquals(false, actual);
		
	}
	@Test
	
	
	void testGetAddressById()
	{ 
		Address expected  = new Address(1,"a","b","c",1);
		Address actual = ia.getAddressById(1);
		assertEquals(expected,actual);

		
	}
	
	

	@Test
	void testGetAllAddress() 
	{
		List<Address> actual = new ArrayList<>();
		actual.add(new Address(1,"a","b","c",1));
		actual.add(new Address(2,"a","b","c",2));
		
		assertEquals(ia.getAllAddress(),actual);
	}

}
