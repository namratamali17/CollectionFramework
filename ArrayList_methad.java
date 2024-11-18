import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_methad {

	private static final int ArrayList = 0;
	private static final int Integer = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList<>();
		a.add("java");
		a.add("python");
		a.add("c++");
		a.add("c");
		a.add("rubye");
		System.out.println(a);
		ArrayList<Object> b=new ArrayList<>();
		b.add("devops");
		b.add("shell");
		System.out.println(b);
		//a.addAll(b);
		System.out.println(a);
		//a.addAll(2,b);
		//a.clear();
		//System.out.println(a);
		ArrayList <String> clonelist=(ArrayList <String>) a.clone();
		System.out.println(clonelist);
		System.out.println(a.contains("java"));
		System.out.println(b.contains("c"));
		System.out.println(a.indexOf("c++"));
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("namu","aju","namu","rani","sonu","prachi","shiva"));
		System.out.println(list1);
		int i=list1.lastIndexOf("shiva");
		System.out.println(i);
		list1.remove(2);
		System.out.println(list1);
		
		ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,14,15));
		num.removeIf( num1->num1%2==0);
		System.out.println(num);
	
		ArrayList<String> list2=new ArrayList<String>(Arrays.asList("namu","aju","namu","rani","sonu","prachi","shiva","jina","tina","namu"));
		list2.retainAll(Collections.singleton("namu"));
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
	}

}
