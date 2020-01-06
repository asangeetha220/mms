package Java;

import java.util.Scanner;

public class jack_jill {

	public static void main(String[] args) {
		int Card = 0 ;
		
		Scanner newscanner = new Scanner( System.in);
		
		System.out.println("please enter card no:" );
		Card=newscanner.nextInt();
		
		switch(Card)
		{
		case 1:
			System.out.println("The number you entered was " + Card );
			System.out.println("your number is 1");
			break;
		case 2:
			System.out.println("The number you entered was " + Card );
			System.out.println("your number is 2");
			break;
		case 3:
			System.out.println("The number you entered was " + Card );
			System.out.println("your number is 3");
			break;
		case 4:
			System.out.println("The number you entered was " + Card );
			System.out.println("your number is 4");
			break;
		case 5:
			System.out.println("The number you entered was " + Card );
			System.out.println("your number is 5");
			break;
		case 6:
			System.out.println("The number you entered was " + Card );
			System.out.println("your number is 6");
			break;
		case 7:
			System.out.println("The number you entered was " + Card );
			System.out.println("your number is 7");
			break;
		case 8:
			System.out.println("The number you entered was " + Card );
			System.out.println("your number is 8");
			break;
		case 9:
			System.out.println("The number you entered was " + Card );
			System.out.println("your number is 9");
			break;
		case 10:
			System.out.println("The number you entered was " + Card );
			System.out.println("your number is 10");
			break;
			default :
				System.out.println("The number you entered was " + Card );
				System.out.println("no number provided");
				break;
			
		}

	}

}
