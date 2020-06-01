package org.ms.utils.supper.inter;

public interface IGsonUtils {

    String toJson(Object obj);

    <T> T fromJson(String json, Class<T> classOfT);

}
