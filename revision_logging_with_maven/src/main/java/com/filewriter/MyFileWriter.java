package com.filewriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.LogManager;

public class MyFileWriter {

    final static Logger logger = LoggerFactory.getLogger(MyFileWriter.class.getName());

    public void write(String data) {
        try {
            FileWriter fw = new FileWriter(new File("myFile.txt"));
            fw.write(data);
            fw.close();
        } catch (IOException e) {
            logger.info("Unable to open file.", e);
        }
    }
}
