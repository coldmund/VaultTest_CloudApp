package com.example.vaultcloudtest;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import com.example.vaultcloudtest.domain.TestKv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.vault.core.VaultTemplate;

@Component
public class VaultService {

    @Autowired
    TestKvRepository    testKvRepository;

    @Autowired
    VaultTemplate   vaultTemplate;

    // test KV version 1
    public String   testKv1(String str) {
        Map<String, String> in = new HashMap<String, String>();
        in.put("testKey", str);

        vaultTemplate.write("test1/test11", in);

        String  result = (String)vaultTemplate.read("test1/test11", HashMap.class).getData().get("testKey");
        System.out.println(result);

        // vaultTemplate.delete("secret/myapp");

        return  result;
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
