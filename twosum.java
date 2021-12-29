/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosum_leetcode;

import java.util.*;

/**
 *
 * @author Haneen
 */
public class Twosum_leetcode {

    public static void main(String[] args) {
        int[] nums = new int[5];
        int[] nums2 = new int[5];
        int target = 0;
        System.out.println("Please enter the target number");
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        System.out.println("Please enter the numbers");

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < 5; j++) {
                //if(nums[i]+nums[j]==target);
                nums2[i] = nums[i] + nums[j];
                if (nums2[i] == target) {
                    System.out.println(i + " " + j);
                    break;

                }

            }

        }

    }
}
