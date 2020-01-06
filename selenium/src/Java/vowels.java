package Java;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sangeethayes";
				char ch;
			int	count = 0 ;
for ( int i=0;i<str.length();i++) {
	ch=str.toLowerCase().charAt(i);
	
	
	if((ch=='a' || ch=='e' || 	ch=='i'|| ch=='o'|| ch=='u'))
			{
		System.out.println("vowels are "+ ch );
		count++;
		
		System.out.println ("vowels count"+ count);
			}
	else {
		
		System.out.println("consonants are "+ ch );

	}
		
		
		
	}

}}
