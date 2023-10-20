package com.omrbranch.Pojo.product;

import java.util.ArrayList;

import io.cucumber.messages.types.Product;
import lombok.Data;

public class product_output {
	@Data
	public class SecarchProduct_output_Pojo {
		private int status;
	    private String message;
	    private ArrayList<Product> data;
	    private String currency;

	}
}

