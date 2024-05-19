
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
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 1461);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1461, lZ77Compressor_BackReference0.getLength());
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference1 = new LZ77Compressor.BackReference(1461, 1461);
      assertNotNull(lZ77Compressor_BackReference1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference1.getType());
      assertEquals(1461, lZ77Compressor_BackReference1.getOffset());
      assertEquals(1461, lZ77Compressor_BackReference1.getLength());
      assertFalse(lZ77Compressor_BackReference1.equals((Object)lZ77Compressor_BackReference0));
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false, false, false).when(parameters0).getLazyMatching();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn((-779), (-5041), 2034).when(parameters0).getMaxBackReferenceLength();
      doReturn(9996, 9996, 9996).when(parameters0).getMaxCandidates();
      doReturn(16, 9975, 16, 8226, 5).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 3, 1).when(parameters0).getMinBackReferenceLength();
      doReturn(1479, 785, (-1741)).when(parameters0).getNiceBackReferenceLength();
      doReturn(734, 1461, 3, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[0];
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      byte[] byteArray1 = new byte[4];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte)2;
      byteArray1[1] = (byte)42;
      byteArray1[2] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(4, byteArray1.length);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)2, (byte)42, (byte)0, (byte)0}, byteArray1);
      
      byteArray1[3] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1461, 1461);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(1461, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1461, lZ77Compressor_BackReference0.getOffset());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn((-779), (-5041), 2034, 1461, 734).when(parameters0).getMaxBackReferenceLength();
      doReturn((-5041), (-5041), (-5041), (-5041), 2034).when(parameters0).getMaxCandidates();
      doReturn(0).when(parameters0).getMaxLiteralLength();
      doReturn(16, 9975, 16, 8226, 5).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 3, 1).when(parameters0).getMinBackReferenceLength();
      doReturn(1479, 785, (-1741), 1, 9975).when(parameters0).getNiceBackReferenceLength();
      doReturn(734, 1461, 785).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      lZ77Compressor0.finish();
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)42;
      byteArray0[2] = (byte) (-4);
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)2, (byte)42, (byte) (-4), (byte)0}, byteArray0);
      
      byteArray0[3] = (byte) (-4);
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 1461);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1461, lZ77Compressor_BackReference0.getLength());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference1 = new LZ77Compressor.BackReference(1461, 1461);
      assertNotNull(lZ77Compressor_BackReference1);
      assertEquals(1461, lZ77Compressor_BackReference1.getOffset());
      assertEquals(1461, lZ77Compressor_BackReference1.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference1.getType());
      assertFalse(lZ77Compressor_BackReference1.equals((Object)lZ77Compressor_BackReference0));
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn((-779), (-5041), 2034, 1461, 734).when(parameters0).getMaxBackReferenceLength();
      doReturn(9996, 9996, 9996, 9996, 2034).when(parameters0).getMaxCandidates();
      doReturn(16, 9975, 16, 8226, 5).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 3, 1).when(parameters0).getMinBackReferenceLength();
      doReturn(1479, 785, (-1741), 9969, 9975).when(parameters0).getNiceBackReferenceLength();
      doReturn(734, 1461, 785).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte)0;
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)2, (byte)2, (byte)0, (byte)0}, byteArray0);
      
      byteArray0[3] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 1461);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1461, lZ77Compressor_BackReference0.getLength());
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference1 = new LZ77Compressor.BackReference(1461, 1461);
      assertNotNull(lZ77Compressor_BackReference1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference1.getType());
      assertEquals(1461, lZ77Compressor_BackReference1.getOffset());
      assertEquals(1461, lZ77Compressor_BackReference1.getLength());
      assertFalse(lZ77Compressor_BackReference1.equals((Object)lZ77Compressor_BackReference0));
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn((-779), (-5041), 2034, 1461, 734).when(parameters0).getMaxBackReferenceLength();
      doReturn(9996, 9996, 9996, 9996, 2034).when(parameters0).getMaxCandidates();
      doReturn(16, 9975, 16, 8226, 5).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 3, 1).when(parameters0).getMinBackReferenceLength();
      doReturn(1479, 785, (-1741), 9969, 9975).when(parameters0).getNiceBackReferenceLength();
      doReturn(734, 1461, 32768).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[13];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)42;
      byteArray0[2] = (byte)0;
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(13, byteArray0.length);
      
      byteArray0[3] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-112);
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[4] = (byte) (-128);
      byteArray0[3] = (byte)35;
      byteArray0[4] = (byte) (-112);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (byte)0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(5, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte) (-112), (byte)0, (byte)0, (byte)35, (byte) (-112)}, byteArray0);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)35).when(parameters0).getMinBackReferenceLength();
      doReturn(1841, (int)(byte)35).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.compress(byteArray0);
      assertEquals(5, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-112), (byte)0, (byte)0, (byte)35, (byte) (-112)}, byteArray0);
      
      lZ77Compressor0.finish();
      lZ77Compressor0.finish();
      lZ77Compressor0.finish();
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      String string0 = "";
      // Undeclared exception!
      try { 
        LZ77Compressor.Block.BlockType.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 1461);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(1461, lZ77Compressor_BackReference0.getLength());
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference1 = new LZ77Compressor.BackReference(1461, 1461);
      assertNotNull(lZ77Compressor_BackReference1);
      assertEquals(1461, lZ77Compressor_BackReference1.getOffset());
      assertEquals(1461, lZ77Compressor_BackReference1.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference1.getType());
      assertFalse(lZ77Compressor_BackReference1.equals((Object)lZ77Compressor_BackReference0));
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false, false, false).when(parameters0).getLazyMatching();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn((-779), (-5041), 2034).when(parameters0).getMaxBackReferenceLength();
      doReturn(9996, 9996, 9996).when(parameters0).getMaxCandidates();
      doReturn(16, 9975, 16, 8226, 5).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 3, 1).when(parameters0).getMinBackReferenceLength();
      doReturn(1479, 785, (-1741)).when(parameters0).getNiceBackReferenceLength();
      doReturn(734, 1461, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)42;
      byteArray0[2] = (byte)0;
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)2, (byte)42, (byte)0, (byte)0}, byteArray0);
      
      byteArray0[3] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, (-8));
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-8), lZ77Compressor_BackReference0.getLength());
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(0, int0);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-8), lZ77Compressor_BackReference0.getLength());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 18, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-31);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 1461);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(1461, lZ77Compressor_BackReference0.getLength());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference1 = new LZ77Compressor.BackReference(1461, 1461);
      assertNotNull(lZ77Compressor_BackReference1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference1.getType());
      assertEquals(1461, lZ77Compressor_BackReference1.getOffset());
      assertEquals(1461, lZ77Compressor_BackReference1.getLength());
      assertFalse(lZ77Compressor_BackReference1.equals((Object)lZ77Compressor_BackReference0));
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(734).when(parameters0).getLazyMatchingThreshold();
      doReturn(734).when(parameters0).getMaxBackReferenceLength();
      doReturn(1546).when(parameters0).getMaxCandidates();
      doReturn(2345, (-3)).when(parameters0).getMaxOffset();
      doReturn(0, (-1), 5106).when(parameters0).getMinBackReferenceLength();
      doReturn((-1730)).when(parameters0).getNiceBackReferenceLength();
      doReturn(734, 1461).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)42;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      lZ77Compressor0.finish();
      lZ77Compressor0.compress(byteArray0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)2, (byte)42, (byte)0, (byte)0}, byteArray0);
      
      lZ77Compressor0.finish();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 0);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(0, int0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, 0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(1, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string0);
      assertNotNull(string0);
      assertEquals(1, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertEquals(0, int1);
      assertEquals(1, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertTrue(int1 == int0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(16).when(parameters0).getLazyMatchingThreshold();
      doReturn((int)(byte)0, (int)(byte)0, (-59), (-1730), 2064).when(parameters0).getMaxBackReferenceLength();
      doReturn((-52), 1, 1, 0, 1).when(parameters0).getMaxCandidates();
      doReturn(3198, (-59)).when(parameters0).getMaxLiteralLength();
      doReturn((-66), 60, (-1730), 0, 1).when(parameters0).getMaxOffset();
      doReturn(0, 0, (int)(byte)0, 8, (int)(byte)0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, (-1730), 1017, 1).when(parameters0).getNiceBackReferenceLength();
      doReturn(2064, 16).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray1 = new byte[9];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte) (-31);
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte)0;
      byteArray1[6] = (byte)0;
      byteArray1[7] = (byte)0;
      byteArray1[8] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(3, 128, 3, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)0;
      lZ77Compressor0.finish();
      byteArray0[0] = (byte)0;
      byte byte1 = (byte)43;
      byteArray0[1] = (byte)43;
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)43, (byte)0, (byte)0}, byteArray0);
      
      byteArray0[2] = (byte) (-20);
      byte byte2 = (byte)0;
      byte[] byteArray1 = new byte[3];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)43;
      byteArray1[2] = (byte) (-20);
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (byte)0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(3, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte) (-1), (byte)0, (byte)0}, byteArray0);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertNotNull(byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(3, byteArray0.length);
      assertEquals(3, byteArray1.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte) (-1), (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte)0, (byte)0}, byteArray1);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(3, (byte)0);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 3 and length 0", string0);
      assertNotNull(string0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      
      String string1 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 3 and length 0", string1);
      assertNotNull(string1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertTrue(string1.equals((Object)string0));
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(3, int0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(4, 836).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.prefill(byteArray0);
      assertSame(byteArray0, byteArray1);
      assertEquals(3, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-1), (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)92;
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-108);
      byteArray0[3] = (byte) (-67);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-119);
      byte byte1 = (byte)0;
      byteArray0[6] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-67), (byte) (-108));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(7, byteArray0.length);
      assertEquals((-108), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-67), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte)92, (byte)0, (byte) (-108), (byte) (-67), (byte)0, (byte) (-119), (byte)0}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -67 with length -108", string0);
      assertNotNull(string0);
      assertEquals(7, byteArray0.length);
      assertEquals((-108), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-67), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte)92, (byte)0, (byte) (-108), (byte) (-67), (byte)0, (byte) (-119), (byte)0}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -67 with length -108", string1);
      assertNotNull(string1);
      assertEquals(7, byteArray0.length);
      assertEquals((-108), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-67), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte)92, (byte)0, (byte) (-108), (byte) (-67), (byte)0, (byte) (-119), (byte)0}, byteArray0);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte) (-67), (byte)92);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals((-67), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(92, lZ77Compressor_BackReference0.getLength());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals((-67), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(92, lZ77Compressor_BackReference0.getLength());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(parameters0).getLazyMatching();
      doReturn(0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(32767, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(12, 3).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -67 with length -108", string2);
      assertNotNull(string2);
      assertEquals(7, byteArray0.length);
      assertEquals((-108), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-67), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte)92, (byte)0, (byte) (-108), (byte) (-67), (byte)0, (byte) (-119), (byte)0}, byteArray0);
      
      lZ77Compressor0.finish();
      lZ77Compressor0.compress(byteArray0);
      assertEquals(7, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)92, (byte)0, (byte) (-108), (byte) (-67), (byte)0, (byte) (-119), (byte)0}, byteArray0);
      
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
  public void test12()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(32767, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(32767, 2, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[1];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      lZ77Compressor0.compress(byteArray1, 2, (int) (byte)0);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(1, byteArray1.length);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
      
      byteArray1[0] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 1461);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(1461, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference1 = new LZ77Compressor.BackReference(1461, 1461);
      assertNotNull(lZ77Compressor_BackReference1);
      assertEquals(1461, lZ77Compressor_BackReference1.getOffset());
      assertEquals(1461, lZ77Compressor_BackReference1.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference1.getType());
      assertFalse(lZ77Compressor_BackReference1.equals((Object)lZ77Compressor_BackReference0));
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(734, 1461).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)42;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      lZ77Compressor0.compress(byteArray0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)2, (byte)42, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)65;
      byteArray0[1] = (byte) (-14);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-28);
      byteArray0[4] = (byte) (-1);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-28), (byte)65);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(5, byteArray0.length);
      assertEquals(65, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-28), lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte)65, (byte) (-14), (byte) (-1), (byte) (-28), (byte) (-1)}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -28 with length 65", string0);
      assertNotNull(string0);
      assertEquals(5, byteArray0.length);
      assertEquals(65, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-28), lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte)65, (byte) (-14), (byte) (-1), (byte) (-28), (byte) (-1)}, byteArray0);
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-1), 2862);
      assertNotNull(lZ77Compressor_LiteralBlock1);
      assertEquals(5, byteArray0.length);
      assertEquals((-1), lZ77Compressor_LiteralBlock1.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock1.getType());
      assertEquals(2862, lZ77Compressor_LiteralBlock1.getLength());
      assertFalse(lZ77Compressor_LiteralBlock1.equals((Object)lZ77Compressor_LiteralBlock0));
      assertArrayEquals(new byte[] {(byte)65, (byte) (-14), (byte) (-1), (byte) (-28), (byte) (-1)}, byteArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(2862, 1544, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.compress(byteArray0, 2862, (int) (byte) (-14));
      assertEquals(5, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)65, (byte) (-14), (byte) (-1), (byte) (-28), (byte) (-1)}, byteArray0);
      
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(5, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)65, (byte) (-14), (byte) (-1), (byte) (-28), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn((-14), 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(615, 256, 65536).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[1];
      lZ77Compressor0.finish();
      lZ77Compressor0.finish();
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(1, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      byteArray0[0] = (byte) (-127);
      lZ77Compressor0.compress(byteArray0);
      assertEquals(1, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-127)}, byteArray0);
      
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-127), 1024);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(1, byteArray0.length);
      assertEquals(1024, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-127), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte) (-127)}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -127 with length 1024", string0);
      assertNotNull(string0);
      assertEquals(1, byteArray0.length);
      assertEquals(1024, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-127), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte) (-127)}, byteArray0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(1, byteArray0.length);
      assertEquals(1024, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-127), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte) (-127)}, byteArray0);
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1726, (byte) (-127));
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-127), lZ77Compressor_BackReference0.getLength());
      assertEquals(1726, lZ77Compressor_BackReference0.getOffset());
      
      String string1 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1726 and length -127", string1);
      assertNotNull(string1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-127), lZ77Compressor_BackReference0.getLength());
      assertEquals(1726, lZ77Compressor_BackReference0.getOffset());
      assertFalse(string1.equals((Object)string0));
      
      String string2 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1726 and length -127", string2);
      assertNotNull(string2);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-127), lZ77Compressor_BackReference0.getLength());
      assertEquals(1726, lZ77Compressor_BackReference0.getOffset());
      assertTrue(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      
      String string3 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1726 and length -127", string3);
      assertNotNull(string3);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-127), lZ77Compressor_BackReference0.getLength());
      assertEquals(1726, lZ77Compressor_BackReference0.getOffset());
      assertFalse(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string1));
      
      lZ77Compressor0.finish();
      String string4 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1726 and length -127", string4);
      assertNotNull(string4);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-127), lZ77Compressor_BackReference0.getLength());
      assertEquals(1726, lZ77Compressor_BackReference0.getOffset());
      assertTrue(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string2));
      assertFalse(string4.equals((Object)string0));
      assertTrue(string4.equals((Object)string3));
      
      // Undeclared exception!
      try { 
        LZ77Compressor.Block.BlockType.valueOf("org.apache.commons.compress.compressors.lz77support.Parameters$1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.org.apache.commons.compress.compressors.lz77support.Parameters$1
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(1193).when(parameters0).getMinBackReferenceLength();
      doReturn(1193, 1708, 1193).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)0;
      lZ77Compressor0.finish();
      byteArray0[0] = (byte)0;
      byte byte1 = (byte)43;
      byteArray0[1] = (byte)43;
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(9, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)43, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      byteArray0[2] = (byte) (-20);
      byte byte2 = (byte)0;
      byte[] byteArray1 = new byte[3];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)43;
      byteArray1[2] = (byte) (-20);
      lZ77Compressor0.compress(byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(3, byteArray1.length);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)43, (byte) (-20)}, byteArray1);
      
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
  public void test17()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-1731), (-1731));
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals((-1731), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1731), lZ77Compressor_BackReference0.getOffset());
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals((-1731), int0);
      assertEquals((-1731), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1731), lZ77Compressor_BackReference0.getOffset());
      
      int int1 = lZ77Compressor_BackReference0.getOffset();
      assertEquals((-1731), int1);
      assertEquals((-1731), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1731), lZ77Compressor_BackReference0.getOffset());
      assertTrue(int1 == int0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -1731 and length -1731", string0);
      assertNotNull(string0);
      assertEquals((-1731), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1731), lZ77Compressor_BackReference0.getOffset());
      
      byteArray0[2] = (byte) (-51);
      byteArray0[3] = (byte)2;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (-1731));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(4, byteArray0.length);
      assertEquals((-1731), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-51), (byte)2}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -1731", string1);
      assertNotNull(string1);
      assertEquals(4, byteArray0.length);
      assertEquals((-1731), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertFalse(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-51), (byte)2}, byteArray0);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -1731", string2);
      assertNotNull(string2);
      assertEquals(4, byteArray0.length);
      assertEquals((-1731), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertFalse(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-51), (byte)2}, byteArray0);
      
      String string3 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -1731 and length -1731", string3);
      assertNotNull(string3);
      assertEquals((-1731), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1731), lZ77Compressor_BackReference0.getOffset());
      assertFalse(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string2));
      
      String string4 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -1731", string4);
      assertNotNull(string4);
      assertEquals(4, byteArray0.length);
      assertEquals((-1731), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertFalse(string4.equals((Object)string0));
      assertTrue(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string2));
      assertFalse(string4.equals((Object)string3));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-51), (byte)2}, byteArray0);
      
      String string5 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -1731", string5);
      assertNotNull(string5);
      assertEquals(4, byteArray0.length);
      assertEquals((-1731), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string5.equals((Object)string4));
      assertTrue(string5.equals((Object)string2));
      assertTrue(string5.equals((Object)string1));
      assertFalse(string5.equals((Object)string0));
      assertFalse(string5.equals((Object)string3));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-51), (byte)2}, byteArray0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(4, byteArray0.length);
      assertEquals((-1731), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-51), (byte)2}, byteArray0);
      
      String string6 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -1731", string6);
      assertNotNull(string6);
      assertEquals(4, byteArray0.length);
      assertEquals((-1731), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string6.equals((Object)string2));
      assertTrue(string6.equals((Object)string1));
      assertTrue(string6.equals((Object)string4));
      assertFalse(string6.equals((Object)string0));
      assertTrue(string6.equals((Object)string5));
      assertFalse(string6.equals((Object)string3));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-51), (byte)2}, byteArray0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType1);
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals((-1731), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1731), lZ77Compressor_BackReference0.getOffset());
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      
      String string7 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -1731 and length -1731", string7);
      assertNotNull(string7);
      assertEquals((-1731), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1731), lZ77Compressor_BackReference0.getOffset());
      assertFalse(string7.equals((Object)string2));
      assertTrue(string7.equals((Object)string0));
      assertFalse(string7.equals((Object)string1));
      assertFalse(string7.equals((Object)string6));
      assertTrue(string7.equals((Object)string3));
      assertFalse(string7.equals((Object)string4));
      assertFalse(string7.equals((Object)string5));
      
      String string8 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -1731 and length -1731", string8);
      assertNotNull(string8);
      assertEquals((-1731), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1731), lZ77Compressor_BackReference0.getOffset());
      assertTrue(string8.equals((Object)string0));
      assertFalse(string8.equals((Object)string2));
      assertFalse(string8.equals((Object)string1));
      assertFalse(string8.equals((Object)string6));
      assertTrue(string8.equals((Object)string3));
      assertTrue(string8.equals((Object)string7));
      assertFalse(string8.equals((Object)string5));
      assertFalse(string8.equals((Object)string4));
      
      String string9 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -1731 and length -1731", string9);
      assertNotNull(string9);
      assertEquals((-1731), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1731), lZ77Compressor_BackReference0.getOffset());
      assertTrue(string9.equals((Object)string7));
      assertFalse(string9.equals((Object)string2));
      assertTrue(string9.equals((Object)string0));
      assertFalse(string9.equals((Object)string4));
      assertFalse(string9.equals((Object)string5));
      assertFalse(string9.equals((Object)string1));
      assertFalse(string9.equals((Object)string6));
      assertTrue(string9.equals((Object)string3));
      assertTrue(string9.equals((Object)string8));
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType2);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      
      String string10 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -1731", string10);
      assertNotNull(string10);
      assertEquals(4, byteArray0.length);
      assertEquals((-1731), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string10.equals((Object)string2));
      assertTrue(string10.equals((Object)string6));
      assertFalse(string10.equals((Object)string7));
      assertFalse(string10.equals((Object)string0));
      assertTrue(string10.equals((Object)string5));
      assertTrue(string10.equals((Object)string1));
      assertFalse(string10.equals((Object)string8));
      assertTrue(string10.equals((Object)string4));
      assertFalse(string10.equals((Object)string3));
      assertFalse(string10.equals((Object)string9));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-51), (byte)2}, byteArray0);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference1 = new LZ77Compressor.BackReference((byte)0, (byte)0);
      assertNotNull(lZ77Compressor_BackReference1);
      assertEquals(0, lZ77Compressor_BackReference1.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference1.getType());
      assertEquals(0, lZ77Compressor_BackReference1.getLength());
      assertFalse(lZ77Compressor_BackReference1.equals((Object)lZ77Compressor_BackReference0));
      
      LZ77Compressor.EOD lZ77Compressor_EOD1 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD1.getType());
      assertFalse(lZ77Compressor_EOD1.equals((Object)lZ77Compressor_EOD0));
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType3 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType3);
      assertSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType2);
      assertNotSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType1);
      assertEquals(4, byteArray0.length);
      assertEquals((-1731), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertFalse(lZ77Compressor_Block_BlockType3.equals((Object)lZ77Compressor_Block_BlockType2));
      assertFalse(lZ77Compressor_Block_BlockType3.equals((Object)lZ77Compressor_Block_BlockType1));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-51), (byte)2}, byteArray0);
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray1 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray1);
      assertNotSame(lZ77Compressor_Block_BlockTypeArray1, lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray1.length);
      assertFalse(lZ77Compressor_Block_BlockTypeArray1.equals((Object)lZ77Compressor_Block_BlockTypeArray0));
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(2, 6568).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-51), (byte)2}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-104);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[2] = (byte)25;
      byteArray0[5] = (byte)10;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (-22));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(6, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-22), lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte) (-104), (byte)0, (byte)25, (byte)0, (byte)0, (byte)10}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -22", string0);
      assertNotNull(string0);
      assertEquals(6, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-22), lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte) (-104), (byte)0, (byte)25, (byte)0, (byte)0, (byte)10}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -22", string1);
      assertNotNull(string1);
      assertEquals(6, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-22), lZ77Compressor_LiteralBlock0.getLength());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte) (-104), (byte)0, (byte)25, (byte)0, (byte)0, (byte)10}, byteArray0);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -22", string2);
      assertNotNull(string2);
      assertEquals(6, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-22), lZ77Compressor_LiteralBlock0.getLength());
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertArrayEquals(new byte[] {(byte) (-104), (byte)0, (byte)25, (byte)0, (byte)0, (byte)10}, byteArray0);
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -22", string3);
      assertNotNull(string3);
      assertEquals(6, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-22), lZ77Compressor_LiteralBlock0.getLength());
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string2));
      assertArrayEquals(new byte[] {(byte) (-104), (byte)0, (byte)25, (byte)0, (byte)0, (byte)10}, byteArray0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(6, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-22), lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte) (-104), (byte)0, (byte)25, (byte)0, (byte)0, (byte)10}, byteArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)0, 3).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
      byte[] byteArray1 = new byte[7];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte) (-101);
      byteArray1[1] = (byte) (-104);
      byteArray1[2] = (byte)10;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)25;
      byteArray1[5] = (byte)25;
      byteArray1[6] = (byte)10;
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32768, 32768);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(32768, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(32768, lZ77Compressor_BackReference0.getLength());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(32768, 32768).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 1724, 32768);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 433, 433);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(0, byteArray0.length);
      assertEquals(433, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(433, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 433 with length 433", string0);
      assertNotNull(string0);
      assertEquals(0, byteArray0.length);
      assertEquals(433, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(433, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 433 with length 433", string1);
      assertNotNull(string1);
      assertEquals(0, byteArray0.length);
      assertEquals(433, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(433, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(0, byteArray0.length);
      assertEquals(433, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(433, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType1);
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType2);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertEquals(0, byteArray0.length);
      assertEquals(433, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(433, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      int int0 = lZ77Compressor_LiteralBlock0.getOffset();
      assertEquals(433, int0);
      assertEquals(0, byteArray0.length);
      assertEquals(433, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(433, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, 433, (-1));
      assertNotNull(lZ77Compressor_LiteralBlock1);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock1.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock1.getLength());
      assertEquals(433, lZ77Compressor_LiteralBlock1.getOffset());
      assertFalse(lZ77Compressor_LiteralBlock1.equals((Object)lZ77Compressor_LiteralBlock0));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1286, (-1));
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1286, lZ77Compressor_BackReference0.getOffset());
      assertEquals((-1), lZ77Compressor_BackReference0.getLength());
      
      String string2 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1286 and length -1", string2);
      assertNotNull(string2);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1286, lZ77Compressor_BackReference0.getOffset());
      assertEquals((-1), lZ77Compressor_BackReference0.getLength());
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      
      String string3 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1286 and length -1", string3);
      assertNotNull(string3);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1286, lZ77Compressor_BackReference0.getOffset());
      assertEquals((-1), lZ77Compressor_BackReference0.getLength());
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string2));
      
      int int1 = lZ77Compressor_BackReference0.getLength();
      assertEquals((-1), int1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1286, lZ77Compressor_BackReference0.getOffset());
      assertEquals((-1), lZ77Compressor_BackReference0.getLength());
      assertFalse(int1 == int0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(parameters0).getWindowSize();
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
  public void test21()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1130, 1130);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1130 and length 1130", string0);
      assertNotNull(string0);
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      
      String string1 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1130 and length 1130", string1);
      assertNotNull(string1);
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      assertTrue(string1.equals((Object)string0));
      
      String string2 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1130 and length 1130", string2);
      assertNotNull(string2);
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(1130, int0);
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      
      byte[] byteArray0 = new byte[0];
      int int1 = 0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string3 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1130 and length 1130", string3);
      assertNotNull(string3);
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      
      String string4 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string4);
      assertNotNull(string4);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertFalse(string4.equals((Object)string2));
      assertFalse(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string1));
      assertFalse(string4.equals((Object)string0));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string5 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string5);
      assertNotNull(string5);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertFalse(string5.equals((Object)string3));
      assertFalse(string5.equals((Object)string0));
      assertFalse(string5.equals((Object)string2));
      assertFalse(string5.equals((Object)string1));
      assertTrue(string5.equals((Object)string4));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertNotNull(byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      
      String string6 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1130 and length 1130", string6);
      assertNotNull(string6);
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      assertTrue(string6.equals((Object)string3));
      assertFalse(string6.equals((Object)string5));
      assertTrue(string6.equals((Object)string0));
      assertFalse(string6.equals((Object)string4));
      assertTrue(string6.equals((Object)string2));
      assertTrue(string6.equals((Object)string1));
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1130, 1130, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      String string7 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string7);
      assertNotNull(string7);
      assertSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertTrue(string7.equals((Object)string4));
      assertFalse(string7.equals((Object)string2));
      assertFalse(string7.equals((Object)string0));
      assertTrue(string7.equals((Object)string5));
      assertFalse(string7.equals((Object)string1));
      assertFalse(string7.equals((Object)string6));
      assertFalse(string7.equals((Object)string3));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      String string8 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string8);
      assertNotNull(string8);
      assertSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertTrue(string8.equals((Object)string4));
      assertFalse(string8.equals((Object)string1));
      assertFalse(string8.equals((Object)string3));
      assertFalse(string8.equals((Object)string6));
      assertFalse(string8.equals((Object)string0));
      assertFalse(string8.equals((Object)string2));
      assertTrue(string8.equals((Object)string5));
      assertTrue(string8.equals((Object)string7));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      lZ77Compressor0.compress(byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0, 0, 1130);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock((byte[]) null, 255, 255);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(255, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(255, lZ77Compressor_LiteralBlock0.getOffset());
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 255 with length 255", string0);
      assertNotNull(string0);
      assertEquals(255, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(255, lZ77Compressor_LiteralBlock0.getOffset());
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 255 with length 255", string1);
      assertNotNull(string1);
      assertEquals(255, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(255, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string1.equals((Object)string0));
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 255 with length 255", string2);
      assertNotNull(string2);
      assertEquals(255, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(255, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 255 with length 255", string3);
      assertNotNull(string3);
      assertEquals(255, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(255, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string0));
      
      String string4 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 255 with length 255", string4);
      assertNotNull(string4);
      assertEquals(255, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(255, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string2));
      assertTrue(string4.equals((Object)string0));
      assertTrue(string4.equals((Object)string3));
      
      String string5 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 255 with length 255", string5);
      assertNotNull(string5);
      assertEquals(255, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(255, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string5.equals((Object)string3));
      assertTrue(string5.equals((Object)string1));
      assertTrue(string5.equals((Object)string4));
      assertTrue(string5.equals((Object)string0));
      assertTrue(string5.equals((Object)string2));
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-1892), 255);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertEquals((-1892), lZ77Compressor_BackReference0.getOffset());
      
      String string6 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -1892 and length 255", string6);
      assertNotNull(string6);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertEquals((-1892), lZ77Compressor_BackReference0.getOffset());
      assertFalse(string6.equals((Object)string5));
      assertFalse(string6.equals((Object)string0));
      assertFalse(string6.equals((Object)string2));
      assertFalse(string6.equals((Object)string3));
      assertFalse(string6.equals((Object)string1));
      assertFalse(string6.equals((Object)string4));
      
      String string7 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -1892 and length 255", string7);
      assertNotNull(string7);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertEquals((-1892), lZ77Compressor_BackReference0.getOffset());
      assertFalse(string7.equals((Object)string1));
      assertFalse(string7.equals((Object)string2));
      assertTrue(string7.equals((Object)string6));
      assertFalse(string7.equals((Object)string0));
      assertFalse(string7.equals((Object)string4));
      assertFalse(string7.equals((Object)string5));
      assertFalse(string7.equals((Object)string3));
      
      String string8 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -1892 and length 255", string8);
      assertNotNull(string8);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertEquals((-1892), lZ77Compressor_BackReference0.getOffset());
      assertFalse(string8.equals((Object)string1));
      assertFalse(string8.equals((Object)string4));
      assertFalse(string8.equals((Object)string2));
      assertFalse(string8.equals((Object)string5));
      assertFalse(string8.equals((Object)string0));
      assertFalse(string8.equals((Object)string3));
      assertTrue(string8.equals((Object)string7));
      assertTrue(string8.equals((Object)string6));
      
      String string9 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -1892 and length 255", string9);
      assertNotNull(string9);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertEquals((-1892), lZ77Compressor_BackReference0.getOffset());
      assertFalse(string9.equals((Object)string4));
      assertTrue(string9.equals((Object)string6));
      assertFalse(string9.equals((Object)string0));
      assertFalse(string9.equals((Object)string2));
      assertFalse(string9.equals((Object)string1));
      assertTrue(string9.equals((Object)string8));
      assertTrue(string9.equals((Object)string7));
      assertFalse(string9.equals((Object)string5));
      assertFalse(string9.equals((Object)string3));
      
      String string10 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -1892 and length 255", string10);
      assertNotNull(string10);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertEquals((-1892), lZ77Compressor_BackReference0.getOffset());
      assertFalse(string10.equals((Object)string3));
      assertFalse(string10.equals((Object)string2));
      assertTrue(string10.equals((Object)string9));
      assertFalse(string10.equals((Object)string5));
      assertTrue(string10.equals((Object)string7));
      assertFalse(string10.equals((Object)string0));
      assertTrue(string10.equals((Object)string8));
      assertTrue(string10.equals((Object)string6));
      assertFalse(string10.equals((Object)string4));
      assertFalse(string10.equals((Object)string1));
      
      int int0 = lZ77Compressor_BackReference0.getLength();
      assertEquals(255, int0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertEquals((-1892), lZ77Compressor_BackReference0.getOffset());
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(255).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      String string11 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 255 with length 255", string11);
      assertNotNull(string11);
      assertEquals(255, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(255, lZ77Compressor_LiteralBlock0.getOffset());
      assertFalse(string11.equals((Object)string10));
      assertTrue(string11.equals((Object)string1));
      assertTrue(string11.equals((Object)string4));
      assertFalse(string11.equals((Object)string8));
      assertTrue(string11.equals((Object)string0));
      assertFalse(string11.equals((Object)string9));
      assertFalse(string11.equals((Object)string6));
      assertFalse(string11.equals((Object)string7));
      assertTrue(string11.equals((Object)string2));
      assertTrue(string11.equals((Object)string3));
      assertTrue(string11.equals((Object)string5));
      
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
  public void test23()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = null;
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress((byte[]) null, 3, 1290);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = null;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock((byte[]) null, 0, 0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 0);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      int int0 = lZ77Compressor_BackReference0.getLength();
      assertEquals(0, int0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 0 and length 0", string0);
      assertNotNull(string0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string1);
      assertNotNull(string1);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertFalse(string1.equals((Object)string0));
      
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string2);
      assertNotNull(string2);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertFalse(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      
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
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)35;
      byteArray0[0] = (byte)35;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      int int0 = (-1429);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (-1429));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(4, byteArray0.length);
      assertEquals((-1429), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte)35, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -1429", string0);
      assertNotNull(string0);
      assertEquals(4, byteArray0.length);
      assertEquals((-1429), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte)35, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -1429", string1);
      assertNotNull(string1);
      assertEquals(4, byteArray0.length);
      assertEquals((-1429), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte)35, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
      byte[] byteArray1 = new byte[3];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      lZ77Compressor0.compress(byteArray1, 0, (-1));
      assertNotSame(byteArray1, byteArray0);
      assertEquals(3, byteArray1.length);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray1);
      
      byteArray1[0] = (byte)35;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)115;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-105);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte)16;
      lZ77Compressor0.compress(byteArray0, (int) (byte)0, 0);
      assertEquals(7, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)115, (byte)0, (byte)0, (byte) (-105), (byte)0, (byte)1, (byte)16}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = null;
      int int0 = 1672;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock((byte[]) null, 1672, 1672);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 1672 with length 1672", string0);
      assertNotNull(string0);
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 1672 with length 1672", string1);
      assertNotNull(string1);
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string1.equals((Object)string0));
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 1672 with length 1672", string2);
      assertNotNull(string2);
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 1672 with length 1672", string3);
      assertNotNull(string3);
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      
      int int1 = lZ77Compressor_LiteralBlock0.getOffset();
      assertEquals(1672, int1);
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(int1 == int0);
      
      int int2 = lZ77Compressor_LiteralBlock0.getLength();
      assertEquals(1672, int2);
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1672, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(int2 == int0);
      assertTrue(int2 == int1);
      
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
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)123;
      byteArray0[0] = (byte)123;
      byte byte1 = (byte)2;
      byteArray0[1] = (byte)2;
      byte byte2 = (byte)109;
      byteArray0[2] = (byte)109;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (-1), (-1));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(3, byteArray0.length);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte)123, (byte)2, (byte)109}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -1 with length -1", string0);
      assertNotNull(string0);
      assertEquals(3, byteArray0.length);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte)123, (byte)2, (byte)109}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -1 with length -1", string1);
      assertNotNull(string1);
      assertEquals(3, byteArray0.length);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte)123, (byte)2, (byte)109}, byteArray0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(3, byteArray0.length);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte)123, (byte)2, (byte)109}, byteArray0);
      
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
  public void test29()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)16;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte)0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(3, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)16}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 2 with length 0", string0);
      assertNotNull(string0);
      assertEquals(3, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)16}, byteArray0);
      
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertEquals(0, int0);
      assertEquals(3, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)16}, byteArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 2 with length 0", string1);
      assertNotNull(string1);
      assertEquals(3, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)16}, byteArray0);
      
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)11;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-59);
      byteArray0[5] = (byte) (-96);
      byteArray0[6] = (byte)109;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 16, 250);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(7, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(16, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(250, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)11, (byte)8, (byte)3, (byte)0, (byte) (-59), (byte) (-96), (byte)109}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 16 with length 250", string0);
      assertNotNull(string0);
      assertEquals(7, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(16, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(250, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)11, (byte)8, (byte)3, (byte)0, (byte) (-59), (byte) (-96), (byte)109}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 16 with length 250", string1);
      assertNotNull(string1);
      assertEquals(7, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(16, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(250, lZ77Compressor_LiteralBlock0.getLength());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte)11, (byte)8, (byte)3, (byte)0, (byte) (-59), (byte) (-96), (byte)109}, byteArray0);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 16 with length 250", string2);
      assertNotNull(string2);
      assertEquals(7, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(16, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(250, lZ77Compressor_LiteralBlock0.getLength());
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertArrayEquals(new byte[] {(byte)11, (byte)8, (byte)3, (byte)0, (byte) (-59), (byte) (-96), (byte)109}, byteArray0);
      
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertEquals(250, int0);
      assertEquals(7, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(16, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(250, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)11, (byte)8, (byte)3, (byte)0, (byte) (-59), (byte) (-96), (byte)109}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1130, 1130);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1130 and length 1130", string0);
      assertNotNull(string0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      
      String string1 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1130 and length 1130", string1);
      assertNotNull(string1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      assertTrue(string1.equals((Object)string0));
      
      String string2 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1130 and length 1130", string2);
      assertNotNull(string2);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(1130, int0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      
      byte[] byteArray0 = new byte[0];
      int int1 = 0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string3 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1130 and length 1130", string3);
      assertNotNull(string3);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string2));
      
      String string4 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string4);
      assertNotNull(string4);
      assertEquals(0, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertFalse(string4.equals((Object)string0));
      assertFalse(string4.equals((Object)string1));
      assertFalse(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string2));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string5 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string5);
      assertNotNull(string5);
      assertEquals(0, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertFalse(string5.equals((Object)string3));
      assertTrue(string5.equals((Object)string4));
      assertFalse(string5.equals((Object)string2));
      assertFalse(string5.equals((Object)string0));
      assertFalse(string5.equals((Object)string1));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertNotNull(byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      
      String string6 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 1130 and length 1130", string6);
      assertNotNull(string6);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1130, lZ77Compressor_BackReference0.getLength());
      assertEquals(1130, lZ77Compressor_BackReference0.getOffset());
      assertTrue(string6.equals((Object)string0));
      assertTrue(string6.equals((Object)string3));
      assertTrue(string6.equals((Object)string2));
      assertTrue(string6.equals((Object)string1));
      assertFalse(string6.equals((Object)string4));
      assertFalse(string6.equals((Object)string5));
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      String string7 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string7);
      assertNotNull(string7);
      assertSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string7.equals((Object)string5));
      assertFalse(string7.equals((Object)string1));
      assertFalse(string7.equals((Object)string0));
      assertFalse(string7.equals((Object)string6));
      assertFalse(string7.equals((Object)string2));
      assertFalse(string7.equals((Object)string3));
      assertTrue(string7.equals((Object)string4));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.compress(byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 0, 564);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-1824), (-1824));
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals((-1824), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1824), lZ77Compressor_BackReference0.getOffset());
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals((-1824), int0);
      assertEquals((-1824), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1824), lZ77Compressor_BackReference0.getOffset());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals((-1824), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1824), lZ77Compressor_BackReference0.getOffset());
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-15);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)53;
      byteArray0[3] = (byte)90;
      byteArray0[4] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, (byte) (-15));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(5, byteArray0.length);
      assertEquals((-15), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte) (-15), (byte)0, (byte)53, (byte)90, (byte)0}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -15", string0);
      assertNotNull(string0);
      assertEquals(5, byteArray0.length);
      assertEquals((-15), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte) (-15), (byte)0, (byte)53, (byte)90, (byte)0}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length -15", string1);
      assertNotNull(string1);
      assertEquals(5, byteArray0.length);
      assertEquals((-15), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte) (-15), (byte)0, (byte)53, (byte)90, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-35);
      byteArray0[1] = (byte)39;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-90);
      byteArray0[4] = (byte) (-16);
      byteArray0[5] = (byte)97;
      byteArray0[6] = (byte)1;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (-2112), (byte)39);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(7, byteArray0.length);
      assertEquals((-2112), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(39, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte) (-35), (byte)39, (byte)0, (byte) (-90), (byte) (-16), (byte)97, (byte)1}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -2112 with length 39", string0);
      assertNotNull(string0);
      assertEquals(7, byteArray0.length);
      assertEquals((-2112), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(39, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte) (-35), (byte)39, (byte)0, (byte) (-90), (byte) (-16), (byte)97, (byte)1}, byteArray0);
      
      int int0 = lZ77Compressor_LiteralBlock0.getOffset();
      assertEquals((-2112), int0);
      assertEquals(7, byteArray0.length);
      assertEquals((-2112), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(39, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte) (-35), (byte)39, (byte)0, (byte) (-90), (byte) (-16), (byte)97, (byte)1}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -2112 with length 39", string1);
      assertNotNull(string1);
      assertEquals(7, byteArray0.length);
      assertEquals((-2112), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(39, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte) (-35), (byte)39, (byte)0, (byte) (-90), (byte) (-16), (byte)97, (byte)1}, byteArray0);
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, (byte)97);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(97, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(97, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType1);
      assertSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(97, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray1 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray1);
      assertNotSame(lZ77Compressor_Block_BlockTypeArray1, lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray1.length);
      assertFalse(lZ77Compressor_Block_BlockTypeArray1.equals((Object)lZ77Compressor_Block_BlockTypeArray0));
      
      int int1 = lZ77Compressor_LiteralBlock0.getOffset();
      assertEquals((-2112), int1);
      assertEquals(7, byteArray0.length);
      assertEquals((-2112), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(39, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(int1 == int0);
      assertArrayEquals(new byte[] {(byte) (-35), (byte)39, (byte)0, (byte) (-90), (byte) (-16), (byte)97, (byte)1}, byteArray0);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -2112 with length 39", string2);
      assertNotNull(string2);
      assertEquals(7, byteArray0.length);
      assertEquals((-2112), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(39, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte) (-35), (byte)39, (byte)0, (byte) (-90), (byte) (-16), (byte)97, (byte)1}, byteArray0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType2);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertEquals(7, byteArray0.length);
      assertEquals((-2112), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(39, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      assertArrayEquals(new byte[] {(byte) (-35), (byte)39, (byte)0, (byte) (-90), (byte) (-16), (byte)97, (byte)1}, byteArray0);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertNotNull(byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(7, byteArray0.length);
      assertEquals(7, byteArray1.length);
      assertEquals((-2112), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(39, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte) (-35), (byte)39, (byte)0, (byte) (-90), (byte) (-16), (byte)97, (byte)1}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-35), (byte)39, (byte)0, (byte) (-90), (byte) (-16), (byte)97, (byte)1}, byteArray1);
      
      int int2 = lZ77Compressor_BackReference0.getLength();
      assertEquals(97, int2);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(97, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType3 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType3);
      assertSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType0);
      assertSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType1);
      assertNotSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType2);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(97, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertFalse(lZ77Compressor_Block_BlockType3.equals((Object)lZ77Compressor_Block_BlockType2));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-112);
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-128);
      byteArray0[3] = (byte)35;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (byte)0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(5, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte) (-112), (byte)0, (byte) (-128), (byte)35, (byte)0}, byteArray0);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)0, 1820, (int)(byte)0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string0);
      assertNotNull(string0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string1);
      assertNotNull(string1);
      assertEquals(0, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertNotNull(byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 1835).when(parameters0).getWindowSize();
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string2);
      assertNotNull(string2);
      assertSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.compress(byteArray0, (-503), 0);
      assertSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 0 with length 0", string3);
      assertNotNull(string3);
      assertSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string2));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      lZ77Compressor0.prefill(byteArray0);
      assertSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)92;
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-108);
      byteArray0[3] = (byte) (-67);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-119);
      byte byte1 = (byte)0;
      byteArray0[6] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-67), (byte) (-108));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(7, byteArray0.length);
      assertEquals((-108), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-67), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte)92, (byte)0, (byte) (-108), (byte) (-67), (byte)0, (byte) (-119), (byte)0}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -67 with length -108", string0);
      assertNotNull(string0);
      assertEquals(7, byteArray0.length);
      assertEquals((-108), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-67), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertArrayEquals(new byte[] {(byte)92, (byte)0, (byte) (-108), (byte) (-67), (byte)0, (byte) (-119), (byte)0}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -67 with length -108", string1);
      assertNotNull(string1);
      assertEquals(7, byteArray0.length);
      assertEquals((-108), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-67), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte)92, (byte)0, (byte) (-108), (byte) (-67), (byte)0, (byte) (-119), (byte)0}, byteArray0);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte) (-67), (byte)92);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals((-67), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(92, lZ77Compressor_BackReference0.getLength());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals((-67), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(92, lZ77Compressor_BackReference0.getLength());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn((int)(byte) (-67), 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(725, 406).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -67 with length -108", string2);
      assertNotNull(string2);
      assertEquals(7, byteArray0.length);
      assertEquals((-108), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-67), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte)92, (byte)0, (byte) (-108), (byte) (-67), (byte)0, (byte) (-119), (byte)0}, byteArray0);
      
      lZ77Compressor0.finish();
      lZ77Compressor0.compress(byteArray0);
      assertEquals(7, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)92, (byte)0, (byte) (-108), (byte) (-67), (byte)0, (byte) (-119), (byte)0}, byteArray0);
      
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
  public void test37()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.EOD lZ77Compressor_EOD1 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD1.getType());
      assertFalse(lZ77Compressor_EOD1.equals((Object)lZ77Compressor_EOD0));
      
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-78);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-29);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 390, (byte)0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(6, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(390, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-78), (byte)0, (byte) (-29), (byte)0, (byte)0}, byteArray0);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertNotNull(byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(6, byteArray1.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(390, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-78), (byte)0, (byte) (-29), (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-78), (byte)0, (byte) (-29), (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 3064, 3064);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 3064 with length 3064", string0);
      assertNotNull(string0);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 3064 with length 3064", string1);
      assertNotNull(string1);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 3064 with length 3064", string2);
      assertNotNull(string2);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 3064 with length 3064", string3);
      assertNotNull(string3);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string4 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 3064 with length 3064", string4);
      assertNotNull(string4);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string3));
      assertTrue(string4.equals((Object)string2));
      assertTrue(string4.equals((Object)string0));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string5 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 3064 with length 3064", string5);
      assertNotNull(string5);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertTrue(string5.equals((Object)string3));
      assertTrue(string5.equals((Object)string1));
      assertTrue(string5.equals((Object)string2));
      assertTrue(string5.equals((Object)string4));
      assertTrue(string5.equals((Object)string0));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      lZ77Compressor0.compress(byteArray0);
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType1);
      assertSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      int int0 = lZ77Compressor_LiteralBlock0.getOffset();
      assertEquals(3064, int0);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      byte[] byteArray1 = new byte[0];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      lZ77Compressor0.prefill(byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(0, byteArray1.length);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {}, byteArray1);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(600, 3);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(600, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getLength());
      
      String string6 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 600 and length 3", string6);
      assertNotNull(string6);
      assertEquals(600, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getLength());
      assertFalse(string6.equals((Object)string4));
      assertFalse(string6.equals((Object)string2));
      assertFalse(string6.equals((Object)string0));
      assertFalse(string6.equals((Object)string1));
      assertFalse(string6.equals((Object)string3));
      assertFalse(string6.equals((Object)string5));
      
      String string7 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 600 and length 3", string7);
      assertNotNull(string7);
      assertEquals(600, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getLength());
      assertFalse(string7.equals((Object)string3));
      assertFalse(string7.equals((Object)string1));
      assertFalse(string7.equals((Object)string5));
      assertFalse(string7.equals((Object)string4));
      assertFalse(string7.equals((Object)string0));
      assertTrue(string7.equals((Object)string6));
      assertFalse(string7.equals((Object)string2));
      
      String string8 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 600 and length 3", string8);
      assertNotNull(string8);
      assertEquals(600, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getLength());
      assertFalse(string8.equals((Object)string2));
      assertFalse(string8.equals((Object)string3));
      assertFalse(string8.equals((Object)string1));
      assertFalse(string8.equals((Object)string4));
      assertFalse(string8.equals((Object)string5));
      assertTrue(string8.equals((Object)string7));
      assertTrue(string8.equals((Object)string6));
      assertFalse(string8.equals((Object)string0));
      
      String string9 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 600 and length 3", string9);
      assertNotNull(string9);
      assertEquals(600, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getLength());
      assertFalse(string9.equals((Object)string3));
      assertFalse(string9.equals((Object)string1));
      assertTrue(string9.equals((Object)string7));
      assertFalse(string9.equals((Object)string5));
      assertTrue(string9.equals((Object)string8));
      assertFalse(string9.equals((Object)string4));
      assertFalse(string9.equals((Object)string2));
      assertFalse(string9.equals((Object)string0));
      assertTrue(string9.equals((Object)string6));
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      
      lZ77Compressor0.finish();
      lZ77Compressor0.prefill(byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      lZ77Compressor0.finish();
      lZ77Compressor0.prefill(byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(0, byteArray1.length);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {}, byteArray1);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType2);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      
      String string10 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 600 and length 3", string10);
      assertNotNull(string10);
      assertEquals(600, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getLength());
      assertFalse(string10.equals((Object)string5));
      assertTrue(string10.equals((Object)string7));
      assertFalse(string10.equals((Object)string2));
      assertFalse(string10.equals((Object)string1));
      assertFalse(string10.equals((Object)string3));
      assertTrue(string10.equals((Object)string9));
      assertTrue(string10.equals((Object)string6));
      assertFalse(string10.equals((Object)string0));
      assertFalse(string10.equals((Object)string4));
      assertTrue(string10.equals((Object)string8));
      
      lZ77Compressor0.finish();
      lZ77Compressor0.compress(byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      int int1 = lZ77Compressor_LiteralBlock0.getOffset();
      assertEquals(3064, int1);
      assertNotSame(byteArray0, byteArray1);
      assertEquals(0, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3064, lZ77Compressor_LiteralBlock0.getOffset());
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertTrue(int1 == int0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      lZ77Compressor0.compress(byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(0, byteArray1.length);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {}, byteArray1);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType3 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType3);
      assertNotSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType2);
      assertNotSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType1);
      assertNotSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType0);
      assertEquals(600, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(3, lZ77Compressor_BackReference0.getLength());
      assertFalse(lZ77Compressor_Block_BlockType3.equals((Object)lZ77Compressor_Block_BlockType2));
      assertFalse(lZ77Compressor_Block_BlockType3.equals((Object)lZ77Compressor_Block_BlockType1));
      assertFalse(lZ77Compressor_Block_BlockType3.equals((Object)lZ77Compressor_Block_BlockType0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)11;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-59);
      byteArray0[5] = (byte) (-96);
      byteArray0[6] = (byte)109;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 16, 250);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(7, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(16, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(250, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)11, (byte)8, (byte)3, (byte)0, (byte) (-59), (byte) (-96), (byte)109}, byteArray0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 16 with length 250", string0);
      assertNotNull(string0);
      assertEquals(7, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(16, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(250, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)11, (byte)8, (byte)3, (byte)0, (byte) (-59), (byte) (-96), (byte)109}, byteArray0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 16 with length 250", string1);
      assertNotNull(string1);
      assertEquals(7, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(16, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(250, lZ77Compressor_LiteralBlock0.getLength());
      assertTrue(string1.equals((Object)string0));
      assertArrayEquals(new byte[] {(byte)11, (byte)8, (byte)3, (byte)0, (byte) (-59), (byte) (-96), (byte)109}, byteArray0);
      
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertEquals(250, int0);
      assertEquals(7, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(16, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(250, lZ77Compressor_LiteralBlock0.getLength());
      assertArrayEquals(new byte[] {(byte)11, (byte)8, (byte)3, (byte)0, (byte) (-59), (byte) (-96), (byte)109}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 1461);
      LZ77Compressor.BackReference lZ77Compressor_BackReference1 = new LZ77Compressor.BackReference(1461, 1461);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn((-779), (-5041), 2034, 1461, 734).when(parameters0).getMaxBackReferenceLength();
      doReturn(9996, 9996, 9996, 9996, 2034).when(parameters0).getMaxCandidates();
      doReturn(16, 9975, 16, 8226, 5).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 3, 1).when(parameters0).getMinBackReferenceLength();
      doReturn(1479, 785, (-1741), 9969, 9975).when(parameters0).getNiceBackReferenceLength();
      doReturn(734, 1461, 9975).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)42;
      byteArray0[2] = (byte)0;
      lZ77Compressor0.prefill(byteArray0);
      byteArray0[3] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)47;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)46;
      byte byte0 = (byte) (-124);
      byteArray0[5] = (byte) (-124);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 2);
      lZ77Compressor_LiteralBlock0.getType();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.prefill(byteArray0);
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)46;
      byte byte1 = (byte) (-67);
      lZ77Compressor_LiteralBlock0.toString();
      byteArray1[1] = (byte) (-67);
      byteArray1[2] = (byte) (-1);
      byteArray1[3] = (byte) (-124);
      lZ77Compressor0.prefill(byteArray1);
      byteArray1[4] = (byte) (-124);
      byteArray1[5] = (byte)46;
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }
}
