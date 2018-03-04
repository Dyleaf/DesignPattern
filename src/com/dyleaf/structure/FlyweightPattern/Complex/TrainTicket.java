package com.dyleaf.structure.FlyweightPattern.Complex;


import java.util.Random;

/**
 * 具体享元角色类
 */
public class TrainTicket implements Ticket {

    public String from;
    public String to;
    public String bunk;
    public int price;

    /**
     * 构造函数，内蕴状态作为参数传入
     * @param from
     * @param to
     */
    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("购买 从" + from + " 到" + to + "的" + bunk + "火车票" + "," + "价格" + price);
    }
}
