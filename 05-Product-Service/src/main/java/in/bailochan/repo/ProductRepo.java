package in.bailochan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bailochan.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
