package org.apache.ibatis.demo.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.demo.domain.Role;

import java.util.List;

public interface RoleMapper {

    Role getRole(long id);

    List<Role> getRole3(String roleName);

    int deleteRole(long id);

    int insertRole(Role role);

    List<Role> findRoles(@Param("roleName") String roleName);

    List<Role> findRoles2(Role role);

    List<Role> findRoles3(List<Integer> idList);

    List<Role> findRoles4(@Param("type") String str);

    List<Role> findAllRoles();

    int updateRole(Role role);
}
