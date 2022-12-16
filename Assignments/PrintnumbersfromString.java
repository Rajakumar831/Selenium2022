package week1.day2.Assignments;

public class PrintnumbersfromString {

	public static void main(String[] args) {
		String details= "Amazon has 11400 employees in chennai";
		String number = details.replaceAll("^[0-9]","");
		System.out.println(number);



	}


}


