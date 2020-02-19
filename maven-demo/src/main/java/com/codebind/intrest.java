package com.codebind;

import java.util.Scanner;


public class intrest {
     public static void main(String args[]){
    	    System.out.print("Enter Simple intrest(1) or Coumpound intrest(2):");
    	   	 Scanner sc = new Scanner(System.in);
    	   	 int choice = sc.nextInt();
    	   	 int principal, rate, time;
    	   	 System.out.print("Enter principal, time and rate:");
    	   	 principal=sc.nextInt();
    	   	 time=sc.nextInt();
    	   	 rate=sc.nextInt();
    	   	IntrestCalculation k= new IntrestCalculation();
    		k.cho(choice, principal, rate, time);
    	}
}

class IntrestCalculation {
     double si(int principal, int time, int rate){
	   	 double intrest;
	   	 intrest = principal * time * rate;
	   	 intrest = intrest / 100;
	   	 return intrest;
	    }
	    double ci(int principal,int time,int rate){ 
	   	 double intrest;
	   	 double k;
	   	 k = rate / 100 ;
	   	 k = k + 1;
	   	 k = Math.pow(k, time);
	   	 intrest = principal * k;
	   	 intrest = intrest - principal;
	   	 return intrest;
	    }
	    void cho(int choice, int principal,int rate, int time){
	    //int principal, rate, time;
	   	 if(choice==1){
	   		 System.out.print("hello");
	   		 double k = si(principal,time,rate);
	   		 System.out.print("Amount="+(k+principal));
	   		 System.out.print("Intrest="+k);
	   	 }
	   	 else {
	   		 double k = ci(principal,time,rate);
	   		 System.out.print("Intrest="+(k-principal));
	   		 System.out.print("Amount="+k);
	   	 
	   	 }
	    }
	}