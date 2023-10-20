package com.omrbranch.pay.loadmanager;

import com.omrbranch.payload.address.AddressPayLoad;
import com.omrbranch.payload.product.Productpayload;

public class PayloadManager {
	private AddressPayLoad addresspayload;
	private Productpayload productpayload;
	
	public AddressPayLoad getAddresspayload() {
		return(addresspayload==null)?addresspayload= new AddressPayLoad():addresspayload;
	}
	public Productpayload getProductpayload() {
		return(productpayload ==null)?productpayload = new Productpayload():productpayload;
	
	}

}
