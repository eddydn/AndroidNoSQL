package dev.edmt.mongodbcloud;

import dev.edmt.mongodbcloud.Class.User;

/**
 * Created by reale on 28/09/2016.
 */

public class Common {
    private static String DB_NAME ="edmtdev";
    private static String COLLECTION_NAME = "user";
    public static  String API_KEY = "PS51eMy0aOJ0IWoaD8tCGbU5qIyrob3w";

    public static String getAddressSingle(User user){
        String baseUrl = String.format("https://api.mlab.com/api/1/databases/%s/collections/%s",DB_NAME,COLLECTION_NAME);
        StringBuilder stringBuilder = new StringBuilder(baseUrl);
        stringBuilder.append("/"+user.get_id().getOid()+"?apiKey="+API_KEY);
        return stringBuilder.toString();
    }

    public static String getAddressAPI(){
        String baseUrl = String.format("https://api.mlab.com/api/1/databases/%s/collections/%s",DB_NAME,COLLECTION_NAME);
        StringBuilder stringBuilder = new StringBuilder(baseUrl);
        stringBuilder.append("?apiKey="+API_KEY);
        return stringBuilder.toString();
    }
}
