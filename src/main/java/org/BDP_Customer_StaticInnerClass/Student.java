package org.BDP_Customer_StaticInnerClass;

public class Student {
    private String name;
    private String address;
    private int id;
    private boolean lovesArts;

    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.id = builder.id;
        this.lovesArts = builder.lovesArts;
    }

    public StudentBuilder builder(){
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", lovesArts=" + lovesArts +
                '}';
    }

    public static class StudentBuilder{
        private String name;
        private String address;
        private int id;
        private boolean lovesArts;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setLovesArts(boolean lovesArts) {
            this.lovesArts = lovesArts;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
