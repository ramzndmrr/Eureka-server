package com.kitaplik.bookservice.model

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
@Table(name = "books")
data class Book @JvmOverloads constructor(
        @Id
        @Column(name = "book_id")
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID" , strategy = "org.hibernate.id.UUIDGenerator")
        val id: String? = "",
        val title:String,
        val bookYear:Int,
        val author:String,
        val pressName:String,
        val isbn:String
)
