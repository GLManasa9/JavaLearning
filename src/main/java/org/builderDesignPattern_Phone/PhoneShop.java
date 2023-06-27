package org.builderDesignPattern_Phone;

import static java.lang.System.out;

public class PhoneShop {
    public static void main(String[] args) {
        Phone ph = new PhoneBuilder().setOs("Android").setRam(4).getPhone();
        out.println(ph);
    }
}
