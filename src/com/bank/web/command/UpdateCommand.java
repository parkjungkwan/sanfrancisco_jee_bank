package com.bank.web.command;

import javax.servlet.http.HttpServletRequest;

public class UpdateCommand extends MoveCommand{

	public UpdateCommand(HttpServletRequest request) throws Exception {
		super(request);
	}
	@Override
	public void execute() {
		super.execute();
		
	}

}
