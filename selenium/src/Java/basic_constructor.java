package Java;

public class basic_constructor {
	
	int x;
	int y;
	float z;
	
	public basic_constructor(int x , int y)
	{
		this.x=10 ;
		this.y=20;
	}
	
	public basic_constructor(float z)
	{
		this.z=(float) 11.6;
	}
	
	public basic_constructor()
	{ }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		basic_constructor bc = new basic_constructor( 10 , 11 );
		basic_constructor bc1 = new basic_constructor( (float) 11.6);
		basic_constructor bc2 = new basic_constructor( );
		
		System.out.println(bc.x);
		System.out.println(bc.y);
		System.out.println(bc1.z);
		System.out.println(bc2);
		
	}

}
