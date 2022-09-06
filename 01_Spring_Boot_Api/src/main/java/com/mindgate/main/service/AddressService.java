package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Address;
import com.mindgate.main.repository.AddressDetailRepositoryInterface;

@Service
public class AddressService implements AddressDetailServiceInterface {

	@Autowired
	private AddressDetailRepositoryInterface addressDetailRepositoryInterface;
	@Override
	public boolean addressNewAddress(Address address) {
		System.out.println(address);
		return addressDetailRepositoryInterface.addressNewAddress(address);
	}

	@Override
	public List<Address> getAllAddress() {
		return addressDetailRepositoryInterface.getAllAddress();
	}

	@Override
	public boolean deleteAddressByAddressId(int addressId) {
		return addressDetailRepositoryInterface.deleteAddressByAddressId(addressId);
	}

	@Override
	public Address getAddressByAddressId(int addressId) {
		return addressDetailRepositoryInterface.getAddressByAddressId(addressId);
	}

	@Override
	public boolean updateAddress(Address address) {
		return addressDetailRepositoryInterface.updateAddress(address);
	}

}
