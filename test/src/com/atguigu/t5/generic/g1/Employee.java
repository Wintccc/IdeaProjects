package com.atguigu.t5.generic.g1;

/**
 * @author Wint
 * @create 2022-06-24 13:58
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate birth;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirth() {
        return birth;
    }

    public void setBirth(MyDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        int i = this.name.compareTo(e.name);
        if (i > 0){
            return 1;
        }else if (i < 0){
            return -1;
        }else {
            return this.age - e.age;
        }
//        return this.name.compareTo(e.name);
    }
}
