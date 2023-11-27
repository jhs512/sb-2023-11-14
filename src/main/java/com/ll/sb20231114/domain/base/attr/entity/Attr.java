package com.ll.sb20231114.domain.base.attr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Attr {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
}
