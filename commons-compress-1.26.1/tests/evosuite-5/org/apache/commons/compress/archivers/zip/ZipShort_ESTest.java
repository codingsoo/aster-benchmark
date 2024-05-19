
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipShort_ESTest extends ZipShort_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)79;
      ZipShort zipShort0 = new ZipShort(byteArray0);
      ZipShort zipShort1 = ZipShort.ZERO;
      boolean boolean0 = zipShort0.equals(zipShort1);
      assertEquals(79, zipShort0.getValue());
      assertFalse(zipShort1.equals((Object)zipShort0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipShort.putShort(0, byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipShort zipShort0 = new ZipShort(byteArray0, (byte)0);
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = ZipShort.getValue(byteArray0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)79;
      int int0 = ZipShort.getValue(byteArray0, 0);
      assertEquals(79, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)79;
      int int0 = ZipShort.getValue(byteArray0);
      assertEquals(79, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipShort zipShort0 = ZipShort.ZERO;
      int int0 = zipShort0.getValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)1;
      ZipShort zipShort0 = new ZipShort(byteArray0);
      int int0 = zipShort0.getValue();
      assertEquals(256, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipShort.putShort(0, (byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        ZipShort.getValue(byteArray0, 4328);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4328
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipShort.getValue((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ZipShort.getValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipShort zipShort0 = null;
      try {
        zipShort0 = new ZipShort((byte[]) null, 2095);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ZipShort zipShort0 = null;
      try {
        zipShort0 = new ZipShort(byteArray0, (-3776));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3776
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZipShort zipShort0 = null;
      try {
        zipShort0 = new ZipShort((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ZipShort zipShort0 = null;
      try {
        zipShort0 = new ZipShort(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipShort zipShort0 = new ZipShort((-3157));
      int int0 = zipShort0.getValue();
      assertEquals((-3157), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        ZipShort.putShort(0, byteArray0, (byte)13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-1);
      ZipShort zipShort0 = new ZipShort(byteArray0);
      Object object0 = zipShort0.ZERO.clone();
      boolean boolean0 = object0.equals(zipShort0);
      assertFalse(boolean0);
      assertEquals(65280, zipShort0.getValue());
      assertFalse(zipShort0.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZipShort zipShort0 = ZipShort.ZERO;
      Object object0 = new Object();
      boolean boolean0 = zipShort0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipShort zipShort0 = new ZipShort(byteArray0);
      String string0 = zipShort0.toString();
      assertEquals("ZipShort value: 0", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZipShort zipShort0 = ZipShort.ZERO;
      zipShort0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = ZipShort.getValue(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipShort zipShort0 = new ZipShort(byteArray0);
      boolean boolean0 = zipShort0.equals(zipShort0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipShort zipShort0 = new ZipShort(0);
      byte[] byteArray0 = zipShort0.ZERO.getBytes();
      assertEquals(0, zipShort0.getValue());
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipShort.getValue((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = ZipShort.getBytes(0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }
}
