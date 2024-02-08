package erxercise.chapter_55;

public class Student {

    // 속성 (1) 학교 정보
    private int schoolYear; // 몇 학년
    private int classroomNumber; // 몇반
    private int studentNumber; // 학번

    // 속성 (2) 학생 개인정보
    private String name; // 이름
    private String gender; // 성별
    private int score;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public Student(int schoolYear, int classroomNumber, int studentNumber, String name, String gender, int score) {
        this.schoolYear = schoolYear;
        this.classroomNumber = classroomNumber;
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
}
