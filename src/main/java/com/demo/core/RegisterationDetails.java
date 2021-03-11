package com.demo.core;

public class RegisterationDetails {

	private String email;
	private String name;
	private String password;
	private String companyName;
	private String accountName;

	public RegisterationDetails(String email, String name, String password, String companyName, String accountName) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.companyName = companyName;
		this.accountName = accountName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
	public String toString() {
		return "RegisterationDetails [email=" + email + ", name=" + name + ", password=" + password + ", companyName="
				+ companyName + ", accountName=" + accountName + "]";
	}

}
