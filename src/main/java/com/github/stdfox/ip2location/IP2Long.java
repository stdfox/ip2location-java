package com.github.stdfox.ip2location;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

public class IP2Long {
  public static long[] IPToLong(String addr) throws UnknownHostException {
    InetAddress inet = InetAddress.getByName(addr);

    if (inet instanceof Inet4Address) {
      return new long[] {ByteBuffer.allocate(Integer.BYTES).put(inet.getAddress()).getInt(0) & 0xFFFFFFFFL};
    }
    else if (inet instanceof Inet6Address) {
      String addrExpanded = inet.getHostAddress(); // For this to work we need to expand IPv6
      return IPv6ToLong(addrExpanded);
    }

    return null;
  }

  public static long[] IPv6ToLong(String addr) {
    String[] addrArray = addr.split(":");// a IPv6 adress is of form 2607:f0d0:1002:0051:0000:0000:0000:0004
    long[] num = new long[addrArray.length];

    for (int i = 0; i < addrArray.length; i++) {
      num[i] = Long.parseLong(addrArray[i], 16);
    }
    long long1 = num[0];
    for (int i = 1; i < 4; i++) {
      long1 = (long1 << 16) + num[i];
    }
    long long2 = num[4];
    for (int i = 5; i < 8; i++) {
      long2 = (long2 << 16) + num[i];
    }

    long[] longs = { long2, long1 };
    return longs;
  }

  public static String longToIP(long[] ip) throws UnknownHostException {
    String ipString = "";

    if (ip.length == 1) { // IPv4
      return InetAddress.getByAddress(ByteBuffer.allocate(Integer.BYTES).putInt((int)ip[0]).array()).getHostAddress();
    }
    else if (ip.length == 2) { // IPv6
      for (long crtLong : ip) {// for every long: it should be two of them

        for (int i = 0; i < 4; i++) {// we display in total 4 parts for every long
          ipString = Long.toHexString(crtLong & 0xFFFF) + ":" + ipString;
          crtLong = crtLong >> 16;
        }
      }
    }

    return ipString;
  }
}