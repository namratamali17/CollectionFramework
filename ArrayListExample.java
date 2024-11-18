import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> ar=new ArrayList<>();
		ar.add(100);
		ar.add("nama");
		ar.add('t');
		ar.add(200);
		ar.add(555);
		System.out.println(ar);
		System.out.println(ar.size());
		ar.add(44);
		ar.add(55566);
		System.out.println(ar);
		System.out.println(ar.size());
	}

}
