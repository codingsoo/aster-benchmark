
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.compress.harmony.unpack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.unpack200.AttributeLayout;
import org.apache.commons.compress.harmony.unpack200.IMatcher;
import org.apache.commons.compress.harmony.unpack200.SegmentUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SegmentUtils_ESTest extends SegmentUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = SegmentUtils.countInvokeInterfaceArgs("u<F^()n.@");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("[e5K&$()UG", 74);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("x:(vK8OCJ6(8%e[Z)#wh", (-4658));
      assertEquals((-4647), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("u<F^()n.@");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("x:(yOC)j8%x:F#wh");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long[][] longArray0 = new long[3][8];
      // Undeclared exception!
      try { 
        SegmentUtils.countMatches(longArray0, (IMatcher) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[7];
      // Undeclared exception!
      try { 
        SegmentUtils.countMatches(longArray0, (IMatcher) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countInvokeInterfaceArgs((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countBit16((long[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countBit16((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countBit16((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs((String) null, (-1881));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[2] = (-518L);
      AttributeLayout attributeLayout0 = new AttributeLayout("1Nlvo8", 0, "", 2840, false);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long[] longArray0 = new long[6];
      AttributeLayout attributeLayout0 = new AttributeLayout("1Nlvo8", 0, "", 2840, false);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("Can't r}ad beyond e;d of strea8 (n = %,d, count = %,d, maLength = %,d8 remaining = %,d)", 10);
      assertEquals(25, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("(E'S", (-1597));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs(")&iV?B|Ha0b&@(uh", (-3052));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("", 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long[][] longArray0 = new long[6][4];
      long[] longArray1 = new long[6];
      longArray1[1] = (long) 41;
      longArray0[0] = longArray1;
      AttributeLayout attributeLayout0 = new AttributeLayout("8PB3'Z[iI`Bom9=|?L", 0, "8PB3'Z[iI`Bom9=|?L", 0, false);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long[][] longArray0 = new long[6][4];
      AttributeLayout attributeLayout0 = new AttributeLayout("8PB3'Z[iI`Bom9=|?L", 0, "8PB3'Z[iI`Bom9=|?L", 0, false);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long[][] longArray0 = new long[12][4];
      long[] longArray1 = new long[8];
      longArray1[0] = 4294967266L;
      longArray0[4] = longArray1;
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long[][] longArray0 = new long[8][9];
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[2] = (-1867L);
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long[] longArray0 = new long[11];
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[3] = (-726);
      int int0 = SegmentUtils.countBit16(intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = SegmentUtils.countBit16(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = SegmentUtils.countInvokeInterfaceArgs("Can't read beyond end of stream (n = %,d, count = %,d, maxLength = %,d, remaining = %,d)");
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("prUFn~j8\"d&(4p");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countInvokeInterfaceArgs("ACC_PUBLIC");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentUtils segmentUtils0 = new SegmentUtils();
  }
}
