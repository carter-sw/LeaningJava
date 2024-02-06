package erxercise.chapter_53;

public class OuterStaticClass {

    private static int outerDate;

    public OuterStaticClass() {

    }

    public static class InnerClass{
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display(){
            System.out.println("outerDate: "+ outerDate);
            System.out.println("innerData: "+innerData);
        }
    }


}
