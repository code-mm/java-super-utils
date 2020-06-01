package org.ms.utils.supper;

import org.ms.utils.supper.inter.IUtils;
import org.ms.utils.supper.inter.IUtilsAdapter;

public class SupperUtilsClient {

    private static IUtils utils;

    public static IUtils getUtils() {
        if (utils == null) {
            try {
                Class<?> aClass = Class.forName("org.ms.utils.impl.UtilsImpl");

                if (aClass != null) {
                    Object instance = null;
                    try {
                        instance = aClass.newInstance();
                        if (instance != null) {
                            if (instance instanceof IUtils) {
                                utils = (IUtils) instance;
                                if (utils != null) {
                                    return utils;
                                } else {
                                    utils = new IUtilsAdapter();
                                    return utils;
                                }
                            }
                        }
                    } catch (InstantiationException e) {
                        utils = new IUtilsAdapter();
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        utils = new IUtilsAdapter();
                        e.printStackTrace();
                    }
                } else {
                    utils = new IUtilsAdapter();
                }
            } catch (ClassNotFoundException e) {
                utils = new IUtilsAdapter();
                e.printStackTrace();
            }
        }
        return utils;
    }
}
