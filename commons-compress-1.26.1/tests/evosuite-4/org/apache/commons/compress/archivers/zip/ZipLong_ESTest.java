
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
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipLong_ESTest extends ZipLong_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0L);
      ZipLong zipLong1 = (ZipLong)zipLong0.SINGLE_SEGMENT_SPLIT_MARKER.clone();
      boolean boolean0 = zipLong0.equals(zipLong1);
      assertEquals(808471376L, zipLong1.getValue());
      assertFalse(zipLong1.equals((Object)zipLong0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipLong zipLong0 = new ZipLong(byteArray0, 1);
      assertEquals(0, zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0L);
      byte[] byteArray0 = zipLong0.getBytes();
      ZipLong.getValue(byteArray0, 0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-43);
      long long0 = ZipLong.getValue(byteArray0, 1);
      assertEquals(213L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0L);
      byte[] byteArray0 = zipLong0.CFH_SIG.getBytes();
      long long0 = ZipLong.getValue(byteArray0);
      assertEquals(33639248L, long0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0);
      long long0 = zipLong0.getValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-822));
      long long0 = zipLong0.getValue();
      assertEquals((-822L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0L);
      int int0 = zipLong0.getIntValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-3253L));
      int int0 = zipLong0.getIntValue();
      assertEquals((-3253), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      // Undeclared exception!
      try { 
        zipLong0.CFH_SIG.putLong((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0L);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        zipLong0.putLong(byteArray0, (-1736));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1736
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipLong.putLong((-1L), (byte[]) null, 688);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        ZipLong.putLong((long) (byte) (-38), byteArray0, (int) (byte)72);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 72
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipLong.getValue((byte[]) null, 1388);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipLong.getValue((byte[]) null);
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
      // Undeclared exception!
      try { 
        ZipLong.getValue(byteArray0);
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
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong(byteArray0, 512);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 512
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipLong.putLong(0L, byteArray0, 0);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ZipLong.getValue(byteArray0, 175);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 175
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = ZipLong.getBytes(0L);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipLong zipLong0 = new ZipLong(byteArray0);
      boolean boolean0 = zipLong0.equals(zipLong0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      long long0 = ZipLong.getValue(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-715));
      Object object0 = new Object();
      boolean boolean0 = zipLong0.equals(object0);
      assertFalse(boolean0);
      assertEquals((-715), zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(1L);
      int int0 = zipLong0.getIntValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(1L);
      String string0 = zipLong0.toString();
      assertEquals("ZipLong value: 1", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipLong zipLong0 = new ZipLong(byteArray0);
      zipLong0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipLong zipLong0 = new ZipLong(byteArray0);
      ZipLong zipLong1 = (ZipLong)zipLong0.DD_SIG.clone();
      boolean boolean0 = zipLong1.equals(zipLong0);
      assertFalse(zipLong0.equals((Object)zipLong1));
      assertFalse(boolean0);
      assertEquals(134695760L, zipLong1.getValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipLong zipLong0 = new ZipLong(byteArray0);
      zipLong0.CFH_SIG.putLong(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)80, (byte)75, (byte)1, (byte)2, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }
}
