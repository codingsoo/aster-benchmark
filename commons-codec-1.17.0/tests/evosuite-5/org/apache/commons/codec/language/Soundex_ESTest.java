
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
import org.apache.commons.codec.language.Soundex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Soundex_ESTest extends Soundex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Soundex soundex0 = new Soundex("~>p,(,Bp~)?6/9'obt");
      int int0 = soundex0.difference("~>p,(,Bp~)?6/9'obt", ":B!^g");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Soundex soundex0 = new Soundex("", false);
      // Undeclared exception!
      try { 
        soundex0.encode("Ax7d");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: A (index=0)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH;
      soundex0.setMaxLength(0);
      int int0 = soundex0.getMaxLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      soundex0.setMaxLength((-163));
      int int0 = soundex0.getMaxLength();
      assertEquals((-163), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.encode((String) null);
      assertNull(string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.US_ENGLISH_SIMPLIFIED.encode("E000");
      assertEquals("E000", string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      int int0 = soundex0.difference(",jx", ",jx");
      assertEquals(4, int0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[5];
      Soundex soundex0 = new Soundex(charArray0);
      // Undeclared exception!
      try { 
        soundex0.soundex("<ul@d");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: U (index=20)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Soundex soundex0 = new Soundex("", true);
      // Undeclared exception!
      try { 
        soundex0.encode((Object) "ZdU:BKqQu)E|w^&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: Z (index=25)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Soundex soundex0 = new Soundex("", true);
      // Undeclared exception!
      try { 
        soundex0.difference("", "[OecIAx^-P[P");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: O (index=14)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Soundex soundex0 = null;
      try {
        soundex0 = new Soundex((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Soundex soundex0 = null;
      try {
        soundex0 = new Soundex((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Soundex soundex0 = null;
      try {
        soundex0 = new Soundex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.soundex("B?6-^fQHU'}Sm5");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("B225", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Soundex soundex0 = new Soundex("");
      String string0 = soundex0.US_ENGLISH_GENEALOGY.soundex(" (index=");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("I532", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.US_ENGLISH_GENEALOGY.soundex("01230120022455012623010202");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      soundex0.soundex((String) null);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      Object object0 = soundex0.encode((Object) "LSWGk.E>HI^gC6bPg");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("L221", object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.soundex("r5R=CW$%vY5%jOhC");
      assertNotNull(string0);
      assertEquals("R212", string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Soundex soundex0 = new Soundex("-123-12--22455-12623-1-2-2");
      Object object0 = new Object();
      try { 
        soundex0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Soundex encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '-';
      Soundex soundex0 = new Soundex(charArray0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.encode("");
      assertEquals("", string0);
      assertEquals(4, soundex0.getMaxLength());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH_SIMPLIFIED;
      int int0 = soundex0.getMaxLength();
      assertEquals(4, int0);
  }
}
