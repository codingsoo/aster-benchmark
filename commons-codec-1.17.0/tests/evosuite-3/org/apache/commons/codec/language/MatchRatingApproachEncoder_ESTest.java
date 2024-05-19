
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
import org.apache.commons.codec.language.MatchRatingApproachEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MatchRatingApproachEncoder_ESTest extends MatchRatingApproachEncoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.removeDoubleConsonants("org.apache.commons.codec.EncoderException");
      assertEquals("ORG.APACHE.COMONS.CODEC.ENCODEREXCEPTION", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("org.apache.commons.codec.EncoderException", ")(JVK");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      int int0 = matchRatingApproachEncoder0.getMinRating(7);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("EQ", "BB");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.removeDoubleConsonants("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.removeAccents("[,]");
      assertEquals("[,]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.removeAccents("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      int int0 = matchRatingApproachEncoder0.leftToRightThenRightToLeftProcessing("XV)M[", "5ZMiHZ");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      int int0 = matchRatingApproachEncoder0.leftToRightThenRightToLeftProcessing("[,]", "[,]");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isVowel("E");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isVowel("_KWz<J");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.getFirst3Last3("Ac4");
      assertEquals("Ac4", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.getFirst3Last3("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.cleanName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      // Undeclared exception!
      try { 
        matchRatingApproachEncoder0.removeVowels("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      // Undeclared exception!
      try { 
        matchRatingApproachEncoder0.removeVowels((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.MatchRatingApproachEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      // Undeclared exception!
      try { 
        matchRatingApproachEncoder0.removeDoubleConsonants((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.MatchRatingApproachEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      // Undeclared exception!
      try { 
        matchRatingApproachEncoder0.leftToRightThenRightToLeftProcessing("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.MatchRatingApproachEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      // Undeclared exception!
      try { 
        matchRatingApproachEncoder0.isVowel((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      // Undeclared exception!
      try { 
        matchRatingApproachEncoder0.getFirst3Last3((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.MatchRatingApproachEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      // Undeclared exception!
      try { 
        matchRatingApproachEncoder0.cleanName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.MatchRatingApproachEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.encode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.cleanName("\u00C0\u00E0\u00C8\u00E8\u00CC\u00EC\u00D2\u00F2\u00D9\u00F9\u00C1\u00E1\u00C9\u00E9\u00CD\u00ED\u00D3\u00F3\u00DA\u00FA\u00DD\u00FD\u00C2\u00E2\u00CA\u00EA\u00CE\u00EE\u00D4\u00F4\u00DB\u00FB\u0176\u0177\u00C3\u00E3\u00D5\u00F5\u00D1\u00F1\u00C4\u00E4\u00CB\u00EB\u00CF\u00EF\u00D6\u00F6\u00DC\u00FC\u0178\u00FF\u00C5\u00E5\u00C7\u00E7\u0150\u0151\u0170\u0171");
      assertEquals("AAEEIIOOUUAAEEIIOOUUYYAAEEIIOOUUYYAAOONNAAEEIIOOUUYYAACCOOUU", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.removeAccents((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("org.apache.commons.codec.EncoderException", "Ac4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.removeVowels("E");
      assertEquals("E", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("B`GL6", ",B`gL6");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("R?TQ}W", "FF");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("org.apache.commons.codec.EncoderException", "org.apache.commons.codec.EncoderException");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("$0fxGf+@,z/zDx6PCB", "E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("*", "*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("8T", " ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals(",B`gL6", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals(";+)w^]?m", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals(" ", " ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals((String) null, "*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      int int0 = matchRatingApproachEncoder0.getMinRating(599);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("D*a+&#PKE&", "UN+3e6R1uLdYX3Z0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      int int0 = matchRatingApproachEncoder0.getMinRating(6);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      boolean boolean0 = matchRatingApproachEncoder0.isEncodeEquals("%*", "r<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.encode("0Qxmwff;&mUk+");
      assertEquals("0QXMK+", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.encode("#");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.encode(" ");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      Object object0 = matchRatingApproachEncoder0.encode((Object) "");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.encode((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      Object object0 = new Object();
      try { 
        matchRatingApproachEncoder0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Match Rating Approach encoder is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.MatchRatingApproachEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      Object object0 = matchRatingApproachEncoder0.encode((Object) "ID:");
      assertEquals("ID:", object0);
  }
}
