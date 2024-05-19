
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
import org.apache.commons.codec.language.Metaphone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Metaphone_ESTest extends Metaphone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      Object object0 = metaphone0.encode((Object) "am");
      assertEquals("AM", object0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      assertEquals(4, metaphone0.getMaxCodeLen());
      
      metaphone0.setMaxCodeLen(0);
      int int0 = metaphone0.getMaxCodeLen();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.setMaxCodeLen((-2591));
      int int0 = metaphone0.getMaxCodeLen();
      assertEquals((-2591), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.encode("");
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("+P1YzJ^;~W?!~W");
      assertEquals("PSJ", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("SIA");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("PLFK");
      assertEquals("PLFK", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("ZhO:RS&vR");
      //  // Unstable assertion: assertEquals("SHRX", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("h^i");
      assertEquals("", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("GE");
      assertEquals("J", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("G.AP");
      assertEquals("KP", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.setMaxCodeLen(6);
      metaphone0.metaphone("7rM t-Ubgm");
      assertEquals(6, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("'+d$&Z*DuGh");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("TST", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("34WldB");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("LTB", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("org.apache.commons.codec.EncoderException");
      //  // Unstable assertion: assertEquals("ORPX", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("CHE");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("CH");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("sC=:!r!TsZu]");
      //  // Unstable assertion: assertEquals("SKRX", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("Esc");
      assertEquals("ESK", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("9Gh;Z1i[4");
      assertEquals("S", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("Ac?%&OG?Rt");
      //  // Unstable assertion: assertEquals("AKRT", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("GNED");
      assertEquals("NT", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("W%[");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("XQR cin~Nj?}");
      //  // Unstable assertion: assertEquals("XKRX", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("Ae3y&3qQH*49b1pP");
      assertEquals("EKBP", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.metaphone("");
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.metaphone((String) null);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      int int0 = metaphone0.getMaxCodeLen();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.setMaxCodeLen(835);
      boolean boolean0 = metaphone0.isMetaphoneEqual(" 153z8Scj#31}y", "?<5cw`$1'r");
      assertEquals(835, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.setMaxCodeLen(6);
      metaphone0.metaphone("m}wwLDt5T?+uG");
      assertEquals(6, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.setMaxCodeLen(78);
      metaphone0.metaphone("Parameter supplied to Metaphone encode is not of type java.lang.String");
      assertEquals(78, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("*CkW6#Q:=;J");
      //  // Unstable assertion: assertEquals("XKJ", string0);
      //  // Unstable assertion: assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("40ugzHAz", "");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("", "H6^Tx");
      assertFalse(boolean0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("Gy-\"7R{rL<p");
      assertEquals("JRRL", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("CIL");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("SL", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.isMetaphoneEqual("Esc", "Esc");
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("RLMB");
      assertEquals("RLM", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("Mbds/*~DKz7i");
      //  // Unstable assertion: assertEquals("MBTX", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("KP");
      assertEquals("KP", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("K");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("BP-g<u4wE'x&+D`");
      //  // Unstable assertion: assertEquals("BPWK", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      Object object0 = new Object();
      try { 
        metaphone0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Metaphone encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Metaphone", e);
      }
  }
}
