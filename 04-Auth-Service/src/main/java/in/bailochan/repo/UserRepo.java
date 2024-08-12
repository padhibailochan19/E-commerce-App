package in.bailochan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bailochan.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String email);

}
