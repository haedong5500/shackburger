import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 메뉴 상단 인사말 및 안내
        System.out.println("SHAKESHACK BURGER에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        // 매장 메뉴
        System.out.println("[ SHAKESHACK MENU ]");
        // 매장 메뉴 리스트
        List<Menu> MenuList = new ArrayList<>();
        Menu burgers = new Menu("Burgers","앵거스 비프 통살을 다져만든 버거");
        Menu FrozenCustard = new Menu("Frozen Custard","매장에서 신선하게 만드는 아이스크림");
        Menu Drinks = new Menu("Drinks","매장에서 직접 만드는 음료");
        Menu Beer = new Menu("Beer", "뉴옥 브루클린 브루어리에서 양조한 맥주");
        MenuList.add(burgers);
        MenuList.add(FrozenCustard);
        MenuList.add(Drinks);
        MenuList.add(Beer);
       for(int i = 0; i < MenuList.size(); i++) {
           Menu menu = MenuList.get(i);
           System.out.println(i+1+"." + menu.name + "ㅣ" + menu.discription);
       }
        System.out.println();

        //장바구니 및 주문취소 리스트
        System.out.println("[ ORDER MENU ]");
        List<Order> OrderList = new ArrayList<>();
        Order order = new Order("Order");
        OrderList.add(order);
        String pick = sc.nextLine();
    }
}