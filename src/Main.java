import main.CourseGrade;
import main.Transcript;
import util.Grade;
import util.GradeTest;

public class Main {
    public static void main(String[] args) {

        GradeTest gradeTest=new GradeTest();
        gradeTest.printGrades();

        CourseGrade courseGrade= new CourseGrade("ECE");
        CourseGrade courseGrade2= new CourseGrade("CENG",301);
        CourseGrade courseGrade3= new CourseGrade("ARCH",401,3);
        CourseGrade courseGrade4= new CourseGrade("COMP",501,4, Grade.B);


        Transcript transcript= new Transcript(1234);
        transcript.addCourseTaken(courseGrade);
        transcript.addCourseTaken(courseGrade2);
        transcript.addCourseTaken(courseGrade3);
        transcript.addCourseTaken(courseGrade4);

        System.out.println(transcript);


    }
}