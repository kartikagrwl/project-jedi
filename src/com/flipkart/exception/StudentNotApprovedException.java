package com.flipkart.exception;

/**
 * Exception thrown when student is not approval
 *
 */
public class StudentNotApprovedException extends Exception{

    private int studentId;

    // method to check for student approval
    public StudentNotApprovedException(Integer studentId) {
        this.studentId=studentId;
    }


    // method to get student ID
    public int getStudentId() {
        return studentId;
    }

    // method to update student id
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String getMessage() {
        return "Student "+ studentId +" is not approved!!";
    }
}
