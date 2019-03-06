package com.evgen.timetable.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.evgen.timetable.model.entity.Role;
import com.evgen.timetable.model.entity.UserRole;

@Mapper(componentModel = "spring")
public interface UserRoleMapper {

  @Mapping(target = "roleName", source = "role.roleName")
  Role userRoleToRole(UserRole userRole);

}