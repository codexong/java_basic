package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        //this가 생략되어 있음
        nameField = nameParameter;
    }
}
