
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


package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.language.Nysiis;
import org.apache.commons.codec.language.Soundex;
import org.apache.commons.codec.language.SoundexUtils;
import org.apache.commons.codec.net.URLCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SoundexUtils_ESTest extends SoundexUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = SoundexUtils.differenceEncoded("|{5KO$mF~Xs*-[\"KG2", "Ry");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = SoundexUtils.isEmpty((CharSequence) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = SoundexUtils.isEmpty("STM");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = SoundexUtils.differenceEncoded("oVi`7B", "oVi`7B");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        SoundexUtils.difference((StringEncoder) null, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.SoundexUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[5];
      Soundex soundex0 = new Soundex(charArray0);
      // Undeclared exception!
      try { 
        SoundexUtils.difference(soundex0, "org.apache.commons.codec.language.DoubleMetaphone", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: O (index=14)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = SoundexUtils.clean((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = SoundexUtils.differenceEncoded("AI", "jV:},d(nSE[Z3Yl70X");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = SoundexUtils.differenceEncoded("ORGAPACHECOMMONSCODECLANGUAGESOUNDEXUTILS", (String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      int int0 = SoundexUtils.difference(nysiis0, "org.apache.commons.codec.language.SoundexUtils", "ORGAPACHECOMMONSCODECLANGUAGESOUNDEXUTILS");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      int int0 = SoundexUtils.difference(nysiis0, (String) null, "ORGAPACHECOMMONSCODECLANGUAGESOUNDEXUTILS");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = SoundexUtils.clean("MAC");
      assertEquals("MAC", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = SoundexUtils.clean("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec("");
      try { 
        SoundexUtils.difference(uRLCodec0, "*,>~4KXGPc[2vY.", "MAC");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         //
         verifyException("org.apache.commons.codec.net.URLCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SoundexUtils soundexUtils0 = new SoundexUtils();
  }
}
