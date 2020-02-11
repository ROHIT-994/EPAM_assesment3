import java.util.*;
public class Main {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();int a = sc.nextInt(); int b = sc.nextInt();
	        switch (x){
	            case 1:
	                Add add = new Add();
	                add.addition(a,b);
	            case 2:
	                Subract sub = new Subract();
	                sub.subtraction(a,b);
	            case 3:
	                Multiply mul = new Multiply();
	                mul.multi(a,b);
	            case 4:
	                Divide div = new Divide();
	                div.division(a,b);
	        }
	    }


}
