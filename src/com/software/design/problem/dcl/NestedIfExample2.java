package com.software.design.problem.dcl;

public class NestedIfExample2 {

	public static void main(String[] args) {
		int year = 2013;
		boolean result = false;
		if(year % 4 == 0) {
			if( year % 400 == 0) {
					result = true;
			} else {
				if( year % 100 != 0 ){
					result = true;
				}
			}
		}
		
	}
}
