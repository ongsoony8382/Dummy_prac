package kr.co.wikibook.youbank.application;

import kr.co.wikibook.youbank.Dummy;
import kr.co.wikibook.youbank.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BankAccountDummy extends Dummy {

    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void insOneByOne() { //한 명의 고객은 하나의 계좌를 갖는다.
        List<Customer> customerList = customerRepository.findAll();
        for (Customer c : customerList) {

            System.out.println(c);
        }

        int a = 10;
    }



}
