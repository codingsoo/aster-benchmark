
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


package org.apache.commons.compress.compressors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.apache.commons.compress.compressors.FileNameUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FileNameUtil_ESTest extends FileNameUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("D0`8n", "Q$x}3\"dEW6^9HwA]");
      hashMap0.put("", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("io26tLa[XZ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("t1&*\"0", "org.apache.commons.compress.compressors.FileNameUtil");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "f,~9`t1&*\"0");
      String string0 = fileNameUtil0.getUncompressedFileName("f,~9`t1&*\"0");
      assertEquals("f,~9`org.apache.commons.compress.compressors.FileNameUtil", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "9{/l");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, (String) null);
      String string0 = fileNameUtil0.getCompressedFilename("@dbU#*U=9{/l");
      assertEquals("@dbU#*U=", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.putIfAbsent("XSykt|", "XSykt|");
      hashMap0.put("e'B~_<_l;f2l)m=8F", "O\"PL4b");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "-)(p#M");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("f@(o=`eras]wfig;q", "j 88\"J2 FmNO.j2-Z");
      hashMap0.put("e'B~_<_l;f2l)m=8F", "O\"PL4b");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "-)(p#M");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>(3258);
      hashMap0.put("", "kC2");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("kC2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "f,~9`t1&*\"0");
      String string0 = fileNameUtil0.getUncompressedFilename("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getCompressedFilename("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      // Undeclared exception!
      try { 
        fileNameUtil0.isCompressedFilename((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "Qs}[lDhwQuqc#CIo+");
      // Undeclared exception!
      try { 
        fileNameUtil0.isCompressedFileName((String) null);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "[*mvndHOe9OLt");
      // Undeclared exception!
      try { 
        fileNameUtil0.getUncompressedFileName((String) null);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "[wTy");
      // Undeclared exception!
      try { 
        fileNameUtil0.getCompressedFilename((String) null);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      // Undeclared exception!
      try { 
        fileNameUtil0.getCompressedFileName((String) null);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put((String) null, (String) null);
      FileNameUtil fileNameUtil0 = null;
      try {
        fileNameUtil0 = new FileNameUtil(hashMap0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("D0`8n", "Q$x}3\"dEW6^9HwA]");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("D0`8n", "Q$x}3\"dEW6^9HwA]");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getUncompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("D0`8n", "Q$x}3\"dEW6^9HwA]");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getCompressedFileName(" c|ZSY]v<:\":x.]`h{");
      assertEquals(" c|ZSY]v<:\":x.]`h{", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("D0`8n", "Q$x}3\"dEW6^9HwA]");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getCompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("D0`8n", "Q$x}3\"dEW6^9HwA]");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("io26tLa[XZ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getUncompressedFileName(" c|ZSY]v<:\":x.]`h{");
      assertEquals(" c|ZSY]v<:\":x.]`h{", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("D0`8n", "Q$x}3\"dEW6^9HwA]");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getUncompressedFileName(" c|ZSY]v<:\":x.]`h{");
      assertEquals(" c|ZSY]v<:\":x.]`h{", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("*st", "*st");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "*st");
      String string0 = fileNameUtil0.getUncompressedFilename("*st");
      assertEquals("*st", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("D0`8n", "Q$x}3\"dEW6^9HwA]");
      hashMap0.put("", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getUncompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("f@(o=`eras]wfig;q", "j 88\"J2 FmNO.j2-Z");
      hashMap0.put("K2UKAoxZV", "XSykt|");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "-)(p#M");
      String string0 = fileNameUtil0.getCompressedFilename("XSykt|");
      assertEquals("XSykt|-)(p#M", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("*st", "*st");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "*st");
      String string0 = fileNameUtil0.getCompressedFileName("*st*st");
      assertEquals("*st*st", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      // Undeclared exception!
      try { 
        fileNameUtil0.getUncompressedFilename((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }
}
