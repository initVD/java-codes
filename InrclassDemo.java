class Outer
{
	int i=100;
	void print()
	{
		//System.out.println(" I="+i);   
		Inner iobj=new Inner();
		iobj.show();
		//System.out.println(" J="+iobj.j);
	}
	 
	 class Inner
	   {
		int j=200;
		void show()
		   {
			System.out.println(" I="+i); 
			System.out.println(" J="+j);
		   }
		
	}
}

class  InrclassDemo
{
	public static void main(String[] args) 
	{
	   	
		Outer o=new Outer();
		//o.print();
		
		Outer.Inner iobj=new Outer().new Inner();
		iobj.show();
		
	}
}






