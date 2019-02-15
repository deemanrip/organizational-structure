package com.yukhlin.orgstructure.entitydtomapper;

import com.yukhlin.orgstructure.data.domain.Department;
import com.yukhlin.orgstructure.dto.DepartmentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = UUIDMapper.class)
public interface DepartmentMapper {

    @Mapping(source = "externalId", target = "id")
    DepartmentDto departmentToDepartmentDto(Department department);

}