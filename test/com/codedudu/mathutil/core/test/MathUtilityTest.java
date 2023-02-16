/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codedudu.mathutil.core.test;

import com.codedudu.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author windt
 */
public class MathUtilityTest {
    //kiểm thử ngoại lệ thì sao?
        //tức là hàm getF() được thiết kế rằng nếu đưa n cà chớn
        //thì hàm phải ném ra ngoại lệ
        //tức là getF(-5) thì EXPECTED == NGOẠI LỆ ILLEGAL ARGUMENT 
        //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
        
    @Test(expected = Exception.class)//con là biến thể của char
    
    public void testFactorialGivenArgumentThrowsException() {
        
        //test case#5 getF() with ưởng arg: n = -5
        //Expected result: an expected is thrown: ILLEGAL Argument 
        
        MathUtility.getFactorial(35);
        //nếu chỉ gõ lệnh trên thì bị màu đỏ do lệnh này gây ra exception và exception là màu đỏ nhưng hàm này kì vọng phải ra màu đỏ
            //nếu có exception thì đúng như thiết kế phải màu xanh
            // lỗi của ta là không so sánh, chưa nhận diện là đã có ngoại lệ rồi
            //ta cần thêm một lệnh đã có ngoại lệ, nếu đã có rồi thì XANH, chưa thì ĐỎ
            //Junit 4 thì không dùng hàm assert() để đo ngoại lệ
            //JUnit 5 thì dùng hàm assert() để đo ngoại lệ
    }
    
    @Test
    //trong hàm này se chứa các test case để test getF()
    //với n hợp lệ trong khoảng 0..20
    public void testFactorialGivenRightArgumentReturnsWell() {
        
        
        //Test case #1: test getF() with n = 0
        //expected result = 1; //hy vọng 0! = 1
        int n = 0;
        long expectedValue = 1;//hy vọng 0! = 1
        long actualValue = MathUtility.getFactorial(n);//thực tế getF() trả về mấy??
        
        Assert.assertEquals(expectedValue , actualValue);
        
        //test case #2: test getf() with n = 5;
        //Expected result = 120; //hy vọng 5! = 120, xem máy có làm được hay ho???
        
        Assert.assertEquals(120, MathUtility.getFactorial(6));
        
        //test case #3 : test getF() with n = 6; expected = 720
        Assert.assertEquals(720, MathUtility.getFactorial(7));
        
        //test case #4 : test getF() with n = 4; expected = 24
        Assert.assertEquals(24, MathUtility.getFactorial(6));
    }
}
