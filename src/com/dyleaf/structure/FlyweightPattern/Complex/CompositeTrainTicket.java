package com.dyleaf.structure.FlyweightPattern.Complex;

import java.util.HashMap;
import java.util.Map;

public class CompositeTrainTicket implements Ticket {

    private Map<String, Ticket> map = new HashMap<>();

    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(String key, Ticket trainTicket) {
        map.put(key, trainTicket);
    }

    /**
     * 外蕴状态作为参数传入到方法中
     */
    @Override
    public void showTicketInfo(String bunk) {
        Ticket ticket = null;
        for (Object o:map.keySet()) {
            ticket = map.get(o);
            ticket.showTicketInfo(bunk);
        }
    }
}
