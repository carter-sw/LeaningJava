package erxercise.chapter_53;

// 중첩 클래스 private로 선언을 했어도 InnerClass는 접근 가능
public class OuterClass {
    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public class InnerClass{
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display(){
            System.out.println("OuterData:"+outerData);
            System.out.println("InnerData:"+innerData);
        }
    }
}
