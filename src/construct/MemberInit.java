package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

    //메소드 추가
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //멤버변수와 메서드의 매개변수의 이름이 같을 땐
    //매개변수가 우선순위를 가진다
}
