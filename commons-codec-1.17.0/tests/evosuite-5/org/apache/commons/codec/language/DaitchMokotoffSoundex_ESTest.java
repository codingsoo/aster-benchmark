
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
import org.apache.commons.codec.language.DaitchMokotoffSoundex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DaitchMokotoffSoundex_ESTest extends DaitchMokotoffSoundex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(false);
      String string0 = daitchMokotoffSoundex0.encode("CLe (NaN?$@Mo*&");
      //  // Unstable assertion: assertEquals("000000", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(true);
      // Undeclared exception!
      try { 
        daitchMokotoffSoundex0.soundex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.DaitchMokotoffSoundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      String string0 = daitchMokotoffSoundex0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      try { 
        daitchMokotoffSoundex0.encode((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.DaitchMokotoffSoundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(false);
      Object object0 = daitchMokotoffSoundex0.encode((Object) "747600");
      assertNotNull(object0);
      assertEquals("000000", object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(true);
      String string0 = daitchMokotoffSoundex0.encode("/*\u00FE=b");
      assertEquals("700000", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(false);
      String string0 = daitchMokotoffSoundex0.encode("Malformed folding statement - patterns are not single characters: ");
      //  // Unstable assertion: assertEquals("000000", string0);
      //  // Unstable assertion: assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(true);
      String string0 = daitchMokotoffSoundex0.encode("1/]EPp!tsP/amX");
      //  // Unstable assertion: assertEquals("000000", string0);
      //  // Unstable assertion: assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      String string0 = daitchMokotoffSoundex0.soundex("095744|095745|095754|095755");
      assertEquals("000000", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      String string0 = daitchMokotoffSoundex0.soundex("org.apache.commons.codec.language.DaitchMokotoffSoundex");
      //  // Unstable assertion: assertEquals("095444|095454|095544|095554", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      String string0 = daitchMokotoffSoundex0.soundex("9+pdSM^nK'T");
      assertEquals("746653", string0);
  }
}
