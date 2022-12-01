import java.util.*;
public class Q01 {

	public static void main(String[] args) {
		  System.out.println("Enter the value of x and y");  
	        Scanner sc = new Scanner(System.in); 
	        int x = sc.nextInt();  
	        int y = sc.nextInt();  
	        System.out.println("X and Y before swapping "+x +"  "+ y);  
	        x = x + y;   
	        y = x - y;   
	        x = x - y;   
	        System.out.println("X and Y after swapping: "+x +"  " + y);   
	}

}
