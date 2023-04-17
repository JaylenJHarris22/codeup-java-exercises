package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    private HashMap<String, String> attendance;

    Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName(){
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        double total = 0;
        double average;
        for(double x : grades){
            total += x;
        }
        average = total/grades.size();
        return (Math.round(average*100.0) / 100.0);
    }

    public void recordAttendance(String date, String val){
        attendance.put(date, val);
    }

    public double attendancePer(){
        double total = 0;
        for(String x : attendance.values()){
            if (x.equals(String.valueOf('A'))){
                total +=1;
            }
        }
        return attendance.size()-total/attendance.size();
    }
    public String daysMissing(){
        String x = "";
        for(String y : attendance.keySet()){
            if (attendance.get(y).equals(String.valueOf('A'))){
                x += y + ", ";
            } else  {
                x = "This student had perfect attendance";
            }
        }
        return x;
    }
}
