package in.bailochan.Service;

import java.time.LocalDate;
import java.util.List;

import in.bailochan.dto.OrderDto;
import in.bailochan.entity.Order;
import in.bailochan.entity.OrderStatus;

public interface ReportsService {

	public List<OrderDto> getAllOrders();
	
	public List<OrderDto> orderByStatus(OrderStatus status);
	public List<OrderDto> getOrdersBetweenDate(LocalDate startDate , LocalDate endDate);
}
