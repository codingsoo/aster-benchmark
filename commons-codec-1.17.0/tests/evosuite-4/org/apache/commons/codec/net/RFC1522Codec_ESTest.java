
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
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.net.BCodec;
import org.apache.commons.codec.net.QCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RFC1522Codec_ESTest extends RFC1522Codec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      Charset charset1 = bCodec0.getCharset();
      assertSame(charset1, charset0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      String string0 = bCodec0.encodeText((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = bCodec0.encodeText("?=", charset0);
      assertEquals("=?UTF-8?B?Pz0=?=", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QCodec qCodec0 = new QCodec("UTF-8");
      String string0 = qCodec0.encodeText("UTF-8", "UTF-8");
      assertNotNull(string0);
      assertEquals("=?UTF-8?Q?UTF-8?=", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      String string0 = bCodec0.decodeText((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      String string0 = bCodec0.decodeText("=?UTF-8?B?QVNHUDZObV1lejEzNk8=?=");
      assertEquals("ASGP6Nm]ez136O", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encodeText("M5'^LwkP", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encodeText("org.apache.commons.codec.EncoderException", "org.apache.commons.codec.EncoderException");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.apache.commons.codec.EncoderException
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      // Undeclared exception!
      try { 
        bCodec0.encodeText("", "=?UTF-8?B??=");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // =?UTF-8?B??=
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encodeText("$oWN;qcv0Hm8i;r", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      try { 
        bCodec0.decodeText("=?UT-8?B?Pz0=?=?=?=");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.encodeText((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      try { 
        qCodec0.decodeText("=?UTF-8?B?Pz0=?=?=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // This codec cannot decode B encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      try { 
        bCodec0.decode((Object) "=?=?\"72k/3G-BC?=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: encoding token not found
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      try { 
        bCodec0.decodeText("=?kZ2k/3G-BC?=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: charset token not found
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      try { 
        qCodec0.decode("=?>");
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
      BCodec bCodec0 = new BCodec();
      try { 
        bCodec0.decodeText("?=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: malformed encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.getDefaultCharset();
      assertEquals("UTF-8", string0);
  }
}
