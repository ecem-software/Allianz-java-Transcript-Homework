# Allianz-java-Transcript-Homework
## Student Transcript System
This project implements an application for generating transcripts of students. The application consists of several classes that handle different aspects of the transcript generation process.
## Structure of the project
### 1. Enum Grade
The enum type Grade represents the grade of a student, and it should define constants
representing the grades of A, B, C, D, F. Each constant also contains a stringValue (String representation of the letter grade) and numericValue (corresponding numeric grade) field. The enum provides a toString() method for printing the letter and numeric grade for each constant.

### 2. GradeTest
GradeTest that uses the enhanced for
loop, and the values() method of Grade to print out the following output:
* Grade F corresponds to numeric grade 0.
* Grade D corresponds to numeric grade 1.

The GradeTest class is a test program for the Grade enum. It uses the enhanced for loop and the values() method of Grade to print out the letter and numeric grade for each constant.

### 3. CourseGrade
1. CourseGrade class, course Department, course Code and course Credit and Grade Received fields keep the information of the department where the course is given, the course code of the course, the credit of the course and the grade received for that course.
2. Course Part is a four letter abbreviation of the chapter, which indicates that the class is offered.
3. The possible values of departments in this application are such as  CENG, COMP, ECE, ME and MATH.
4. CourseCode is a three digit code (e.g., 101, 200, or 590) for the course. This has a certain interval like a between 100 and 599.

The class provides appropriate getter and setter methods for each field, with the set methods performing checks on the arguments and setting default values if the arguments are invalid. The set method for the grade taken is overloaded to handle both numeric values and Grade enum constants. The class also includes four overloaded constructors to initialize the fields, with the option to set default values for missing parameters.
### 4. Transcript
The Transcript class keeps the transcript of a student with a given student ID. It maintains a list of CourseGrade objects, representing the grades taken by the student throughout their education. The class also calculates and stores the student's GPA as a double value, which is the average of all grades taken by the student.

The class has a one-argument constructor that takes the student's ID, sets the GPA to 0.0, and initializes an empty list of CourseGrade objects. It includes an addCourseTaken method to add a CourseGrade object to the list of course grades and update the student's GPA accordingly. The method checks that the input CourseGrade object is not null before adding it to the list.

The Transcript class provides a toString() method to print the student's transcript. It utilizes the toString() method of the CourseGrade class to display each course's information along with the student's GPA in the desired format.
