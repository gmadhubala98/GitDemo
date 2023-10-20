package com.omrbranch.Pojo.login;

import lombok.Data;

@Data
	public class Login_Output_Pojo {
		private int status;
	    private String message;
	    private Login data;
	    private String refer_msg;
	    private int cart_count;
	    private String role;

	}
