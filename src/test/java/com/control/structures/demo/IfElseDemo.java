package com.control.structures.demo;

public class IfElseDemo {

	public static void main(String[] args) {
    // if..else control structure
		//This is used to execute the program based on the condition true or false
		//if the condition is true, if block is executed.. false, else block is executed
		int personAge = 15;
		// Above, I have assigned value 20 to a variable called personAge which is an
		// Integer data type
		//In if..else based program, if is mandatory else is optional
		
		/*
		 * AND Operator  && in Java
		 * This is used to club two conditions
		 * true && true --> true
		 * true && false --> false
		 * false && true --> false
		 * false && false --> false
		 * */
		
		/*
		 * OR Operator  || in Java (pipe)
		 * This is used to club two conditions
		 * true || true --> true
		 * true || false --> true
		 * false || true --> true
		 * false || false --> false
		 * */

		if (personAge >= 18 && personAge <=60 ) // 15 >= 18 && 15 <= 60 --> false && false --> false
		{
			System.out.println("person is a major");
			System.out.println("person is eligible to vote at voting station");
		} 
		else if (personAge >= 18 && personAge > 60 ) //  15 >= 18 && 15 > 60 --> false && false --> false
		{
			System.out.println("person is a major");
			System.out.println("person is eligible to vote from home/online");
		}
		else
		{
			System.out.println("person is a minor");
			System.out.println("person is not eligible to vote");
		}
	}

}
