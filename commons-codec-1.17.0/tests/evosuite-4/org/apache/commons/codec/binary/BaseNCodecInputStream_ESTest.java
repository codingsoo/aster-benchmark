
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


package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base16;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.commons.codec.binary.BaseNCodecInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BaseNCodecInputStream_ESTest extends BaseNCodecInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(31);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(dataInputStream0, dataInputStream0);
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(31, byteArray0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, false);
      int int0 = baseNCodecInputStream0.read(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(52);
      byte[] byteArray0 = new byte[4];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64((-370), byteArray0, false, codecPolicy0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, base64_0, false);
      boolean boolean0 = baseNCodecInputStream0.isStrictDecoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Base64 base64_0 = new Base64(540);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base64_0, true);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.skip(64);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-25), 231);
      Base32 base32_0 = new Base32();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, false);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.skip(34L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Base16 base16_0 = new Base16();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, base16_0, false);
      try { 
        baseNCodecInputStream0.skip(76);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      Base16 base16_0 = new Base16();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, base16_0, false);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read((byte[]) null, 60, 420);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // array
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Base64 base64_0 = new Base64();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base64_0, false);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Base16 base16_0 = new Base16(true);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base16_0, false);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 0
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(204);
      Base32 base32_0 = new Base32(true);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, base32_0, true);
      try { 
        baseNCodecInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[5];
      Base32 base32_0 = new Base32(2567, byteArray0, true);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
      int int0 = baseNCodecInputStream0.read(byteArray0);
      assertEquals(0, baseNCodecInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Base32 base32_0 = new Base32();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(dataInputStream0, base32_0, false);
      byte[] byteArray0 = new byte[2];
      int int0 = baseNCodecInputStream0.read(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2600), (byte)0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, (BaseNCodec) null, true);
      long long0 = baseNCodecInputStream0.skip((byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2095, (byte)7);
      Base32 base32_0 = new Base32(false, (byte)0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, true);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.skip((byte) (-101));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative skip length: -101
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Base32 base32_0 = new Base32(false, (byte)0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base32_0, true);
      byte[] byteArray0 = new byte[6];
      int int0 = baseNCodecInputStream0.read(byteArray0, 0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Base32 base32_0 = new Base32();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(dataInputStream0, base32_0, false);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, 0, (int) (byte)98);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-21), (-825));
      Base32 base32_0 = new Base32(true, (byte)0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, true);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, 28, 2040);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[7];
      Base32 base32_0 = new Base32(3, byteArray0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, 8192, (int) (byte) (-7));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base16_0, false);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, (-758), (int) (byte)102);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base16_0, true);
      int int0 = baseNCodecInputStream0.read();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 1748);
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)49;
      byteArray0[3] = (byte)115;
      pushbackInputStream0.unread(byteArray0);
      Base64 base64_0 = new Base64(true);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pushbackInputStream0, base64_0, false);
      int int0 = baseNCodecInputStream0.read();
      assertEquals(0, baseNCodecInputStream0.available());
      assertEquals(214, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 1748);
      Base64 base64_0 = new Base64(true);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pushbackInputStream0, base64_0, false);
      int int0 = baseNCodecInputStream0.read();
      assertEquals(0, baseNCodecInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Base32 base32_0 = new Base32();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(dataInputStream0, base32_0, false);
      baseNCodecInputStream0.skip(64);
      int int0 = baseNCodecInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Base64 base64_0 = new Base64(420);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base64_0, false);
      int int0 = baseNCodecInputStream0.available();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Base32 base32_0 = new Base32();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(dataInputStream0, base32_0, false);
      boolean boolean0 = baseNCodecInputStream0.isStrictDecoding();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 1748);
      Base64 base64_0 = new Base64(true);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pushbackInputStream0, base64_0, false);
      try { 
        baseNCodecInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // mark/reset not supported
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Base32 base32_0 = new Base32();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(dataInputStream0, base32_0, false);
      boolean boolean0 = baseNCodecInputStream0.markSupported();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Base32 base32_0 = new Base32();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(dataInputStream0, base32_0, false);
      baseNCodecInputStream0.mark((byte)98);
      assertFalse(baseNCodecInputStream0.isStrictDecoding());
  }
}
