package com.cspark.jwt_boot.mapper;

import com.cspark.jwt_boot.model.Authentication;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthenticationMapper {
    @Select("SELECT * FROM authentication WHERE username = #{username} AND password = #{password}")
    Authentication findByUsernameAndPassword(String username, String password);

    Authentication selectAuthenticationByUsername(@Param("username") String username);

    void insertAuthentication(Authentication authentication);
}
