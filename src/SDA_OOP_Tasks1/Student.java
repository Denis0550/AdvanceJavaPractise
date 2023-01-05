package SDA_OOP_Tasks1;

public class Student extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private float priceOfStudy;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, float priceOfStudy) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.priceOfStudy = priceOfStudy;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public float getPriceOfStudy() {
        return priceOfStudy;
    }

    public void setPriceOfStudy(float priceOfStudy) {
        this.priceOfStudy = priceOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeOfStudies='" + typeOfStudy + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                ", studiesPrice=" + priceOfStudy +
                '}';
    }
}
