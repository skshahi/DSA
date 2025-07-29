package codedecode.java8;

public class DiamondClassSol implements DiamondInterf1, DiamondInterf2 {

	public static void main(String[] args) {
		DiamondClassSol d=new DiamondClassSol();
		d.m1();
		DiamondInterf1.m2();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		DiamondInterf2.super.m1();
	}

}
