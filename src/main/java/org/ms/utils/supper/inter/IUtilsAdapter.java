package org.ms.utils.supper.inter;

public class IUtilsAdapter  implements IUtils{


    @Override
    public IFileUtils getFileUtils() {
        return null;
    }

    @Override
    public IGsonUtils getGsonUtils() {
        return null;
    }

    @Override
    public IEncryptionUtils getEncryptionUtils() {
        return null;
    }

    @Override
    public IMD5Utils getMD5Utils() {
        return null;
    }
}
