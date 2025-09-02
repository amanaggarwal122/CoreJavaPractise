//package com.google.search;
//
//
//	
//	import java.io.IOException;
//
//	// 1. Custom Exception
//	class MyCustomException extends Exception
//	{
//	    public MyCustomException(String message)
//	    {
//	        super(message);
//	    }
//	}
//
//	public class ExceptionDemo {
//
//	    public static void main(String[] args) {
//	        ExceptionDemo obj = new ExceptionDemo();
//
//	        // Call custom exception
//	        try {
//	            obj.throwCustomException();
//	        } catch (MyCustomException e) {
//	            System.out.println("Caught Custom Exception: " + e.getMessage());
//	        }
//
//	        // Call checked exception
//	        try {
//	            obj.throwCheckedException();
//	        } catch (IOException e) {
//	            System.out.println("Caught Checked Exception: " + e.getMessage());
//	        }
//
//	        // Call unchecked exception
//	        try {
//	            obj.throwUncheckedException();
//	        } catch (ArithmeticException e) {
//	            System.out.println("Caught Unchecked Exception: " + e.getMessage());
//	        }
//	    }
//
//	    // 2. Method that throws a Custom Exception
//	    public void throwCustomException() throws MyCustomException {
//	        throw new MyCustomException("This is a custom-defined exception.");
//	    }
//
//	    // 3. Method that throws a Checked Exception
//	    public void throwCheckedException() throws IOException {
//	        throw new IOException("This is a checked exception (IO related).");
//	    }
//
//	    // 4. Method that throws an Unchecked Exception
//	    public void throwUncheckedException() {
//	        int result = 10 / 0;  // This will throw ArithmeticException
//	        System.out.println("Result: " + result);
//	    }
//	}
//
//
