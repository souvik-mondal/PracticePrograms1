package project1;

import java.util.Scanner;

public class Question5StringOp {
	String s;
	public void readString ( ) { 
		// to accept the sentence
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		sc.close();
	}
	public char caseConvert (char ch) {
	//to convert upper case character to Lowercase & vice versa without using any String function.
		if((int)ch<=90 && (int)ch>=65) {
			return (char)((int)ch+32);
		}
		else if((int)ch<=122 && (int)ch>=97){
			return (char)((int)ch-32);
		}
		else {
			return ch;
		}
	}
	public String sort (String txt) {
		//to sort the words of the sentence alphabetically using Bubble Sort technique.
		String []words=txt.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words.length-i-1;j++) {
				if(words[j].compareTo(words[j+1])>0) {
					String temp=words[j];
					words[j]=words[j+1];
					words[j+1]=temp;
				}
			}
		}
		return String.join(" ",words);
	}
	void display (String st) {
		//to display the sorted string & new String after case conversion
		System.out.println(sort(st));
		String nString="";
		char []ch=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			nString+=Character.toString(caseConvert(ch[i]));
		}
		System.out.println(nString);
	}

	public static void main(String[] args) {
		Question5StringOp qs= new Question5StringOp();
		qs.readString();
		qs.display(qs.s);
	}

}
