package com.omrbranch.payload.address;

import com.omrbranch.Pojo.address.AddUserAddressInput_Pojo;
import com.omrbranch.Pojo.address.CityList_Input_Pojo;

public class AddressPayLoad {
	public static CityList_Input_Pojo getcitylistpayload(String StateIdText) {
		CityList_Input_Pojo CityList_Input_Pojo = new CityList_Input_Pojo();
		return CityList_Input_Pojo;
		
	}
	public static AddUserAddressInput_Pojo addaAddresspayload(String firstName,String LastName,String MoboilNo,String apt,int stateId,int CityId,int CountryId,String Zipcode,String address,String addressType) {
		AddUserAddressInput_Pojo AddUserAddressInput_Pojo = new AddUserAddressInput_Pojo();
		return AddUserAddressInput_Pojo;
			}
	public void updateAddress(String addressId, String firstName,String LastName,String MoboilNo,String apt,int stateId,int CityId,int CountryId,String Zipcode,String address,String addressType) {

	}
	public void deleteAddress(String addressId, String firstName,String LastName,String MoboilNo,String apt,int stateId,int CityId,int CountryId,String Zipcode,String address,String addressType) {
	}
}
