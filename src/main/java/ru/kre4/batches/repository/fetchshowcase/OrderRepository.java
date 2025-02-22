package ru.kre4.batches.repository.fetchshowcase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kre4.batches.entity.fetchshwcase.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
