package basicprogram;

public class PP {
	int g=90;
	X xx=new X();
	X m1() {
		X xx=new X();
		return xx;
	}
	public static void main(String[] args) {
		PP p=new PP();
		/*X xxxx=p.m1();
		System.out.println(xxxx);
		
		Y yy=xxxx.m2();
		System.out.println(yy);
		/*
		Z zzz=yy.m3();
		//call method of that return type
		
		String pqr=zzz.m4("Hello");
		System.out.println(pqr);
		*/
		
		String pqr=p.m1().m2().m3().m4("Hello");
		System.out.println(pqr);
	
		
	
	}
}

