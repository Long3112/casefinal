package file;

import manager.StudentManager;
import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileS {
    static File studentFile = new File("student.csv");
    public static void writeStudent(List<Student> students) {
        try {
            FileWriter fileWriter = new FileWriter(studentFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student s : students) {
                bufferedWriter.write(s.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readStudent() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(studentFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                String[] arr = str.split(",");
                Student student = new Student(Integer.parseInt(arr[0]),arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),Double.parseDouble(arr[4]));
                students.add(student);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

}
