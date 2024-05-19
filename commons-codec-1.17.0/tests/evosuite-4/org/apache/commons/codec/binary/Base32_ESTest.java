
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
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.BaseNCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base32_ESTest extends Base32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)123);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32((-1457), byteArray0, true, (byte) (-40));
      byte[] byteArray1 = new byte[6];
      String string0 = base32_0.encodeAsString(byteArray1);
      assertEquals("0000000000\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)86;
      byte[] byteArray1 = base32_0.encode(byteArray0);
      assertArrayEquals(new byte[] {(byte)75, (byte)89, (byte)61, (byte)61, (byte)61, (byte)61, (byte)61, (byte)61}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[7] = (byte)123;
      Base32 base32_0 = new Base32();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.decode(byteArray0, (int) (byte)0, 8, baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)0);
      byte[] byteArray0 = new byte[0];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.decode(byteArray0, (int) (byte)0, 0, baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      byte[] byteArray0 = base32_0.decode("^VByK");
      assertArrayEquals(new byte[] {(byte) (-88), (byte)112}, byteArray0);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Base32 base32_0 = new Base32((-695));
      byte[] byteArray0 = base32_0.decode("[I#k*m/4#o1itsG*ba>");
      assertArrayEquals(new byte[] {(byte)66, (byte) (-103), (byte) (-57), (byte)34, (byte)114, (byte)48}, byteArray0);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte)0, codecPolicy0);
      boolean boolean0 = base32_0.isInAlphabet((byte)66);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base32 base32_0 = new Base32(1, byteArray0, false, (byte) (-74));
      byte[] byteArray1 = base32_0.getLineSeparator();
      assertNotSame(byteArray1, byteArray0);
      assertEquals(3, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(29, byteArray0);
      byte[] byteArray1 = base32_0.getLineSeparator();
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Base32 base32_0 = new Base32();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.encode((byte[]) null, 2, 64, baseNCodec_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(11, byteArray0, true);
      byte[] byteArray1 = base32_0.decode(" > 0, but lineSeparator is null");
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.encode(byteArray1, 121, 8179, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 121
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(990, byteArray0, false);
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, 1477, (int) (byte)0, (BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base32 base32_0 = new Base32(1, byteArray0, false, (byte) (-74));
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, 61, 41, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 61
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)97;
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(69, byteArray0, true, (byte) (-69), codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [a\u0000\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)67;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(76, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000\u0000C\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(11, byteArray0, true);
      boolean boolean0 = base32_0.isInAlphabet((byte) (-116));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Base32 base32_0 = new Base32((-1862), byteArray0, false);
      boolean boolean0 = base32_0.isInAlphabet((byte)61);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte)0, codecPolicy0);
      byte[] byteArray1 = base32_0.decode("[^llWIk\"");
      assertArrayEquals(new byte[] {(byte)90, (byte) (-20), (byte) (-123)}, byteArray1);
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(0, byteArray0, true, (byte) (-37), codecPolicy0);
      boolean boolean0 = base32_0.isInAlphabet("bdF]br/%ys;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte) (-1);
      Base32 base32_0 = new Base32((-1862), byteArray0, false);
      String string0 = base32_0.encodeAsString(byteArray0);
      assertEquals("AAAAAAH7AAAAAAA=", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(2395, byteArray0);
      byte[] byteArray1 = base32_0.encode(byteArray0, 97, 0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Base32 base32_0 = new Base32((-1862), byteArray0, false);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = (-89);
      // Undeclared exception!
      try { 
        base32_0.encode((byte[]) null, (int) (byte)84, (-281), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus -89
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-9));
      byte[] byteArray0 = new byte[3];
      String string0 = base32_0.encodeToString(byteArray0);
      assertEquals("AAAAA\uFFFD\uFFFD\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Base32 base32_0 = new Base32(0, byteArray0, false);
      String string0 = base32_0.encodeToString(byteArray0);
      assertEquals("AAAA====", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(26);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0002Y]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Base32 base32_0 = new Base32(false, (byte)95);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = 76;
      // Undeclared exception!
      try { 
        base32_0.decode((byte[]) null, (-1432), (-1432), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus 76
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Base32 base32_0 = new Base32(0, (byte[]) null, false);
      byte[] byteArray0 = base32_0.decode("d1H_nP!k]x");
      assertArrayEquals(new byte[] {(byte)25, (byte) (-38), (byte) (-11)}, byteArray0);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte)0, codecPolicy0);
      // Undeclared exception!
      try { 
        base32_0.decode("[^]lWIk\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(0, byteArray0, true, (byte)0, codecPolicy0);
      // Undeclared exception!
      try { 
        base32_0.decode("[^]lWIk\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)75;
      byteArray0[7] = (byte)55;
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertEquals(1, byteArray1.length);
      assertArrayEquals(new byte[] {(byte) (-95)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(11, byteArray0, true);
      byte[] byteArray1 = base32_0.decode(" > 0, but lineSeparator is null");
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.encode(byteArray1, (int) (byte) (-116), (int) (byte) (-116), baseNCodec_Context0);
      assertEquals(14, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Base32 base32_0 = new Base32();
      byte[] byteArray0 = base32_0.decode("c=UeBf%6|?3!xoI");
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)1;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(66, byteArray0, true, (byte)1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000\u0001\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte)122;
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Base32.Builder base32_Builder0 = new Base32.Builder();
      Base32 base32_0 = base32_Builder0.get();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Base32.Builder base32_Builder0 = Base32.builder();
      assertNotNull(base32_Builder0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Base32 base32_0 = new Base32();
      byte[] byteArray0 = base32_0.getLineSeparator();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(false, (byte)29);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((byte)79);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(10, (byte[]) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineLength 10 > 0, but lineSeparator is null
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }
}
