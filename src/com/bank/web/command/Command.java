package com.bank.web.command;

import javax.servlet.http.HttpServletRequest;
import com.bank.web.pool.Constants;
import lombok.Data;
@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action, domain, page, view;
	
	@Override
	public void execute(){
		this.view = String.format(Constants.VIEW_PATH, domain, page);		
	}
}
