package project1;

import java.util.Scanner;

public class Question9VampireNumberInRange {
	public int[] popArray(int []array,int loc) {
		int []nArray=new int [array.length-1];
		int j=0;
		for(int i=0;i<array.length;i++) {
			if(i!=loc) {
				nArray[j++]=array[i];
			}
		}
		return nArray;
	}
	public int noOfDigits(int n) {
		int digit=0;
		while(n>0) {
			n=n/10;
			digit++;
		}
		return digit;
	}
	public int[] digitsOfNumber(int n) {
		int []digits=new int[noOfDigits(n)];
		int i=0;
		while(n>0) {
			digits[i++]=n%10;
			n=n/10;
		}
		return digits;
	}
	public int doesExist(int []array,int key) {
		int position=-1;
		for(int i=0;i<array.length;i++) {
			if(array[i]==key) {
				position=i;
				return position;
			}
		}
		return position;
		
	}
	
	public boolean isVampire(int n) {
		int factor1,factor2;
		boolean isVampireNumber=false;
		int digitOfNumber[],digitOfFactor1[],digitOfFactor2[];
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				factor1=i;
				factor2=n/i;
				if(noOfDigits(n)==2*noOfDigits(factor1) && noOfDigits(n)==2*noOfDigits(factor2)) {
					digitOfNumber=digitsOfNumber(n);
					digitOfFactor1=digitsOfNumber(factor1);
					digitOfFactor2=digitsOfNumber(factor2);
					for(int j=0;j<digitOfFactor1.length;j++) {
						if(doesExist(digitOfNumber,digitOfFactor1[j])!=-1) {
							digitOfNumber=popArray(digitOfNumber, doesExist(digitOfNumber,digitOfFactor1[j]));
						}
					}
					for(int j=0;j<digitOfFactor2.length;j++) {
						if(doesExist(digitOfNumber,digitOfFactor2[j])!=-1) {
							digitOfNumber=popArray(digitOfNumber, doesExist(digitOfNumber,digitOfFactor2[j]));
						}
					}
					if(digitOfNumber.length==0) {
						isVampireNumber=true;
						return isVampireNumber;
					}
				}
			}
		}
		return isVampireNumber;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Question9VampireNumberInRange qs=new Question9VampireNumberInRange();
		System.out.println("Enter the lower limit:");
		int ll=sc.nextInt();
		System.out.println("Enter upper limit:");
		int ul=sc.nextInt();
		int count=0;
		if(ll>=1000 && ul<=9999) {
			for(int i=ll;i<=ul;i++) {
				if(qs.isVampire(i)) {
					System.out.println(i+" is a vampire number.");
					count++;
				}
			}
			System.out.println("Frequency of vampire number:"+count);
		}
		else {
			System.out.println("Invalid output.");
		}
	}

}
