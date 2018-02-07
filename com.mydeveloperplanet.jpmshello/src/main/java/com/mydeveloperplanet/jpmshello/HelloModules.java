package com.mydeveloperplanet.jpmshello;

import com.mydeveloperplanet.jpmshi.HiModules;
import com.mydeveloperplanet.serviceproviderinterface.Service;

import java.lang.reflect.Method;

import static javax.xml.XMLConstants.XML_NS_PREFIX;

public class HelloModules {

    public static void main(String[] args) {
        System.out.println("Hello Modules!");
        System.out.println("The XML namespace prefix is: " + XML_NS_PREFIX);
        HiModules hiModules = new HiModules();
        System.out.println(hiModules.getHi());

        checkExportsDirectiveWithReflection();
        checkOpensDirectiveWithReflection();
        checkProvidesWith();
    }

    private static void checkExportsDirectiveWithReflection() {
        try {
            Class c = Class.forName("com.mydeveloperplanet.jpmshi.HiModules");
            Method m = c.getMethod("getHi");
            System.out.println(m.invoke(c.getDeclaredConstructor().newInstance()));
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }

    private static void checkOpensDirectiveWithReflection() {
        try {
            Class c = Class.forName("com.mydeveloperplanet.jpmsopens.OpensModules");
            Method m = c.getMethod("getHiOpens");
            System.out.println(m.invoke(c.getDeclaredConstructor().newInstance()));
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }

    private static void checkProvidesWith() {
        Service service = Service.getInstance();
        service.printServiceNames();
    }

}