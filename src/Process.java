import java.util.ArrayList;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        ListStudent listStudent = new ListStudent();
        listStudent.dummyData();
        process(listStudent);

    }
    public static void menu(){
        System.out.println("1. Nhập vào thông tin  sinh viên");
        System.out.println("2. Tính điểm trung bình tất cả sinh viên");
        System.out.println("3. Hiển thị thông tin tất cả sinh viên");
        System.out.println("4. Sắp xếp sinh viên theo điểm trung bình giảm dần");
        System.out.println("5. Tìm kiếm sinh viên theo tên sinh viên");
        System.out.println("6. Thoát");
    }
    public static void process(ListStudent listStudent){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            menu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Student student = new Student();
                    student.inputData(scanner);
                    listStudent.addStudent(student);
                    listStudent.avgScore();
                    break;
                case 2:
                    listStudent.avgScore();
                    listStudent.outPutAvg();
                    break;
                case 3:
                    listStudent.avgScore();
                    listStudent.outPutAll();
                    break;
                case 4:
                    listStudent.avgScore();
                    listStudent.sapXepforAvg(listStudent.getStudentArrayList());
                    listStudent.outPutAvg();
                    break;
                case 5:
                    System.out.println("Vui long nhap ten Hoc Sinh can tim: ");
                    String name = scanner.nextLine();
                    ArrayList<Student> listName = listStudent.searchName(name);
                    listStudent.outputFomat(listName);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Vui long chon lai");
                    break;
            }
        }while (flag);
    }

}

