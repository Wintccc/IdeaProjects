package com.atguigu.reflection;

/**
 * @author Wint
 * @create 2022-06-06 15:28
 */
public class Person<T> extends Life<String>{
    private String name;
    int age;
    protected String id;
    public double weight;

    public Person() {
    }
    public Person(String name, int age, String id, double weight) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.weight = weight;
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
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    private void walk(){
        System.out.println("Walk");
    }
    String nation(String nation){
        System.out.println("Nation:" + nation);
        return nation;
    }
    public String eat(String food){
        System.out.println("Foos:" + food);
        return food;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (age != person.age) return false;
        if (Double.compare(person.weight, weight) != 0) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return id != null ? id.equals(person.id) : person.id == null;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", weight=" + weight +
                '}';
    }
}
