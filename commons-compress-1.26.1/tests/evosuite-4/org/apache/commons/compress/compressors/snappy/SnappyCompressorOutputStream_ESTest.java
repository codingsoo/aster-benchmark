
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
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
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
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.utils.ByteUtils");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, (-1L));
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-109);
      snappyCompressorOutputStream0.write(byteArray0);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.compressors.CompressorOutputStream");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 760L);
      byte[] byteArray0 = new byte[9];
      snappyCompressorOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(2L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("l# Ls#ECf'$ksn##?~2", true);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, 0L, 32768);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = SnappyCompressorOutputStream.createParameterBuilder(128);
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("G0`??aze", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, 1932L, parameters0);
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write(11);
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
      // Undeclared exception!
      try { 
        SnappyCompressorOutputStream.createParameterBuilder(501);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" wBCr]OE}#h.^zoEQ");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, (-29L), (Parameters) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(2146754451).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, (-688L), parameters0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(pipedOutputStream0, (-1462L), parameters0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, 0L, 64);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, 473L, (-53));
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
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, 2976L);
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(byteArrayOutputStream0, 0L, parameters0);
      SnappyCompressorOutputStream snappyCompressorOutputStream1 = null;
      try {
        snappyCompressorOutputStream1 = new SnappyCompressorOutputStream(snappyCompressorOutputStream0, 0L);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.close();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(pipedOutputStream0, (-3371L));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe closed
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(bufferedOutputStream0, (-266L));
      snappyCompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile(")");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, (-587L), parameters0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write(byteArray0, (int) (byte) (-16), (int) (byte)92);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.utils.ByteUtils");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, (-1L));
      snappyCompressorOutputStream0.close();
      snappyCompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Aq0?ZM");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(248, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 447, parameters0);
      // Undeclared exception!
      snappyCompressorOutputStream0.write(2144133439);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.utils.ByteUtils");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, (-1L));
      snappyCompressorOutputStream0.write(0);
      snappyCompressorOutputStream0.close();
  }
}