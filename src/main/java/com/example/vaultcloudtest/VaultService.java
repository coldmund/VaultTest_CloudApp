package com.example.vaultcloudtest;

import java.util.Base64;

import com.example.vaultcloudtest.domain.TestKv;

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
        TestKv  testKv = new TestKv(str, Base64.getEncoder().encodeToString(str.getBytes()));
        testKvRepository.save(testKv);
        return  testKvRepository.findByCle(str).getPrix();
    }
}
