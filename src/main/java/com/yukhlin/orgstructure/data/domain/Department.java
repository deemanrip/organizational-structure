package com.yukhlin.orgstructure.data.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Department {

    private Long id;
    private UUID externalId;
    private String name;
    private LocalDate creationDate;
}