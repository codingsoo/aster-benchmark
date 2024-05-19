
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
import java.time.Instant;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipArchiveEntry_ESTest extends ZipArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setMethod(0);
      assertEquals(0, zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setAlignment(31);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for alignment, must be power of two and no bigger than 65535 but is 31
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.onUnparseableExtraField(byteArray0, 0, 0, true, (-3341));
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(x000A_NTFS0.HEADER_ID);
      assertTrue(zipExtraField0.equals((Object)x000A_NTFS0));
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("/");
      zipArchiveEntry0.isDirectory();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("/");
      zipArchiveEntry0.setVersionRequired((-323));
      int int0 = zipArchiveEntry0.getVersionRequired();
      assertEquals((-323), int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.UnrecognizedExtraField", "9+sZIT2q)d94CJI");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField");
      long long0 = zipArchiveEntry0.getTime();
      assertEquals(1392409281320L, long0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals("org.apache.commons.compress.archivers.zip.UnrecognizedExtraField", zipArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      File file0 = MockFile.createTempFile("Hu<j=7d@B/", " bytes.");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, " bytes.");
      long long0 = zipArchiveEntry0.getSize();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("/");
      long long0 = zipArchiveEntry0.getSize();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), long0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setUnixMode(0);
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals(1L, zipArchiveEntry0.getExternalAttributes());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.GeneralPurposeBit");
      zipArchiveEntry0.getName();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addAsFirstExtraField(x5455_ExtendedTimestamp0);
      byte[] byteArray0 = zipArchiveEntry0.getLocalFileDataExtra();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(5, byteArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setInternalAttributes((-2146215947));
      int int0 = zipArchiveEntry0.getInternalAttributes();
      assertEquals((-2146215947), int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setExternalAttributes(808471394L);
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals(808471394L, long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      
      zipArchiveEntry0.setDataOffset(0L);
      long long0 = zipArchiveEntry0.getDataOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setDataOffset(1633L);
      long long0 = zipArchiveEntry0.getDataOffset();
      assertEquals(1633L, long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addAsFirstExtraField(x5455_ExtendedTimestamp0);
      zipArchiveEntry0.getCentralDirectoryExtra();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("i");
      FileTime fileTime0 = FileTime.fromMillis((-1));
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("t!WLiSXD");
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
  public void test019()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[7];
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
  public void test020()  throws Throwable  {
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
  public void test021()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
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
  public void test022()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
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
  public void test023()  throws Throwable  {
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
  public void test024()  throws Throwable  {
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
  public void test025()  throws Throwable  {
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
  public void test026()  throws Throwable  {
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
  public void test027()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setSize(3355L);
      assertEquals(3355L, zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setMethod((-2193));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -2193
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is too small to hold CRC");
      zipArchiveEntry0.setUnixMode(31);
      int int0 = zipArchiveEntry0.getUnixMode();
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.GeneralPurposeBit");
      long long0 = zipArchiveEntry0.getTime();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      File file0 = MockFile.createTempFile("{KUuqUQ]F*1HgCix\fA", "");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "");
      String string0 = zipArchiveEntry0.getName();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals("", string0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource");
      byte[] byteArray0 = zipArchiveEntry0.getLocalFileDataExtra();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("-J");
      zipArchiveEntry0.setExtra();
      zipArchiveEntry0.getLocalFileDataExtra();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource");
      zipArchiveEntry0.getExtraFields(false);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is too small to hold CRC");
      JarMarker jarMarker0 = new JarMarker();
      ZipShort zipShort0 = jarMarker0.getCentralDirectoryLength();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)102;
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      ZipExtraField zipExtraField0 = zipArchiveEntry0.getExtraField(zipShort0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{AME");
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      zipArchiveEntry0.getExtraField(unicodePathExtraField0.UPATH_ID);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is too small to hold CRC");
      JarMarker jarMarker0 = new JarMarker();
      ZipShort zipShort0 = jarMarker0.getCentralDirectoryLength();
      byte[] byteArray0 = new byte[7];
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      ZipExtraField zipExtraField0 = zipArchiveEntry0.getExtraField(zipShort0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertNotNull(zipExtraField0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("n");
      int int0 = zipArchiveEntry0.getMethod();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("\"Ddij=lUjE]");
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0L, long0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals("\"Ddij=lUjE]", zipArchiveEntry0.toString());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getInternalAttributes();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("NAME");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "$VALUES");
      MockFile mockFile0 = new MockFile("NAME");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, " 86eR~}+Azzibm$");
      long long0 = zipArchiveEntry0.getSize();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(8L, long0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.getCentralDirectoryExtra();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Instant instant0 = MockInstant.ofEpochMilli(65535L);
      Date date0 = Date.from(instant0);
      x5455_ExtendedTimestamp0.setCreateJavaTime(date0);
      zipArchiveEntry0.addAsFirstExtraField(x5455_ExtendedTimestamp0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Date date0 = zipArchiveEntry0.getLastModifiedDate();
      x5455_ExtendedTimestamp0.setAccessJavaTime(date0);
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", date0.toString());
      
      zipArchiveEntry0.addAsFirstExtraField(x5455_ExtendedTimestamp0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("/");
      zipArchiveEntry0.setUnixMode((-323));
      zipArchiveEntry0.isUnixSymlink();
      assertEquals(65213, zipArchiveEntry0.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.UnrecognizedExtraField", "9+sZIT2q)d94CJI");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "org.apache.commons.compress.archivers.zip.UnrecognizedExtraField");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setSize((-1691L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.GeneralPurposeBit");
      zipArchiveEntry0.setMethod(1183);
      assertEquals(1183, zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("-J");
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[7];
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      zipExtraFieldArray0[0] = (ZipExtraField) x0016_CertificateIdForCentralDirectory0;
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      zipExtraFieldArray0[1] = (ZipExtraField) x000A_NTFS0;
      zipExtraFieldArray0[2] = (ZipExtraField) x000A_NTFS0;
      JarMarker jarMarker0 = JarMarker.getInstance();
      zipExtraFieldArray0[3] = (ZipExtraField) jarMarker0;
      zipExtraFieldArray0[4] = (ZipExtraField) x000A_NTFS0;
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      zipExtraFieldArray0[5] = (ZipExtraField) unicodeCommentExtraField0;
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      zipExtraFieldArray0[6] = (ZipExtraField) resourceAlignmentExtraField0;
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      FileTime fileTime0 = zipArchiveEntry0.getLastModifiedTime();
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
  public void test050()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setExtraFields((ZipExtraField[]) null);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setAlignment(0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setAlignment((-242));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for alignment, must be power of two and no bigger than 65535 but is -242
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
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
  public void test054()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" is too small to hold CRC");
      JarMarker jarMarker0 = new JarMarker();
      ZipShort zipShort0 = jarMarker0.getCentralDirectoryLength();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.removeExtraField(zipShort0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.GeneralPurposeBit");
      JarMarker jarMarker0 = new JarMarker();
      zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
      ZipShort zipShort0 = jarMarker0.getHeaderId();
      zipArchiveEntry0.removeExtraField(zipShort0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      JarMarker jarMarker0 = JarMarker.getInstance();
      byte[] byteArray0 = new byte[5];
      zipArchiveEntry0.addExtraField(jarMarker0);
      zipArchiveEntry0.setExtra(byteArray0);
      zipArchiveEntry0.addAsFirstExtraField(jarMarker0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      assertTrue(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
      
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)4;
      zipArchiveEntry1.setCentralDirectoryExtra(byteArray0);
      assertFalse(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
      assertNotSame(zipArchiveEntry1, zipArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("n");
      int int0 = zipArchiveEntry0.getUnixMode();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, int0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setUnixMode(0);
      boolean boolean0 = zipArchiveEntry0.isUnixSymlink();
      assertEquals(3, zipArchiveEntry0.getPlatform());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("t!WLiSXD");
      zipArchiveEntry0.getRawName();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addAsFirstExtraField(x5455_ExtendedTimestamp0);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(1, zipExtraFieldArray0.length);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
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
  public void test063()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addAsFirstExtraField(x5455_ExtendedTimestamp0);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields(true);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(1, zipExtraFieldArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      assertTrue(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
      
      byte[] byteArray0 = new byte[4];
      zipArchiveEntry1.setCentralDirectoryExtra(byteArray0);
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertFalse(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setExternalAttributes(3);
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals(3L, zipArchiveEntry0.getExternalAttributes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      assertTrue(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
      
      zipArchiveEntry1.setName("z^Fc>+t!O}zhW)><\"");
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("n");
      boolean boolean0 = zipArchiveEntry0.equals("n");
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals((Object) null);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertFalse(boolean0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertTrue(boolean0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      Instant instant0 = MockInstant.ofEpochSecond((-1651L));
      FileTime fileTime0 = FileTime.from(instant0);
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
  public void test073()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      FileTime fileTime0 = FileTime.fromMillis(1886L);
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
  public void test074()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("t!WLiSXD");
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipArchiveEntry0.addAsFirstExtraField(unparseableExtraFieldData0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("/");
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zipArchiveEntry0.addAsFirstExtraField(zip64ExtendedInformationExtraField0);
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
  public void test076()  throws Throwable  {
      MockFile mockFile0 = new MockFile("P:o");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, "Te_hAxg$u[S4", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[8];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[1];
      linkOptionArray0[3] = linkOptionArray0[2];
      linkOptionArray0[4] = linkOptionArray0[1];
      linkOptionArray0[5] = linkOptionArray0[0];
      linkOptionArray0[6] = linkOptionArray0[2];
      linkOptionArray0[7] = linkOptionArray0[6];
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
  public void test079()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      FileTime fileTime0 = FileTime.from(1392409281320L, timeUnit0);
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
  public void test080()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(x0016_CertificateIdForCentralDirectory0, byteArray0, 3, 0, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[8];
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(x5455_ExtendedTimestamp0, byteArray0, (byte)6, (-1406), false);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X5455_ExtendedTimestamp too short, only -1406 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getAlignment();
      assertEquals(0, int0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getCommentSource();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setLocalHeaderOffset(8L);
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals(8L, zipArchiveEntry0.getLocalHeaderOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.GeneralPurposeBit");
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
  public void test086()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[7];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry((Path) null, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{AME");
      long long0 = zipArchiveEntry0.getLocalHeaderOffset();
      assertEquals((-1L), long0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)4;
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      File file0 = MockFile.createTempFile("dxYo7h^*k78`Z(qaG", "dxYo7h^*k78`Z(qaG");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "");
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
  public void test090()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setPlatform((byte)1);
      zipArchiveEntry0.setName("");
      assertEquals(1, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{AME");
      zipArchiveEntry0.getGeneralPurposeBit();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getVersionMadeBy();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setVersionMadeBy((-1));
      assertEquals((-1), zipArchiveEntry0.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setRawFlag(0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getRawFlag());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getUnparseableExtraFieldData();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.hashCode();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
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
  public void test098()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getNameSource();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getExtraFields();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      long long0 = zipArchiveEntry0.getDataOffset();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getVersionRequired();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("/");
      zipArchiveEntry0.setDiskNumberStart((-1L));
      assertEquals((-1L), zipArchiveEntry0.getDiskNumberStart());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
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
  public void test104()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      JarMarker jarMarker0 = JarMarker.getInstance();
      zipArchiveEntry0.addExtraField(jarMarker0);
      byte[] byteArray0 = new byte[15];
      zipArchiveEntry0.setExtra(byteArray0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{AME");
      int int0 = zipArchiveEntry0.getRawFlag();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.isStreamContiguous();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addAsFirstExtraField(x5455_ExtendedTimestamp0);
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setTime((-1L));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.isDirectory();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertFalse(boolean0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(" m+dkT)e#-Kh");
      zipArchiveEntry0.setStreamContiguous(false);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertFalse(zipArchiveEntry0.isStreamContiguous());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      long long0 = zipArchiveEntry0.getDiskNumberStart();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0L, long0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[6];
      zipArchiveEntry0.setName((String) null, byteArray0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.NameSource zipArchiveEntry_NameSource0 = ZipArchiveEntry.NameSource.NAME;
      zipArchiveEntry0.setNameSource(zipArchiveEntry_NameSource0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("-J");
      ZipArchiveEntry.CommentSource zipArchiveEntry_CommentSource0 = ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD;
      zipArchiveEntry0.setCommentSource(zipArchiveEntry_CommentSource0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals((-1L), zipArchiveEntry1.getLocalHeaderOffset());
      assertTrue(boolean0);
      assertEquals(0L, zipArchiveEntry1.getExternalAttributes());
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
      assertEquals((-1), zipArchiveEntry1.getMethod());
      assertEquals(0, zipArchiveEntry1.getPlatform());
      assertEquals((-1L), zipArchiveEntry1.getSize());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{AME");
      zipArchiveEntry0.setGeneralPurposeBit((GeneralPurposeBit) null);
      zipArchiveEntry0.getGeneralPurposeBit();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }
}
