package wee1.day1;

public class StringLength {

	public static void main(String[] args) {
		String str="Hello World";
		String str1=" fly me  to the moon";
        String[] split = str.split(" ");
        String[] split1 = str1.split(" ");
       // System.out.println(str);
       int length=split.length;
       int length1=split.length;
      // System.out.println(length);
        for(int i=split.length-1;i>=0;i--)
        {
        	//System.out.println(split[i]);
        	System.out.println("str last word length " + "= " + split[i].length());
        	break;
        }
        for(int i=split1.length-1;i>=0;i--)
        {
        	//System.out.println(split[i]);
        	System.out.println("str1 last word length " + "= " + split1[i].length());
        	break;
        }

        
	}

}
