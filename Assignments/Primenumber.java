package week1.day2.Assignments;

public class Primenumber {

	public static void main(String[] args) {
		int n =17;
	      boolean dPrime =true;
	      for (int i =2; i<n; i++)
	      {
	        if (n%i ==0)
	        {
	          System.out.println("not a prime");
	          dPrime=false;
	          break;
	        }
	      }
	      if (dPrime)
	      {
		System.out.println(" It is a prime");
		}
	}

	}

	


