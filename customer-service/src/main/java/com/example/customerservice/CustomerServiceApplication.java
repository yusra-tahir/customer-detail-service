package com.example.customerservice;

import com.example.entity.Detail;
import com.example.persistence.CustomerDao;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages =  "com.example")
@EntityScan(basePackages = "com.example.entity")
@EnableJpaRepositories(basePackages = "com.example.persistence")
public class CustomerServiceApplication /* implements CommandLineRunner */{

//	@Autowired
//	CustomerDao customerDao;

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		customerDao.save(new Detail(1, 101, 101, "Intra-day", 3));
//		customerDao.save(new Detail(2, 101, 102, "Intra-day", 5));
//		customerDao.save(new Detail(3, 101, 103, "Long term holding", 10));
//		customerDao.save(new Detail(4, 102, 104, "Long term holding", 50));
//		customerDao.save(new Detail(5, 102, 105, "Intra-day", 30));
//		customerDao.save(new Detail(6, 103, 101, "Long term holding", 100));
//	}
}
