package com.wangbin.thread;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * 单线程,多线程下载.
 * Created by wangbin on 2018/02/14.
 */
public class Download {

    public static void main(String[] args) throws Exception {

        URL[] urls = {
                new URL("http://openhome.cc/Gossip/Encoding/"),
                new URL("http://openhome.cc/Gossip/Scala/"),
                new URL("http://openhome.cc/Gossip/JavaScript/"),
                new URL("http://openhome.cc/Gossip/Python/")
        };

        String[] fileName = {
                "file/Encoding.html",
                "file/Scala.html",
                "file/JavaScript.html",
                "file/Python.html"
        };

        // 单线程
        /*for (int i = 0; i < urls.length; i++) {
            dump(urls[i].openStream(), new FileOutputStream(fileName[i]));
        }*/

        // 多线程
        for (int j = 0; j < urls.length; j++) {
            int index = j;
            new Thread(() -> {
                try {
                    dump(urls[index].openStream(), new FileOutputStream(fileName[index]));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }

    private static void dump(InputStream src, OutputStream dest) {

        InputStream input = src;
        OutputStream output = dest;

        byte[] data = new byte[1024];
        int length;
        try {
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
