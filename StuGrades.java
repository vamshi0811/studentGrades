package com.swit;
import java.util.Scanner;

public class StuGrades {

	public static void main(String[] args) {
		int passmrks;
		System.out.println("Enter student marks:");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks>=35 && marks<65) {
			System.out.println("student passed with grade D");
			
		}
		else if(marks>=65 && marks<75) {
			System.out.println("student passed with grade C");
		}
		else if(marks>=75 && marks<85) {
			System.out.println("student passed with grade B");
		}
		else if(marks>=85 && marks<95) {
			System.out.println("student passed with grade A");
		}
		else if(marks>=95) {
			System.out.println("student passed Distinction");
		}
		else{
			System.out.println("student Failed");
		}

	}

}
