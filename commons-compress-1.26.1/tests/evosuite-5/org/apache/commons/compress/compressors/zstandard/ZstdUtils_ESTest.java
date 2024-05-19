
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


package org.apache.commons.compress.compressors.zstandard;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.compressors.zstandard.ZstdUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZstdUtils_ESTest extends ZstdUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)83;
      byteArray0[1] = (byte)83;
      boolean boolean0 = ZstdUtils.matches(byteArray0, (byte)83);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-14);
      boolean boolean0 = ZstdUtils.matches(byteArray0, 2445);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZstdUtils.matches((byte[]) null, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.zstandard.ZstdUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)80;
      // Undeclared exception!
      try { 
        ZstdUtils.matches(byteArray0, (byte)80);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.compressors.zstandard.ZstdUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZstdUtils.setCacheZstdAvailablity(true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)95;
      byteArray0[1] = (byte)42;
      boolean boolean0 = ZstdUtils.matches(byteArray0, (byte)42);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)40;
      boolean boolean0 = ZstdUtils.matches(byteArray0, (byte)40);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = ZstdUtils.matches(byteArray0, (byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = ZstdUtils.isZstdCompressionAvailable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZstdUtils.setCacheZstdAvailablity(false);
      boolean boolean0 = ZstdUtils.isZstdCompressionAvailable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZstdUtils.setCacheZstdAvailablity(false);
      ZstdUtils.setCacheZstdAvailablity(true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZstdUtils.getCachedZstdAvailability();
  }
}