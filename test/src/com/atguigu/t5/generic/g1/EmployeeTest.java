package com.atguigu.t5.generic.g1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Wint
 * @create 2022-06-24 14:02
 */
public class EmployeeTest {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();
        Employee e1 = new Employee("Maks",54,new MyDate(1962,8,28));
        Employee e2 = new Employee("Jack",62,new MyDate(1926,5,16));
        Employee e3 = new Employee("Bill",12,new MyDate(1962,2,11));
        Employee e4 = new Employee("Bell",47,new MyDate(1917,11,5));
        Employee e5 = new Employee("Abel",15,new MyDate(1998,10,12));
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------------");
        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int year = e1.getBirth().getYear() - e2.getBirth().getYear();
                int month = e1.getBirth().getYear() - e2.getBirth().getMonth();
                int day = e1.getBirth().getDay() - e2.getBirth().getDay();
                if (year > 0){
                    return 1;
                }else if(year < 0){
                    return -1;
                }else{
                    if (month > 0){
                        return 1;
                    }else if (month < 0){
                        return -1;
                    }else{
                        if(day > 0){
                            return 1;
                        }else if(day < 0){
                            return -1;
                        }else {
                            return 0;
                        }
                    }
                }
            }
        };
        TreeSet<Employee> emp = new TreeSet<>(com);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);
        System.out.println(emp.size());
        Iterator<Employee> it = emp.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
