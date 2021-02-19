package com.example.app.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static String getMD5Encrypt(String value){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] messageDigestByte = messageDigest.digest(value.getBytes());
            BigInteger bigInteger = new BigInteger(1,messageDigestByte);
            String hashText = bigInteger.toString(16);
            while (hashText.length()>32){
                hashText = "0"+hashText;
            }
            return hashText;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return value;
    }
}
