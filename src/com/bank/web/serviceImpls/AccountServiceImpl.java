package com.bank.web.serviceImpls;

import com.bank.web.domains.AccountBean;
import com.bank.web.services.AccountService;
import java.util.List;
import java.util.ArrayList;

public class AccountServiceImpl implements AccountService{
	private List<AccountBean> accounts;
	
	public AccountServiceImpl() {
		accounts = new ArrayList<>();
	}
	
	@Override
	public void createAccount(String money) {
		AccountBean a = new AccountBean();
		a.setAccountNum(createAccountNum());
		a.setMoney(money);
		a.setRegDate(findDate());
		System.out.println(a.toString());
		accounts.add(a);
	}

	@Override
	public String createAccountNum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> findAll() {
		// TODO Auto-generated method stub
		return accounts;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccounts() {
		// TODO Auto-generated method stub
		return accounts.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void depositMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}
