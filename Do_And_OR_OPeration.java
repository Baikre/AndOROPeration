package com.geekster;
 import java.util.*;
public class Do_And_OR_OPeration {

	public static void main(String[] args) {
		
		 Scanner sc =  new Scanner(System.in);
		 
		 int A = sc.nextInt();
		 int B = sc.nextInt();
		 int AND = A&B;
		 int OR =A|B;
		 System.out.println("And operation ="+AND);
		
		 System.out.println("OR operation="+ OR);
	}
}
