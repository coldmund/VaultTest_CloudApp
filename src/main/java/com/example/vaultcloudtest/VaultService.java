package com.example.vaultcloudtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VaultService {

    @Autowired
    TestKvRepository    testKvRepository;

    // test KV version 1
    public String   testKv1(String str) {
        return  "TBD";
    }

    // test KV version 2 - put/get
    public String   testKv2(String str) {
        return  "TBD";
    }

    // test KV version 2 - patch/get
    public String   testKv3(String str) {
        return  "TBD";
    }

    public String   testEnc(String str) {
        return  "TBD";
    }

    public String   testDec(String str) {
        return  "TBD";
    }

    public String   testDb(String str) {
        return  "TBD";
    }
}
