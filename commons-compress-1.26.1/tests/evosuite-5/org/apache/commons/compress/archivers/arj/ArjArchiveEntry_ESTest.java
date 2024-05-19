
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


package org.apache.commons.compress.archivers.arj;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.arj.ArjArchiveEntry;
import org.apache.commons.compress.archivers.arj.LocalFileHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArjArchiveEntry_ESTest extends ArjArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.hostOS = 31;
      arjArchiveEntry0.getLastModifiedDate();
      assertEquals(31, arjArchiveEntry0.getHostOs());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.fileType = 16;
      boolean boolean0 = arjArchiveEntry0.isDirectory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.dateTimeModified = (-221);
      localFileHeader0.hostOS = 2;
      arjArchiveEntry0.getLastModifiedDate();
      assertEquals(2, arjArchiveEntry0.getHostOs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.hostOS = 2;
      localFileHeader0.fileAccessMode = (-264);
      int int0 = arjArchiveEntry0.getUnixMode();
      assertEquals((-264), arjArchiveEntry0.getMode());
      assertEquals((-264), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.originalSize = 2168L;
      long long0 = arjArchiveEntry0.getSize();
      assertEquals(2168L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.originalSize = (-1129L);
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      long long0 = arjArchiveEntry0.getSize();
      assertEquals((-1129L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.name = "rZgF5.qe";
      String string0 = arjArchiveEntry0.getName();
      assertEquals("rZgF5.qe", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.name = "";
      String string0 = arjArchiveEntry0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.fileAccessMode = 696;
      int int0 = arjArchiveEntry0.getMode();
      assertEquals(696, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.fileAccessMode = (-1099);
      int int0 = arjArchiveEntry0.getMode();
      assertEquals((-1099), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.method = 11;
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      int int0 = arjArchiveEntry0.getMethod();
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.method = (-685);
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      int int0 = arjArchiveEntry0.getMethod();
      assertEquals((-685), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.hostOS = 31;
      int int0 = arjArchiveEntry0.getHostOs();
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.hostOS = (-3980);
      int int0 = arjArchiveEntry0.getHostOs();
      assertEquals((-3980), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.isHostOsUnix();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.isDirectory();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.getUnixMode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.getLastModifiedDate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.getHostOs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      ArjArchiveEntry arjArchiveEntry1 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.equals(arjArchiveEntry1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.hostOS = 2;
      boolean boolean0 = arjArchiveEntry0.isHostOsUnix();
      assertEquals(2, arjArchiveEntry0.getHostOs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      boolean boolean0 = arjArchiveEntry0.isHostOsUnix();
      assertFalse(boolean0);
      assertEquals(0, arjArchiveEntry0.getHostOs());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.arjFlags = 1720;
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      String string0 = arjArchiveEntry0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      int int0 = arjArchiveEntry0.getHostOs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      int int0 = arjArchiveEntry0.getMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.hostOS = 8;
      boolean boolean0 = arjArchiveEntry0.isHostOsUnix();
      assertEquals(8, arjArchiveEntry0.getHostOs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      assertFalse(arjArchiveEntry0.isDirectory());
      
      localFileHeader0.fileType = 3;
      boolean boolean0 = arjArchiveEntry0.isDirectory();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      boolean boolean0 = arjArchiveEntry0.isDirectory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.name = "";
      arjArchiveEntry0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      int int0 = arjArchiveEntry0.getUnixMode();
      assertFalse(arjArchiveEntry0.isHostOsUnix());
      assertEquals(0, arjArchiveEntry0.getHostOs());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.arjFlags = 893;
      // Undeclared exception!
      try { 
        arjArchiveEntry0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      arjArchiveEntry0.hashCode();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      boolean boolean0 = arjArchiveEntry0.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      boolean boolean0 = arjArchiveEntry0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      boolean boolean0 = arjArchiveEntry0.equals(arjArchiveEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      ArjArchiveEntry arjArchiveEntry1 = new ArjArchiveEntry();
      boolean boolean0 = arjArchiveEntry0.equals(arjArchiveEntry1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ArjArchiveEntry.HostOs arjArchiveEntry_HostOs0 = new ArjArchiveEntry.HostOs();
      assertEquals(1, ArjArchiveEntry.HostOs.PRIMOS);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      int int0 = arjArchiveEntry0.getMethod();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      long long0 = arjArchiveEntry0.getSize();
      assertEquals(0L, long0);
  }
}
