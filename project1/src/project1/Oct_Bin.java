package project1;

public class Oct_Bin {
	public void binary(int oct) {
		System.out.println(Integer.toBinaryString(oct));
	}
	public void octal(int bin) {
		System.out.println(Integer.toOctalString(bin));
	}

	public static void main(String[] args) {
		Oct_Bin ob=new Oct_Bin();
		ob.binary(Integer.parseInt("10",8));
		ob.octal(Integer.parseInt("1000",2));
	}

}
