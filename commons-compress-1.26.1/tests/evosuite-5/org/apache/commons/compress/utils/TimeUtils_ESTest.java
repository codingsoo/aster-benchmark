
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.compress.utils.TimeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TimeUtils_ESTest extends TimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileTime fileTime0 = FileTime.fromMillis((-2147483648L));
      FileTime fileTime1 = TimeUtils.truncateToHundredNanos(fileTime0);
      assertTrue(fileTime1.equals((Object)fileTime0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = TimeUtils.isUnixTime((-2147483648L));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileTime fileTime0 = FileTime.fromMillis(1903L);
      long long0 = TimeUtils.toUnixTime(fileTime0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      FileTime fileTime0 = FileTime.from((-2837L), timeUnit0);
      long long0 = TimeUtils.toUnixTime(fileTime0);
      assertEquals((-245116800L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = TimeUtils.toNtfsTime((-116444736000000000L));
      assertEquals((-2186038620298248192L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = TimeUtils.isUnixTime((FileTime) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.truncateToHundredNanos((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.TimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileTime fileTime0 = TimeUtils.unixTimeToFileTime(0L);
      long long0 = TimeUtils.toUnixTime(fileTime0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = TimeUtils.isUnixTime(116444736013270000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long long0 = TimeUtils.toUnixTime((FileTime) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = TimeUtils.isUnixTime(2147483647L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = TimeUtils.isUnixTime((-116444736000000000L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileTime fileTime0 = TimeUtils.unixTimeToFileTime(377L);
      // Undeclared exception!
      try { 
        TimeUtils.toNtfsTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.utils.TimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2147483644), (-2147483644), (-2147483644), (-1), 1);
      // Undeclared exception!
      try { 
        TimeUtils.toFileTime(mockDate0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.utils.TimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.ntfsTimeToDate((-1L));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.utils.TimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate(38L);
      // Undeclared exception!
      try { 
        TimeUtils.toNtfsTime((Date) mockDate0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.utils.TimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.ntfsTimeToFileTime(0L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.utils.TimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long long0 = TimeUtils.toNtfsTime((-1727L));
      assertEquals(116444735982730000L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileTime fileTime0 = TimeUtils.unixTimeToFileTime(116444735982730000L);
      boolean boolean0 = TimeUtils.isUnixTime(fileTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileTime fileTime0 = TimeUtils.unixTimeToFileTime(116444735982730000L);
      // Undeclared exception!
      try { 
        TimeUtils.toDate(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.utils.TimeUtils", e);
      }
  }
}
