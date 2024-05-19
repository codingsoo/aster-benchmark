
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
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      ZipLong zipLong1 = ZipLong.DD_SIG;
      boolean boolean0 = zipLong0.equals(zipLong1);
      assertEquals(134695760L, zipLong1.getValue());
      assertFalse(boolean0);
      assertFalse(zipLong1.equals((Object)zipLong0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ZipLong zipLong0 = new ZipLong(byteArray0, (byte)1);
      assertEquals(0L, zipLong0.getValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long long0 = ZipLong.getValue(byteArray0, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)1;
      long long0 = ZipLong.getValue(byteArray0, 1);
      assertEquals(256L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      long long0 = ZipLong.getValue(byteArray0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0);
      long long0 = zipLong0.getValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.DD_SIG;
      int int0 = zipLong0.getIntValue();
      assertEquals(134695760, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      int int0 = zipLong0.getIntValue();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      // Undeclared exception!
      try { 
        zipLong0.AED_SIG.putLong((byte[]) null, 615);
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
      ZipLong zipLong0 = new ZipLong(0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        zipLong0.putLong(byteArray0, 1868);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1868
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipLong.putLong(808471376L, (byte[]) null, (-429));
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
      // Undeclared exception!
      try { 
        ZipLong.getValue((byte[]) null, 0);
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
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ZipLong.getValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = ZipLong.getBytes(0L);
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong(byteArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ZipLong.putLong(0L, byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ZipLong.getValue(byteArray0, 2357);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2357
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      long long0 = zipLong0.getValue();
      assertEquals(33639248L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      ZipLong zipLong1 = new ZipLong((-18L));
      boolean boolean0 = zipLong0.equals(zipLong1);
      assertEquals((-18L), zipLong1.getValue());
      assertFalse(boolean0);
      assertFalse(zipLong1.equals((Object)zipLong0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipLong zipLong0 = new ZipLong(byteArray0);
      boolean boolean0 = zipLong0.equals(zipLong0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long long0 = ZipLong.getValue(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-31));
      boolean boolean0 = zipLong0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals((-31), zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipLong zipLong0 = new ZipLong(byteArray0);
      int int0 = zipLong0.getIntValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipLong zipLong0 = new ZipLong(byteArray0);
      String string0 = zipLong0.toString();
      assertEquals("ZipLong value: 0", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.DD_SIG;
      zipLong0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipLong zipLong0 = new ZipLong(byteArray0);
      Object object0 = zipLong0.DD_SIG.clone();
      assertNotSame(object0, zipLong0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipLong zipLong0 = new ZipLong(byteArray0);
      zipLong0.putLong(byteArray0, (int) (byte)0);
      assertEquals(0L, zipLong0.getValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.AED_SIG;
      byte[] byteArray0 = zipLong0.getBytes();
      // Undeclared exception!
      try { 
        ZipLong.putLong(0L, byteArray0, (-1903));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1903
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong((byte[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }
}
