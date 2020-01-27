package service;

import java.util.List;

import vo.LoanVO;

public interface LoanService {
	public int openAccount(LoanVO vo);
	public List<LoanVO> loansearch(String accountNumber, String username);
}
