package com.github.xpenatan.jmultiplaform.core;

final public class JMultiplatform {

    private static JMultiplatform platformMap;

    private final JPlatformMap map;
    private JPlatformCallback callback;

    public static JMultiplatform getInstance() {
        if(platformMap == null) {
            platformMap = new JMultiplatform();
        }
        return platformMap;
    }

    private JMultiplatform() {
        map = new JPlatformMap();
    }

    public JPlatformMap getMap() {
        return map;
    }

    public void setCallback(JPlatformCallback callback) {
        this.callback = callback;
    }

    public void removeCallback() {
        callback = null;
    }

    /**
     * Return true if callback is called
     */
    public boolean callCallback(String event, JPlatformMap params, JPlatformMap ret) {
        if(event != null && !event.trim().isEmpty() && callback != null) {
            callback.onCallBack(event, params, ret);
            return true;
        }
        return false;
    }
}