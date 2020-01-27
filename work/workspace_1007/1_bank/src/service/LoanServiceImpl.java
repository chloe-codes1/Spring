package service;

import java.util.List;

import dao.LoanDAO;
import vo.LoanVO;

public class LoanServiceImpl implements LoanService{

	
	LoanDAO dao;

	public LoanServiceImpl() {}
	
	public LoanServiceImpl(LoanDAO dao) {
		super();
		this.dao = dao;
	}

	public LoanDAO getDao() {
		return dao;
	}

	public void setDao(LoanDAO dao) {
		this.dao = dao;
	}

	@Override
	public int openAccount(LoanVO vo) {
		return dao.openAccount(vo);
	}
	
	@Override
	public List<LoanVO> loansearch(String accountNumber, String username){
		return dao.loansearch(accountNumber, username);
	}
}