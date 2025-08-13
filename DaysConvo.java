//Q3. Write a Java program to convert days to years, month and week.


import java.util.Scanner ;

public class DaysConvo{
	public static void main(String x[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Days :- ");
		long days = sc.nextInt();
		
		long year = days / 365 ;
		long month = (days%365)/30;
		long weeks = ((days%365)%30)/7;
		long day = ((days%365)%30)%7;

		
		System.out.println("Year\t: "+year+"\nmonth\t: "+month+"\nweeks\t: "+weeks+"\nDay\t: "+day);


		
	}	
}