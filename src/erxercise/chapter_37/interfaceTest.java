package erxercise.chapter_37;

public class interfaceTest {
    public static void main(String[] args) {
        //Male 3 개 남편,아빠 ,회사원

        HusbandRole male = new Male("철수");
        Wife wife = new Female("아이유");
        male.sayLoveEveryDay();
        male.takeCareWife(wife);

        //이어서 아빠
        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("김시향");
        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryDay();

        // 회사원
        EmployeeRole maleemployee = (EmployeeRole) maleDaddy;
        EmployeeRole maleEmplyeeTwo = new MaleTwo("김채원");

        maleemployee.workTogether(maleEmplyeeTwo);
    }
}
