import java.util.*;
public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int count = 0;
		for (int i = 1; i<str.length(); i++) {
			if (str.charAt(i-1) != ' ') {
				if(str.charAt(i) == 'A' && str.charAt(i) <='z') {
					count ++;
				}
				if(str.charAt(i)>='a' && str.charAt(i)<='z') {
					count++;
				}
			}
		}
		System.out.println("Total Words " + count);
	}

}
