package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Grade;
import com.flipkart.bean.Student;
import com.flipkart.exception.*;

import java.util.List;

public interface StudentDaoInterface {

    /**
     * Method to add student
     * @param student
     * @return  class
     */
    public Student addStudent(Student student) throws UsernameTakenException;

    /**
     * Method to view report card
     * @param StudentID
     * @throws ReportCardNotGeneratedException,GradeNotAddedException,StudentNotRegisteredException,FeesPendingException
     * @return  list
     */
    public List<Grade> viewReportCard(String StudentID) throws ReportCardNotGeneratedException, GradeNotAddedException , StudentNotApprovedException, FeesPendingException;

    /**
     * Method to check payment window
     * @param StudentID
     * @return  boolean
     */
    public Boolean checkPaymentWindow(String StudentID);

    /**
     * Method to view Registered Courses
     * @param studentID
     * @return  list
     */
    public List<Course> viewRegisteredCourses(String studentID) throws StudentNotRegisteredException;

}
