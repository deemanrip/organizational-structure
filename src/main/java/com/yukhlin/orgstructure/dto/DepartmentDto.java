package com.yukhlin.orgstructure.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class DepartmentDto {

    private String id;
    private String name;
    private LocalDate creationDate;

}