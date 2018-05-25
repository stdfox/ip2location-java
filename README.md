IP2Location Java Package
========================

This Java package provides a fast lookup of country, region, city, latitude, longitude, ZIP code, time zone, ISP, domain name, connection type, IDD code, area code, weather station code, station name, mcc, mnc, mobile brand, elevation, and usage type from IP address by using IP2Location database. This package uses a file based database available at IP2Location.com. This database simply contains IP blocks as keys, and other information such as country, region, city, latitude, longitude, ZIP code, time zone, ISP, domain name, connection type, IDD code, area code, weather station code, station name, mcc, mnc, mobile brand, elevation, and usage type as values.

**At this moment it supports only IPv4 address.**

Example
=======

```java
import com.github.stdfox.ip2location.IP2Location;
import com.github.stdfox.ip2location.IP2LocationResult;

public class Application {
    public static void main(String[] args) {
        try {
            IP2Location ip2Location = new IP2Location("IP-COUNTRY-REGION-CITY-LATITUDE-LONGITUDE-ZIPCODE-TIMEZONE-ISP-DOMAIN-NETSPEED-AREACODE-WEATHER-MOBILE-ELEVATION-USAGETYPE-SAMPLE.BIN");
            IP2LocationResult result = ip2Location.query("8.8.8.8");

            System.out.println(result.country_code);
            System.out.println(result.country_name);
            System.out.println(result.city);
            System.out.println(result.isp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

```

Database
========

Free LITE databases are available at https://lite.ip2location.com upon registration.

The paid databases are available at https://ip2location.com under subscription package.
