package com.flipkart.dao;
import java.sql.SQLException;
import java.util.*;
import com.flipkart.bean.Course;
import com.flipkart.bean.RegisteredStudents;
import com.flipkart.bean.Student;
import com.flipkart.exception.CourseExistsInCartException;
import com.flipkart.exception.GradeNotAddedException;
import com.flipkart.exception.NoStudentInCourseException;
import com.flipkart.exception.StudentNotRegisteredException;

public interface ProfessorDaoInterface {

    /**
     * Method to get registered students
     * @param courseID
     * @param professorID
     * @throws NoStudentInCourseException
     * @return  list
     */
    public List<RegisteredStudents> getRegisteredStudents(String professorID, String courseID) throws NoStudentInCourseException;

    /**
     * Method to check grade exception
     * @param studentId
     * @param grade
     * @param courseID
     * @return  boolean
     */
    public Boolean addGrade(String studentId,String courseID,String grade) throws GradeNotAddedException,StudentNotRegisteredException, SQLException;

    /**
     * Method to view available courses
     * @return  list
     */
    public List<Course> viewAvailableCourses();

    /**
     * Method to check for register course
     * @param professorID
     * @param courseID
     * @return  boolean
     */
    public boolean registerCourse(String professorID, String courseID) throws CourseExistsInCartException;
}


