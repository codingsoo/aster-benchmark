
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
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.zip.ExtraFieldUtils;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.X0014_X509Certificates;
import org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader;
import org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList;
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
      byte[] byteArray0 = new byte[9];
      byteArray0[7] = (byte)9;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldUtils.UnparseableExtraField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (-269), 0, false, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, 2741, (-56), true, (byte)21);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2741 > 2685
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      byte[] byteArray0 = new byte[4];
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (byte) (-46), (byte)2, true, (byte) (-46));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at -46.  Block length of -46 bytes exceeds remaining data of -2 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      int int0 = extraFieldUtils_UnparseableExtraField0.getKey();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, extraFieldUtils_UnparseableExtraField0);
      assertEquals(1, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.register(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-82);
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      try { 
        ExtraFieldUtils.parse(byteArray0, false, extraFieldUtils_UnparseableExtraField0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 174 bytes exceeds remaining data of 3 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)4;
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
      try { 
        ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 4 bytes exceeds remaining data of 2 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)111;
      try { 
        ExtraFieldUtils.parse(byteArray0, true);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 28416 bytes exceeds remaining data of 3 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null, false);
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
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[0];
      unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray0, 0, 18409);
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[9];
      zipExtraFieldArray0[0] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[1] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[2] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[3] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[4] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[5] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[6] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[7] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[8] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      // Undeclared exception!
      ExtraFieldUtils.parse(byteArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[5];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-2012L));
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, zipEightByteInteger0, (ZipEightByteInteger) null, zipLong0);
      zipExtraFieldArray0[0] = (ZipExtraField) zip64ExtendedInformationExtraField0;
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      zipExtraFieldArray0[1] = (ZipExtraField) unicodeCommentExtraField0;
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      zipExtraFieldArray0[2] = (ZipExtraField) x0019_EncryptionRecipientCertificateList0;
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      zipExtraFieldArray0[3] = (ZipExtraField) x0017_StrongEncryptionHeader0;
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      zipExtraFieldArray0[4] = (ZipExtraField) resourceAlignmentExtraField0;
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
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField((ZipExtraField) null, byteArray0, (byte)0, (-1652), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(zip64ExtendedInformationExtraField0, byteArray0, (byte) (-76), (-3567), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipShort zipShort0 = X0019_EncryptionRecipientCertificateList.HEADER_ID;
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(zipExtraField0, byteArray0, 0, (byte) (-116), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > -116
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(2, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[9];
      ZipExtraField zipExtraField0 = ExtraFieldUtils.fillExtraField(x0014_X509Certificates0, byteArray0, 0, 40960, false);
      assertSame(zipExtraField0, x0014_X509Certificates0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JarMarker jarMarker0 = JarMarker.getInstance();
      ZipShort zipShort0 = jarMarker0.getLocalFileDataLength();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipShort zipShort0 = unparseableExtraFieldData0.getHeaderId();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraField(zipShort0);
      assertNotSame(unparseableExtraFieldData0, zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)4;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte) (-57);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-57), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertEquals(9, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[9];
      zipExtraFieldArray0[0] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[1] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[2] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[3] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[4] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[5] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[6] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[7] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[8] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      ZipExtraField[] zipExtraFieldArray1 = ExtraFieldUtils.parse(byteArray0);
      assertEquals(32, byteArray0.length);
      assertEquals(8, zipExtraFieldArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[9];
      zipExtraFieldArray0[8] = (ZipExtraField) unparseableExtraFieldData0;
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
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, extraFieldUtils_UnparseableExtraField0);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[9];
      zipExtraFieldArray0[0] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[1] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[2] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[3] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[4] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[5] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[6] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[7] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[8] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray0 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[1];
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      zipExtraFieldArray0[0] = (ZipExtraField) x7875_NewUnix0;
      byte[] byteArray0 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertArrayEquals(new byte[] {(byte)117, (byte)120, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[9];
      zipExtraFieldArray0[8] = (ZipExtraField) unparseableExtraFieldData0;
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
  public void test34()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[1];
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      zipExtraFieldArray0[0] = (ZipExtraField) x7875_NewUnix0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      try { 
        ExtraFieldUtils.fillExtraField(x7875_NewUnix0, byteArray0, (byte) (-125), 26114, true);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Failed to parse corrupt ZIP extra field of type 7875
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipShort zipShort0 = new ZipShort((byte) (-57));
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(zipShort0);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte) (-57);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(9, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-57), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      ZipExtraField zipExtraField0 = extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (-4722), (-4722), true, (-4722));
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[1];
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      zipExtraFieldArray0[0] = (ZipExtraField) x7875_NewUnix0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      ZipExtraField zipExtraField0 = extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, 0, 2, false, (byte) (-125));
      assertEquals(11, byteArray0.length);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-22);
      try { 
        ExtraFieldUtils.parse(byteArray0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 234 bytes exceeds remaining data of 5 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      int int0 = extraFieldUtils_UnparseableExtraField0.getKey();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[1];
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      zipExtraFieldArray0[0] = (ZipExtraField) x7875_NewUnix0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      ZipExtraField[] zipExtraFieldArray1 = ExtraFieldUtils.parse(byteArray0, false);
      assertEquals(11, byteArray0.length);
      assertEquals(1, zipExtraFieldArray1.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ExtraFieldUtils extraFieldUtils0 = new ExtraFieldUtils();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<UnparseableExtraFieldData> class0 = UnparseableExtraFieldData.class;
      ExtraFieldUtils.register(class0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, extraFieldUtils_UnparseableExtraField0);
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      ZipExtraField[] zipExtraFieldArray1 = ExtraFieldUtils.parse(byteArray1, true);
      assertEquals(0, byteArray1.length);
      assertSame(zipExtraFieldArray0, zipExtraFieldArray1);
  }
}
