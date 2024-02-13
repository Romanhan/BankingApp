package eu.romanhan.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.romanhan.bankingapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
