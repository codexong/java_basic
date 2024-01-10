package pack;

public class Data {

    public  Data(){
        System.out.println("패키지 pack Data 생성");
    }

    public static class PackMain1 {

        public static void main(String[] args) {

            Data data = new Data();

        }

    }
}
