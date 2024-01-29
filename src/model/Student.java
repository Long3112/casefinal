package model;

public class Student {
    private int id;
    private String name;
    private double toan;
    private double ly;
    private double hoa;

    public Student() {
    }

    public Student(int id,String name, double toan, double ly, double hoa) {
        this.id=id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", toan=" + toan +
                ", ly=" + ly +
                ", hoa=" + hoa +
                '}';
    }
    public double averageScore() {
        return (toan + ly + hoa) / 3;
    }
}
