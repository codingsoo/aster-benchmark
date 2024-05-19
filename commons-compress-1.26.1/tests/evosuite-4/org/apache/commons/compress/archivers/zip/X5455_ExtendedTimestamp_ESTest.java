
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
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class X5455_ExtendedTimestamp_ESTest extends X5455_ExtendedTimestamp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)4);
      x5455_ExtendedTimestamp0.setFlags((byte)27);
      x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate0);
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis(4294967295L);
      x5455_ExtendedTimestamp0.setModifyFileTime(fileTime0);
      Date date0 = x5455_ExtendedTimestamp0.getModifyJavaTime();
      x5455_ExtendedTimestamp0.setAccessJavaTime(date0);
      ZipLong zipLong0 = ZipLong.DD_SIG;
      x5455_ExtendedTimestamp0.setAccessTime(zipLong0);
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte)4;
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, 5, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = new ZipLong((int) (byte)4);
      x5455_ExtendedTimestamp0.setCreateTime(zipLong0);
      x5455_ExtendedTimestamp0.hashCode();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.DD_SIG;
      x5455_ExtendedTimestamp0.setAccessTime(zipLong0);
      x5455_ExtendedTimestamp0.hashCode();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = (X5455_ExtendedTimestamp)x5455_ExtendedTimestamp0.clone();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp1.setAccessTime(zipLong0);
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(x5455_ExtendedTimestamp1);
      assertTrue(x5455_ExtendedTimestamp1.isBit1_accessTimePresent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[8];
      x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray0, 0, 22);
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
      assertFalse(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
      assertFalse(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
      assertFalse(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis(4294967295L);
      x5455_ExtendedTimestamp0.setCreateFileTime(fileTime0);
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)2);
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getCreateFileTime();
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis(4294967295L);
      x5455_ExtendedTimestamp0.setModifyFileTime(fileTime0);
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      FileTime fileTime0 = FileTime.from(3159L, timeUnit0);
      x5455_ExtendedTimestamp0.setModifyFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getModifyTime();
      assertEquals((byte)1, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(2, 2, (byte)2);
      x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.getModifyTime();
      assertEquals((byte)1, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis(4294967295L);
      x5455_ExtendedTimestamp0.setModifyFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getModifyFileTime();
      assertEquals((byte)1, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis(4294967295L);
      x5455_ExtendedTimestamp0.setModifyFileTime(fileTime0);
      byte byte0 = x5455_ExtendedTimestamp0.getFlags();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte) (-128));
      byte byte0 = x5455_ExtendedTimestamp0.getFlags();
      assertEquals((byte) (-128), byte0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)1, 255, (byte)1, 100, 255, (-4102));
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.getCreateTime();
      assertEquals((byte)4, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      x5455_ExtendedTimestamp0.setCreateTime(zipLong0);
      x5455_ExtendedTimestamp0.getCreateTime();
      assertEquals((byte)4, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      FileTime fileTime0 = FileTime.from((long) (byte)4, timeUnit0);
      x5455_ExtendedTimestamp0.setCreateFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getCreateJavaTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      FileTime fileTime0 = FileTime.from(0L, timeUnit0);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getAccessTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Instant instant0 = MockInstant.ofEpochSecond((long) (byte)4);
      FileTime fileTime0 = FileTime.from(instant0);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getAccessTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(2, 2, (byte)2);
      Instant instant0 = mockDate0.toInstant();
      FileTime fileTime0 = FileTime.from(instant0);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getAccessTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis((byte)4);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getAccessJavaTime();
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.AED_SIG;
      x5455_ExtendedTimestamp0.setAccessTime(zipLong0);
      x5455_ExtendedTimestamp0.getAccessFileTime();
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte) (-113));
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only convert non-negative integers between [0,255] to byte: [-113]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((-929), 0, 0, (byte)2, 0, 162);
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // X5455 timestamps must fit in a signed 32 bit integer: -31525019838
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      FileTime fileTime0 = FileTime.from(4036608000000L, timeUnit0);
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.setModifyFileTime(fileTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // X5455 timestamps must fit in a signed 32 bit integer: 14531788800000000
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(3264, (byte)2, (byte)2, (byte)2, 3264);
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // X5455 timestamps must fit in a signed 32 bit integer: 100798331040
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(22, 4283, (byte)2, (-2195), (-2195));
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.setAccessJavaTime(mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // X5455 timestamps must fit in a signed 32 bit integer: 9740478300
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Instant instant0 = MockInstant.ofEpochSecond(4036608000000L);
      FileTime fileTime0 = FileTime.from(instant0);
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // X5455 timestamps must fit in a signed 32 bit integer: 4036608000000
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.parseFromLocalFileData((byte[]) null, 1413, 1413);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[2];
      try { 
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray0, (byte)1, 0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X5455_ExtendedTimestamp too short, only 0 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData((byte[]) null, (byte)1, (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte) (-5));
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.getLocalFileDataData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte) (-127));
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.getCentralDirectoryData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setModifyTime((ZipLong) null);
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
      assertFalse(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setCreateTime((ZipLong) null);
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
      assertFalse(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setAccessTime((ZipLong) null);
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
      assertFalse(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)38);
      x5455_ExtendedTimestamp0.getLocalFileDataLength();
      assertEquals((byte)38, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      x5455_ExtendedTimestamp0.getLocalFileDataLength();
      assertEquals((byte)1, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)2;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)0, 22);
      x5455_ExtendedTimestamp0.getLocalFileDataLength();
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)1, 255, (byte)1, 100, 255, (-4102));
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.getLocalFileDataLength();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)38);
      x5455_ExtendedTimestamp0.getLocalFileDataData();
      assertEquals((byte)38, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      Date date0 = x5455_ExtendedTimestamp0.getModifyJavaTime();
      x5455_ExtendedTimestamp0.setAccessJavaTime(date0);
      x5455_ExtendedTimestamp0.getLocalFileDataData();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      x5455_ExtendedTimestamp0.getLocalFileDataData();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipShort zipShort0 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
      assertEquals(1, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)85);
      x5455_ExtendedTimestamp0.getCentralDirectoryLength();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Date date0 = x5455_ExtendedTimestamp0.getModifyJavaTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)4);
      x5455_ExtendedTimestamp0.toString();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)1, 255, (byte)1, 100, 255, (-4102));
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.toString();
      assertEquals((byte)4, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)2);
      x5455_ExtendedTimestamp0.toString();
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)1);
      x5455_ExtendedTimestamp0.toString();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setModifyJavaTime((Date) null);
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
      assertFalse(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)4;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)0, (byte)4);
      assertEquals((byte)4, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)2;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)2, (byte)2);
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)1;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)1, 22);
      assertEquals((byte)1, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)1;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)1, (byte)4);
      assertEquals((byte)1, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
      try { 
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (-3148), (byte) (-55));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X5455_ExtendedTimestamp too short, only -55 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((-247L));
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      ZipLong zipLong0 = x5455_ExtendedTimestamp0.getCreateTime();
      x5455_ExtendedTimestamp0.setAccessTime(zipLong0);
      x5455_ExtendedTimestamp0.hashCode();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      x5455_ExtendedTimestamp0.hashCode();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      FileTime fileTime0 = FileTime.from((long) (byte)4, timeUnit0);
      x5455_ExtendedTimestamp0.setCreateFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getLocalFileDataData();
      assertEquals((byte)4, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[17];
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      byteArray0[4] = (byte)4;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)4, 22);
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = (X5455_ExtendedTimestamp)x5455_ExtendedTimestamp0.clone();
      x5455_ExtendedTimestamp1.setCreateTime(zipLong0);
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(x5455_ExtendedTimestamp1);
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)2;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)0, 22);
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp1.setFlags((byte)50);
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(x5455_ExtendedTimestamp1);
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = (X5455_ExtendedTimestamp)x5455_ExtendedTimestamp0.clone();
      x5455_ExtendedTimestamp0.setFlags((byte)1);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      FileTime fileTime0 = FileTime.from((long) (byte)1, timeUnit0);
      x5455_ExtendedTimestamp1.setModifyFileTime(fileTime0);
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(x5455_ExtendedTimestamp1);
      assertEquals((byte)1, x5455_ExtendedTimestamp1.getFlags());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(x5455_ExtendedTimestamp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(zipLong0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      FileTime fileTime0 = FileTime.from(4294967295L, timeUnit0);
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.setCreateFileTime(fileTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // X5455 timestamps must fit in a signed 32 bit integer: 4294967295
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setAccessFileTime((FileTime) null);
      assertFalse(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Object object0 = x5455_ExtendedTimestamp0.clone();
      ZipLong zipLong0 = new ZipLong((int) (byte)1);
      x5455_ExtendedTimestamp0.setCreateTime(zipLong0);
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(object0);
      assertEquals((byte)4, x5455_ExtendedTimestamp0.getFlags());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = x5455_ExtendedTimestamp0.getAccessTime();
      assertNull(zipLong0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getModifyFileTime();
      assertNull(fileTime0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Date date0 = x5455_ExtendedTimestamp0.getCreateJavaTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getCreateFileTime();
      assertNull(fileTime0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = x5455_ExtendedTimestamp0.getCreateTime();
      assertNull(zipLong0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis(0L);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.toString();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Date date0 = x5455_ExtendedTimestamp0.getAccessJavaTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipShort zipShort0 = x5455_ExtendedTimestamp0.getHeaderId();
      assertEquals(21589, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis(0L);
      x5455_ExtendedTimestamp0.setModifyFileTime(fileTime0);
      x5455_ExtendedTimestamp0.toString();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)4);
      x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.getModifyTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray0, 1292, 1292);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1292
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte byte0 = x5455_ExtendedTimestamp0.getFlags();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = x5455_ExtendedTimestamp0.getModifyTime();
      assertNull(zipLong0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getAccessFileTime();
      assertNull(fileTime0);
  }
}
