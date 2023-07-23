package util;
import  util.Grade;

public class GradeTest {
    //Değerleri loop ile yazdırmak için method oluşturdum.
    public void printGrades(){
        for( Grade grade: Grade.values()){
            System.out.println(grade + ".");
        }

    }
}
