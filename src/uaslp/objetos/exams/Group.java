package uaslp.objetos.exams;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Group {
    private int capacity;
    private List<Student> students;
    private double average;

    public Group (int capacity){
        this.capacity = capacity;
        students = new LinkedList<>();
    }

    public int getCapacity(){
        return capacity;
    }

    public void addStudent(Student student) throws GroupIsFullException {
        if(students.size()==capacity){
            throw new GroupIsFullException();
        }
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    public int getAvailability(){
        return capacity - students.size();
    }

    public double getAverage(){
        for(int i=0;i<students.size();i++){
            average+=students.get(i).getAverage();
        }
        return average/students.size();
    }
}
