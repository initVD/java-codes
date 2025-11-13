class Outer
{
	 int i=100;
	
	 void show()
	{
		
        System.out.print(" I= "+i);
	
	}
	  static class Inner
	   {
		int j=200;
		void print()
	    {
			Outer o=new Outer();
		   //o.show(); 
		    System.out.print(" I= "+o.i);
			System.out.print(" J= "+j);
        
		}

	}
}

class  NestclassDemo
{

	public static void main(String[] args) 
	{
		
		Outer.Inner io=new Outer.Inner();
		io.print();
		
		
		
		
	}
}
