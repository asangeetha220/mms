package Java;

public class alphabets {
	
	public static void main(String args[]) {
		String str="sangeetha123";
		char ch;
		
		
		for (int i=1 ; i<str.length();i++) {
			ch=str.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
				System.out.println("given is alphabet"+ ch);}
				else {
					System.out.println("given is number"+ ch);
				
				}
			}
			
		}
		
		
		
		
		
		
		
	}


