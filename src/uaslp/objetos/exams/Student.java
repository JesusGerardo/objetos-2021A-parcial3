package uaslp.objetos.exams;

import java.util.List;

public class Student {
    private String name;
    private int code;
    List<Integer> scores;
    double average;

    public Student(String name, int code){
        this.name = name;
        this.code = code;
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
        scores.add(position,score);
    }

    public double getAverage() throws MissingScoreException{
        if(scores.get(1)==null || scores.get(2)==null || scores.get(3)==null){
            throw new MissingScoreException();
        }
        average = scores.get(1)+scores.get(2)+scores.get(3);
        return average/3;
    }
}
