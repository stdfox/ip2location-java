package com.github.stdfox.ip2location;

public class IP2LocationResult {
    public static final String ToStringTemplate = ""
        + "ip=%s, "
        + "country_code=%s, "
        + "country_name=%s, "
        + "region=%s, "
        + "city=%s, "
        + "isp=%s, "
        + "latitude=%s, "
        + "longitude=%s, "
        + "domain=%s, "
        + "zipcode=%s, "
        + "timezone=%s, "
        + "netspeed=%s, "
        + "iddcode=%s, "
        + "areacode=%s, "
        + "weatherstation_code=%s, "
        + "weatherstation_name=%s, "
        + "mcc=%s, "
        + "mnc=%s, "
        + "mobilebrand=%s, "
        + "elevation=%s, "
        + "usagetype=%s";

    public String ip;
    public String country_code;
    public String country_name;
    public String region;
    public String city;
    public String isp;
    public float latitude;
    public float longitude;
    public String domain;
    public String zipcode;
    public String timezone;
    public String netspeed;
    public String iddcode;
    public String areacode;
    public String weatherstation_code;
    public String weatherstation_name;
    public String mcc;
    public String mnc;
    public String mobilebrand;
    public float elevation;
    public String usagetype;

    IP2LocationResult(String ipAddress) {
        ip = ipAddress;
    }

    public String toString() {
        return String.format(
            ToStringTemplate,
            ip,
            country_code,
            country_name,
            region,
            city,
            isp,
            latitude,
            longitude,
            domain,
            zipcode,
            timezone,
            netspeed,
            iddcode,
            areacode,
            weatherstation_code,
            weatherstation_name,
            mcc,
            mnc,
            mobilebrand,
            elevation,
            usagetype
        );
    }
}
