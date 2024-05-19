
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
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("&y3^", "FX");
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("SC", "Kloe,YzCf&^g9F:6s", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("IJhGSy&gGm", true);
      assertEquals("AJKS", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      char char0 = doubleMetaphone0.charAt("*8kKZD7Aan2skh", 354);
      assertEquals('\u0000', char0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult((-3085));
      boolean boolean0 = doubleMetaphone_DoubleMetaphoneResult0.isComplete();
      assertTrue(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult((-790));
      doubleMetaphone_DoubleMetaphoneResult0.append('&');
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
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
      doubleMetaphone0.setMaxCodeLen((-2272));
      int int0 = doubleMetaphone0.getMaxCodeLen();
      assertEquals((-2272), int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("5|Y");
      assertEquals("", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone(": ", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("|");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      boolean boolean0 = DoubleMetaphone.contains("", 0, 0, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String[] stringArray0 = new String[0];
      boolean boolean0 = DoubleMetaphone.contains("PSK2", 67, 67, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      char char0 = doubleMetaphone0.charAt("5,", 0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals('5', char0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      char char0 = doubleMetaphone0.charAt("BACHER", 2);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals('C', char0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-2387));
      // Undeclared exception!
      try { 
        doubleMetaphone0.isDoubleMetaphoneEqual("mr_j#ggtr8R+N07*d", "", false);
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
      doubleMetaphone0.setMaxCodeLen((-6280));
      // Undeclared exception!
      try { 
        doubleMetaphone0.isDoubleMetaphoneEqual("", "0`'4,C?W");
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
      doubleMetaphone0.setMaxCodeLen((-2200));
      // Undeclared exception!
      try { 
        doubleMetaphone0.encode(":72^C0$\"X");
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
      doubleMetaphone0.setMaxCodeLen((-127));
      // Undeclared exception!
      try { 
        doubleMetaphone0.encode((Object) "8Xw4p5jzI/MPr");
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
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-289));
      // Undeclared exception!
      try { 
        doubleMetaphone0.doubleMetaphone("Zk~T6XP~J\"=j~Ua", true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-289));
      // Undeclared exception!
      try { 
        doubleMetaphone0.doubleMetaphone("%N7@#k");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        DoubleMetaphone.contains("SAN ", 0, (-1277), stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      // Undeclared exception!
      try { 
        DoubleMetaphone.contains("org.apache.commons.codec.EncoderException", 5, 0, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      // Undeclared exception!
      try { 
        doubleMetaphone0.charAt((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("N7mm1%lxe#eI2&1Ma!", true);
      assertEquals("NMLK", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("FKTJ", true);
      assertEquals("FKT ", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(543);
      boolean boolean0 = doubleMetaphone_DoubleMetaphoneResult0.isComplete();
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary("");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(643);
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary('k');
      assertEquals("k", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate("&BL[f#{RPz/mi");
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate("");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(543);
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate('F');
      assertEquals("F", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      int int0 = doubleMetaphone0.getMaxCodeLen();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(643);
      doubleMetaphone_DoubleMetaphoneResult0.getPrimary();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(4231);
      doubleMetaphone_DoubleMetaphoneResult0.append("!o\"z.]");
      assertEquals("!o\"z.]", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(4231);
      doubleMetaphone_DoubleMetaphoneResult0.getAlternate();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(4231);
      doubleMetaphone_DoubleMetaphoneResult0.append('c', 'c');
      assertEquals("c", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("dN&5gZccZ+~B<N*M", true);
      assertEquals("TNKT", string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("/+p1-TrCj", "WITZ");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("Zk~T6XP~J\"=j~Ua");
      assertEquals("SKTK", string0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("PNWICZ", false);
      assertEquals("NTS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("OWSKI");
      assertEquals("ASK", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("uWR>'du.Nm<");
      assertNotNull(string0);
      assertEquals("ARTN", string0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "-oK9$>~TDN", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("TCH");
      assertEquals("X", string0);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen(4231);
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException", "org.apache.commons.codec.EncoderException");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen(72);
      doubleMetaphone0.encode("Db0z%ysWSS");
      assertEquals(72, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("SLSPK", "X[l>4\"osZBW?-y6wgY");
      assertTrue(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("kSIA");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
      assertEquals("KS", string0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("bd%C-E!4);ZP4N", "SIO", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "SH", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "SUGAR");
      assertEquals("XKR", object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("SCH", "SCH", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("ISL");
      assertEquals("AL", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("^rR+!*DV9$ZH%a<V");
      assertEquals("RTFJ", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("IER", true);
      assertEquals("AR", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("WR", "WR");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("Q", "@D%=bIw=Sjj");
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "gIAJKBIb;b{NCc%y^>");
      assertEquals("JKPP", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("JW", "JW", false);
      assertTrue(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("JOSE");
      assertEquals("HS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("HOLZ");
      assertEquals("HLS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "u+)u*> r[ruhrX");
      assertEquals("ARRR", object0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("gHROL=th#Y-AO");
      assertEquals("KRL0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "4Eagv4^?GGTM51\"S~:");
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("AGGI", "AGGI");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("OGY", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("DANGER", false);
      assertEquals("TNJR", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("xkgN7;p=Q{I", "xkgN7;p=Q{I", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("KGnI\"?K");
      assertEquals("KKNK", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("w%GdjS ,w", "NE1Nghw p%2/");
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "Dg.A>yK)QI487@|+");
      assertNotNull(object0);
      assertEquals("TKKK", object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual(";ur9R{!UacyJ8 Rx24", "", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("i", "CIA", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("ARTN", "MR{:I1Cqh)ai4<{");
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("2pBu|-aI<sdh#ccv-8", false);
      assertEquals("PSTK", string0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("WICZ", false);
      assertEquals("AKS", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(2263);
      try { 
        doubleMetaphone0.encode((Object) doubleMetaphone_DoubleMetaphoneResult0);
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
      doubleMetaphone0.setMaxCodeLen(1782);
      assertEquals(1782, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone(";2NBVFngyu\"Vva&c", true);
      assertEquals("NPFFNJFK", string0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("GNN>", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen(2287);
      String string0 = doubleMetaphone0.doubleMetaphone("ARKPKKMNSKTKPNRSTRNKTLS", true);
      assertEquals("ARKPKMNSKTKPNRSTRNKTLS", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("ff");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("F", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("m,E=}qaAbb|wvj", true);
      assertEquals("MKPF", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "p#Du+/WAz{A", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "dDg.A>yK)QI487@|+");
      assertEquals("TKKK", object0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("ILLA");
      assertEquals("AL", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual((String) null, "HlL5T|");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("G-e_chaYS1?N#", true);
      assertNotNull(string0);
      assertEquals("KKSN", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("ORCHES", false);
      assertEquals("ARKS", string0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("'Y", "CHORE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("MACHER");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("MKR", string0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("PSACH");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("SK", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("4'", "CH");
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("CHIA", "CHIA");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      char char0 = doubleMetaphone0.charAt("", (-3635));
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(1);
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary("x :_");
      boolean boolean0 = doubleMetaphone_DoubleMetaphoneResult0.isComplete();
      assertEquals("x", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary('3');
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.append("ED", "dDg.A>yK)QI487@|+");
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate(')');
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen(2287);
      doubleMetaphone0.encode("org.apache.commonscodec.binary.StringUtils");
      assertEquals(2287, doubleMetaphone0.getMaxCodeLen());
  }
}
