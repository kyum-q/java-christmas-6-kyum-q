package christmas.view;
import christmas.constant.PrintMessage;
import christmas.constant.event.EventConstant;
import christmas.model.Menu;
import christmas.model.event.Badge;
import christmas.model.event.Event;

import java.text.DecimalFormat;
import java.util.List;

public class Output {

    public void printFirstMent(int date, int beforeDiscountTotalPrice) {
        System.out.println(EventConstant.EVENT_MONTH.value() + "월 " + date + "일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        if(beforeDiscountTotalPrice < EventConstant.EVENT_MIN_PRICE.value()) {
            System.out.println(PrintMessage.ORDER_LESS_MIN_PRICE);
        }
        System.out.println();
    }

    public void printTotalMenu(List<Menu> menus) {
        System.out.println(PrintMessage.TOTAL_MENU.getMessage());
        for(Menu menu : menus) {
            System.out.println(menu.toString());
        }
        System.out.println();
    }

    public void printBeforeDiscountTotalPrice(int price) {
        System.out.println(PrintMessage.BEFORE_DISCOUNT_TOTAL_PRICE.getMessage());
        System.out.printf("%,d원\n", price);
        System.out.println();
    }

    public void printGiftMenu(String gift) {
        System.out.println(PrintMessage.GIFT_MENU.getMessage());
        System.out.println(gift);
        System.out.println();
    }

    public void printBenefit(List<Event> events) {
        System.out.println(PrintMessage.BENEFIT.getMessage());

        if(events.isEmpty()) {
            System.out.println("없음");
            System.out.println();
            return;
        }
        for(Event event : events) {
            System.out.println(event.toString());
        }
        System.out.println();
    }

    public void printTotalBenefit(int benefit) {
        System.out.println(PrintMessage.TOTAL_BENEFIT.getMessage());
        System.out.printf("%,d원\n", benefit);
        System.out.println();
    }

    public void printAfterDiscountTotalPrice(int price) {
        System.out.println(PrintMessage.AFTER_DISCOUNT_TOTAL_PRICE.getMessage());
        System.out.printf("%,d원\n", price);
        System.out.println();
    }

    public void printGiftBadge(String badgeString) {
        System.out.println(PrintMessage.EVENT_BADGE.getMessage());
        System.out.println(badgeString);
    }
}
