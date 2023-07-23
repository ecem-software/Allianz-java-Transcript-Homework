package main;

import java.util.ArrayList;

public class Transcript {
    private int studentId;
    private ArrayList<CourseGrade> courseGradeList;
    private double gpa;

    public Transcript(int studentId) {
        this.studentId = studentId;
        this.gpa = 0.0;
        this.courseGradeList = new ArrayList<CourseGrade>();
    }


    public void addCourseTaken(CourseGrade courseGrade) {
        if (courseGrade != null) {
            courseGradeList.add(courseGrade);
            double totalCredit = 0.0;
            double totalPoint = 0.0;
            for (CourseGrade cg : courseGradeList) {
                totalCredit += cg.getCourseCredit();
                totalPoint += cg.getCourseCredit() * cg.getGradeTaken().getIndex();
            }
            gpa = totalPoint / totalCredit;
        } else {
            System.out.println("Course grade can not be null!");
        }
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public ArrayList<CourseGrade> getCourseGradeList() {
        return courseGradeList;
    }

    public void setCourseGradeList(ArrayList<CourseGrade> courseGradeList) {
        this.courseGradeList = courseGradeList;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        String out = "Student ID: " + studentId + "\n";
        for (CourseGrade cg : courseGradeList)
        {
            out += cg.toString() + "\n";
        }
        out += "GPA: " + gpa;
        return out;
    }
}
