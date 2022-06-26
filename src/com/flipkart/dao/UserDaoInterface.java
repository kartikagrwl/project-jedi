package com.flipkart.dao;

public interface UserDaoInterface {

    /**
     * Method to update password
     * @param userId
     * @param newPassword
     * @return  void
     */
    public void updatePassword(String userId, String newPassword);

    /**
     * Method to check login user
     * @param userID
     * @param password
     * @return  boolean
     */
    public boolean loginUser(String userID, String password);
}
