class Test
{
	int a,b;

   Test()//default constrcuctor
	{
	 b=200;
	}
	 Test(int a)//para constrcuctor
	{
	 this.a=a;
	   
	}

void show()
	   {
	   System.out.println("A ="+a);
	   System.out.println("B ="+b);
      
	   }

}

class ThisDemo 
{
	
	public static void main(String[] args) 
	{
		   
       Test t=new Test(100);
	 
	    t.show();
	   
         
	}
}

//This - refer to current instance

//1) resolve ambiguty when formal para name is same as actual para

//2) invoke the constructor of the same class




