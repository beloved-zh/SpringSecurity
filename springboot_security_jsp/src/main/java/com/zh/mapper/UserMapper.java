package com.zh.mapper;

import com.zh.pojo.SysUser;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<SysUser> {

    @Select("select * from sys_user where username=#{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class,
                    many = @Many(select = "com.zh.mapper.RoleMapper.findByUid"))
    })
    public SysUser findByUsername(String username);

    @Insert("insert into sys_user (username, password) values (#{username}, #{password})")
    public void save(SysUser user);

    @Select("select * from sys_user")
    public List<SysUser> findAll();

    @Select("SELECT r.id FROM sys_role r, sys_user_role ur " +
            "WHERE ur.rid=r.id AND ur.uid=#{uid}")
    public List<Integer> findRolesByUid(Integer id);

    @Delete("delete from sys_user_role where uid=#{userId}")
    public void removeRoles(Integer userId);

    @Insert("insert into sys_user_role values (#{uid}, #{rid})")
    public void addRoles(@Param("uid") Integer userId, @Param("rid") Integer rid);
}
