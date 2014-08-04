package com.software.code.problem;

public class CyclomaticComplexityExample {

    public static void main(String[] args) {
        int[] array = {0,3,5,2,6,7,8,9,1,4};
        int[] sortedArray = new int[array.length];
        int temp;
        try {
            if(array.length > 0) {
                if(sortedArray.length > 0) {
                    if(sortedArray.length == array.length) {
                        
                        for(int i =0; i < array.length ; i++) {
                            
                            for(int k =i+1; k < array.length ; k++) {
                                if( array[i] > array[k]) {
                                    temp = array[i];
                                    array[i] = array[k];
                                    array[k] = temp;
                                }
                            }
                            for(int v : array) {
                                System.out.print(v +" "); 
                            }
                            System.out.print("\n");
                        }
                        
                        for(int i= 0; i < array.length; i++) {
                            sortedArray[i] = array[i];
                        }
                    }
                }
            }
            
            System.out.println("최종 결과"); 
            for(int v : sortedArray) {
                System.out.print(v + " "); 
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
