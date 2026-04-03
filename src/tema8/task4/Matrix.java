// package tema8.task4;

import java.io.*;
class Matrix{
  public static void main(String[] args){
    try{
      BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter n m p (separated by space): ");
      String line = consoleInput.readLine();
      String[] sizesArr = line.split(" ");
      int n = Integer.parseInt(sizesArr[0]);
      int m = Integer.parseInt(sizesArr[1]);
      int p = Integer.parseInt(sizesArr[2]);
      
      double[][] mx1 = new double[n][m];
      double[][] mx2 = new double[m][p];
      double[][] mxRes = new double[n][p];
      
      System.out.println("!Enter every matrix line by line!");
      System.out.println("Matrix #1:");
      for(int ln = 0; ln < n; ln++){
        System.out.print("\t");
        line = consoleInput.readLine();
        String[] nums = line.split(" ");
        for(int col = 0; col < m; col++){
          mx1[ln][col] = Double.parseDouble(nums[col]);
        }
      }
      
      System.out.println("\nMatrix #2:");
      for(int ln = 0; ln < m; ln++){
        System.out.print("\t");
        line = consoleInput.readLine();
        String[] nums = line.split(" ");
        for(int col = 0; col < p; col ++){
          mx2[ln][col] = Double.parseDouble(nums[col]);
        }
      }
      
      System.out.println("\nResult Matrx #1 X Matrix #2:");
      for(int ln = 0; ln < n; ln++){
        System.out.print("\t");
        for(int col = 0; col < p; col++){
          for(int i = 0; i < m; i++){
            mxRes[ln][col] += mx1[ln][i] * mx2[i][col];
          }
          System.out.print(mxRes[ln][col] + " ");
        }
        System.out.println();
      }
    } catch (Exception e){
      e.printStackTrace();
    }
    
  }
}