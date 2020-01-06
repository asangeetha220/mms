package Java;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a= 20;
//		
//		for( int i=1;i<=a;i++) {
//			
//			if (i%2==0) {
//				System.out.println("given number is even " + i);
//			}
//				else {
//					
//					System.out.println("given number is odd "+ i);
//				}
//			}
//		}
//
//	}
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("enter number");
		num=sc.nextInt();
		
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				System.out.println("given number is even " + i);	
			}
		}
	}
}


