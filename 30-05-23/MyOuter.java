package pack;
class MyOuter
{
	int x =7;
	 abstract class AbstractInnerTest 
     { 
     int y=9;
         abstract void getRemainder();

     } 

	class MyInner extends AbstractInnerTest
	{
		public void InnerMethod()
		{
			System.out.println("x == " + x);
		}
		public void getRemainder()
        { 
			System.out.println("Y == " + y);
            System.out.println("Remainder : Abstract class"); 
        } 
	}
	class MyNextInner extends MyInner
	{
		int x=10;
		public void NextInnerMethod()
		{
			System.out.println("X == " + x);
			System.out.println("NextInner");
		}
	}
	public void OuterMethod()
	{
		System.out.println("From outer method = " + x);
		//MyInner inn = new MyInner();
		MyNextInner inn=new MyNextInner();
		inn.InnerMethod();
		inn.getRemainder();
		inn.NextInnerMethod();
	}
	public static void main(String[] a)
	{
	MyOuter mo = new MyOuter();
	//MyInner inn = new MyInner(); //invalid
	//inn.InnerMethod();
	//<outerclassname>.<innerclassname> objname = <outerclass instancename>.new <innerclassname>();
	MyOuter.MyInner mi = mo.new MyInner(); //instantiate inner class
	mi.InnerMethod();
	mo.OuterMethod();
	//mi.OuterMethod();  illegal
	//mo.InnerMethod();   illegal 
		
	}

}

// Check whether the inner class can be abstract
// can it be inherited?
// scope of instance variable within the inner class 
// scope of local variable within the inner class






