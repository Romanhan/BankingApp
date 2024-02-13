package eu.romanhan.bankingapp.service.impl;

import org.springframework.stereotype.Service;

import eu.romanhan.bankingapp.dto.AccountDto;
import eu.romanhan.bankingapp.entity.Account;
import eu.romanhan.bankingapp.mapper.AccountMapper;
import eu.romanhan.bankingapp.repository.AccountRepository;
import eu.romanhan.bankingapp.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccountById(Long id) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Account does not exists"));
		return AccountMapper.mapToAccountDto(account);
	}

	@Override
	public AccountDto deposit(Long id, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
