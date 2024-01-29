package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){

        //instanceValue++; //인스턴스 변수 접근 compile error
        //instanceMethod(); //인스턴스 메서드 접근 compile error

        staticValue++; //정적변수에 접근
        staticMethod(); //정적메소드 접근
    }

    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근 compile error
        instanceMethod(); //인스턴스 메서드 접근 compile error

        DecoData.staticValue++; //정적변수에 접근
        staticMethod(); //정적메소드 접근
    }

    private void instanceMethod(){

        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){

        System.out.println("staticValue = " + staticValue);
    }

    //참조값 넘겨서 static 접근
    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceCall();
    }
}
