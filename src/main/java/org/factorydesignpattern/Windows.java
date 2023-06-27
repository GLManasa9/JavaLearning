package org.factorydesignpattern;

import static java.lang.System.out;

public class Windows implements  OS{
    @Override
    public void spec() {
        out.println("Windows OS");
    }
}
