package com.itheima.tenet.three.news;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.three.old.SendMessage
 ****/
public abstract class SendMessage {
// 理事替换原则 ： 创建对象用的父类，执行的时候用子类？
    public static void main(String[] args) {
        Customer commonCustomer = new CommonCustomer();
        commonCustomer.setName("王五");
        commonCustomer.setPhone("13670001111");
        Customer vipCustomer= new VipCustomer();
        vipCustomer.setName("赵六");
        vipCustomer.setPhone("13670001155");

        send(vipCustomer);
        send(commonCustomer);
    }

    //给VIP客户发消息
    public static void send(Customer customer){
        System.out.println(customer.sefInfo());
    }
}
