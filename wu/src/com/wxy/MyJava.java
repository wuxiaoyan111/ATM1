package com.wxy;

public class MyJava {
    public static void main(String[] args) {
        System.out.println("我的名字");

        String a = "张三";

        System.out.println("a = " + a);
        System.out.println("MyJava.main");
        System.out.println("args = [" + args + "]");
      /*  age= 18;

        if (age<18){
            System.out.println("此人为成年");
        }*/
//创建电脑
   Computer c1 = new Computer();
        c1.setColor("白色");
        c1.setPrice("一百");
        c1.setType("类型");
        System.out.println("c1 = " + c1);
}


}
