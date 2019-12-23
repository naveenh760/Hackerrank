package advanced.medium;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5 {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String input = sc.next();
    	
    	try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(input.getBytes());
			byte[] digest = md.digest();
			for (byte b : digest) {
				System.out.printf("%02x", b);
			}
			sc.close();
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
    }
	
}
