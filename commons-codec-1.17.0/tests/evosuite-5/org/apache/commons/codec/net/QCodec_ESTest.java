
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
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.net.QCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class QCodec_ESTest extends QCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)95;
      byteArray0[2] = (byte)124;
      byte[] byteArray1 = qCodec0.doDecoding(byteArray0);
      assertArrayEquals(new byte[] {(byte)32, (byte)0, (byte)124, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Object object0 = qCodec0.decode((Object) "=?UTF-8?Q?=5FWKZ:Mv[|bda?=");
      assertEquals("_WKZ:Mv[|bda", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.setEncodeBlanks(true);
      boolean boolean0 = qCodec0.isEncodeBlanks();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      String string0 = qCodec0.getEncoding();
      assertEquals("Q", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      String string0 = qCodec0.encode((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      String string0 = qCodec0.encode((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      String string0 = qCodec0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = qCodec0.doEncoding(byteArray0);
      assertNotNull(byteArray1);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = qCodec0.doDecoding(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.decode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.decode("=?UTF-8?Q??=");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encode("Q", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      try { 
        qCodec0.encode("Objects of type ", "charset");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // charset
         //
         verifyException("org.apache.commons.codec.net.QCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      // Undeclared exception!
      try { 
        qCodec0.encode("hWv$@vP4i+;*a)}", "");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)61;
      try { 
        qCodec0.doDecoding(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 0
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      try { 
        qCodec0.decode("us~o{OLi");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: malformed encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QCodec qCodec0 = null;
      try {
        qCodec0 = new QCodec((Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QCodec qCodec0 = null;
      try {
        qCodec0 = new QCodec("org.apache.commons.codec.net.RFC1522Codec");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.apache.commons.codec.net.RFC1522Codec
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QCodec qCodec0 = null;
      try {
        qCodec0 = new QCodec((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.decode("=?UTF-8?Q?*V?=");
      assertEquals("*V", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = qCodec0.encode("*V", charset0);
      assertEquals("=?UTF-8?Q?*V?=", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Object object0 = new Object();
      try { 
        qCodec0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.lang.Object cannot be encoded using Q codec
         //
         verifyException("org.apache.commons.codec.net.QCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Object object0 = qCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.setEncodeBlanks(true);
      qCodec0.encode("/;{^\"04A ?");
      assertTrue(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.setEncodeBlanks(true);
      byte[] byteArray0 = new byte[24];
      qCodec0.doEncoding(byteArray0);
      assertTrue(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      byte[] byteArray0 = qCodec0.doEncoding((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      byte[] byteArray0 = qCodec0.doDecoding((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Object object0 = new Object();
      try { 
        qCodec0.decode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.lang.Object cannot be decoded using Q codec
         //
         verifyException("org.apache.commons.codec.net.QCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Object object0 = qCodec0.decode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      qCodec0.setEncodeBlanks(true);
      qCodec0.encode((Object) "");
      assertTrue(qCodec0.isEncodeBlanks());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      boolean boolean0 = qCodec0.isEncodeBlanks();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QCodec qCodec0 = null;
      try {
        qCodec0 = new QCodec("");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      // Undeclared exception!
      try { 
        qCodec0.encode(" cannot be quoted-printable decoded", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
