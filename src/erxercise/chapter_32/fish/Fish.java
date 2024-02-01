package erxercise.chapter_32.fish;


//설계도
public class Fish {
    // 속성
    private String sex; // "Male", "Female"
    protected boolean havingPoison; // true: 독이있고 , false : 독이없고
    private String StartSpawningDate; //산란 시작시각
    private String endSpawningDate; //산란 종료시각
    protected String leavingSea; // 사는 속성


    // 행위
    void eat(String food) {
        System.out.printf(myInfo()+"는 %s를 먹고 있습니다.\n", food);
    }

    void swim(int meter) {
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }

    void makeCrowd(Fish otherfish) {
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }

    void sleep() {
    }

    String myInfo(){
        return String.format("물고기 (sex=%s, havingPossion=%b, leavingSea=%s\n",this.sex,this.havingPoison,this.leavingSea);
    }

    void printMyInfo(){
        System.out.println(myInfo());
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isHavingPoison() {
        return havingPoison;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public String getStartSpawningDate() {
        return StartSpawningDate;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        StartSpawningDate = startSpawningDate;
    }

    public String getEndSpawningDate() {
        return endSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public String getLeavingSea() {
        return leavingSea;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    Fish (){
    }

    public Fish(String sex, boolean havingPoison, String startSpawningDate, String endSpawningDate, String leavingSea) {
        this.sex = sex;
        this.havingPoison = havingPoison;
        StartSpawningDate = startSpawningDate;
        this.endSpawningDate = endSpawningDate;
        this.leavingSea = leavingSea;
    }
}
