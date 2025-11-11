package ex_25_CollectionFrameworks.CF_List;

import java.util.ArrayList;
import java.util.*;

public class ArrayList_ClassElement {
    public static void main(String[] args) {
    student s1 =new student("Prakarsh","100");
        student s2 =new student("Prakarsh1","1001");
        student s3 =new student("Prakarsh2","1002");
        List<student> st =new ArrayList<>();
        st.add(s1);
        st.add(s2);
        st.add(s3);

        s1.print();
        s2.print();
        s2.print();

        for(student o:st)
        {
            System.out.println(o);
        }
    }
}

class student{
    private String name;
    private String rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    public void print(){
        System.out.println("Student Name" + name);
        System.out.println("Student Roll No" + rollno);
    }

    @Override
    public String toString() { // Method added to override the object in string to proper string in for each loop
        return "Student(name = '"+ name + "' + roll no='" + "')";
    }
}