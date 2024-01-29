package file;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileS {
    static File file = new File("students.txt");

    public static void write(List<Student> students) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> read() {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (List<Student>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
