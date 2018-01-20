module com.mydeveloperplanet.serviceprovider1 {
    requires com.mydeveloperplanet.serviceproviderinterface;

    provides com.mydeveloperplanet.serviceproviderinterface.spi.ServiceProviderInterface with com.mydeveloperplanet.serviceprovider1.ServiceProvider1;
}