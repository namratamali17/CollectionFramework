import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,6,7,4,6,8,4,6,70,42,12,12));
		HashSet<Integer>list =new HashSet<Integer>(number);
		System.out.println(list);
		
		
	}

}

