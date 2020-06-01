package org.ms.utils.impl;

import com.google.gson.Gson;
import org.ms.utils.supper.inter.IGsonUtils;

public class GsonUtilsImpl implements IGsonUtils {


    private static final Gson gson = new Gson();

    @Override
    public String toJson(Object obj) {
        return gson.toJson(obj);
    }

    @Override
    public <T> T fromJson(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }
}
