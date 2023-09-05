package com.care.root;

import javax.inject.Inject;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


	
@Service
public class MemberService {
	
	//@Autowired
	//MemberDAO ddd;
	
	@Inject
	@Qualifier("ddd")
	MemberDAO dao;
	
	public MemberService() {
		System.out.println("service");
	}
	
	public void test() {
		System.out.println("svr test¿¬µ¿");
		dao.test();
	}
	
	public MemberDTO result() {
		return dao.result();
	}
}
