
public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,sum = 0,tmp;
		int n = 454;
		
		tmp = n;
		while(n>0) {
			r=n%10;
			sum = (sum*10)+r;
			n=n/10;
			
		}
		
		if(sum==tmp)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
