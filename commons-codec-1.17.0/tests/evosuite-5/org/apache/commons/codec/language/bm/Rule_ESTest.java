
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
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0);
      Rule.Phoneme rule_Phoneme2 = new Rule.Phoneme(rule_Phoneme1, rule_Phoneme0, languages_LanguageSet0);
      assertFalse(rule_Phoneme2.equals((Object)rule_Phoneme0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("bQ7gJS", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0, languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme2 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme1);
      assertFalse(rule_Phoneme2.equals((Object)rule_Phoneme1));
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
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(", rcon='", languages_LanguageSet0);
      int int0 = rule_Phoneme0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rule rule0 = new Rule("Malformed rule statement split into ", (String) null, "Malformed rule statement split into ", (Rule.PhonemeExpr) null);
      rule0.getPhoneme();
      assertEquals("Malformed rule statement split into ", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      Rule rule0 = new Rule((String) null, (String) null, (String) null, rule_PhonemeList0);
      String string0 = rule0.getPattern();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      Rule rule0 = new Rule("", "", "/*\"u\" \"\" \"\" \"u\"", rule_Phoneme0);
      String string0 = rule0.getPattern();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.RULES;
      List<Rule> list0 = Rule.getInstance(nameType0, ruleType0, "any");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("s", languages_LanguageSet0);
      Rule rule0 = new Rule((String) null, "\"u\" \"\" \"", "s", rule_Phoneme0);
      // Undeclared exception!
      try { 
        rule0.patternAndContextMatches("$$", 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.RULES;
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
  public void test10()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
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
  public void test11()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("_EA3Mz*@+PR0l|oA&)9");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, ruleType0, languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, approx, _EA3Mz*@+PR0l|oA&)9.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.RULES;
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, ruleType0, "ALL");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for sep, rules, ALL.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.RULES;
      Map<String, List<Rule>> map0 = Rule.getInstanceMap(nameType0, ruleType0, languages_LanguageSet0);
      assertEquals(71, map0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.RULES;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("QmSa~Ua;asR");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, ruleType0, languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for sep, rules, QmSa~Ua;asR.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("-n#^[~i oA p", languages_LanguageSet0);
      Rule rule0 = new Rule("$$", "qTuT6Bh@D-9%`4", "$$", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("-n#^[~i oA p", 3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("bQ7gJS", languages_LanguageSet0);
      Rule rule0 = new Rule("bQ7gJS", "bQ7gJS", "bQ7gJS", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("bQ7gJS", 4397);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule rule0 = new Rule("eFr(k-X~lB\"", "eFr(k-X~lB\"", "{line=", rule_Phoneme0);
      // Undeclared exception!
      try { 
        rule0.patternAndContextMatches(charBuffer0, (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Can not match pattern at negative indexes
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Rule rule0 = new Rule("ALL", "|", "s\"\"", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("ALL", 0);
      assertEquals("ALL", rule0.getPattern());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Rule rule0 = new Rule("ALL", "|", "s\"\"", rule_Phoneme0);
      rule0.patternAndContextMatches("ALLALL[NO_LANGUAGES]", 3);
      assertEquals("ALL", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("^^(s$$", languages_LanguageSet0);
      Rule rule0 = null;
      try {
        rule0 = new Rule("[-n#^[~i oA p]", "[-n#^[~i oA p]", "^^(s$$", rule_Phoneme0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 14
         // [-n#^[~i oA p]$
         //               ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Rule rule0 = null;
      try {
        rule0 = new Rule("^^XO'u/#g-W(2{}[KdW[$", "^^(s", "[-n#^[~i oA p", (Rule.PhonemeExpr) null);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 13
         // ^[-n#^[~i oA p
         //              ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Rule rule0 = new Rule("^", "^", "$$", (Rule.PhonemeExpr) null);
      assertEquals("^", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      List<Rule.Phoneme> list0 = rule_PhonemeList0.getPhonemes();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      int int0 = rule_PhonemeList0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 1, 1);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule rule0 = null;
      try {
        rule0 = new Rule("^XO'u/#g-W(2{}[KdW[", "^XO'u/#g-W(2{}[KdW[", "^XO'u/#g-W(2{}[KdW[", rule_Phoneme0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 11
         // ^XO'u/#g-W(2{}[KdW[$
         //            ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("(", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = rule_Phoneme0.append("(");
      assertSame(rule_Phoneme0, rule_Phoneme1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("(", languages_LanguageSet0);
      CharSequence charSequence0 = rule_Phoneme0.getPhonemeText();
      assertEquals("(", charSequence0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("(", languages_LanguageSet0);
      String string0 = rule_Phoneme0.toString();
      assertEquals("([NO_LANGUAGES]", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("(", languages_LanguageSet0);
      Languages.LanguageSet languages_LanguageSet1 = rule_Phoneme0.getLanguages();
      assertSame(languages_LanguageSet1, languages_LanguageSet0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("(", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = rule_Phoneme0.mergeWithLanguage(languages_LanguageSet0);
      assertEquals(1, rule_Phoneme1.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, ruleType0, "nna&O-{6&kK");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, approx, nna&O-{6&kK.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("bQ7gJS", languages_LanguageSet0);
      Rule rule0 = new Rule("bQ7gJS", "bQ7gJS", "bQ7gJS", rule_Phoneme0);
      Rule.PhonemeExpr rule_PhonemeExpr0 = rule0.getPhoneme();
      assertSame(rule_Phoneme0, rule_PhonemeExpr0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      Rule rule0 = new Rule("^$)g%(=jArJfc^)Ndg$", "^$)g%(=jArJfc^)Ndg$", "NO_LANGUAGES", rule_PhonemeList0);
      String string0 = rule0.getPattern();
      assertEquals("^$)g%(=jArJfc^)Ndg$", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("(", languages_LanguageSet0);
      Rule rule0 = new Rule("(", "(", "(", rule_Phoneme0);
      rule0.getLContext();
      assertEquals("(", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("(", languages_LanguageSet0);
      Rule rule0 = new Rule("(", "(", "(", rule_Phoneme0);
      rule0.getRContext();
      assertEquals("(", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.RULES;
      List<Rule> list0 = Rule.getInstance(nameType0, ruleType0, languages_LanguageSet0);
      assertFalse(list0.isEmpty());
  }
}
