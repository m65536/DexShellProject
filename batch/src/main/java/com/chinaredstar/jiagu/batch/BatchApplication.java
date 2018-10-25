package com.chinaredstar.jiagu.batch;

import brut.androlib.AndrolibException;
import brut.androlib.ApkDecoder;
import brut.directory.DirectoryException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class BatchApplication {
    private static final Logger logger = LoggerFactory.getLogger(BatchApplication.class);


    public static void main(String[] args) throws AndrolibException, IOException, DirectoryException {
        logger.info("main started!");

        File inFile = new File("D:\\adobe.apk");
        ApkDecoder decoder = new ApkDecoder();
        decoder.setOutDir(new File("D:\\apktool"));
        decoder.setApkFile(inFile);
        decoder.decode();


    }
}
