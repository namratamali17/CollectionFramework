import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<Integer> a=new Vector<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
	    a.remove(2);
	    System.out.println(a);
	  
	    
		System.out.println( a.get(2));
		

	}

}
