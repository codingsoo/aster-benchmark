
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
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_1;
      File file0 = MockFile.createTempFile("resize", "");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = unsupportedZipFeatureException0.getFeature();
      String string0 = unsupportedZipFeatureException_Feature0.toString();
      assertEquals("compression method", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException((UnsupportedZipFeatureException.Feature) null, zipArchiveEntry0);
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = unsupportedZipFeatureException0.getFeature();
      assertNull(unsupportedZipFeatureException_Feature0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.WAVPACK;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setStreamContiguous(true);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setVersionRequired((byte)9);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCrc());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setVersionRequired((-1));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertSame(zipArchiveEntry0, zipArchiveEntry1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.UNSHRINKING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setVersionMadeBy((-2810));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isUnixSymlink());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      MockFile mockFile0 = new MockFile("\rFqbp<&y^tq )B2fol", "");
      File file0 = MockFile.createTempFile("\rFqbp<&y^tq )B2fol", "org.apache.commons.compress.archivers.zip.X7875_NewUnix", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "\rFqbp<&y^tq )B2fol");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setSize(1000L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setRawFlag(1);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.UNKNOWN;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setRawFlag((-1));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setPlatform((-618));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isStreamContiguous());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.TOKENIZATION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Failed to parse corrupt ZIP extra field of type ");
      zipArchiveEntry0.setMethod(0);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setMethod(1256);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.PPMD;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setLocalHeaderOffset(0L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals("", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.METHOD;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("R}");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setLocalHeaderOffset(534L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setInternalAttributes(514);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.UNSHRINKING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setInternalAttributes((-2810));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_4;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("1kCS,K^@");
      zipArchiveEntry0.setExternalAttributes(808471376L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertNull(zipArchiveEntry1.getComment());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.METHOD;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("R}");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setUnixMode((-1));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isStreamContiguous());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setDiskNumberStart(280375465082880L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals("", zipArchiveEntry1.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setDiskNumberStart((-1586L));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(3, ZipArchiveEntry.PLATFORM_UNIX);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setDataOffset(0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertSame(zipArchiveEntry0, zipArchiveEntry1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.TOKENIZATION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Failed to parse corrupt ZIP extra field of type ");
      zipArchiveEntry0.setDataOffset(1L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1), ZipArchiveEntry.CRC_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.JPEG;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("DsO~['Jd!u");
      zipArchiveEntry0.setCrc(0L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertNull(zipArchiveEntry1.getComment());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.ENHANCED_DEFLATED;
      File file0 = MockFile.createTempFile("*!pJl[4Jy?nUJ", "*!pJl[4Jy?nUJ");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "*!pJl[4Jy?nUJ");
      zipArchiveEntry0.setCrc(65280L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(") used in entry ");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setCompressedSize(0L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isDirectory());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.STORED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCompressedSize(1095216660480L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = null;
      try {
        unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, (ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.UNSHRINKING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setVersionMadeBy(3);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertNull(zipArchiveEntry1.getComment());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.ENHANCED_DEFLATED;
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
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0);
      ZipArchiveEntry zipArchiveEntry0 = unsupportedZipFeatureException0.getEntry();
      assertNull(zipArchiveEntry0);
  }
}
