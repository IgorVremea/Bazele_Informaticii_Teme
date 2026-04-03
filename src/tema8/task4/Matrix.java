// package tema8.task4;
import java.io.*;
class Matrix{
  public static void main(String[] args){
    try{
      File fileInput = new File("test.txt");
      BufferedReader consoleInput = new BufferedReader(new InputStreamReader(new FileInputStream(fileInput), "UTF-8"));
      String line = consoleInput.readLine();
      String[] sizesArr = line.split(" ");
      int n = Integer.parseInt(sizesArr[0]);
      int m = Integer.parseInt(sizesArr[1]);
      int p = Integer.parseInt(sizesArr[2]);
      System.out.println(n + " " + m + " " + p);
      
      double[][] mx1 = new double[n][m];
      double[][] mx2 = new double[m][p];
      double[][] mxRes = new double[n][p];
      
      for(int ln = 0; ln < n; ln++){
        line = consoleInput.readLine();
        String[] nums = line.split(" ");
        for(int col = 0; col < m; col++){
          mx1[ln][col] = Double.parseDouble(nums[col]);
        }
      }
      for(int ln = 0; ln < m; ln++){
        line = consoleInput.readLine();
        String[] nums = line.split(" ");
        for(int col = 0; col < p; col ++){
          mx2[ln][col] = Double.parseDouble(nums[col]);
        }
      }
      for(int ln = 0; ln < n; ln++){
        for(int col = 0; col < p; col++){
          for(int i = 0; i < m; i++){
            mxRes[ln][col] += mx1[ln][i] * mx2[i][col];
          }
          System.out.print(mxRes[ln][col] + " ");
        }
        System.out.println();
      }
      
      consoleInput.close();  
    } catch (Exception e){
      e.printStackTrace();
    }
    
  }
}