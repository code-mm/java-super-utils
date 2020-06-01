package org.ms.utils.supper.inter;

import java.io.File;

public interface IFileUtils {

    void mkdir(String path);

    void mkdir(File file);

    void mkdirs(String path);

    void mkdirs(File file);

    void createNewFile(String path);

    void createNewFile(File file);

    void copyFile(String srcPath, String tagPath);

    void copyFile(File srcFile, File tagFile);

    void deleteFile(String path);

    void deleteFile(File file);

    byte[] getBytesByFile(String filePath);

    void getFileByBytes(byte[] bytes, String filePath, String fileName);

}
