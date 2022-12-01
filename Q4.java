import java.util.*;
public class Q04 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		   System.out.println("Enter String");
		   String str = sc.nextLine();
		   String replaced="";
		   for (int i = 0; i < str.length(); i++) {
			   if (str.charAt(i) != ' ') {
				   replaced = replaced + str.charAt(i);
			   }
		   }
		   System.out.println("New String : " + replaced);
	}

}
