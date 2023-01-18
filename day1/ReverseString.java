package wee1.day1;

public class ReverseString {

	public static void main(String[] args) {
		String name="Testleaf";
		char[] reverse = name.toCharArray();
		int length = reverse.length;
		for(int i=length-1;i>=0;i--)
		{
			System.out.println(reverse[i]);
		}

	}

}
