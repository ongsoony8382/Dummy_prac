package kr.co.wikibook.youbank.application;

import kr.co.wikibook.youbank.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
