package week1.day2.week1Assignments;

public class Repeatchar {

	public static void main(String[] args) {
		String company = "Hexaware";
		char expected ='e';
		int count=0;
		char[] charArray = company.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] =='e') {
				count=count+1;
			}
			
		}System.out.println(count);

	}

}

