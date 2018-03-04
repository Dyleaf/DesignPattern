package structure.FlyweightPattern.Simple;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 享元工厂
 */
public class TicketFactory {
    public static Map<String, Ticket> stringTicketMap = new ConcurrentHashMap<>(); //内部状态

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (stringTicketMap.containsKey(key)) {
            System.out.println("使用缓存-->" + key);
            return stringTicketMap.get(key);
        } else {
            System.out.println("创建对象-->" + key);
            Ticket ticket = new TrainTicket(from, to);
            stringTicketMap.put(key,ticket);
            return new TrainTicket(from, to);
        }
    }
}
