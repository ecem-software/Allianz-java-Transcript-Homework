package main;

import util.Grade;


public class CourseGrade {

    //Default values are entered.
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

    //Department names and set methods are determined.
    public void setCourseDepartment(String courseDepartment) {

        String[] possibleDepartments = {"CENG", "COMP", "ECE", "ME", "MATH"};
        int i = 0;
        for (; i < possibleDepartments.length; i++) {
            if (courseDepartment.toUpperCase().equals(possibleDepartments[i])) {
                this.courseDepartment = courseDepartment;
                break;
            }
        }
        if (i == possibleDepartments.length) {
            System.out.println("Invalid CourseDepartment, " + courseDepartment.toUpperCase() + " was typed!, default value is assigned to invalid value.");
        }

    }

    public int getCourseCode() {
        return courseCode;
    }

    //Course code is determined in set method.
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

    // Course Credit is determined. It can be only 3 or 4.
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
        return "Department: " + courseDepartment + " CourseCode: " + courseCode + " Credit: " + courseCredit + " Grade: " + gradeTaken.getStringValue();
    }
}
