package Week2.Day1;

public class Palindrome {

	public static int length;
	public static String reverse1="";
	//private static String reverse;
	public String checkPalindrome(String text) {
		length = text.length();
		for(int i=length-1;i>=0;i--) {
			//char text2=
			reverse1=text.charAt(i)+reverse1;
		}
		if(reverse1.equals(text)) {
			System.out.println("The word is a Palindrome");
		}
		/*else {
			String reverse1= ("The word is not a Palindrome");
			//return reverse1;
		}*/
		return reverse1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text = "check";
Palindrome o1=new Palindrome();
o1.checkPalindrome(text);
//System.out.println("The reverse word is:"+reverse1);
	}

}
