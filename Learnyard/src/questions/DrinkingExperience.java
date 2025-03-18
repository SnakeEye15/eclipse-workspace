package questions;
//Question at: https://www.lintcode.com/problem/3332
interface Drinks{
	String getName();
	String drinkingFeeling();
}

class Milk implements Drinks{
	public String getName(){
		return "it's Milk";
	}
	public String drinkingFeeling() {
		return "Milk is hot";
	}
}

class Water implements Drinks{
	public String getName(){
		return "it's Water";
	}
	public String drinkingFeeling() {
		return "Water is cool.";
	}
}



public class DrinkingExperience {
	public static void main (String args[]) {
		Milk obj1=new Milk();
		Water obj2=new Water();
		
		System.out.println(obj1.getName());
		System.out.println(obj1.drinkingFeeling());
		System.out.println(obj2.getName());
		System.out.println(obj2.drinkingFeeling());
	}
}
