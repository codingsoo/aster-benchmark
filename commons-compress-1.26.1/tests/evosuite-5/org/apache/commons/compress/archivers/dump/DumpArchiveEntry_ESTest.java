
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


package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Set;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DumpArchiveEntry_ESTest extends DumpArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = dumpArchiveEntry0.getType();
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry("F5^/R jT4<Q", "", 290, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
      assertFalse(boolean0);
      assertEquals("F5^/R jT4<Q", dumpArchiveEntry1.toString());
      assertEquals("", dumpArchiveEntry1.getSimpleName());
      assertEquals(0L, dumpArchiveEntry1.getOffset());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(2);
      assertEquals(DumpArchiveEntry.TYPE.CHRDEV, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      byte[] byteArray0 = new byte[25];
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.update(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 160
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("ADDR", "ADDR", (-835), dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setName("");
      dumpArchiveEntry0.toString();
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      dumpArchiveEntry0.setDeleted(true);
      boolean boolean0 = dumpArchiveEntry0.isDeleted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
      dumpArchiveEntry0.setVolume(10);
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("Yg4 \"iGFj11oj|=eQ:", "wY?Ej,9ZB(]oI`GuxB", (-2452), dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setVolume((-2452));
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals((-2452), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "Zip slip '%s' + '%s' -> '%s'");
      dumpArchiveEntry0.setUserId((-1241));
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals((-1241), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setSize(242L);
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals(242L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("`J5mo~*", "END", 2237, dumpArchiveEntry_TYPE0);
      String string0 = dumpArchiveEntry0.getSimpleName();
      assertEquals("END", string0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("`J5mo~*", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("SOCKET", "");
      String string0 = dumpArchiveEntry0.getSimpleName();
      assertEquals("SOCKET", dumpArchiveEntry0.toString());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getOriginalName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      dumpArchiveEntry0.getOriginalName();
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
      dumpArchiveEntry0.setOffset(10);
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals(10L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
      dumpArchiveEntry0.setOffset((-35L));
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals((-35L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("0eZUokP.kE/>", "BITS", 2, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setNlink(60011);
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals(60011, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      dumpArchiveEntry0.setNlink((-10));
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals((-10), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      String string0 = dumpArchiveEntry0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "Zip slip '%s' + '%s' -> '%s'");
      dumpArchiveEntry0.setMode(1617);
      int int0 = dumpArchiveEntry0.getMode();
      assertEquals(1617, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("W8=d,X", "W8=d,X");
      dumpArchiveEntry0.setGroupId((byte)40);
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("W8=d,X", "W8=d,X");
      dumpArchiveEntry0.setGroupId((-9));
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals((-9), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=>]JG3=@>/doT<CHm", (String) null);
      dumpArchiveEntry0.setGeneration(1351);
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals(1351, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("DIRECTORY", "$!g4IQT|~;G", 1525, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setGeneration((-1417));
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals((-1417), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("`J5mo~*", "END", 2237, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setSize(2211L);
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals(2211L, dumpArchiveEntry0.getSize());
      assertEquals(2211L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setSize((-873L));
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals((-873L), dumpArchiveEntry0.getSize());
      assertEquals((-873L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.update((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("3t#b\"x]", "h=IK ox4NH", 0, dumpArchiveEntry_TYPE0);
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.setLastModifiedDate((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "4BKm_Tk#S]d%c4c", 0, dumpArchiveEntry_TYPE0);
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.setCreationTime((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.setAccessTime((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        DumpArchiveEntry.parse((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("TTb*qU[H<VTHRob", "SETUID");
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.isSparseRecord(692);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 692
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "4BKm_Tk#S]d%c4c", 0, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setName("");
      assertEquals("/", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("4BKm_Tk#S]d%c4c", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isDirectory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("jc2", "jc2");
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isDirectory();
      assertEquals("jc2", dumpArchiveEntry0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(512);
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCdata(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      dumpArchiveEntry_TapeSegmentHeader0.getType();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("h~W-?Uec@,m(4A", "TAPE", 2717, dumpArchiveEntry_TYPE0);
      String string0 = dumpArchiveEntry0.getName();
      assertEquals("TAPE", dumpArchiveEntry0.getSimpleName());
      assertEquals("h~W-?Uec@,m(4A", string0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getHoles();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      dumpArchiveEntry0.setName("./lRSsrCP1iTOa&4X/");
      assertEquals("lRSsrCP1iTOa&4X/", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("/", "/", 892, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setName("/");
      assertEquals((-1L), dumpArchiveEntry0.getSize());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("/", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setName((String) null);
      assertFalse(dumpArchiveEntry0.isSocket());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("BITS", "BITS", 0, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isSocket();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("BITS", dumpArchiveEntry0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      boolean boolean0 = dumpArchiveEntry0.isSocket();
      assertFalse(boolean0);
      assertEquals("", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 914, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFile();
      assertEquals("", dumpArchiveEntry0.toString());
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      boolean boolean0 = dumpArchiveEntry0.isFile();
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.getSimpleName());
      assertFalse(boolean0);
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("dDx7nkq)?~", ",Gd", 10, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFifo();
      assertEquals(",Gd", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertTrue(boolean0);
      assertEquals("dDx7nkq)?~", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=>]JG3=@>/doT<CHm", (String) null);
      boolean boolean0 = dumpArchiveEntry0.isFifo();
      assertFalse(boolean0);
      assertEquals("2=>]JG3=@>/doT<CHm", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=>]JG3=@>/doT<CHm", (String) null);
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isChrDev();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "Zip&slip '%s' + '%s' -> '%@'");
      boolean boolean0 = dumpArchiveEntry0.isChrDev();
      assertFalse(boolean0);
      assertEquals("Zip&slip '%s' + '%s' -> '%@'", dumpArchiveEntry0.getSimpleName());
      assertEquals("", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("GROUP_WRITE", "h~", 7, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isBlkDev();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertTrue(boolean0);
      assertEquals("h~", dumpArchiveEntry0.getSimpleName());
      assertEquals("GROUP_WRITE", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("I0+fc0&r", "");
      boolean boolean0 = dumpArchiveEntry0.isBlkDev();
      assertEquals("", dumpArchiveEntry0.getSimpleName());
      assertEquals("I0+fc0&r", dumpArchiveEntry0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("I0+fc0&r", "");
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getSize();
      assertTrue(dumpArchiveEntry0.isDirectory());
      assertEquals("I0+fc0&r", dumpArchiveEntry0.toString());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals(0L, long0);
      assertEquals("", dumpArchiveEntry0.getName());
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry0.getName());
      assertTrue(boolean0);
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "org.apache.commons.compress.archivers.dump.DumpArchiveSummary", (-1568), dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.getSimpleName());
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry1.getSimpleName());
      assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals(0L, dumpArchiveEntry1.getOffset());
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      boolean boolean0 = dumpArchiveEntry0.equals((Object) null);
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry0);
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.getSimpleName());
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "Zip&slip '%s' + '%s' -> '%@'");
      boolean boolean0 = dumpArchiveEntry0.equals("Zip&slip '%s' + '%s' -> '%@'");
      assertFalse(boolean0);
      assertEquals("", dumpArchiveEntry0.getName());
      assertEquals("Zip&slip '%s' + '%s' -> '%@'", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(12);
      assertEquals(DumpArchiveEntry.TYPE.SOCKET, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      dumpArchiveEntry_TapeSegmentHeader0.setIno((-1241));
      assertEquals((-1241), dumpArchiveEntry_TapeSegmentHeader0.getIno());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "Zip&slip '%s' + '%s' -> '%@'");
      boolean boolean0 = dumpArchiveEntry0.isSparseRecord(0);
      assertEquals("Zip&slip '%s' + '%s' -> '%@'", dumpArchiveEntry0.getSimpleName());
      assertTrue(boolean0);
      assertEquals("", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getVolume();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
      Date date0 = dumpArchiveEntry0.getCreationTime();
      dumpArchiveEntry0.setCreationTime(date0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertEquals("", dumpArchiveEntry0.getName());
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      dumpArchiveEntry0.getHeaderType();
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry0.getName());
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      int int0 = dumpArchiveEntry0.getHeaderCount();
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.getSimpleName());
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=>]JG3=@>/doT<CHm", (String) null);
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals(0, int0);
      assertEquals("2=>]JG3=@>/doT<CHm", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals(0L, long0);
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.getSimpleName());
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      dumpArchiveEntry0.hashCode();
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry0.getName());
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("Yg4 \"iGFj-1oS|*e4:", "wY?Ej,9ZB(]oI`GuxB", (-2452), dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals("wY?Ej,9ZB(]oI`GuxB", dumpArchiveEntry0.getSimpleName());
      assertEquals("Yg4 \"iGFj-1oS|*e4:/", dumpArchiveEntry0.toString());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.WHITEOUT;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("9eE W$[CDiy+O!^n", "0(", (-4238), dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals(0, int0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("9eE W$[CDiy+O!^n", dumpArchiveEntry0.getName());
      assertEquals("0(", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      Date date0 = dumpArchiveEntry0.getLastModifiedDate();
      dumpArchiveEntry0.setAccessTime(date0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=>]JG3=@>/doT<CHm", (String) null);
      String string0 = dumpArchiveEntry0.getSimpleName();
      assertNull(string0);
      assertEquals("2=>]JG3=@>/doT<CHm", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "Zip&slip '%s' + '%s' -> '%@'");
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals(0, int0);
      assertEquals("Zip&slip '%s' + '%s' -> '%@'", dumpArchiveEntry0.getSimpleName());
      assertEquals("", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("dDx7nkq)?~", ",Gd", 10, dumpArchiveEntry_TYPE0);
      Date date0 = dumpArchiveEntry0.getAccessTime();
      assertEquals("dDx7nkq)?~", dumpArchiveEntry0.toString());
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertEquals(",Gd", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
      dumpArchiveEntry0.setUserId(10);
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      int int0 = dumpArchiveEntry0.getHeaderHoles();
      assertEquals(0, int0);
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.getSimpleName());
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveSummary", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("Yg4 \"iGFj-1oS|*e4:", "wY?Ej,9ZB(]oI`GuxB", (-2452), dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getMode();
      assertEquals(0, int0);
      assertEquals("Yg4 \"iGFj-1oS|*e4:/", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("wY?Ej,9ZB(]oI`GuxB", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("2=>]JG3=@>/doT<CHm", (String) null);
      String string0 = dumpArchiveEntry0.toString();
      assertNotNull(string0);
      assertEquals("2=>]JG3=@>/doT<CHm", string0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
      int int0 = dumpArchiveEntry0.getIno();
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE", dumpArchiveEntry0.getSimpleName());
      assertEquals("", dumpArchiveEntry0.getName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("dDx7nkq)?~", ",Gd", 10, dumpArchiveEntry_TYPE0);
      assertEquals(",Gd", dumpArchiveEntry0.getSimpleName());
      
      dumpArchiveEntry0.setSimpleName("MHerY/?YjXJ~C1;f");
      assertEquals("dDx7nkq)?~", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("dDx7nkq)?~", ",Gd", 10, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.isDeleted();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals(",Gd", dumpArchiveEntry0.getSimpleName());
      assertEquals("dDx7nkq)?~", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      // Undeclared exception!
      try { 
        DumpArchiveEntry.parse(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.WHITEOUT;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("9eE W$[CDiy+O!^n", "0(", (-4238), dumpArchiveEntry_TYPE0);
      Date date0 = dumpArchiveEntry0.getCreationTime();
      dumpArchiveEntry0.setLastModifiedDate(date0);
      assertEquals("0(", dumpArchiveEntry0.getSimpleName());
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("9eE W$[CDiy+O!^n", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("BITS", "BITS", 0, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getPermissions();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("BITS", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(">1T68dBN'~", ">1T68dBN'~");
      dumpArchiveEntry0.getOriginalName();
      assertEquals(">1T68dBN'~", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals(0L, long0);
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE", dumpArchiveEntry0.getSimpleName());
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals(0, int0);
      assertEquals("", dumpArchiveEntry0.toString());
  }
}
