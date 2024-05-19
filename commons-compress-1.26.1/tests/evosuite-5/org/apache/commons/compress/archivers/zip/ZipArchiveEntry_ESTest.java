
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
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.AsiExtraField;
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipArchiveEntry_ESTest extends ZipArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntry$1");
      assertEquals((-1), zipArchiveEntry0.getMethod());
      
      zipArchiveEntry0.setMethod(0);
      assertEquals(0, zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setAlignment((-1625));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for alignment, must be power of two and no bigger than 65535 but is -1625
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("1{A}i^:X/");
      byte[] byteArray0 = new byte[9];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      ZipLong zipLong0 = new ZipLong(12);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      zipArchiveEntry0.addExtraField(zip64ExtendedInformationExtraField0);
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setTime(0L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(3133);
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry((ZipEntry) zipArchiveEntry0);
      assertEquals(3133, zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      byte[] byteArray0 = new byte[4];
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.onUnparseableExtraField(byteArray0, (byte)0, (byte)99, false, (byte)99);
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      AsiExtraField asiExtraField0 = new AsiExtraField();
      byte[] byteArray0 = new byte[8];
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.fill(asiExtraField0, byteArray0, (byte)0, 23, true);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("1{A}i^:X/");
      zipArchiveEntry0.isDirectory();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      File file0 = MockFile.createTempFile("S%|n~p<I>qL", "S%|n~p<I>qL");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "S%|n~p<I>qL");
      zipArchiveEntry0.setVersionRequired((byte) (-68));
      int int0 = zipArchiveEntry0.getVersionRequired();
      assertEquals((-68), int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%<s&}\u0005MdnEmw>:");
      MockFile.createTempFile("%<s&}\u0005MdnEmw>:", "org.apache.commons.compress.archivers.zip.ExtraFieldUtils", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-105);
      zipArchiveEntry0.setExtra(byteArray0);
      zipArchiveEntry0.getUnparseableExtraFieldData();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals("/", zipArchiveEntry0.toString());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("S%|n~p<I>qL");
      long long0 = zipArchiveEntry0.getSize();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), long0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setUnixMode((-281));
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals(65255, zipArchiveEntry0.getUnixMode());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("aO1B!$2:@[6.X");
      String string0 = zipArchiveEntry0.getName();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals("aO1B!$2:@[6.X", string0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getName();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("V");
      zipArchiveEntry0.setMethod(128);
      int int0 = zipArchiveEntry0.getMethod();
      assertEquals(128, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      
      zipArchiveEntry0.setLocalHeaderOffset(0L);
      long long0 = zipArchiveEntry0.getLocalHeaderOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Ja");
      GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
      generalPurposeBit0.useDataDescriptor(true);
      zipArchiveEntry0.getGeneralPurposeBit();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Ep/MVl{#");
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addExtraField(x5455_ExtendedTimestamp0);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields(false);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(1, zipExtraFieldArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      JarMarker jarMarker0 = JarMarker.getInstance();
      zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(1, zipExtraFieldArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("1{A}i^:X/");
      AsiExtraField asiExtraField0 = new AsiExtraField();
      zipArchiveEntry0.addExtraField(asiExtraField0);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(1, zipExtraFieldArray0.length);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("I-?E_e");
      zipArchiveEntry0.setUnixMode(2048);
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals(134217729L, long0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setUnixMode((-2694));
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals(3, zipArchiveEntry0.getPlatform());
      assertEquals((-176553983L), long0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setDiskNumberStart(9L);
      long long0 = zipArchiveEntry0.getDiskNumberStart();
      assertEquals(9L, long0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("X'+iE4NOn.\"g\"Lcck");
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zipArchiveEntry0.addAsFirstExtraField(zip64ExtendedInformationExtraField0);
      zipArchiveEntry0.getCentralDirectoryExtra();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%<s&}\u0005MdnEmw>:");
      MockFile.createTempFile("%<s&}\u0005MdnEmw>:", "org.apache.commons.compress.archivers.zip.ExtraFieldUtils", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setLastModifiedTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // lastModifiedTime
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      try { 
        zipArchiveEntry0.setExtra((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setCreationTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // creationTime
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setCentralDirectoryExtra((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      Object object0 = zipArchiveEntry0.clone();
      zipArchiveEntry0.setGeneralPurposeBit((GeneralPurposeBit) null);
      // Undeclared exception!
      try { 
        zipArchiveEntry0.equals(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("\"^~FV1w,9_>].");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.addExtraField((ZipExtraField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("1{A}i^:X/");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.addAsFirstExtraField((ZipExtraField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry((ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = null;
      try {
        zipArchiveEntry1 = new ZipArchiveEntry(zipArchiveEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry((ZipEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry((File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setSize(101010256L);
      assertEquals(101010256L, zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("n'GjM ");
      zipArchiveEntry0.setPlatform((-2));
      zipArchiveEntry0.setName("n'GjM ");
      assertEquals((-2), zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setMethod((-1540));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1540
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[6];
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[3] = (ZipExtraField) unparseableExtraFieldData0;
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getUnixMode();
      assertEquals(0, int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntry$1");
      long long0 = zipArchiveEntry0.getTime();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      byte[] byteArray1 = zipArchiveEntry0.getLocalFileDataExtra();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(4, byteArray1.length);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addExtraField(x5455_ExtendedTimestamp0);
      ZipExtraField zipExtraField0 = zipArchiveEntry0.getExtraField(x5455_ExtendedTimestamp0.HEADER_ID);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertNotNull(zipExtraField0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("q5%|x~d=pr02.w*N(");
      AsiExtraField asiExtraField0 = new AsiExtraField();
      ZipShort zipShort0 = asiExtraField0.getHeaderId();
      zipArchiveEntry0.getExtraField(zipShort0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[0];
      zipArchiveEntry0.setExtra(byteArray0);
      zipArchiveEntry0.getExtraField((ZipShort) null);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%<s&}\u0005MdnEmw>:");
      MockFile.createTempFile("%<s&}\u0005MdnEmw>:", "org.apache.commons.compress.archivers.zip.ExtraFieldUtils", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
      int int0 = zipArchiveEntry0.getMethod();
      assertEquals("/", zipArchiveEntry0.getName());
      assertEquals((-1), int0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.isDirectory();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals(0L, long0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getInternalAttributes();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      File file0 = MockFile.createTempFile("S%|n~p<I>qL", "S%|n~p<I>qL");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "S%|n~p<I>qL");
      zipArchiveEntry0.setExtra();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals("S%|n~p<I>qL", zipArchiveEntry0.getName());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      File file0 = MockFile.createTempFile("S%|n~p<I>qL", "S%|n~p<I>qL");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "S%|n~p<I>qL");
      long long0 = zipArchiveEntry0.getSize();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getCentralDirectoryExtra();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      File file0 = MockFile.createTempFile("GeneralPurposeBit is not Cloneable?", "GeneralPurposeBit is not Cloneable?");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "GeneralPurposeBit is not Cloneable?");
      FileTime fileTime0 = FileTime.fromMillis((-416L));
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setLastModifiedTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setExternalAttributes(0L);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0L, zipArchiveEntry0.getExternalAttributes());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%<s&}\u0005MdnEmw>:");
      MockFile.createTempFile("%<s&}\u0005MdnEmw>:", "org.apache.commons.compress.archivers.zip.ExtraFieldUtils", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
      zipArchiveEntry0.setInternalAttributes((-2659));
      assertEquals((-2659), zipArchiveEntry0.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      File file0 = MockFile.createTempFile("GeneralPurposeBit is not Cloneable?", "GeneralPurposeBit is not Cloneable?");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "GeneralPurposeBit is not Cloneable?");
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, int0);
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertFalse(zipArchiveEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setSize((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("V");
      zipArchiveEntry0.setPlatform(1879048192);
      zipArchiveEntry0.setName("ONLY_PARSEABLE_LENIENT");
      assertEquals(1879048192, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setExtraFields((ZipExtraField[]) null);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setAlignment(0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setAlignment(32767);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for alignment, must be power of two and no bigger than 65535 but is 32767
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.removeUnparseableExtraFieldData();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-1);
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      zipArchiveEntry0.removeUnparseableExtraFieldData();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.removeExtraField(x000A_NTFS0.HEADER_ID);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      JarMarker jarMarker0 = new JarMarker();
      zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
      ZipShort zipShort0 = JarMarker.ID;
      zipArchiveEntry0.removeExtraField(zipShort0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("1{A}i^:X/");
      AsiExtraField asiExtraField0 = new AsiExtraField();
      zipArchiveEntry0.addExtraField(asiExtraField0);
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      zipArchiveEntry0.addAsFirstExtraField(x000A_NTFS0);
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setTime(1818L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      FileTime fileTime0 = FileTime.from((-101L), timeUnit0);
      // Undeclared exception!
      try { 
        zipArchiveEntry1.setTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      AsiExtraField asiExtraField0 = new AsiExtraField();
      zipArchiveEntry0.addExtraField(asiExtraField0);
      zipArchiveEntry0.addExtraField(asiExtraField0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)1;
      JarMarker jarMarker0 = JarMarker.getInstance();
      zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
      zipArchiveEntry0.setExtra(byteArray0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.isUnixSymlink();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertFalse(boolean0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setUnixMode((-17));
      boolean boolean0 = zipArchiveEntry0.isUnixSymlink();
      assertEquals(3, zipArchiveEntry0.getPlatform());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      File file0 = MockFile.createTempFile("u,5", "u,5");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "|4");
      long long0 = zipArchiveEntry0.getTime();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(1392409281320L, long0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals("|4", zipArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("V");
      byte[] byteArray0 = zipArchiveEntry0.getLocalFileDataExtra();
      zipArchiveEntry0.setName("ONLY_PARSEABLE_LENIENT", byteArray0);
      byte[] byteArray1 = zipArchiveEntry0.getRawName();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertNotNull(byteArray1);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getRawName();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[0];
      zipArchiveEntry0.setExtra(byteArray0);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields(false);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipExtraFieldArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile");
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
      // Undeclared exception!
      try { 
        zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[0];
      zipArchiveEntry0.setExtra(byteArray0);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields(true);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipExtraFieldArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setComment("org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm");
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals((-1L), zipArchiveEntry1.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry1.getSize());
      assertEquals(0, zipArchiveEntry1.getPlatform());
      assertFalse(boolean0);
      assertEquals((-1), zipArchiveEntry1.getMethod());
      assertFalse(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setComment("org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm");
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals((-1), zipArchiveEntry1.getMethod());
      assertEquals(0L, zipArchiveEntry0.getExternalAttributes());
      assertEquals((-1L), zipArchiveEntry1.getLocalHeaderOffset());
      assertTrue(boolean0);
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
      assertEquals(0, zipArchiveEntry1.getPlatform());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry("@BfA%`4V(jB`7N7m");
      boolean boolean0 = zipArchiveEntry1.equals(zipArchiveEntry0);
      assertFalse(boolean0);
      assertEquals((-1L), zipArchiveEntry1.getSize());
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
      assertEquals(0, zipArchiveEntry1.getPlatform());
      assertEquals((-1), zipArchiveEntry1.getMethod());
      assertEquals((-1L), zipArchiveEntry1.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("1{A}i^:X/");
      boolean boolean0 = zipArchiveEntry0.equals("1{A}i^:X/");
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertFalse(boolean0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals((Object) null);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertTrue(boolean0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[7];
      ZipLong zipLong0 = new ZipLong(byteArray0);
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getModifyFileTime();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setLastAccessTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addExtraField(x5455_ExtendedTimestamp0);
      zipArchiveEntry0.addAsFirstExtraField(x5455_ExtendedTimestamp0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipArchiveEntry0.addAsFirstExtraField(unparseableExtraFieldData0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setMethod(1615);
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry(zipArchiveEntry0);
      assertEquals(1615, zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[9];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOption0;
      linkOptionArray0[3] = linkOptionArray0[1];
      linkOptionArray0[4] = linkOptionArray0[0];
      linkOptionArray0[5] = linkOptionArray0[2];
      linkOptionArray0[6] = linkOption0;
      linkOptionArray0[7] = linkOptionArray0[2];
      linkOptionArray0[8] = linkOptionArray0[0];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[9];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      linkOptionArray0[2] = linkOption0;
      linkOptionArray0[3] = linkOptionArray0[0];
      linkOptionArray0[4] = linkOptionArray0[0];
      linkOptionArray0[5] = linkOptionArray0[2];
      linkOptionArray0[6] = linkOptionArray0[2];
      linkOptionArray0[7] = linkOptionArray0[0];
      linkOptionArray0[8] = linkOptionArray0[7];
      File file0 = MockFile.createTempFile("eB6", "4$7u'+4 .Ou9{");
      Path path0 = file0.toPath();
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, "~bKM2o-", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "");
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "1{A}i^:X/");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      ZipShort zipShort0 = X000A_NTFS.HEADER_ID;
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(zipShort0);
      zipArchiveEntry0.addAsFirstExtraField(zipExtraField0);
      FileTime fileTime0 = zipArchiveEntry0.getCreationTime();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setLastAccessTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(x0017_StrongEncryptionHeader0, byteArray0, 65535, 5, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      AsiExtraField asiExtraField0 = new AsiExtraField();
      byte[] byteArray0 = new byte[2];
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(asiExtraField0, byteArray0, (byte)8, (byte)8, true);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // The length is too short, only 8 bytes, expected at least 14
         //
         verifyException("org.apache.commons.compress.archivers.zip.AsiExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getAlignment();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%<s&}\u0005MdnEmw>:");
      MockFile.createTempFile("%<s&}\u0005MdnEmw>:", "org.apache.commons.compress.archivers.zip.ExtraFieldUtils", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
      zipArchiveEntry0.getCommentSource();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertTrue(zipArchiveEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("1{A}i^:X/");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setLastAccessTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // lastAccessTime
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[9];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Ep/MVl{#");
      long long0 = zipArchiveEntry0.getLocalHeaderOffset();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), long0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      File file0 = MockFile.createTempFile("S%|n~p<I>qL", "S%|n~p<I>qL");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "S%|n~p<I>qL");
      zipArchiveEntry0.setDataOffset(710L);
      assertEquals(710L, zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getVersionMadeBy();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      File file0 = MockFile.createTempFile("GeneralPurposeBit is not Cloneable?", "GeneralPurposeBit is not Cloneable?");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "GeneralPurposeBit is not Cloneable?");
      zipArchiveEntry0.setVersionMadeBy(21589);
      assertEquals(21589, zipArchiveEntry0.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      assertEquals(0, zipArchiveEntry0.getRawFlag());
      
      zipArchiveEntry0.setRawFlag((-1));
      int int0 = zipArchiveEntry0.getRawFlag();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      zipArchiveEntry0.setExtra(byteArray0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getUnparseableExtraFieldData();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Ep/MVl{#");
      zipArchiveEntry0.hashCode();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = null;
      try {
        zipArchiveEntry1 = new ZipArchiveEntry((ZipEntry) zipArchiveEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getNameSource();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getExtraFields();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%<s&}\u0005MdnEmw>:");
      MockFile.createTempFile("%<s&}\u0005MdnEmw>:", "org.apache.commons.compress.archivers.zip.ExtraFieldUtils", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
      long long0 = zipArchiveEntry0.getDataOffset();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), long0);
      assertEquals("/", zipArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getVersionRequired();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      FileTime fileTime0 = FileTime.fromMillis(3);
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setCreationTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addExtraField(x5455_ExtendedTimestamp0);
      ZipArchiveEntry zipArchiveEntry1 = null;
      try {
        zipArchiveEntry1 = new ZipArchiveEntry((ZipEntry) zipArchiveEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getRawFlag();
      assertEquals(0, int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.isStreamContiguous();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setStreamContiguous(true);
      boolean boolean0 = zipArchiveEntry0.isStreamContiguous();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      long long0 = zipArchiveEntry0.getDiskNumberStart();
      assertEquals(0L, long0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[4];
      zipArchiveEntry0.setName((String) null, byteArray0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.NameSource zipArchiveEntry_NameSource0 = ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG;
      zipArchiveEntry0.setNameSource(zipArchiveEntry_NameSource0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.CommentSource zipArchiveEntry_CommentSource0 = ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD;
      zipArchiveEntry0.setCommentSource(zipArchiveEntry_CommentSource0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      Date date0 = zipArchiveEntry0.getLastModifiedDate();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", date0.toString());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }
}
