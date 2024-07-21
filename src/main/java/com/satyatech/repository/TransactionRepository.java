package com.satyatech.repository;
import org.springframework.data.repository.CrudRepository;

import com.satyatech.model.Transaction;
public interface TransactionRepository extends CrudRepository<Transaction, Integer>
{
}
