package service;

import java.util.List;

import vo.SavingVO;

public interface SavingService {
	public String openAccount(SavingVO vo);
	public List<SavingVO> savingsearch(String accountNumber, String username);
}
