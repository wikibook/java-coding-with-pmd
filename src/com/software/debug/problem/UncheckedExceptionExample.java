package com.software.debug.problem;

public class UncheckedExceptionExample {

	public static void main(String[] args) {
		String[] array = new String[]{"abc", "def"};
		
		for(int i=0; i < array.length; i++) {
			try {
				System.out.println(array[i+1]);
			} catch(IndexOutOfBoundsException e) {
				
			}
		}
	}
}
