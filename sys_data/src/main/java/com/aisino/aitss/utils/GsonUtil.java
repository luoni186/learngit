package com.aisino.aitss.utils;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonUtil {
	
    private static Gson gson = null;
    static {
        if (gson == null) {
            //gson = new Gson();
        	gson = new GsonBuilder().registerTypeAdapter(Timestamp.class,
        			new TimestampTypeAdapter())
        	.setDateFormat("yyyy-MM-dd HH:mm:ss")
        	.create();
        }
    }
 
    private GsonUtil() {
    }
 
    /**
     * 杞垚json
     * 
     * @param object
     * @return
     */
    public static String GsonString(Object object) {
        String gsonString = null;
        if (gson != null) {
            gsonString = gson.toJson(object);

        }
        return gsonString;
    }
    public static String GsonString1(Object obj){
    	String gsonString = null;
    	if (gson != null) {
    		GsonBuilder gsonBuilder=new GsonBuilder();
    		gsonBuilder.disableHtmlEscaping();
    		Gson gson=gsonBuilder.create();
    		gsonString=gson.toJson(obj);
    	}
    	return gsonString;
    }
    /**
     * 杞垚bean
     * 
     * @param gsonString
     * 涓�鑸舰寮忕殑json,绠�鍗曠殑bean瀵硅薄
     * @param cls
     * @return
     */
    public static <T> T GsonToBean(String gsonString, Class<T> cls) {
        T t = null;
        if (gson != null) {
            t = gson.fromJson(gsonString, cls);
        }
        return t;
    }
 
    /**
     * 杞垚list 
     * @param gsonString
     * 褰㈠  [{'appId':1,'roleType':1},{'appId':2,'roleType':1},{'appId':3,'roleType':1}],jsonArray
     * @param cls
     * @return
     */
    public static <T> List<T> GsonToList(String gsonString, Class<T> cls) {
        List<T> list = null;
        if (gson != null) {
            list = gson.fromJson(gsonString, new TypeToken<List<T>>() {
            }.getType());
        }
        return list;
    }
 
    /**
     * 杞垚list涓湁map鐨�
     * 澶嶆潅鐨刯son锛屽舰濡�
     * {\"proxyId\": 4,\"roles\": \"[{'appId':1,'roleType':1},{'appId':2,'roleType':1}]\", \"cert\":\"MIICmjCCAgOgAwIBAgIIby\"};
     * @param gsonString
     * @return
     */
    public static <T> List<Map<String, T>> GsonToListMaps(String gsonString) {
        List<Map<String, T>> list = null;
        if (gson != null) {
            list = gson.fromJson(gsonString,
                    new TypeToken<List<Map<String, T>>>() {
                    }.getType());
        }
        return list;
    }
 
    /**
     * 杞垚map鐨�
     * 
     * @param gsonString
     * @return
     */
    public static <T> Map<String, T> GsonToMaps(String gsonString) {
        Map<String, T> map = null;
        if (gson != null) {
            map = gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {
            }.getType());
        }
        return map;
    }
}
