package com.bank.web.domains;

import lombok.Data;

@Data
public class CustomerBean extends MemberBean{
	private static final long serialVersionUID = 1L;
	private String credit;
}
