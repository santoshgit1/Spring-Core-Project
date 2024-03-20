package com.emexo.xml.autowiring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loan {
    private static final Logger logger = LogManager.getLogger(Loan.class);

    private int loanId;
    private String loanType;

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public void getLoanDetails(){
        logger.info("Loan Details:loanId:{} and loanType:{}", loanId, loanType);
    }
}
