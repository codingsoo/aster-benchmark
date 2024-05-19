
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


package org.apache.commons.codec.language.bm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.language.bm.Lang;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.codec.language.bm.NameType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Lang_ESTest extends Lang_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lang lang0 = Lang.instance((NameType) null);
      assertNull(lang0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Lang.loadFromResource((String) null, (Languages) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      Lang lang0 = Lang.instance(nameType0);
      // Undeclared exception!
      try { 
        lang0.guessLanguages((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Lang", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      Lang lang0 = Lang.instance(nameType0);
      // Undeclared exception!
      try { 
        lang0.guessLanguage((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Lang", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      Lang lang0 = Lang.instance(nameType0);
      Languages.LanguageSet languages_LanguageSet0 = lang0.guessLanguages("*/");
      assertFalse(languages_LanguageSet0.isSingleton());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      Lang lang0 = Lang.instance(nameType0);
      String string0 = lang0.guessLanguage("L*g");
      //  // Unstable assertion: assertEquals("czech", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      Lang lang0 = Lang.instance(nameType0);
      String string0 = lang0.guessLanguage("org.apache.commons.codec.language.bm.Languages$2");
      assertEquals("any", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Languages languages0 = Languages.getInstance("");
      // Undeclared exception!
      try { 
        Lang.loadFromResource("", languages0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed line 'META-INF' in language resource ''
         //
         verifyException("org.apache.commons.codec.language.bm.Lang", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Languages languages0 = Languages.getInstance("ch");
      Lang lang0 = Lang.loadFromResource("ch", languages0);
      assertNotNull(lang0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      Lang lang0 = Lang.instance(nameType0);
      Languages.LanguageSet languages_LanguageSet0 = lang0.guessLanguages("true");
      assertNotNull(languages_LanguageSet0);
  }
}
