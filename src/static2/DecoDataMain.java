package static2;

import static static2.DecoData.staticCall;
public class DecoDataMain {
    public static void main(String[] args) {

        System.out.println("1. 정적 메소드 호출");
        DecoData.staticCall(); //클래스 이름을 통해 바로 접근 -> 참조값 없이 접근
        staticCall(); //import 후 클래스 명 생략 가능

        System.out.println("2. 인스턴스 메소드 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1);

    }
}
