import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//synchronized arraylist
		List<String> namelist=Collections.synchronizedList(new ArrayList<String>());
		namelist.add("namu");
		namelist.add("reena");
		namelist.add("reta");
		namelist.add("gita");
		namelist.add("shilaa");
		synchronized (namelist) {
			Iterator<String> it=namelist.iterator();
			while (it.hasNext()) {
			 System.out.println(it.next());
				
			}
			
		}
		
	//	copyonwrite arraylist
		CopyOnWriteArrayList<String>emp=new CopyOnWriteArrayList<String>();
		emp.add("rtti");
		emp.add("kirita");
		emp.add("ganu");
		
		synchronized (emp) {
			Iterator<String> itt=namelist.iterator();
			while (itt.hasNext()) {
			 System.out.println(itt.next());
				
			}
			
		}
		
		
		
		
		
		
		

	}

}
