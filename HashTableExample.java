import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,Integer> m=new Hashtable<>();
		m.put("Ajau",100);
		m.put("jivani",60);
		m.put("sita",500);
	    m.put("tivari",800);
	   // m.put("nita",null);   null key and null value is not allowed..in hash table

	    
	    System.out.println(m); 
		
		

	}

}
