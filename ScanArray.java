
/* Author: Alejandro Parana
   Date: 2/18/2013
*/

import java.util.Scanner;

class ArrayScanner {
	public ArrayScanner(int[] totalNumber) {
	}

	public int FindMax(int[] totalNumber) {
		int max = totalNumber[0];
		for (int x = 1; x < totalNumber.length; x++) {
			if (totalNumber[x] > max) {
				max = totalNumber[x];
			}
		}
		return max;
	}

	public int FindMin(int[] totalNumber) {
		int min = totalNumber[0];
		for (int x = 1; x < totalNumber.length; x++) {
			if (totalNumber[x] < min) {
				min = totalNumber[x];
			}
		}
		return min;
	}
}

public class ScanArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Midterm 1
		int studCount1 = 1;
		int[] midterm1 = new int[10];
		for (int a = 0; a < midterm1.length; a++) {
			System.out.print("Student: " + studCount1 + "\tMidterm 1: ");
			midterm1[a] = input.nextInt();
			studCount1++;
		}
		System.out.println("______________________________ \n");

		// Midterm 2
		int studCount2 = 1;
		int[] midterm2 = new int[10];
		for (int b = 0; b < midterm2.length; b++) {
			System.out.print("Student: " + studCount2 + "\tMidterm 2: ");
			midterm2[b] = input.nextInt();
			studCount2++;
		}
		System.out.println("______________________________ \n");

		// Final Exam
		int studCount3 = 1;
		int[] finalExam = new int[10];
		for (int c = 0; c < finalExam.length; c++) {
			System.out.print("Student: " + studCount3 + "\tFinal Exam: ");
			finalExam[c] = input.nextInt();
			studCount3++;
		}
		System.out.println("______________________________ \n");

		// Student Totals
		int[] totalNumber = new int[10];

		for (int x = 0; x < totalNumber.length; x++) {
			totalNumber[x] = midterm1[x] + midterm2[x] + finalExam[x];
		}

		ArrayScanner objArr = new ArrayScanner(totalNumber);
		int maxVal = objArr.FindMax(totalNumber);
		int minVal = objArr.FindMin(totalNumber);

		System.out.println("Max grade:\t" + maxVal);
		System.out.println("Min grade:\t" + minVal);
		System.out.println("");

	}
}
/*
 * 
 * Sample run:
 * 
 * 
 * Student: 1 Midterm 1: 100 Student: 2 Midterm 1: 90 Student: 3 Midterm 1: 90
 * Student: 4 Midterm 1: 90 Student: 5 Midterm 1: 90 Student: 6 Midterm 1: 90
 * Student: 7 Midterm 1: 90 Student: 8 Midterm 1: 90 Student: 9 Midterm 1: 90
 * Student: 10 Midterm 1: 80 ______________________________
 * 
 * Student: 1 Midterm 2: 100 Student: 2 Midterm 2: 90 Student: 3 Midterm 2: 90
 * Student: 4 Midterm 2: 90 Student: 5 Midterm 2: 90 Student: 6 Midterm 2: 90
 * Student: 7 Midterm 2: 90 Student: 8 Midterm 2: 90 Student: 9 Midterm 2: 90
 * Student: 10 Midterm 2: 80 ______________________________
 * 
 * Student: 1 Final Exam: 100 Student: 2 Final Exam: 90 Student: 3 Final Exam:
 * 90 Student: 4 Final Exam: 90 Student: 5 Final Exam: 90 Student: 6 Final Exam:
 * 90 Student: 7 Final Exam: 90 Student: 8 Final Exam: 90 Student: 9 Final Exam:
 * 90 Student: 10 Final Exam: 80 ______________________________
 * 
 * Max grade: 300 Min grade: 240
 * 
 * Press any key to continue . . .
 * 
 * 
 */