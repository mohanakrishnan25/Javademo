package com.fileexceptions;

import java.io.FileNotFoundException;

public class Sample {
	public static void main(String[] args) throws FileNotFoundException {
	String id="12345";
	if(id.startsWith("100")) {
		System.out.println("Employee details is Valid ");
	}else {
		throw new FileNotFoundException();
	}
	}

}
