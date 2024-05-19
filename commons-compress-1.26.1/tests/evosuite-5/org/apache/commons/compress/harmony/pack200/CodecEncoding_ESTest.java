
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
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CodecEncoding_ESTest extends CodecEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = CodecEncoding.getSpecifierForDefaultCodec((BHSDCodec) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Codec codec0 = CodecEncoding.getCodec(0, (InputStream) null, (Codec) null);
      assertNull(codec0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(0);
      assertNull(bHSDCodec0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(90);
      assertEquals(1, bHSDCodec0.getS());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(1);
      assertNotNull(bHSDCodec0);
      assertEquals(0L, bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(26);
      assertFalse(bHSDCodec0.isSigned());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PipedInputStream pipedInputStream0 = new PipedInputStream(64);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 64);
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(enumeration0).hasMoreElements();
      doReturn(bufferedInputStream0).when(enumeration0).nextElement();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        CodecEncoding.getCodec(116, sequenceInputStream0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, 117, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(populationCodec0, populationCodec0);
      assertArrayEquals(new int[] {141, 116, 16, 127, 0, 116, 16, 127}, intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int[] intArray0 = CodecEncoding.getSpecifier(bHSDCodec0, bHSDCodec0);
      assertArrayEquals(new int[] {116, 16, 127}, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int[] intArray0 = CodecEncoding.getSpecifier(bHSDCodec0, bHSDCodec0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, 117, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(populationCodec0, bHSDCodec0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(11, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(runCodec0, runCodec0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {121, 10, 42, 42}, intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, 77, bHSDCodec0);
      RunCodec runCodec0 = new RunCodec(4317, populationCodec0, populationCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(runCodec0, populationCodec0);
      assertArrayEquals(new int[] {131, 15, 141, 1, 0, 1}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      Codec codec0 = CodecEncoding.getCodec(168, bufferedInputStream0, (Codec) null);
      // Undeclared exception!
      try { 
        CodecEncoding.getSpecifier(codec0, codec0.SIGNED5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 2581);
      try { 
        CodecEncoding.getCodec(2581, pipedInputStream0, (Codec) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid codec encoding byte (2581) found
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)80, 11);
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(140, byteArrayInputStream0, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Encoding cannot be less than zero
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      Codec codec0 = CodecEncoding.getCodec(168, bufferedInputStream0, (Codec) null);
      assertNotNull(codec0);
      
      int int0 = CodecEncoding.getSpecifierForDefaultCodec(codec0.UNSIGNED5);
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      BHSDCodec bHSDCodec1 = (BHSDCodec)CodecEncoding.getCodec(12, sequenceInputStream0, bHSDCodec0);
      assertEquals(1, bHSDCodec1.getS());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, (InputStream) null);
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec((-3831), sequenceInputStream0, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Encoding cannot be less than zero
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 64, 116);
      try { 
        CodecEncoding.getCodec(116, byteArrayInputStream0, bHSDCodec0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of buffer read whilst trying to decode codec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CodecEncoding codecEncoding0 = new CodecEncoding();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCanonicalCodec((-3981));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3981
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }
}
