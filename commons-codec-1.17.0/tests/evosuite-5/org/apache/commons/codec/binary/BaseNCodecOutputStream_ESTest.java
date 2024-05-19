
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base16;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.commons.codec.binary.BaseNCodecOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BaseNCodecOutputStream_ESTest extends BaseNCodecOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(") than the specified maximum size of ");
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base32_0, false);
      baseNCodecOutputStream0.write(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile("|S(", "NhbEw^Iw!,\"C6p]g@n");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Base64 base64_0 = new Base64();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base64_0, true);
      baseNCodecOutputStream0.flush();
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("mK&LqKTkE");
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base16_0, false);
      boolean boolean0 = baseNCodecOutputStream0.isStrictDecoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Base16 base16_0 = new Base16();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base16_0, true);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write((byte[]) null, 2570, 3596);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // array
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("S^.bL$]i#rV&");
      Base16 base16_0 = new Base16(false);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base16_0, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 0
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.codec.binary.BaseNCodecOutputStream", "org.apache.commons.codec.binary.BaseNCodecOutputStream");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      Base16 base16_0 = new Base16();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/org.apache.commons.codec.binary.BaseNCodecOutputStream0org.apache.commons.codec.binary.BaseNCodecOutputStream");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, base16_0, true);
      try { 
        baseNCodecOutputStream0.write(4374);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "@U&zxEN)8NkmD0D;");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(filterOutputStream0, true);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, (BaseNCodec) null, true);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.eof();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Base32 base32_0 = new Base32(761);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base32_0, true);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      File file0 = MockFile.createTempFile("S;E37l?u4hJ", (String) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Base16 base16_0 = new Base16(false);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base16_0, false);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 0
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Base32 base32_0 = new Base32((byte) (-108));
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(byteArrayOutputStream0, base32_0, true);
      byte[] byteArray0 = new byte[7];
      baseNCodecOutputStream0.write(byteArray0);
      assertEquals(8, byteArrayOutputStream0.size());
      assertEquals("AAAAAAAA", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(") than the specified maximum size of ");
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base32_0, false);
      baseNCodecOutputStream0.eof();
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Base32 base32_0 = new Base32((-296));
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base32_0, true);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9{pcI`");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      Base32 base32_0 = new Base32();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(objectOutputStream0, base32_0, false);
      baseNCodecOutputStream0.write(76);
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Base32 base32_0 = new Base32((-296));
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base32_0, true);
      byte[] byteArray0 = new byte[3];
      baseNCodecOutputStream0.write(byteArray0, 0, (int) (byte)0);
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9{pcI`");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      Base32 base32_0 = new Base32();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(objectOutputStream0, base32_0, false);
      byte[] byteArray0 = new byte[10];
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)79);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.codec.binary.BaseNCodecOutputStream");
      Base16 base16_0 = new Base16();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, base16_0, true);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, 76, 64);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("$P)2'1A*nqA");
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[8];
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, base64_0, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, 0, (-125));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Base32 base32_0 = new Base32((-296));
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base32_0, true);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, (-296), (int) (byte)54);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Base32 base32_0 = new Base32(true, (byte)0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(pipedOutputStream0, base32_0, true);
      baseNCodecOutputStream0.write(76);
      try { 
        baseNCodecOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Base32 base32_0 = new Base32(true, (byte)0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(pipedOutputStream0, base32_0, true);
      baseNCodecOutputStream0.close();
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("$P)2'1A*nqA");
      Base64 base64_0 = new Base64();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, base64_0, false);
      boolean boolean0 = baseNCodecOutputStream0.isStrictDecoding();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Base16 base16_0 = new Base16();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base16_0, true);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(2570);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }
}
