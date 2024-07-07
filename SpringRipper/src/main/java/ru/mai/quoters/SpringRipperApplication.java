package ru.mai.quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRipperApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(Quoter.class).sayQuote();
    }

}
