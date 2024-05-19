
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder;
import org.apache.commons.compress.archivers.sevenz.AbstractCoder;
import org.apache.commons.compress.archivers.sevenz.Coder;
import org.apache.commons.compress.archivers.sevenz.Coders;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractCoder_ESTest extends AbstractCoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      int int0 = AbstractCoder.toInt(aES256SHA256Decoder0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      int int0 = AbstractCoder.toInt(dataInputStream0, 635);
      assertEquals(635, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Coders.Deflate64Decoder coders_Deflate64Decoder0 = new Coders.Deflate64Decoder();
      int int0 = AbstractCoder.toInt(coders_Deflate64Decoder0, (-1097));
      assertEquals((-1097), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Coders.Deflate64Decoder coders_Deflate64Decoder0 = new Coders.Deflate64Decoder();
      Integer integer0 = new Integer(32);
      boolean boolean0 = coders_Deflate64Decoder0.isOptionInstance(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      OutputStream outputStream0 = coders_CopyDecoder0.encode((OutputStream) null, (Object) null);
      assertNull(outputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("6h", false);
      OutputStream outputStream0 = coders_CopyDecoder0.encode(mockFileOutputStream0, mockFileOutputStream0);
      assertSame(outputStream0, mockFileOutputStream0);
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
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.getOptionsAsProperties(dataInputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.DataInputStream cannot be cast to org.apache.commons.compress.archivers.sevenz.AES256Options
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.encode(byteArrayOutputStream0, (Object) null);
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
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Method doesn't support writing");
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.encode(mockFileOutputStream0, dataInputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.DataInputStream cannot be cast to org.apache.commons.compress.archivers.sevenz.AES256Options
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Coders.DeflateDecoder coders_DeflateDecoder0 = new Coders.DeflateDecoder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.cmpres.com5ressors.CompressorInpuStream");
      Integer integer0 = new Integer(0);
      OutputStream outputStream0 = coders_DeflateDecoder0.encode(mockPrintStream0, integer0);
      assertNotNull(outputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      byte[] byteArray0 = new byte[5];
      Coder coder0 = new Coder(byteArray0, (byte) (-45), 0L, byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      Object object0 = coders_CopyDecoder0.getOptionsFromCoder(coder0, dataInputStream0);
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
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      byte[] byteArray0 = coders_CopyDecoder0.getOptionsAsProperties((Object) null);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Coders.Deflate64Decoder coders_Deflate64Decoder0 = new Coders.Deflate64Decoder();
      Object object0 = new Object();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      // Undeclared exception!
      try { 
        coders_Deflate64Decoder0.encode(byteArrayOutputStream0, object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Method doesn't support writing
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AbstractCoder", e);
      }
  }
}
