package com.yukhlin.organizational_structure.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Department {

    private Long id;
    private String name;
    private LocalDate creationDate;
}