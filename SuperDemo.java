class Test
{
	 private int a;//actual 
	
	Test(int a)//parameteried constructor
	   {
	   this.a=a;
	   System.out.println("Base para constructor");
	   }
	  Test()//Default constructor
	   {
	   a=100;
	   System.out.println("Base Default constructor");
	   }
	   void show()
	   {
		 System.out.println("A ="+a);
		
	   // System.out.println("B ="+b);
	   }
	 
	 
}
class UseTest extends Test
{
	  int a, b;
	    
	 UseTest(int x, int y)
	{
		super(100);
		System.out.println("Derived Para constructor");
		a=x;b=y;
		
	}
          
      
	void show()
	   {
		super.show();
		
		//System.out.println("Base A ="+super.a);
		
		 System.out.println("Derived A ="+a);
		
	     System.out.println("B ="+b);
	   }
}
class SuperDemo 
{
	
	public static void main(String[] args) 
	{
		   
       UseTest t=new  UseTest(200,300);
	    t.show();
	   
         
	}
}

//This - refer to current instance

//1) resolve ambiguty when formal para name is same as actual para

//2) invoke the constructor of the same class

//super

//1) invoke the constructor of the base class explicitly

//2) name ambuguity, same var name in the base and derived class

