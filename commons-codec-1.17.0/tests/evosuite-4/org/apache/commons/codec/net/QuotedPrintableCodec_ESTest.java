
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
      BitSet bitSet0 = new BitSet();
      byte[] byteArray0 = new byte[19];
      byteArray0[0] = (byte)93;
      bitSet0.set((int) (byte)53);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      byte[] byteArray2 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray1, true);
      assertNotNull(byteArray2);
      assertEquals(175, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long[] longArray0 = new long[6];
      BitSet bitSet0 = BitSet.valueOf(longArray0);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      assertArrayEquals(new byte[] {(byte)61, (byte)48, (byte)48, (byte)61, (byte)48, (byte)48, (byte)61, (byte)48, (byte)48}, byteArray1);
      assertEquals(9, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)61;
      try { 
        QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid quoted-printable encoding
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      Charset charset0 = quotedPrintableCodec0.getCharset();
      assertNull(charset0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(16);
      BitSet bitSet0 = BitSet.valueOf(byteBuffer0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, false);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, (byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(126);
      LongBuffer longBuffer0 = byteBuffer0.asLongBuffer();
      BitSet bitSet0 = BitSet.valueOf(longBuffer0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)61, (byte)48, (byte)48, (byte)61, (byte)48, (byte)48}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.encode("", charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      String string0 = quotedPrintableCodec0.encode("UTF-8", "UTF-8");
      assertEquals("UTF-8", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      String string0 = quotedPrintableCodec0.encode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      Object object0 = quotedPrintableCodec0.encode((Object) "UTF-8");
      assertNotNull(object0);
      assertEquals("UTF-8", object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = quotedPrintableCodec0.decode(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.decode("", charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      String string0 = quotedPrintableCodec0.decode("UTF-8", "UTF-8");
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.decode("org.apache.commons.codec.DecoderException");
      assertEquals("org.apache.commons.codec.DecoderException", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      String string0 = quotedPrintableCodec0.decode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
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
  public void test20()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("Invalid quoted-printable encoding", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("dTU/`j751(@SUK>R", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("Invalid URL encoding: not a valid digit (radix 16): ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode((Object) "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Charset charset0 = Charset.defaultCharset();
      try { 
        quotedPrintableCodec0.decode("lZ>>=OvZ", charset0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 79
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode("UTF-8", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      try { 
        quotedPrintableCodec0.decode("=\"s/3!{$_GW4}iB`", " cannot be quoted-printable decoded");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 34
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode(" cannot be quoted-printable decoded", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      try { 
        quotedPrintableCodec0.decode("=QPqh5@>=ccix~#+e_-");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 81
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode((Object) "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = null;
      try {
        quotedPrintableCodec0 = new QuotedPrintableCodec("org.apache.commons.codec.EncoderException");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.apache.commons.codec.EncoderException
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      String string0 = quotedPrintableCodec0.encode("B1''E-", charset0);
      assertNotNull(string0);
      assertEquals("B1''E-", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      String string0 = quotedPrintableCodec0.decode((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.decode(" cannot be quoted-printable decoded", charset0);
      assertEquals(" cannot be quoted-printable decoded", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)120;
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, false);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BitSet bitSet0 = new BitSet();
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-118);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, false);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, (byte[]) null, true);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)10;
      byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)61;
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
  public void test40()  throws Throwable  {
      byte[] byteArray0 = QuotedPrintableCodec.decodeQuotedPrintable((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.encode((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      try { 
        quotedPrintableCodec0.encode("Q@$", "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      String string0 = quotedPrintableCodec0.encode((String) null, (Charset) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      Object object0 = quotedPrintableCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      Object object0 = quotedPrintableCodec0.encode((Object) "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      String string0 = quotedPrintableCodec0.decode((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      try { 
        quotedPrintableCodec0.decode(" cannot be quoted-printable decoded", "yh-oF8C");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.decode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 0, 0);
      try { 
        quotedPrintableCodec0.decode((Object) byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.nio.HeapByteBuffer cannot be quoted-printable decoded
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      Object object0 = quotedPrintableCodec0.decode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      Object object0 = quotedPrintableCodec0.decode((Object) "");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BitSet bitSet0 = new BitSet();
      byte[] byteArray0 = new byte[19];
      byteArray0[4] = (byte) (-99);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      assertEquals(57, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.encode("lf%6#4]Rb103iUF");
      assertEquals("lf%6#4]Rb103iUF", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BitSet bitSet0 = new BitSet();
      byte[] byteArray0 = new byte[19];
      byteArray0[4] = (byte) (-99);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte)32;
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, true);
      assertNotNull(byteArray1);
      assertEquals(15, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)9;
      long[] longArray0 = new long[1];
      longArray0[0] = (-19L);
      BitSet bitSet0 = BitSet.valueOf(longArray0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)9, (byte)0, (byte)0}, byteArray1);
      assertEquals(6, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, true);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = quotedPrintableCodec0.encode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BitSet bitSet0 = new BitSet();
      byte[] byteArray0 = new byte[7];
      bitSet0.set(0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      assertEquals(7, byteArray1.length);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)13;
      byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      BitSet bitSet0 = new BitSet();
      byte[] byteArray0 = new byte[19];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      assertNotNull(byteArray1);
      
      byte[] byteArray2 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray1, true);
      byte[] byteArray3 = quotedPrintableCodec0.decode(byteArray2);
      assertEquals(57, byteArray3.length);
      assertEquals(177, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.encode("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.getDefaultCharset();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = quotedPrintableCodec0.decode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = null;
      try {
        quotedPrintableCodec0 = new QuotedPrintableCodec("aGB-+_j118.Y6#Ad");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // aGB-+_j118.Y6#Ad
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode(" cannot be quoted-printable encoded");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
