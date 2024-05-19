
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


package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveStructSparse;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TarArchiveEntry_ESTest extends TarArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte) (-35));
      tarArchiveEntry0.setSize(0L);
      assertEquals((byte) (-35), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0L, tarArchiveEntry0.getRealSize());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      tarArchiveEntry0.setDataOffset((byte)25);
      assertEquals(25L, tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)109, true);
      boolean boolean0 = tarArchiveEntry0.isSymbolicLink();
      assertFalse(boolean0);
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)109, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("GcHtlo/CH`]-p}", (byte)85, true);
      boolean boolean0 = tarArchiveEntry0.isLink();
      assertFalse(boolean0);
      assertEquals("GcHtlo/CH`]-p}", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)85, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Corrupted TAR archive, sparse entry with negative offset", (byte) (-80));
      boolean boolean0 = tarArchiveEntry0.isGNULongNameEntry();
      assertEquals((byte) (-80), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("Corrupted TAR archive, sparse entry with negative offset", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("sF", (byte)83);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertTrue(boolean0);
      assertEquals("sF", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertTrue(tarArchiveEntry0.isOldGNUSparse());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(":Ys", (byte) (-73));
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals(":Ys", tarArchiveEntry0.getName());
      assertTrue(boolean0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte) (-73), tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("(M ;!", (byte)108);
      tarArchiveEntry0.isDirectory();
      assertEquals((byte)108, tarArchiveEntry0.getLinkFlag());
      assertEquals("(M ;!", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("9w8Z5mb[?JmZ1obxp[H/", (byte) (-60));
      assertFalse(tarArchiveEntry0.isSparse());
      
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.fillStarSparseData(map0);
      tarArchiveEntry0.isStarSparse();
      assertFalse(tarArchiveEntry0.isGNULongNameEntry());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "\\u";
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(string0);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      tarArchiveEntry0.isPaxGNUSparse();
      assertEquals("\\u", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("GcHtlo/CH`]-p}", (byte)85, true);
      TarArchiveEntry tarArchiveEntry1 = new TarArchiveEntry("5^omxZ", (byte)85, true);
      boolean boolean0 = tarArchiveEntry0.isDescendent(tarArchiveEntry1);
      assertEquals(33188, tarArchiveEntry1.getMode());
      assertEquals((-1L), tarArchiveEntry1.getDataOffset());
      assertEquals((byte)85, tarArchiveEntry1.getLinkFlag());
      assertEquals("GcHtlo/CH`]-p}", tarArchiveEntry0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("(M !", (byte) (-117));
      tarArchiveEntry0.setSize(6L);
      long long0 = tarArchiveEntry0.getRealSize();
      assertEquals(6L, long0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      String string0 = tarArchiveEntry0.getName();
      assertEquals("numbytes must not be negative", string0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)25, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("-r5<0$+/9YX7D07", (byte)63, false);
      tarArchiveEntry0.setUserId((-5806));
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals((-5806), tarArchiveEntry0.getUserId());
      assertEquals((-5806L), long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("<PMvcUr\"WU`xw#6w`kp", (byte) (-44));
      byte byte0 = tarArchiveEntry0.getLinkFlag();
      assertEquals((byte) (-44), byte0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("<PMvcUr\"WU`xw#6w`kp", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      tarArchiveEntry0.addPaxHeader("numbytes must not be negative", "8");
      String string0 = tarArchiveEntry0.getExtraPaxHeader("numbytes must not be negative");
      assertEquals((byte)25, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertNotNull(string0);
      assertEquals("numbytes must not be negative", tarArchiveEntry0.getName());
      assertEquals("8", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      tarArchiveEntry0.setDevMajor((byte)25);
      int int0 = tarArchiveEntry0.getDevMajor();
      assertEquals(25, int0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("+@*5d~M-xih6~dP^", (byte) (-47));
      byte[] byteArray0 = new byte[4];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tarArchiveEntry0.writeEntryHeader(byteArray0, zipEncoding0, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("GcHtlo/CH`]-p}", (byte)85, true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.updateEntryFromPaxHeaders((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("SCHILY.archtype", (byte)0);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setModTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Time must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("00", (byte)3);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setLastModifiedTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Time must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.fillGNUSparse1xData((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.fillGNUSparse0xData((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Corrupted TAR archive. Sparse blocks for ", (byte)40, true);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      try { 
        tarArchiveEntry0.fillGNUSparse0xData(map0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to parse int from string value: null
         //
         verifyException("org.apache.commons.compress.utils.ParsingUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("#B+sWd1Lvd^L08>#", (byte)0, false);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.addPaxHeader((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((Map<String, String>) null, (byte[]) null, zipEncoding0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Invalid byte ");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[5];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[0];
      linkOptionArray0[3] = linkOptionArray0[1];
      linkOptionArray0[4] = linkOptionArray0[3];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0, "Invalid byte ", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      MockFile mockFile0 = new MockFile("z}(/", "CAjL[cW*I");
      Path path0 = mockFile0.toPath();
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((String) null, (byte)7, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((String) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      File file0 = MockFile.createTempFile("offset must not be negative", " \u0000");
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(file0, "offset must not be negative");
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("*K7$H%u*)vd4rX/");
      boolean boolean0 = tarArchiveEntry0.isSparse();
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals("*K7$H%u*)vd4rX/", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("l^hx=qbS}q");
      boolean boolean0 = tarArchiveEntry0.isPaxHeader();
      assertEquals("l^hx=qbS}q", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)114);
      boolean boolean0 = tarArchiveEntry0.isGNUSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)114, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      boolean boolean0 = tarArchiveEntry0.isGlobalPaxHeader();
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      String string0 = "\\u";
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(string0);
      tarArchiveEntry0.isPaxGNUSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("\\u", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("H6P]Eo");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.getModTime();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("<PMvcUr\"WU`xw#6w`kp", (byte) (-44));
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        tarArchiveEntry0.parseTarHeader(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("l^hx=qbS}q");
      tarArchiveEntry0.setUserName("D,g");
      assertEquals("D,g", tarArchiveEntry0.getUserName());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      tarArchiveEntry0.setGroupName("");
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getGroupName());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("?%29<", true);
      long long0 = tarArchiveEntry0.getSize();
      assertEquals(0L, long0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("?%29<", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("J?+[x'4N`h0e/AD", (byte)52);
      tarArchiveEntry0.setUserId(2097151L);
      assertEquals(2097151, tarArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("jJG+L<z", (byte)4, false);
      tarArchiveEntry0.setGroupId(1L);
      assertEquals(1, tarArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("<PMvcUr\"WU`xw#6w`kp", (byte) (-44));
      tarArchiveEntry0.setGroupId((int) (byte) (-44));
      int int0 = tarArchiveEntry0.getGroupId();
      assertEquals((-44L), tarArchiveEntry0.getLongGroupId());
      assertEquals((-44), int0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      String string0 = "\\u";
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(string0);
      tarArchiveEntry0.isStarSparse();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("\\u", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("<PMvcUr\"WU`xw#6w`kp", (byte) (-44));
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.updateEntryFromPaxHeaders(map0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getLinkName());
      assertEquals((byte) (-44), tarArchiveEntry0.getLinkFlag());
      assertEquals("<PMvcUr\"WU`xw#6w`kp", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("(M !", (byte) (-117));
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setSize((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size is out of range: -1
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("(M !", (byte) (-117));
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDevMinor((-4353));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minor device number is out of range: -4353
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/}", true);
      tarArchiveEntry0.setDevMinor(40);
      assertEquals(40, tarArchiveEntry0.getDevMinor());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("<+]+uyWv-5;I]3=M", (byte) (-95));
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDevMajor((byte) (-95));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Major device number is out of range: -95
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDataOffset((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The offset can not be smaller than 0
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      String string0 = "\\u";
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(string0);
      tarArchiveEntry0.setDataOffset((byte)0);
      assertEquals(0L, tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("", "");
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(mockFile0, "");
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"accessUserInformation\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // sun.nio.fs.UnixFileAttributeViews$Posix.checkReadExtended(UnixFileAttributeViews.java:148)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:214)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:131)
             // sun.nio.fs.UnixFileSystemProvider.readAttributes(UnixFileSystemProvider.java:144)
             // java.nio.file.Files.readAttributes(Files.java:1737)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.readOsSpecificProperties(TarArchiveEntry.java:1675)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:506)
             // sun.reflect.GeneratedConstructorAccessor72.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("", "");
          Path path0 = mockFile0.toPath();
          LinkOption[] linkOptionArray0 = new LinkOption[5];
          LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
          linkOptionArray0[0] = linkOption0;
          linkOptionArray0[1] = linkOptionArray0[0];
          linkOptionArray0[2] = linkOption0;
          linkOptionArray0[3] = linkOption0;
          linkOptionArray0[4] = linkOptionArray0[2];
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(path0, "GNU.sparse.name", linkOptionArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"accessUserInformation\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // sun.nio.fs.UnixFileAttributeViews$Posix.checkReadExtended(UnixFileAttributeViews.java:148)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:214)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:131)
             // sun.nio.fs.UnixFileSystemProvider.readAttributes(UnixFileSystemProvider.java:144)
             // java.nio.file.Files.readAttributes(Files.java:1737)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.readOsSpecificProperties(TarArchiveEntry.java:1675)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:587)
             // sun.reflect.GeneratedConstructorAccessor71.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("EljJue#|yH4}DJ", (byte)42);
      boolean boolean0 = tarArchiveEntry0.isSymbolicLink();
      assertEquals("EljJue#|yH4}DJ", tarArchiveEntry0.getName());
      assertEquals((byte)42, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      boolean boolean0 = tarArchiveEntry0.isLink();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("W0 -", (byte)120, false);
      boolean boolean0 = tarArchiveEntry0.isGNULongNameEntry();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("W0 -", tarArchiveEntry0.getName());
      assertEquals((byte)120, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("9w8Z5mb[?JmZ1obxp[H");
      boolean boolean0 = tarArchiveEntry0.isGNULongLinkEntry();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("9w8Z5mb[?JmZ1obxp[H", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("z}(/");
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals("z}(/", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("0L+0h#}T@", (byte)0);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("0L+0h#}T@", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = "\\u";
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(string0);
      boolean boolean0 = tarArchiveEntry0.isFIFO();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals("\\u", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      boolean boolean0 = tarArchiveEntry0.isCharacterDevice();
      assertFalse(boolean0);
      assertEquals("numbytes must not be negative", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)25, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = "\\u";
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(string0);
      boolean boolean0 = tarArchiveEntry0.isBlockDevice();
      assertEquals("\\u", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("<PMvcUr\"WU`xw#6w`kp", (byte) (-44));
      tarArchiveEntry0.getOrderedSparseHeaders();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte) (-44), tarArchiveEntry0.getLinkFlag());
      assertEquals("<PMvcUr\"WU`xw#6w`kp", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("(M !", (byte) (-117));
      tarArchiveEntry0.getFile();
      assertEquals("(M !", tarArchiveEntry0.getName());
      assertEquals((byte) (-117), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = "\\u";
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(string0);
      tarArchiveEntry0.getDirectoryEntries();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("\\u", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/}", true);
      TarArchiveEntry tarArchiveEntry1 = new TarArchiveEntry("/}", (byte)114, false);
      boolean boolean0 = tarArchiveEntry0.equals(tarArchiveEntry1);
      assertEquals((byte)114, tarArchiveEntry1.getLinkFlag());
      assertEquals("}", tarArchiveEntry1.getName());
      assertEquals(33188, tarArchiveEntry1.getMode());
      assertFalse(boolean0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/}", true);
      boolean boolean0 = tarArchiveEntry0.equals(tarArchiveEntry0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("/}", tarArchiveEntry0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      Instant instant0 = MockInstant.ofEpochSecond(1L);
      tarArchiveEntry0.equals((Object) instant0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)25, tarArchiveEntry0.getLinkFlag());
      assertEquals("numbytes must not be negative", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      boolean boolean0 = tarArchiveEntry0.equals((Object) null);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0, "", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("(", "W%");
          MockFile.createTempFile("-5drQ5Fqh`Rlw", "/numbytes must not be negative", (File) mockFile0);
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(mockFile0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"accessUserInformation\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // sun.nio.fs.UnixFileAttributeViews$Posix.checkReadExtended(UnixFileAttributeViews.java:148)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:214)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:131)
             // sun.nio.fs.UnixFileSystemProvider.readAttributes(UnixFileSystemProvider.java:144)
             // java.nio.file.Files.readAttributes(Files.java:1737)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.readOsSpecificProperties(TarArchiveEntry.java:1675)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:506)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:474)
             // sun.reflect.GeneratedConstructorAccessor65.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.getExtraPaxHeaders();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      tarArchiveEntry0.setModTime(1L);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("numbytes must not be negative", tarArchiveEntry0.getName());
      assertEquals((byte)25, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.setCreationTime((FileTime) null);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      tarArchiveEntry0.getExtraPaxHeader("numbytes must not be negative");
      assertEquals((byte)25, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("numbytes must not be negative", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(0L, long0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("9w8Z5mb[?JmZ1obxp[H/", (byte) (-60));
      tarArchiveEntry0.setSparseHeaders((List<TarArchiveStructSparse>) null);
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte) (-60), tarArchiveEntry0.getLinkFlag());
      assertEquals("9w8Z5mb[?JmZ1obxp[H/", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("9w8Z5mb[?JmZ1obxp[H");
      tarArchiveEntry0.setMode((-1701));
      assertEquals((-1701), tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.getCreationTime();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals(0, int0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      tarArchiveEntry0.getLastModifiedTime();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)25, tarArchiveEntry0.getLinkFlag());
      assertEquals("numbytes must not be negative", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, zipEncoding0, true, (byte)49);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = new byte[2];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(hashMap0, byteArray0, (ZipEncoding) null, false, (byte)0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      long long0 = tarArchiveEntry0.getDataOffset();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), long0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("5B|n", (byte)76);
      tarArchiveEntry0.isExtended();
      assertEquals("5B|n", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertTrue(tarArchiveEntry0.isGNULongNameEntry());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/}", true);
      long long0 = tarArchiveEntry0.getLongGroupId();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("/}", tarArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("<PMvcUr\"WU`xw#6w`kp", (byte) (-44));
      int int0 = tarArchiveEntry0.getGroupId();
      assertEquals((byte) (-44), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("<PMvcUr\"WU`xw#6w`kp", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, zipEncoding0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("GcHtlo/CH`]-p}", (byte)85, true);
      boolean boolean0 = tarArchiveEntry0.isDescendent(tarArchiveEntry0);
      assertTrue(boolean0);
      assertEquals((byte)85, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("GcHtlo/CH`]-p}", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.hashCode();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows up.", false);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        tarArchiveEntry0.writeEntryHeader(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.getSparseHeaders();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/}", true);
      tarArchiveEntry0.getLastAccessTime();
      assertEquals("/}", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/}", true);
      tarArchiveEntry0.getStatusChangeTime();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("/}", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.setLastAccessTime((FileTime) null);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Major device number is out of range: ");
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      FileTime fileTime0 = FileTime.from((long) 33188, timeUnit0);
      tarArchiveEntry0.setModTime(fileTime0);
      assertEquals("Major device number is out of range: ", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/}", true);
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      FileTime fileTime0 = FileTime.from(3176L, timeUnit0);
      tarArchiveEntry0.setStatusChangeTime(fileTime0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("/}", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("EljJue#|yH4}DJ", (byte)42);
      String string0 = tarArchiveEntry0.getGroupName();
      assertEquals("", string0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("EljJue#|yH4}DJ", tarArchiveEntry0.getName());
      assertEquals((byte)42, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      int int0 = tarArchiveEntry0.getDevMinor();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(0, int0);
      assertEquals((byte)25, tarArchiveEntry0.getLinkFlag());
      assertEquals("numbytes must not be negative", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.isPaxGNU1XSparse();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, zipEncoding0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("C", (byte)31, false);
      MockDate mockDate0 = new MockDate(14, 0, 85);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setModTime((Date) mockDate0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("u'IC(_DBdg7{");
      String string0 = tarArchiveEntry0.getLinkName();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("u'IC(_DBdg7{", tarArchiveEntry0.getName());
      assertEquals("", string0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("9w8Z5mb[?JmZ1obxp[H");
      byte byte0 = tarArchiveEntry0.getLinkFlag();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, byte0);
      assertEquals("9w8Z5mb[?JmZ1obxp[H", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.clearExtraPaxHeaders();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = "\\u";
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(string0);
      tarArchiveEntry0.getPath();
      assertEquals("\\u", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("-r5<0$+/9YX7D07", (byte)63, false);
      tarArchiveEntry0.isCheckSumOK();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("-r5<0$+/9YX7D07", tarArchiveEntry0.getName());
      assertEquals((byte)63, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("EljJue#|yH4}DJ", (byte)42);
      FileTime fileTime0 = FileTime.fromMillis(0L);
      tarArchiveEntry0.setLastModifiedTime(fileTime0);
      assertEquals((byte)42, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("EljJue#|yH4}DJ", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("numbytes must not be negative", (byte)25);
      int int0 = tarArchiveEntry0.getDevMajor();
      assertEquals(0, int0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("numbytes must not be negative", tarArchiveEntry0.getName());
      assertEquals((byte)25, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("EljJue#|yH4}DJ", (byte)42);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.getLastModifiedDate();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("{Rm2RVUC]X", "/e");
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(mockFile0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"accessUserInformation\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // sun.nio.fs.UnixFileAttributeViews$Posix.checkReadExtended(UnixFileAttributeViews.java:148)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:214)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:131)
             // sun.nio.fs.UnixFileSystemProvider.readAttributes(UnixFileSystemProvider.java:144)
             // java.nio.file.Files.readAttributes(Files.java:1737)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.readOsSpecificProperties(TarArchiveEntry.java:1675)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:506)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:474)
             // sun.reflect.GeneratedConstructorAccessor65.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("0L+0h#}T@", (byte)0);
      tarArchiveEntry0.setName("pm");
      assertEquals("pm", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("9w8Z5mb[?JmZ1obxp[H");
      tarArchiveEntry0.setLinkName("9w8Z5mb[?JmZ1obxp[H");
      assertEquals("9w8Z5mb[?JmZ1obxp[H", tarArchiveEntry0.getLinkName());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("9w8Z5mb[?JmZ1obxp[H");
      tarArchiveEntry0.setNames("9w8Z5mb[?JmZ1obxp[H", "9w8Z5mb[?JmZ1obxp[H");
      assertEquals("9w8Z5mb[?JmZ1obxp[H", tarArchiveEntry0.getUserName());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("(M !", (byte) (-117));
      tarArchiveEntry0.isDirectory();
      assertFalse(tarArchiveEntry0.isGlobalPaxHeader());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("(M !", tarArchiveEntry0.getName());
      assertEquals((byte) (-117), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(tarArchiveEntry0.isPaxHeader());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("(M !", (byte) (-117));
      tarArchiveEntry0.setIds((byte) (-117), (byte) (-117));
      assertEquals((-117L), tarArchiveEntry0.getLongGroupId());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/}", true);
      int int0 = tarArchiveEntry0.getMode();
      assertEquals("/}", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, int0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)24);
      byte[] byteArray0 = new byte[2];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tarArchiveEntry0.parseTarHeader(byteArray0, zipEncoding0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("(M !", (byte) (-117));
      long long0 = tarArchiveEntry0.getRealSize();
      assertEquals(0L, long0);
      assertEquals((byte) (-117), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("(M !", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("EljJue#|yH4}DJ", (byte)42);
      String string0 = tarArchiveEntry0.getUserName();
      assertEquals("EljJue#|yH4}DJ", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)42, tarArchiveEntry0.getLinkFlag());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("9w8Z5mb[?JmZ1obxp[H/", (byte) (-60));
      tarArchiveEntry0.isStreamContiguous();
      assertEquals((byte) (-60), tarArchiveEntry0.getLinkFlag());
      assertEquals("9w8Z5mb[?JmZ1obxp[H/", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }
}
