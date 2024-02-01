package erxercise.chapter_26;

import java.lang.reflect.MalformedParametersException;

public class ClassroomDay {
    public static void main(String[] args) {
        //
        Student student1 = new Student("school",1,3,20,"Bob", "Male");
        Student student2 = new Student("school",1,3,25,"Alice", "FeMale");
        Student student3 = new Student("school",1,3,30,"Taylor", "FeMale");
        Student student4 = new Student("school",1,3,35,"Lula", "FeMale");

        Teacher teacher = new Teacher("Tom","Female","국어","AB001");

        String subjectName = "국어";

        //본격 적인 로직 흐름 시작
        teacher.teach(student1,subjectName);
        student1.study(teacher,subjectName);

        teacher.teach(student2,subjectName);
        student2.study(teacher,subjectName);

        teacher.teach(student3,subjectName);
        student3.study(teacher,subjectName);

        teacher.teach(student4,subjectName);
        student4.study(teacher,subjectName);
    }
}
