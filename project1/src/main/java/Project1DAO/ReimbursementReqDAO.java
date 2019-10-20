package Project1DAO;

import java.util.List;

import Models.ReimbursementReq;

public interface ReimbursementReqDAO {
	
	public ReimbursementReq setPendingRequests(String first_name, String last_name, int reimbursement_amount,
			String reimbursement_type); 
	
	public List<ReimbursementReq> getPendingRequests();
}