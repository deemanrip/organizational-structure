package com.yukhlin.organizational_structure.data.mapper;

import com.yukhlin.organizational_structure.data.domain.Department;
import com.yukhlin.organizational_structure.data.typehandler.UUIDTypeHandler;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Mapper
@Repository
public interface DepartmentMapper {

    @Results(
            id = "Department",
            value = {
            @Result(column = "id", property = "id", id = true),
            @Result(column = "external_id", property = "externalId", typeHandler = UUIDTypeHandler.class),
            @Result(column = "name", property = "name"),
            @Result(column = "creation_date", property = "creationDate")
    })
    @Select("select * from org_structure_schema.department where id = #{id}")
    Department findById(@Param("id") Long id);

    @ResultMap("Department")
    @Select("select * from org_structure_schema.department where external_id = #{externalId}")
    Department findByExternalId(@Param("externalId") UUID externalId);

    @ResultMap("Department")
    @Select("select * from org_structure_schema.department")
    List<Department> findDepartments();

}