package uaslp.objetos.exams;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private int code;
    private Integer scores[];
    double average = 0;

    public Student(String name, int code){
        this.name = name;
        this.code = code;
        scores = new Integer [3];
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int position, int score) throws InvalidPartialException{
        if(position <1 || position >3){
            throw new InvalidPartialException();
        }
        this.scores[position-1] = score;
    }

    public double getAverage() throws MissingScoreException{
        for(int i=0;i<3;i++) {
            if (scores[i] == null)
                throw new MissingScoreException("Missing partial " + (i+1));
            average += scores[i];
        }
        return average/3;
    }
}
