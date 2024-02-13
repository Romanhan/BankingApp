package eu.romanhan.bankingapp.service;

import eu.romanhan.bankingapp.dto.AccountDto;

public interface AccountService {

	AccountDto createAccount(AccountDto accountDto);

	AccountDto getAccountById(Long id);

	AccountDto deposit(Long id, double amount);
}
