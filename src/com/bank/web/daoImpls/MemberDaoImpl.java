package com.bank.web.daoImpls;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bank.web.daos.MemberDao;
import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.pool.Constants;
public class MemberDaoImpl implements MemberDao{
		
	@Override
	public void insertCustomer(CustomerBean param) {
		
		try {
			File file = new File(Constants.FILE_PATH+"customers0905.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("%s,%s,%s,%s,%s"
					,param.getId()
					,param.getPw()
					,param.getName()
					,param.getSsn()
					,param.getCredit()));
			writer.newLine();
			writer.flush();
			writer.close();
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
		CustomerBean cus = null;
			try {
				File file = new File(Constants.FILE_PATH+"customers0905.txt");
				@SuppressWarnings("resource")
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String[] user = reader.readLine().split(",");
				if(user[0].equals(param.getId())&&
						user[1].equals(param.getPw())) {
					cus = new CustomerBean();
					cus.setId(user[0]);
					cus.setPw(user[1]);
					cus.setName(user[2]);
					cus.setSsn(user[3]);
					cus.setCredit(user[4]);
				}
	
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cus;
	}

}


