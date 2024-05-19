
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
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.codec.language.bm.NameType;
import org.apache.commons.codec.language.bm.PhoneticEngine;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.commons.codec.language.bm.RuleType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PhoneticEngine_ESTest extends PhoneticEngine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      String string0 = phoneticEngine0.encode("d'");
      assertEquals("", string0);
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 4);
      boolean boolean0 = phoneticEngine0.isConcat();
      assertTrue(boolean0);
      assertEquals(4, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(0, int0);
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-322));
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertTrue(phoneticEngine0.isConcat());
      assertEquals((-322), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode((String) null, languages_LanguageSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-1465));
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("$VALUES", languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1465
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("", languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for sep, rules, .
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      // Undeclared exception!
      phoneticEngine0.encode("orgapaxekomonskodeklanguadZebmrulefonemelist|orgapaxekomonskodeklanguadZebmrulephonemelist|orgapaxekomonskodeklanguagebmrulefonemelist|orgapaxekomonskodeklanguagebmrulephonemelist|orgapaxekomonskodeklanguaxebmrulefonemelist|orgapaxekomonskodeklanguaxebmrulephonemelist|orgapaxekomonskodeklanhuagebmrulefonemelist|orgapaxekomonskodeklanhuagebmrulephonemelist|orgapaxekomonskodetslanguagebmrulefonemelist|orgapaxekomonskodetslanguagebmrulephonemelist");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Lang", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-1));
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("Qv4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.RULES;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("des", languages_LanguageSet0);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      String string0 = phoneticEngine0.encode("-S>!W-y*91$", languages_LanguageSet0);
      assertEquals("-", string0);
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("|]w");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("|]w", languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 1);
      assertEquals(1, rule_Phoneme0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("}OTf?I&%en*k]O4D");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("}OTf?I&%en*k]O4D", languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 4);
      assertEquals(1, rule_Phoneme0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 378);
      assertEquals(1, rule_Phoneme0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      String string0 = phoneticEngine_PhonemeBuilder0.makeString();
      assertFalse(linkedHashSet0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
      Set<Rule.Phoneme> set0 = phoneticEngine_PhonemeBuilder0.getPhonemes();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RuleType ruleType0 = RuleType.APPROX;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.GENERIC;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 125);
      String string0 = phoneticEngine0.encode("del exact", languages_LanguageSet0);
      assertEquals(125, phoneticEngine0.getMaxPhonemes());
      assertEquals("(igzak|igzakt|igzatst|igzok|igzokt|igzotst|iksak|iksakt|iksatst|iksok|iksokt|iksotst|isakt|isokt|izakt|izokt)-(diligzak|diligzakt|diligzatst|diligzok|diligzokt|diligzotst|diliksak|diliksakt|diliksatst|diliksok|diliksokt|diliksotst|dilisakt|dilisokt|dilizakt|dilizokt)", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      String string0 = phoneticEngine0.encode("cdRiE;TX_m|<F;h");
      assertEquals("gdriitzmf", string0);
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.RULES;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      String string0 = phoneticEngine0.encode("gdriitzmf", languages_LanguageSet0);
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals("", string0);
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      boolean boolean0 = phoneticEngine0.isConcat();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      phoneticEngine0.getRuleType();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      phoneticEngine0.getLang();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      phoneticEngine0.getNameType();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 1);
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.append((CharSequence) null);
  }
}
