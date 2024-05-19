
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
import org.apache.commons.codec.binary.Base16;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BaseNCodec_ESTest extends BaseNCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Base64 base64_0 = new Base64(1353);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.readPos = 2147483639;
      int int0 = base64_0.available(baseNCodec_Context0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = 0;
      baseNCodec_Context0.modulus = 89;
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=89, pos=0, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.pos = (int) (byte)89;
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=0, pos=89, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.readPos = (-81);
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=0, pos=0, readPos=-81]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.ibitWorkArea = 64;
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=64, lbitWorkArea=0, modulus=0, pos=0, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = base32_0.encode(byteArray0, 416, 416);
      int int0 = BaseNCodec.toLength(byteArray1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = BaseNCodec.toLength(byteArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.eof = true;
      int int0 = base32_0.readResults(baseNCodec_Context0.buffer, 0, 2740, baseNCodec_Context0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = BaseNCodec.isWhiteSpace((byte)29);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      boolean boolean0 = base16_0.isInAlphabet("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Base64 base64_0 = new Base64(2998);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      boolean boolean0 = base64_0.hasData(baseNCodec_Context0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      Base32 base32_0 = new Base32();
      long long0 = base32_0.getEncodedLength(byteArray1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64(63, byteArray0, true, codecPolicy0);
      long long0 = base64_0.getEncodedLength(byteArray0);
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Base16 base16_0 = new Base16(true);
      int int0 = base16_0.getDefaultBufferSize();
      assertEquals(8192, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)0);
      byte[] byteArray0 = Base64.decodeBase64("K");
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.buffer = byteArray0;
      byte[] byteArray1 = base32_0.ensureBufferSize((-1226), baseNCodec_Context0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      String string0 = base16_0.encodeToString((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Base32 base32_0 = new Base32();
      byte[] byteArray0 = new byte[0];
      String string0 = base32_0.encodeToString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      byte[] byteArray0 = new byte[9];
      String string0 = base16_0.encodeAsString(byteArray0);
      assertEquals("000000000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = base32_0.encode(byteArray0, 416, 416);
      Base64 base64_0 = new Base64();
      String string0 = base64_0.encodeAsString(byteArray1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = base64_0.encode((byte[]) null, 596, 596);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Base32 base32_0 = new Base32(2481);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray0 = base32_0.ensureBufferSize(2481, baseNCodec_Context0);
      byte[] byteArray1 = base32_0.encode(byteArray0, 4024, 46);
      assertEquals(8192, byteArray0.length);
      assertEquals(82, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = base16_0.encode(byteArray0);
      assertEquals(18, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64(1551, byteArray0, true);
      byte[] byteArray1 = base64_0.encode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base64 base64_0 = new Base64(0, byteArray0);
      byte[] byteArray1 = base64_0.decode((byte[]) null);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)110;
      Base32 base32_0 = new Base32(true);
      assertFalse(base32_0.isStrictDecoding());
      
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertArrayEquals(new byte[] {(byte)5}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Base32 base32_0 = new Base32(6);
      byte[] byteArray0 = base32_0.decode("");
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertEquals(0, byteArray0.length);
      assertSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = base16_0.decode((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Base64 base64_0 = new Base64(1353);
      byte[] byteArray0 = base64_0.decode("$VALUES");
      assertArrayEquals(new byte[] {(byte)84, (byte)2, (byte) (-44), (byte)17}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64((-790), byteArray0, false, codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.pos = 61;
      int int0 = base64_0.available(baseNCodec_Context0);
      assertEquals(61, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      byte[] byteArray0 = new byte[9];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.readPos = (-1581);
      // Undeclared exception!
      try { 
        base16_0.readResults(byteArray0, 54, (byte)0, baseNCodec_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64((-790), byteArray0, false, codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base64_0.ensureBufferSize((-790), baseNCodec_Context0);
      baseNCodec_Context0.pos = 61;
      Base32 base32_0 = new Base32();
      // Undeclared exception!
      try { 
        base32_0.readResults(byteArray0, (-5863), (byte)36, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Base32 base32_0 = new Base32((-1685), byteArray0);
      // Undeclared exception!
      try { 
        base32_0.isInAlphabet((byte[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      // Undeclared exception!
      try { 
        base32_0.isInAlphabet((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte)0);
      // Undeclared exception!
      try { 
        base32_0.hasData((BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64(63, byteArray0, true, codecPolicy0);
      // Undeclared exception!
      try { 
        base64_0.getEncodedLength((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      // Undeclared exception!
      try { 
        base16_0.ensureBufferSize((-2160), (BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Base16 base16_0 = new Base16(true);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        base16_0.encode(byteArray0, 1160, 314);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1160
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Base64 base64_0 = new Base64();
      // Undeclared exception!
      try { 
        base64_0.available((BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)0);
      boolean boolean0 = base32_0.isStrictDecoding();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64(7, byteArray0, true, codecPolicy0);
      boolean boolean0 = base64_0.isStrictDecoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("Input array too big, the output array would be bigger (");
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = new Base32((-2145), byteArray0, true, (byte)0, codecPolicy0);
      boolean boolean0 = base32_0.isInAlphabet(byteArray0, true);
      assertEquals(32, byteArray0.length);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Base32 base32_0 = new Base32(2481);
      byte[] byteArray0 = base32_0.encode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Base16 base16_0 = new Base16(true);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        base16_0.decode(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 0
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64(0, byteArray0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      int int0 = base64_0.readResults(byteArray0, 4761, 4761, baseNCodec_Context0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = base16_0.isInAlphabet(byteArray0, false);
      assertFalse(boolean0);
      assertTrue(base16_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true);
      Base32 base32_0 = new Base32(123);
      boolean boolean0 = base32_0.isInAlphabet(byteArray1, true);
      //  // Unstable assertion: assertFalse(boolean0);
      //  // Unstable assertion: assertEquals(14, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Base32 base32_0 = new Base32(123);
      Object object0 = new Object();
      try { 
        base32_0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Base-N encode is not a byte[]
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      Base32 base32_0 = new Base32((-5460), (byte[]) null, false);
      assertFalse(base32_0.isStrictDecoding());
      
      Object object0 = base32_0.decode((Object) "J<H-,c$YX!^&%z");
      Object object1 = base16_0.encode(object0);
      assertTrue(base16_0.isStrictDecoding());
      assertNotSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64(123, byteArray0, false, codecPolicy0);
      Object object0 = base64_0.decode((Object) "AA==\u0000");
      base64_0.decode(object0);
      assertTrue(base64_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      try { 
        base64_0.decode((Object) codecPolicy0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Base-N decode is not a byte[] or a String
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte) (-91));
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true, 64);
      boolean boolean0 = base32_0.containsAlphabetOrPad(byteArray1);
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)13, (byte)10}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-69);
      Base32 base32_0 = new Base32((-2102), byteArray0, true, (byte) (-69));
      boolean boolean0 = base32_0.containsAlphabetOrPad(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      boolean boolean0 = base16_0.containsAlphabetOrPad((byte[]) null);
      assertTrue(base16_0.isStrictDecoding());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base32 base32_0 = new Base32((-4147), byteArray0, true, (byte) (-24));
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.buffer = byteArray0;
      byte[] byteArray1 = base32_0.ensureBufferSize(16, baseNCodec_Context0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      Base64 base64_0 = new Base64();
      base64_0.ensureBufferSize(66, baseNCodec_Context0);
      Base64.encodeBase64(baseNCodec_Context0.buffer, false);
      // Undeclared exception!
      base64_0.encode(baseNCodec_Context0.buffer);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Base64.Builder base64_Builder0 = Base64.builder();
      assertNotNull(base64_Builder0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base32 base32_0 = new Base32((-4147), byteArray0, true, (byte) (-24));
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      String string0 = base32_0.encodeAsString(baseNCodec_Context0.buffer);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = BaseNCodec.isWhiteSpace((byte)48);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      boolean boolean0 = base16_0.isInAlphabet("J<H-,c$YX!^&%z");
      assertEquals(CodecPolicy.STRICT, base16_0.getCodecPolicy());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte) (-91));
      byte[] byteArray0 = new byte[4];
      String string0 = base32_0.encodeToString(byteArray0);
      assertEquals("0000000\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base32 base32_0 = new Base32((-4147), byteArray0, true, (byte) (-24));
      CodecPolicy codecPolicy0 = base32_0.getCodecPolicy();
      assertEquals(CodecPolicy.LENIENT, codecPolicy0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Base16 base16_0 = new Base16();
      // Undeclared exception!
      try { 
        base16_0.decode("!m`Qa'eQ+bTc=KPh3G{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 33
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = BaseNCodec.getChunkSeparator();
      assertArrayEquals(new byte[] {(byte)13, (byte)10}, byteArray0);
  }
}
