/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codedudu.mathutil.core;

/**
 *
 * @author windt
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //hàm tính N! = 1 * 2* 3 * 4 *... *n
    //ko có giai thừa cho số âm
    //0! = 1! = 1 quy ước  0! = 1
    //vì giai thừa tằng giá trị rất nhanh, 20! vừa đủ  số 0
    //tức là 21! tràn kiểu LONG
    //Quy ước: hàm này chỉ tính  từ 0. .20!
    //có 2 cách viết hàm này: for truyền thống và đẹ quy - recursion
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("invalid n. n must be between 0..20!");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        //sống sót trên đoạn này, n từ 2..20 rồi!!!, for mà chơi
        long product = 1; //biến khởi động cho tích nhân dồn
        for (int i = 2; i < n; i++) {
            product *= i;

            
        }
        return product;
    }

}
