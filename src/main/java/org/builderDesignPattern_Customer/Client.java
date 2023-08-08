package org.builderDesignPattern_Customer;

public class Client {
    public static void main(String[] args){
        Customer customer = CustomerBuilder.builder()
                .firstName("manasa").and()
                .lastName("guduru").and()
                .primaryEmail("manasa.gmail.com").and()
                .primaryMobileNumber("84798589437").and()
                .with()
                .build();

        System.out.println(customer.toString());
    }
}
