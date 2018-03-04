package structure.FlyweightPattern.Complex;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<Map.Entry<String, String>> list = new ArrayList<>();
        list.add(new AbstractMap.SimpleEntry<String, String>("北京", "青岛"));
        list.add(new AbstractMap.SimpleEntry<String, String>("北京", "杭州"));
        list.add(new AbstractMap.SimpleEntry<String, String>("北京", "福州"));

        TicketFactory ticketFactory = new TicketFactory();
        CompositeTrainTicket ticket1 = (CompositeTrainTicket) ticketFactory.getTicket(list);
        CompositeTrainTicket ticket2 = (CompositeTrainTicket) ticketFactory.getTicket(list);
        ticket1.showTicketInfo("下铺");
        ticket2.showTicketInfo("上铺");

    }
}
