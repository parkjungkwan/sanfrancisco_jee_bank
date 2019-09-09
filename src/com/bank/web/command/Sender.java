package com.bank.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sender {
	public static void forward(HttpServletRequest request, 
			HttpServletResponse response){
		System.out.println("캐리어내부 : "+Receiver.cmd.getView());
		try {
			request.getRequestDispatcher(Receiver.cmd.getView())
					.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
