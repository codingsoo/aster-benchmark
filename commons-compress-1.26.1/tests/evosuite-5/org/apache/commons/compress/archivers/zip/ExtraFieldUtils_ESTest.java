
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
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.AsiExtraField;
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.zip.ExtraFieldUtils;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile;
import org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.X7875_NewUnix;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExtraFieldUtils_ESTest extends ExtraFieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, 2480, 2777, false, (-2770));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.onUnparseableExtraField(byteArray0, (byte)2, 0, true, 0);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      int int0 = extraFieldUtils_UnparseableExtraField0.getKey();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      byte[] byteArray0 = new byte[2];
      ZipExtraField zipExtraField0 = extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (byte)0, 4, true, 788);
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      byte[] byteArray0 = new byte[6];
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (byte)43, (byte)4, true, (-2457));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 43.  Block length of -2457 bytes exceeds remaining data of 0 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      byte[] byteArray0 = new byte[8];
      try { 
        ExtraFieldUtils.fillExtraField(asiExtraField0, byteArray0, 2539, (byte)110, false);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Failed to parse corrupt ZIP extra field of type 756e
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[1];
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zipExtraFieldArray0[0] = (ZipExtraField) zip64ExtendedInformationExtraField0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      ZipExtraField[] zipExtraFieldArray1 = ExtraFieldUtils.parse(byteArray0, true, extraFieldUtils_UnparseableExtraField0);
      assertArrayEquals(new byte[] {(byte)1, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, zipExtraFieldArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false);
      assertEquals(1, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.fillExtraField(x000A_NTFS0, byteArray0, 2, (byte)2, false);
      assertSame(x000A_NTFS0, zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.register((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.register(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)16;
      try { 
        ExtraFieldUtils.parse(byteArray0, false, extraFieldUtils_UnparseableExtraField0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 4096 bytes exceeds remaining data of 3 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("\"[6;B/OK&P~*Ojy", byteArray0, 0, 0);
      byte[] byteArray1 = unicodePathExtraField0.getCentralDirectoryData();
      try { 
        ExtraFieldUtils.parse(byteArray1, false);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 4.  Block length of 13915 bytes exceeds remaining data of 12 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-92);
      try { 
        ExtraFieldUtils.parse(byteArray0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 164 bytes exceeds remaining data of 0 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[4];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[5];
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = x000A_NTFS0.getModifyTime();
      ZipLong zipLong0 = ZipLong.AED_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      zipExtraFieldArray0[0] = (ZipExtraField) zip64ExtendedInformationExtraField0;
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(1, true);
      zipExtraFieldArray0[1] = (ZipExtraField) resourceAlignmentExtraField0;
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      zipExtraFieldArray0[2] = (ZipExtraField) unrecognizedExtraField0;
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      zipExtraFieldArray0[3] = (ZipExtraField) x0019_EncryptionRecipientCertificateList0;
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      zipExtraFieldArray0[4] = (ZipExtraField) x0015_CertificateIdForFile0;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zip64 extended information must contain both size values in the local file header.
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[5];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField((ZipExtraField) null, byteArray0, 85, 3303, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipShort zipShort0 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(zipExtraField0, byteArray0, (byte) (-67), (byte) (-122), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(unparseableExtraFieldData0, byteArray0, 0, (-1164), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > -1164
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.createExtraFieldNoDefault((ZipShort) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.createExtraField((ZipShort) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-79);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipShort zipShort0 = unparseableExtraFieldData0.getCentralDirectoryLength();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getCentralDirectoryLength();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraField(zipShort0);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[5];
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(2058, false);
      zipExtraFieldArray0[0] = (ZipExtraField) resourceAlignmentExtraField0;
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      zipExtraFieldArray0[1] = (ZipExtraField) unicodePathExtraField0;
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      zipExtraFieldArray0[2] = (ZipExtraField) x7875_NewUnix0;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zipExtraFieldArray0[3] = (ZipExtraField) zip64ExtendedInformationExtraField0;
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[4] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(25, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-61);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(6, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-61), (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[5];
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(2058, false);
      zipExtraFieldArray0[0] = (ZipExtraField) resourceAlignmentExtraField0;
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      zipExtraFieldArray0[1] = (ZipExtraField) unicodePathExtraField0;
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      zipExtraFieldArray0[2] = (ZipExtraField) x7875_NewUnix0;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zipExtraFieldArray0[3] = (ZipExtraField) zip64ExtendedInformationExtraField0;
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[4] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray0 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(18, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.EMPTY_ZIP_EXTRA_FIELD_ARRAY;
      byte[] byteArray0 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-61);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-61), (byte)0, (byte)0, (byte)0}, byteArray1);
      assertEquals(6, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.onUnparseableExtraField(byteArray0, (byte)0, (byte)113, true, (byte)0);
      ZipShort zipShort0 = zipExtraField0.getHeaderId();
      ZipExtraField zipExtraField1 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(zipShort0);
      assertNotSame(zipExtraField0, zipExtraField1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)56;
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
      try { 
        ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 56 bytes exceeds remaining data of 3 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-96);
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, extraFieldUtils_UnparseableExtraField0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      int int0 = extraFieldUtils_UnparseableExtraField0.getKey();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0);
      assertEquals(2, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ExtraFieldUtils extraFieldUtils0 = new ExtraFieldUtils();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<UnparseableExtraFieldData> class0 = UnparseableExtraFieldData.class;
      ExtraFieldUtils.register(class0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null, true, (ExtraFieldUtils.UnparseableExtraField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }
}
