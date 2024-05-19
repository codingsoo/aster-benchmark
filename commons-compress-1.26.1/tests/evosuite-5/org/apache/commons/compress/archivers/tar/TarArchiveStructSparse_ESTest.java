
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
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.tar.TarArchiveStructSparse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TarArchiveStructSparse_ESTest extends TarArchiveStructSparse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(674L, 1L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(674L, 674L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertEquals(674L, tarArchiveStructSparse0.getOffset());
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertFalse(boolean0);
      assertEquals(674L, tarArchiveStructSparse1.getNumbytes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2067L, 2067L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(0L, 2067L);
      boolean boolean0 = tarArchiveStructSparse1.equals(tarArchiveStructSparse0);
      assertEquals(2067L, tarArchiveStructSparse1.getNumbytes());
      assertFalse(tarArchiveStructSparse0.equals((Object)tarArchiveStructSparse1));
      assertFalse(boolean0);
      assertEquals(2067L, tarArchiveStructSparse0.getOffset());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(1141L, 1141L);
      long long0 = tarArchiveStructSparse0.getOffset();
      assertEquals(1141L, tarArchiveStructSparse0.getNumbytes());
      assertEquals(1141L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(1141L, 1141L);
      long long0 = tarArchiveStructSparse0.getNumbytes();
      assertEquals(1141L, tarArchiveStructSparse0.getOffset());
      assertEquals(1141L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2602L, 2602L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(2602L, 832L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertFalse(boolean0);
      assertEquals(2602L, tarArchiveStructSparse1.getOffset());
      assertEquals(832L, tarArchiveStructSparse1.getNumbytes());
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(461L, 461L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(0L, 461L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertFalse(boolean0);
      assertEquals(461L, tarArchiveStructSparse1.getNumbytes());
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertEquals(461L, tarArchiveStructSparse0.getOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(0L, 0L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      boolean boolean0 = tarArchiveStructSparse0.equals("TarArchiveStructSparse{offset=0, numbytes=0}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      boolean boolean0 = tarArchiveStructSparse0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = null;
      try {
        tarArchiveStructSparse0 = new TarArchiveStructSparse(1391L, (-2196L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // numbytes must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveStructSparse", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = null;
      try {
        tarArchiveStructSparse0 = new TarArchiveStructSparse((-23L), (-23L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // offset must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveStructSparse", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      String string0 = tarArchiveStructSparse0.toString();
      assertEquals("TarArchiveStructSparse{offset=0, numbytes=0}", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      tarArchiveStructSparse0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      long long0 = tarArchiveStructSparse0.getOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      long long0 = tarArchiveStructSparse0.getNumbytes();
      assertEquals(0L, long0);
  }
}
