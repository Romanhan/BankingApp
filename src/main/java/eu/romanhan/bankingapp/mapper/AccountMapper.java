package eu.romanhan.bankingapp.mapper;

import eu.romanhan.bankingapp.dto.AccountDto;
import eu.romanhan.bankingapp.entity.Account;

public class AccountMapper {

	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(accountDto.getId(), accountDto.getAccountHolderName(), accountDto.getBalance());

		return account;
	}

	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(account.getId(), account.getAccountHolderName(), account.getBalance());

		return accountDto;
	}

}
