package com.bank.web.daoImpls;
import java.io.File;

import com.bank.web.daos.MemberDao;
import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.pool.Constants;
public class MemberDaoImpl implements MemberDao{
	
	@Override
	public void insertCustomer(CustomerBean param) {
		try {
			File file = new File(Constants.FILE_PATH+"customers0905.txt");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void insertEmployee(EmployeeBean param) {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public CustomerBean login(CustomerBean param) {
		// TODO Auto-generated method stub
		return null;
	}

}


