package erxercise.chapter_30;

import erxercise.chapter_28.Teacher;

public class Student {

    private static int serialNum =1;
    static String city= "seoul";
    // 속성
    private String schoolName;
    private int classYear; // 몇 학년
    private int classroomNumbers; // 몇 반
    private int studentNumber; // 몇 번


    private int studentID; //student 고유 ID

    //기본 정보
    private String name;
    private String gender;

    // 정적 메소드
    public static int getSerialNum(){
        return serialNum;
    }
    public static void setSerialNum(int num){
        serialNum = num;
    }
    //행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName();
        System.out.printf("학생 : 저는%s 선생님에게 %s 과목을 배웁니다.\n",teacherName,subjectName);
    }

    //생성자
    Student(){

    }

    public void printMyInfo(){
        System.out.printf("[Student] schoolName : %s, classYear: %s, classroomNumber: %d, studentNumber: %d, studentID: %d, name: %s, gender: %s\n",
        this.schoolName,this.classYear,this.classroomNumbers,this.studentNumber,this.studentID,this.name,this.gender);
    }

    Student(String name, String gender){
        this("School",1,3,-1,name,gender);
    }

    public Student(String schoolName, int classYear, int classroomNumbers, int studentNumber, String name, String gender) {
        this.studentID = serialNum++;
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumbers = classroomNumbers;
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public int getClassroomNumbers() {
        return classroomNumbers;
    }

    public void setClassroomNumbers(int classroomNumbers) {
        this.classroomNumbers = classroomNumbers;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
