package com.bat.petra.data.repository;

import com.bat.petra.data.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
