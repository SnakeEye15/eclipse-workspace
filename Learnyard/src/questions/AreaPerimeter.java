package questions;
import java.util.*;
//Question at: https://www.lintcode.com/problem/3400
public class AreaPerimeter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        try{
        	System.out.println("Please enter the side of square:");
        } catch (InputMismatchException e) {
            System.err.print(e.getMessage());;
        }
        finally {
        	scan.close();
        }
        Square square = new Square(scan.nextInt());
        System.out.println("Perimeter of Square with give side is: "+ square.perimeter());
        System.out.print("Area of Square with given side is: "+square.area());
}}

class Rectangle{
	protected int length;
	protected int height;
	
	public Rectangle() {};
	
	public Rectangle(int length, int height) {
		this.length=length;
		this.height=height;
	}
	public int perimeter() {
		return length*2 + height*2 ;
	}
	
	public int area() {
		return length * height;
	}
}


class Square extends Rectangle{
	public Square(int n) {
		super(n,n);
	}
}