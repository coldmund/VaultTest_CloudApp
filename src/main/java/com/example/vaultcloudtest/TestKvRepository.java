package com.example.vaultcloudtest;

import com.example.vaultcloudtest.domain.TestKv;

import org.springframework.data.repository.CrudRepository;

public interface TestKvRepository extends CrudRepository<TestKv, Long> {
    public TestKv  findByCle(String cle);
}
