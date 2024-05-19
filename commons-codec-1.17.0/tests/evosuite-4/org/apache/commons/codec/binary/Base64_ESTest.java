
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
import java.math.BigInteger;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base64_ESTest extends Base64_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte)123;
      Base64 base64_0 = new Base64(732, byteArray0);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-4);
      // Undeclared exception!
      try { 
        Base64.encodeBase64String(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base64 base64_0 = new Base64(85, byteArray0);
      byte[] byteArray1 = base64_0.encode(byteArray0, 85, 0);
      assertFalse(base64_0.isUrlSafe());
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)123;
      // Undeclared exception!
      try { 
        Base64.decodeInteger(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-81);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      byte[] byteArray1 = Base64.toIntegerBytes(bigInteger0);
      assertArrayEquals(new byte[] {(byte) (-81), (byte)0, (byte)0}, byteArray1);
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        Base64.encodeBase64(byteArray0, true, true, 10);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Base64.decodeInteger(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64(64, byteArray0, true, codecPolicy0);
      boolean boolean0 = base64_0.isUrlSafe();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64(1034);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      // Undeclared exception!
      try { 
        Base64.decodeBase64(byteArray1);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        Base64.encodeBase64URLSafeString(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Base64.encodeBase64URLSafeString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64URLSafe((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64URLSafe(byteArray0);
      assertEquals(0, byteArray1.length);
      
      Base64 base64_0 = new Base64(218, byteArray1, true);
      assertTrue(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Base64.encodeBase64String((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64Chunked((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      BigInteger bigInteger0 = new BigInteger(0, mockRandom0);
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, false, 2960);
      byte[] byteArray2 = Base64.encodeBase64Chunked(byteArray1);
      assertArrayEquals(new byte[] {}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null, true, false, 64);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null, false, false);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, true);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null, true);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)121;
      byteArray0[3] = (byte)90;
      byteArray0[4] = (byte)111;
      // Undeclared exception!
      try { 
        Base64.decodeInteger(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)66;
      byteArray0[1] = (byte)111;
      // Undeclared exception!
      try { 
        Base64.decodeInteger(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.decodeBase64((byte[]) null);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)47;
      byteArray0[1] = (byte)95;
      // Undeclared exception!
      try { 
        Base64.decodeBase64(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.decodeBase64((String) null);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.toIntegerBytes((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.isBase64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.isBase64((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.isArrayByteBase64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.encodeInteger((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // bigInteger
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64(false);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64(1383);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64(false);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)114;
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64(0, byteArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [\u0000r]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)116;
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64((-536), byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [\u0000\u0000t\u0000\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = Base64.isBase64(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)69;
      boolean boolean0 = Base64.isBase64(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)111);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)123);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        Base64.encodeBase64(byteArray0, true);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64((-757));
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64(1784);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-52);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      // Undeclared exception!
      try { 
        Base64.encodeInteger(bigInteger0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = BaseNCodec.getChunkSeparator();
      // Undeclared exception!
      try { 
        Base64.encodeBase64URLSafe(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        Base64.encodeBase64(byteArray0, true, true);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      Base64.toIntegerBytes(bigInteger0);
      Base64.Builder base64_Builder0 = Base64.builder();
      // Undeclared exception!
      try { 
        base64_Builder0.get();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64(true);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.decodeBase64("Z)$Nj");
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)121;
      // Undeclared exception!
      try { 
        Base64.decodeInteger(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-7);
      // Undeclared exception!
      try { 
        Base64.decodeInteger(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.decodeBase64("MAq/'=Wenv");
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)121;
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64((-712), byteArray0, false, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [\u0000\u0000y\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64 base64_0 = new Base64(255, (byte[]) null, true, codecPolicy0);
      assertTrue(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base64.Builder base64_Builder0 = new Base64.Builder();
      Base64.Builder base64_Builder1 = base64_Builder0.setEncodeTable(byteArray0);
      // Undeclared exception!
      try { 
        base64_Builder1.get();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // encodeTable must have exactly 64 entries.
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = Base64.isBase64("eTV%m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = Base64.isBase64("~)7i");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte) (-52));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)6);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)61);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Base64.encodeBase64(byteArray0, false, false, (int) (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64((byte)5, byteArray0, false, codecPolicy0);
      byte[] byteArray1 = base64_0.encode(byteArray0);
      assertFalse(base64_0.isUrlSafe());
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      // Undeclared exception!
      try { 
        Base64.encodeInteger(bigInteger0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        Base64.encodeBase64(byteArray0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = Base64.encodeBase64URLSafeString((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.decodeBase64("");
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [C
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Base64.encodeBase64String(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      boolean boolean0 = Base64.isBase64("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Base64.Builder base64_Builder0 = Base64.builder();
      Base64.Builder base64_Builder1 = base64_Builder0.setUrlSafe(true);
      assertSame(base64_Builder1, base64_Builder0);
  }
}
