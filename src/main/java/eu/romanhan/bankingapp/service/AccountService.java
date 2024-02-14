package eu.romanhan.bankingapp.service;

import java.util.List;

import eu.romanhan.bankingapp.dto.AccountDto;

public interface AccountService {

	AccountDto createAccount(AccountDto accountDto);

	AccountDto getAccountById(Long id);

	AccountDto deposit(Long id, double amount);

	AccountDto withdraw(Long id, double amount);

	List<AccountDto> getAllAccounts();

	void deleteAccountById(Long id);
}
