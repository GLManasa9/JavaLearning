package org.factorydesignpattern;

public class OperatingSystemFactory {
    public OS getInstance(String osType) {
        if (osType.equals("Android"))
            return new Android();
        else if (osType.equals("iOS"))
            return new iOS();
        return new Windows();
    }
}
