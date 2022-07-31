package com.graphql.practice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Book {
    @Id
    private String id;
    private String title;
    private String publisher;
    private String[] authors;
    private String publishedDate;
}
