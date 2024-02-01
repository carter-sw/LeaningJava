package erxercise.chapter_36;

public class InterfaceTest {
    public static void main(String[] args) {
        // 속성
        System.out.println(Flyable.atmosphereLimit);


        // Flayable
        Flyable bird = new Bird();
        Flyable airplan = new Airplane("AB101-1");

        bird.fly();
        airplan.fly();

        //Walkable
        Walkable person = new Person();
        Person person2 = new Person();
        person2.setName("카리나");
        Walkable robot = new Robot("RB1_315_5");

        person.walk();
        robot.walk();

        if(robot instanceof Robot){
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person2);
        }
    }
}
