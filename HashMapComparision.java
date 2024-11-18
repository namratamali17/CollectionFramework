import java.util.HashMap;

public class HashMapComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map1=new HashMap<>();
		map1.put(1,"a");
		map1.put(2,"b");
		map1.put(3,"c");
		
		HashMap<Integer,String> map2=new HashMap<>();
		map2.put(3,"c");
		map2.put(2,"a");
		map2.put(1,"b");
		
		HashMap<Integer,String>map3=new HashMap<>();
		map3.put(1,"a");
		map3.put(2,"b");
		map3.put(3,"c");
		map2.put(3,"d");
		System.out.println(map3);
		
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		  
		System.out.println(map1.keySet().equals(map2.keySet()));
		//Map<String,String>title=ImmutableMap.of("google","india","amazon","amzo");
		
		
		
		
		
		
	}

}
