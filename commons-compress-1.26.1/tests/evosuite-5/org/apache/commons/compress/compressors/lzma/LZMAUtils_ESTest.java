
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


package org.apache.commons.compress.compressors.lzma;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.compressors.lzma.LZMAUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LZMAUtils_ESTest extends LZMAUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)104;
      boolean boolean0 = LZMAUtils.matches(byteArray0, (byte)57);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = LZMAUtils.matches(byteArray0, (byte)3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = LZMAUtils.isCompressedFilename("org.apache.commons.compress.utils.OsgiUtils.lzma");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = LZMAUtils.isCompressedFilename("xPpCUM[j2_]dCTuVEp");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = LZMAUtils.isCompressedFileName("org.apache.commons.compress.compressors.lzma.LZMAUtils$CachedAvailability.lzma");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = LZMAUtils.getUncompressedFilename("xPpCUM[j2_]dCTuVEp");
      assertEquals("xPpCUM[j2_]dCTuVEp", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = LZMAUtils.getUncompressedFilename("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = LZMAUtils.getUncompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LZMAUtils.matches((byte[]) null, 2108);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lzma.LZMAUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        LZMAUtils.matches(byteArray0, 1372);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lzma.LZMAUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LZMAUtils.isCompressedFileName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        LZMAUtils.getUncompressedFileName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LZMAUtils.getCompressedFilename((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        LZMAUtils.getCompressedFileName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LZMAUtils.setCacheLZMAAvailablity(true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byteArray0[0] = (byte)93;
      boolean boolean0 = LZMAUtils.matches(byteArray0, (byte)93);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      boolean boolean0 = LZMAUtils.matches(byteArray0, (byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = LZMAUtils.isLZMACompressionAvailable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LZMAUtils.setCacheLZMAAvailablity(false);
      boolean boolean0 = LZMAUtils.isLZMACompressionAvailable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        LZMAUtils.isCompressedFilename((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LZMAUtils.setCacheLZMAAvailablity(false);
      LZMAUtils.setCacheLZMAAvailablity(true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        LZMAUtils.getUncompressedFilename((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = LZMAUtils.getCompressedFilename("org.apache.commons.compress.compressors.FileNameUtil");
      assertEquals("org.apache.commons.compress.compressors.FileNameUtil.lzma", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = LZMAUtils.isCompressedFileName("b=iC=[3hE:S<jv }V0A");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = LZMAUtils.getCompressedFileName("");
      assertEquals(".lzma", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LZMAUtils.getCachedLZMAAvailability();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = LZMAUtils.getUncompressedFileName("_DSIIl~9]!g$8_'>");
      assertEquals("_DSIIl~9]!g$8_'>", string0);
  }
}
