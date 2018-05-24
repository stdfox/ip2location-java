package IP2Location;

public class IP2LocationResult {
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
    public String weatherstationcode;
    public String weatherstationname;
    public String mcc;
    public String mnc;
    public String mobilebrand;
    public float elevation;
    public String usagetype;

    IP2LocationResult(String ipAddress) {
        ip = ipAddress;
    }
}
