
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.function.BiFunction;
import org.apache.commons.compress.compressors.FileNameUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FileNameUtil_ESTest extends FileNameUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("G", "G");
      hashMap0.put("j)D},.JQtHJly", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "G");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("G");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "HUf4.IFB&P3-");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getUncompressedFileName("org.apache.commons.compress.compressors.FileNameUtil");
      assertEquals("org.apache.commons.compress.compressors.FileNameUtilHUf4.IFB&P3-", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("jN", "`");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "`");
      String string0 = fileNameUtil0.getCompressedFileName("jN`");
      assertEquals("jNjN", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("`", "`");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "`");
      String string0 = fileNameUtil0.getCompressedFilename("`");
      assertEquals("``", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Ez6a&h4P4/e,K", "Ez6a&h4P4/e,K");
      hashMap0.put("org.apache.commons.compress.compressors.FileNameUtil", "org.apache.commons.compress.compressors.FileNameUtil");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "';-%Y}.>9&A<OVO");
      String string0 = fileNameUtil0.getCompressedFilename("r}:Nq_Y|");
      assertEquals("r}:Nq_Y|';-%Y}.>9&A<OVO", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("k", "k");
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      String string0 = hashMap0.merge("O!/73iWAB*Y4c(", "", biFunction0);
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string1 = fileNameUtil0.getUncompressedFilename("");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("k", "k");
      hashMap0.put("@5Q*E_2Gjo[h", "k");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "-[#4`LQ0#");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "G");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("G");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getUncompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getCompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "W!8bBzIU");
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
  public void test12()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
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
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "';-%Y}.>9&A<OVO");
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
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "oF*hsrPj'0jk");
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
  public void test16()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put((String) null, "");
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
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("`", "`");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "`");
      String string0 = fileNameUtil0.getUncompressedFileName("til");
      assertEquals("til", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("k", "k");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getUncompressedFileName("k");
      assertEquals("k", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("`", "`");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "`");
      String string0 = fileNameUtil0.getCompressedFileName("til");
      assertEquals("til`", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "HUf4.IFB&P3-");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getCompressedFileName("");
      assertEquals("org.apache.commons.compress.compressors.FileNameUtil", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "HUf4.IFB&P3-");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("org.apache.commons.compress.compressors.FileNameUtil");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("HJ71kdAT`g#[f\"", "`uXU8UK,rd]z/3");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      boolean boolean0 = fileNameUtil0.isCompressedFileName(".,i}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("`", "`");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "`");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("til");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("`", "`");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "`");
      String string0 = fileNameUtil0.getUncompressedFileName("``");
      assertEquals("``", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("HJ71kdAT`g#[f\"", "`uXU8UK,rd]z/3");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getUncompressedFilename("yD;R &iN");
      assertEquals("yD;R &iN", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("+b", "+b");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getCompressedFilename("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("HJ71kdAT`g#[f\"", "`uXU8UK,rd]z/3");
      hashMap0.putIfAbsent("6R", "q{^L357N,Q");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("+b", "+b");
      hashMap0.putIfAbsent("6R", "q{^L357N,Q");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
}
