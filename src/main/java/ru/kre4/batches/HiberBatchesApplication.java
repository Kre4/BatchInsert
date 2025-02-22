package ru.kre4.batches;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kre4.batches.entity.fetchshwcase.Order;
import ru.kre4.batches.repository.fetchshowcase.CustomerRepository;
import ru.kre4.batches.repository.fetchshowcase.OrderRepository;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
public class HiberBatchesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HiberBatchesApplication.class, args);
    }
    @Autowired
    private final CustomerRepository customerRepository;
    @Autowired
    private final OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("\n--Selecting all orders--");
        List<Order> order = orderRepository.findAll();
        log.info("Selecting all customers");
        customerRepository.findAll();
    }
}
