import java.util.*;
public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Enter letter to find");
		char key = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i<str.length();i++) {
			if(str.charAt(i)>=key) {
				count++;
			}
		}
		System.out.println("Total times " + key + " occur : " + count);
	}

}
