
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
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.BandSet;
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.pack200.CPMethodOrField;
import org.apache.commons.compress.harmony.pack200.CPNameAndType;
import org.apache.commons.compress.harmony.pack200.CPSignature;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.ConstantPoolEntry;
import org.apache.commons.compress.harmony.pack200.CpBands;
import org.apache.commons.compress.harmony.pack200.IcBands;
import org.apache.commons.compress.harmony.pack200.MetadataBandGroup;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BandSet_ESTest extends BandSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" bytes from class_interface[", 65, (CpBands) null, segmentHeader0, 0);
      long[] longArray0 = new long[4];
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      BHSDCodec bHSDCodec1 = Codec.SIGNED5;
      // Undeclared exception!
      try { 
        metadataBandGroup0.encodeFlags(" bytes from bcLongRef[", longArray0, bHSDCodec0, bHSDCodec1, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[1][2];
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      BHSDCodec bHSDCodec1 = Codec.CHAR3;
      byte[] byteArray0 = segmentHeader0.encodeFlags("KlRp35`>VB.", longArray0, bHSDCodec0, bHSDCodec1, false);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<ConstantPoolEntry> linkedList0 = new LinkedList<ConstantPoolEntry>();
      CPUTF8 cPUTF8_0 = new CPUTF8("XjGn.x,j|n");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      cPNameAndType0.setIndex(16384);
      linkedList0.add((ConstantPoolEntry) cPNameAndType0);
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      assertArrayEquals(new int[] {16384}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      intArray0[1] = (-32);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
      assertTrue(bandSet_BandData0.anyNegatives());
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[3];
      intArray0[0] = 5872;
      intArray0[1] = 484;
      intArray0[2] = 47;
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.wellCorrelated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("z$oj2|)L%T4");
      segmentHeader0.pack(mockFileOutputStream0);
      assertEquals(0, segmentHeader0.getArchive_modtime());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long(0L);
      linkedList0.add(long0);
      long[] longArray0 = segmentHeader0.longListToArray(linkedList0);
      assertArrayEquals(new long[] {0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1824));
      linkedList0.add(integer0);
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(128, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte) (-128)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[9];
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = segmentHeader0.encodeFlags(";qhNQ<T8Ib\"W_Q", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[0];
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.pack((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.SegmentHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 0, (CpBands) null, segmentHeader0, 0);
      // Undeclared exception!
      try { 
        metadataBandGroup0.longListToArray((List<Long>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[9];
      intArray0[6] = (-1075);
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      try { 
        segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -1075
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeScalar((int[]) null, bHSDCodec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        segmentHeader0.encodeScalar(3248, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value 3248
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.encodeScalar(248, (BHSDCodec) null);
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
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      long[][] longArray0 = new long[7][4];
      long[] longArray1 = new long[9];
      longArray1[0] = (long) (-3076);
      longArray0[0] = longArray1;
      try { 
        segmentHeader0.encodeFlags("V", longArray0, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (5,4) does not encode the value -1
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[9];
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      longArray0[0] = (long) 769;
      try { 
        segmentHeader0.encodeFlags(" bytes from file_name[", longArray0, bHSDCodec0, bHSDCodec0, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value 769
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[8];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags((String) null, longArray0, (BHSDCodec) null, (BHSDCodec) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[9];
      intArray0[2] = (-3093);
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      try { 
        segmentHeader0.encodeBandInt((String) null, intArray0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -3093
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeBandInt("*yH", intArray0, (BHSDCodec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<ConstantPoolEntry> linkedList0 = new LinkedList<ConstantPoolEntry>();
      CPUTF8 cPUTF8_0 = new CPUTF8(",<f;Q8");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPSignature cPSignature0 = new CPSignature(",<f;Q8", cPUTF8_0, (List<CPClass>) null);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPMethodOrField0.setIndex(224);
      linkedList0.add((ConstantPoolEntry) cPMethodOrField0);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("Ssr5^%,'3D?z$", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte) (-31)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[4];
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("RV_Ntu!XV!])#", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("", intArray0, bHSDCodec0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 1155);
      int[] intArray0 = new int[6];
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      // Undeclared exception!
      try { 
        icBands0.encodeBandInt("org.apache.commons.compress.harmony.pack200.BandSet$BandData", intArray0, bHSDCodec0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1155
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[3];
      intArray0[0] = Integer.MAX_VALUE;
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt(":9&$qQ>:sL|2eMWL", intArray0, bHSDCodec0);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[9][1];
      long[] longArray1 = new long[6];
      longArray1[0] = (long) (-52);
      longArray0[0] = longArray1;
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("POPULATION", longArray0, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[7];
      intArray0[0] = (-341);
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("org.apache.commons.compress.harmony.pack200.BandSet$BandAnalysisResults", intArray0, bHSDCodec0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[0][0];
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      byte[] byteArray0 = segmentHeader0.encodeFlags("]npN+{,yI", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.setIndex(0);
      linkedList0.add(cPClass0);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<ConstantPoolEntry> linkedList0 = new LinkedList<ConstantPoolEntry>();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      linkedList0.add((ConstantPoolEntry) cPMethodOrField0);
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
  public void test35()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<ConstantPoolEntry> linkedList0 = new LinkedList<ConstantPoolEntry>();
      linkedList0.add((ConstantPoolEntry) null);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.setIndex(0);
      linkedList0.add(cPClass0);
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      intArray0[0] = (-2599);
      intArray0[1] = (-2599);
      intArray0[2] = (-2599);
      intArray0[3] = (-2599);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertFalse(bandSet_BandData0.mainlySmallDeltas());
      assertTrue(bandSet_BandData0.anyNegatives());
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[1];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertFalse(bandSet_BandData0.anyNegatives());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[1];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      bandSet_BandData0.numDistinctValues();
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[4];
      intArray0[0] = 2343;
      intArray0[1] = 2595;
      intArray0[2] = 2343;
      intArray0[3] = 2343;
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlySmallDeltas();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertTrue(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[1];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlySmallDeltas();
      assertFalse(bandSet_BandData0.anyNegatives());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlyPositiveDeltas();
      assertFalse(boolean0);
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      intArray0[3] = (-2009);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.wellCorrelated());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[9];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(boolean0);
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IcBands icBands0 = new IcBands((SegmentHeader) null, (CpBands) null, 35);
      int[] intArray0 = new int[4];
      BandSet.BandData bandSet_BandData0 = icBands0.new BandData(intArray0);
      assertFalse(bandSet_BandData0.anyNegatives());
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
      assertEquals(1, bandSet_BandData0.numDistinctValues());
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BandSet.BandAnalysisResults bandSet_BandAnalysisResults0 = segmentHeader0.new BandAnalysisResults();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags(" bytes from code_LocalVariableTypeTable_slot[", (long[][]) null, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      long[] longArray0 = segmentHeader0.longListToArray(linkedList0);
      assertEquals(0, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[9];
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }
}
