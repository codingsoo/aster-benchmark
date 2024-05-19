
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
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.nysiis("ORGAPACACANANSCADACLANGAGANYS");
      assertEquals("ORGAPACACANANSCADACLANGAGANY", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.encode("org.apache.commons.codec.language.Nysiis");
      assertEquals("ORGAPACACANANSCADACLANGAGANYS", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("%qp)mr~k");
      assertEquals("QPNRC", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = nysiis0.encode((Object) "j|iH@!`");
      assertEquals("J", object0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      boolean boolean0 = nysiis0.isStrict();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.encode("");
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("X+3<WJMH5Z");
      assertEquals("XWJN", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(true);
      nysiis0.nysiis("");
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.nysiis((String) null);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      boolean boolean0 = nysiis0.isStrict();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("(EE|IE)$");
      assertEquals("EY", string0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("2By");
      assertTrue(nysiis0.isStrict());
      assertEquals("BY", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      nysiis0.nysiis("Y");
      assertFalse(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.encode((String) null);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = new Object();
      try { 
        nysiis0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Nysiis encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Nysiis", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("\"Zw'xJ`$`qw]qjTxoW");
      assertEquals("ZWXJGW", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("K1rvu<=h;Z{(");
      assertNotNull(string0);
      assertEquals("CRV", string0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.encode("@Qqeh3a([0");
      assertNotNull(string0);
      assertEquals("QGAH", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("JyQ5#K#.n->6@*%");
      assertTrue(nysiis0.isStrict());
      assertNotNull(string0);
      assertEquals("JYGN", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("+Y>ZP^h ,l");
      assertTrue(nysiis0.isStrict());
      assertEquals("YSFL", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("he0*VU,;'");
      assertEquals("HAF", string0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("org.apache.commons.codec.EncUderException");
      assertEquals("ORGAPA", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("_oKqeab\"q?r");
      assertEquals("OCGABG", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("!6lSc1HY5");
      assertNotNull(string0);
      assertEquals("LSY", string0);
  }
}
