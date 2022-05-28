package com.github.danildzambrana;

import java.text.DecimalFormat;

public class GetIR {
    private static final DecimalFormat decimal = new DecimalFormat("C$ #,##0.00");
    public static void main(String[] args) {
        double salary = 50000;
        System.out.println("Salary " + decimal.format(salary));

        double inss = salary * 0.07;
        System.out.println("\tINSS " + decimal.format(inss));

        salary -= inss;
        System.out.println("Salary without deductions " + decimal.format(salary));

        double anualSalary = salary * 12;
        System.out.println("\tAnual salary without deductions " + decimal.format(anualSalary));


        double ir = 0;

        if(anualSalary > 500000) {
            ir = (anualSalary - 500000) * 0.30;
            ir += 82500;
        } else if(anualSalary > 350000) {
            ir = (anualSalary - 350000) * 0.25;
            ir += 45000;
        } else if(anualSalary > 200000) {
            System.out.println(anualSalary - 200000);
            ir = (anualSalary - 200000) * 0.20;
            ir += 15000; 
        } else if(anualSalary > 100000) {
            ir = (anualSalary - 100000) *0.15;
        }

        System.out.println("\tAnual ir " + decimal.format(ir));
        System.out.println("\tir " + decimal.format(ir/12));

        System.out.println("Final salary " + decimal.format((salary - (ir/12))));
    }
    
}
