import java.util.*;

public class ListStudent {
    //1 Attributes
    private ArrayList<Student> studentArrayList;
//2 get,set
    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList() {
        this.studentArrayList = new ArrayList<Student>();
    }
    //3 Constructors
    public ListStudent() {
        this.studentArrayList = new ArrayList<Student>();
    }
    //4 Input, output
    public  void inPut(Scanner scanner){
        for (Student student:this.studentArrayList) {
            student.inputData(scanner);
        }
    }

    public void dummyData(){
        Student student = new Student();
        student = new Student("R001","Tuan",20,true,7,8,9);
        studentArrayList.add(student);
        student = new Student("R002","Tung",20,true,4,6,5);
        studentArrayList.add(student);
        student = new Student("R003","Hoang",20,true,3,7,4);
        studentArrayList.add(student);
        student = new Student("R004","Anh",20,true,4,5,4);
        studentArrayList.add(student);
        student = new Student("R005","Linh",20,false,8,3,5);
        studentArrayList.add(student);
        student = new Student("R006","Trang",20,false,5,8,3);
        studentArrayList.add(student);
        student = new Student("R007","Phuong",20,false,6,9,5);
        studentArrayList.add(student);
        student = new Student("R008","Hai",20,true,9,6,7);
        studentArrayList.add(student);
        student = new Student("R009","Hung",20,true,10,7,8);
        studentArrayList.add(student);
        student = new Student("R010","Dung",20,true,4,5,4);
        studentArrayList.add(student);
        student = new Student("R011","Lan",20,false,7,8,9);
        studentArrayList.add(student);
    }
    public void outPutAll (){
        System.out.println("Ma SV \t\t Ten \t\t Tuoi  \t\t GioiTinh\t Diem Html\t Diem Css\t Diem JavaScrip\t Diem Trung Binh");
        for (Student student:this.studentArrayList) {
            student.disPlayData();
        }
    }
    public void outputFomat(ArrayList<Student>list){
        for (Student student:list) {
            student.disPlayData();
        }
    }
    public void outPutAvg (){
        System.out.println("Ma SV \t Ten Sinh Vien \t\t Diem trung binh ");
        for (Student student:this.studentArrayList) {
            student.disPlayAvg();
        }
    }
    public  void addStudent(Student student){
        this.studentArrayList.add(student);
    }
    public void avgScore(){
        for (Student student:this.studentArrayList) {
            student.calAvgScore();
        }
    }
    public void sapXepforAvg(ArrayList<Student>studentArrayList){
        studentArrayList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAvgScore() > o2.getAvgScore() ? -1 : 1;
            }
        });
    }
    public ArrayList<Student> searchName(String name){
        ArrayList<Student> list = new ArrayList<Student>();
        for (Student student : this.studentArrayList) {
            if (student.getStudentName().equalsIgnoreCase(name)){
                list.add(student);
            }
        }return  list;
    }
}
