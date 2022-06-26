package com.flipkart.dao;
import com.flipkart.bean.Course;
import java.sql.SQLException;
import java.util.ArrayList;
import com.flipkart.exception.*;

public interface SemesterRegistrationDaoInterface {

    /**
     * Method to check for eligibility of course
     * @param studentId
     * @return  boolean
     */
    public boolean registerCourses(String studentId) throws InvalidSemesterRegistration,PaymentDoneException;

    /**
     * Method to view available courses
     * @return  arraylist
     */
    public ArrayList<Course> viewAvailableCourses();

    /**
     * Method to add course
     * @param studentId
     * @param courseId
     * @param isPrimary
     * @return  boolean
     */
    public boolean addCourse(String studentId,  String courseId, boolean isPrimary) throws CourseNotFoundException, CourseSeatsUnavailableException, CourseExistsInCartException;

    /**
     * Method to check for registered course exists
     * @param studentId
     * @param courseId
     * @return  boolean
     */
    public boolean checkRegisteredCourseExists(String studentId,  String courseId);

    /**
     * Method to check if course can be drooped
     * @param studentId
     * @param semesterId
     * @param courseId
     * @return  boolean
     */
    public boolean dropCourse(String studentId, int semesterId, String courseId)  throws CourseNotFoundException, CourseNotInCart;

    /**
     * Method to get course details
     * @param courseId
     * @return class
     */
    public Course getCourseDetails(String courseId);

    /**
     * Method to change number of seats in a course
     * @param courseId
     * @param change
     * @return  void
     */
    public void changeCourseSeats(String courseId, int change);
}
