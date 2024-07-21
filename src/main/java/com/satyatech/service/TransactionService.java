package com.satyatech.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satyatech.model.Transaction;
import com.satyatech.repository.TransactionRepository;
//defining the business logic
@Service
public class TransactionService 
{
@Autowired
TransactionRepository booksRepository;
//getting all books record by using the method findaAll() of CrudRepository
public List<Transaction> getAllBooks() 
{
List<Transaction> books = new ArrayList<Transaction>();
booksRepository.findAll().forEach(books1 -> books.add(books1));
return books;
}
//getting a specific record by using the method findById() of CrudRepository
public Transaction getBooksById(int id) 
{
return booksRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Transaction books) 
{
booksRepository.save(books);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
booksRepository.deleteById(id);
}
//updating a record
public void update(Transaction books, int bookid) 
{
booksRepository.save(books);
}
}