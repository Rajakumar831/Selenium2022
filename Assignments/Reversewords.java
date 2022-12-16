package week1.day2.Assignments;

public class Reversewords {

	public static void main(String[] args) {
		String name = "Amazon Development Center, Chennai";
		String lowerCase = name.toLowerCase();
		String[] words = lowerCase.split(" ");	

		for (int i = words.length-1 ; i >=0; i--) {
			System.out.print(words[i]+ " ");

		}


	}

}
