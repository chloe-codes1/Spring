package service;

import java.util.List;

import dao.SavingDAO;
import vo.SavingVO;

public class SavingServiceImpl implements SavingService{

	
	SavingDAO dao;
	
	public SavingServiceImpl() {}
	
	
	public SavingServiceImpl(SavingDAO dao) {
		super();
		this.dao = dao;
	}


	public SavingDAO getDao() {
		return dao;
	}


	public void setDao(SavingDAO dao) {
		this.dao = dao;
	}


	@Override
	public String openAccount(SavingVO vo) {
		return dao.openAccount(vo);
	}

	@Override
	public List<SavingVO> savingsearch(String accountNumber, String username){
		
		return dao.savingsearch(accountNumber, username);
	}
	
}
