
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
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder;
import org.apache.commons.compress.archivers.sevenz.Coder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AES256SHA256Decoder_ESTest extends AES256SHA256Decoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)20;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) (-37));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pushbackInputStream0, pushbackInputStream0);
      Coder coder0 = new Coder(byteArray0, (-2L), (byte)0, byteArray0);
      InputStream inputStream0 = aES256SHA256Decoder0.decode((String) null, sequenceInputStream0, (byte) (-37), coder0, byteArray0, 0);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(inputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)116;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) (-37));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pushbackInputStream0, pushbackInputStream0);
      Coder coder0 = new Coder(byteArray0, (-2L), (byte)0, byteArray0);
      InputStream inputStream0 = aES256SHA256Decoder0.decode((String) null, sequenceInputStream0, (byte) (-37), coder0, byteArray0, 0);
      ObjectInputStream objectInputStream0 = new ObjectInputStream(inputStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = AES256SHA256Decoder.utf16Decode(charArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = AES256SHA256Decoder.sha256Password(charArray0, (-2431), byteArray0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = AES256SHA256Decoder.sha256Password(byteArray0, (-1), byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[3];
      byte[] byteArray0 = AES256SHA256Decoder.utf16Decode(charArray0);
      // Undeclared exception!
      AES256SHA256Decoder.sha256Password(charArray0, 1530, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        AES256SHA256Decoder.sha256Password((char[]) null, 0, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      AES256SHA256Decoder.sha256Password(byteArray0, (byte)124, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        AES256SHA256Decoder.sha256Password((byte[]) null, (-383), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-14), 1444);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.getOptionsAsProperties(bufferedInputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.BufferedInputStream cannot be cast to org.apache.commons.compress.archivers.sevenz.AES256Options
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$AES256SHA256DecoderInputStream");
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.encode(mockFileOutputStream0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$AES256SHA256DecoderOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = AES256SHA256Decoder.utf16Decode((char[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)112;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) (-37));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pushbackInputStream0, pushbackInputStream0);
      Coder coder0 = new Coder(byteArray0, 0L, (byte)0, byteArray0);
      InputStream inputStream0 = aES256SHA256Decoder0.decode((String) null, sequenceInputStream0, (byte) (-37), coder0, byteArray0, 0);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(inputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Salt size + IV size too long in null
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$AES256SHA256DecoderInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("g(QuN");
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.encode(mockPrintStream0, "g(QuN");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.compress.archivers.sevenz.AES256Options
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }
}
