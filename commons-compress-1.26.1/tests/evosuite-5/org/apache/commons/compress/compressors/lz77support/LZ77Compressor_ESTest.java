
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


package org.apache.commons.compress.compressors.lz77support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LZ77Compressor_ESTest extends LZ77Compressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(2023, 21).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-55);
      byteArray0[3] = (byte) (-1);
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-55), (byte) (-1), (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(1478).when(parameters0).getLazyMatchingThreshold();
      doReturn((-114), 1470).when(parameters0).getMaxBackReferenceLength();
      doReturn(9964, 1478).when(parameters0).getMaxCandidates();
      doReturn((-1943), 128, 2155, (-3433)).when(parameters0).getMaxOffset();
      doReturn(0, 1024, 128).when(parameters0).getMinBackReferenceLength();
      doReturn(32768, 9982).when(parameters0).getNiceBackReferenceLength();
      doReturn(2323, 9982, 9982).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false, false).when(parameters0).getLazyMatching();
      doReturn(9983, 9985, 0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn((-1589), 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn((-5239), 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(1, 1, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(9983, 3, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(4, 9985, 9983, 3, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(2340, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(4, 4, 1).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[5];
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(5, byteArray0.length);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(2250, 1991).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      lZ77Compressor0.finish();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[5];
      lZ77Compressor0.compress(byteArray0, (int) (byte)2, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(0, byteArray0.length);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)0, 1024).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress((byte[]) null, 3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = null;
      try {
        lZ77Compressor0 = new LZ77Compressor(parameters0, (LZ77Compressor.Callback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // callback
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-2689)).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = null;
      try {
        lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(parameters0).getLazyMatching();
      doReturn(4, 9952).when(parameters0).getLazyMatchingThreshold();
      doReturn(645).when(parameters0).getMaxLiteralLength();
      doReturn(4, 9973, 5).when(parameters0).getMinBackReferenceLength();
      doReturn(4, 4, 256, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[5];
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(5, byteArray0.length);
      
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(parameters0).getLazyMatching();
      doReturn(32, 32).when(parameters0).getLazyMatchingThreshold();
      doReturn(32767).when(parameters0).getMaxBackReferenceLength();
      doReturn(32767).when(parameters0).getMaxCandidates();
      doReturn((-18), 1727).when(parameters0).getMaxLiteralLength();
      doReturn((-427), 1727, 0).when(parameters0).getMaxOffset();
      doReturn(4, 2, 2040, 32).when(parameters0).getMinBackReferenceLength();
      doReturn(1727).when(parameters0).getNiceBackReferenceLength();
      doReturn(4, 4, 1524, 2).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[5];
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(5, byteArray0.length);
      
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(128, 128).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 1024, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(parameters0).getLazyMatching();
      doReturn(802, 4).when(parameters0).getLazyMatchingThreshold();
      doReturn(1055).when(parameters0).getMaxBackReferenceLength();
      doReturn(802).when(parameters0).getMaxCandidates();
      doReturn(4).when(parameters0).getMaxLiteralLength();
      doReturn(9984, 1055).when(parameters0).getMaxOffset();
      doReturn(4, 9984, 4, (-1391)).when(parameters0).getMinBackReferenceLength();
      doReturn(9984).when(parameters0).getNiceBackReferenceLength();
      doReturn(4, 4, 4).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[14];
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(parameters0).getLazyMatching();
      doReturn(4, 8381).when(parameters0).getLazyMatchingThreshold();
      doReturn(604).when(parameters0).getMaxLiteralLength();
      doReturn(4, 5, 5).when(parameters0).getMinBackReferenceLength();
      doReturn(4, 4, 1579, 8381).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[5];
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(5, byteArray0.length);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(parameters0).getLazyMatching();
      doReturn(4, 4).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(4, 256, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn((-428), (-342), 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(4, 3624, 1, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(4, 4, 16, (-2562)).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[5];
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(5, byteArray0.length);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(parameters0).getLazyMatching();
      doReturn(0, 0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(1957, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(1957, 2).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[7];
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(7, byteArray0.length);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(9987, 3).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[7];
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(7, byteArray0.length);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(32768).when(parameters0).getMinBackReferenceLength();
      doReturn(32768, 32768).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      lZ77Compressor0.finish();
      lZ77Compressor0.finish();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(parameters0).getLazyMatching();
      doReturn(4, 4).when(parameters0).getLazyMatchingThreshold();
      doReturn(4, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(4, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(4, 0, 0, 4, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(236, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(4, 4, 4, 5).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[5];
      lZ77Compressor0.compress(byteArray0);
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[4];
      lZ77Compressor0.compress(byteArray0, 3, (-1));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, true).when(parameters0).getLazyMatching();
      doReturn(16, 0, 267, 256).when(parameters0).getLazyMatchingThreshold();
      doReturn(1, 32768, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(256, 16, 0, 0).when(parameters0).getMaxCandidates();
      doReturn((-426), 1, 65524, 0, 0).when(parameters0).getMaxOffset();
      doReturn(32768, 267, 32768, (-1500), (-426)).when(parameters0).getMinBackReferenceLength();
      doReturn((-2835), 1417, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 32768, 16, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[4];
      lZ77Compressor0.prefill(byteArray0);
      lZ77Compressor0.compress(byteArray0);
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(16, 16);
      lZ77Compressor_BackReference0.getType();
      assertEquals(16, lZ77Compressor_BackReference0.getOffset());
      assertEquals(16, lZ77Compressor_BackReference0.getLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(5, 5);
      int int0 = lZ77Compressor_BackReference0.getLength();
      assertEquals(5, lZ77Compressor_BackReference0.getOffset());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(2234, 2234);
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 2234 and length 2234", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte) (-1), 2);
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(2, lZ77Compressor_BackReference0.getLength());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 136, 136);
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 136 with length 136", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 0);
      int int0 = lZ77Compressor_LiteralBlock0.getOffset();
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)113, (-1));
      lZ77Compressor_LiteralBlock0.getData();
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(113, lZ77Compressor_LiteralBlock0.getOffset());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)21, (-100));
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertEquals((-100), int0);
      assertEquals(21, lZ77Compressor_LiteralBlock0.getOffset());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(4).when(parameters0).getLazyMatchingThreshold();
      doReturn(4).when(parameters0).getMaxBackReferenceLength();
      doReturn(4).when(parameters0).getMaxCandidates();
      doReturn(4, (-2598)).when(parameters0).getMaxOffset();
      doReturn(4, (-2598), 1132).when(parameters0).getMinBackReferenceLength();
      doReturn(0).when(parameters0).getNiceBackReferenceLength();
      doReturn(4, 4).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
