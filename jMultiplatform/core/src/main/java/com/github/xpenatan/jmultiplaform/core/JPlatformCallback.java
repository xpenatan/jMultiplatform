package com.github.xpenatan.jmultiplaform.core;

public interface JPlatformCallback {
    /**
     * @param event name to identify the callback
     * @param params nullable
     * @param ret nullable
     */
    void onCallBack(String event, JPlatformMap params, JPlatformMap ret);
}