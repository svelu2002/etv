package com.bookstoreapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @NotBlank(message = "Id is required")
    private int id;

    @Column(unique=true, nullable = false)
    @NotBlank(message = "Title is required")
    @NotNull(message = "Title is missing")
    private String title;

    @Column(length=100, nullable = false)
    @NotBlank(message = "Author is required")
    private String author;

    @Column(name="publication_year", nullable = false)
    private int publicationYear;

    @Column(nullable = false)
    @NotBlank(message = "ISBN is required")
    private long isbn;

    @Column(nullable = false)
    @NotBlank(message = "Price is required")
    private double price;

}
