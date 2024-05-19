
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
import java.util.Date;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CpioArchiveEntry_ESTest extends CpioArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, (String) null);
      cpioArchiveEntry0.setSize(4294967295L);
      assertEquals(4294967295L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q_B");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setMode((-3477L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode. Full: fffffffffffff26b Masked: f000
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      File file0 = MockFile.createTempFile("Cannot determine type of file ", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, (String) null);
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("1");
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertEquals("1", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      cpioArchiveEntry0.setNumberOfLinks(1);
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1L, long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      File file0 = MockFile.createTempFile("Cannot determine type of file ", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, (String) null);
      Date date0 = cpioArchiveEntry0.getLastModifiedDate();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("1");
      int int0 = cpioArchiveEntry0.getHeaderPadCount();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, "Unknown mode. Full: ");
      int int0 = cpioArchiveEntry0.getHeaderPadCount();
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
      assertEquals("Unknown mode. Full: ", cpioArchiveEntry0.getName());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      short short0 = cpioArchiveEntry0.getFormat();
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)4, short0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(">", 2107L);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(1, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(">", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, "fztzo7}$ran0?4y/onH", 0L);
      assertEquals("fztzo7}$ran0?4y/onH", cpioArchiveEntry0.getName());
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      cpioArchiveEntry0.setRemoteDevice((-1560L));
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      cpioArchiveEntry0.setUID((short)4);
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      cpioArchiveEntry0.setSize(49152L);
      long long0 = cpioArchiveEntry0.getSize();
      assertEquals(49152L, long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("g,P", 0L);
      cpioArchiveEntry0.setRemoteDeviceMin(3691L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(3691L, long0);
      assertEquals("g,P", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      File file0 = MockFile.createTempFile("Cannot determine type of file ", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, (String) null);
      cpioArchiveEntry0.setRemoteDeviceMin((-3069L));
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals((-3069L), long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, (String) null);
      cpioArchiveEntry0.setRemoteDeviceMaj(1494L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(1494L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("1");
      cpioArchiveEntry0.setRemoteDeviceMaj((-1771L));
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals((-1771L), long0);
      assertEquals("1", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      MockFile mockFile0 = new MockFile("yp!6J1rHLA7axI");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      String string0 = cpioArchiveEntry0.getName();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertNull(string0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("^+");
      String string0 = cpioArchiveEntry0.getName();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("^+", string0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      cpioArchiveEntry0.setInode(2649L);
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals(2649L, long0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1);
      cpioArchiveEntry0.setGID(838L);
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals(838L, long0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("1");
      cpioArchiveEntry0.setDeviceMin(883L);
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(883L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("1", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q_B");
      cpioArchiveEntry0.setDeviceMaj(1L);
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals("Q_B", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      long long0 = cpioArchiveEntry0.getDevice();
      assertEquals(0L, long0);
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, "Unknown mode. Full: ");
      cpioArchiveEntry0.setDevice((short)8);
      long long0 = cpioArchiveEntry0.getDevice();
      assertEquals(8L, long0);
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals("Unknown mode. Full: ", cpioArchiveEntry0.getName());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      cpioArchiveEntry0.setDevice((-607L));
      long long0 = cpioArchiveEntry0.getDevice();
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((-607L), long0);
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "w");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "Zip slip '%s' + '%s' -> '%s'");
      cpioArchiveEntry0.setChksum((-2503L));
      long long0 = cpioArchiveEntry0.getChksum();
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(4294964793L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      int int0 = cpioArchiveEntry0.getAlignmentBoundary();
      assertEquals(0, int0);
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDeviceMin((byte) (-82));
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
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDeviceMaj(39L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setChksum((-565L));
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
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
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
  public void test036()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getRemoteDeviceMaj();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("070701");
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
  public void test038()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Q_B", "TRAILER!!!");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "Q_B");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getHeaderPadCount((-116444736000000000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument too large or result overflows
         //
         verifyException("org.apache.commons.compress.utils.ExactMath", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
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
  public void test040()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Unknown mode. Full: ", "Unknown mode. Full: ");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, mockFile0, "Unknown mode. Full: ");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getDeviceMaj();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%9IS=o9>4");
      Path path0 = mockFile0.toPath();
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short) (-4149), path0, "%9IS=o9>4", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)1327, "Zip slip '%s' + '%s' -> '%s'", (-2381L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 1327
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)1028, "<Z~Jh?ofN2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 1028
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)0, (File) null, "xj*tWA#RSO|]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      File file0 = MockFile.createTempFile("Unknown header type ", "Unknown header type ");
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)1017, file0, "0kTJ`Jn+ii%Cfwo*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 1017
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry("x'B2pzvqmj_+i)}$", (-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size <-1>
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((File) null, "By#u,`~v|icz");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q_B");
      cpioArchiveEntry0.setMode(32768L);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("Q_B", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("}[9\"%M", 354L);
      int int0 = cpioArchiveEntry0.getHeaderPadCount((Charset) null);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(3, int0);
      assertEquals(2, cpioArchiveEntry0.getDataPadCount());
      assertEquals("}[9\"%M", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null, 26L);
      Charset charset0 = Charset.defaultCharset();
      int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
      assertEquals(2, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0, int0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("1");
      assertEquals(0L, cpioArchiveEntry0.getTime());
      
      cpioArchiveEntry0.setTime((-1L));
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      File file0 = MockFile.createTempFile("Cannot determine type of file ", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, (String) null);
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1392409281L, long0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      MockFile mockFile0 = new MockFile("yp!6J1rHLA7axI", "yp!6J1rHLA7axI");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setSize((-608L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size <-608>
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      cpioArchiveEntry0.setMode(4096);
      assertEquals(4096L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("1");
      boolean boolean0 = cpioArchiveEntry0.isSymbolicLink();
      assertFalse(boolean0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("1", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "w");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "Zip slip '%s' + '%s' -> '%s'");
      boolean boolean0 = cpioArchiveEntry0.isSocket();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertFalse(boolean0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      MockFile mockFile0 = new MockFile("d{^mz.L#nO", "Q]\":LA0[C");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertTrue(boolean0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, (String) null);
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "w");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "Zip slip '%s' + '%s' -> '%s'");
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("1");
      boolean boolean0 = cpioArchiveEntry0.isNetwork();
      assertFalse(boolean0);
      assertEquals("1", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      File file0 = MockFile.createTempFile("Cannot determine type of file ", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, (String) null);
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "w");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "Zip slip '%s' + '%s' -> '%s'");
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", cpioArchiveEntry0.getName());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("1");
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(1L, long0);
      assertEquals("1", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, "TRAILER!!!");
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, (String) null);
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, long0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, (String) null);
      int int0 = cpioArchiveEntry0.getHeaderPadCount(1000L);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(1, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q_B");
      Charset charset0 = Charset.defaultCharset();
      int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(">", 2098L);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(">", cpioArchiveEntry0.getName());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q_B");
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(0, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("Q_B", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, (String) null);
      boolean boolean0 = cpioArchiveEntry0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      File file0 = MockFile.createTempFile("Cannot determine type of file ", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, (String) null);
      boolean boolean0 = cpioArchiveEntry0.equals(file0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertFalse(boolean0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(path0, "Sn@e", linkOptionArray0);
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(16384L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Zip slip '%s' + '%s' -> '%s'", "Zip slip '%s' + '%s' -> '%s'");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[6];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[1];
      linkOptionArray0[3] = linkOptionArray0[1];
      linkOptionArray0[4] = linkOptionArray0[2];
      linkOptionArray0[5] = linkOption0;
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry(path0, "Zip slip '%s' + '%s' -> '%s'", linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot determine type of file /Users/mkim754/IdeaProjects/aster-benchmark/commons-compress-1.26.1/Zip slip '%s' + '%s' -> '%s'/Zip slip '%s' + '%s' -> '%s'
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertTrue(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)0, path0, "", linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 0
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Unknown mode. Full: ", "Unknown mode. Full: ");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, mockFile0, "Unknown mode. Full: ");
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
  public void test078()  throws Throwable  {
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
  public void test079()  throws Throwable  {
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
  public void test080()  throws Throwable  {
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
  public void test081()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 3
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, "`i,");
      cpioArchiveEntry0.hashCode();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals("`i,", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals(0L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      String string0 = cpioArchiveEntry0.getName();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", string0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("1");
      short short0 = cpioArchiveEntry0.getFormat();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, short0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("1", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      long long0 = cpioArchiveEntry0.getRemoteDevice();
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
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
  public void test088()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getChksum();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[1];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((Path) null, "Unknown header type ", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("1");
      int int0 = cpioArchiveEntry0.getHeaderSize();
      assertEquals(110, int0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("1", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, "`i,");
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals("`i,", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, "`i,");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDevice((short)2);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      int int0 = cpioArchiveEntry0.getAlignmentBoundary();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      File file0 = MockFile.createTempFile("Cannot determine type of file ", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, (String) null);
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals(0L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(">", 2098L);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDevice(24576L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getSize();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, "`i,");
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals("`i,", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      cpioArchiveEntry0.setNumberOfLinks((-14L));
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals((-14L), long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      FileTime fileTime0 = FileTime.fromMillis(0L);
      cpioArchiveEntry0.setTime(fileTime0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals(0L, long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      File file0 = MockFile.createTempFile("Cannot determine type of file ", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, (String) null);
      cpioArchiveEntry0.setName("Cannot determine type of file ");
      int int0 = cpioArchiveEntry0.getHeaderPadCount((-3069L));
      assertEquals("Cannot determine type of file ", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0, int0);
  }
}
