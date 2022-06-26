package com.flipkart.dao;
import com.flipkart.bean.FeePayment;
import com.flipkart.exception.PaymentDoneException;
import com.flipkart.exception.PaymentFailedException;

public interface PaymentDaoInterface {

    /**
     * Method to make payment
     * @param payment
     * @return  void
     */
    public void makePayment(FeePayment payment) throws PaymentFailedException, PaymentDoneException;
}
