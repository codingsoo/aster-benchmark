
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
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
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
      PipedInputStream pipedInputStream0 = new PipedInputStream(8192);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 8192);
      byte[] byteArray0 = new byte[4];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = new Base32(2730, byteArray0, true, (byte)91, codecPolicy0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(bufferedInputStream0, base32_0, false);
      long long0 = baseNCodecInputStream0.skip(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, (BaseNCodec) null, false);
      int int0 = baseNCodecInputStream0.read(byteArray0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32((byte)91, byteArray0, false, (byte)26, codecPolicy0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base32_0, false);
      boolean boolean0 = baseNCodecInputStream0.isStrictDecoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Base32 base32_0 = new Base32();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base32_0, false);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.skip(76);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      Base16 base16_0 = new Base16(false);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(dataInputStream0, base16_0, false);
      try { 
        baseNCodecInputStream0.skip(2126L);
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
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Base64 base64_0 = new Base64(true);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base64_0, true);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read((byte[]) null, 64, 0);
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
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      Base32 base32_0 = new Base32(false, (byte)0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(dataInputStream0, base32_0, false);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Base16 base16_0 = new Base16();
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
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      Base32 base32_0 = new Base32(false, (byte)0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, false);
      try { 
        baseNCodecInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pipedInputStream0, (BaseNCodec) null, true);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.isStrictDecoding();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)43;
      byteArray0[4] = (byte)79;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Base64 base64_0 = new Base64((byte)7);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base64_0, false);
      int int0 = baseNCodecInputStream0.read(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-8), (byte)43, (byte)0, (byte)0, (byte)79, (byte)0}, byteArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      Base32 base32_0 = new Base32(20);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray0 = base32_0.ensureBufferSize((-1), baseNCodec_Context0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(bufferedInputStream0, base32_0, false);
      int int0 = baseNCodecInputStream0.read(byteArray0, 20, 34);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      Base64 base64_0 = new Base64();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pushbackInputStream0, base64_0, true);
      baseNCodecInputStream0.read();
      int int0 = baseNCodecInputStream0.read(byteArray0);
      assertEquals(0, baseNCodecInputStream0.available());
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Base64 base64_0 = new Base64((byte)7);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base64_0, true);
      long long0 = baseNCodecInputStream0.skip((byte)7);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(7L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (-1));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      Base32 base32_0 = new Base32();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pushbackInputStream0, base32_0, false);
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.skip((byte) (-75));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative skip length: -75
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0, true, (byte) (-128));
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
      int int0 = baseNCodecInputStream0.read(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, (BaseNCodec) null, true);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, (int) (byte)0, (int) (byte)92);
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
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      Base32 base32_0 = new Base32(0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(bufferedInputStream0, base32_0, false);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, 76, 64);
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
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0, true, (byte) (-128));
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
      byte[] byteArray1 = new byte[4];
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray1, 294, (-1977));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Base16 base16_0 = new Base16();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream((InputStream) null, base16_0, false);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        baseNCodecInputStream0.read(byteArray0, (int) (byte) (-62), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      Base64 base64_0 = new Base64();
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(pushbackInputStream0, base64_0, true);
      baseNCodecInputStream0.read();
      long long0 = baseNCodecInputStream0.skip(4294967295L);
      assertEquals(0, baseNCodecInputStream0.available());
      assertEquals(11L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte)43;
      byteArray0[6] = (byte)107;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Base64 base64_0 = new Base64(76);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(byteArrayInputStream0, base64_0, false);
      int int0 = baseNCodecInputStream0.read();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(250, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0, true, (byte) (-128));
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
      int int0 = baseNCodecInputStream0.read();
      assertEquals(0, baseNCodecInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Base32 base32_0 = new Base32(true);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
      baseNCodecInputStream0.skip(3098L);
      int int0 = baseNCodecInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(8192);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 8192);
      byte[] byteArray0 = new byte[4];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = new Base32(2730, byteArray0, true, (byte)91, codecPolicy0);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(bufferedInputStream0, base32_0, false);
      int int0 = baseNCodecInputStream0.available();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0, true, (byte) (-128));
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
      boolean boolean0 = baseNCodecInputStream0.isStrictDecoding();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Base32 base32_0 = new Base32(true);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
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
  public void test27()  throws Throwable  {
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Base32 base32_0 = new Base32(true);
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
      boolean boolean0 = baseNCodecInputStream0.markSupported();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Enumeration<BaseNCodecInputStream> enumeration0 = (Enumeration<BaseNCodecInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0, true, (byte) (-128));
      BaseNCodecInputStream baseNCodecInputStream0 = new BaseNCodecInputStream(sequenceInputStream0, base32_0, true);
      baseNCodecInputStream0.mark((-104));
      assertFalse(baseNCodecInputStream0.markSupported());
  }
}
