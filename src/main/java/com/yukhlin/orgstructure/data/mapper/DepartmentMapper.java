package com.yukhlin.orgstructure.data.mapper;

import com.yukhlin.orgstructure.data.domain.Department;
import com.yukhlin.orgstructure.data.typehandler.UUIDTypeHandler;
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

    //TODO UUID should also been initialized in object after insertion
    @SelectKey(statement = "select lastval()", keyProperty = "id", before = false, resultType = Long.class)
    @Insert("insert into org_structure_schema.department(external_id, name, creation_date) " +
            "values (#{externalId, typeHandler = com.yukhlin.orgstructure.data.typehandler.UUIDTypeHandler}, " +
            "#{name}, #{creationDate})")
    void saveDepartment(Department department);

    @Update("update org_structure_schema.department " +
            "set name = #{name}, creation_date = #{creationDate} " +
            "where external_id = #{externalId, typeHandler = com.yukhlin.orgstructure.data.typehandler.UUIDTypeHandler}")
    void updateDepartment(Department department);

    @Delete("delete from org_structure_schema.department where external_id = #{externalId}")
    void deleteDepartment(@Param("externalId") UUID externalId);

}