package com.flipkart.dao;
import com.flipkart.bean.Notification;
import java.sql.SQLException;


public interface NotificationDaoInterface {
   // public Boolean sendPaymentCompleteNotification(String transactionID, String studentid);
    /**
     * Method to get new transaction id
     * @return  newTransactionID
     */
    public String getNewTransactionID();
}
