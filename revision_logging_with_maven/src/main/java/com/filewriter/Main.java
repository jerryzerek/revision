package com.filewriter;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        MyFileWriter writer = new MyFileWriter();
        writer.write("Hello world");
    }
}
