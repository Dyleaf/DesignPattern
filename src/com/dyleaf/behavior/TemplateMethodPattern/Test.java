package com.dyleaf.behavior.TemplateMethodPattern;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.prepareGotoSchool();

        Teacher teacher  = new Teacher();
        teacher.prepareGotoSchool();
    }
}
