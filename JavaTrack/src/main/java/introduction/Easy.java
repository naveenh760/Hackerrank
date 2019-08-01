package introduction;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Easy {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Welcome();
		//loops();
		System.out.println(findDay(07, 31, 2019));

	}

	public static void Welcome() {
		System.out.println("Hello");
	}

	public static void inputOutput() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

	public static void inputOutput2() {
		int x = scanner.nextInt();
		double y = scanner.nextDouble();
		scanner.nextLine();
		String s = scanner.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + y);
		System.out.println("Int: " + x);

	}

	public static void ifElse() {
		int n = scanner.nextInt();
		String ans = "";
		if (n % 2 == 1)
			ans = "Weird";
		else {
			if (n >= 2 && n <= 5)
				ans = "Not Weird";
			else if (n >= 6 && n <= 20)
				ans = "Weird";
			else
				ans = "Not Weird";
		}

		System.out.println(ans);
	}

	public static void outputFormat() {
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = scanner.next();
			int x = scanner.nextInt();
			// System.out.printf("%15s%3d",s1,x);

			System.out.printf("%-15s%03d%n", s1, x);
		}

		System.out.println("================================");
	}

	public static void loops() {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
		}

	}

	public static void loops2() {
		int psum;
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int N = sc.nextInt();

			psum = a;
			for (int j = 0; j <= N - 1; j++) {
				psum += Math.pow(2, j) * b;
				System.out.print(psum + " ");
			}
			System.out.print("\n");
		}
		sc.close();

	}

	public static void dataType() {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-Math.pow(2, 15) && x<=Math.pow(2, 15)-1)System.out.println("* short");
                if(x>=-Math.pow(2,31) && x<=Math.pow(2, 31)-1)System.out.println("* int");
                if(x>=-Math.pow(2, 63)&& x<=(Math.pow(2, 63)-1))System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
            
        }
            
	}
	
	public static void endOfFile() {
		int n = 0;
		
		while(scanner.hasNext()) {
			n++;
			System.out.println(n + " "+ scanner.nextLine());
		}
	}
	
	public static String convertToString(int n) {
		return Integer.toString(n);
	}
	
	public static String findDay(int month, int day, int year) {
		LocalDate date = LocalDate.of(year, month, day);
		return date.getDayOfWeek().toString();
	}
	
	public static void currency() {
        double payment = scanner.nextDouble();
        scanner.close();
         
        Locale inlocale=new Locale("en","IN");
        String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india=NumberFormat.getCurrencyInstance(inlocale).format(payment);
        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
	}

}
