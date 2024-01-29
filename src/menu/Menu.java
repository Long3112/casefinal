package menu;

import login.LoginManager;
import manager.ComplaintManager;
import manager.StudentManager;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        LoginManager loginManager = new LoginManager();
        ComplaintManager complaintManager = new ComplaintManager();

        while (true) {
            System.out.println("Menu Login");
            System.out.println("1. Dang Nhap");
            System.out.println("2. Dang Ki");
            System.out.println("3. Thoat");
            int choice ;
            while (true) {
                try {
                    System.out.println("Nhập lựa chọn của bạn");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                }
            }
            switch (choice){
                case 2:
                    System.out.println("Dang ki");
                    System.out.println("1. Hoc sinh dang ki");
                    System.out.println("2. Giao vien dang ki");
                    System.out.println("3. Quay lai");
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int registrationChoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (registrationChoice){
                        case 1:
                            System.out.println("Dang ki danh cho hoc sinh");
                            loginManager.registerStudent();

                            break;
                        case 2:
                            System.out.println("Dang ki danh cho giao vien");
                            loginManager.registerTeacher();
                            break;
                        case 3:
                            System.out.println("Quay lai menu");
                            break;

                    }
                    break;
                case 1:
                    System.out.println("Dang nhap");
                    System.out.println("1. Hoc sinh dang nhap");
                    System.out.println("2. Giao vien dang nhap");
                    System.out.println("3. Quay lai");
                    System.out.print("Nhập lựa chọn của bạn: ");
                    int loginChoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (loginChoice){
                        case 1:
                            System.out.println("Dang nhap danh cho hoc sinh");
                            if (loginManager.studentLogin()) {
                                boolean continueStudentMenu=true;
                                while (continueStudentMenu) {
                                System.out.println("Quản lý học sinh");
                                System.out.println("1. Hiển thị score");
                                System.out.println("2. Khiếu nại ( hoặc đề xuất hoạt động)");
                                System.out.println("3. Thoát");

                                int studentChoice ;
                                while (true) {
                                    try {
                                        System.out.println("Nhập lựa chọn của bạn");
                                        studentChoice = Integer.parseInt(scanner.nextLine());
                                        break;
                                    } catch (Exception e) {
                                        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                                    }
                                }
                                switch (studentChoice){
                                    case 1:
                                        studentManager.display();
                                        break;
                                    case 2:
                                        complaintManager.submitComplaint();
                                        break;
                                    case 3:
                                        continueStudentMenu = false;
                                        break;
                                    default:
                                        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                                        break;
                                }
                                }
                            }


                            break;
                        case 2:
                            System.out.println("Dang nhap danh cho giao vien");
                            if (loginManager.teacherLogin()) {
                                boolean continueTeacherMenu=true;
                                while (continueTeacherMenu) {

                                    System.out.println("Quản lý học sinh(giáo viên)");
                                    System.out.println("1. Hiển thị các hs");
                                    System.out.println("2. Thêm hs");
                                    System.out.println("3. Sửa hs");
                                    System.out.println("4. Xóa hs");
                                    System.out.println("5. Điểm trung bình của học sinh (nhap id)");
                                    System.out.println("6. Học sinh điểm cao nhất");
                                    System.out.println("7. Đọc file");
                                    System.out.println("8. Ghi file");
                                    System.out.println("9. Nhận khiếu nại");
                                    System.out.println("10. Thoát");
                                    int teacherChoice;
                                    while (true) {
                                        try {
                                            System.out.println("Nhập lựa chọn của bạn");
                                            teacherChoice = Integer.parseInt(scanner.nextLine());
                                            break;
                                        } catch (Exception e) {
                                            System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");

                                        }
                                    }

                                    switch (teacherChoice) {
                                        case 1:
                                            studentManager.display();
                                            break;
                                        case 2:
                                            studentManager.add(studentManager.create());
                                            break;
                                        case 3:
                                            studentManager.edit();
                                            break;
                                        case 4:
                                            studentManager.delete();
                                            break;
                                        case 5:
                                            studentManager.averageScore();
                                            break;
                                        case 6:
                                            studentManager.highestScore();
                                            break;

                                        case 7:
                                            studentManager.read();
                                            break;
                                        case 8:
                                            studentManager.write();
                                            break;
                                        case 9:
                                            complaintManager.viewComplaints();
                                            break;
                                        case 10:
                                            continueTeacherMenu = false;
                                            break;
                                        default:
                                            System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                                            break;
                                    }

                                }

                            }


                            break;
                        case 3:
                            System.out.println("Quay lai menu");
                            break;
                        default:
                            System.out.println("Loi, chon lai menu");
                            break;
                    }
                    break;
                case 3:
                    return;
            }
        }
    }
}
