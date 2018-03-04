package com.dyleaf.structure.FlyweightPattern.Complex;



import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 享元工厂
 */
public class TicketFactory {
    public static Map<String, Ticket> stringTicketMap = new ConcurrentHashMap<>(); //内部状态


    public Ticket getTicket(List<Map.Entry<String,String>> fromToPair){
        CompositeTrainTicket ticket = new CompositeTrainTicket();
        for (Map.Entry p:fromToPair) {
            ticket.add(p.getKey()+"-"+p.getValue(), this.getTicket((String) p.getKey(), (String) p.getValue()));
        }
        return ticket;
    }

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
