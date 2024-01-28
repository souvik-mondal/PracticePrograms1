package project1;

import java.util.Scanner;

public class Question13CodedMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String msg1=sc.nextLine();
		if(msg1.matches("[0-9]*")) {
			char []msg2=msg1.toCharArray();
			String dmsg="";
			char prev='a';
			for(int i=0;i<msg2.length;) {
				String code="";
				while(true) {
					code=code+Character.toString(msg2[i]);
					if((Integer.parseInt(code)>=65 && Integer.parseInt(code)<=90)|| Integer.parseInt(code)>=97 && Integer.parseInt(code)<=122 || Integer.parseInt(code)==32) {
						if(prev!=' ' ||  ((char)Integer.parseInt(code))!=' ') {
							if(prev==' ' || dmsg=="") {
								dmsg=dmsg+Character.toString((char)Integer.parseInt(code)).toUpperCase();
							}
							else {
								dmsg=dmsg+Character.toString((char)Integer.parseInt(code)).toLowerCase();
							}
							prev=(char)Integer.parseInt(code);
						}
//						System.out.println(dmsg);
						code="";
						i++;
						break;
					}
					else if(Integer.parseInt(code)>122) {
						code="";
					}
					i++;
				}
			}
			System.out.println(dmsg);
		}
		else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
