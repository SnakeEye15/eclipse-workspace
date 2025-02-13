package questions;

import java.util.Scanner;

//Program to print the basic methods for vehicle question is at: https://www.lintcode.com/problem/3300/
public class TransportatoinMethod {
	public static void main(String args[]) {
		try {
			Scanner scan=new Scanner(System.in);
			Vehicle v1=takeInput(scan);
			v1.setSpeed(30);
			v1.speedUp();
			v1.speedDown();
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
		
	}
	
	public static Vehicle takeInput(Scanner scan) {
		System.out.println("Enter  the Speed: ");
		int speed=scan.nextInt();
		
		System.out.println("Enter  the Accelaration: ");
		int accelaration=scan.nextInt();
		
		System.out.println("Enter  the Time: ");
		int time=scan.nextInt();
		
		System.out.println("Enter  the Volume: ");
		int volume=scan.nextInt();
		
		
		return new Vehicle(speed,accelaration,time,volume);
	}
}

class Vehicle{
	private int speed;
	private int accelaration;
	private int time;
	private int volume;
	
	Vehicle(int speed,int accelaration, int time, int volume){
		this.speed=speed;
		this.accelaration=accelaration;
		this.time=time;
		this.volume=volume;
	}
	
	
	public void move() {
		System.out.println("Speed: "+speed);
		System.out.println("Accelaration: "+accelaration);
		System.out.println("Time: "+time);
		System.out.println("Volume: "+volume);
	}
	
	public void setSpeed(int s) {
		speed=s;
		
	}
	public void speedUp() {
		speed+=accelaration*time;
		move();
	}
	
	public void speedDown() {
		speed-=accelaration*time;
		move();
	}
	
}
