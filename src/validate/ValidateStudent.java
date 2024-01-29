package validate;

import model.Student;

import java.util.List;
import java.util.Scanner;

public class ValidateStudent {
    static Scanner scanner = new Scanner(System.in);

    public static int id(List<Student> students) {
        int idMax = 0;
        for (Student s : students) {
            if (s.getId() > idMax) {
                idMax = s.getId();
            }
        }
        return idMax + 1;
    }

    public static double toan() {
        while (true) {
            try {
                System.out.println("Nhập điểmt toán");
                double diemToan = Double.parseDouble(scanner.nextLine());

                if (diemToan >= 0 && diemToan <= 10) {
                    return diemToan;
                } else {
                    System.err.println("Điểm không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (Exception e) {
                System.err.println("Đây k là score");
            }
        }
    }

    public static double ly() {
        while (true) {
            try {
                System.out.println("Nhập điểmt ly");
                double diemLy = Double.parseDouble(scanner.nextLine());

                if (diemLy >= 0 && diemLy <= 10) {
                    return diemLy;
                } else {
                    System.err.println("Điểm không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (Exception e) {
                System.err.println("Đây k là score");
            }
        }
    }

    public static double hoa() {
        while (true) {
            try {
                System.out.println("Nhập điểmt hoa");
                double diemHoa = Double.parseDouble(scanner.nextLine());

                if (diemHoa >= 0 && diemHoa <= 10) {
                    return diemHoa;
                } else {
                    System.err.println("Điểm không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (Exception e) {
                System.err.println("Đây k là score");
            }
        }
    }

    public static String name(List<Student> students) {
        while (true) {
            System.out.println("Nhập tên hs");
            String name = scanner.nextLine();
            boolean check = true;
            for (Student s : students) {
                if (s.getName().equals(name)) {
                    System.err.println("Trùng tên rồi");
                    check = false;
                    break;
                }
            }
            if (check) {
                return name;
            }
        }
    }
}



