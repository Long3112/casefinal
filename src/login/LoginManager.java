package login;

import model.Login;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginManager {


    List<Login> logins = new ArrayList<>();
    List<Student> students = new ArrayList<>();

    public void registerStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Registration");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        Login login = new Login();
        login.setStudentUsernames(username);
        login.setStudentPasswords(password);

        logins.add(login);
        System.out.println("Registration successful");

    }

    public void registerTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teacher Registration");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        Login login = new Login();
        login.setTeacherUsernames(username);
        login.setTeacherPasswords(password);
        logins.add(login);
        System.out.println("Registration successful");
    }

    public boolean studentLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Login");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        for (Login login : logins)
        {
            if (username.equals(login.getStudentUsernames()) && password.equals(login.getStudentPasswords())){
                    System.out.println("Login successful");
                    return true;
                }
            }

        System.out.println("Invalid credentials. Please try again");
        return false;
    }

    public boolean teacherLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teacher Login");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        for (Login login : logins) {
            if (username.equals(login.getTeacherUsernames()) && password.equals(login.getTeacherPasswords())) {
                System.out.println("Login successful");
                return true;

            }
        }
        System.out.println("Invalid credentials. Please try again");
        return false;
    }




}
