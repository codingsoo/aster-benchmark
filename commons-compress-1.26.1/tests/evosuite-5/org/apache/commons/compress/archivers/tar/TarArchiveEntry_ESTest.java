
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TarArchiveEntry_ESTest extends TarArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("z");
      tarArchiveEntry0.setSize(711L);
      assertEquals(711L, tarArchiveEntry0.getRealSize());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("atime", (byte)0, true);
      tarArchiveEntry0.setDevMinor((byte)0);
      assertEquals("atime", tarArchiveEntry0.getName());
      assertEquals(0, tarArchiveEntry0.getDevMinor());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("' len=");
      tarArchiveEntry0.setDevMajor(0);
      assertEquals(0, tarArchiveEntry0.getDevMajor());
      assertEquals("' len=", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)124, false);
      tarArchiveEntry0.setDataOffset(255L);
      assertEquals(255L, tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile((String) null, "/");
          Path path0 = mockFile0.toPath();
          LinkOption[] linkOptionArray0 = new LinkOption[1];
          LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
          linkOptionArray0[0] = linkOption0;
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(path0, "Corrupted PAX header. Time field value is invalid '", linkOptionArray0);
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
             // sun.reflect.GeneratedConstructorAccessor76.newInstance(Unknown Source)
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
  public void test005()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("c:", (byte)90, false);
      boolean boolean0 = tarArchiveEntry0.isLink();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)90, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals("c:", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)124, false);
      boolean boolean0 = tarArchiveEntry0.isDirectory();
      assertFalse(boolean0);
      assertEquals((byte)124, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("tf/%<", (byte)57);
      boolean boolean0 = tarArchiveEntry0.isCharacterDevice();
      assertFalse(boolean0);
      assertEquals("tf/%<", tarArchiveEntry0.getName());
      assertEquals((byte)57, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)124, false);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      tarArchiveEntry0.fillStarSparseData(hashMap0);
      boolean boolean0 = tarArchiveEntry0.isStarSparse();
      assertTrue(tarArchiveEntry0.isSparse());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils", true);
      TarArchiveEntry tarArchiveEntry1 = new TarArchiveEntry("oSV!O`$W#E(%(u9.", (byte) (-6));
      boolean boolean0 = tarArchiveEntry0.isDescendent(tarArchiveEntry1);
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry1.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((byte) (-6), tarArchiveEntry1.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("_MYK/.Zn brcG7Ep;)");
      tarArchiveEntry0.setUserName("_MYK/.Zn brcG7Ep;)");
      tarArchiveEntry0.getUserName();
      assertEquals("_MYK/.Zn brcG7Ep;)", tarArchiveEntry0.getUserName());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), false);
      tarArchiveEntry0.setUserId(10);
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals(10L, tarArchiveEntry0.getLongUserId());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), false);
      tarArchiveEntry0.setUserId((int) (byte) (-11));
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals((-11L), tarArchiveEntry0.getLongUserId());
      assertEquals((-11), int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("oSV!O`$W#E(%(u9./");
      String string0 = tarArchiveEntry0.getName();
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals("oSV!O`$W#E(%(u9./", string0);
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), false);
      tarArchiveEntry0.setMode((byte) (-11));
      int int0 = tarArchiveEntry0.getMode();
      assertEquals((-11), int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      tarArchiveEntry0.setUserId(10);
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals(10, tarArchiveEntry0.getUserId());
      assertEquals(10L, long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), false);
      tarArchiveEntry0.setUserId((int) (byte) (-11));
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals((-11L), long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils");
      assertEquals("", tarArchiveEntry0.getLinkName());
      
      tarArchiveEntry0.setLinkName("ustar ");
      String string0 = tarArchiveEntry0.getLinkName();
      assertEquals("ustar ", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.setGroupName("2014-02-14T20:21:21.32Z");
      tarArchiveEntry0.getGroupName();
      assertEquals("2014-02-14T20:21:21.32Z", tarArchiveEntry0.getGroupName());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)70);
      byte[] byteArray0 = new byte[7];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tarArchiveEntry0.writeEntryHeader(byteArray0, zipEncoding0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)0);
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
  public void test021()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("jI", (byte)0, true);
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
  public void test022()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("G[[H(a'HSI#Ul'z", false);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.fillStarSparseData((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("F~ro7@(}|'l2", (byte)60, false);
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
  public void test024()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("xp5:$X@~^,W4cf(8~/");
      Map<String, String> map0 = tarArchiveEntry0.getExtraPaxHeaders();
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
  public void test025()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = new byte[4];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(hashMap0, byteArray0, zipEncoding0, false);
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
      MockFile mockFile0 = new MockFile("LIBARCHIVE.creationtime", "LIBARCHIVE.creationtime");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[7];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[1];
      linkOptionArray0[3] = linkOptionArray0[0];
      linkOptionArray0[4] = linkOptionArray0[0];
      linkOptionArray0[5] = linkOptionArray0[0];
      linkOptionArray0[6] = linkOption0;
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0, "SCHILY.archtype", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Time must not be null");
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
        tarArchiveEntry0 = new TarArchiveEntry((String) null, (byte) (-125), false);
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
        tarArchiveEntry0 = new TarArchiveEntry((String) null, (byte) (-4));
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
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((File) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
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
  public void test034()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      boolean boolean0 = tarArchiveEntry0.isSparse();
      assertFalse(boolean0);
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" will not fit in octal number buffer of length ", (byte)89);
      boolean boolean0 = tarArchiveEntry0.isPaxHeader();
      assertEquals(" will not fit in octal number buffer of length ", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)89, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" must be at least 2", (byte)88);
      boolean boolean0 = tarArchiveEntry0.isOldGNUSparse();
      assertEquals((byte)88, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(" must be at least 2", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("!V$?8}#~N;<", false);
      boolean boolean0 = tarArchiveEntry0.isGNUSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("!V$?8}#~N;<", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      boolean boolean0 = tarArchiveEntry0.isGNUSparse();
      assertTrue(tarArchiveEntry0.isPaxGNUSparse());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      boolean boolean0 = tarArchiveEntry0.isGlobalPaxHeader();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.isPaxGNUSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Corrupted TAR archive. Dev-Minor is negative");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.parseTarHeader((byte[]) null);
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
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" byte field.");
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      FileTime fileTime0 = FileTime.from((long) 31, timeUnit0);
      tarArchiveEntry0.setLastModifiedTime(fileTime0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(" byte field.", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" must be at least 2", (byte)88);
      long long0 = tarArchiveEntry0.getSize();
      assertEquals(0L, long0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" must be at least 2", tarArchiveEntry0.getName());
      assertTrue(tarArchiveEntry0.isPaxHeader());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)124, false);
      tarArchiveEntry0.isStarSparse();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)124, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)70);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.updateEntryFromPaxHeaders(map0);
      assertEquals((byte)70, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("+#|&p%~%089yLC", (byte)85);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setSize((-593L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size is out of range: -593
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("w,uVG<@0iy;R[oL!$z", (byte)0);
      tarArchiveEntry0.setSize((byte)0);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("w,uVG<@0iy;R[oL!$z", tarArchiveEntry0.getName());
      assertEquals(0L, tarArchiveEntry0.getSize());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDevMinor((-4031));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minor device number is out of range: -4031
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ustar\u0000", (byte)0, true);
      tarArchiveEntry0.setDevMinor(77);
      int int0 = tarArchiveEntry0.getDevMinor();
      assertEquals(77, int0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils", true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDevMajor((-939));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Major device number is out of range: -939
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils", true);
      tarArchiveEntry0.setDevMajor(2656);
      assertEquals(2656, tarArchiveEntry0.getDevMajor());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" \u0000");
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
  public void test053()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("*uReyg!khk50q0S0", (byte)0, true);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      
      tarArchiveEntry0.setDataOffset((byte)0);
      assertEquals(0L, tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("");
          MockFile mockFile1 = new MockFile(mockFile0, "");
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(mockFile1);
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
             // sun.reflect.GeneratedConstructorAccessor74.newInstance(Unknown Source)
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
  public void test055()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Corrupted TAR archive. Dev-Minor is negative", (byte) (-126), true);
      tarArchiveEntry0.addPaxHeader("uname", "!5bK6~/6?");
      assertEquals("!5bK6~/6?", tarArchiveEntry0.getUserName());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" \u0000");
      boolean boolean0 = tarArchiveEntry0.isSymbolicLink();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals(" \u0000", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      boolean boolean0 = tarArchiveEntry0.isLink();
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      boolean boolean0 = tarArchiveEntry0.isGNULongNameEntry();
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("!V$?8}#~N;<", false);
      boolean boolean0 = tarArchiveEntry0.isGNULongLinkEntry();
      assertEquals("!V$?8}#~N;<", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("xp5:$X@~^,W4cf(8~/");
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals("xp5:$X@~^,W4cf(8~/", tarArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils", true);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("org.apache.commons.compress.utils.IOUtils", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RjE/0*ibM-;e", (byte)0);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("RjE/0*ibM-;e", tarArchiveEntry0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ob^", (byte) (-102), true);
      boolean boolean0 = tarArchiveEntry0.isFIFO();
      assertEquals("ob^", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte) (-102), tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("oSV!O`$W#E(%(u9./", true);
      boolean boolean0 = tarArchiveEntry0.isDirectory();
      assertEquals("oSV!O`$W#E(%(u9./", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertTrue(boolean0);
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils");
      boolean boolean0 = tarArchiveEntry0.isDirectory();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(tarArchiveEntry0.isGlobalPaxHeader());
      assertFalse(tarArchiveEntry0.isPaxHeader());
      assertFalse(boolean0);
      assertEquals("org.apache.commons.compress.utils.IOUtils", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      boolean boolean0 = tarArchiveEntry0.isCharacterDevice();
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), false);
      boolean boolean0 = tarArchiveEntry0.isBlockDevice();
      assertFalse(boolean0);
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("I2", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ob^", (byte) (-102), true);
      assertFalse(tarArchiveEntry0.isGNUSparse());
      
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      long long0 = tarArchiveEntry0.getRealSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      tarArchiveEntry0.getOrderedSparseHeaders();
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("I2", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      tarArchiveEntry0.getFile();
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("I2", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      tarArchiveEntry0.getDirectoryEntries();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.fillStarSparseData(map0);
      boolean boolean0 = tarArchiveEntry0.isSparse();
      assertTrue(tarArchiveEntry0.isStarSparse());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" byte field./", (byte)50);
      boolean boolean0 = tarArchiveEntry0.equals(tarArchiveEntry0);
      assertEquals(" byte field./", tarArchiveEntry0.getName());
      assertEquals((byte)50, tarArchiveEntry0.getLinkFlag());
      assertTrue(boolean0);
      assertEquals(16877, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Corrupted TAR archive. Non-numeric value in sparse headers block", (byte) (-62));
      boolean boolean0 = tarArchiveEntry0.equals((TarArchiveEntry) null);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("Corrupted TAR archive. Non-numeric value in sparse headers block", tarArchiveEntry0.getName());
      assertEquals((byte) (-62), tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
      Object object0 = new Object();
      tarArchiveEntry0.equals(object0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("org.apache.commons.compress.archivers.tar.TarArchiveEntry", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("!V$?8}#~N;<", false);
      tarArchiveEntry0.equals((Object) null);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("!V$?8}#~N;<", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("=lIuc^pW#]qx\"Zxz", (byte)76, false);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("=lIuc^pW#]qx\"Zxz", tarArchiveEntry0.getName());
      assertTrue(tarArchiveEntry0.isGNULongNameEntry());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      File file0 = MockFile.createTempFile("~X{z", "GNU.sparse.size");
      Path path0 = file0.toPath();
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0, "Corrupted TAR archive. Dev-Major is negative", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("");
          Path path0 = mockFile0.toPath();
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(path0);
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
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:565)
             // sun.reflect.GeneratedConstructorAccessor75.newInstance(Unknown Source)
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
  public void test080()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("_8l`\"@]\"Wz'", "_8l`\"@]\"Wz'");
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
             // sun.reflect.GeneratedConstructorAccessor74.newInstance(Unknown Source)
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
  public void test081()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("bufferSize must be bigger than 0", false);
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
  public void test082()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ustar\u0000", (byte)0, true);
      tarArchiveEntry0.setCreationTime((FileTime) null);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("ustar\u0000", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)48, false);
      tarArchiveEntry0.getExtraPaxHeader("");
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ustar\u0000", (byte)0, true);
      tarArchiveEntry0.setSparseHeaders((List<TarArchiveStructSparse>) null);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("ustar\u0000", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      tarArchiveEntry0.getCreationTime();
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, zipEncoding0, true, (byte)0);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(hashMap0, (byte[]) null, (ZipEncoding) null, false, 445L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils", true);
      tarArchiveEntry0.setIds((-113), 1000);
      assertEquals(1000, tarArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
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
  public void test092()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ustar\u0000", (byte)0, true);
      long long0 = tarArchiveEntry0.getDataOffset();
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("ustar\u0000", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      tarArchiveEntry0.isExtended();
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ob^", (byte) (-102), true);
      long long0 = tarArchiveEntry0.getLongGroupId();
      assertEquals("ob^", tarArchiveEntry0.getName());
      assertEquals((byte) (-102), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(0L, long0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      int int0 = tarArchiveEntry0.getGroupId();
      assertEquals(0, int0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals("I2", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, (ZipEncoding) null, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils", true);
      tarArchiveEntry0.isDescendent(tarArchiveEntry0);
      assertEquals("org.apache.commons.compress.utils.IOUtils", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" byte field.");
      tarArchiveEntry0.hashCode();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(" byte field.", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils");
      byte[] byteArray0 = new byte[0];
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
  public void test100()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils", true);
      tarArchiveEntry0.setGroupId(2656);
      assertEquals(2656L, tarArchiveEntry0.getLongGroupId());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ustar\u0000", (byte)0, true);
      tarArchiveEntry0.getSparseHeaders();
      assertEquals("ustar\u0000", tarArchiveEntry0.getName());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("jI", (byte)0, true);
      tarArchiveEntry0.getLastAccessTime();
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("jI", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      tarArchiveEntry0.getStatusChangeTime();
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      FileTime fileTime0 = FileTime.from((long) 33188, timeUnit0);
      tarArchiveEntry0.setLastAccessTime(fileTime0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ustar\u0000", (byte)0, true);
      FileTime fileTime0 = FileTime.fromMillis((-4582L));
      tarArchiveEntry0.setModTime(fileTime0);
      assertEquals("ustar\u0000", tarArchiveEntry0.getName());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils", true);
      FileTime fileTime0 = tarArchiveEntry0.getLastModifiedTime();
      tarArchiveEntry0.setStatusChangeTime(fileTime0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("org.apache.commons.compress.utils.IOUtils", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("oSV!O`$W#E(%(u9./", true);
      String string0 = tarArchiveEntry0.getGroupName();
      assertEquals("oSV!O`$W#E(%(u9./", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", string0);
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ustar\u0000", (byte)0, true);
      int int0 = tarArchiveEntry0.getDevMinor();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(0, int0);
      assertEquals("ustar\u0000", tarArchiveEntry0.getName());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      tarArchiveEntry0.isPaxGNU1XSparse();
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, (ZipEncoding) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setModTime(date0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils");
      String string0 = tarArchiveEntry0.getLinkName();
      assertEquals("", string0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("org.apache.commons.compress.utils.IOUtils", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils");
      byte byte0 = tarArchiveEntry0.getLinkFlag();
      assertEquals((byte)48, byte0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("org.apache.commons.compress.utils.IOUtils", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" \u0000");
      tarArchiveEntry0.clearExtraPaxHeaders();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(" \u0000", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.utils.IOUtils");
      tarArchiveEntry0.getPath();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("org.apache.commons.compress.utils.IOUtils", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" \u0000");
      tarArchiveEntry0.isCheckSumOK();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" \u0000", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("!V$?8}#~N;<", false);
      tarArchiveEntry0.setModTime(0L);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("!V$?8}#~N;<", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ob^", (byte) (-102), true);
      int int0 = tarArchiveEntry0.getDevMajor();
      assertEquals((byte) (-102), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("ob^", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("SCHILY.realsize", false);
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
  public void test120()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      tarArchiveEntry0.setName("I2");
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("I2", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("!V$?8}#~N;<", false);
      tarArchiveEntry0.setGroupId(1641L);
      assertEquals(1641L, tarArchiveEntry0.getLongGroupId());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      tarArchiveEntry0.setNames("Failed to read Paxheader.Value should end with a newline", "I2");
      assertEquals("I2", tarArchiveEntry0.getGroupName());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("I2", (byte) (-11), true);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertTrue(boolean0);
      assertEquals((byte) (-11), tarArchiveEntry0.getLinkFlag());
      assertEquals("I2", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("!V$?8}#~N;<", false);
      tarArchiveEntry0.setUserId((long) 33188);
      assertEquals(33188L, tarArchiveEntry0.getLongUserId());
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("!V$?8}#~N;<", false);
      int int0 = tarArchiveEntry0.getMode();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, int0);
      assertEquals("!V$?8}#~N;<", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("*uReyg!khk50q0S0", (byte)0, true);
      byte[] byteArray0 = new byte[4];
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
  public void test127()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ustar\u0000", (byte)0, true);
      long long0 = tarArchiveEntry0.getRealSize();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(tarArchiveEntry0.isSparse());
      assertEquals(0L, long0);
      assertEquals("ustar\u0000", tarArchiveEntry0.getName());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
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
  public void test129()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" byte field./", (byte)50);
      String string0 = tarArchiveEntry0.getUserName();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertTrue(tarArchiveEntry0.isSymbolicLink());
      assertEquals(" byte field./", tarArchiveEntry0.getName());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("ob^", (byte) (-102), true);
      boolean boolean0 = tarArchiveEntry0.isStreamContiguous();
      assertEquals((byte) (-102), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("ob^", tarArchiveEntry0.getName());
      assertTrue(boolean0);
  }
}
