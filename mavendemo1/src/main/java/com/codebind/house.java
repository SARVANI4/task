package com.codebind;
import java.util.Scanner;

	class Building{
		public static void displayoptions() {
			System.out.print("The option for buildings associated with building is:");
			System.out.print("1->1200 INR for using standard materials.");
			System.out.print("2->1500 INR for using above standard materials.");
			System.out.print("3->1800 INR for using high standard materials.");
			System.out.print("4->2500 INR for using high standard materials with full automation");
			System.out.print("Enter choice:(1/2/3/4)");	
		}
		public static void standard(float AreaofHouse){
			float price=1200*AreaofHouse;
			System.out.print(price);
		}
		public static void abovestandard(float AreaofHouse){
			float price=1200*AreaofHouse;
			System.out.print(price);
		}
		public static void highstandard(float AreaofHouse){
			float price=1200*AreaofHouse;
			System.out.print(price);
		}
		public static void automatedbuilding(float AreaofHouse){
			float price=1200*AreaofHouse;
			System.out.print(price);
		}
	}
	public class house {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter area of house:");
		float AreaofHouse = sc.nextFloat();
		Building k = new Building();
		k.displayoptions();
		int choice = sc.nextInt();
		if(choice==1) {
			k.standard(AreaofHouse);
		    }
		else if(choice==2){
			k.abovestandard(AreaofHouse);
		    }
		else if(choice==3){
			k.highstandard(AreaofHouse);
		    }
		else if(choice==4){
	        k.automatedbuilding(AreaofHouse);
	        }
		}
	}