
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
      String string0 = metaphone0.metaphone("AD5");
      assertEquals("AT", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      boolean boolean0 = metaphone0.isMetaphoneEqual("", "PXKSLNMRJ");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("ar`wAx#sW5");
      assertEquals("ARWK", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.setMaxCodeLen((-948));
      int int0 = metaphone0.getMaxCodeLen();
      assertEquals((-948), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("2f] `Zwia:kn7F");
      assertEquals("FSWK", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("ZO\"fOSF>f%JL/)x=");
      //  // Unstable assertion: assertEquals("SFXF", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("LCk_H_]Re7LG]G4");
      //  // Unstable assertion: assertEquals(4, metaphone0.getMaxCodeLen());
      //  // Unstable assertion: assertEquals("LXRL", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("%HEbb@I?&>");
      assertEquals("HB", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("TCH");
      assertEquals("X", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("yL$tghQ");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("LTK", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("MyVDGNQA6oT");
      assertEquals("MFTN", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("k4!(mB");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("KM", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("w+");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("Wr,{v+cs 7T Ax");
      //  // Unstable assertion: assertEquals("RFXX", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("GN");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("WhcX'T]9YQ{nlJyJ");
      //  // Unstable assertion: assertEquals("KKSX", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("xl2gb");
      //  // Unstable assertion: assertEquals("SLB", string0);
      //  // Unstable assertion: assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("K6SgaasAr_");
      //  // Unstable assertion: assertEquals(4, metaphone0.getMaxCodeLen());
      //  // Unstable assertion: assertEquals("KSXR", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("E");
      assertEquals("E", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.metaphone("");
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.metaphone((String) null);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      int int0 = metaphone0.getMaxCodeLen();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("N>^oFW}*KX7Fy;7rh6");
      assertEquals("NFKK", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("EIY");
      assertEquals("E", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      Object object0 = metaphone0.encode((Object) "XRS");
      //  // Unstable assertion: assertEquals("XRS", object0);
      //  // Unstable assertion: assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.setMaxCodeLen(5806);
      boolean boolean0 = metaphone0.isMetaphoneEqual("DEq]\"LTcK", "RM(");
      assertEquals(5806, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("H*9| SL<'@'~");
      //  // Unstable assertion: assertEquals(4, metaphone0.getMaxCodeLen());
      //  // Unstable assertion: assertEquals("XL", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("GE");
      assertEquals("J", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      Object object0 = metaphone0.encode((Object) "TGH");
      assertEquals("T", object0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("G.");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.setMaxCodeLen(928);
      boolean boolean0 = metaphone0.isMetaphoneEqual("6j*RB", "uA;scB8dLh$5D}");
      assertEquals(928, metaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.encode("CHE");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("K", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("CHM");
      assertEquals(4, metaphone0.getMaxCodeLen());
      assertEquals("XM", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("}qy}ci{T4g3:0LO`^jW");
      //  // Unstable assertion: assertEquals(4, metaphone0.getMaxCodeLen());
      //  // Unstable assertion: assertEquals("KSLJ", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("0paC");
      assertEquals("PK", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("SCB");
      //  // Unstable assertion: assertEquals("XKB", string0);
      //  // Unstable assertion: assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone(";mB6-jr_XKj;BKqg`b(");
      assertEquals("MBJR", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.setMaxCodeLen(63);
      metaphone0.metaphone("Parameter supplied to Metaphone encode is not of type java.lang.String");
      assertEquals(63, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.isMetaphoneEqual("WhcX'T]9YQ{nlJyJ", "WhcX'T]9YQ{nlJyJ");
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      String string0 = metaphone0.metaphone("AEIOU");
      assertEquals("E", string0);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      try { 
        metaphone0.encode((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Metaphone encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Metaphone", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      metaphone0.encode((String) null);
      assertEquals(4, metaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Metaphone metaphone0 = new Metaphone();
      assertEquals(4, metaphone0.getMaxCodeLen());
      
      metaphone0.setMaxCodeLen(0);
      int int0 = metaphone0.getMaxCodeLen();
      assertEquals(0, int0);
  }
}
