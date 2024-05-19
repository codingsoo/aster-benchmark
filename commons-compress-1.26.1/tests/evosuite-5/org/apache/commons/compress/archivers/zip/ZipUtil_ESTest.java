
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
import java.io.File;
import java.math.BigInteger;
import java.util.Date;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipUtil_ESTest extends ZipUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte(128);
      assertEquals((byte) (-128), byte0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte)15);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = ZipUtil.copy(byteArray0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray1, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry0.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig(0L);
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(4036608000000L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("]:$6zV\"l");
      byte[] byteArray0 = new byte[4];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("]:$6zV\"l", byteArray0);
      zipArchiveEntry0.addAsFirstExtraField(unicodePathExtraField0);
      byteArray0[3] = (byte)112;
      byteArray0[2] = (byte)97;
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry0.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)121;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(8718968878589280256L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipUtil.toDosTime((-176L), byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)33, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte(6);
      assertEquals((byte)6, byte0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2169, 2169, 98, 2169, (-682), 2169);
      ZipLong zipLong0 = ZipUtil.toDosTime((Date) mockDate0);
      assertEquals(3162878404L, zipLong0.getValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ZipUtil.reverse(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig((-2147483648L));
      assertEquals((byte)0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      long long0 = ZipUtil.dosToJavaTime(2592L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      System.setCurrentTimeMillis((-1441L));
      long long0 = ZipUtil.dosToJavaTime((-1441L));
      assertEquals((-1441L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ZipUtil.copy(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-19);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals((-20890720927744L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.toDosTime((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ZipUtil.toDosTime((-170L), byteArray0, 51);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        ZipUtil.setNameAndCommentFromExtraFields((ZipArchiveEntry) null, byteArray0, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.reverse((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.fromDosTime((ZipLong) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.toDosTime(36L);
      // Undeclared exception!
      try { 
        ZipUtil.copy(byteArray0, (byte[]) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.checkRequestedFeatures((ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.canHandleEntryData((ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.bigToLong((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong((-4385));
      assertEquals(4294962911L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.toDosTime(0L, (byte[]) null, 31);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte(255);
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.unsignedIntToSignedByte((-384));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only convert non-negative integers between [0,255] to byte: [-384]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte(0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.unsignedIntToSignedByte(1980);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only convert non-negative integers between [0,255] to byte: [1980]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("0x5455 Zip Extra Field: Flags=");
      zipArchiveEntry0.setMethod((short)0);
      boolean boolean0 = ZipUtil.canHandleEntryData(zipArchiveEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte) (-1));
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("WAVPACK");
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, (byte[]) null);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig(219);
      assertEquals((byte) (-37), bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.longToBig((-116444736000000000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative longs < -2^31 not permitted: [-116444736000000000]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(1095216660480L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Invalid entry size", "Invalid entry size");
      File file0 = MockFile.createTempFile("Invalid entry size", "Invalid entry size", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "0 :<V't{#)\toS)*");
      assertEquals(3, ZipArchiveEntry.PLATFORM_UNIX);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Invalid entry size", "Invalid entry size");
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "0 :<V't{#)\toS)*");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(4036608000006L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("7LI}`nQ");
      byte[] byteArray0 = new byte[4];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("7LI}`nQ", byteArray0);
      zipArchiveEntry0.addAsFirstExtraField(unicodePathExtraField0);
      byteArray0[3] = (byte)39;
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray0);
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry0.getCommentSource());
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("7LI}`nQ");
      byte[] byteArray0 = new byte[4];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("7LI}`nQ", byteArray0);
      zipArchiveEntry0.addAsFirstExtraField(unicodePathExtraField0);
      // Undeclared exception!
      try { 
        ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("#N%3p$Z$9+ZBi");
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.toDosTime(36L);
      // Undeclared exception!
      try { 
        ZipUtil.copy(byteArray0, byteArray0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ZipUtil.copy((byte[]) null, (byte[]) null, 0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.copy((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("#N%3p$Z$9+ZBi");
      zipArchiveEntry0.setMethod(1667);
      try { 
        ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
        fail("Expecting exception: UnsupportedZipFeatureException");
      
      } catch(UnsupportedZipFeatureException e) {
         //
         // Unsupported feature compression method used in entry #N%3p$Z$9+ZBi
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("0x5455 Zip Extra Field: Flags=");
      zipArchiveEntry0.setMethod((short)1);
      ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
      assertEquals(0, zipArchiveEntry0.getRawFlag());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte) (-99);
      ZipUtil.reverse(byteArray0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      GeneralPurposeBit generalPurposeBit0 = GeneralPurposeBit.parse(byteArray0, (byte)0);
      zipArchiveEntry0.setGeneralPurposeBit(generalPurposeBit0);
      try { 
        ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
        fail("Expecting exception: UnsupportedZipFeatureException");
      
      } catch(UnsupportedZipFeatureException e) {
         //
         // Unsupported feature encryption used in entry 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("0x5455 Zip Extra Field: Flags=");
      try { 
        ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
        fail("Expecting exception: UnsupportedZipFeatureException");
      
      } catch(UnsupportedZipFeatureException e) {
         //
         // Unsupported compression method -1 (UNKNOWN) used in entry 0x5455 Zip Extra Field: Flags=
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("0x5455 Zip Extra Field: Flags=");
      boolean boolean0 = ZipUtil.canHandleEntryData(zipArchiveEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      byteArray0[1] = (byte) (-6);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      // Undeclared exception!
      try { 
        ZipUtil.bigToLong(bigInteger0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The BigInteger cannot fit inside a 64 bit java long: [365375409332725729550921208179070754913983135744000]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig((-1436L));
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(4294965860L, long0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong(255);
      assertEquals(255L, long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      long long0 = ZipUtil.dosToJavaTime((byte)3);
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ZipLong zipLong0 = ZipUtil.toDosTime((Date) mockDate0);
      ZipUtil.fromDosTime(zipLong0);
      assertEquals(1146004138L, zipLong0.getValue());
      assertEquals(1146004138, zipLong0.getIntValue());
  }
}
