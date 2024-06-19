package com.jee.micro.account.repository;

import com.jee.micro.account.model.Accounts;
import com.jee.micro.account.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Accounts,Long> {
    void deleteByCustomerId(Long customerId);

    Optional<Accounts> findByCustomerId(Long customerId);
}
