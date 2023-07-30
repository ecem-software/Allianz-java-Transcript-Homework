package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenerateTranscript {
    Scanner scanner = new Scanner(System.in);

    public void takeInputFromUser() {

        System.out.println("Please enter student ID:");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        Transcript transcript = new Transcript(studentId);


        while (true) {
            System.out.println("Please enter your 'department' or you can write 'quit' to finish");
            String department = scanner.nextLine();
            CourseGrade courseGrade = new CourseGrade(department);

            if (department.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("Enter Course Code");
            int Coursecode = scanner.nextInt();
            courseGrade.setCourseCode(Coursecode);

            System.out.println("Enter Course Credit");
            int courseCredit = scanner.nextInt();
            courseGrade.setCourseCredit(courseCredit);

            System.out.println("Enter Course Grade: 4:A, 3: B , 2:C , 1:D or 0:F");
            int grade = scanner.nextInt();
            scanner.nextLine();


            courseGrade.setGradeTaken(grade);
            transcript.addCourseTaken(courseGrade);

            System.out.println("Do you want to continue? Please press y/n");
            String decision = scanner.nextLine();

            if (decision.equalsIgnoreCase("n")){
                break;
            }
            }
        System.out.println(transcript.toString());
    }

    public void takeInputFromFile() {
        System.out.println("Enter Filename Please!");
        String Filename = scanner.nextLine().trim();
        File file=new File(Filename);

        try {
            Scanner fileScanner = new Scanner(file);
            int studentId = Integer.parseInt(fileScanner.nextLine().trim());
            Transcript transcript = new Transcript(studentId);

            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] LectureInfo = line.split(" ");
                String department = LectureInfo[0];
                int courseCode = Integer.parseInt(LectureInfo[1]);
                int courseCredit = Integer.parseInt(LectureInfo[2]);
                Double grade = Double.parseDouble(LectureInfo[3]);

                CourseGrade courseGrade = new CourseGrade(department, courseCode, courseCredit);
                courseGrade.setGradeTaken(grade);
                transcript.addCourseTaken(courseGrade);
            }

            fileScanner.close();
            System.out.println(transcript);
        } catch(FileNotFoundException e){
            System.out.println("Error: File not found.");
        }
    }
}
