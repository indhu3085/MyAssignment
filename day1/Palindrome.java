package wee1.day1;

public class Palindrome {

	public static void main(String[] args) {
		String str1="A man,a plan,a canal:Panama";
		str1=str1.replaceAll("[,: ]","");
		str1=str1.toLowerCase();
		//System.out.println(str1);
		String rev="";
		boolean check=false;
		char[] charArray=str1.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			rev = rev+charArray[i];
			//System.out.println(rev);
			
		}
		if(str1.equals(rev))
		{
			check=true;
		}
		System.out.println("A man,a plan,a canal:Panama" +" Palindrome is "+ check);
		String str2 = "race a car";
		str2=str2.replaceAll("[ ]","");
		String rev2="";
		boolean check2=false;
		char[] charArray2=str2.toCharArray();
		for(int i=charArray2.length-1;i>=0;i--)
		{
			rev2 = rev2+charArray2[i];
			//System.out.println(rev);
			
		}
		if(str2.equals(rev2))
		{
			check2=true;
		}
		System.out.println("race a car" +" Palindrome is "+ check2);
		//System.out.println(sample);
		String str3=" ";
		String rev3=" ";
		boolean check3=false;
		if(str3.equals(rev3))
		{
			check3=true;
		}
		System.out.println("Empty space  " +" Palindrome is "+ check3);
	}

}
