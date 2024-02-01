package erxercise.chapter_27.packageTwo;

import erxercise.chapter_27.packgeOne.ClassA;

public class ClassB {

    public void testPublish(ClassA classA){
        String str = classA.publicStr;
        classA.methodPublic();
    }

//    public void testPrivate(ClassA classA){
//        String str = classA.privateStr;
//        classA.methodPrivate();
//    }
//
//    public void testDefault(ClassA classA){
//        String str = classA.defaultStr;
//        classA.methodDefault();
//    }

}
