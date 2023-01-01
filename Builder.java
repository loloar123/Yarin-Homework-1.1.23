package date_01_01_23oop.HW;

public class Builder {
    private int age;
    private double height;
    private String name;

    public Builder(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public Builder(){
        this.age = 00;
        this.height = 0.0;
        this.name = "Guest";
    }

    public Builder(int age,double height){
        this.age = age;
        this.height = height;
        this.name = "Guest";
    }

    @Override
    public String toString() {
        return "Builder{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    public Builder(Builder other){
        this.age = other.age;
        this.height = other.height;
        this.name = other.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
