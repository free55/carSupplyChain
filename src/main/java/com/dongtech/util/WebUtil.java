package com.dongtech.util;

import java.util.HashMap;
import java.util.Map;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Web工具类(用于操作Cookie)
 * @author PF
 *
 */
public class WebUtil {


    /**
     * 添加Cookie
     *
     * @param response
     * @param name
     * Cookie的名字
     * @param value
     * Cookie的值
     * @param maxAge
     * Cookie的存活时间
     */
    public static void addCookie(HttpServletResponse response, String name,
                                 String value, int maxAge) {
        Cookie cookie = new Cookie(name, value);
        if (maxAge > 0)
            cookie.setMaxAge(maxAge);
// 添加到客户端
        response.addCookie(cookie);
    }


    /**
     * 取出硬盘中所有的Cookie
     *
     * @param request
     * @return
     */
    public static Map<String, Cookie> getAllCookies(HttpServletRequest request) {
        Map<String, Cookie> cookie_map = new HashMap<String, Cookie>();
        Cookie[] cookies = request.getCookies();
//如果存在cookie,就存入Map
        if(cookies!=null){
            for (int i = 0; i < cookies.length; i++) {
                cookie_map.put(cookies[i].getName(), cookies[i]);
            }
        }
        return cookie_map;
    }
    /**
     * 在Cookie中通过Cookie名称获得Session中的SessionId
     * @param request
     * @param name
     * @return
     */
    public static String getSessionIdByNameInCookie(HttpServletRequest request,String name){
        Map<String, Cookie> cookie_map=getAllCookies(request);
        if(cookie_map.containsKey(name)){
            Cookie cookie = cookie_map.get(name);
            return cookie.getValue();
        }
        return null;
    }
}
