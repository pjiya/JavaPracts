package practicals;
import java.util.*;

public class Exp16 {

	    
	    public static void main(String args[]) {

	        int a, b, s;

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers:");
	        a = sc.nextInt();
	        b = sc.nextInt();

	        Sum dd = new Sum();
	        s = dd.sum(a, b);

	        System.out.println("Sum is:" + s);
	    }
}

class Sum {
	
	int sum(int a, int b) {
	    return (a + b);
	}

}

