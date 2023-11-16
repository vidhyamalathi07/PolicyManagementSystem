package com.hexaware.policymanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.policymanagement.dto.AddressDTO;
import com.hexaware.policymanagement.entity.Address;
import com.hexaware.policymanagement.repository.AddressRepository;


@Service
public class AddressServicesImp implements IAddressServices {
	
	@Autowired
	AddressRepository addressrepo;

	@Override
	public Address createAddress(AddressDTO addressDTO) {
		Address address = new Address(); 

		address.setAddressLine(addressDTO.getAddressLine());
		address.setCity(addressDTO.getCity());
		address.setState(addressDTO.getState());
		address.setPincode(addressDTO.getPincode());
		
		
		return addressrepo.save(address);
	}

	@Override
	public Address updateAddress(AddressDTO addressDTO) {
		Address address = new Address(); 

		address.setAddressId(addressDTO.getAddressId());
		address.setAddressLine(addressDTO.getAddressLine());
		address.setCity(addressDTO.getCity());
		address.setState(addressDTO.getState());
		address.setPincode(addressDTO.getPincode());
		
		
		return addressrepo.save(address);
	}

	@Override
	public void deleteByAddressId(long addressId) {
		addressrepo.deleteById(addressId);
		

	}

	@Override
	public List<Address> getAllAddress() {
		
		return addressrepo.findAll();
	}

	@Override
	public List<Address> getByState(String state) {
		
		return addressrepo.findByState(state);
	}

	@Override
	public List<Address> getByCity(String city) {
		
		return addressrepo.findByCity(city);
	}

}
