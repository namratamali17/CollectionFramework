import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer>comp=new HashMap<>();
		comp.put("google",100000);
		comp.put("amazo",200000);
		comp.put("safari",300000);
		comp.put("exploer",40000);
		System.out.println(comp.size());
		
		
		
		
		List<String> complist=new ArrayList<>(comp.keySet());
		System.out.println(complist);
		for(String t:complist) {
			System.out.println(t);
		} 
		List<Integer> emplist=new ArrayList<>(comp.values());
		System.out.println(emplist);
		for(int a:emplist)
		{
			System.out.println(a);
		}
		
		
		
		
	}

}
