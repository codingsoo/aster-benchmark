
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


package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;
import org.apache.commons.codec.net.QuotedPrintableCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class QuotedPrintableCodec_ESTest extends QuotedPrintableCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-113);
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      assertEquals(10, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)61, (byte)56, (byte)70, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      String string0 = quotedPrintableCodec0.encode("o7w");
      assertEquals("o7w", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(52);
      BitSet bitSet0 = BitSet.valueOf(byteBuffer0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-51);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
      byte[] byteArray2 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-51), (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(4, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      Charset charset0 = quotedPrintableCodec0.getCharset();
      assertNull(charset0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[0];
      byte[] byteArray2 = quotedPrintableCodec0.decode(byteArray1);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      BitSet bitSet0 = BitSet.valueOf(byteBuffer0);
      byte[] byteArray3 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray2, false);
      assertNotSame(byteArray3, byteArray2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long[] longArray0 = new long[0];
      LongBuffer longBuffer0 = LongBuffer.wrap(longArray0);
      BitSet bitSet0 = BitSet.valueOf(longBuffer0);
      byte[] byteArray0 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, (byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      BitSet bitSet0 = BitSet.valueOf(byteBuffer0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.encode("f", charset0);
      assertEquals("f", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      String string0 = quotedPrintableCodec0.encode("UTF-8", "UTF-8");
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.encode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      byte[] byteArray0 = quotedPrintableCodec0.decode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      String string0 = quotedPrintableCodec0.decode("jX{H\"ev", charset0);
      assertEquals("jX{H\"ev", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.decode("UTF-8", "UTF-8");
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      String string0 = quotedPrintableCodec0.decode("org.apache.commons.codec.DecoderException");
      assertEquals("org.apache.commons.codec.DecoderException", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.decode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, true);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.getDefaultCharset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("Q?~~r", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("Objects of type ", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      try { 
        quotedPrintableCodec0.encode("tk:'-\n", "MeKH");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, true);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode((Object) "r7,(Y:Y{p1Ay_~8n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[2] = (byte)61;
      try { 
        QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 0
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte)61;
      try { 
        quotedPrintableCodec0.decode(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 0
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, false);
      try { 
        quotedPrintableCodec0.decode("p=D}{;lE,nZ", (Charset) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 125
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode("", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      try { 
        quotedPrintableCodec0.decode("44v='aaR9LUc[w;*", "k*xpty");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 39
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      try { 
        quotedPrintableCodec0.decode("", "org.apache.commons.codec.net.QuotedPrintableCodec");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      try { 
        quotedPrintableCodec0.decode("@e9!T8=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid quoted-printable encoding
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, true);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode("g1Z-wf");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, true);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode((Object) "org.apache.commons.codec.EncoderException");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = null;
      try {
        quotedPrintableCodec0 = new QuotedPrintableCodec("w");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // w
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = null;
      try {
        quotedPrintableCodec0 = new QuotedPrintableCodec("JY!rsp](]Z$[.");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // JY!rsp](]Z$[.
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      String string0 = quotedPrintableCodec0.encode("", charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.encode((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      String string0 = quotedPrintableCodec0.decode((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      String string0 = quotedPrintableCodec0.decode("", charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)111;
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, false);
      assertEquals(22, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-81);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, false);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, true);
      byte[] byteArray2 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray1, true);
      assertEquals(45, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, true);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BitSet bitSet0 = new BitSet(0);
      byte[] byteArray0 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, (byte[]) null, true);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, true);
      String string0 = quotedPrintableCodec0.encode((String) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.encode("", "UTF-8");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, false);
      String string0 = quotedPrintableCodec0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Object object0 = new Object();
      try { 
        quotedPrintableCodec0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.lang.Object cannot be quoted-printable encoded
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Object object0 = quotedPrintableCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.decode((String) null, ">^kET2:Bk*,rhwl$Z");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.decode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BitSet bitSet0 = new BitSet();
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      try { 
        quotedPrintableCodec0.decode((Object) bitSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.util.BitSet cannot be quoted-printable decoded
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Object object0 = quotedPrintableCodec0.decode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[19];
      byteArray0[0] = (byte) (-113);
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte)32;
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, true);
      assertNotNull(byteArray1);
      assertEquals(24, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte)9;
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, true);
      assertNotNull(byteArray1);
      assertEquals(25, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      Object object0 = quotedPrintableCodec0.encode((Object) "DD{fU|/$_G~SEY<J");
      assertNotNull(object0);
      assertEquals("DD{fU|/$_G~SEY<J", object0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = quotedPrintableCodec0.encode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte)10;
      byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)13;
      byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[19];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      BitSet bitSet0 = BitSet.valueOf(byteBuffer0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      byte[] byteArray2 = quotedPrintableCodec0.decode(byteArray1);
      assertNotNull(byteArray2);
      assertEquals(19, byteArray2.length);
      assertEquals(57, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = QuotedPrintableCodec.decodeQuotedPrintable((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Object object0 = quotedPrintableCodec0.decode((Object) "lf-ftWGP#<]Y3j");
      assertNotNull(object0);
      assertEquals("lf-ftWGP#<]Y3j", object0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.decode("", "UTF-8");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.getDefaultCharset();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = null;
      try {
        quotedPrintableCodec0 = new QuotedPrintableCodec((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
