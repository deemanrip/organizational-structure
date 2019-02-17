package com.yukhlin.orgstructure.entitydtomapper;

import com.yukhlin.orgstructure.data.domain.Department;
import com.yukhlin.orgstructure.dto.DepartmentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = UUIDMapper.class)
public interface DepartmentMapper {

    @Mapping(source = "externalId", target = "id")
    DepartmentDto departmentToDepartmentDto(Department department);

    @Mappings({
            @Mapping(source = "id", target = "externalId"),
            @Mapping(target = "id", ignore = true)
    })
    Department departmentDtoToDepartment(DepartmentDto departmentDto);

}