package com.thegrizzlylabs.sardineandroid;

import com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Main {
    @Test
    public  void main() throws IOException {
        Sardine sardine = new OkHttpSardine();
        sardine.setCredentials("admin", "101010");

        List<DavResource> resources = sardine.list("http://home.laigc.com:20080/");
        for (DavResource davResource:resources){

            System.out.println(davResource);
        }
    }
}
