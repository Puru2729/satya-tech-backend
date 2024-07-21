package com.satyatech.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satyatech.model.Transaction;
import com.satyatech.service.TransactionService;
//mark class as Controller
@RestController
public class TransactionController 
{
//autowire the BooksService class
@Autowired
TransactionService booksService;
//creating a get mapping that retrieves all the books detail from the database 
@GetMapping("/book")
private List<Transaction> getAllBooks() 
{
return booksService.getAllBooks();
}
//creating a get mapping that retrieves the detail of a specific book
@GetMapping("/book/{bookid}")
private Transaction getBooks(@PathVariable("bookid") int bookid) 
{
return booksService.getBooksById(bookid);
}
//creating a delete mapping that deletes a specified book
@DeleteMapping("/book/{bookid}")
private void deleteBook(@PathVariable("bookid") int bookid) 
{
booksService.delete(bookid);
}
//creating post mapping that post the book detail in the database
@PostMapping("/books")
private int saveBook(@RequestBody Transaction books) 
{
booksService.saveOrUpdate(books);
return books.getBookid();
}
//creating put mapping that updates the book detail 
@PutMapping("/books")
private Transaction update(@RequestBody Transaction books) 
{
booksService.saveOrUpdate(books);
return books;
}
}
