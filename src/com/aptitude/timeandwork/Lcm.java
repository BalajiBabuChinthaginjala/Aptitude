package com.aptitude.timeandwork;

import java.util.Scanner;

public class Lcm {
         public static double lcmTwo(double num1, double num2) {
            return Math.abs(num1 * num2) / gcd(num1, num2);
        }

    public static double lcmThree(double num1, double num2, double num3) {
        double[] nums = {num1, num2, num3};
        double lcm = 1;
        for (int i = 0; i < nums.length; i++) {
            lcm = lcm * nums[i] / gcd(lcm, nums[i]);
        }
        return lcm;
    }
    public static double gcd(double num1, double num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }



    }






