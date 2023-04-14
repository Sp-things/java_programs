package WorkAssignment;

public class AssignmentLargestNumber {

	public static void main(String[] args) {
		int A=50;
		int B=200;
		int C=1500;

		if((A<B) && (B>C))
		{
			System.out.println("Largest number is" +B);
		}
		else if(C>B) 
				{
			System.out.println("Largest numnber is "+C);
		}
		else 
			System.out.println("Largest numner is" +A);
		
	}

}
