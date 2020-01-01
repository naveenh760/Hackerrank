package ds.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Easy {

	static int[] reverseArray(int[] a) {
		int n = a.length;
		for (int i = 0; i < n / 2; i++) {
			int other = n - 1 - i;
			int temp = a[i];
			a[i] = a[other];
			a[other] = temp;
		}
		return a;
	}

	static int hourglassSum(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr[i].length - 1; j++) {
				int top = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1];
				int mid = arr[i][j];
				int bottom = arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
				int hourglass = top + mid + bottom;
				if (hourglass > maxSum) {
					maxSum = hourglass;
				}
			}
		}
		return maxSum;

	}

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		List<Integer> output = new LinkedList<Integer>();
		ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>(n);
		for (int i = 0; i < n; i++) {
			seqList.add(new ArrayList<Integer>());
		}

		int lastAnswer = 0;
		for (int i = 0; i < queries.size(); i++) {
			int op = queries.get(i).get(0);
			int x = queries.get(i).get(1);
			int y = queries.get(i).get(2);
			if (op == 1) {
				int index = (x ^ lastAnswer) % n;
				seqList.get(index).add(y);
			} else if (op == 2) {
				int seqNo = (x ^ lastAnswer) % n;
				int size = seqList.get(seqNo).size();
				int ind = y % size;
				lastAnswer = seqList.get(seqNo).get(ind);
				output.add(lastAnswer);
			}
		}

		return output;
	}

	static long arrayManipulation(int n, int[][] queries) {
      long max = Long.MIN_VALUE;
      List<Long> numberList = new ArrayList<Long>(Collections.nCopies(n, new Long(0)));
      for(int i = 0; i < queries.length; i++) {
    	  int a = queries[i][0];
    	  int b = queries[i][1];
    	  int k = queries[i][2];
    	  
    	  for(int j = a - 1; j <= b - 1 ; j++) {
    		  numberList.set(j, numberList.get(j) + k);
    	  }
      }
      
     max =  Collections.max(numberList);
     return max;
    }
	
	static long arrayManipulation1(int n, int[][] queries) {
	      long max = Long.MIN_VALUE;
	      List<Long> numberList = new ArrayList<Long>(Collections.nCopies(n, new Long(0)));
	      for(int i = 0 ; i < numberList.size(); i++) {
	    	  for(int j = 0; j < queries.length; j++) {
	    		  int a = queries[j][0];
	        	  int b = queries[j][1];
	        	  int k = queries[j][2];
	        	  
	        	  if( i >= a -1 && i <= b -1) {
	        		  numberList.set(i, numberList.get(i) + k);
	        	  }
	    	  }
	      }
	     max =  Collections.max(numberList);
	     return max;
	    }
}
