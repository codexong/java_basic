package static2;

public class DecoMain2 {

    public static void main(String[] args) {

        String str = "hello java";

        //인스턴스를 생성하지 않고 클래스에 바로 접근
        String deco = DecoUtil2.deco(str);

        System.out.println("before + " + str);
        System.out.println("after + " + deco);

    }
}
