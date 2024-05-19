
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
import org.apache.commons.codec.language.Caverphone2;
import org.apache.commons.codec.language.DoubleMetaphone;
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
      int int0 = SoundexUtils.differenceEncoded("d.@V&O", "%iX:W)eg^f#F^{-I");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = SoundexUtils.isEmpty("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = SoundexUtils.isEmpty("LRYN");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Caverphone2 caverphone2_0 = new Caverphone2();
      int int0 = SoundexUtils.difference(caverphone2_0, "", "");
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = SoundexUtils.clean("$#F:2WzOVTuto,b/c");
      assertEquals("FWZOVTUTOBC", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec("");
      try { 
        SoundexUtils.difference(uRLCodec0, "p", "Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         //
         verifyException("org.apache.commons.codec.net.URLCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        SoundexUtils.difference((StringEncoder) null, "ISL", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.SoundexUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-1591));
      // Undeclared exception!
      try { 
        SoundexUtils.difference(doubleMetaphone0, "bh>M@(", "r1");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Soundex soundex0 = new Soundex("SPWVbio2`<\"Toi$i", true);
      // Undeclared exception!
      try { 
        SoundexUtils.difference(soundex0, "SPWVbio2`<\"Toi$i", "~!/L1C#-FS[#gX");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: S (index=18)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = SoundexUtils.clean("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = SoundexUtils.differenceEncoded("01230120022455012623010202", "01230120022455012623010202");
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = SoundexUtils.differenceEncoded("T", (String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = SoundexUtils.differenceEncoded((String) null, "");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = SoundexUtils.clean((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH_SIMPLIFIED;
      int int0 = SoundexUtils.difference(soundex0, "01230120022455012623010202", "T");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SoundexUtils soundexUtils0 = new SoundexUtils();
  }
}
