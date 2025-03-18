package questions;
import java.util.*;


//Question at : https://www.lintcode.com/problem/3437

class Instruments{
	public void makeSound() {
		System.out.println("The instrument makes a beautiful sound!");
	}
}

class Erhu extends Instruments{
	public void makeSound() {
		System.out.println("Erhu is Good to hear");
	}
}
class Piano extends Instruments{
	public void makeSound() {
		System.out.println("Piano is pleasing to the ear");
	}
}

class Violin extends Instruments{
	public void makeSound() {
		System.out.println("Violin is Shocking");
	}
}


public class PlaySoundOfInstruments {
	public static void main(String args[]) {
		Erhu obj1=new Erhu();
		Piano obj2=new Piano();
		Violin obj3=new Violin();
		
		obj1.makeSound();
		obj2.makeSound();
		obj3.makeSound();
		Instruments obj=new Instruments();
		obj.makeSound();
		
	}
}
