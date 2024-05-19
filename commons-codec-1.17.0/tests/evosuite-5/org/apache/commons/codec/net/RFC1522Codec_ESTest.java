
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
      BCodec bCodec0 = new BCodec(charset0);
      Charset charset1 = bCodec0.getCharset();
      assertTrue(charset1.isRegistered());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      String string0 = bCodec0.encodeText((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      String string0 = bCodec0.encodeText("This codec cannot decode ", charset0);
      assertEquals("=?UTF-8?B?VGhpcyBjb2RlYyBjYW5ub3QgZGVjb2RlIA==?=", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encodeText((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.encodeText("oAm^5k{Q", "UTF-8");
      assertNotNull(string0);
      assertEquals("=?UTF-8?Q?oAm^5k{Q?=", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      String string0 = bCodec0.decodeText("=?UTF-8?B?Tw==?=");
      assertEquals("O", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.decodeText("=?UTF-8?Q??=");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encodeText(": ", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      // Undeclared exception!
      try { 
        bCodec0.encodeText("RJ", "RJ");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // RJ
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encodeText("RFC 1522 violation: malformed encoded content", (String) null);
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
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      // Undeclared exception!
      try { 
        bCodec0.encodeText("", "");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      try { 
        bCodec0.decodeText("=?UTF-8?Q?]}`?=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // This codec cannot decode Q encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      try { 
        qCodec0.decodeText("=?4?UTF-8pQA/0nX<~CB/B?=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: encoding token not found
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      try { 
        qCodec0.decode("=??RFC 1522 vi)lati: encodin tokennt fo-nd?=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: charset not specified
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      try { 
        qCodec0.decodeText("=?RFC 152g violt;n: encodin tokennt found?=");
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
        qCodec0.decodeText("=?");
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
      QCodec qCodec0 = new QCodec();
      try { 
        qCodec0.decode("@@|\"BH");
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
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.decodeText((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.getDefaultCharset();
      assertEquals("UTF-8", string0);
  }
}
