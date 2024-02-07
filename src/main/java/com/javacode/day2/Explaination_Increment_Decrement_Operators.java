package com.javacode.day2;

public class Explaination_Increment_Decrement_Operators {

	public static void main(String[] args) {
		int i = 1; //latest value of i is 1

		//i++; //latest value of i is 2

		//++i; //latest value of i is 3

		int j = ++i;

		System.out.println(i);

		System.out.println(j);

		

		int k = i++ + ++i + j++;

		//  k = 2 + 4 + 2 = 8

		//  i = 3,  4     = 4

	    //  j = 3         = 3

		

		//  k = 8

		//  i = 4

		//  j = 3

		

		System.out.println(i);

		System.out.println(j);

		System.out.println(k);

		

		int l = k-- - --k + i-- - --i + j++ - --j;		

		//  l = 8  - 6  +  4 -  2     + 3  - 3 = 4

		//  k = 7,   6                         = 6

		//  i =            3,   2              = 2

		//  j =                         4    3 = 3

		

		System.out.println(i);

		System.out.println(j);

		System.out.println(k);

		System.out.println(l);	
	

	}

}
