package com.mydeveloperplanet.serviceprovider2;

import com.mydeveloperplanet.serviceproviderinterface.spi.ServiceProviderInterface;

/**
 * A Service Provider implementing the SPI (Service Provider Interface)
 */
public class ServiceProvider2 implements ServiceProviderInterface {
    @Override
    public void printServiceName() {
        System.out.println("This is Service Provider 2");
    }
}
