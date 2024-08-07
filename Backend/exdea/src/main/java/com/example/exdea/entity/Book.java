package com.example.exdea.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookID;
    private String bookTitle;
    private String isbn;
    private BigDecimal bookPrice;
    private LocalDate publishedDate;
    private int authID;
    private int publisherID;
    private int categoryID;
}
