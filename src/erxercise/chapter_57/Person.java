package erxercise.chapter_57;

import java.io.Serializable;

public class Person implements Serializable {
    //

    private static final long serialVersionUID =1L;
    private transient String name;
    private String gender;
    private transient int age;

    private String county;
    private String occupation;

    public void showMyself(){
        System.out.printf("Person 인스턴스:name : %s , gender: %s , age %d \n",this.name,this.gender,this.age);
    }


    public Person(String name){
        this(name,"unknown");
    }
    public Person(String name, String gender){
        this(name,gender,-1,"Korea",null);
    }

    public Person(String name, String gender, int age, String county, String occupation) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.county = county;
        this.occupation = occupation;
    }

    public Person returnMySelf(){
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", county='" + county + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
