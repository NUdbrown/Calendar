package dbrown_date;

import java.text.ParseException;
import java.util.Scanner;

public class CalMain {

	private static Scanner scan = new Scanner(System.in);
	static CalendarCalculator cal = new CalendarCalculator();
	static boolean notDone = false;

	public static void main(String[] args) {
		
		while(!notDone)
		{
			cal.prompt("Pick an operation you'd like to use. \nOperations are: Age, Anniversary, or AgeDifference.");
			String input = scan.nextLine();
			if(input.equalsIgnoreCase("Age"))
			{
				cal.calculateAge();
			}
			else if(input.equalsIgnoreCase("Anniversary"))
			{
				cal.calculateAnni();
			}
			else if(input.equalsIgnoreCase("AgeDifference"))
			{
				cal.CalculateAgeDiff();
			}
			else if(input.equalsIgnoreCase("exit"))
			{
				notDone = true;
				scan.close();
			}
		}		

	}

}
