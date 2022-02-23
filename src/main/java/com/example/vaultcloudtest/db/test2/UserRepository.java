package com.example.vaultcloudtest.db.test2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User  findByName(String cle);
}
