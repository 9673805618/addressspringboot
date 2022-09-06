package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Address;

public interface AddressDetailRepositoryInterface {

	public boolean addressNewAddress(Address address);
	public List<Address> getAllAddress();
	public boolean deleteAddressByAddressId(int addressId);
	public Address getAddressByAddressId(int addressId);
	public boolean updateAddress(Address address);
}
