package erxercise.chapter_52;

public class PTMemberTest {
    public static void main(String[] args) {

        PTMember member = new PTMember("민철",178,70,"Male");

        try {
            member.setID("assdgbsb");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(member);
    }
}
