package exceptions;

import java.util.*;

public class TryCatch {

	public static void main(String[] args) {
		int x, y;
		try {
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			y = sc.nextInt();

			int ans = x / y;
			System.out.println(ans);
			sc.close();
		} catch (Exception e) {
			String message = e.getClass().getName();
			String add = " ";
			if (message.equals("java.lang.ArithmeticException"))
				add = ": / by zero";
			System.out.println(message + add);
		}
	}
}
