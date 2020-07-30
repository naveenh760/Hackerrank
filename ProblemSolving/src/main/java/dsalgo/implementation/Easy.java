package dsalgo.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Easy {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(2, 4));
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(16, 32, 96));
		getTotalX(a, b);
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> roundedGrades = new ArrayList<Integer>(grades.size());
		for (Integer grade : grades) {
			if (grade < 38) {
				roundedGrades.add(grade);
			} else {
				int rem = grade % 5;
				if (rem > 2) {
					int newGrade = grade + (5 - rem);
					roundedGrades.add(newGrade);
				} else {
					roundedGrades.add(grade);
				}
			}

		}
		return roundedGrades;
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int[] applePoints = new int[apples.length];
		int[] orangePoints = new int[oranges.length];
		int appleCount = 0;
		int orangeCount = 0;

		for (int i = 0; i < apples.length; i++) {
			applePoints[i] = apples[i] + a;
			if (applePoints[i] >= s && applePoints[i] <= t) {
				appleCount++;
			}
		}

		for (int i = 0; i < oranges.length; i++) {
			orangePoints[i] = oranges[i] + b;
			if (orangePoints[i] >= s && orangePoints[i] <= t) {
				orangeCount++;
			}
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);
	}

	static String kangaroo(int x1, int v1, int x2, int v2) {
		if (v1 - v2 == 0) {
			return "NO";
		}
		int n = (x2 - x1) / (v1 - v2);
		int rem = (x2 - x1) % (v1 - v2);
		if (n > 0 && rem == 0) {
			return "YES";
		} else {
			return "NO";
		}

	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {

		int count = 0;
		int max = Collections.max(b);
		List<Integer> factorsOfLargest = getFactors(max);
		for (Integer factor : factorsOfLargest) {
			boolean isX = false;
			for (Integer aNum : a) {
				if (factor % aNum == 0) {
					isX = true;
				} else {
					isX = false;
					break;
				}
			}

			if (isX == false) {
				continue;
			}

			for (Integer bNum : b) {
				if (bNum % factor == 0) {
					isX = true;
				} else {
					isX = false;
					break;
				}
			}
			if (isX) {
				System.out.println(factor);
				count++;
			}
		}

		return count;
	}

	public static List<Integer> getFactors(int number) {
		List<Integer> factors = new LinkedList<Integer>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar[i] + ar[j]) % k == 0) {
					count++;
				}
			}
		}

		return count;
	}

	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		int pairs = 0;
		for (int element : ar) {
			if (count.containsKey(element)) {
				count.put(element, count.get(element) + 1);
			} else {
				count.put(element, 1);
			}
		}

		Collection<Integer> values = count.values();
		for (Integer value : values) {
			pairs = pairs + (value / 2);
		}

		return pairs;
	}

	static int countingValleys(int n, String s) {
		int position = 0;
		int valleyCount = 0;
		char[] charArray = s.toCharArray();
		for (char step : charArray) {
			if (step == 'U') {
				position++;
				if (position == 0) {
					valleyCount++;
				}
			} else if (step == 'D') {
				position--;
			}
		}

		return valleyCount;
	}

	static String angryProfessor(int k, int[] a) {
		int countOnTime = 0;
		for (int time : a) {
			if (time <= 0) {
				countOnTime++;
			}
		}

		if (countOnTime < k) {
			return "YES";
		} else {
			return "NO";
		}
	}

	static long repeatedString(String s, long n) {
		long countATotal = 0;
		int length = s.length();
		long countAStr = s.chars().filter(ch -> ch == 'a').count();
		if (n % length == 0) {
			countATotal = countAStr * (n / length);
		} else {
			int subLength = (int) (n % length);
			String subStr = s.substring(0, subLength);
			long countASubStr = subStr.chars().filter(ch -> ch == 'a').count();
			countATotal += countAStr * (n / length);
			countATotal += countASubStr;
		}

		return countATotal;
	}

	static int[] breakingRecords(int[] scores) {
		int min = scores[0];
		int max = scores[0];
		int breakMax = 0;
		int breakMin = 0;

		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
				breakMin++;
			} else if (scores[i] > max) {
				max = scores[i];
				breakMax++;
			}
		}

		int[] breakRecords = { breakMax, breakMin };
		return breakRecords;
	}

	static int birthday(List<Integer> s, int d, int m) {
		int totalWays = 0;
		for (int i = 0; i < s.size(); i++) {
			int sum = 0;
			int j;
			for (j = i; j < i + m && j < s.size(); j++) {
				sum += s.get(j);
			}
			if (sum == d && j == i + m) {
				totalWays++;
			}
		}
		return totalWays;
	}

	static int migratoryBirds(List<Integer> arr) {
		Map<Integer, Integer> birdTypeCount = new HashMap<Integer, Integer>();
		for (Integer birdType : arr) {
			if (birdTypeCount.containsKey(birdType)) {
				birdTypeCount.put(birdType, birdTypeCount.get(birdType) + 1);
			} else {
				birdTypeCount.put(birdType, 1);
			}
		}

		int maxbirdTypeCount = Collections.max(birdTypeCount.values());
		int minId = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> entry : birdTypeCount.entrySet()) {
			if (entry.getValue() == maxbirdTypeCount && entry.getKey() < minId) {
				minId = entry.getKey();
			}
		}

		return minId;
	}

	static void bonAppetit(List<Integer> bill, int k, int b) {
		int billAmount = 0;
		for (int i = 0; i < bill.size(); i++) {
			if (i != k) {
				billAmount += bill.get(i);
			}
		}

		int share = billAmount / 2;
		if (b == share) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - share);
		}

	}

	static int pageCount(int n, int p) {
		// p/2 is number of pages to turn from begining.
		return Math.min(p / 2, n / 2 - p / 2);

	}
	
	//loops
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int max = - 1; 
        for(int keyboard: keyboards) {
        	for(int drive: drives) {
        		int total = keyboard + drive;
        		if( total <= b && total > max) {
        			max = total;
        		}
        	}
        }
        return max;
    }
	
	//Math
	static String catAndMouse(int x, int y, int z) {
       int catADist = Math.abs(z - x);
       int catBDist = Math.abs(z - y);
       
       if(catADist < catBDist) {
    	   return "Cat A";
       }
       else if(catADist > catBDist) {
    	   return "Cat B";
       }
       else {
    	   return "Mouse C";
       }

    }

}
