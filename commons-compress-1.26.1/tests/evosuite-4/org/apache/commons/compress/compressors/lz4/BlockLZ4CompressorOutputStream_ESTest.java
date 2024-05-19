
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(4, 16);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      MockFile mockFile0 = new MockFile("Fz5]k1blhj", "Fz5]k1blhj");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[9];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(13L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile("7|uK'6", "Failed to find a block containing offset ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(objectOutputStream0);
      byte[] byteArray0 = new byte[1];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, (-1210), (-422));
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      File file0 = MockFile.createTempFile("$'2;O~mJQ\"J9~t k", "$'2;O~mJQ\"J9~t k", (File) null);
      byte[] byteArray0 = new byte[7];
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)0, 1561);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(9L, file0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      File file0 = MockFile.createTempFile("$'2;O~mJQ\"J9~t k", "$'2;O~mJQ\"J9~t k", (File) null);
      byte[] byteArray0 = new byte[7];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(17L, file0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-711), 32768);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.hasBackReference();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(16, 16);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.canBeWritten(16);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      File file0 = MockFile.createTempFile("$'2;O~mJQ\"J9~t k", "$'2;O~mJQ\"J9~t k", (File) null);
      byte[] byteArray0 = new byte[7];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write(byteArray0, (-3638), 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      int int0 = blockLZ4CompressorOutputStream_Pair0.length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[5];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream0.close();
      assertEquals(6, byteArrayOutputStream0.size());
      assertEquals("P\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = BlockLZ4CompressorOutputStream.createParameterBuilder();
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Y gr3/Y}6", "N3vU/P");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(byteArray0, (int) (byte)5, (int) (byte)4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("GKqo%{>}>rmf$vp", "GKqo%{>}>rmf$vp");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(1820, 1820).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write((-605));
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(objectOutputStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(3450);
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
      MockFile mockFile0 = new MockFile("Fz5]k1blhj", "Fz5]k1blhj");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[9];
      blockLZ4CompressorOutputStream0.write((-1714));
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill(byteArray0, (byte)0, 2209);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill(byteArray0, 1355, 1190);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
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
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Fz5]k1blhj", "Fz5]k1blhj");
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
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      File file0 = MockFile.createTempFile("$'2;O~mJQ\"J9~t k", "$'2;O~mJQ\"J9~t k", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      mockFileOutputStream0.close();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      try { 
        blockLZ4CompressorOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0, parameters0);
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
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = null;
      try {
        blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0, (Parameters) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = MockFile.createTempFile("`w", "`w");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-2659)).when(parameters0).getWindowSize();
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
  public void test21()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      File file0 = MockFile.createTempFile("$'2;O~mJQ\"J9~t k", "$'2;O~mJQ\"J9~t k", (File) null);
      byte[] byteArray0 = new byte[7];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 255);
      blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      assertEquals(0L, file0.length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1644, 1644);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.canBeWritten(1644);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      File file0 = MockFile.createTempFile("$'2;O~mJQ\"J9~t k", "$'2;O~mJQ\"J9~t k", (File) null);
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte)8;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 258);
      byte[] byteArray1 = blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write(byteArray1);
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(23L, file0.length());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[8];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 2405, (byte)0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      File file0 = MockFile.createTempFile("$'2;O~mJQ\"J9~t k", "$'2;O~mJQ\"J9~t k", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream0.finish();
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(2L, file0.length());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      MockFile mockFile0 = new MockFile("Fz5]k1blhj", "Fz5]k1blhj");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(4, 4);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[9];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, (byte)0, 2222);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      assertEquals(0L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      File file0 = MockFile.createTempFile("$'2;O~mJQ\"J9~t k", "$'2;O~mJQ\"J9~t k", (File) null);
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)8, 1555);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(11L, file0.length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(3, (-1422));
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
  public void test29()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      MockFile mockFile0 = new MockFile((File) null, "$'2;O~mJQ\"J9~t k");
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)8;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 269);
      blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      assertEquals(22L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
}
