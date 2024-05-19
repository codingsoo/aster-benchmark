
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
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipMethod;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UnsupportedZipFeatureException_ESTest extends UnsupportedZipFeatureException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
      String string0 = unsupportedZipFeatureException_Feature0.toString();
      assertEquals("unknown compressed size", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.UNSHRINKING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("0#C<<v;|");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      assertEquals("Unsupported compression method -1 (UNSHRINKING) used in entry 0#C<<v;|", unsupportedZipFeatureException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0);
      assertEquals("Unsupported feature unknown compressed size used in archive.", unsupportedZipFeatureException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0);
      ZipArchiveEntry zipArchiveEntry0 = unsupportedZipFeatureException0.getEntry();
      assertNull(zipArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setStreamContiguous(true);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry1.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setVersionRequired(32772);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.DEFLATED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("od_U:bD=EfI");
      zipArchiveEntry0.setVersionRequired((-1));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1), zipArchiveEntry1.getMethod());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setVersionMadeBy(1980);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.LZMA;
      File file0 = MockFile.createTempFile("4xr!", "4xr!");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "k Y1Yk<#-#7!ky");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setVersionMadeBy((-1));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals("k Y1Yk<#-#7!ky", zipArchiveEntry1.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.IMPLODING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setSize(1L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals("", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setRawFlag(100);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCrc());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_2;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setUnixMode(496);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCrc());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setPlatform((-1625));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1), zipArchiveEntry1.getMethod());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.WAVPACK;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setMethod(0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isDirectory());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(3);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertSame(zipArchiveEntry0, zipArchiveEntry1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.BZIP2;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("splitting");
      zipArchiveEntry0.setLocalHeaderOffset(0L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry1.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("%[og");
      zipArchiveEntry0.setLocalHeaderOffset(421L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1), zipArchiveEntry1.getMethod());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.XZ;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("X0y3/");
      zipArchiveEntry0.setInternalAttributes(596);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isUnixSymlink());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.IMPLODING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setInternalAttributes((-1));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(3, ZipArchiveEntry.PLATFORM_UNIX);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.UNSHRINKING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setExternalAttributes((-2955L));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals("", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.JPEG;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("#'z|6");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setDiskNumberStart(3);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, ZipArchiveEntry.PLATFORM_FAT);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.JPEG;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("#'z|6");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setDiskNumberStart((-1L));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isDirectory());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.XZ;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ggBbdN0T-WnG_b/a60x");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setDataOffset(0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Unsupported feature ");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setDataOffset(134695760L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCrc(0L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setCrc(2103L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(3, ZipArchiveEntry.PLATFORM_UNIX);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCompressedSize(0L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1), ZipArchiveEntry.CRC_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_4;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("?Rm{nt&");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setCompressedSize(3915L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0L, zipArchiveEntry1.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_2;
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = null;
      try {
        unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, (ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = null;
      try {
        unsupportedZipFeatureException0 = new UnsupportedZipFeatureException((UnsupportedZipFeatureException.Feature) null, (ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.DEFLATED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("od_U:bD=EfI");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = unsupportedZipFeatureException0.getFeature();
      assertEquals("compression method", unsupportedZipFeatureException_Feature0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException((UnsupportedZipFeatureException.Feature) null);
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = unsupportedZipFeatureException0.getFeature();
      assertNull(unsupportedZipFeatureException_Feature0);
  }
}
