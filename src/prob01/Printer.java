package prob01;

public class Printer{

	int a;
	boolean b;
	double c;
	String d;
	
	public void println(int i) {
		// TODO Auto-generated method stub
		this.a = i;
		System.out.println(this.a);
		
	}

	public void println(boolean b) {
		this.b = b;
		System.out.println(this.b);
	}


	public void println(double d) {
		this.c = d;
		System.out.println(this.c);
		
	}

	public void println(String string) {
		this.d = string;
		System.out.println(this.d);
		
	}

	

	
}
