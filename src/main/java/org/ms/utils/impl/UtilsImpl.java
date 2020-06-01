package org.ms.utils.impl;

import org.ms.utils.supper.inter.*;

public class UtilsImpl extends IUtilsAdapter {

    @Override
    public IFileUtils getFileUtils() {
        return new FileUtilsImpl();
    }

    @Override
    public IGsonUtils getGsonUtils() {
        return new GsonUtilsImpl();
    }

    @Override
    public IEncryptionUtils getEncryptionUtils() {
        return new EncryptionUtilsImpl();
    }

    @Override
    public IMD5Utils getMD5Utils() {
        return new MD5UtilsImpl();
    }
}
