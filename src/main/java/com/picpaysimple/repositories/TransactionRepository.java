package com.picpaysimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.picpaysimple.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}