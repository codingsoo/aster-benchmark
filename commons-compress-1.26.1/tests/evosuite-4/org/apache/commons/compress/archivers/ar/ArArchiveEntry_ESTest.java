
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
import java.net.URI;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Date;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArArchiveEntry_ESTest extends ArArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("_iNo<bLD", 0L, 1, 1672, 0, 1672);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals(1672, arArchiveEntry0.getGroupId());
      assertEquals(1672L, arArchiveEntry0.getLastModified());
      assertEquals(1, int0);
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals("_iNo<bLD", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("OP.g", 0L, (-1959), 2719, 0, 3310L);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals(2719, arArchiveEntry0.getGroupId());
      assertEquals("OP.g", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals((-1959), int0);
      assertEquals(0, arArchiveEntry0.getMode());
      assertEquals(3310L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = MockFile.createTempFile("!<arch>\n", "!<arch>\n");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(file0, "!<arch>\n");
      long long0 = arArchiveEntry0.getSize();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, long0);
      assertEquals("!<arch>\n", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 0L, 0, 0, 0, 0);
      String string0 = arArchiveEntry0.getName();
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertNull(string0);
      assertEquals(0, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("!<arch>\n", 0L, 3871, 3871, 3871, 0L);
      String string0 = arArchiveEntry0.getName();
      assertEquals(3871, arArchiveEntry0.getGroupId());
      assertEquals(3871, arArchiveEntry0.getMode());
      assertEquals("!<arch>\n", string0);
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(3871, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0L, (-373), 0, (-373), 0L);
      String string0 = arArchiveEntry0.getName();
      assertEquals((-373), arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals((-373), arArchiveEntry0.getUserId());
      assertEquals("", string0);
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("OP.g", 0L, (-1959), 2719, 0, 3310L);
      int int0 = arArchiveEntry0.getMode();
      assertEquals("OP.g", arArchiveEntry0.getName());
      assertEquals(0, int0);
      assertEquals((-1959), arArchiveEntry0.getUserId());
      assertEquals(2719, arArchiveEntry0.getGroupId());
      assertEquals(3310L, arArchiveEntry0.getLastModified());
      assertEquals(0L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0L, (-373), 0, (-373), 0L);
      int int0 = arArchiveEntry0.getMode();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals((-373), arArchiveEntry0.getUserId());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals((-373), int0);
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      File file0 = MockFile.createTempFile("!<arch>\n", "!<arch>\n");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(file0, "!<arch>\n");
      long long0 = arArchiveEntry0.getLength();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals("!<arch>\n", arArchiveEntry0.getName());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("!<arch>\n", 0L, 3871, 3871, 3871, 0L);
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals("!<arch>\n", arArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals(3871, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(3871, arArchiveEntry0.getUserId());
      assertEquals(3871, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(",%{-n!%~>cdJ7Qs%z1R", 89L, 3, (-1899), 5660, (-1899));
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals(5660, arArchiveEntry0.getMode());
      assertEquals(",%{-n!%~>cdJ7Qs%z1R", arArchiveEntry0.getName());
      assertEquals((-1899L), long0);
      assertEquals((-1899), arArchiveEntry0.getGroupId());
      assertEquals(3, arArchiveEntry0.getUserId());
      assertEquals(89L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("&Yq!LYL-Id@g[:erV0'", 0, 0, 186, 186, 0L);
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals("&Yq!LYL-Id@g[:erV0'", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(186, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(186, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 985L, (-1499), (-1499), (-1499), (-1499));
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals("Zip slip '%s' + '%s' -> '%s'", arArchiveEntry0.getName());
      assertEquals((-1499), int0);
      assertEquals((-1499L), arArchiveEntry0.getLastModified());
      assertEquals(985L, arArchiveEntry0.getLength());
      assertEquals((-1499), arArchiveEntry0.getMode());
      assertEquals((-1499), arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[8];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[0];
      linkOptionArray0[3] = linkOptionArray0[1];
      linkOptionArray0[4] = linkOptionArray0[3];
      linkOptionArray0[5] = linkOptionArray0[0];
      linkOptionArray0[6] = linkOptionArray0[0];
      linkOptionArray0[7] = linkOptionArray0[4];
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry(path0, "`.`^4-1b, =", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry((Path) null, "t[-h]};)vv6%!kf(7", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry("", (-650L), (-1890), 0, 0, (-1890));
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
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Z", 836L);
      long long0 = arArchiveEntry0.getLength();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(836L, long0);
      assertEquals("Z", arArchiveEntry0.getName());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Z", 836L);
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals("Z", arArchiveEntry0.getName());
      assertEquals(836L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(1392409281L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("cetaA+E1/BZfa(FDc5");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, (String) null);
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry(mockFile0, "!<arch>\n");
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertEquals(0, arArchiveEntry1.getGroupId());
      assertEquals(0, arArchiveEntry1.getUserId());
      assertEquals(0L, arArchiveEntry1.getLength());
      assertEquals(33188, arArchiveEntry1.getMode());
      assertEquals(0L, arArchiveEntry1.getLastModified());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Z", 836L);
      MockFile mockFile0 = new MockFile("Z", "i',tkxzuNS");
      boolean boolean0 = arArchiveEntry0.equals(mockFile0);
      assertEquals("Z", arArchiveEntry0.getName());
      assertEquals(836L, arArchiveEntry0.getSize());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("cetaA+E1/BZfa(FDc5");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, (String) null);
      boolean boolean0 = arArchiveEntry0.equals((Object) null);
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("l>{~SPM?LKX");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "l>{~SPM?LKX");
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry0);
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertTrue(boolean0);
      assertEquals("l>{~SPM?LKX", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry(">x%_Yyj]:h", (-2043L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[3];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOption0;
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(path0, "", linkOptionArray0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(1715889458L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("cetaA+E1/BZfa(FDc5");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, (String) null);
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry((String) null, 1000L, 3, 0, (-2021161100), 999L);
      boolean boolean0 = arArchiveEntry1.equals(arArchiveEntry0);
      assertEquals((-2021161100), arArchiveEntry1.getMode());
      assertEquals(3, arArchiveEntry1.getUserId());
      assertEquals(0, arArchiveEntry1.getGroupId());
      assertEquals(999L, arArchiveEntry1.getLastModified());
      assertTrue(boolean0);
      assertEquals(1000L, arArchiveEntry1.getLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry("", 0, 0, 0, 0, 0);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertTrue(boolean0);
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals("", arArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Z", 836L);
      arArchiveEntry0.hashCode();
      assertEquals("Z", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(836L, arArchiveEntry0.getLength());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Z", 836L);
      int int0 = arArchiveEntry0.getMode();
      assertEquals(33188, int0);
      assertEquals("Z", arArchiveEntry0.getName());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(836L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Z", 836L);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, int0);
      assertEquals(836L, arArchiveEntry0.getSize());
      assertEquals("Z", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Z", 836L);
      Date date0 = arArchiveEntry0.getLastModifiedDate();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("Z", arArchiveEntry0.getName());
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
      assertEquals(836L, arArchiveEntry0.getLength());
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Z", 836L);
      boolean boolean0 = arArchiveEntry0.isDirectory();
      assertEquals("Z", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(836L, arArchiveEntry0.getLength());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Z", 836L);
      long long0 = arArchiveEntry0.getSize();
      assertEquals(836L, long0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals("Z", arArchiveEntry0.getName());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Z", 836L);
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, int0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(836L, arArchiveEntry0.getSize());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals("Z", arArchiveEntry0.getName());
  }
}
