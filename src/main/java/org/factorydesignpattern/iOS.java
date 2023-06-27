package org.factorydesignpattern;

import static java.lang.System.out;

public class iOS implements  OS{
    @Override
    public void spec() {
        out.println("IOS OS");
    }
}
