
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
import org.apache.commons.compress.archivers.dump.Dirent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Dirent_ESTest extends Dirent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Dirent dirent0 = new Dirent(0, 0, 0, "");
      int int0 = dirent0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Dirent dirent0 = new Dirent(3294, (-1), 2, "");
      int int0 = dirent0.getType();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dirent dirent0 = new Dirent(0, 0, 0, "");
      int int0 = dirent0.getParentIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Dirent dirent0 = new Dirent(0, 1, 4623, "");
      int int0 = dirent0.getParentIno();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Dirent dirent0 = new Dirent(2, (-1490), 2, (String) null);
      String string0 = dirent0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Dirent dirent0 = new Dirent(3294, (-1), 2, "");
      String string0 = dirent0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Dirent dirent0 = new Dirent(0, 0, 0, "");
      int int0 = dirent0.getIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Dirent dirent0 = new Dirent(3294, (-1), 2, "");
      int int0 = dirent0.getIno();
      assertEquals(3294, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dirent dirent0 = new Dirent((-54), (-54), (-54), ">:");
      String string0 = dirent0.toString();
      assertEquals("[-54]: >:", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Dirent dirent0 = new Dirent((-54), (-54), (-54), ">:");
      int int0 = dirent0.getIno();
      assertEquals((-54), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Dirent dirent0 = new Dirent((-54), (-54), (-54), ">:");
      String string0 = dirent0.getName();
      assertEquals(">:", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Dirent dirent0 = new Dirent((-54), (-54), (-54), ">:");
      int int0 = dirent0.getType();
      assertEquals((-54), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Dirent dirent0 = new Dirent((-54), (-54), (-54), ">:");
      int int0 = dirent0.getParentIno();
      assertEquals((-54), int0);
  }
}
