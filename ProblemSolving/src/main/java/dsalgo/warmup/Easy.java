package dsalgo.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Easy {

	public static void main(String[] args) {

	}

	static int solveMeFirst(int a, int b) {
		return a + b;

	}

	static int simpleArraySum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> output = new ArrayList<Integer>(Collections.nCopies(2, 0));
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				output.set(0, output.get(0) + 1);
			} else if (a.get(i) < b.get(i)) {
				output.set(1, output.get(1) + 1);
			}
		}

		return output;
	}

	static long aVeryBigSum(long[] ar) {
		long sum = 0;
		for (long num : ar) {
			sum += num;
		}
		return sum;
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int primDiagSum = 0;
		int secDiagSum = 0;
		int n = arr.size();
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size(); j++) {
				if (i == j) {
					primDiagSum += arr.get(i).get(j);
				}
				if (j == n - 1 - i) {
					secDiagSum += arr.get(i).get(j);
				}
			}
		}
		return Math.abs(primDiagSum - secDiagSum);
	}

	static void plusMinus(int[] arr) {
		int posCount = 0;
		int negCount = 0;
		int zeroCount = 0;
		double size = arr.length;

		for (int element : arr) {
			if (element == 0) {
				zeroCount++;
			} else if (element < 0) {
				negCount++;
			} else {
				posCount++;
			}
		}
		System.out.println(posCount / size);
		System.out.println(negCount / size);
		System.out.println(zeroCount / size);

	}

	static void staircase(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = n - i + 1; j <= n; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		int minSum = 0;
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				minSum += arr[i];
			} else if (i == arr.length - 1) {
				maxSum += arr[i];
			} else {
				minSum += arr[i];
				maxSum += arr[i];
			}
		}
		System.out.print(minSum + " ");
		System.out.print(maxSum);
	}
	
	static int birthdayCakeCandles(int[] ar) {
		int max = Integer.MIN_VALUE;
		int maxCount = 0;
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] > max) {
				max = ar[i];
				maxCount = 1;
			}
			else if( ar[i] == max) {
				maxCount ++;
			}
		}
		return maxCount;
    }
	
	static String timeConversion(String s) {
       StringTokenizer stTokens = new StringTokenizer(s, ":");
       String hh = stTokens.nextToken();
       String mm = stTokens.nextToken();
       String temp = stTokens.nextToken();
       String ss = temp.substring(0, 2);
       String mode = temp.substring(2);
       
       int hh24 = 0;
       String hh24Str;
       
       int hhNum = Integer.parseInt(hh);
       if(mode.equals("AM")) {
    	   if(hhNum == 12) {
    		   hh24Str = "00";
    	   }
    	   else {
    		   hh24Str = hh;
    	   }
       }
       else {
    	   if(hhNum == 12) {
    		   hh24Str = hh;
    	   }
    	   else {
    		   hh24 = hhNum + 12;
    		   hh24Str = Integer.toString(hh24);
    	   }
       }
       
       StringBuilder sb = new StringBuilder(hh24Str);
       sb.append(':');
       sb.append(mm);
       sb.append(':');
       sb.append(ss);
       return sb.toString();
    }

}
