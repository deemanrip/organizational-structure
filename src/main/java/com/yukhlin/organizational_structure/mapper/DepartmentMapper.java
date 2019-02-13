package com.yukhlin.organizational_structure.mapper;

import com.yukhlin.organizational_structure.domain.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {

    @Results(
            id = "Department",
            value = {
            @Result(column = "id", property = "id", id = true),
            @Result(column = "external_id", property = "externalId"),
            @Result(column = "name", property = "name"),
            @Result(column = "creation_date", property = "creationDate")
    })
    @Select("select * from org_structure_schema.department where id = #{id}")
    Department findById(@Param("id") Long id);

    @ResultMap("Department")
    @Select("select * from org_structure_schema.department")
    List<Department> findDepartments();

}
