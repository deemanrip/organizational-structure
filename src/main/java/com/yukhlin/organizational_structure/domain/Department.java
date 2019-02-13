package com.yukhlin.organizational_structure.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Department {

    private Long id;
    private String externalId;
    private String name;
    private LocalDate creationDate;
}