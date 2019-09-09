package com.bank.web.serviceImpls;

import java.util.ArrayList;
import java.util.List;

import com.bank.web.daoImpls.MemberDaoImpl;
import com.bank.web.daos.MemberDao;
import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.domains.MemberBean;
import com.bank.web.services.MemberService;


public class MemberServiceImpl implements MemberService{
	private MemberDao dao;
	
	public MemberServiceImpl() {
		dao = new MemberDaoImpl();
	}


	@Override
	public void join(CustomerBean param) {
		dao.insertCustomer(param);
	}
	
	@Override
	public CustomerBean login(CustomerBean param) {
		return dao.login(param);
	}

	
}
