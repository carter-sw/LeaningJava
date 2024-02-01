package erxercise.chapter_16;

public class AvocardoSituation {
    public static void main(String[] args) {
        /*
        // 장보기 전 아내 입장
        int milks =0; // 우유0개
        int avocados = 0; // 아보카도 0개
        boolean existedAvocado = true; // 아보카도 있는가 true

        //장보기
        milks =1;
        if(existedAvocado){
            avocados = avocados +6;
        }

        // 집으로 돌아오기
        String comment = String.format("아내야, 장보고 돌아왔어 %d 개 아보카도, %d  개 우유 사왔어",milks,avocados);
        System.out.println(comment);

         */

        // 장보기 전 남편 입장
        int milks =0; // 우유0개
        int avocados = 0; // 아보카도 0개
        boolean existedAvocado = true; // 아보카도 있는가 true

        //장보기
        if(existedAvocado){
            milks = 6;
        } else {
            milks =1;
        }

        // 집으로 돌아오기
        String comment = String.format("아내야, 장보고 돌아왔어  %d 개 아보카도, %d  개 우유 사왔어",avocados,milks);
        System.out.println(comment);

        milks =(existedAvocado) ? 6:0;
    }
}
