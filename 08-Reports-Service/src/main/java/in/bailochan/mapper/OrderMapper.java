package in.bailochan.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import in.bailochan.dto.OrderDto;
import in.bailochan.entity.Order;

@Component
public class OrderMapper {

	private static final ModelMapper mapper = new ModelMapper();

	public static OrderDto convertToDto(Order order) {
		return mapper.map(order, OrderDto.class);
	}

	public static Order convertToEntity(OrderDto orderDto) {
		return mapper.map(orderDto, Order.class);
	}

}
