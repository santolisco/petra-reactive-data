package com.bat.petra.data.common.repository;

import com.bat.petra.data.common.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
