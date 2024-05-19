
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


package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.binary.BinaryCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BinaryCodec_ESTest extends BinaryCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)57;
      byte[] byteArray1 = binaryCodec0.decode(byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = binaryCodec0.toByteArray("KMl<~99cf/obUGvt");
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = BinaryCodec.isEmpty(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = BinaryCodec.toAsciiBytes(byteArray0);
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray2 = BinaryCodec.toAsciiBytes(byteArray1);
      byte[] byteArray3 = binaryCodec0.encode(byteArray2);
      // Undeclared exception!
      BinaryCodec.toAsciiChars(byteArray3);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[26];
      byte[] byteArray1 = BinaryCodec.toAsciiBytes(byteArray0);
      byte[] byteArray2 = BinaryCodec.toAsciiBytes(byteArray1);
      // Undeclared exception!
      BinaryCodec.toAsciiBytes(byteArray2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = BinaryCodec.toAsciiChars((byte[]) null);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = BinaryCodec.fromAscii(byteArray0);
      byte[] byteArray2 = BinaryCodec.toAsciiBytes(byteArray1);
      assertEquals(0, byteArray2.length);
      assertNotSame(byteArray2, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)15;
      char[] charArray0 = BinaryCodec.toAsciiChars(byteArray0);
      byte[] byteArray1 = BinaryCodec.fromAscii(charArray0);
      assertArrayEquals(new byte[] {(byte)15, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[3];
      byte[] byteArray0 = BinaryCodec.fromAscii(charArray0);
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray1 = binaryCodec0.encode(byteArray0);
      byte[] byteArray2 = BinaryCodec.fromAscii(byteArray1);
      assertSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = binaryCodec0.toByteArray((String) null);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = binaryCodec0.toByteArray("");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      try { 
        binaryCodec0.encode((Object) "`09op=VV1>qQ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // argument not a byte array
         //
         verifyException("org.apache.commons.codec.binary.BinaryCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      Object object0 = new Object();
      try { 
        binaryCodec0.decode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // argument not a byte array
         //
         verifyException("org.apache.commons.codec.binary.BinaryCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      Object object0 = binaryCodec0.decode((Object) "01011100100111111000010010100001");
      Object object1 = binaryCodec0.encode(object0);
      Object object2 = binaryCodec0.decode(object1);
      assertNotSame(object2, object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      Object object0 = binaryCodec0.decode((Object) null);
      Object object1 = binaryCodec0.decode(object0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)76;
      String string0 = BinaryCodec.toAsciiString(byteArray0);
      assertEquals("0000000000000000000000000000000001001100", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = BinaryCodec.fromAscii(byteArray0);
      String string0 = BinaryCodec.toAsciiString(byteArray1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray1 = binaryCodec0.decode(byteArray0);
      boolean boolean0 = BinaryCodec.isEmpty(byteArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = BinaryCodec.fromAscii(charArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = BinaryCodec.fromAscii((char[]) null);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)125;
      byte[] byteArray1 = binaryCodec0.encode(byteArray0);
      byte[] byteArray2 = BinaryCodec.fromAscii(byteArray1);
      assertArrayEquals(new byte[] {(byte)125, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(64, byteArray1.length);
  }
}
