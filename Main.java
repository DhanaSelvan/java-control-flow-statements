import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println("If...Else");
		if(num>=0) System.out.println("Positive Number");
		else System.out.println("Negative Number");
		
		System.out.println("For loop to print 1 to num");
		for (int itr=1; itr<=num; itr++) {
		    System.out.print(itr+" ");
		}
		
		System.out.println("\nSwitch Case to find the Day of the Week");
		switch (num) {
		    case 1:
		        System.out.println("Monday");
		        break;
		    case 2:
		        System.out.println("Tuesday");
		        break;
	        case 3:
		        System.out.println("Wednesday");
		        break;
		    case 4:
		        System.out.println("Thursday");
		        break;
		    case 5:
		        System.out.println("Friday");
		        break;
		    case 6:
		        System.out.println("Stuarday");
		        break;
		    case 7:
		        System.out.println("Sunday");
		        break;
		    default:
		        System.out.println("Day Not found for the Number");
		        break;
		}
		System.out.println("While loop");
		while (num!=0) {
		    System.out.print(num+" ");
		    num--;
		}
		System.out.println("\nDo while for print 1 to 3");
		int n = 1;
		do {
		    System.out.print(n+" ");
		    n++;
		} while (n<=3);
	}
}
