
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Zip64ExtendedInformationExtraField_ESTest extends Zip64ExtendedInformationExtraField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray1 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray1, (byte)0, 20);
      zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(false, false, true, true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, (ZipEightByteInteger) null, zipLong0);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 16, 4);
      zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(false, false, false, false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 0);
      try { 
        zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(true, true, true, false);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length 24 but is 0
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, 4, 28);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 28
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, 1651, 16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1658
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.AED_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      ZipEightByteInteger zipEightByteInteger1 = zip64ExtendedInformationExtraField0.getSize();
      assertSame(zipEightByteInteger1, zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      ZipEightByteInteger zipEightByteInteger1 = zip64ExtendedInformationExtraField0.getRelativeHeaderOffset();
      assertNull(zipEightByteInteger1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(808471376L);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      ZipLong zipLong0 = new ZipLong(0);
      zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong0);
      ZipLong zipLong1 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
      assertSame(zipLong1, zipLong0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.AED_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      ZipLong zipLong1 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
      assertSame(zipLong1, zipLong0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipLong zipLong0 = new ZipLong((-1545));
      zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong0);
      ZipLong zipLong1 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
      assertEquals((-1545), zipLong1.getIntValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null, (ZipEightByteInteger) null, zipLong0);
      ZipEightByteInteger zipEightByteInteger0 = zip64ExtendedInformationExtraField0.getCompressedSize();
      assertNull(zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromLocalFileData((byte[]) null, 698, 698);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null, (ZipEightByteInteger) null, zipLong0);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData((byte[]) null, (-347), (byte)8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 0, (-951));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)0, 2872);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
      ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger((BigInteger) null);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.getLocalFileDataData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-182L));
      ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger((BigInteger) null);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
      assertEquals(28, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, (ZipEightByteInteger) null, zipLong0);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 16, 4);
      try { 
        zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(true, false, true, false);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length 16 but is 4
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.AED_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(true, true, true, false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray1 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray1, (byte)0, (byte)46);
      assertEquals(28, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      try { 
        zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, (byte)37, (-307));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Zip64 extended information must contain both size values in the local file header.
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
      zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, (-3275), 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray1 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray1, (byte)0, 20);
      zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(false, true, true, true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
      assertEquals(16, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 4, 16);
      zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(true, false, true, false);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, (ZipLong) null);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipEightByteInteger zipEightByteInteger0 = zip64ExtendedInformationExtraField0.getSize();
      assertNull(zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, (ZipLong) null);
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getHeaderId();
      assertEquals(1, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      ZipEightByteInteger zipEightByteInteger1 = zip64ExtendedInformationExtraField0.getCompressedSize();
      assertSame(zipEightByteInteger0, zipEightByteInteger1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, (ZipLong) null);
      ZipEightByteInteger zipEightByteInteger1 = zip64ExtendedInformationExtraField0.getRelativeHeaderOffset();
      assertSame(zipEightByteInteger0, zipEightByteInteger1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, (ZipLong) null);
      zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipLong zipLong0 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
      assertNull(zipLong0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(1L);
      zip64ExtendedInformationExtraField0.setSize(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.getLocalFileDataData();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zip64 extended information must contain both size values in the local file header.
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      zip64ExtendedInformationExtraField0.setCompressedSize(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.getLocalFileDataData();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zip64 extended information must contain both size values in the local file header.
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }
}
