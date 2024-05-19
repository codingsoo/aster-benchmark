
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
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.net.BCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BCodec_ESTest extends BCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.getEncoding();
      assertEquals("B", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      String string0 = bCodec0.encode((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      String string0 = bCodec0.encode((String) null, "wM}u^||A");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = bCodec0.doEncoding(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = bCodec0.doEncoding(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte)67;
      byte[] byteArray1 = bCodec0.doDecoding(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = bCodec0.doDecoding(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.decode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      String string0 = bCodec0.decode("=?UTF-8?B??=");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode("", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      try { 
        bCodec0.encode("o2-4(Aty", "3h");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 3h
         //
         verifyException("org.apache.commons.codec.net.BCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode(".O1jSjw4Cu g$+XjB", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte)114;
      // Undeclared exception!
      try { 
        bCodec0.doDecoding(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      try { 
        bCodec0.decode("qTyT");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: malformed encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      BCodec bCodec0 = null;
      try {
        bCodec0 = new BCodec((Charset) null, codecPolicy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BCodec bCodec0 = null;
      try {
        bCodec0 = new BCodec((Charset) null);
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
      BCodec bCodec0 = null;
      try {
        bCodec0 = new BCodec("P:pJf");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // P:pJf
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BCodec bCodec0 = null;
      try {
        bCodec0 = new BCodec((String) null);
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
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.decode("=?UTF-8?B?Mg==?=");
      assertEquals("2", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode("WAYy1");
      assertEquals("=?UTF-8?B?V0FZeTE=?=", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      boolean boolean0 = bCodec0.isStrictDecoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      boolean boolean0 = bCodec0.isStrictDecoding();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      try { 
        bCodec0.encode((Object) bCodec0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type org.apache.commons.codec.net.BCodec cannot be encoded using BCodec
         //
         verifyException("org.apache.commons.codec.net.BCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Object object0 = bCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      byte[] byteArray0 = bCodec0.doEncoding((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      byte[] byteArray0 = bCodec0.doDecoding((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Charset charset0 = Charset.defaultCharset();
      try { 
        bCodec0.decode((Object) charset0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type sun.nio.cs.UTF_8 cannot be decoded using BCodec
         //
         verifyException("org.apache.commons.codec.net.BCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Object object0 = bCodec0.decode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Object object0 = bCodec0.decode((Object) "=?UTF-8?B?bHJ1bD9GZzpOfT50ZC5lal9BNGg=?=");
      assertEquals("lrul?Fg:N}>td.ej_A4h", object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode("lrul?Fg:N}>td.ej_A4h", "=?UTF-8?B?bHJ1bD9GZzpOfT50ZC5lal9BNGg=?=");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // =?UTF-8?B?bHJ1bD9GZzpOfT50ZC5lal9BNGg=?=
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BCodec bCodec0 = null;
      try {
        bCodec0 = new BCodec("");
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
      BCodec bCodec0 = new BCodec();
      Object object0 = bCodec0.encode((Object) "lrul?Fg:N}>td.ej_A4h");
      assertEquals("=?UTF-8?B?bHJ1bD9GZzpOfT50ZC5lal9BNGg=?=", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = bCodec0.encode("org.apache.commons.codec.net.RFC1522Codec", charset0);
      assertEquals("=?UTF-8?B?b3JnLmFwYWNoZS5jb21tb25zLmNvZGVjLm5ldC5SRkMxNTIyQ29kZWM=?=", string0);
  }
}
