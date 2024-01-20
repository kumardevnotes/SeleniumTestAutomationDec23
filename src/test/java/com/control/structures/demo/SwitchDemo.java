package com.control.structures.demo;

public class SwitchDemo {

	public static void main(String[] args) {

		String day = "Tuesday";

		switch (day) {
		case "Monday":
			System.out.println("Its Monday and weekday");
			break;
		case "Tuesday":
			System.out.println("Its Tuesday and weekday");
			break;
		case "Wednesday":
			System.out.println("Its Wednesday and weekday");
			break;
		case "Thursday":
			System.out.println("Its Thursday and weekday");
			break;
		case "Friday":
			System.out.println("Its Friday and weekday");
			break;
		case "Saturday":
			System.out.println("Its Saturday and weekend");
			break;
		case "Sunday":
			System.out.println("Its Sunday and weekend");
		default:
			System.out.println("Please pass a valid day!");
		}
		System.out.println("Hello I am ouside of switch!!!!");
	}

}
