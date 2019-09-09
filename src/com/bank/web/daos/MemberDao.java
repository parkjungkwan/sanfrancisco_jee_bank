package com.bank.web.daos;

import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;

public interface MemberDao {
	public void insertCustomer(CustomerBean param);
	public void insertEmployee(EmployeeBean param);
	public CustomerBean login(CustomerBean param);
}
