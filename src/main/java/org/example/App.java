package org.example;

import org.example.config.AppConfig;
import org.example.entity.Customer;
import org.example.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // СОЗДАЕМ КОНТЕКСТ
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // ПОЛУЧАЕМ БИН CustomerService
        CustomerService customerService = context.getBean(CustomerService.class);

        // ПОЛУЧАЕМ ЗАПИСЬ ИЗ БАЗЫ
        Customer customer = customerService.get(1L);

        // ВЫВОДИМ В КОНСОЛЬ
        System.out.println(customer);
    }
}
