package org.factorydesignpattern;

public class FactoryMain {
    public static void main(String[] args){
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj1 = osf.getInstance("Android");
        obj1.spec();
        OS obj2 = osf.getInstance("Windows");
        obj2.spec();
    }
}
