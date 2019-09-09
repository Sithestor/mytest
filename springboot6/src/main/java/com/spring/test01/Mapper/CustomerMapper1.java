package com.spring.test01.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerMapper1 {

    @Insert("insert into t_customer (id,age,name)values(null,#{age},#{name})")
    public void insert(@Param("age") Integer age,@Param("name") String name);
}
