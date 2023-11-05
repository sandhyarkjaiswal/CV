package task;
import java.util.*;


public class roman_t2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String roman = sc.nextLine().toUpperCase();
	        int result = romanToInteger(roman);
	        System.out.println("Integer equivalent: " + result);
	        sc.close();
	    }

	    public static int romanToInteger(String s) {
	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            char c = s.charAt(i);
	            int value;

	            switch (c) {
	                case 'I':
	                    value = 1;
	                    break;
	                case 'V':
	                    value = 5;
	                    break;
	                case 'X':
	                    value = 10;
	                    break;
	                case 'L':
	                    value = 50;
	                    break;
	                case 'C':
	                    value = 100;
	                    break;
	                case 'D':
	                    value = 500;
	                    break;
	                case 'M':
	                    value = 1000;
	                    break;
	                default: return 0;
	            }
	            System.out.println(value);
	           
	   

	            if (value < prevValue) {
	                result -= value;
//	                System.out.println(result);
	            } else {
	                result += value;
//	                System.out.println(result);
	            }

	            prevValue = value;
	        }

	        return result;
	    }


}
