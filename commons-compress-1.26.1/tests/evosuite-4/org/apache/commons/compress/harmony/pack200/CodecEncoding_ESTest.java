
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.CodecEncoding;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.apache.commons.compress.harmony.pack200.RunCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CodecEncoding_ESTest extends CodecEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int[] intArray0 = CodecEncoding.getSpecifier(bHSDCodec0, (Codec) null);
      assertArrayEquals(new int[] {116, 16, 127}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = CodecEncoding.getSpecifierForDefaultCodec((BHSDCodec) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Codec codec0 = CodecEncoding.getCodec(0, (InputStream) null, (Codec) null);
      assertNull(codec0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(102);
      assertEquals(0, bHSDCodec0.getS());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(19);
      assertEquals(252, bHSDCodec0.getL());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(4);
      assertEquals(1, bHSDCodec0.getB());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      // Undeclared exception!
      try { 
        CodecEncoding.getSpecifier(populationCodec0, populationCodec0.BRANCH5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCanonicalCodec(1741);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1741
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = CodecEncoding.getSpecifier((Codec) null, (Codec) null);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec((-331), byteArrayInputStream0, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Encoding cannot be less than zero
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(populationCodec0, populationCodec0.BCI5);
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(2965, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(runCodec0, runCodec0);
      assertArrayEquals(new int[] {122, 184, 26, 26}, intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(25, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(runCodec0, runCodec0);
      assertArrayEquals(new int[] {121, 24, 26, 26}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(populationCodec0, bHSDCodec0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = MockFile.createTempFile("Can't read beyond end of stream (n = %,d, count = %,d, maxLength = %,d, remaining = %,d)", "k");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(143, mockFileInputStream0, (Codec) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Encoding cannot be less than zero
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = MockFile.createTempFile("Can't read beyond end of stream (n = %,d, count = ,d, maxLength = %,d, remaining = %,d)", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      Codec codec0 = CodecEncoding.getCodec(168, mockFileInputStream0, (Codec) null);
      assertEquals(0, mockFileInputStream0.available());
      assertNotNull(codec0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File file0 = MockFile.createTempFile("Can't read beyond end of stream (n = %,d, count = ,d, maxLength = %,d, remaining = %,d)", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(144, mockFileInputStream0, (Codec) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Encoding cannot be less than zero
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(158, (InputStream) null, (Codec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      try { 
        CodecEncoding.getCodec(1454, sequenceInputStream0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid codec encoding byte (1454) found
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      try { 
        CodecEncoding.getCodec(139, bufferedInputStream0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      try { 
        CodecEncoding.getCodec(132, mockFileInputStream0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      try { 
        CodecEncoding.getCodec(117, bufferedInputStream0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      File file0 = MockFile.createTempFile("Can't read beyond end of stream (n = %,d, count = %,d, maxLength = %,d, remaining = %,d)", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      try { 
        CodecEncoding.getCodec(116, mockFileInputStream0, (Codec) null);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of buffer read whilst trying to decode codec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BHSDCodec bHSDCodec1 = (BHSDCodec)CodecEncoding.getCodec(11, byteArrayInputStream0, bHSDCodec0);
      assertFalse(bHSDCodec1.isSigned());
      assertEquals(16777216L, bHSDCodec1.cardinality());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(167, sequenceInputStream0, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Encoding cannot be less than zero
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int int0 = CodecEncoding.getSpecifierForDefaultCodec(bHSDCodec0);
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodecEncoding codecEncoding0 = new CodecEncoding();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(0);
      assertNull(bHSDCodec0);
  }
}
