package erxercise.chapter_32.fish;



public class FishChild extends Fish {
    private boolean eatable;
    protected String leavingSea;

    //새로운 메소드
    public void digging(){
        System.out.println(myInfo()+"가 모래를 파고있습니다.");
    }
    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public void becomeDanger(){
        this.havingPoison = true;
    }
    @Override
    void eat(String food){
        System.out.printf(myInfo()+"는 %s를 아주 열심히 먹고 있습니다.\n", food);

    }

    void printSea(){
        System.out.println(myInfo()+"는"+this.leavingSea+"바다 출신이고,"+"부모 물고기는"+super.leavingSea+"바다 출신이야");
    }
    public void setLeavingSeaChild(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    FishChild(){
        super();
    }
    public FishChild(boolean eatable,String leavingSea){
        this.eatable = eatable;
        super.leavingSea = leavingSea;
    }
    FishChild(String sex,boolean eatable,String leavingSea){
        super(sex,false,"2022","2022","");
        this.eatable = eatable;
    }
}
