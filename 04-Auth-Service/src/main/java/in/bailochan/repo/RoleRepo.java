package in.bailochan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bailochan.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{
	

}
