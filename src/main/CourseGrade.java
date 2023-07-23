package main;

import util.Grade;

import java.awt.*;

public class CourseGrade {

    //Default value girildi.
    private String courseDepartment = "CENG";
    private int courseCode = 100;
    private int courseCredit = 4;
    private Grade gradeTaken = Grade.F;

    public CourseGrade(String courseDepartment) {
        this(courseDepartment, 100, 4, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode) {
        this(courseDepartment, courseCode, 4, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit) {
        this(courseDepartment, courseCode, courseCredit, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit, Grade gradeTaken) {
        this.setCourseDepartment(courseDepartment);
        this.setCourseCode(courseCode);
        this.setCourseCredit(courseCredit);
        this.setGradeTaken(gradeTaken);
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    //Girilebilecek bölüm isimleri set methodunda sınırlandırıldı
    public void setCourseDepartment(String courseDepartment) {

        String[] possibleDepartments = {"CENG", "COMP", "ECE", "ME", "MATH"};
        for (int i = 0; i < possibleDepartments.length; i++) {
            if (courseDepartment.toUpperCase().equals(possibleDepartments[i])) {
                this.courseDepartment = courseDepartment;

            }
        }

    }

    public int getCourseCode() {
        return courseCode;
    }
    //Girilebilecek CourseCode set methodunda sınırlandırıldı
    public void setCourseCode(int courseCode) {
        if ((courseCode >= 100) && (courseCode <= 599)) {
            this.courseCode = courseCode;
        } else {
            System.out.println("Invalid CourseCode value was typed!, default value is assigned to invalid value.");
        }
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        if ((courseCredit == 3) || (courseCredit == 4)) {
            this.courseCredit = courseCredit;
        } else {
            System.out.println("Invalid CourseCredit was typed!, default value is assigned to invalid value.");
        }
    }

    public Grade getGradeTaken() {
        return gradeTaken;
    }

    public void setGradeTaken(Grade gradeTaken) {
        this.gradeTaken = gradeTaken;
    }

    public void setGradeTaken(double val) {
        if ((val >= 0) && (val <= 4)) {
            int roundedVal = (int) Math.round(val);
            switch (roundedVal) {
                case 4:
                    this.gradeTaken = Grade.A;
                    break;
                case 3:
                    this.gradeTaken = Grade.B;
                    break;
                case 2:
                    this.gradeTaken = Grade.C;
                    break;
                case 1:
                    this.gradeTaken = Grade.D;
                    break;
                case 0:
                    this.gradeTaken = Grade.F;
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Value is out of the range");
        }
    }

    @Override
    public String toString() {
        return "Department: " + courseDepartment + " CourseCode: " + courseCode + " Credit: " + courseCredit + " Grade: " + gradeTaken.name();
    }
}
