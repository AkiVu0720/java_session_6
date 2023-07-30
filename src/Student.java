import java.util.Scanner;

public class Student {
    //1 Attributes
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private float htmlScore;
    private float cssScore;
    private float javascriptScore;
    private float avgScore;
    //2 Get,set

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getHtmlScore() {
        return htmlScore;
    }

    public void setHtmlScore(float htmlScore) {
        this.htmlScore = htmlScore;
    }

    public float getCssScore() {
        return cssScore;
    }

    public void setCssScore(float cssScore) {
        this.cssScore = cssScore;
    }

    public float getJavascriptScore() {
        return javascriptScore;
    }

    public void setJavascriptScore(float javascriptScore) {
        this.javascriptScore = javascriptScore;
    }

    public float getAvgScore() {
        return avgScore;
    }
    //3 Constructors

    public Student() {
    }

    public Student(String studentId, String studentName, int age, boolean sex, float htmlScore, float cssScore, float javascriptScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javascriptScore = javascriptScore;
    }
    // 4. Input, Output
    public void inputData(Scanner scanner){
        System.out.println("Nhap Ma SV: ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhap Ten Sinh Vien: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhap Tuoi: ");
        this.age=Integer.parseInt(scanner.nextLine());
        System.out.println("Gioi Tinh ");
        this.sex = true;
        do {
            System.out.println("Nhap diem Html: ");
            this.htmlScore = Float.parseFloat(scanner.nextLine());
        }while (this.htmlScore<0||this.htmlScore>10);
        do {
            System.out.println("Nhap diem Css: ");
            this.cssScore=Float.parseFloat(scanner.nextLine());
        }while ( this.cssScore<0|| this.cssScore>10);

        do {
            System.out.println("Nhap diem javaScrip: ");
            this.javascriptScore=Float.parseFloat(scanner.nextLine());
        }while (this.javascriptScore<0||this.javascriptScore>10);
    }
    public void disPlayData(){
        String sex ="";
        if (this.sex){
            sex = "Nam";
        }else {
            sex = "Nu";
        }
        System.out.printf(this.studentId+"\t\t"+this.studentName+"\t\t\t"+ this.age+"\t\t\t"+ sex+"\t\t\t"
                + this.htmlScore+"\t\t\t" + this.cssScore+"\t\t\t\t"+ this.javascriptScore+"\t\t\t\t" + "%.3f",this.avgScore);
        System.out.println(" ");
    }
    public void disPlayAvg(){
        System.out.println(this.studentId+"\t\t\t"+this.studentName+"\t\t\t\t"+this.avgScore);
    }

    //5 Methods
    public void calAvgScore(){
        this.avgScore = (float) Math.round(((this.htmlScore+this.cssScore+this.javascriptScore)/3)*10)/10;
    }
}
