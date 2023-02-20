/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.codedudu.mathutil.core.test;

import com.codedudu.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author windt
 */
@RunWith(value = Parameterized.class)
//báo với Junit rằng code trong các class này tao sẽ 
//tách data và hàm so sánh riêng biệt nhau - DATA DRIVEN TESTING
//tách thì phải có kĩ thuật nhồi
// fill data trở lại lệnh so sánh fill trở lại thông qua biến - biến chứa value được thay đổi
//DDT có anh em nương tựa với Parameterized - tham số hóa data
public class MathUtilityAdvancedTest {
    
  //chuẩn bị mảng 2 chiều để chứa data trong các test case sẽ dùng
    //quy ước mảng phải là static public
    @Parameterized.Parameters //data báo cho junit lát lấy ra
    public static Object[][] initData() {
        
        return new Object[][] {
                               {0, 1},
                               {1, 1},
                               {2, 2},
                               {3, 6},
                               {4, 24},
                               {5, 120}
                
                              };
    }
    
    //map từng cặp data ở trên vào 2 biến cục bộ và sẽ đẩy 2 biến này vào hàm assertEquals() đã quen
    @Parameterized.Parameter(value = 0) //lấy cột 0  của mảng gán vào (parameter từng tham số)
    public int n;
     @Parameterized.Parameter(value = 1) //lấy cột 0  của mảng gán vào
    public long expected;
     
     //test
     @Test
     public void testFatorialGivenRightArgumentReturnsWell() {
         assertEquals(expected, MathUtility.getFactorial(n), Math.abs(expected-MathUtility.getFactorial(n)));
     }
}
