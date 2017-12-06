package test;



class APoint {
	private int x;
	private int y;
	// a constructor!
	public APoint(int x, int y) {
		this.setX(x);
		this.setY(y);


	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//	return super.toString();
		
		return ("for this string: x-ordianet: " + this.x + ", and y-ordinate: " + this.y);
		
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
}

public class Test_toString {


	public static void main(String[] args) {

		APoint point1 = new  APoint(1, 3);
		APoint point3 = point1;

		APoint point2 = new APoint (1, 3);
		APoint point4 = point2;
		
		System.out.println("point1.toString() = " + point1.toString());
		System.out.println("point3.toString() = " + point3.toString());
		System.out.println("Is point1 == point3 ?" + (point1==point3));
		System.out.println("Is point1 eauals point3 ?" + (point1.equals(point3)));
		
		

		System.out.println("point2.toString() = " + point2.toString());
		System.out.println("point4.toString() = " + point4.toString());
		System.out.println("Is point2 == point4 ?" + (point2==point4));
		System.out.println("Is point2 eauals point4 ?" + (point2.equals(point4)));
		
		System.out.println("Is point1 == point2 ?" + (point1==point2));
		System.out.println("Is point2 == point3 ?" + (point2==point3));
		System.out.println("Is point3 == point4 ?" + (point3==point4));
		System.out.println("Is point1 == point4 ?" + (point1==point4));
		
		System.out.println("Is point1 eauals point2 ?" + (point1.equals(point2)));
		System.out.println("Is point2 eauals point3 ?" + (point2.equals(point3)));
		System.out.println("Is point3 eauals point4 ?" + (point3.equals(point4)));
		System.out.println("Is point1 eauals point4 ?" + (point1.equals(point4)));
		
	}


}