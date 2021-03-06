package com.springboot.test02.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Table;

@Mapper
@Repository
@Entity
@Table(name="t_customer")
public interface CustomerMapper {
    @Insert("INSERT INTO t_customer (age,NAME)VALUES(#{age},#{name})")
     public void insert(@Param("age") Integer age, @Param("name") String name);


}
