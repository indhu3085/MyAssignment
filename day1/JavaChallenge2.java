package wee1.day1;

public class JavaChallenge2 {

	public static void main(String[] args) {
		int num =8;
		int num1=4;
		double Val = Math.sqrt(num);
		double Val1 = Math.sqrt(num1);
		//System.out.println(Val);
        String ValasString =String.valueOf(Val); 
        //System.out.println(Val1);
        String ValasString1 =String.valueOf(Val1); 
       //System.out.println(ValasString);
        int indextodecimal = ValasString.indexOf(".");
        int indextodecimal1 = ValasString1.indexOf(".");
        //System.out.println(indextodecimal);
		System.out.println(ValasString.substring(0,indextodecimal));
		System.out.println(ValasString1.substring(0,indextodecimal1));
	}

}
