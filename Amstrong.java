package Amstrong;
public class Amstrong {

	public static void main(String[] args) {
		int n=371;
		int originalNumber;
		int reminder;
		int result=0;
		originalNumber = n;
		while (originalNumber!=0)
		{
			reminder=originalNumber%10;
			result+=Math.pow(reminder, 3);
			originalNumber/=10;
		}
				if(result==n)
					System.out.println(n+"is an Amstrong number");
				else
					System.out.println(n+"is not an Amstrong number");				
	}

}
