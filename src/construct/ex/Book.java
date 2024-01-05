package construct.ex;

public class Book {

    String title;
    String author;
    int page;

    //문제

    //밑에 생성자를 정의해뒀기 때문에 기본생성자를 만들어줘여함
    Book(){

        this(" ", " ");

    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author){
        this(title, author, 500);
    }

    void displayInfo(){
        System.out.println("책 이름 : " + title +
                " 작가 : " + author + " 페이지 : " + page);
    }
}
