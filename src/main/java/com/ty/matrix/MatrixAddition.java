package com.ty.matrix;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		int numberOfRows;
		int numberOfcolumns;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
 
			System.out.print("Enter number of rows of matrix: ");
			numberOfRows = scanner.nextInt();
			System.out.print("Enter number of columns of matrix: ");
			numberOfcolumns = scanner.nextInt();
 
			int Matrix1[][] = new int[numberOfRows][numberOfcolumns];
			int Matric2[][] = new int[numberOfRows][numberOfcolumns];
			int resultMatrix[][] = new int[numberOfRows][numberOfcolumns];
 
			System.out.print("Enter elements of first matrix: ");
 
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfcolumns; j++) {
					Matrix1[i][j] = scanner.nextInt();
				}
			}
			System.out.println("First Matrix is: ");
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfcolumns; j++) {
					System.out.print(" " + Matrix1[i][j] + "\t");
				}
				System.out.println();
			}
 
			System.out.print("Enter elements of Second Matrix: ");
 
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfcolumns; j++) {
					Matric2[i][j] = scanner.nextInt();
				}
			}
						
			System.out.println("Second Matrix is: ");
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfcolumns; j++) {
					System.out.print(" " + Matric2[i][j] + "\t");
				}
				System.out.println();
			}
 
			//Addition logic of two matrices
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfcolumns; j++) {
					resultMatrix[i][j] = Matrix1[i][j] + Matric2[i][j];
				}
			}
 
			//Printing the result matrix
			System.out.println("Result Matrix is: ");
			for (int i = 0; i < resultMatrix.length; i++) {
				for (int j = 0; j < numberOfcolumns; j++) {
					System.out.print(" " + resultMatrix[i][j] + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(scanner != null){
				scanner.close();
			}
		}
	}

	}


