package com.sk.exception;

public class UserIONotFound extends Exception {
	public UserIONotFound() {
		System.out.println("User not found");
	}

	@Override
	public String toString() {
		return "ExceptionHandle UserNotFound";
	}
}
