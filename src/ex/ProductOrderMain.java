package ex;
public class ProductOrderMain {
    public static void main(String[] args) {

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];

        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        ProductOrder productOrder1 = new ProductOrder();
        productOrders[0] = productOrder1;
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2= new ProductOrder();
        productOrders[1] = productOrder2;
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        ProductOrder productOrder3= new ProductOrder();
        productOrders[2] = productOrder3;
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        int totalAmount = 0;

        // 상품 주문 정보와 최종 금액 출력
        for (ProductOrder productOrder : productOrders) {

            System.out.println("상품명 : " +productOrder.productName +
                                "가격 : " + productOrder.price +
                                "수랑 : " + productOrder.quantity);

            totalAmount += productOrder.price * productOrder.quantity;
        }

        System.out.println("총 결제 금액 : " + totalAmount);

    }
}
