package in.bailochan.service;

import java.util.List;

import in.bailochan.entity.Role;

public interface RoleService {
	
	public Role createRole(Role role);
	
	public List<Role> getAllRoles(Role role);
	
	public Role getRoleById(Integer roleId);
	
	public Role deleteRoleById(Integer roleId);
}
