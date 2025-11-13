/*class Student
{
	int prn;
	String name;
	static String dept;
	double per;
	
	static {
		dept="management";
}
	Student(int p,String nm, double pr)
	{
		prn=p;
		name=nm;
		per=pr;
	}
	void show()
	{
		System.out.println("PRN :"+prn);
		System.out.println("Name :"+name);
		System.out.println("Per :"+per);
		System.out.println("Dept :"+dept);
	}
	
 static void modify(String dtemp)
	{
		dept=dtemp;
	}
}
*/
class Test
{
	int a;
	static int b;
   
    static {
		System.out.println("inside static block");
		b=200;
		
    }
	void show()
	{
		//a=a+10;
		b=b+10;
		//System.out.println(" A="+a);
		System.out.println(" B="+b);
	}
	static void print()
	{
		
		//System.out.println(" A="+a);
		System.out.println(" B="+b);
	}
	
  
}
class StaticDemo 
{
	
	
	public static void main(String[] args) 
	{
		System.out.println(" Inside Main() ");
		//Test t=new Test();
		Test.print();
		//System.out.println(" B="+Test.b);
        
		/*Student s1=new Student(1255,"Amit",89.99);
		s1.show();
		Student s2=new Student(1233,"Ajay",99.99);
		s2.show();
		Student.modify("Science");
		s1.show();
		s2.show();
		*/
		
		
	
	}
}








