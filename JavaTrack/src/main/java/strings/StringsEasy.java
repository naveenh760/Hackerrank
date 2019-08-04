package strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class StringsEasy {
    
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String a = "He is a very very good boy, isn't he?";
		getStringTokens(a);
		

	}

	public static void introStrings() {
		String A = scanner.next();
		String B = scanner.next();
		int sum = A.length() + B.length();
		System.out.println(sum);
		
		int diff = A.compareTo(B);
		if (diff > 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		System.out.print(A.substring(0, 1).toUpperCase() + A.substring(1));
		System.out.print(" " + B.substring(0, 1).toUpperCase() + B.substring(1));
	}
	
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        SortedSet<String> substrings = new TreeSet<String>();
	        for(int i= 0; i < s.length() - k + 1; i++) {
	        	substrings.add(s.substring(i, i + k));
	        }
	       
	        smallest = substrings.first();
	        largest = substrings.last();
	        
	        return smallest + "\n" + largest;
	    }
	 
	 public static boolean isPalindrome(String input) {
		 StringBuilder input1 = new StringBuilder(input);
		 String reversed = input1.reverse().toString();
		 return input.equals(reversed);
		 
	 }
	 
	 static boolean isAnagram(String a, String b) {
	        char[] charArrayA = a.toLowerCase().toCharArray();
	        char[] charArrayB = b.toLowerCase().toCharArray();
	        
	        Arrays.sort(charArrayA);
	        Arrays.sort(charArrayB);
	        
	        String sortedA = new String(charArrayA);
	        String sortedB = new String(charArrayB);
	        
	        return sortedA.equalsIgnoreCase(sortedB);
	    }
	 
	 static String[] getStringTokens(String a) {
		  String[] tokens = a.split("[!,?._'@ ]+");
	      return tokens;
	 }
	 
	 public static void patternSyntaxCheck() {
		 Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	           try{
	               String pattern = in.nextLine();
	               Pattern.compile(pattern);
	               System.out.println("Valid");
	           }
	          catch(Exception e) {
	              System.out.println("Invalid");
	          }
	         testCases--; 
	      }
	      in.close();
	 }
	 
	 public static boolean isValidUserName(String input) {
		 String regExp = "^[A-Za-z]([A-Za-z0-9_]){7,29}$";
		 return input.matches(regExp);
	 }

}
