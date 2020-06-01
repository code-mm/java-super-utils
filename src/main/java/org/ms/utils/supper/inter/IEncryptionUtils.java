package org.ms.utils.supper.inter;

public interface IEncryptionUtils {

    String encode(String src);

    String decode(String e64Str);
}
