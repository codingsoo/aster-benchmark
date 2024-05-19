
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest;
import org.apache.commons.compress.parallel.InputStreamSupplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipArchiveEntryRequest_ESTest extends ZipArchiveEntryRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setStreamContiguous(true);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/zOd| T0zOd| T");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = MockFile.createTempFile("zOd| T", "zOd| T");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "zOd| T");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setVersionRequired(26370);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = MockFile.createTempFile("zOd|\"T", "org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setVersionRequired((-1745));
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getPlatform());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("zORdYT");
      zipArchiveEntry0.setVersionMadeBy(1559);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getVersionRequired());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile("zOd|\"T", "zOd|\"T");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "zOd|\"T");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setVersionMadeBy((-435));
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getVersionRequired());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("zORdYT");
      zipArchiveEntry0.setSize(3443L);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getRawFlag());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest");
      zipArchiveEntry0.setRawFlag(1);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setRawFlag((-1));
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      zipArchiveEntry0.setPlatform((-2509));
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0L, zipArchiveEntry1.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setMethod(0);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getMethod());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      File file0 = MockFile.createTempFile("zOd|\"T", "zOd|\"T");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setMethod(255);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getVersionRequired());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("zORdYT");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setLocalHeaderOffset(0L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(3, ZipArchiveEntry.PLATFORM_UNIX);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setLocalHeaderOffset(115L);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals("", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setInternalAttributes(2590);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setInternalAttributes((-1));
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setUnixMode(21);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("@f@PZ");
      zipArchiveEntry0.setExternalAttributes((-1216L));
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1), ZipArchiveEntry.CRC_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setDiskNumberStart(65535L);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0L, zipArchiveEntry1.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory");
      zipArchiveEntry0.setDiskNumberStart((-8L));
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("gUlA7l");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setDataOffset(0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0L, zipArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setDataOffset(6024L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry1.getNameSource());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCrc(0);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, ZipArchiveEntry.PLATFORM_FAT);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setCrc(893L);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertFalse(zipArchiveEntry1.isStreamContiguous());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCompressedSize(0L);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0L, zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCompressedSize(134695760L);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0L, zipArchiveEntry1.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      File file0 = MockFile.createTempFile("zOd|\"T", "org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(pipedInputStream0).when(inputStreamSupplier0).get();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      InputStream inputStream0 = zipArchiveEntryRequest0.getPayloadStream();
      assertSame(pipedInputStream0, inputStream0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setMethod(0);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      int int0 = zipArchiveEntryRequest0.getMethod();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(1);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      int int0 = zipArchiveEntryRequest0.getMethod();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.AsiExtraField", "org.apache.commons.compress.archivers.zip.AsiExtraField");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "pc");
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      // Undeclared exception!
      try { 
        zipArchiveEntryRequest0.getPayloadStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipArchiveEntryRequest.createZipArchiveEntryRequest((ZipArchiveEntry) null, (InputStreamSupplier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.AsiExtraField", "org.apache.commons.compress.archivers.zip.AsiExtraField");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "pc");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(inputStreamSupplier0).get();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      InputStream inputStream0 = zipArchiveEntryRequest0.getPayloadStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.AsiExtraField", "org.apache.commons.compress.archivers.zip.AsiExtraField");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "pc");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      int int0 = zipArchiveEntryRequest0.getMethod();
      assertEquals((-1), int0);
  }
}
