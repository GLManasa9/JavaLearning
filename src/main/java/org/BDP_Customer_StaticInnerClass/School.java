package org.BDP_Customer_StaticInnerClass;

public class School {
    public static void main(String[] args){

        //approach 1
        Student.StudentBuilder sb = new Student.StudentBuilder();
        sb.setName("manasa").setAddress("Hyderabad").setId(4079);
        Student manasa = new Student(sb);

        //approach 2
        Student walter = new Student.
                StudentBuilder()
                .setName("walter")
                .setAddress("chennai")
                .setLovesArts(true)
                .build();

        System.out.println(manasa);
        System.out.println(walter);
    }
}
