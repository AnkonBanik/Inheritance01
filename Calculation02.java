package inheritance_practice01;
import java.util.Scanner;

public class Calculation02 extends Calculation{
	public void multiplication (int x, int y){
		
		z=x*y;
		System.out.println("The Product of Given Number:"+z);
	}
	
	public static void main(String args[]){
		int a,  b;
		Calculation02 ankon =new Calculation02();
		System.out.println("Enter first Number:");
		a=ankon.nextint();
		System.out.println("Enter second Number:");
		b=ankon.nextint();
		
		ankon.multiplication(a, b);
		ankon.addition(a, b);
		ankon.substraction(a, b);
	}

	public int nextint() {
		
		// TODO Auto-generated method stub
		return 0;
	}
}