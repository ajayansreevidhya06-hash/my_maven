package accessmodifiers;

public class AccessSample1 {

	
	
	public int a =10;
	private String b ="sree";
	protected char c='d';
	float f=4.5f;
	
	public void display() {
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AccessSample1 ob =new AccessSample1();
		ob.display();
	}

}
