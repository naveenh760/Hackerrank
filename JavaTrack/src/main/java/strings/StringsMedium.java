package strings;

import java.util.Scanner;
import java.util.function.BooleanSupplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsMedium {

	public static void main(String[] args) {
		String input = "Goodbye bye bye world world world";
		String output = removeDuplicateWords(input);
		System.out.println(output);
	}
	
	public static String removeDuplicateWords(String input) {
		String pattern = "\\b(\\w+)(\\b\\s+\\b\\1\\b)*";
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher m = r.matcher(input);
		while (m.find()) {
			input = input.replaceAll(m.group(), m.group(1));
		}
        return input;
	}

	public static boolean isIPAddress(String input) {
		String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	//	String zeroTo255 = "[000-255]";
		String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 
				+"\\." + zeroTo255;
		return input.matches(regex);
	}

}
