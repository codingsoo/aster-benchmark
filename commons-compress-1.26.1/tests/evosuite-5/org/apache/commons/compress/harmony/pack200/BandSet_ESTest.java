
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.BandSet;
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.pack200.CPLong;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.ConstantPoolEntry;
import org.apache.commons.compress.harmony.pack200.CpBands;
import org.apache.commons.compress.harmony.pack200.IcBands;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BandSet_ESTest extends BandSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[5][2];
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      BHSDCodec bHSDCodec1 = Codec.UDELTA5;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("Wrote ", longArray0, bHSDCodec0, bHSDCodec1, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[8];
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      BHSDCodec bHSDCodec1 = Codec.MDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("", longArray0, bHSDCodec0, bHSDCodec1, false);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 0);
      LinkedList<CPLong> linkedList0 = new LinkedList<CPLong>();
      CPLong cPLong0 = new CPLong(131072L);
      cPLong0.setIndex(0);
      linkedList0.offerLast(cPLong0);
      int[] intArray0 = icBands0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.setIndex(0);
      linkedList0.add(cPClass0);
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[4];
      intArray0[0] = 892;
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[4];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(boolean0);
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long(3429L);
      linkedList0.offerLast(long0);
      long[] longArray0 = segmentHeader0.longListToArray(linkedList0);
      assertEquals(1, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(1184);
      linkedList0.add(integer0);
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[9];
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPLong> linkedList0 = new LinkedList<CPLong>();
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[0];
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("|", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        segmentHeader0.pack(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.longListToArray((List<Long>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.integerListToArray((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[6];
      intArray0[1] = (-1478);
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      try { 
        segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -1478
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        segmentHeader0.encodeScalar((-1548), bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -1548
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.encodeScalar((-1188), (BHSDCodec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[5][6];
      long[] longArray1 = new long[4];
      longArray1[0] = (long) (-802);
      longArray0[0] = longArray1;
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      try { 
        segmentHeader0.encodeFlags("E@#0<l-(NgYF'@1(", longArray0, bHSDCodec0, bHSDCodec0, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (5,4) does not encode the value -802
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("DS0}HB}pA@*0A|W{<5=", (long[][]) null, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[8];
      longArray0[6] = (-1564L);
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      try { 
        segmentHeader0.encodeFlags("", longArray0, bHSDCodec0, bHSDCodec0, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -1564
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 0);
      long[] longArray0 = new long[7];
      // Undeclared exception!
      try { 
        icBands0.encodeFlags((String) null, longArray0, (BHSDCodec) null, (BHSDCodec) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, Integer.MIN_VALUE);
      int[] intArray0 = new int[4];
      intArray0[0] = Integer.MIN_VALUE;
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      try { 
        icBands0.encodeBandInt("", intArray0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -2147483648
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeBandInt((String) null, intArray0, (BHSDCodec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.cpEntryOrNullListToArray((List<? extends ConstantPoolEntry>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.cpEntryListToArray((List<? extends ConstantPoolEntry>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[1];
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("Y^w%X;#'1fo2R~)Ics", intArray0, bHSDCodec0);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("org.apache.commons.compress.harmony.pack200.BandSet", intArray0, bHSDCodec0);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPLong> linkedList0 = new LinkedList<CPLong>();
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[4];
      intArray0[0] = 255;
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt(")^GHE[Ia", intArray0, bHSDCodec0);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[3];
      intArray0[0] = 5479;
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt(";~w}Qh", intArray0, bHSDCodec0);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[6];
      longArray0[0] = (-460L);
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("org.apache.commons.compress.harmony.pack200.CpBands", longArray0, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      int[] intArray0 = new int[1];
      intArray0[0] = (-301);
      byte[] byteArray0 = segmentHeader0.encodeBandInt((String) null, intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte) (-39), (byte)6}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[1];
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = segmentHeader0.encodeFlags(" pair_N", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[0][5];
      byte[] byteArray0 = segmentHeader0.encodeFlags((String) null, longArray0, (BHSDCodec) null, (BHSDCodec) null, false);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 1189);
      int[] intArray0 = new int[7];
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      // Undeclared exception!
      try { 
        icBands0.encodeBandInt("org.apache.commons.compress.harmony.pack200.BandSet", intArray0, bHSDCodec0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1189
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.setIndex(1);
      linkedList0.add(cPClass0);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {2}, intArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      linkedList0.add((CPClass) null);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      linkedList0.add(cPClass0);
      // Undeclared exception!
      try { 
        segmentHeader0.cpEntryOrNullListToArray(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index should be > 0
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.setIndex(1);
      linkedList0.add(cPClass0);
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      assertArrayEquals(new int[] {1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      linkedList0.add(cPClass0);
      // Undeclared exception!
      try { 
        segmentHeader0.cpEntryListToArray(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index should be > 0
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[1];
      intArray0[0] = (-301);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertTrue(bandSet_BandData0.anyNegatives());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPLong> linkedList0 = new LinkedList<CPLong>();
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertFalse(bandSet_BandData0.anyNegatives());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      bandSet_BandData0.numDistinctValues();
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlySmallDeltas();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertTrue(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[4];
      intArray0[2] = (-1112);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlySmallDeltas();
      assertFalse(bandSet_BandData0.wellCorrelated());
      assertFalse(boolean0);
      assertTrue(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[19];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlyPositiveDeltas();
      assertFalse(bandSet_BandData0.anyNegatives());
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[7];
      intArray0[1] = (-256);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertTrue(boolean0);
      assertFalse(bandSet_BandData0.mainlySmallDeltas());
      assertFalse(bandSet_BandData0.wellCorrelated());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 1189);
      int[] intArray0 = new int[7];
      BandSet.BandData bandSet_BandData0 = icBands0.new BandData(intArray0);
      int int0 = bandSet_BandData0.numDistinctValues();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(bandSet_BandData0.anyNegatives());
      assertEquals(1, int0);
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BandSet.BandAnalysisResults bandSet_BandAnalysisResults0 = segmentHeader0.new BandAnalysisResults();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[3][2];
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MockPrintStream mockPrintStream0 = new MockPrintStream("Index should be > 0");
      segmentHeader0.pack(mockPrintStream0);
      assertTrue(segmentHeader0.have_all_code_flags());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      long[] longArray0 = segmentHeader0.longListToArray(linkedList0);
      assertArrayEquals(new long[] {}, longArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeScalar(intArray0, (BHSDCodec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }
}
