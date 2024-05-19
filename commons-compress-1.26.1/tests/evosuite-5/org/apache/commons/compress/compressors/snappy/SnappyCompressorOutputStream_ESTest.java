
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


package org.apache.commons.compress.compressors.snappy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SnappyCompressorOutputStream_ESTest extends SnappyCompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(".h0#r@x@Kb<o77GeD]");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(dataOutputStream0, 1611L);
      byte[] byteArray0 = new byte[12];
      byteArray0[8] = (byte)119;
      snappyCompressorOutputStream0.write(byteArray0);
      snappyCompressorOutputStream0.write(byteArray0);
      assertEquals(12, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(502);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(byteArrayOutputStream0, 502, 1024);
      byte[] byteArray0 = new byte[0];
      snappyCompressorOutputStream0.write(byteArray0, 502, (-493));
      assertEquals(2, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\u0003", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = SnappyCompressorOutputStream.createParameterBuilder(128);
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(byteArrayOutputStream0, 1L);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write(byteArray0, (-965), 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("$s1}[+iwnxs9Kq!S");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, 0L, parameters0);
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write(3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("pXe+)A)VA");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, (-1L));
      mockFileOutputStream0.close();
      snappyCompressorOutputStream0.write(128);
      try { 
        snappyCompressorOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        SnappyCompressorOutputStream.createParameterBuilder((-493));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, 0L, parameters0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3082);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte) (-82)).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(byteArrayOutputStream0, 0L, parameters0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(pipedOutputStream0, 131L, parameters0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(byteArrayOutputStream0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, (-1824L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, (-4583L), parameters0);
      SnappyCompressorOutputStream snappyCompressorOutputStream1 = null;
      try {
        snappyCompressorOutputStream1 = new SnappyCompressorOutputStream(snappyCompressorOutputStream0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("(");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      mockFileOutputStream0.close();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, 0L);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(".h0#r@x@Kb<o77GeD]");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(dataOutputStream0, 1611L);
      snappyCompressorOutputStream0.close();
      snappyCompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(".h0#r@x@Kb<o77GeD]");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(dataOutputStream0, 1611L);
      byte[] byteArray0 = new byte[12];
      snappyCompressorOutputStream0.write(byteArray0);
      assertEquals(12, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(".h0#r@x@Kb<o77GeD]");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(dataOutputStream0, 1611L);
      byte[] byteArray0 = new byte[26];
      snappyCompressorOutputStream0.write(byteArray0);
      assertEquals(26, byteArray0.length);
  }
}
