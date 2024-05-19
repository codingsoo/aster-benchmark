
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
import org.apache.commons.codec.language.Nysiis;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Nysiis_ESTest extends Nysiis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("Zy~$!-du]Ys<NA[h");
      assertEquals("ZYDAYS", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      boolean boolean0 = nysiis0.isStrict();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("Hz\"");
      assertTrue(nysiis0.isStrict());
      assertEquals("H", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      nysiis0.nysiis("");
      assertFalse(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(true);
      nysiis0.nysiis((String) null);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      boolean boolean0 = nysiis0.isStrict();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("(EE|IE)$");
      assertTrue(nysiis0.isStrict());
      assertEquals("EY", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.nysiis("^KN");
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      nysiis0.encode(",%");
      assertFalse(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      nysiis0.encode((String) null);
      assertFalse(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      try { 
        nysiis0.encode((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Nysiis encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Nysiis", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = nysiis0.encode((Object) "iFbeh3$]I&(k7e");
      assertNotNull(object0);
      assertEquals("IFBAHA", object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("org.apache.commons.codec.language.SoundexUtils");
      assertEquals("ORGAPA", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = nysiis0.encode((Object) "$gJm@fUvp-)7hN6P]g`");
      assertNotNull(object0);
      assertEquals("GJNFAV", object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      Object object0 = nysiis0.encode((Object) "ZFDWSCAP");
      assertEquals("ZFDWSCAP", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.encode("//8'AW4s8ch617n`_o");
      assertNotNull(string0);
      assertEquals("ASN", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("wcQLNEVbaLxPq");
      assertEquals("WCGLNA", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = nysiis0.encode((Object) "mMik&,XyFIhru>NB");
      assertEquals("MNACXY", object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("7qLbV/KND|2TBly7U");
      assertEquals("QLBVND", string0);
  }
}
