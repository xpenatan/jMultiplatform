package com.github.xpenatan.jmultiplaform.core;

import java.util.HashMap;

final public class JMultiplatform {

    private static JMultiplatform platformMap;

    private final HashMap<String, Object> map;

    public static JMultiplatform getInstance() {
        if(platformMap == null) {
            platformMap = new JMultiplatform();
        }
        return platformMap;
    }

    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

    public Class<?> getClass(String key) {
        Object o = map.get(key);
        if(o != null) {
            return o.getClass();
        }
        return null;
    }

    public void put(String key, Object value) {
        map.put(key, value);
    }

    public int getInt(String key, int defaultValue)  {
        Object o = map.get(key);
        if(o instanceof Integer) {
            return (Integer) o;
        }
        return defaultValue;
    }

    public Long getLong(String key, long defaultValue)  {
        Object o = map.get(key);
        if(o instanceof Long) {
            return (Long) o;
        }
        return defaultValue;
    }

    public short getLong(String key, short defaultValue)  {
        Object o = map.get(key);
        if(o instanceof Short) {
            return (Short) o;
        }
        return defaultValue;
    }

    public float getFloat(String key, float defaultValue)  {
        Object o = map.get(key);
        if(o instanceof Float) {
            return (Float) o;
        }
        return defaultValue;
    }

    public double getFloat(String key, double defaultValue)  {
        Object o = map.get(key);
        if(o instanceof Double) {
            return (Double) o;
        }
        return defaultValue;
    }

    public Boolean getBoolean(String key, boolean defaultValue)  {
        Object o = map.get(key);
        if(o instanceof Boolean) {
            return (Boolean) o;
        }
        return defaultValue;
    }

    public <T> T getObject(String key, Class<T> type)  {
        Object o = map.get(key);
        if(type.isInstance(o)) {
            return type.cast(o);
        }
        return null;
    }

    private JMultiplatform() {
        map = new HashMap<>();
    }
}