package org.apache.ibatis.demo.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.demo.domain.Role;

import java.util.List;

public interface RoleMapper {

  Role selectById(long id);

  List<Role> selectAllRole();

  List<Role> selectByIds(@Param("ids") List<Long> ids);

  int deleteById(long id);

  int insertRole(Role role);
}
