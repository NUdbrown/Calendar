package dbrown_date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarCalculator
{

	
	private Scanner scan = new Scanner(System.in);
			
	public String prompt(String msg)
	{
		System.out.println(msg);
		return msg;
	}

	public void calculateAge(){
		
		try{
			int year, day, month;
			
			prompt("Enter your birth year: ");
			year = scan.nextInt();
			prompt("Enter your month: ");
			month = scan.nextInt();
			prompt("Enter your birth day: ");
			day = scan.nextInt();
			
			
			GregorianCalendar date1 = new GregorianCalendar(year, month, day);
			GregorianCalendar date2 = new GregorianCalendar();
			
			date2.add(Calendar.YEAR, -date1.get(Calendar.YEAR));
			date2.add(Calendar.MONTH, -date1.get(Calendar.MONTH));
			date2.add(Calendar.DAY_OF_MONTH, -date1.get(Calendar.DAY_OF_MONTH) + 1);
			
			int years = date2.get(Calendar.YEAR);
			int months = date2.get(Calendar.MONTH);
			int days = date2.get(Calendar.DAY_OF_MONTH) - 1;
			
			System.out.println("You are : " + years + " years and " + months + " months and " + days + " days.");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Enter a number please!");
		}
		

	}
	
	public void calculateAnni() 
	{
		int year, day, month;
		try{
					
			prompt("Enter your anniversary year: ");
			year = scan.nextInt();
			prompt("Enter your anniversary month: ");
			month = scan.nextInt();
			prompt("Enter your anniversary day: ");
			day = scan.nextInt();

			
			GregorianCalendar date1 = new GregorianCalendar(year, month, day);
			GregorianCalendar date2 = new GregorianCalendar();
			 
			date2.add(Calendar.YEAR, -date1.get(Calendar.YEAR));
			date2.add(Calendar.MONTH, -date1.get(Calendar.MONTH));
			date2.add(Calendar.DAY_OF_MONTH, -date1.get(Calendar.DAY_OF_MONTH) + 1);
			date2.add(Calendar.HOUR, -date1.get(Calendar.HOUR));
			date2.add(Calendar.MINUTE, -date1.get(Calendar.MINUTE));
			date2.add(Calendar.SECOND, -date1.get(Calendar.SECOND));
			
			int years = date2.get(Calendar.YEAR);
			int months = date2.get(Calendar.MONTH);
			int days = date2.get(Calendar.DAY_OF_MONTH) - 1;
			int hours = date2.get(Calendar.HOUR);
			int minutes = date2.get(Calendar.MINUTE);
			int seconds = date2.get(Calendar.SECOND);
			
			System.out.println("There are "+ years + " years and " + months + " months, "+ days +" days, "+hours+ " hours, "+minutes+
					"minutes, and " +seconds+ " seconds until this anniversary occurs.");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Enter a number please!");
		} 
	}

	public void CalculateAgeDiff(){  
		int year, month, day; 
		int year1, month1, day1;
		
		try{
			
		  prompt("Enter First birth year:");
		  year = scan.nextInt();  
		  prompt("Enter First birth month:");
		  month = scan.nextInt();  
		  prompt("Enter First birth day:");
		  day = scan.nextInt(); 
		  prompt("Enter Second birth year:");
		  year1 = scan.nextInt(); 
		  prompt("Enter Second birth month:"); 
		  month1 = scan.nextInt(); 
		  prompt("Enter Second birth day:"); 
		  day1 = scan.nextInt();
		  
		  GregorianCalendar date1 = new GregorianCalendar(year, month, day);
		  GregorianCalendar date2 = new GregorianCalendar(year1, month1, day1);

		  date2.add(Calendar.YEAR, -date1.get(Calendar.YEAR));
		  date2.add(Calendar.MONTH, -date1.get(Calendar.MONTH));
		  date2.add(Calendar.DAY_OF_MONTH, -date1.get(Calendar.DAY_OF_MONTH) + 1);

		  int years = date2.get(Calendar.YEAR);
		  int months = date2.get(Calendar.MONTH);
		  int days = date2.get(Calendar.DAY_OF_MONTH) - 1;

		  System.out.println("There are " + years+" years" +", " + months +" months"+", "+ days + " days\n "
		  		+ "between\n " + month+ " " + day+ ", "+ year+" " + "and " + month1+" " + day1 +", "+ year1); 
		}
		
		catch(IllegalArgumentException e)
		{
			System.out.println("Please enter numbers!");
		}
	}
}
