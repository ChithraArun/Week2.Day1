package Week2.Day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1="stops";
		String text2 ="posts";
		if(text1.length()==text2.length()) {
			char[] arr1=text1.toCharArray();
			char[] arr2=text2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			//for(int i=0;i<arr1.length;i++) {
				//for(int j=0;j<arr2.length;j++) {
					if(arr1.equals(arr2)) {
						System.out.println("The string has same letters");	
					}
					else {
						System.out.println("String chars not same");
					}
				}
				
			}
