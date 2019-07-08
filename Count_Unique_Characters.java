import java.util.*;
public class Count_Unique_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=str.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			set.add(ch);
		}
		System.out.println(set.size());

	}

}
