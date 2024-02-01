package erxercise.chapter_19;

public class Gugudan {
    public static void main(String[] args) {
        //
        for (int i = 2; i <= 9; i++) {

            for (int j = 1; j <= 9; j++) {
                int result = i*j;
                System.out.printf("%d * %d = %d\n",i,j,result);
            }
            System.out.println();
        }


    }
}
