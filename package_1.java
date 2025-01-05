/*a java program which contains three classes A, B, Main. The class A is in package ‘packageone’ and contains a method ‘methodclassone’ that prints a message stating that it is printed from class A. Similarly class B is in ‘packagetwo’ and contains a method ‘methodclasstwo’ that prints a message stating that it is printed from class B. The Main class imports these classes, creates their instances and invokes their corresponding methods.*/

package packageone;
public class A
{
	public void methodClassOne()
	{
		System.out.println("Message from class A in packageone");
	}
}

package packagetwo;
public class B
{
	public void methodClassTwo()
	{
		System.out.println("Message from class B in packagetwo");
	}
}

public class Main
{
	public static void main(String[] args)
	{
		packageone.A instanceA = new packageone.A();
		packagetwo.B instanceB = new packagetwo.B();
		instanceA.methodClassOne();
		instanceB.methodClassTwo();
	}
}