package com.mydeveloperplanet.serviceprovider1;

import com.mydeveloperplanet.serviceproviderinterface.spi.ServiceProviderInterface;

/**
 * A Service Provider implementing the SPI (Service Provider Interface)
 */
public class ServiceProvider1 implements ServiceProviderInterface {
    @Override
    public void printServiceName() {
        System.out.println("This is Service Provider 1");
    }
}
