package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    //생성자
    //1) 대문자로 시작
    //2) 클래스 명과 같아야함
    //3) 반환타입이 없음
    MemberConstruct(String name, int age, int grade){

        System.out.println("생성자 호출 이름 : " + name + " 나이 : " + age + " 성적 : " + grade);

        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //생성자 추가 -> 생성자 오버로딩
    MemberConstruct(String name, int age){

        //자기자신 호출(중복제거), *생성자 코드 내에 첫 줄에만 작성할 수 있음
        this(name, age, 50);
        //this를 사용하면 생성자 내부에서 다른 생성자를 호출 할 수 있다.

//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }
}
