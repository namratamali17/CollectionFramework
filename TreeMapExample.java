import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeMap<Integer, String> m=new TreeMap<>();
     m.put(1011,"namu");
     m.put(12033,"revati");
     m.put(1455,"rrerta");
     m.put(7444,"tina");
     m.put(988,"gitaaa");
     System.out.println(m);
     m.forEach((k,v)-> System.out.println(" k  "  +k +" v  "  +v));
     System.out.println(m.lastEntry());
     System.out.println(m.firstEntry());
     Set<Integer> keylessthan=m.headMap(2000).keySet();
     System.out.println(keylessthan);
     Set<Integer> keylss=m.tailMap(2000).keySet();
	 System.out.println(keylss);	
		
	 //Another Tree map created...
	 TreeMap<String , Integer> u =new TreeMap<>();
	 u.put("rina",1000);
	 u.put("sita",5000);
	 u.put("ajau",6544);
	 u.put("dina",8000);
	 System.out.println(u);
	 u.forEach((k,v)-> System.out.println(" k  "  +k +" v  "  +v));
	 
	 
	 
	 
	 
	 
		
		
	}

}
