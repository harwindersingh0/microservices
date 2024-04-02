package com.example.OrderService.controller;

import com.example.OrderService.entity.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // POST endpoint to place an order
    @PostMapping("/placeOrder")
    public ResponseEntity<String> placeOrder(@RequestParam String bookTitle) {
        String BOOK_SERVICE_URL = "http://localhost:8081/books/";
        ResponseEntity<String> response = restTemplate.getForEntity(BOOK_SERVICE_URL + bookTitle, String.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            // Book found, place order logic
            return ResponseEntity.ok("Order placed successfully for book: " + bookTitle);
        } else {
            // Book not found
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Book Not Found");
        }
    }
}
