import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("A","B","c","D"));
		ArrayList<String> list2=new ArrayList<String>(Arrays.asList("A","B","c","D","E"));
		
		ArrayList<String> list3=new ArrayList<String>(Arrays.asList("A","B","c","D","F"));
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1.equals(list2));
		
		
		ArrayList<String> list4=new ArrayList<String>(Arrays.asList("A","B","c","D","F"));
		ArrayList<String> list5=new ArrayList<String>(Arrays.asList("A","B","c","D","E"));
		list4.removeAll(list5);
		System.out.println(list4);
		
		
		ArrayList<String> list6=new ArrayList<String>(Arrays.asList("A","B","c","D"));
		ArrayList<String> list7=new ArrayList<String>(Arrays.asList("A","B","c","D","E"));
		
		list6.retainAll(list7);
		System.out.println(list6);
		
		
		
	}

}
