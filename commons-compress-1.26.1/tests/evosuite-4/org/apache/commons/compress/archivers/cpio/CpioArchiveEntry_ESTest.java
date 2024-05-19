
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


package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CpioArchiveEntry_ESTest extends CpioArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("YwS=VP'r", 4294967295L);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("YwS=VP'r", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("070701");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setMode((-442L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode. Full: fffffffffffffe46 Masked: f000
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 0L);
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      File file0 = MockFile.createTempFile(" G-4APm{d*K$|p", " G-4APm{d*K$|p");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, "Unknown header type ");
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals("Unknown header type ", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("W} 58p#e@O!Te?mnSz9");
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertFalse(boolean0);
      assertEquals("W} 58p#e@O!Te?mnSz9", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("070701");
      cpioArchiveEntry0.setTime((-3018L));
      cpioArchiveEntry0.getLastModifiedDate();
      assertEquals((-3018L), cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      MockFile mockFile0 = new MockFile("&tu:$/`UF,", "&tu:$/`UF,");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "}");
      int int0 = cpioArchiveEntry0.getHeaderPadCount((-2893L));
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0, int0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("}", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      int int0 = cpioArchiveEntry0.getHeaderPadCount(0L);
      assertEquals(1, int0);
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2);
      short short0 = cpioArchiveEntry0.getFormat();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)2, short0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      cpioArchiveEntry0.setSize(1);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(1L, cpioArchiveEntry0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 1366L);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", cpioArchiveEntry0.getName());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "", (short)4);
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(4L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
      cpioArchiveEntry0.setRemoteDevice(397L);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "@");
      cpioArchiveEntry0.setDevice((short)4);
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("@", cpioArchiveEntry0.getName());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      assertEquals(0L, cpioArchiveEntry0.getUID());
      
      cpioArchiveEntry0.setUID((-1L));
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 0L);
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals(0L, long0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("tgg`[#B<V\"i6.N$M");
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      FileTime fileTime0 = FileTime.from((-1943L), timeUnit0);
      cpioArchiveEntry0.setTime(fileTime0);
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals((-1943L), long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("s+E61!!pBsrQE", 5259L);
      long long0 = cpioArchiveEntry0.getSize();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(5259L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals("s+E61!!pBsrQE", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "070707");
      cpioArchiveEntry0.setRemoteDeviceMaj(2750L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("070707", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(2750L, long0);
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(",U.hnip,o-];]");
      String string0 = cpioArchiveEntry0.getName();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(",U.hnip,o-];]", string0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("W} 58p#e@O!Te?mnSz9");
      cpioArchiveEntry0.setInode(32768L);
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals(32768L, long0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(">f}6NEgyT");
      cpioArchiveEntry0.setInode((-14L));
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals((-14L), long0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 1009L);
      cpioArchiveEntry0.setGID(1L);
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(",U.hnip,o-];]");
      cpioArchiveEntry0.setDeviceMin(100L);
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(100L, long0);
      assertEquals(",U.hnip,o-];]", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("s+E61!!pBsrQE", 5259L);
      cpioArchiveEntry0.setDeviceMin((-1L));
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals("s+E61!!pBsrQE", cpioArchiveEntry0.getName());
      assertEquals(5259L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((-1L), long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("W} 58p#e@O!Te?mnSz9");
      cpioArchiveEntry0.setDeviceMaj(36864L);
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals("W} 58p#e@O!Te?mnSz9", cpioArchiveEntry0.getName());
      assertEquals(36864L, long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("XhH^~");
      cpioArchiveEntry0.setDeviceMaj((-1L));
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((-1L), long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("XhH^~", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      cpioArchiveEntry0.setChksum((-3581L));
      long long0 = cpioArchiveEntry0.getChksum();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(4294963715L, long0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "-fp47dy7S+PBB");
      int int0 = cpioArchiveEntry0.getAlignmentBoundary();
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals("-fp47dy7S+PBB", cpioArchiveEntry0.getName());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "@");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDeviceMaj(49152L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setChksum((-332L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getRemoteDeviceMin();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getRemoteDevice();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("XhH^~");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getHeaderPadCount(4294967295L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument too large or result overflows
         //
         verifyException("org.apache.commons.compress.utils.ExactMath", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 1009L);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getDevice();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "@");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getChksum();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[8];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)76, (Path) null, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      MockFile mockFile0 = new MockFile("@", "@");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "@", linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot determine type of file /Users/mkim754/IdeaProjects/aster-benchmark/commons-compress-1.26.1/@/@
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)2, "<5G", (-1712L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size <-1712>
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)4, (File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      File file0 = MockFile.createTempFile(">f}R6NEgyT", ">f}R6NEgyT");
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)7, file0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 7
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((String) null, (-1471L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size <-1471>
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((File) null, "070702");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("q");
      cpioArchiveEntry0.setMode((-116444736000000000L));
      assertEquals((-116444736000000000L), cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 0L);
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals("", cpioArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "070707");
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals("070707", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertTrue(boolean0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("W} 58p#e@O!Te?mnSz9");
      int int0 = cpioArchiveEntry0.getHeaderPadCount(1L);
      assertEquals("W} 58p#e@O!Te?mnSz9", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("070701");
      int int0 = cpioArchiveEntry0.getHeaderPadCount((Charset) null);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(3, int0);
      assertEquals("070701", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      Charset charset0 = Charset.defaultCharset();
      int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[7];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      linkOptionArray0[2] = linkOption0;
      linkOptionArray0[3] = linkOptionArray0[0];
      linkOptionArray0[4] = linkOptionArray0[1];
      linkOptionArray0[5] = linkOptionArray0[3];
      linkOptionArray0[6] = linkOptionArray0[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(path0, "", linkOptionArray0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(1711001603L, long0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("tgg`[#B<V\"i6.N$M");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setSize((-1392L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size <-1392>
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      cpioArchiveEntry0.setMode(24576);
      assertEquals(24576L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("tgg`[#B<V\"i6.N$M");
      cpioArchiveEntry0.setMode(4096L);
      assertEquals(4096L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      boolean boolean0 = cpioArchiveEntry0.isSymbolicLink();
      assertFalse(boolean0);
      assertEquals("mz/k?Zv2]X>G5", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("w[Fs=", 0L);
      boolean boolean0 = cpioArchiveEntry0.isSocket();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("w[Fs=", cpioArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      MockFile mockFile0 = new MockFile("XhH^~");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertTrue(boolean0);
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertFalse(boolean0);
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertFalse(boolean0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      boolean boolean0 = cpioArchiveEntry0.isNetwork();
      assertFalse(boolean0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("tgg`[#B<V\"i6.N$M");
      cpioArchiveEntry0.setMode(8192L);
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals(8192L, cpioArchiveEntry0.getMode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals("mz/k?Zv2]X>G5", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertFalse(boolean0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertFalse(boolean0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      MockFile mockFile0 = new MockFile("@", "@");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, mockFile0, "TRAILER!!!");
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(1L, long0);
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(2L, long0);
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("s+E61!!pBsrQE", 5259L);
      cpioArchiveEntry0.setNumberOfLinks(214L);
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals(214L, long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("s+E61!!pBsrQE", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, long0);
      assertEquals("mz/k?Zv2]X>G5", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("tgg`[#B<V\"i6.N$M");
      cpioArchiveEntry0.setMode(8192L);
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals(8192L, long0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("w[Fs=", 0L);
      int int0 = cpioArchiveEntry0.getHeaderPadCount();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2);
      int int0 = cpioArchiveEntry0.getHeaderPadCount((-2402L));
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "@");
      int int0 = cpioArchiveEntry0.getHeaderPadCount((long) (short)4);
      assertEquals("@", cpioArchiveEntry0.getName());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("tgg`[#B<V\"i6.N$M");
      Charset charset0 = Charset.defaultCharset();
      int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(1, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "@");
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(0, int0);
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals("@", cpioArchiveEntry0.getName());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0, int0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      MockFile mockFile0 = new MockFile(",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry((String) null, 0L);
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
      assertTrue(boolean0);
      assertEquals(0L, cpioArchiveEntry1.getSize());
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry1.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry(",U.hnip,o-];]");
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
      assertEquals(110, cpioArchiveEntry1.getHeaderSize());
      assertFalse(boolean0);
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry(",U.hnip,o-];]");
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertFalse(cpioArchiveEntry1.equals((Object)cpioArchiveEntry0));
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry1.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertFalse(boolean0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("q");
      boolean boolean0 = cpioArchiveEntry0.equals((Object) null);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("q", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertTrue(boolean0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
      boolean boolean0 = cpioArchiveEntry0.equals("TRAILER!!!");
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Zip slip '%s' + '%s' -> '%s'");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot determine type of file Zip slip '%s' + '%s' -> '%s'
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)0, "u<1Livj_Qz4Jo*dA@6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 0
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 7
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 6
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 5
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getDeviceMin();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)3, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 3
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      cpioArchiveEntry0.hashCode();
      assertEquals("mz/k?Zv2]X>G5", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("s+E61!!pBsrQE", 5259L);
      cpioArchiveEntry0.setRemoteDeviceMaj((-1L));
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals(5259L, cpioArchiveEntry0.getSize());
      assertEquals("s+E61!!pBsrQE", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((-1L), long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals(0L, long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      String string0 = cpioArchiveEntry0.getName();
      assertNull(string0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      short short0 = cpioArchiveEntry0.getFormat();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, short0);
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      long long0 = cpioArchiveEntry0.getRemoteDevice();
      assertEquals(0L, long0);
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      long long0 = cpioArchiveEntry0.getDevice();
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, ",U.hnip,o-];]");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("s+E61!!pBsrQE", 5259L);
      long long0 = cpioArchiveEntry0.getChksum();
      assertEquals("s+E61!!pBsrQE", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[1];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((Path) null, "6<sd_", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      int int0 = cpioArchiveEntry0.getHeaderSize();
      assertEquals(110, int0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("mz/k?Zv2]X>G5", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      MockFile mockFile0 = new MockFile("XhH^~");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDevice(0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      MockFile mockFile0 = new MockFile("XhH^~");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals(0L, long0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(">f}6NEgyT");
      int int0 = cpioArchiveEntry0.getAlignmentBoundary();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(">f}6NEgyT", cpioArchiveEntry0.getName());
      assertEquals(4, int0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals(0L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("mz/k?Zv2]X>G5", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDevice(0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("s+E61!!pBsrQE", 5259L);
      int int0 = cpioArchiveEntry0.getHeaderPadCount();
      assertEquals(3, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("s+E61!!pBsrQE", cpioArchiveEntry0.getName());
      assertEquals(5259L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      long long0 = cpioArchiveEntry0.getSize();
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      MockFile mockFile0 = new MockFile("XhH^~");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      cpioArchiveEntry0.setUID(0L);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0L, cpioArchiveEntry0.getUID());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(">f}6NEgyT");
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
      assertEquals(">f}6NEgyT", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      cpioArchiveEntry0.setRemoteDeviceMin(32768L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(32768L, long0);
      assertEquals("mz/k?Zv2]X>G5", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("mz/k?Zv2]X>G5");
      cpioArchiveEntry0.setName("");
      cpioArchiveEntry0.getName();
      assertEquals("", cpioArchiveEntry0.getName());
  }
}
