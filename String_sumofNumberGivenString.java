package stringex;

public class String_sumofNumberGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="02455ataughsjh";
		char ch ;
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			ch=s.charAt(i);
			if (ch>='0'&&ch<='9') {
				sum=sum+(ch-48);
				
			}
			
		}
		System.out.println(sum);
		

	}

}
