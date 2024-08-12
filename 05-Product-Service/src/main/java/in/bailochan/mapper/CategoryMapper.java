package in.bailochan.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import in.bailochan.dto.CategoryDto;
import in.bailochan.entity.Category;


@Component
public class CategoryMapper {

	private static final ModelMapper mapper = new ModelMapper();

	public static CategoryDto convertToDto(Category category) {
		return mapper.map(category, CategoryDto.class);
	}

	public static Category convertToEntity(CategoryDto categoryDto) {
		return mapper.map(categoryDto, Category.class);
	}
}
