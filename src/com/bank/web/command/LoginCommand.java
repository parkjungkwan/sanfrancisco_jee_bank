package com.bank.web.command;

import javax.servlet.http.HttpServletRequest;

import com.bank.web.domains.CustomerBean;
import com.bank.web.serviceImpls.MemberServiceImpl;
import com.bank.web.services.MemberService;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request)throws Exception {
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
		super.execute();
		CustomerBean param = new CustomerBean();
		MemberService service = new MemberServiceImpl();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		param.setId(id);
		param.setPw(pw);
		System.out.printf("로그인 서비스 진입 후 아이디 %s , 비번 %s", id, pw);
		CustomerBean cust = service.login(param);
		if(cust == null) {
			System.out.println("\n========= cust null ==============");
			request.setAttribute("LOGIN", "FAIL");
		}else {
			request.setAttribute( "customer",cust);
			request.setAttribute("LOGIN", "SUCCESS");
		}
	}
}
