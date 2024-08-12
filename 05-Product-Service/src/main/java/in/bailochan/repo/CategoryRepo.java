package in.bailochan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bailochan.entity.Category;
import jakarta.validation.constraints.AssertFalse.List;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

	public Category getById(Integer categoryId);
	
}
