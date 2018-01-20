import com.mydeveloperplanet.serviceprovider2.ServiceProvider2;
import com.mydeveloperplanet.serviceproviderinterface.spi.ServiceProviderInterface;

module com.mydeveloperplanet.serviceprovider2 {
    requires com.mydeveloperplanet.serviceproviderinterface;

    provides ServiceProviderInterface with ServiceProvider2;
}