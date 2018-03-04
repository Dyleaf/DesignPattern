package com.dyleaf.behavior.ChainOfResponsibilityPattern;

public class Test {
    public static void main(String[] args) {
        //构建各个领导人
        Leader a = new Director("张三");//主任
        Leader b = new Manager("李四");//经理
        Leader c = new GeneralManager("王五");//总经理
        //设置各个责任链上的关系
        a.setNextLeader(b);//主任的下一个审批人为经理
        b.setNextLeader(c);//经理的下一个审批人为总经理

        //开始请假
        LeaveRequest request = new LeaveRequest("小明", 3, "旅游");
        a.handleRequest(request);//小明提交了请假申请给主任
    }
}
