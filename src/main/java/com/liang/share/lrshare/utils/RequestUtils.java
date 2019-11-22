package com.liang.share.lrshare.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * request请求工具类
 *
 **/
public class RequestUtils {

    private static final String X_REQUESTED_WIDTH = "X-Requested-With";
    private static final String XML_HTTP_REQUEST = "XMLHttpRequest";

    /**
     * 判断是否ajax请求.
     * 可以看到Ajax 请求多了个 x-requested-with ，可以利用它，
     * request.getHeader("x-requested-with"); 为 null，则为传统同步请求，为 XMLHttpRequest，则为Ajax 异步请求。
     *
     * @param request HttpServletRequest
     * @return 是否ajax请求.
     */
    public static boolean isAjaxRequest(HttpServletRequest request) {
        String xr = request.getHeader(X_REQUESTED_WIDTH);
        return (XML_HTTP_REQUEST.equalsIgnoreCase(xr));
    }

    private RequestUtils() {
    }
}
