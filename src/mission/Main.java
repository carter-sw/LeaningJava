package mission;

public class Main {
    public static void main(String[] args) {
//        1. 학생 클래스들을 구현합니다.
//- **`CollegeStudent`** 클래스: 모든 학생의 기본 클래스로 사용됩니다. **`studentNumber`**, **`name`**, **`gpa`**라는 속성을 가지며, 생성자와 해당 속성들의 getter 메서드를 구현합니다.
//- **`YoungGroupCollegeStudent`** 클래스: 1학년과 2학년을 대표하는 클래스로, **`CollegeStudent`** 클래스를 상속받습니다.
//- **`ElderGroupCollegeStudent`** 클래스: 3학년과 4학년을 대표하는 클래스로, **`CollegeStudent`** 클래스를 상속받습니다.
//- **`Freshman`** 클래스: 1학년을 대표하는 클래스로, **`YoungGroupCollegeStudent`** 클래스를 상속받습니다.
//- **`Sophomore`** 클래스: 2학년을 대표하는 클래스로, **`YoungGroupCollegeStudent`** 클래스를 상속받습니다.
//- **`Junior`** 클래스: 3학년을 대표하는 클래스로, **`ElderGroupCollegeStudent`** 클래스를 상속받습니다.
//- **`Senior`** 클래스: 4학년을 대표하는 클래스로, **`ElderGroupCollegeStudent`** 클래스를 상속받습니다.
//- 각 클래스는 `Object` 의 `toString` 메소드를 구현해야합니다.
//1. ClassRoom 클래스를 구현합니다.
//- **`ClassRoom`** 클래스: 제네릭 타입 **`T`**를 가지며, 학생들을 관리하는 기능을 제공합니다. **`studentMap`**과 **`studentNames`**라는 멤버 변수를 가지고, 생성자와 다음 메서드를 구현합니다.
//- **`addStudent`** 메서드: 전달된 학생 객체를 **`studentMap`**에 저장하고, **`studentNames`**에 학생의 이름을 추가합니다.
//- **`getStudentByStudentNumber`** 메서드: 주어진 학번에 해당하는 학생 객체를 **`studentMap`**에서 조회하여 반환합니다.
//- **`printStudentNames`** 메서드: 현재 ClassRoom에 속한 학생들의 이름을 출력합니다.

        ClassRoom<CollegeStudent> allStudentsClassRoom = new ClassRoom<>("전체 교양수업");
        ClassRoom<YoungGroupCollegeStudent> youngGroupClassRoom = new ClassRoom<>("저학년 전용 교양수업");
        ClassRoom<ElderGroupCollegeStudent> elderGroupClassRoom = new ClassRoom<>("고학년 전용 교양수업");
        ClassRoom<Freshman> freshmanClassRoom = new ClassRoom<>("1학년 전공수업");
        ClassRoom<Sophomore> sophomoreClassRoom = new ClassRoom<>("2학년 전공수업");
        ClassRoom<Junior> juniorClassRoom = new ClassRoom<>("3학년 전공수업");
        ClassRoom<Senior> seniorClassRoom = new ClassRoom<>("4학년 전공수업");

        Senior senior1 = new Senior("001", "Larry", 3.7);
        Senior senior2 = new Senior("002", "Bob", 3.5);
        Senior senior3 = new Senior("003", "Eve", 3.8);

        Junior junior1 = new Junior("004", "Kelly", 4.0);
        Junior junior2 = new Junior("005", "Eve", 3.8);
        Junior junior3 = new Junior("006", "Frank", 4.1);

        Sophomore sophomore1 = new Sophomore("007", "Ivy", 3.9);
        Sophomore sophomore2 = new Sophomore("008", "Jack", 3.8);
        Sophomore sophomore3 = new Sophomore("009", "Charlie", 4.0);

        Freshman freshman1 = new Freshman("010", "Grace", 3.6);
        Freshman freshman2 = new Freshman("011", "Henry", 3.3);
        Freshman freshman3 = new Freshman("012", "David", 3.9);

        allStudentsClassRoom.addStudent(freshman1);
        allStudentsClassRoom.addStudent(freshman2);
        allStudentsClassRoom.addStudent(freshman3);
        allStudentsClassRoom.addStudent(sophomore1);
        allStudentsClassRoom.addStudent(sophomore2);
        allStudentsClassRoom.addStudent(sophomore3);
        allStudentsClassRoom.addStudent(junior1);
        allStudentsClassRoom.addStudent(junior2);
        allStudentsClassRoom.addStudent(junior3);
        allStudentsClassRoom.addStudent(senior1);
        allStudentsClassRoom.addStudent(senior2);
        allStudentsClassRoom.addStudent(senior3);

        youngGroupClassRoom.addStudent(freshman1);
        youngGroupClassRoom.addStudent(freshman2);
        youngGroupClassRoom.addStudent(sophomore1);
        youngGroupClassRoom.addStudent(sophomore2);

        elderGroupClassRoom.addStudent(junior1);
        elderGroupClassRoom.addStudent(junior2);
        elderGroupClassRoom.addStudent(senior1);
        elderGroupClassRoom.addStudent(senior2);

        freshmanClassRoom.addStudent(freshman1);
        freshmanClassRoom.addStudent(freshman2);
        freshmanClassRoom.addStudent(freshman3);

        sophomoreClassRoom.addStudent(sophomore1);
        sophomoreClassRoom.addStudent(sophomore2);
        sophomoreClassRoom.addStudent(sophomore3);

        juniorClassRoom.addStudent(junior2);
        juniorClassRoom.addStudent(junior3);

        seniorClassRoom.addStudent(senior2);
        seniorClassRoom.addStudent(senior3);

        System.out.println(allStudentsClassRoom.getStudentByStudentNumber("003"));
        System.out.println(allStudentsClassRoom.getStudentByStudentNumber("006"));
        allStudentsClassRoom.printStudentNames();

        System.out.println(youngGroupClassRoom.getStudentByStudentNumber("010"));
        System.out.println(youngGroupClassRoom.getStudentByStudentNumber("005"));
        youngGroupClassRoom.printStudentNames();

        System.out.println(elderGroupClassRoom.getStudentByStudentNumber("001"));
        System.out.println(elderGroupClassRoom.getStudentByStudentNumber("002"));
        elderGroupClassRoom.printStudentNames();

        System.out.println(freshmanClassRoom.getStudentByStudentNumber("011"));
        freshmanClassRoom.printStudentNames();

        System.out.println(sophomoreClassRoom.getStudentByStudentNumber("008"));
        sophomoreClassRoom.printStudentNames();

        System.out.println(juniorClassRoom.getStudentByStudentNumber("006"));
        juniorClassRoom.printStudentNames();

        System.out.println(seniorClassRoom.getStudentByStudentNumber("002"));
        seniorClassRoom.printStudentNames();
    }
}
