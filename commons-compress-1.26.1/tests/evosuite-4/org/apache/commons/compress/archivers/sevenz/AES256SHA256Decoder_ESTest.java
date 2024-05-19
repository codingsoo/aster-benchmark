
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


package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder;
import org.apache.commons.compress.archivers.sevenz.Coder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AES256SHA256Decoder_ESTest extends AES256SHA256Decoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[2];
      byte[] byteArray0 = AES256SHA256Decoder.utf16Decode(charArray0);
      byte[] byteArray1 = AES256SHA256Decoder.sha256Password(charArray0, (-385), byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = AES256SHA256Decoder.utf16Decode(charArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[2];
      byte[] byteArray0 = AES256SHA256Decoder.utf16Decode(charArray0);
      // Undeclared exception!
      AES256SHA256Decoder.sha256Password(charArray0, '1', byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        AES256SHA256Decoder.sha256Password(charArray0, (-1321), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      AES256SHA256Decoder.sha256Password(byteArray0, (-4497), byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        AES256SHA256Decoder.sha256Password((byte[]) null, (-4925), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.getOptionsAsProperties((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.getOptionsAsProperties(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.compress.archivers.sevenz.AES256Options
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.encode((OutputStream) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$AES256SHA256DecoderOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = AES256SHA256Decoder.utf16Decode((char[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = AES256SHA256Decoder.sha256Password(byteArray0, (-948), byteArray0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[2];
      byte[] byteArray0 = AES256SHA256Decoder.utf16Decode(charArray0);
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 64, (-2057));
      Coder coder0 = new Coder(byteArray0, (-673L), (-792L), byteArray0);
      InputStream inputStream0 = aES256SHA256Decoder0.decode("", byteArrayInputStream0, 64, coder0, byteArray0, 1);
      assertNotNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.encode((OutputStream) null, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.compress.archivers.sevenz.AES256Options
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }
}
