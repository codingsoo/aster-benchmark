
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
import java.math.BigInteger;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipEightByteInteger_ESTest extends ZipEightByteInteger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0, (byte)0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-68);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, (int) (byte)0);
      assertEquals((short)188, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      byte[] byteArray0 = zipEightByteInteger0.getBytes();
      ZipEightByteInteger.getValue(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      BigInteger bigInteger1 = ZipEightByteInteger.getValue(byteArray0);
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      BigInteger bigInteger1 = zipEightByteInteger0.getValue();
      assertSame(bigInteger0, bigInteger1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      BigInteger bigInteger1 = zipEightByteInteger0.getValue();
      assertEquals((byte)1, bigInteger1.byteValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)17;
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, (int) (byte)0);
      assertEquals(1114112L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes((-1917L));
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, 0);
      assertEquals((-1917L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals(0L, long0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals(10L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(2939L);
      long long0 = zipEightByteInteger0.ZERO.getLongValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-1917L));
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals((-1917L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      // Undeclared exception!
      try { 
        zipEightByteInteger0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      byte[] byteArray0 = zipEightByteInteger0.getBytes();
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue(byteArray0, (-1829));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1822
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getLongValue(byteArray0, (-128));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -121
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getLongValue((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getLongValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      // Undeclared exception!
      try { 
        zipEightByteInteger0.getLongValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getBytes((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      // Undeclared exception!
      try { 
        zipEightByteInteger0.getBytes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = null;
      try {
        zipEightByteInteger0 = new ZipEightByteInteger((byte[]) null, 579);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ZipEightByteInteger zipEightByteInteger0 = null;
      try {
        zipEightByteInteger0 = new ZipEightByteInteger(byteArray0, (byte)126);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 133
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = null;
      try {
        zipEightByteInteger0 = new ZipEightByteInteger((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipEightByteInteger zipEightByteInteger0 = null;
      try {
        zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, (int) (byte)0);
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes((-1675L));
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)117, (byte) (-7), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
      assertEquals((short) (-1675), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-4);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      byte[] byteArray1 = ZipEightByteInteger.getBytes(bigInteger0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-4), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-1917L));
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertEquals((byte) (-125), bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-1920L));
      Object object0 = new Object();
      boolean boolean0 = zipEightByteInteger0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-1920L));
      String string0 = zipEightByteInteger0.ZERO.toString();
      assertEquals("ZipEightByteInteger value: 0", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes((-1920L));
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals((-1920L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      boolean boolean0 = zipEightByteInteger0.equals(zipEightByteInteger0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-1920L));
      zipEightByteInteger0.hashCode();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes((-1920L));
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-128), (byte) (-8), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
      assertEquals((short) (-1920), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getLongValue((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }
}
