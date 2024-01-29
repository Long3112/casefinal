package validate;

import model.Login;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class ValidateLogin {
    static Scanner scanner = new Scanner(System.in);

    public static String teacherUsernames(List<Login> logins) {

        while (true) {
            System.out.println("Nhập tên hs");
            String studentUsernames = scanner.nextLine();
            boolean check = true;
            for (Login l : logins) {
                if (l.getStudentUsernames().equals(studentUsernames)) {
                    System.err.println("Trùng username rồi");
                    check = false;
                    break;
                }
            }
            if (check) {
                return studentUsernames;
            }
        }
    }

    public static int teacherPasswords(List<Login> logins) {
        while (true) {
            try {
                System.out.println("Nhập mk");
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("mk phai la so");
            }
        }
    }
}
