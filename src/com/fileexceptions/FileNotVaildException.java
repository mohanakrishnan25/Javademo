package com.fileexceptions;

@SuppressWarnings("serial")
public class FileNotVaildException extends Exception{
	@Override
	public String getMessage() {
		String msg="Employee Details Not Valid";
		return msg;
}
}
