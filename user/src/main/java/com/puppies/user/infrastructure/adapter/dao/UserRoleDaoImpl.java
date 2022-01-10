package com.puppies.user.infrastructure.adapter.dao;

import com.puppies.security.auth.repository.RoleRepository;
import com.puppies.user.domain.model.UserRole;
import com.puppies.user.domain.port.UserRoleDao;
import com.puppies.user.infrastructure.adapter.mapper.UserRoleMapper;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserRoleDaoImpl implements UserRoleDao {

  private final RoleRepository roleRepository;
  private final UserRoleMapper mapper;

  @Override
  public Set<UserRole> getAll() {
    return mapper.toUserRoles(roleRepository.getAll());
  }
}
