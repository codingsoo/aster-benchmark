
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
      Base32 base32_0 = new Base32(0);
      boolean boolean0 = base32_0.isInAlphabet("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)119;
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte)0);
      byte[] byteArray1 = base32_0.decode(byteArray0);
      String string0 = base32_0.encodeToString(byteArray1);
      assertEquals("AU\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-45);
      Base32 base32_0 = new Base32((-1946), byteArray0, true);
      byte[] byteArray1 = base32_0.encode(byteArray0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base32 base32_0 = new Base32((-1946), byteArray0, true);
      byte[] byteArray1 = base32_0.encode(byteArray0, (-410), (int) (byte)0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      byte[] byteArray0 = base32_0.decode("\"J%&vISdqUI+wq4");
      assertArrayEquals(new byte[] {(byte) (-97), (byte) (-27), (byte) (-58), (byte) (-21), (byte) (-46), (byte) (-47)}, byteArray0);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      byte[] byteArray0 = new byte[8];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.decode(byteArray0, (-187), 0, baseNCodec_Context0);
      assertFalse(base32_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(1868, (byte[]) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineLength 1868 > 0, but lineSeparator is null
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      byte[] byteArray0 = new byte[4];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.decode(byteArray0, (int) (byte)0, (-1360), baseNCodec_Context0);
      assertFalse(base32_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      byte[] byteArray0 = base32_0.getLineSeparator();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(13, byteArray0, false, (byte) (-70));
      byte[] byteArray1 = base32_0.getLineSeparator();
      assertNotSame(byteArray1, byteArray0);
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(1591, byteArray0, false);
      // Undeclared exception!
      try { 
        base32_0.encode(byteArray0, (int) (byte)76, 1591, (BaseNCodec.Context) null);
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
      Base32 base32_0 = new Base32(5);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, 76, 0, (BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      byte[] byteArray0 = new byte[4];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, (-1), 61, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((byte)0, byteArray0, false, (byte)0, (CodecPolicy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // codecPolicy
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)117;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(1024, byteArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000u\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)104;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(84, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [h\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((byte)11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte) (-32));
      boolean boolean0 = base32_0.isInAlphabet((byte) (-66));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base32 base32_0 = new Base32((-1946), byteArray0, true);
      boolean boolean0 = base32_0.isInAlphabet(byteArray0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      boolean boolean0 = base32_0.isInAlphabet((byte)80);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Base32.Builder base32_Builder0 = new Base32.Builder();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      base32_Builder0.setDecodingPolicy(codecPolicy0);
      Base32 base32_0 = base32_Builder0.get();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)101;
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Base32.Builder base32_Builder0 = Base32.builder();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      base32_Builder0.setDecodingPolicy(codecPolicy0);
      Base32 base32_0 = base32_Builder0.get();
      // Undeclared exception!
      try { 
        base32_0.decode("Zr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      boolean boolean0 = base32_0.isInAlphabet((byte)123);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base32 base32_0 = new Base32((-1946), byteArray0, true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = 76;
      // Undeclared exception!
      try { 
        base32_0.encode(byteArray0, 76, (int) (byte) (-45), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus 76
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-33));
      byte[] byteArray0 = new byte[8];
      String string0 = base32_0.encodeToString(byteArray0);
      assertEquals("AAAAAAAAAAAAA\uFFFD\uFFFD\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base32 base32_0 = new Base32(121, byteArray0);
      byte[] byteArray1 = base32_0.encode(byteArray0);
      assertEquals(23, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Base32 base32_0 = new Base32(533);
      byte[] byteArray0 = new byte[6];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.encode(byteArray0, (-1411), (int) (byte) (-33), baseNCodec_Context0);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)63;
      byteArray0[1] = (byte) (-31);
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte) (-31);
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(110, byteArray0, true, (byte)0, codecPolicy0);
      String string0 = base32_0.encodeAsString(byteArray0);
      assertEquals("7VGGLO8\u0000?\uFFFD\n\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-33));
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = base32_0.encode(byteArray0, (int) (byte) (-33), (int) (byte) (-33));
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Base32 base32_0 = new Base32((-187), (byte[]) null, true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = 64;
      // Undeclared exception!
      try { 
        base32_0.decode((byte[]) null, (-187), (-187), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus 64
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base32 base32_0 = new Base32((-1946), byteArray0, true);
      byte[] byteArray1 = base32_0.decode("org.apache.commons.codec.DecoderException");
      assertEquals(22, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-5);
      Base32 base32_0 = new Base32(121, byteArray0);
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)63;
      byteArray0[1] = (byte) (-31);
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte) (-31);
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(110, byteArray0, true, (byte)0, codecPolicy0);
      byte[] byteArray1 = base32_0.decode("7VGGLO8\u0000?\uFFFD\n\uFFFD");
      assertEquals(4, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)63, (byte) (-31), (byte)10, (byte) (-31)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((-50), byteArray0, true, (byte)9, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(true, (byte)65);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Base32 base32_0 = new Base32(1279);
      byte[] byteArray0 = base32_0.decode(" > 0, but lineSeparator is null");
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_1 = null;
      try {
        base32_1 = new Base32(76, byteArray0, false, (byte)0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\r&\uFFFD4\uFFFD#\uFFFD\u0010M\uFFFDD\uFFFDE]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(64, (byte[]) null, true, (byte)6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineLength 64 > 0, but lineSeparator is null
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[4];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = (int) (byte)54;
      baseNCodec_Context0.modulus = (-418);
      // Undeclared exception!
      try { 
        base32_0.encode(byteArray0, (int) (byte)108, (int) (byte) (-66), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus -418
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Base32.Builder base32_Builder0 = Base32.builder();
      Base32 base32_0 = base32_Builder0.get();
      byte[] byteArray0 = new byte[4];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.encode(byteArray0, (int) (byte)68, (int) (byte)8, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 68
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Base32 base32_0 = new Base32();
      byte[] byteArray0 = base32_0.decode("\"J%&vISdqUI+wq4");
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)77, (byte)81, (byte)33, (byte) (-62), (byte) (-120), (byte) (-76)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Base32 base32_0 = new Base32(1279);
      byte[] byteArray0 = base32_0.getLineSeparator();
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-33));
      byte[] byteArray0 = base32_0.decode("AANN7XYAAAAAA\uFFFD\uFFFD\uFFFD");
      assertEquals(8, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)26, (byte) (-33), (byte) (-33), (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(1591, byteArray0, false);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray1 = base32_0.ensureBufferSize(31, baseNCodec_Context0);
      String string0 = base32_0.encodeToString(byteArray1);
      assertNotNull(string0);
  }
}
