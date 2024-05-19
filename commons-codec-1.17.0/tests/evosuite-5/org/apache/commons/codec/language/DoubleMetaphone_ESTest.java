
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
import org.apache.commons.codec.language.DoubleMetaphone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DoubleMetaphone_ESTest extends DoubleMetaphone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("0ZYJ`H2]EqZ{4F_E&)u", true);
      assertEquals("SJKS", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("Gk@$%`wZ*+I", false);
      assertEquals("KKS", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("^r'w", ".w/Q9kiTp", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      char char0 = doubleMetaphone0.charAt("wB@A{vm@&P", 79);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult((-838));
      doubleMetaphone_DoubleMetaphoneResult0.append('q', '?');
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen(0);
      int int0 = doubleMetaphone0.getMaxCodeLen();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen(0);
      String string0 = doubleMetaphone0.encode("2vt!Nw0jHo");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "");
      assertNull(object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone(".i9 )|", false);
      assertEquals("", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("3I");
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[1] = "";
      boolean boolean0 = DoubleMetaphone.contains("", 0, 0, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String[] stringArray0 = new String[4];
      boolean boolean0 = DoubleMetaphone.contains("{c&^", 820, (-698), stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      char char0 = doubleMetaphone0.charAt("KTTF", 1);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals('T', char0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-103));
      // Undeclared exception!
      try { 
        doubleMetaphone0.isDoubleMetaphoneEqual("NI.E", "", true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-4307));
      // Undeclared exception!
      try { 
        doubleMetaphone0.isDoubleMetaphoneEqual("%1N>XyGK`7rd", "");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-1081));
      // Undeclared exception!
      try { 
        doubleMetaphone0.encode("tVz6%-.+><H");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-50236687));
      // Undeclared exception!
      try { 
        doubleMetaphone0.encode((Object) "ET");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-4307));
      // Undeclared exception!
      try { 
        doubleMetaphone0.doubleMetaphone("wjOeUt\"RJf", true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-2598));
      // Undeclared exception!
      try { 
        doubleMetaphone0.doubleMetaphone(" tvD:&~qpX}f9)A7C");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        DoubleMetaphone.contains("PSDE", 1620, (-2396), stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        DoubleMetaphone.contains((String) null, 1101, 1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      // Undeclared exception!
      try { 
        doubleMetaphone0.charAt((String) null, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("FX", true);
      assertEquals("FKS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult((-838));
      boolean boolean0 = doubleMetaphone_DoubleMetaphoneResult0.isComplete();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(3026);
      boolean boolean0 = doubleMetaphone_DoubleMetaphoneResult0.isComplete();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary("");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary('u');
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(7210);
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary(']');
      assertEquals("]", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult((-952));
      // Undeclared exception!
      try { 
        doubleMetaphone_DoubleMetaphoneResult0.appendAlternate("A");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // start 0, end -952, s.length() 1
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(7210);
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate("IER");
      assertEquals("IER", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(41);
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate('Z');
      assertEquals("Z", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult((-796));
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate('-');
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      int int0 = doubleMetaphone0.getMaxCodeLen();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult((-512));
      doubleMetaphone_DoubleMetaphoneResult0.getPrimary();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(1551);
      doubleMetaphone_DoubleMetaphoneResult0.append('i');
      assertEquals("i", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(1551);
      doubleMetaphone_DoubleMetaphoneResult0.getAlternate();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("+1n\"iGLzIte!VH*K");
      assertEquals("NKLS", string0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("GNX");
      assertNotNull(string0);
      assertEquals("NKS", string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "OWSKY");
      assertEquals("ASK", object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("W^gk1h");
      assertEquals("KK", string0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "WH");
      assertEquals("A", object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "WuO/w%&D!/07^yM");
      assertNotNull(object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("ATM", object0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("BA>6b.`gWr4c", false);
      assertNotNull(string0);
      assertEquals("PPKR", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("sf3<", "KTTF", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("TTH", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("TIA", true);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("X", "KSS");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("SC", false);
      assertEquals("SK", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual((String) null, "pSzj=( vBGFa]4.2Ewh");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "SKR");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("SKR", object0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("SIA");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("S", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException", "0l'moGu#sH@]?");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("SUGAR");
      assertEquals("XKR", string0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("Sw", "org.apache.commons.codec.EncoderException");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "YSL", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("IER");
      assertEquals("A", string0);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("MKR", "JjWxgPdhw.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("an+,=&VPb=QT6rPi=|s", false);
      assertNotNull(string0);
      assertEquals("ANFP", string0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("|_#&QpH.=51B1Fk<[6O");
      assertEquals("KFPF", string0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("UOV0AJl(,1psb", false);
      assertEquals("AFLP", string0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("(+oJ", true);
      assertEquals(" ", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone(".>v&w8.VAj9", true);
      assertEquals("FFJ", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("uHwY", false);
      assertEquals("A", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("HARIS", (String) null);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("dKGg`~g}R<", false);
      assertEquals("TKKK", string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("AGGI");
      assertEquals("AJ", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("RANGER", "6\"?t\"]os7+05%vA");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("Gs*}IT4h5*RZxs", true);
      assertEquals("KSTR", string0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("_'G?I/gN6(bK", "_'G?I/gN6(bK");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("AoGn[Y");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AN", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual((String) null, "XgNf.}", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("?SW0_dgC=HZ", "2^K!yu", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("CC", (String) null, false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("%}", "CIA", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("CI", (String) null);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("WR?NQRYN)~@", "KRN7CgV@JSDDpCg}H", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("GNUCCES", false);
      assertEquals("NKSS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("UCCES", "UCCES");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = new Object();
      try { 
        doubleMetaphone0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // DoubleMetaphone encode parameter is not of type String
         //
         verifyException("org.apache.commons.codec.language.DoubleMetaphone", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("rBYju#vVyMY{\f@");
      assertEquals("RPJF", string0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("4qQR9r0[1H(l{FU", "4qQR9r0[1H(l{FU");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("Q?7ENn):Q-zu[YV", false);
      assertNotNull(string0);
      assertEquals("KNKS", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen(81);
      String string0 = doubleMetaphone0.doubleMetaphone("ARKPKKMNSKTKNKTRKSPXN", false);
      assertEquals("ARKPKMNSKTKNKTRKSPKSN", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("`3Hvffv%sj^N");
      assertEquals("FFFS", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("$3?Pj:t4r5h9H> c)", "z1,|U,mQUN+Okf", true);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen(81);
      doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.binary.StringUtils", false);
      assertEquals(81, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("V", "UMB");
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("XChh", "XChh");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("K&|qxFYbTy9A`", "CH");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("CHORE", (String) null, true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("MACHER");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("MKR", string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen(81);
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException", "ARKP");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("ORCHID", "<fdC", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("CHIA", "CHIA");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.doubleMetaphone((String) null, false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      char char0 = doubleMetaphone0.charAt(": ", (-1250));
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(4);
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary("cZ|<-@!W[ulz");
      boolean boolean0 = doubleMetaphone_DoubleMetaphoneResult0.isComplete();
      assertEquals("cZ|<", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(4);
      doubleMetaphone_DoubleMetaphoneResult0.append("*Mza]n>A", "L9#?T");
      assertEquals("L9#?", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-917));
      int int0 = doubleMetaphone0.getMaxCodeLen();
      assertEquals((-917), int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("LLj,=q}");
      assertEquals("LK", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.append('D', 'p');
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.append("");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }
}
