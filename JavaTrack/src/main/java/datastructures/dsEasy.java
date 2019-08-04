package datastructures;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class dsEasy {

	private static Scanner sc = new Scanner(System.in);

	public static void OneDArray() {
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			a[i] = val;
		}
		// Prints each sequential element in array a
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int hourGlass(int[][] matrix) {
		int maxSum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i > 1 && j > 1) {
					int sum = matrix[i - 2][j - 2] + matrix[i - 2][j - 1] + matrix[i - 2][j] + matrix[i - 1][j - 1]
							+ matrix[i][j - 2] + matrix[i][j - 1] + matrix[i][j];

					if (sum > maxSum) {
						maxSum = sum;
					}
				}
			}
		}

		return maxSum;

	}

	public static int subArraySum(int[] array) {
		int negSumCount = 0;
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				if (sum < 0) {
					negSumCount++;
				}
			}
		}
		return negSumCount;
	}

	public static void arrayList() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;

		ArrayList<Integer>[] array = new ArrayList[n];
		for (i = 0; i < n; i++) {
			int d = sc.nextInt();
			array[i] = new ArrayList<Integer>();
			for (j = 0; j < d; j++) {
				int num = sc.nextInt();
				array[i].add(num);
			}

		}
		int q = sc.nextInt();
		int x, y;
		for (i = 0; i < q; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			try {
				System.out.println(array[x - 1].get(y - 1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
	}

	public static void listQuery() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (i = 0; i < n; i++) {
			int num = sc.nextInt();
			list.add(num);
		}

		int q = sc.nextInt();
		for (i = 0; i < q; i++) {
			String op = sc.next();
			if (op.equals("Insert")) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				list.add(x, y);

			}
			if (op.equals("Delete")) {
				int index = sc.nextInt();
				list.remove(index);
			}

		}
		sc.close();
		for (Integer item : list) {
			System.out.println(item);
		}

	}

	public static void phoneBookMap() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> phonebook = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			phonebook.put(name, phone);
			in.nextLine();
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (phonebook.containsKey(s))
				System.out.println(s + "=" + phonebook.get(s));
			else
				System.out.println("Not found");
		}
		in.close();
	}

	public static void pairSet() {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		Set<String> pairSet = new HashSet<String>();
		for (int i = 0; i < t; i++) {
			pairSet.add("(" + pair_left[i] + " , " + pair_right[i] + ")");
			System.out.println(pairSet.size());
		}

	}

	public static <E> void printArray(E[] inputArray) {
		for (E e : inputArray) {
			System.out.println(e);
		}
	}

	public static void bitOps() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);

		for (int i = 0; i < m; i++) {

			String opcode = sc.next();
			int op1 = sc.nextInt();
			int op2 = sc.nextInt();

			switch (opcode) {
			case "AND":
				if (op1 == 1) {
					b1.and(b2);
				} else {
					b2.and(b1);
				}
				break;
			case "OR":
				if (op1 == 1) {
					b1.or(b2);
				} else {
					b2.or(b1);
				}
				break;
			case "XOR":
				if (op1 == 1) {
					b1.xor(b2);
				} else {
					b2.xor(b1);
				}
				break;
			case "FLIP":
				if (op1 == 1) {
					b1.flip(op2);
				} else {
					b2.flip(op2);
				}
				break;
			case "SET":
				if (op1 == 1) {
					b1.set(op2);
				} else {
					b2.set(op2);
				}
				break;
			}
			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}
		sc.close();

	}
}
