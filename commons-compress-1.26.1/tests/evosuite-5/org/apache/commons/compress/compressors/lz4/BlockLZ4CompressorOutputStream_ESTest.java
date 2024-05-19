
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


package org.apache.commons.compress.compressors.lz4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BlockLZ4CompressorOutputStream_ESTest extends BlockLZ4CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      byte[] byteArray0 = new byte[6];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 0, (-424));
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", false);
      byte[] byteArray0 = new byte[16];
      byteArray0[1] = (byte)1;
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write(byteArray0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      byte[] byteArray0 = new byte[4];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, 1826);
      blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("LiteralBlock starting at 0 with length 1826");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(parameters0).getLazyMatching();
      doReturn(634, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 2505, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(3556, 19, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-365), (-614));
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("tH5)sI");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[4];
      blockLZ4CompressorOutputStream0.write(byteArray0, (-2387), (int) (byte) (-80));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      int int0 = blockLZ4CompressorOutputStream_Pair0.length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.hasBackReference();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[4];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, (byte)0, 8);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = BlockLZ4CompressorOutputStream.createParameterBuilder();
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(65536, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(1782, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0, parameters0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(byteArray0, 0, (int) (byte)118);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", false);
      byte[] byteArray0 = new byte[16];
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(byteArray0, (int) (byte)43, (int) (byte)43);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("LiteralBlock starting at 0 with length 1826");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(3556, 19).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write((-3887));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(bufferedOutputStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(3);
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
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill((byte[]) null, (-1520), 2443);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      byte[] byteArray0 = new byte[4];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, 1826);
      byte[] byteArray1 = blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("LiteralBlock starting at 0 with length 1826");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)85).when(parameters0).getMinBackReferenceLength();
      doReturn((int)(byte)65, 660).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      blockLZ4CompressorOutputStream0.write((-3887));
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill(byteArray1, (byte)65, (byte)65);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(1097, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(1, 1, 32768).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null, parameters0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream1 = new BlockLZ4CompressorOutputStream(blockLZ4CompressorOutputStream0);
      byte[] byteArray0 = new byte[8];
      blockLZ4CompressorOutputStream1.write(byteArray0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream1.finish();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("fXA(.\b0:");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.finish();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(1, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null, parameters0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream1 = new BlockLZ4CompressorOutputStream(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream1.write(3);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream1.finish();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("m~@", false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(objectOutputStream0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.close();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("b0s]!<]!i(N5y4]8r8@");
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = null;
      try {
        blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, (Parameters) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.lz77support.Parameters$1");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = null;
      try {
        blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(1097).when(parameters0).getMinBackReferenceLength();
      doReturn(1, 1).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null, parameters0);
      blockLZ4CompressorOutputStream0.write(3);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.finish();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      MockPrintStream mockPrintStream0 = new MockPrintStream("LiteralBlock starting at 0 with length 1826");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)65).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill(byteArray0, (byte)65, (byte)65);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null, parameters0);
      byte[] byteArray0 = new byte[8];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 0, (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32, 32);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      byte[] byteArray0 = new byte[4];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (byte)0);
      blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        blockLZ4CompressorOutputStream_Pair0.writeTo(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1024, 1024);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.canBeWritten((-41));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1024, 1024);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.canBeWritten((byte)19);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$1");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1024, 1024);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(mockPrintStream0);
      assertEquals(7L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(15, 15);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.compressors.lz77support.Parameters");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(mockFileOutputStream0);
      assertEquals(3L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", false);
      byte[] byteArray0 = new byte[16];
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockFile mockFile0 = new MockFile("?svQNg9E.J8", "?svQNg9E.J8");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[8];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream0.finish();
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(9L, mockFile0.length());
  }
}
