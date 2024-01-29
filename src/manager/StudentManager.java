package manager;

import file.FileS;
import login.LoginManager;
import model.Login;
import model.Student;
import validate.ValidateStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentManager extends LoginManager {
    List<Student> students = new ArrayList<>();
    List<Login> logins = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void add(Student s) {
        students.add(s);
    }

    public void read() {
        students = FileS.read();
    }

    public void write() {
        FileS.write(students);
    }


    public Student create() {
        int id = ValidateStudent.id(students);
        String name = ValidateStudent.name(students);
        double toan = ValidateStudent.toan();
        double ly = ValidateStudent.ly();
        double hoa = ValidateStudent.hoa();
        System.out.println("Nhập ");
        return new Student(id, name, toan, ly, hoa);
    }

    public void edit() {
        try {
            System.out.println("Nhập id muốn sửa");
            int id = Integer.parseInt(scanner.nextLine());
            int index = findIndexById(id);
            if (index != -1) {
                students.set(index, create());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void delete() {
        try {
            System.out.println("Nhập id muốn xóa");
            int id = Integer.parseInt(scanner.nextLine());
            int index = findIndexById(id);
            if (index != -1) {
                students.remove(index);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void averageScore() {
        try {
            boolean input = true;
            while (input) {
                System.out.println("Nhập ID hs (nhập 0 để thoát):");
                int id = Integer.parseInt(scanner.nextLine());
                if (id == 0) {
                    return;
                }
                int index = findIndexById(id);
                if (index != -1) {
                    Student student = students.get(index);
                    double diemTrungBinh = student.averageScore();
                    System.out.println("Điểm trung bình của sinh viên có ID " + id + " là: " + diemTrungBinh);
                    System.out.println("Điểm Toán: " + student.getToan());
                    System.out.println("Điểm Lý: " + student.getLy());
                    System.out.println("Điểm Hóa: " + student.getHoa());

                    if (diemTrungBinh >= 8) {
                        System.out.println("Xếp loại: Giỏi");
                    } else if (diemTrungBinh >= 5) {
                        System.out.println("Xếp loại: Khá");
                    } else {
                        System.out.println("Xếp loại: Yếu");
                    }
                    input = true;
                } else {
                    System.out.println("Không tìm thấy sinh viên với ID " + id);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void highestScore() {
        try {
            double maxScore = 0;
            Student studentWithMaxScore = null;

            for (Student s : students) {
                double averageScore = s.averageScore();
                if (averageScore > maxScore) {
                    maxScore = averageScore;
                    studentWithMaxScore = s;
                }
            }

            if (studentWithMaxScore != null) {
                System.out.println("Sinh viên có điểm cao nhất:");
                System.out.println("ID: " + studentWithMaxScore.getId());
                System.out.println("Tên: " + studentWithMaxScore.getName());
                System.out.println("Điểm trung bình: " + maxScore);
                System.out.println("Điểm Toán: " + studentWithMaxScore.getToan());
                System.out.println("Điểm Lý: " + studentWithMaxScore.getLy());
                System.out.println("Điểm Hóa: " + studentWithMaxScore.getHoa());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void display() {
        System.out.println("ID, Name, Toan, Ly, Hoa");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public int findIndexById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void displayScoresByUserStudentName() {
        for (Student student : students) {
            for (Login login : logins) {
                if ( student.getName().equals(login.getStudentUsernames()) ) {
                    System.out.println("ID: " + student.getId());
                    System.out.println("Tên: " + student.getName());
                    System.out.println("Điểm Toán: " + student.getToan());
                    System.out.println("Điểm Lý: " + student.getLy());
                    System.out.println("Điểm Hóa: " + student.getHoa());
                       }}}}



}
    



