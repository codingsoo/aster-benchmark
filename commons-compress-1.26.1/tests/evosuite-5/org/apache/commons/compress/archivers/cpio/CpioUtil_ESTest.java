
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


package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.cpio.CpioUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CpioUtil_ESTest extends CpioUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = CpioUtil.long2byteArray((-1321L), 2, false);
      assertArrayEquals(new byte[] {(byte) (-41), (byte) (-6)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = CpioUtil.fileType((-1L));
      assertEquals(61440L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = CpioUtil.long2byteArray(0L, 732, false);
      long long0 = CpioUtil.byteArray2long(byteArray0, false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = CpioUtil.long2byteArray((-1998L), 8, false);
      long long0 = CpioUtil.byteArray2long(byteArray0, false);
      assertEquals((-1998L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CpioUtil.long2byteArray((-1L), 3550, false);
      CpioUtil.long2byteArray(0L, 3550, false);
      // Undeclared exception!
      CpioUtil.long2byteArray(0L, 3550, false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CpioUtil.long2byteArray(2049L, (-1), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        CpioUtil.byteArray2long((byte[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        CpioUtil.byteArray2long(byteArray0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        CpioUtil.long2byteArray(269L, 0, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        CpioUtil.long2byteArray(0L, 1903, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = CpioUtil.long2byteArray(1619L, 3188, true);
      long long0 = CpioUtil.byteArray2long(byteArray0, false);
      assertEquals(21254L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        CpioUtil.byteArray2long(byteArray0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = CpioUtil.long2byteArray(1619L, 3188, true);
      CpioUtil.byteArray2long(byteArray0, true);
      CpioUtil.byteArray2long(byteArray0, true);
      CpioUtil.byteArray2long(byteArray0, true);
      // Undeclared exception!
      CpioUtil.byteArray2long(byteArray0, false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long long0 = CpioUtil.fileType(1619L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CpioUtil cpioUtil0 = new CpioUtil();
  }
}
