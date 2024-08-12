package in.bailochan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bailochan.entity.Orders;

public interface OrdersRepository  extends JpaRepository<Orders,Integer>{

	public List<Orders> findByUserID(Integer userId);
	public List<Orders> findByOrderDateAndOrderStatus(String orderDate,String orderStatus);
}
