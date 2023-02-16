/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codedudu.mathutil.main;

import com.codedudu.mathutil.core.MathUtility;

/**
 *
 * @author windt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArgumentThrowException();
    }
    //thiết kế hàm getF() là: chỉ tính n! từ 0. .20
    //Nếu đưa n < 0 hoặc n > 20  THÌ HÀM SẼ KO TÍNH, CHỬI BẰNG CÁCH NÉM RA NGOẠI LỆ!!!
    //thức tế hàm getF() khi chạy có làm như được thiết kế hay không phải test thử chayj thử mới biết
    public static void testFactorialGivenWrongArgumentThrowException(){
        //test case #4: Test getF()  with n = 5, ưởng ảgument
        //Expeccted va;ue: an exception í thrown
        //                 IllegalArgumentException
        
        System.out.println("Test -5!:expected = Illegal Argument Exception is thrown" );
        MathUtility.getFactorial(-5);
    }
    //dân dev phải có trách nhiệm test code của mình chạy đúng hay sai 
    //trước khi lắp ráp nó với các class khác để tạo nên các chức năng 
    //ghi chú:
    //có nhiều quy tắc đặt tên hàm cho viện kiểm thử hàm 
    //thường tên hàm sẽ bao hàm ý nghĩa của việc kiểm thử 
    //ví dụ hàm dưới này sẽ dùng để test cái hàm tính giai thừa 
    //trong tình huống - case dưa n đúng chuẩn, thì ta hy vọng - expected
    //hàm chạy ngon như thiết kế, ví dụ  N=5 thì hàm phải trả về 120
    //tức là 5! hy vọng hàm tính ra 120
    public static void testFactorialGivenRightArgumentRunsWell() {
        
        //test case #1:  Test getFactorial with n = 0
        //Expected value: 1 - hy vọng đưaq n = 0 vào thì hàm trả về 1
        
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        
        System.out.println("Test " + n + "!:expected = " + expectedValue 
                                       + " | actual:" + actualValue);
        
        //test case 2: test getFactorial() with n=1
        //Expected value = 1 - hy vọng 1! app trả về 1
        n=1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!:expected = " + expectedValue 
                                       + " | actual:" + actualValue);
        
        //test case #3: test getFactorial(3)
        //expected value = 6!!!
        System.out.println("Test 3!: expected = 6" 
                                       + " | actual:" + MathUtility.getFactorial(3));
    }
}
