package com.bank.web.services;
import com.bank.web.domains.*;
import java.util.List;
public interface MemberService {
	public void join(CustomerBean param);
	public void register(EmployeeBean param);
	public List<CustomerBean> findAllCustomers();
	public List<EmployeeBean> findAllEmployees();
	public List<MemberBean> findByName(String name); 
	public MemberBean findById(String id); 
	public CustomerBean login(MemberBean param); 
	public int countCustomers(); 
	public int countEmployees(); 
	public boolean existId(String id);
	public void updatePass(MemberBean param);
	public boolean deleteMember(MemberBean param);
}
