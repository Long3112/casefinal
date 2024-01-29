package manager;

import model.Complaint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComplaintManager {

    Scanner scanner = new Scanner(System.in);
    List<Complaint> complaints = new ArrayList<>();

    public void submitComplaint() {
        System.out.println("Nhập tên người khiếu nại:");
        String complaintName = scanner.nextLine();
        System.out.println("Nhập nội dung khiếu nại:");
        String complaintContent = scanner.nextLine();

        Complaint newComplaint = new Complaint();
        newComplaint.setComplaintName(complaintName);
        newComplaint.setComplaintContent(complaintContent);
        complaints.add(newComplaint);

        System.out.println("Khiếu nại đã được gửi.");
    }

    public void viewComplaints() {
        int complaintIndex = -1;

        while (complaintIndex != 0) {
            for (Complaint c : complaints) {
                if (c.getComplaintName() != null && c.getComplaintContent() != null) {
                    System.out.println("Khiếu nại:");
                    System.out.println("Tên người khiếu nại: " + c.getComplaintName());
                    System.out.println("Nội dung khiếu nại: " + c.getComplaintContent());
                    System.out.println("Phản hồi khiếu nại: " + c.getComplaintResponse());
                    System.out.println("---------------------------");
                }
            }

            System.out.println("Nhập số thứ tự của khiếu nại để phản hồi ( 0 để thoát):");
            complaintIndex = scanner.nextInt();

            if (complaintIndex >= 1 && complaintIndex <= complaints.size()) {
                Complaint selectedComplaint = complaints.get(complaintIndex - 1);

                if (selectedComplaint.getComplaintResponse() == null) {
                    System.out.println("Nhập phản hồi của bạn:");
                    scanner.nextLine();
                    String responseContent = scanner.nextLine();
                    selectedComplaint.setComplaintResponse(responseContent);
                    System.out.println("Phản hồi đã được gửi.");
                } else {
                    System.out.println("Khiếu nại này đã được phản hồi trước đó.");
                }
            } else if (complaintIndex == 0) {
                System.out.println("Thoát khỏi phản hồi khiếu nại.");
            } else {
                System.out.println("Số thứ tự không hợp lệ.");
            }
        }
    }
}
