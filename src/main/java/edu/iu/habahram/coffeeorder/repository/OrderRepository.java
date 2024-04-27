package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderData, String> {
}
