package Abstraction_Packages_ExceptionHandling;
interface Test{
	int myfunction(int a,int b,int c);
}
public class Question_7 {
	public static void main(String[] args) {
		Test t1=(a,b,c)->a+b+c;
		Test t2=(a,b,c)->a*b*c;
		int sum=t1.myfunction(3, 5, 6);
		int mul=t2.myfunction(3, 5, 6);
		System.out.println("Sum is: "+sum);
		System.out.println("Product is: "+mul);
	}
}
