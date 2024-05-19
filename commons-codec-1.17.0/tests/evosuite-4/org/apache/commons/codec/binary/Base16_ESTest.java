
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
import org.apache.commons.codec.binary.BaseNCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base16_ESTest extends Base16_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      boolean boolean0 = base16_0.isInAlphabet((byte)103);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Base16 base16_0 = new Base16(true);
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-9);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base16_0.encode(byteArray0, (int) (byte)0, 2, baseNCodec_Context0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-9), (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      byte[] byteArray0 = new byte[0];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base16_0.encode(byteArray0, 2147483608, 904, baseNCodec_Context0);
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Base16 base16_0 = new Base16(true);
      byte[] byteArray0 = new byte[2];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base16_0.encode(byteArray0, 2719, (int) (byte)0, baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)71;
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      // Undeclared exception!
      try { 
        base16_0.decode(byteArray0, 2, 18, baseNCodec_Context0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 71
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      byte[] byteArray0 = new byte[8];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.ibitWorkArea = (-508);
      // Undeclared exception!
      try { 
        base16_0.decode(byteArray0, (int) (byte)0, 63, baseNCodec_Context0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 0
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      byte[] byteArray0 = new byte[0];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base16_0.decode(byteArray0, 1729, 128, baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Base16 base16_0 = new Base16(true);
      byte[] byteArray0 = new byte[0];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.ibitWorkArea = (-1582);
      base16_0.encode(byteArray0, (-741), (-996), baseNCodec_Context0);
      base16_0.decode(byteArray0, (-996), 2147483639, baseNCodec_Context0);
      assertFalse(base16_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Base16 base16_0 = new Base16(true);
      byte[] byteArray0 = new byte[2];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base16_0.decode(byteArray0, 0, (int) (byte)0, baseNCodec_Context0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)56;
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.ibitWorkArea = (-69);
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      base16_0.decode(byteArray0, 2, 7, baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)56;
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      base16_0.decode(byteArray0, 2, 76, baseNCodec_Context0);
      assertTrue(base16_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        base16_0.encode(byteArray0, 90, (int) (byte)72, (BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Base16 base16_0 = new Base16(true);
      byte[] byteArray0 = new byte[4];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base16_0.encode(byteArray0, (int) (byte) (-9), 76, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -9
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        base16_0.decode(byteArray0, (int) (byte)13, 0, (BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Base16 base16_0 = null;
      try {
        base16_0 = new Base16(false, (CodecPolicy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // codecPolicy
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[2];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.ibitWorkArea = 3;
      baseNCodec_Context0.eof = true;
      base16_0.decode(byteArray0, 64, 3, baseNCodec_Context0);
      assertFalse(base16_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      boolean boolean0 = base16_0.isInAlphabet((byte)50);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = base16_0.isInAlphabet(byteArray0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Base16 base16_0 = new Base16();
      boolean boolean0 = base16_0.isInAlphabet((byte) (-7));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[0];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base16_0.encode(byteArray0, 64, 2147483623, baseNCodec_Context0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input length exceeds maximum size for encoded data: 2147483623
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = base16_0.encode(byteArray0, 64, (-5354));
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      // Undeclared exception!
      try { 
        base16_0.decode("Parameter supplied to Base-N encode is not a byte[]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 80
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)56;
      byteArray0[1] = (byte)56;
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      // Undeclared exception!
      try { 
        base16_0.decode(byteArray0, (int) (byte)0, (int) (byte)56, baseNCodec_Context0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 0
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      byte[] byteArray0 = base16_0.decode("000000000000000000");
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[0];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.ibitWorkArea = 76;
      // Undeclared exception!
      try { 
        base16_0.decode(byteArray0, 0, 63, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.ibitWorkArea = 64;
      // Undeclared exception!
      try { 
        base16_0.decode((byte[]) null, (-625), (-625), baseNCodec_Context0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character is a valid base 16 alphabet character but not a possible encoding. Decoding requires at least two characters to create one byte.
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }
}
