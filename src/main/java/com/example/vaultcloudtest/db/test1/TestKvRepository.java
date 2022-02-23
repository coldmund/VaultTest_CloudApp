package com.example.vaultcloudtest.db.test1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestKvRepository extends JpaRepository<TestKv, Long> {
    public TestKv  findByCle(String cle);
}
