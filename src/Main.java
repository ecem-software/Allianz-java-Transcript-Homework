import main.CourseGrade;
import main.Transcript;
import util.Grade;
import util.GradeTest;

public class Main {
    public static void main(String[] args) {
        GradeTest gradeTest=new GradeTest();
        gradeTest.printGrades();

        CourseGrade courseGrade= new CourseGrade("ECE",201,4, Grade.A);
        CourseGrade courseGrade2= new CourseGrade("CENG",301,3, Grade.B);
        CourseGrade courseGrade3= new CourseGrade("ARCH",401,3, Grade.C);
        CourseGrade courseGrade4= new CourseGrade("COMP",501,4, Grade.F);
        CourseGrade courseGrade5= new CourseGrade("ME",701,4, Grade.B);

        Transcript transcript= new Transcript(1234);
        transcript.addCourseTaken(courseGrade);
        transcript.addCourseTaken(courseGrade2);
        transcript.addCourseTaken(courseGrade3);
        transcript.addCourseTaken(courseGrade4);
        transcript.addCourseTaken(courseGrade5);

        System.out.println(transcript);


    }
}