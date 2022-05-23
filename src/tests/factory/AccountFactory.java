package tests.factory;

import entities.Account;

public class AccountFactory {

	public static Account createEmptyAccont() {
		return new Account(1L, 0.0);
	}
	
	public static Account createAccont(double initialbalance) {
		return new Account(1L, initialbalance);
	}
}
