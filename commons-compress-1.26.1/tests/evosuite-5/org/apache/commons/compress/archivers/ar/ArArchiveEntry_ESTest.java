
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


package org.apache.commons.compress.archivers.ar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Date;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArArchiveEntry_ESTest extends ArArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("2<w!x[7ra", 2030L, 1548, 4771, (-1), 1001L);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals(1001L, arArchiveEntry0.getLastModified());
      assertEquals(4771, arArchiveEntry0.getGroupId());
      assertEquals((-1), arArchiveEntry0.getMode());
      assertEquals(1548, int0);
      assertEquals(2030L, arArchiveEntry0.getSize());
      assertEquals("2<w!x[7ra", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 1L, (-1025), 0, (-1025), 1L);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals("Zip slip '%s' + '%s' -> '%s'", arArchiveEntry0.getName());
      assertEquals((-1025), arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals((-1025), int0);
      assertEquals(1L, arArchiveEntry0.getLength());
      assertEquals(1L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("8d>;zWTH", 0L);
      long long0 = arArchiveEntry0.getSize();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0L, long0);
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals("8d>;zWTH", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("`\n");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, (String) null);
      String string0 = arArchiveEntry0.getName();
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertNull(string0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("!<arch>\n", 1000L, 2063, (-2482), (-2482), 2063);
      String string0 = arArchiveEntry0.getName();
      assertEquals((-2482), arArchiveEntry0.getGroupId());
      assertEquals(2063L, arArchiveEntry0.getLastModified());
      assertEquals((-2482), arArchiveEntry0.getMode());
      assertEquals("!<arch>\n", string0);
      assertEquals(2063, arArchiveEntry0.getUserId());
      assertEquals(1000L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Zip slip '%s' + '%s' -> '%s'");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      String string0 = arArchiveEntry0.getName();
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("", string0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("BJI~", 0L, 0, 0, 0, 0);
      int int0 = arArchiveEntry0.getMode();
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals("BJI~", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0, int0);
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 1L, (-1025), 0, (-1025), 1L);
      int int0 = arArchiveEntry0.getMode();
      assertEquals((-1025), int0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals((-1025), arArchiveEntry0.getUserId());
      assertEquals(1L, arArchiveEntry0.getSize());
      assertEquals(1L, arArchiveEntry0.getLastModified());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("(-Mv,z!A([P>Q", 1L, (-879), 0, 0, 1L);
      long long0 = arArchiveEntry0.getLength();
      assertEquals("(-Mv,z!A([P>Q", arArchiveEntry0.getName());
      assertEquals(1L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getMode());
      assertEquals((-879), arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 817L);
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(1392409281L, long0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(817L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("W>%yJh", 131L, (-3156), (-3156), (-1948), (-1L));
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals("W>%yJh", arArchiveEntry0.getName());
      assertEquals((-3156), arArchiveEntry0.getGroupId());
      assertEquals((-3156), arArchiveEntry0.getUserId());
      assertEquals((-1L), long0);
      assertEquals(131L, arArchiveEntry0.getSize());
      assertEquals((-1948), arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 1000L, 2, 2, 1235, 721L);
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals(721L, arArchiveEntry0.getLastModified());
      assertEquals(2, arArchiveEntry0.getUserId());
      assertEquals(1235, arArchiveEntry0.getMode());
      assertEquals(2, int0);
      assertEquals(1000L, arArchiveEntry0.getSize());
      assertEquals("", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("!<arch>\n", 1000L, 2063, (-2482), (-2482), 2063);
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals((-2482), arArchiveEntry0.getMode());
      assertEquals(2063, arArchiveEntry0.getUserId());
      assertEquals(2063L, arArchiveEntry0.getLastModified());
      assertEquals(1000L, arArchiveEntry0.getSize());
      assertEquals((-2482), int0);
      assertEquals("!<arch>\n", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("length must not be negative");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[3];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      linkOptionArray0[2] = linkOptionArray0[1];
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile(",jJC1(f 2", ",jJC1(f 2");
      Path path0 = mockFile0.toPath();
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry(path0, ",jJC1(f 2", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry("r17%yTj/RPp", (-1155L), 1266, 1266, 1266, 1266);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry((File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Zip slip '%s' + '%s' -> '%s'");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      long long0 = arArchiveEntry0.getLength();
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0L, long0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals("", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Zip slip '%s' + '%s' -> '%s'");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0L, long0);
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, (String) null);
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry(path0, (String) null, linkOptionArray0);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertEquals(0, arArchiveEntry1.getGroupId());
      assertEquals(1716037382L, arArchiveEntry1.getLastModified());
      assertTrue(boolean0);
      assertEquals(0, arArchiveEntry1.getUserId());
      assertEquals(33188, arArchiveEntry1.getMode());
      assertEquals(0L, arArchiveEntry1.getLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 541L);
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry("!<arch>\n", 0, 0, 33188, 0, 0);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertFalse(boolean0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(33188, arArchiveEntry1.getGroupId());
      assertEquals(0, arArchiveEntry1.getUserId());
      assertFalse(arArchiveEntry1.equals((Object)arArchiveEntry0));
      assertEquals(541L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[1];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(path0, "", linkOptionArray0);
      boolean boolean0 = arArchiveEntry0.equals((Object) null);
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(1711001603L, arArchiveEntry0.getLastModified());
      assertFalse(boolean0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("8d>;zWTH", 16L);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertTrue(boolean0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(16L, arArchiveEntry0.getLength());
      assertEquals("8d>;zWTH", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, (String) null);
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry(path0, "qxQ ", linkOptionArray0);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertEquals(1716037382L, arArchiveEntry1.getLastModified());
      assertEquals(0, arArchiveEntry1.getUserId());
      assertEquals(0, arArchiveEntry1.getGroupId());
      assertFalse(boolean0);
      assertEquals(33188, arArchiveEntry1.getMode());
      assertEquals(0L, arArchiveEntry1.getLength());
      assertFalse(arArchiveEntry1.equals((Object)arArchiveEntry0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry("SZ~IMd^t7%89~_EnW", (-474L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("`\n");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, (String) null);
      Date date0 = arArchiveEntry0.getLastModifiedDate();
      boolean boolean0 = arArchiveEntry0.equals(date0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertFalse(boolean0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 541L);
      arArchiveEntry0.hashCode();
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", arArchiveEntry0.getName());
      assertEquals(541L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 541L);
      int int0 = arArchiveEntry0.getMode();
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(33188, int0);
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(541L, arArchiveEntry0.getSize());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 541L);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, int0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", arArchiveEntry0.getName());
      assertEquals(541L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("8d>;zWTH", 16L);
      Date date0 = arArchiveEntry0.getLastModifiedDate();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals("8d>;zWTH", arArchiveEntry0.getName());
      assertEquals(16L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, (String) null);
      boolean boolean0 = arArchiveEntry0.isDirectory();
      assertFalse(boolean0);
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 541L);
      long long0 = arArchiveEntry0.getSize();
      assertEquals("Zip slip '%s' + '%s' -> '%s'", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(541L, long0);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 541L);
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(541L, arArchiveEntry0.getSize());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", arArchiveEntry0.getName());
      assertEquals(0, int0);
  }
}
