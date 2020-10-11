package com.designpattern.Proxy;

/**
 *
 * 代理模式．
 * 顾名思义，就是设置代理的模式．
 *
 * 该模式在Spring, Hibernate等开源框架中被广泛使用．
 *
 * */
public class ProxyPattern {
    public static void main(String[] args) {
        new Proxy().print();
    }
}

class Proxy {
   public void preRequest() {
       System.out.println("Proxy preRequest");
   }

   public void print() {
       preRequest();
       new RealService().print();
       postRequest();
   }

    private void postRequest() {
        System.out.println("Proxy postRequest");
    }

}

class RealService {
    public void print() {
        System.out.println("RealService");
    }
}