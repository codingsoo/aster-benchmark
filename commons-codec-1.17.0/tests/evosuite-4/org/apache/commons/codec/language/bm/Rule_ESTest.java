
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
import java.nio.CharBuffer;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.codec.language.bm.NameType;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.commons.codec.language.bm.RuleType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Rule_ESTest extends Rule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("_MWBOy~Y", languages_LanguageSet0);
      Rule rule0 = new Rule("_MWBOy~Y", "ANY_LANGUAGE", "_MWBOy~Y", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("_MWBOy~Y[NO_LANGUAGES]", 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0);
      Rule.Phoneme rule_Phoneme2 = new Rule.Phoneme(rule_Phoneme1, rule_Phoneme0, languages_LanguageSet0);
      assertEquals(1, rule_Phoneme2.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      int int0 = rule_PhonemeList0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      int int0 = rule_Phoneme0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      Rule rule0 = new Rule("", "", "", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("", 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rule rule0 = new Rule("2Kce~s!tSZ[#w^", "z", (String) null, (Rule.PhonemeExpr) null);
      rule0.getPhoneme();
      assertEquals("2Kce~s!tSZ[#w^", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      Rule rule0 = new Rule((String) null, "", (String) null, rule_Phoneme0);
      String string0 = rule0.getPattern();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      Rule rule0 = new Rule("", "", "", rule_Phoneme0);
      String string0 = rule0.getPattern();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Rule rule0 = new Rule("ALL", (String) null, "ALL", rule_Phoneme0);
      // Undeclared exception!
      try { 
        rule0.patternAndContextMatches("ALL[NO_LANGUAGES]", 2147483645);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("5", languages_LanguageSet0);
      Rule rule0 = new Rule("nJtbj{W{H5>9=\"Lr->", "nJtbj{W{H5>9=\"Lr->", "5", rule_Phoneme0);
      // Undeclared exception!
      try { 
        rule0.patternAndContextMatches((CharSequence) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, ruleType0, (Languages.LanguageSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, ruleType0, (Languages.LanguageSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.RULES;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("&-qoPLLP");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, ruleType0, languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for sep, rules, &-qoPLLP.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, (RuleType) null, "z^rn0r\"1ro!(?=!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.RULES;
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, ruleType0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, rules, .
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.RULES;
      Map<String, List<Rule>> map0 = Rule.getInstanceMap(nameType0, ruleType0, languages_LanguageSet0);
      assertEquals(71, map0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, ruleType0, languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, exact, .
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Rule rule0 = new Rule("ALL", (String) null, "ALL", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("ALL[NO_LANGUAGES]", 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Rule rule0 = new Rule("ALL", (String) null, "ALL", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("ALL", 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("w'_*`^~PAEKI5!o~&f", languages_LanguageSet0);
      Rule rule0 = new Rule("", "w'_*`^~PAEKI5!o~&f", "", rule_Phoneme0);
      // Undeclared exception!
      try { 
        rule0.patternAndContextMatches("", (-697));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Can not match pattern at negative indexes
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("_MWBOy~Y", languages_LanguageSet0);
      Rule rule0 = new Rule("_MWBOy~Y", "ANY_LANGUAGE", "(:Bx", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("_MWBOy~Y[NO_LANGUAGES]", 0);
      assertEquals("_MWBOy~Y", rule0.getPattern());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("w'_*`^~PAEKI5!o~&f", languages_LanguageSet0);
      Rule rule0 = new Rule("PpunT=wodeazCj}jh", "w'_*`^~PAEKI5!o~&f", "PpunT=wodeazCj}jh", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("PpunT=wodeazCj}jh", 0);
      assertFalse(boolean0);
      assertEquals("PpunT=wodeazCj}jh", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList((List<Rule.Phoneme>) null);
      Rule rule0 = new Rule("", "ash", "ash", rule_PhonemeList0);
      boolean boolean0 = rule0.patternAndContextMatches("ash", 0);
      assertFalse(boolean0);
      assertEquals("", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("\"q0^z", (Languages.LanguageSet) null);
      Rule rule0 = null;
      try {
        rule0 = new Rule((String) null, "[[]", "\"q0^z[null]", rule_Phoneme0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 3
         // [[]$
         //    ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList((List<Rule.Phoneme>) null);
      Rule rule0 = null;
      try {
        rule0 = new Rule("xa/&vj=h1%#", "$VALUES", "[u6(`39GTz!8'cH 64u", rule_PhonemeList0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 19
         // ^[u6(`39GTz!8'cH 64u
         //                    ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("_MWBOy~Y", languages_LanguageSet0);
      Rule rule0 = new Rule("_MWBOy~Y", "ANY_LANGUAGE", "^:c|y d>x%s&\"Y$", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("_MWBOy~Y[NO_LANGUAGES]", 0);
      assertFalse(boolean0);
      assertEquals("_MWBOy~Y", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      List<Rule.Phoneme> list0 = rule_PhonemeList0.getPhonemes();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      int int0 = rule_PhonemeList0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("5[>\"ziU|~%z;", languages_LanguageSet0);
      Rule rule0 = null;
      try {
        rule0 = new Rule("5[>\"ziU|~%z;", "5[>\"ziU|~%z;", "bRn=CxNZrRQIw", rule_Phoneme0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 12
         // 5[>\"ziU|~%z;$
         //             ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = rule_Phoneme0.append("ALL");
      assertEquals(1, rule_Phoneme1.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      CharSequence charSequence0 = rule_Phoneme0.getPhonemeText();
      assertEquals("\u0000\u0000", charSequence0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0);
      Rule.Phoneme rule_Phoneme2 = new Rule.Phoneme(rule_Phoneme1, rule_Phoneme0);
      assertFalse(rule_Phoneme2.equals((Object)rule_Phoneme0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("_MWBOy~Y", languages_LanguageSet0);
      String string0 = rule_Phoneme0.toString();
      assertEquals("_MWBOy~Y[NO_LANGUAGES]", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Languages.LanguageSet languages_LanguageSet1 = rule_Phoneme0.getLanguages();
      assertSame(languages_LanguageSet0, languages_LanguageSet1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("[]", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = rule_Phoneme0.mergeWithLanguage(languages_LanguageSet0);
      assertFalse(rule_Phoneme1.equals((Object)rule_Phoneme0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, ruleType0, "(:Bx");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for ash, approx, (:Bx.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("HB:hJGF|Wmr\"", languages_LanguageSet0);
      Rule rule0 = new Rule("(", "HB:hJGF|Wmr\"", "$", rule_Phoneme0);
      rule0.getPhoneme();
      assertEquals("(", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("[]", languages_LanguageSet0);
      Rule rule0 = new Rule("[]", "[]", "[]", rule_Phoneme0);
      String string0 = rule0.getPattern();
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      Rule rule0 = new Rule("", "<]|D%\"", "", rule_Phoneme0);
      rule0.getLContext();
      assertEquals("", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("_MWBOy~Y", languages_LanguageSet0);
      Rule rule0 = new Rule("_MWBOy~Y", "ANY_LANGUAGE", "(:Bx", rule_Phoneme0);
      rule0.getRContext();
      assertEquals("_MWBOy~Y", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      List<Rule> list0 = Rule.getInstance(nameType0, ruleType0, languages_LanguageSet0);
      assertFalse(list0.isEmpty());
  }
}
