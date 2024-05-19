
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
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DumpArchiveEntry_ESTest extends DumpArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("&&Hi`=fav*`>,)c", "/S\"Oidx");
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry("$VAL#UES/", "UNKNOWN", 1361, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals("UNKNOWN", dumpArchiveEntry1.getSimpleName());
      assertEquals("&&Hi`=fav*`>,)c", dumpArchiveEntry0.toString());
      assertEquals("/S\"Oidx", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry1.getOffset());
      assertFalse(boolean0);
      assertEquals("$VAL#UES/", dumpArchiveEntry1.getName());
      assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(8);
      assertEquals(DumpArchiveEntry.TYPE.FILE, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCdata(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("bR8qZmr", "./US/", 3515, dumpArchiveEntry_TYPE0);
      byte[] byteArray0 = new byte[22];
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
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[44];
      // Undeclared exception!
      try { 
        DumpArchiveEntry.parse(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 44
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setName("INODE");
      String string0 = dumpArchiveEntry0.toString();
      assertEquals("INODE", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", (-1092), dumpArchiveEntry_TYPE0);
      String string0 = dumpArchiveEntry0.toString();
      assertEquals("", string0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setDeleted(true);
      boolean boolean0 = dumpArchiveEntry0.isDeleted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("USER_EXEC", "$A#ES", 1416, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setVolume(1416);
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals(1416, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("USER_EXEC", "$VAL#UES", 1416, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setVolume((-817));
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals((-817), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setUserId(760);
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals(760, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "END", 0, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setUserId((-756));
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals((-756), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      dumpArchiveEntry0.setSize(1487L);
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals(1487L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("pB]ec3~XTg[_&Tzi", "pB]ec3~XTg[_&Tzi", 3831, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getSimpleName();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("pB]ec3~XTg[_&Tzi", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      dumpArchiveEntry0.getSimpleName();
      assertEquals("", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("oJm?TiIuhDn|A!3|", "BLKDEV");
      dumpArchiveEntry0.getOriginalName();
      assertEquals("oJm?TiIuhDn|A!3|", dumpArchiveEntry0.toString());
      assertEquals("BLKDEV", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      dumpArchiveEntry0.getOriginalName();
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("oJm?TiIuhDn|A!3|", "BLKDEV");
      dumpArchiveEntry0.setOffset(32768);
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals(32768L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setOffset((-15L));
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals((-15L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "", 760, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setNlink(68);
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals(68, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setNlink((-1607));
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals((-1607), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("Yyu}qVDyxr-IG,", "Yyu}qVDyxr-IG,", (-1665), dumpArchiveEntry_TYPE0);
      String string0 = dumpArchiveEntry0.getName();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("Yyu}qVDyxr-IG,", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      String string0 = dumpArchiveEntry0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setGeneration(896);
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals(896, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setGeneration((-378));
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals((-378), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      dumpArchiveEntry0.setSize(1487L);
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals(1487L, dumpArchiveEntry0.getSize());
      assertEquals(1487L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
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
  public void test28()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
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
  public void test29()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("LINK", "$VALUES");
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
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.isSparseRecord(894);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 894
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setName("./");
      assertEquals("", dumpArchiveEntry0.getName());
      assertFalse(dumpArchiveEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(";^J(m[|EK]y>B'", "I&^^}/IX,8f44", 23, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setName(";^J(m[|EK]y>B'");
      assertEquals(";^J(m[|EK]y>B'/", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("I&^^}/IX,8f44", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setName((String) null);
      assertEquals(0, dumpArchiveEntry0.getHeaderCount());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("5?u19>&yQ}9", "DIRECTORY");
      boolean boolean0 = dumpArchiveEntry0.isDirectory();
      assertEquals("DIRECTORY", dumpArchiveEntry0.getSimpleName());
      assertEquals("5?u19>&yQ}9", dumpArchiveEntry0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "6-c+}/5~Dn^|b>@", 0, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isDirectory();
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(1024);
      assertEquals(1, set0.size());
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
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getHoles();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("/", "v*!WR ?F',>R4ay'`", 1651, dumpArchiveEntry_TYPE0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals((-1L), dumpArchiveEntry0.getSize());
      assertEquals("/", dumpArchiveEntry0.toString());
      assertEquals("v*!WR ?F',>R4ay'`", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", (-3999), dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isSocket();
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("Yyu}qVDyxr-IG,", "Yyu}qVDyxr-IG,", (-1665), dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isSocket();
      assertFalse(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("Yyu}qVDyxr-IG,", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("bR8qZmr", "./US/", 3515, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFile();
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("bR8qZmr", dumpArchiveEntry0.getName());
      assertEquals("./US/", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("USER_EXEC", "$A#ES", 1416, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFile();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("USER_EXEC", dumpArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals("$A#ES", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFifo();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("USER_EXEC", "$A#ES", 1416, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFifo();
      assertFalse(boolean0);
      assertEquals("$A#ES", dumpArchiveEntry0.getSimpleName());
      assertEquals("USER_EXEC", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("USER_EXEC", "$A#ES", 1416, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isChrDev();
      assertEquals("USER_EXEC", dumpArchiveEntry0.toString());
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("$A#ES", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("USER_EXEC", "$VAL#UES", 1416, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isChrDev();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("$VAL#UES", dumpArchiveEntry0.getSimpleName());
      assertFalse(boolean0);
      assertEquals("USER_EXEC/", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isBlkDev();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(";^J(m[|EK]y>B'", "I&^^}/IX,8f44", 23, dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals(";^J(m[|EK]y>B'/", dumpArchiveEntry0.getName());
      assertEquals("I&^^}/IX,8f44", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("Yyu}qVDyxr-IG,", "Yyu}qVDyxr-IG,", (-1665), dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals("Yyu}qVDyxr-IG,", dumpArchiveEntry0.toString());
      assertEquals(0L, long0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("USER_EXEC", "$A#ES", 1416, dumpArchiveEntry_TYPE0);
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals("USER_EXEC", dumpArchiveEntry0.getName());
      assertEquals("$A#ES", dumpArchiveEntry0.getSimpleName());
      assertFalse(boolean0);
      assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./$Y&PJ", "E");
      boolean boolean0 = dumpArchiveEntry0.equals((Object) null);
      assertEquals("E", dumpArchiveEntry0.getSimpleName());
      assertEquals("$Y&PJ", dumpArchiveEntry0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("bR8qZmr", "./US/", 3515, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry0);
      assertEquals("./US/", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertTrue(boolean0);
      assertEquals("bR8qZmr", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./$Y&PJ", "E");
      Object object0 = new Object();
      boolean boolean0 = dumpArchiveEntry0.equals(object0);
      assertEquals("E", dumpArchiveEntry0.getSimpleName());
      assertFalse(boolean0);
      assertEquals("$Y&PJ", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(15);
      assertEquals(DumpArchiveEntry.TYPE.UNKNOWN, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      dumpArchiveEntry_TapeSegmentHeader0.setIno(0);
      assertEquals(0, dumpArchiveEntry_TapeSegmentHeader0.getIno());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("USER_EXEC", "$VAL#UES", 1416, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isSparseRecord(0);
      assertEquals("$VAL#UES", dumpArchiveEntry0.getSimpleName());
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("USER_EXEC/", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getVolume();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      MockDate mockDate0 = new MockDate();
      dumpArchiveEntry0.setCreationTime(mockDate0);
      assertNull(dumpArchiveEntry0.getHeaderType());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "", 760, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getHeaderType();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("USER_EXEC", "$A#ES", 1416, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getHeaderCount();
      assertEquals("$A#ES", dumpArchiveEntry0.getSimpleName());
      assertEquals(0, int0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("USER_EXEC", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("oJm?TiIuhDn|A!3|", "END");
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals("END", dumpArchiveEntry0.getSimpleName());
      assertEquals(0, int0);
      assertEquals("oJm?TiIuhDn|A!3|", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "", 760, dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "", 760, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.hashCode();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("%f:+os~\u0002g@", "%f:+os~\u0002g@", 15, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals("%f:+os~\u0002g@", dumpArchiveEntry0.getName());
      assertEquals(0, int0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("oJm?TiIuhDn|A!3|", "END");
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals("oJm?TiIuhDn|A!3|", dumpArchiveEntry0.toString());
      assertEquals("END", dumpArchiveEntry0.getSimpleName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      Date date0 = dumpArchiveEntry0.getCreationTime();
      dumpArchiveEntry0.setAccessTime(date0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getSimpleName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("oJm?TiIuhDn|A!3|", "END");
      Date date0 = dumpArchiveEntry0.getLastModifiedDate();
      assertEquals("oJm?TiIuhDn|A!3|", dumpArchiveEntry0.getName());
      assertEquals("END", dumpArchiveEntry0.getSimpleName());
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      Date date0 = dumpArchiveEntry0.getAccessTime();
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("oJm?TiIuhDn|A!3|", "END");
      int int0 = dumpArchiveEntry0.getHeaderHoles();
      assertEquals("END", dumpArchiveEntry0.getSimpleName());
      assertEquals("oJm?TiIuhDn|A!3|", dumpArchiveEntry0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setMode((-3241));
      int int0 = dumpArchiveEntry0.getMode();
      assertEquals(855, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setGroupId(1550);
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals(1550, int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("%f:+os~\u0002g@", "%f:+os~\u0002g@", 15, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setSimpleName("org.apache.commons.compress.utils.ByteUtils");
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("%f:+os~\u0002g@", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isDeleted();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("oJm?TiIuhDn|A!3|", "END");
      MockDate mockDate0 = new MockDate(0, (-4206), 0, 0, 2457, 0);
      dumpArchiveEntry0.setLastModifiedDate(mockDate0);
      assertEquals("END", dumpArchiveEntry0.getSimpleName());
      assertEquals("oJm?TiIuhDn|A!3|", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("%f:+os~\u0002g@", "%f:+os~\u0002g@", 15, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getPermissions();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("%f:+os~\u0002g@", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = dumpArchiveEntry0.getType();
      assertEquals(DumpArchiveEntry.TYPE.UNKNOWN, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "", 760, dumpArchiveEntry_TYPE0);
      String string0 = dumpArchiveEntry0.getOriginalName();
      assertNull(string0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "", 760, dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./$Y&PJ", "E");
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals(0, int0);
      assertEquals("E", dumpArchiveEntry0.getSimpleName());
      assertEquals("$Y&PJ", dumpArchiveEntry0.getName());
  }
}
