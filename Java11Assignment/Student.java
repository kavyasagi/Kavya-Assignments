package Java11Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Kavya\\SudentList.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	String Student;
	int StudentCount = 0;
	int StudentNameCount = 0;

	 while ((Student = bufferedReader.readLine()) != null) {
            if (Student.equals("")) {
                StudentCount += 1;
            }

	 }

	 if (StudentNameCount >= 1) {
            StudentNameCount++;
	 }
        System.out.println("Total Student Count = "+ StudentCount);
	}
}
