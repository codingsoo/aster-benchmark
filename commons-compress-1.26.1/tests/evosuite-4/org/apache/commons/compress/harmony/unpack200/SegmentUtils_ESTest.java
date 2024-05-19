
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
      long[][] longArray0 = new long[8][5];
      long[] longArray1 = new long[8];
      longArray1[3] = 1161L;
      longArray0[0] = longArray1;
      AttributeLayout attributeLayout0 = new AttributeLayout("No argumen", 0, "No argumen", 0);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = SegmentUtils.countInvokeInterfaceArgs("h'^VM4Tg?dfa_y+()");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("h'^VM4Tg?dfa_y+()", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("h'^VM4Tg?dfa_y+()");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long[][] longArray0 = new long[1][3];
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
  public void test05()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("7*", 0, "7*", 0, true);
      // Undeclared exception!
      try { 
        SegmentUtils.countMatches((long[]) null, (IMatcher) attributeLayout0);
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
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countInvokeInterfaceArgs("~'&7[7k|[(}U");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
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
        SegmentUtils.countArgs((String) null, (-1244));
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
      int int0 = SegmentUtils.countArgs("h^VM4(Tg?dXfaCy+D;()", 14);
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("kl@_z'$uRr(3-FJ)o", (-3685));
      assertEquals((-3681), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = SegmentUtils.countArgs(",(n[])9j>hJ", 1886);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("DC$r>)1Ep?M76('sH", 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long[][] longArray0 = new long[8][5];
      AttributeLayout attributeLayout0 = new AttributeLayout("No argumen", 0, "No argumen", 0);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long[] longArray0 = new long[2];
      longArray0[1] = (-808L);
      AttributeLayout attributeLayout0 = new AttributeLayout("org.apache.commons.compress.harmony.unpack200.bytecode.CPRef", 0, "org.apache.commons.compress.harmony.unpack200.bytecode.CPRef", 2079);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long[] longArray0 = new long[6];
      AttributeLayout attributeLayout0 = new AttributeLayout("5L&/,~", 2, "5L&/,~", (-1203));
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long[] longArray0 = new long[23];
      longArray0[3] = (long) (-3673);
      long[][] longArray1 = new long[4][6];
      longArray1[0] = longArray0;
      int int0 = SegmentUtils.countBit16(longArray1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long[][] longArray0 = new long[4][6];
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long[] longArray0 = new long[23];
      longArray0[3] = (long) (-3673);
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long[] longArray0 = new long[23];
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[3] = (-2056);
      int int0 = SegmentUtils.countBit16(intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = SegmentUtils.countBit16(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = SegmentUtils.countInvokeInterfaceArgs("h^VM4(Tg?dXfaCy+D;()");
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = SegmentUtils.countArgs(",(n[])9j>hJ");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("Can't read beyond end of stream (n = %,d, count = %,d, maxLength = %,d, remaining = %,d)", (-3685));
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("DC$r>)1Ep?M76('sH");
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
        SegmentUtils.countArgs("eC(r<nI_^$", 0);
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
  public void test31()  throws Throwable  {
      SegmentUtils segmentUtils0 = new SegmentUtils();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
}
