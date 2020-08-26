package com.frankie.demo.transaction;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

/**
 * @author: Yao Frankie
 * @date: 2020/8/25 19:09
 */
@Service
public interface UserMapper {

    @Insert("insert into user " +
            "(id,name,age,phone,create_time) " +
            "values (#{id},#{name},#{age},#{phone},#{createTime})")
    int insert(User user);


    @Update("update user set age=#{age} where id=#{id}")
    void update(User user);

    @Select("select id,name,age,phone,create_time from user where id = #{id}")
    User get(long id);
}
