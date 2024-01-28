package project1;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(input.matches("^[a-z0-9A-Z\s]+[!.?]$")) {
			input=input.replaceAll("\s+", "\s");
			String []word=input.split("(\\s|\\.|\\?|!)");
			System.out.print("WORD TO BE INSERTED:");
			String value=sc.nextLine();
			System.out.print("WORD POSITION IN THE SENTENCE:");
			int position=sc.nextInt();
			if(position>word.length+1) {
				System.out.println("Invalid position!");
				System.exit(0);
			}
			String []mword=new String[word.length+1];
			for(int i=0,j=0;i<mword.length;i++) {
				if(i==position-1) {
					mword[i]=value;
				}
				else {
					mword[i]=word[j++];
				}
			}
			String result=String.join(" ", mword);
			result+=input.charAt(input.length()-1);
			System.out.println(result);
		}
		else {
			System.out.println("Invalid Input!");
		}
		sc.close();
	}

}
