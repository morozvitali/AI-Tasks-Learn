package udemi2.u10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("One", 13);
        Schoolar schoolar2 = new Schoolar("Two", 15);


        Student student1 = new Student("Three", 18);
        Student student2 = new Student("Four", 20);

        Employee employee1 = new Employee("Five", 110);
        Employee employee2 = new Employee("Six", 220);

        Team <Schoolar> team1 = new Team("xxx");
        Team <Student> team2 = new Team("yyy");
        Team <Employee> team3 = new Team("zzz");

        team1.addNewPartisipant(schoolar1);
        team1.addNewPartisipant(schoolar2);


        team2.addNewPartisipant(student1);
        team2.addNewPartisipant(student2);


        team3.addNewPartisipant(employee1);
        team3.addNewPartisipant(employee2);


        team1.playWith(team2);

    }
}