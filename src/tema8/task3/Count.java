// package tema8.task3;

import java.io.*;

public class Count{
	public static void main(String[] args) {
		try {
			BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter substing: ");
			String substring = consoleInput.readLine();
			System.out.print("Enter filename (with extension): ");
			String fileName = consoleInput.readLine();
			File file = new File(fileName);
			if(!file.exists()) {
				System.out.println("File doesn't exist");
				return;
			}
			BufferedReader fileInput = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			String line;
			int count = 0;
			while((line = fileInput.readLine()) != null){
				int pos = 0;
				while(line.indexOf(substring, pos) != -1){
					count++;
					pos = line.indexOf(substring, pos) + 1;
				}
			}
			
			System.out.println(count);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}