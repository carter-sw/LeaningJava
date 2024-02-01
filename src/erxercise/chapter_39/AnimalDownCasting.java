package erxercise.chapter_39;

import erxercise.chapter_33.Animal;
import erxercise.chapter_33.Bird;
import erxercise.chapter_33.Person;

public class AnimalDownCasting {
    public static void main(String[] args) {
        // 다운 캐스팅 확인여부

        Animal animal = new Bird();
        Bird bird = (Bird) animal;
        checkBirdAndFly(animal);

        Animal animal2 = new Animal();
        checkBirdAndFly(animal2);


        Animal animal3 = new Person();
        checkBirdAndFly(animal3);
    }
    static void checkBirdAndFly(Animal animal){
        if (animal instanceof erxercise.chapter_33.Bird) {
            erxercise.chapter_33.Bird bird = (Bird) animal;
            bird.fly();
        }else {
            System.out.println("너는 새가 아니야");
        }
    }
}
