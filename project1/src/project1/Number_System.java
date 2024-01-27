package project1;

public class Number_System {
	public void binary(int dec) {
		int rem=0;
		String bin="";
		while(true) {
			//calculating the remainder
			rem=dec%2;
			//calculating the quotient and taking it for next iteration
			dec=dec/2;
			bin=bin+Integer.toString(rem);
			//iteration ends if the number is broken down into 0
			if(dec==0) {
				break;
			}
		}
		//printing the result in reverse order
		for(int i=bin.length()-1;i>=0;i--) {
			System.out.print(bin.charAt(i));
		}
	}
	public void octal(int dec) {
		int rem=0;
		String oct="";
		while(true) {
			rem=dec%8;
			dec=dec/8;
			oct=oct+Integer.toString(rem);
			if(dec==0) {
				break;
			}
		}
		for(int i=oct.length()-1;i>=0;i--) {
			System.out.print(oct.charAt(i));
		}
	}
	public void hexadecimal(int dec) {
		int rem=0;
		String hex="";
		while(true) {
			rem=dec%16;
			dec=dec/16;
			if(rem<10) {
				hex=hex+Integer.toString(rem);
			}
			else if(rem>=10) {
				hex=hex+Character.toString((char)(65+(rem-10)));
			}
			if(dec==0) {
				break;
			}
		}
		for(int i=hex.length()-1;i>=0;i--) {
			System.out.print(hex.charAt(i));
		}
	}

	public static void main(String[] args) {
		Number_System ns=new Number_System();
		ns.binary(10);
		System.out.println();
		ns.octal(8);
		System.out.println();
		ns.hexadecimal(1234);
	}

}
