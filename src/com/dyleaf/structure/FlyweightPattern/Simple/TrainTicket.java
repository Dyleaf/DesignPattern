package com.dyleaf.structure.FlyweightPattern.Simple;

import java.util.Random;

/**
 * 具体享元角色类
 */
public class TrainTicket implements Ticket {

    public String from;
    public String to;
    public String bunk;
    public int price;

    //负责为内部状态提供存储空间
    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("购买 从" + from + " 到" + to + "的" + bunk + "火车票" + "," + "价格" + price);
    }
}
