// package oops in java;
import java.util.*;


class BankAccount {
    public String username;
	private String password;
    public void setPassword(String pwd) {
		password = pwd;
	}
	
	public class AccessSpecifiers {
	
	BankAccount myAcc = new BankAccount();
	myAcc.username = "Kajal";
	myAcc.setPassword("abcd");
	}
}
