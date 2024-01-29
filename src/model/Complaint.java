package model;

public class Complaint {
    private String complaintName;
    private String complaintContent;
    private String complaintResponse;

    public Complaint(String complaintName, String complaintContent,String complaintResponse) {
        this.complaintName = complaintName;
        this.complaintContent = complaintContent;
        this.complaintResponse = complaintResponse;
    }

    public Complaint() {
    }

    public String getComplaintResponse() {
        return complaintResponse;
    }

    public void setComplaintResponse(String complaintResponse) {
        this.complaintResponse = complaintResponse;
    }

    public String getComplaintName() {
        return complaintName;
    }

    public void setComplaintName(String complaintName) {
        this.complaintName = complaintName;
    }

    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent;
    }
}
