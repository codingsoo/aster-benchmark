
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
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder;
import org.apache.commons.compress.archivers.sevenz.AbstractCoder;
import org.apache.commons.compress.archivers.sevenz.Coder;
import org.apache.commons.compress.archivers.sevenz.Coders;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractCoder_ESTest extends AbstractCoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = AbstractCoder.toInt("BCJ filter used in ", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(363);
      int int0 = AbstractCoder.toInt(integer0, 363);
      assertEquals(363, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      int int0 = AbstractCoder.toInt(object0, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Coders.DeflateDecoder coders_DeflateDecoder0 = new Coders.DeflateDecoder();
      Integer integer0 = new Integer(459);
      boolean boolean0 = coders_DeflateDecoder0.isOptionInstance(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      Object object0 = new Object();
      OutputStream outputStream0 = coders_CopyDecoder0.encode((OutputStream) null, object0);
      assertNull(outputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      Coders.DeflateDecoder coders_DeflateDecoder0 = new Coders.DeflateDecoder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      OutputStream outputStream0 = coders_DeflateDecoder0.encode(byteArrayOutputStream0, (Object) null);
      OutputStream outputStream1 = coders_CopyDecoder0.encode(outputStream0, outputStream0);
      assertSame(outputStream0, outputStream1);
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
      Integer integer0 = new Integer(2162);
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.getOptionsAsProperties(integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to org.apache.commons.compress.archivers.sevenz.AES256Options
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Coders.DeflateDecoder coders_DeflateDecoder0 = new Coders.DeflateDecoder();
      // Undeclared exception!
      try { 
        coders_DeflateDecoder0.encode((OutputStream) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Coders.DeflateDecoder coders_DeflateDecoder0 = new Coders.DeflateDecoder();
      MockFile mockFile0 = new MockFile("](6c$W,|UGzCSU@");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      Integer integer0 = new Integer((-901));
      // Undeclared exception!
      try { 
        coders_DeflateDecoder0.encode(dataOutputStream0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      byte[] byteArray0 = new byte[8];
      Coder coder0 = new Coder(byteArray0, (byte)13, (byte) (-84), byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)49);
      Object object0 = coders_CopyDecoder0.getOptionsFromCoder(coder0, byteArrayInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Coders.Deflate64Decoder coders_Deflate64Decoder0 = new Coders.Deflate64Decoder();
      Object object0 = new Object();
      boolean boolean0 = coders_Deflate64Decoder0.isOptionInstance(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Coders.Deflate64Decoder coders_Deflate64Decoder0 = new Coders.Deflate64Decoder();
      Object object0 = new Object();
      byte[] byteArray0 = coders_Deflate64Decoder0.getOptionsAsProperties(object0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Coders.Deflate64Decoder coders_Deflate64Decoder0 = new Coders.Deflate64Decoder();
      // Undeclared exception!
      try { 
        coders_Deflate64Decoder0.encode((OutputStream) null, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Method doesn't support writing
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AbstractCoder", e);
      }
  }
}
