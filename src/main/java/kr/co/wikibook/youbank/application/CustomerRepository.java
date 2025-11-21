package kr.co.wikibook.youbank.application;

import kr.co.wikibook.youbank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {}
