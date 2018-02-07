package com.mydeveloperplanet.serviceproviderinterface;

import com.mydeveloperplanet.serviceproviderinterface.spi.ServiceProviderInterface;

import java.util.ServiceLoader;

/**
 * Define the Service which loads the Service Providers
 */
public class Service {
    private static Service ourInstance = new Service();

    public static Service getInstance() {
        return ourInstance;
    }

    private Service() {
    }

    /**
     * Print the names of the Services which implement the
     * ServiceProviderInterface
     */
    public void printServiceNames() {
        ServiceLoader<ServiceProviderInterface> serviceLoader = ServiceLoader.load(ServiceProviderInterface.class);
        serviceLoader.iterator().forEachRemaining(service -> service.printServiceName());
    }
}
