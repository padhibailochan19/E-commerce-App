package in.bailochan.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bailochan.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer>{

	 Optional<Cart> findByUserId(Integer userId);
}
