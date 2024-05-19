
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.commons.codec.language.bm.Lang;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.codec.language.bm.NameType;
import org.apache.commons.codec.language.bm.PhoneticEngine;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.commons.codec.language.bm.RuleType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PhoneticEngine_ESTest extends PhoneticEngine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 2746);
      assertNotNull(phoneticEngine0);
      assertEquals(2746, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertTrue(phoneticEngine0.isConcat());
      
      String string0 = phoneticEngine0.encode("d'no_languages");
      assertNotNull(string0);
      assertEquals(2746, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals("(nolangvagiS|nolangvagis|nolangvaxis|nolangvaziS|nolangvazis|nolangvogiS|nolangvogis|nolangvoxis|nolangvoziS|nolangvozis|nolongvagiS|nolongvagis|nolongvaxis|nolongvaziS|nolongvazis|nolongvogiS|nolongvogis|nolongvoxis|nolongvoziS|nolongvozis)-(dnolangvagiS|dnolangvagis|dnolangvaxis|dnolangvaziS|dnolangvazis|dnolangvogiS|dnolangvogis|dnolangvoxis|dnolangvoziS|dnolangvozis|dnolongvagiS|dnolongvagis|dnolongvaxis|dnolongvaziS|dnolongvazis|dnolongvogiS|dnolongvogis|dnolongvoxis|dnolongvoziS|dnolongvozis)", string0);
      
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(2746, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(2746, int0);
      
      Lang lang0 = phoneticEngine0.getLang();
      assertNotNull(lang0);
      assertEquals(2746, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertTrue(phoneticEngine0.isConcat());
      
      RuleType ruleType1 = phoneticEngine0.getRuleType();
      assertSame(ruleType0, ruleType1);
      assertSame(ruleType1, ruleType0);
      assertEquals(2746, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals("approx", ruleType1.getName());
      assertEquals(RuleType.APPROX, ruleType1);
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      assertFalse(linkedHashSet0.contains(string0));
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      assertFalse(linkedHashSet0.contains(string0));
      
      String string1 = phoneticEngine0.encode("d'no_languages", languages_LanguageSet0);
      assertSame(ruleType0, ruleType1);
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals(2746, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertTrue(phoneticEngine0.isConcat());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      assertEquals("(nolangvagiS|nolangvagis|nolangvaxis|nolangvaziS|nolangvazis|nolangvogiS|nolangvogis|nolangvoxis|nolangvoziS|nolangvozis|nolongvagiS|nolongvagis|nolongvaxis|nolongvaziS|nolongvazis|nolongvogiS|nolongvogis|nolongvoxis|nolongvoziS|nolongvozis)-(dnolangvagiS|dnolangvagis|dnolangvaxis|dnolangvaziS|dnolangvazis|dnolangvogiS|dnolangvogis|dnolangvoxis|dnolangvoziS|dnolangvozis|dnolongvagiS|dnolongvagis|dnolongvaxis|dnolongvaziS|dnolongvazis|dnolongvogiS|dnolongvogis|dnolongvoxis|dnolongvoziS|dnolongvozis)", string1);
      assertFalse(linkedHashSet0.contains("d'no_languages"));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      assertNotNull(phoneticEngine0);
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      String string0 = phoneticEngine0.encode("G#[<Iu^9?wm-L 9}8G", languages_LanguageSet0);
      assertNotNull(string0);
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals("gjuvm|gjuvn-l-k", string0);
      assertFalse(linkedHashSet0.contains(string0));
      
      LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<String>();
      assertTrue(linkedHashSet1.equals((Object)linkedHashSet0));
      assertNotNull(linkedHashSet1);
      assertEquals(0, linkedHashSet1.size());
      assertTrue(linkedHashSet1.isEmpty());
      assertFalse(linkedHashSet1.contains(string0));
      
      Languages.LanguageSet languages_LanguageSet1 = Languages.LanguageSet.from(linkedHashSet1);
      assertNotSame(linkedHashSet1, linkedHashSet0);
      assertSame(languages_LanguageSet1, languages_LanguageSet0);
      assertTrue(linkedHashSet1.equals((Object)linkedHashSet0));
      assertNotNull(languages_LanguageSet1);
      assertEquals(0, linkedHashSet1.size());
      assertTrue(linkedHashSet1.isEmpty());
      assertFalse(linkedHashSet1.contains(string0));
      
      String string1 = phoneticEngine0.encode("von", languages_LanguageSet1);
      assertNotSame(linkedHashSet1, linkedHashSet0);
      assertSame(languages_LanguageSet1, languages_LanguageSet0);
      assertTrue(linkedHashSet1.equals((Object)linkedHashSet0));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(0, linkedHashSet1.size());
      assertTrue(linkedHashSet1.isEmpty());
      assertEquals("", string1);
      assertFalse(linkedHashSet1.contains(string0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 3);
      assertNotNull(phoneticEngine0);
      assertEquals(3, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      
      String string0 = phoneticEngine0.encode("NO_LANGUAGES");
      assertNotNull(string0);
      assertEquals(3, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals("nolangvagiS|nolangvagis|nolangvaxis|nolangvogiS|nolangvogis|nolangvoxis|nolongvagiS|nolongvagis|nolongvaxis", string0);
      
      String string1 = phoneticEngine0.encode("NO_LANGUAGES");
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals(3, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals("nolangvagiS|nolangvagis|nolangvaxis|nolangvogiS|nolangvogis|nolangvoxis|nolongvagiS|nolongvagis|nolongvaxis", string1);
      
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(3, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(3, int0);
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(3);
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains("NO_LANGUAGES"));
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains("NO_LANGUAGES"));
      
      boolean boolean0 = linkedHashSet0.add((String) null);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertTrue(boolean0);
      assertFalse(linkedHashSet0.contains("NO_LANGUAGES"));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotNull(phoneticEngine_PhonemeBuilder0);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains("NO_LANGUAGES"));
      
      phoneticEngine_PhonemeBuilder0.append("nolangvagiS|nolangvagis|nolangvaxis|nolangvogiS|nolangvogis|nolangvoxis|nolongvagiS|nolongvagis|nolongvaxis");
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains("NO_LANGUAGES"));
      
      int int1 = phoneticEngine0.getMaxPhonemes();
      assertTrue(int1 == int0);
      assertEquals(3, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(3, int1);
      
      String string2 = phoneticEngine0.encode("dal no_languages", languages_LanguageSet0);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals(3, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals("(nolangvagiS|nolangvagis|nolangvaxis|nolangvogiS|nolangvogis|nolangvoxis|nolongvagiS|nolongvagis|nolongvaxis)-(dalnolangvagiS|dalnolangvagis|dalnolangvaxis|dalnolangvogiS|dalnolangvogis|dalnolangvoxis|dalnolongvagiS|dalnolongvagis|dalnolongvaxis)", string2);
      assertFalse(linkedHashSet0.contains("NO_LANGUAGES"));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      //  // Unstable assertion: assertNotNull(phoneticEngine0);
      //  // Unstable assertion: assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      //  // Unstable assertion: assertEquals(20, phoneticEngine0.getMaxPhonemes());
      //  // Unstable assertion: assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      //  // Unstable assertion: assertFalse(phoneticEngine0.isConcat());
      
      String string0 = phoneticEngine0.encode("Can't fetch any language from the any language set.");
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      //  // Unstable assertion: assertEquals(20, phoneticEngine0.getMaxPhonemes());
      //  // Unstable assertion: assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      //  // Unstable assertion: assertFalse(phoneticEngine0.isConcat());
      //  // Unstable assertion: assertEquals("kYnt|kan|kant|kon|kont|tsant|tsont|zant|zont-fYtx|fitS|fits|fitx|fix-ani|oni-langvagi|langvaxi|langvazi|langvogi|langvoxi|langvozi|longvagi|longvaxi|longvazi|longvogi|longvoxi|longvozi-from|fron|frum-t|ti-ani|oni-langvagi|langvaxi|langvazi|langvogi|langvoxi|langvozi|longvagi|longvaxi|longvazi|longvogi|longvoxi|longvozi-si|sit|zit", string0);
      
      RuleType ruleType1 = phoneticEngine0.getRuleType();
      //  // Unstable assertion: assertSame(ruleType0, ruleType1);
      //  // Unstable assertion: assertSame(ruleType1, ruleType0);
      //  // Unstable assertion: assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      //  // Unstable assertion: assertEquals(20, phoneticEngine0.getMaxPhonemes());
      //  // Unstable assertion: assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      //  // Unstable assertion: assertFalse(phoneticEngine0.isConcat());
      //  // Unstable assertion: assertEquals("approx", ruleType1.getName());
      //  // Unstable assertion: assertEquals(RuleType.APPROX, ruleType1);
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      //  // Unstable assertion: assertNotNull(linkedHashSet0);
      //  // Unstable assertion: assertEquals(0, linkedHashSet0.size());
      //  // Unstable assertion: assertTrue(linkedHashSet0.isEmpty());
      //  // Unstable assertion: assertFalse(linkedHashSet0.contains("Can't fetch any language from the any language set."));
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      //  // Unstable assertion: assertNotNull(languages_LanguageSet0);
      //  // Unstable assertion: assertEquals(0, linkedHashSet0.size());
      //  // Unstable assertion: assertTrue(linkedHashSet0.isEmpty());
      //  // Unstable assertion: assertFalse(linkedHashSet0.contains("Can't fetch any language from the any language set."));
      
      Languages.LanguageSet languages_LanguageSet1 = Languages.LanguageSet.from(linkedHashSet0);
      //  // Unstable assertion: assertSame(languages_LanguageSet1, languages_LanguageSet0);
      //  // Unstable assertion: assertNotNull(languages_LanguageSet1);
      //  // Unstable assertion: assertEquals(0, linkedHashSet0.size());
      //  // Unstable assertion: assertTrue(linkedHashSet0.isEmpty());
      //  // Unstable assertion: assertFalse(linkedHashSet0.contains("Can't fetch any language from the any language set."));
      
      Languages.LanguageSet languages_LanguageSet2 = Languages.LanguageSet.from(linkedHashSet0);
      //  // Unstable assertion: assertSame(languages_LanguageSet2, languages_LanguageSet1);
      //  // Unstable assertion: assertSame(languages_LanguageSet2, languages_LanguageSet0);
      //  // Unstable assertion: assertNotNull(languages_LanguageSet2);
      //  // Unstable assertion: assertEquals(0, linkedHashSet0.size());
      //  // Unstable assertion: assertTrue(linkedHashSet0.isEmpty());
      //  // Unstable assertion: assertFalse(linkedHashSet0.contains("Can't fetch any language from the any language set."));
      
      Languages.LanguageSet languages_LanguageSet3 = Languages.LanguageSet.from(linkedHashSet0);
      //  // Unstable assertion: assertSame(languages_LanguageSet3, languages_LanguageSet2);
      //  // Unstable assertion: assertSame(languages_LanguageSet3, languages_LanguageSet1);
      //  // Unstable assertion: assertSame(languages_LanguageSet3, languages_LanguageSet0);
      //  // Unstable assertion: assertNotNull(languages_LanguageSet3);
      //  // Unstable assertion: assertEquals(0, linkedHashSet0.size());
      //  // Unstable assertion: assertTrue(linkedHashSet0.isEmpty());
      //  // Unstable assertion: assertFalse(linkedHashSet0.contains("Can't fetch any language from the any language set."));
      
      // Undeclared exception!
      phoneticEngine0.encode("kYnt|kan|kant|kon|kont|tsant|tsont|zant|zont-fYtx|fitS|fits|fitx|fix-ani|oni-langvagi|langvaxi|langvazi|langvogi|langvoxi|langvozi|longvagi|longvaxi|longvazi|longvogi|longvoxi|longvozi-from|fron|frum-t|ti-ani|oni-langvagi|langvaxi|langvazi|langvogi|langvoxi|langvozi|longvagi|longvaxi|longvazi|longvogi|longvoxi|longvozi-si|sit|zit", languages_LanguageSet1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-1569));
      assertNotNull(phoneticEngine0);
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals((-1569), phoneticEngine0.getMaxPhonemes());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("x(7", languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1569
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      assertNotNull(phoneticEngine0);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
      
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
      assertEquals(0, int0);
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      boolean boolean0 = linkedHashSet0.add((String) null);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertTrue(boolean0);
      
      String string0 = phoneticEngine0.encode("", languages_LanguageSet0);
      assertNotNull(string0);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals("", string0);
      assertFalse(linkedHashSet0.contains(string0));
      
      boolean boolean1 = languages_LanguageSet0.contains("");
      assertFalse(boolean1 == boolean0);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(boolean1);
      assertFalse(linkedHashSet0.contains(""));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotNull(phoneticEngine_PhonemeBuilder0);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      
      Languages.LanguageSet languages_LanguageSet1 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet1);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet1.isEmpty());
      assertTrue(languages_LanguageSet1.isSingleton());
      assertFalse(linkedHashSet0.contains(""));
      
      Languages.LanguageSet languages_LanguageSet2 = languages_LanguageSet0.restrictTo(languages_LanguageSet1);
      assertSame(languages_LanguageSet0, languages_LanguageSet2);
      assertSame(languages_LanguageSet2, languages_LanguageSet0);
      assertNotNull(languages_LanguageSet2);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet1.isEmpty());
      assertTrue(languages_LanguageSet1.isSingleton());
      assertFalse(linkedHashSet0.contains(""));
      
      String string1 = phoneticEngine_PhonemeBuilder0.makeString();
      assertSame(languages_LanguageSet0, languages_LanguageSet2);
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals("", string1);
      assertFalse(linkedHashSet0.contains(""));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder1 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertSame(languages_LanguageSet0, languages_LanguageSet2);
      assertNotSame(phoneticEngine_PhonemeBuilder1, phoneticEngine_PhonemeBuilder0);
      assertFalse(phoneticEngine_PhonemeBuilder1.equals((Object)phoneticEngine_PhonemeBuilder0));
      assertNotNull(phoneticEngine_PhonemeBuilder1);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      
      String string2 = phoneticEngine0.encode("'", languages_LanguageSet0);
      assertSame(languages_LanguageSet0, languages_LanguageSet2);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals("", string2);
      assertFalse(linkedHashSet0.contains(""));
      
      Set<Rule.Phoneme> set0 = phoneticEngine_PhonemeBuilder0.getPhonemes();
      assertSame(languages_LanguageSet0, languages_LanguageSet2);
      assertNotSame(phoneticEngine_PhonemeBuilder0, phoneticEngine_PhonemeBuilder1);
      assertFalse(phoneticEngine_PhonemeBuilder0.equals((Object)phoneticEngine_PhonemeBuilder1));
      assertNotNull(set0);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals(1, set0.size());
      assertFalse(set0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      
      String string3 = phoneticEngine0.encode("", languages_LanguageSet0);
      assertSame(languages_LanguageSet0, languages_LanguageSet2);
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string2));
      assertNotNull(string3);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals("", string3);
      assertFalse(linkedHashSet0.contains(""));
      
      Set<Rule.Phoneme> set1 = phoneticEngine_PhonemeBuilder0.getPhonemes();
      assertSame(set1, set0);
      assertSame(languages_LanguageSet0, languages_LanguageSet2);
      assertNotSame(phoneticEngine_PhonemeBuilder0, phoneticEngine_PhonemeBuilder1);
      assertFalse(phoneticEngine_PhonemeBuilder0.equals((Object)phoneticEngine_PhonemeBuilder1));
      assertNotNull(set1);
      assertEquals(1, set1.size());
      assertFalse(set1.isEmpty());
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder2 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet2);
      assertNotSame(phoneticEngine_PhonemeBuilder2, phoneticEngine_PhonemeBuilder0);
      assertNotSame(phoneticEngine_PhonemeBuilder2, phoneticEngine_PhonemeBuilder1);
      assertSame(languages_LanguageSet0, languages_LanguageSet2);
      assertSame(languages_LanguageSet2, languages_LanguageSet0);
      assertFalse(phoneticEngine_PhonemeBuilder2.equals((Object)phoneticEngine_PhonemeBuilder0));
      assertFalse(phoneticEngine_PhonemeBuilder2.equals((Object)phoneticEngine_PhonemeBuilder1));
      assertNotNull(phoneticEngine_PhonemeBuilder2);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet1.isEmpty());
      assertTrue(languages_LanguageSet1.isSingleton());
      assertFalse(linkedHashSet0.contains(""));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-679));
      assertNotNull(phoneticEngine0);
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals((-679), phoneticEngine0.getMaxPhonemes());
      
      String string0 = "";
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
      
      boolean boolean0 = languages_LanguageSet0.isEmpty();
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertTrue(boolean0);
      assertFalse(linkedHashSet0.contains(string0));
      
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("14:$N3-v2l+C8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -679
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      assertNotNull(phoneticEngine0);
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(NameType.ASHKENAZI, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      
      String string0 = phoneticEngine0.encode("");
      assertNotNull(string0);
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(NameType.ASHKENAZI, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals("", string0);
      
      String string1 = "";
      String string2 = "9!I;3,ED/zvOZc{Ht";
      Set<String> set0 = null;
      String string3 = phoneticEngine0.encode("9!I;3,ED/zvOZc{Ht");
      assertFalse(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string0));
      assertNotNull(string3);
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(NameType.ASHKENAZI, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals("", string3);
      
      // Undeclared exception!
      try { 
        Languages.LanguageSet.from((Set<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Languages$LanguageSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 3328);
      assertNotNull(phoneticEngine0);
      assertEquals(3328, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      
      String string0 = ".\"t|l!6";
      String string1 = phoneticEngine0.encode(".\"t|l!6");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals(3328, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals("tl", string1);
      
      String string2 = phoneticEngine0.encode("BMXPNSjQ");
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals(3328, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals("bmgspnsjk|bmkspnsjk", string2);
      
      Languages.LanguageSet languages_LanguageSet0 = null;
      String string3 = "org.apache.commons.codec.language.bm.PhoneticEngine$RulesApplication";
      // Undeclared exception!
      phoneticEngine0.encode("org.apache.commons.codec.language.bm.PhoneticEngine$RulesApplication");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      assertNotNull(phoneticEngine0);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      
      String string0 = phoneticEngine0.encode("");
      assertNotNull(string0);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals("", string0);
      
      RuleType ruleType1 = phoneticEngine0.getRuleType();
      assertSame(ruleType0, ruleType1);
      assertSame(ruleType1, ruleType0);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals("approx", ruleType1.getName());
      assertEquals(RuleType.APPROX, ruleType1);
      
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertSame(ruleType0, ruleType1);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, int0);
      
      RuleType ruleType2 = phoneticEngine0.getRuleType();
      assertSame(ruleType0, ruleType2);
      assertSame(ruleType0, ruleType1);
      assertSame(ruleType2, ruleType0);
      assertSame(ruleType2, ruleType1);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals("approx", ruleType2.getName());
      assertEquals(RuleType.APPROX, ruleType2);
      
      Lang lang0 = phoneticEngine0.getLang();
      assertSame(ruleType0, ruleType2);
      assertSame(ruleType0, ruleType1);
      assertNotNull(lang0);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
      
      boolean boolean0 = linkedHashSet0.add("FMx`Y{#X*[j6py$M)");
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertTrue(boolean0);
      assertFalse(linkedHashSet0.contains(""));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      String string1 = phoneticEngine0.encode("");
      assertSame(ruleType0, ruleType2);
      assertSame(ruleType0, ruleType1);
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals("", string1);
      
      boolean boolean1 = linkedHashSet0.add(",%%&WLj1u");
      assertTrue(boolean1 == boolean0);
      assertEquals(2, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertTrue(boolean1);
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(2, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      String string2 = phoneticEngine0.encode("", languages_LanguageSet0);
      assertSame(ruleType0, ruleType2);
      assertSame(ruleType0, ruleType1);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertNotNull(string2);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(2, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertEquals("", string2);
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotNull(phoneticEngine_PhonemeBuilder0);
      assertEquals(2, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      LinkedHashSet linkedHashSet1 = (LinkedHashSet)linkedHashSet0.clone();
      assertNotNull(linkedHashSet1);
      assertEquals(2, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet1.isEmpty());
      assertEquals(2, linkedHashSet1.size());
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      phoneticEngine_PhonemeBuilder0.append("");
      assertEquals(2, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      assertNotNull(rule_Phoneme0);
      assertEquals(1, rule_Phoneme0.size());
      assertEquals(2, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0);
      assertFalse(rule_Phoneme1.equals((Object)rule_Phoneme0));
      assertNotNull(rule_Phoneme1);
      assertEquals(1, rule_Phoneme0.size());
      assertEquals(1, rule_Phoneme1.size());
      assertEquals(2, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      String string3 = rule_Phoneme1.toString();
      assertNotSame(rule_Phoneme0, rule_Phoneme1);
      assertNotSame(rule_Phoneme1, rule_Phoneme0);
      assertFalse(rule_Phoneme0.equals((Object)rule_Phoneme1));
      assertFalse(rule_Phoneme1.equals((Object)rule_Phoneme0));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string1));
      assertNotNull(string3);
      assertEquals(1, rule_Phoneme0.size());
      assertEquals(1, rule_Phoneme1.size());
      assertEquals(2, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme1, 20);
      assertNotSame(rule_Phoneme0, rule_Phoneme1);
      assertNotSame(rule_Phoneme1, rule_Phoneme0);
      assertFalse(rule_Phoneme0.equals((Object)rule_Phoneme1));
      assertFalse(rule_Phoneme1.equals((Object)rule_Phoneme0));
      assertEquals(1, rule_Phoneme0.size());
      assertEquals(1, rule_Phoneme1.size());
      assertEquals(2, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("FMx`Y{#X*[j6py$M)"));
      
      // Undeclared exception!
      try { 
        phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, (-3201));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -3201
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      assertNotNull(phoneticEngine0);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      
      String string0 = null;
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
  public void test11()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-1685));
      assertNotNull(phoneticEngine0);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals((-1685), phoneticEngine0.getMaxPhonemes());
      
      String string0 = phoneticEngine0.encode("");
      assertNotNull(string0);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals((-1685), phoneticEngine0.getMaxPhonemes());
      assertEquals("", string0);
      
      String string1 = phoneticEngine0.encode("");
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals((-1685), phoneticEngine0.getMaxPhonemes());
      assertEquals("", string1);
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string1));
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(string1));
      
      LinkedHashSet linkedHashSet1 = (LinkedHashSet)linkedHashSet0.clone();
      assertNotNull(linkedHashSet1);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet1.size());
      assertTrue(linkedHashSet1.isEmpty());
      assertFalse(linkedHashSet0.contains(string1));
      
      String string2 = phoneticEngine0.encode("", languages_LanguageSet0);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertNotNull(string2);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals((-1685), phoneticEngine0.getMaxPhonemes());
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals("", string2);
      assertFalse(linkedHashSet0.contains(""));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotNull(phoneticEngine_PhonemeBuilder0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      
      String string3 = phoneticEngine_PhonemeBuilder0.makeString();
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      assertNotNull(string3);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals("", string3);
      assertFalse(linkedHashSet0.contains(""));
      
      phoneticEngine_PhonemeBuilder0.append((CharSequence) null);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      
      phoneticEngine_PhonemeBuilder0.append("");
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      
      NameType nameType1 = phoneticEngine0.getNameType();
      assertSame(nameType0, nameType1);
      assertSame(nameType1, nameType0);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals((-1685), phoneticEngine0.getMaxPhonemes());
      assertEquals("sep", nameType1.getName());
      assertEquals(NameType.SEPHARDIC, nameType1);
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder1 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotSame(phoneticEngine_PhonemeBuilder1, phoneticEngine_PhonemeBuilder0);
      assertFalse(phoneticEngine_PhonemeBuilder1.equals((Object)phoneticEngine_PhonemeBuilder0));
      assertNotNull(phoneticEngine_PhonemeBuilder1);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder2 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotSame(phoneticEngine_PhonemeBuilder2, phoneticEngine_PhonemeBuilder0);
      assertNotSame(phoneticEngine_PhonemeBuilder2, phoneticEngine_PhonemeBuilder1);
      assertFalse(phoneticEngine_PhonemeBuilder2.equals((Object)phoneticEngine_PhonemeBuilder0));
      assertFalse(phoneticEngine_PhonemeBuilder2.equals((Object)phoneticEngine_PhonemeBuilder1));
      assertNotNull(phoneticEngine_PhonemeBuilder2);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      
      Set<Rule.Phoneme> set0 = phoneticEngine_PhonemeBuilder0.getPhonemes();
      assertNotSame(phoneticEngine_PhonemeBuilder0, phoneticEngine_PhonemeBuilder1);
      assertNotSame(phoneticEngine_PhonemeBuilder0, phoneticEngine_PhonemeBuilder2);
      assertFalse(phoneticEngine_PhonemeBuilder0.equals((Object)phoneticEngine_PhonemeBuilder1));
      assertFalse(phoneticEngine_PhonemeBuilder0.equals((Object)phoneticEngine_PhonemeBuilder2));
      assertNotNull(set0);
      assertFalse(set0.isEmpty());
      assertEquals(1, set0.size());
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertSame(nameType0, nameType1);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals((-1685), phoneticEngine0.getMaxPhonemes());
      assertEquals((-1685), int0);
      
      Lang lang0 = phoneticEngine0.getLang();
      assertSame(nameType0, nameType1);
      assertNotNull(lang0);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals((-1685), phoneticEngine0.getMaxPhonemes());
      
      Lang lang1 = phoneticEngine0.getLang();
      assertSame(nameType0, nameType1);
      assertSame(lang1, lang0);
      assertNotNull(lang1);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals((-1685), phoneticEngine0.getMaxPhonemes());
      
      LinkedList<String> linkedList0 = new LinkedList<String>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      assertFalse(linkedList0.contains(""));
      
      boolean boolean0 = linkedHashSet0.addAll(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(boolean0);
      assertFalse(linkedList0.contains(""));
      assertFalse(linkedHashSet0.contains(""));
      
      Languages.LanguageSet languages_LanguageSet1 = null;
      // Undeclared exception!
      try { 
        phoneticEngine0.encode((String) null, (Languages.LanguageSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      assertNotNull(phoneticEngine0);
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(3);
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      String string0 = phoneticEngine0.encode("gW|>/$l/ZA*'&vV", languages_LanguageSet0);
      assertNotNull(string0);
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals("", string0);
      assertFalse(linkedHashSet0.contains(string0));
      
      String string1 = phoneticEngine0.encode("gW|>/$l/ZA*'&vV");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals("bf|f|p|vp", string1);
      
      boolean boolean0 = phoneticEngine0.isConcat();
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(boolean0);
      
      String string2 = phoneticEngine0.encode("gW|>/$l/ZA*'&vV", languages_LanguageSet0);
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals("", string2);
      assertFalse(linkedHashSet0.contains(string0));
      
      boolean boolean1 = phoneticEngine0.isConcat();
      assertTrue(boolean1 == boolean0);
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertTrue(boolean1);
      
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(20, int0);
      
      RuleType ruleType1 = phoneticEngine0.getRuleType();
      assertSame(ruleType0, ruleType1);
      assertSame(ruleType1, ruleType0);
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals("approx", ruleType1.getName());
      assertEquals(RuleType.APPROX, ruleType1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      assertNotNull(phoneticEngine0);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      
      String string0 = phoneticEngine0.encode("-", languages_LanguageSet0);
      assertNotNull(string0);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      assertEquals("", string0);
      assertFalse(linkedHashSet0.contains(string0));
      
      boolean boolean0 = phoneticEngine0.isConcat();
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 6);
      assertNotNull(phoneticEngine0);
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(6, phoneticEngine0.getMaxPhonemes());
      assertTrue(phoneticEngine0.isConcat());
      
      String string0 = phoneticEngine0.encode("s+");
      assertNotNull(string0);
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(6, phoneticEngine0.getMaxPhonemes());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals("s", string0);
      
      String string1 = phoneticEngine0.encode("9F><ZtUn>Xyz-rR");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(6, phoneticEngine0.getMaxPhonemes());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals("fstungzidzr|fstungzizr|fstunksidzr|fstunksisr|fstunksitsr|fstunksizr", string1);
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains("s+"));
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains("s+"));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotNull(phoneticEngine_PhonemeBuilder0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains("s+"));
      
      Set<Rule.Phoneme> set0 = phoneticEngine_PhonemeBuilder0.getPhonemes();
      assertNotNull(set0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(set0.isEmpty());
      assertEquals(1, set0.size());
      assertFalse(linkedHashSet0.contains("s+"));
      
      phoneticEngine_PhonemeBuilder0.append("9F><ZtUn>Xyz-rR");
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains("9F><ZtUn>Xyz-rR"));
      
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("9F><ZtUn>Xyz-rR", languages_LanguageSet0);
      assertNotNull(rule_Phoneme0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(1, rule_Phoneme0.size());
      assertFalse(linkedHashSet0.contains("s+"));
      
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 3);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(1, rule_Phoneme0.size());
      assertFalse(linkedHashSet0.contains("s+"));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      assertNotNull(phoneticEngine0);
      assertEquals(RuleType.APPROX, phoneticEngine0.getRuleType());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(NameType.ASHKENAZI, phoneticEngine0.getNameType());
      
      String string0 = null;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      boolean boolean0 = languages_LanguageSet0.contains((String) null);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(boolean0);
      
      // Undeclared exception!
      try { 
        phoneticEngine0.encode((String) null, languages_LanguageSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      assertNotNull(phoneticEngine0);
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      
      String string0 = "";
      String string1 = phoneticEngine0.encode("");
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals("", string1);
      
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(20, int0);
      
      String string2 = ":uGdE2";
      // Undeclared exception!
      try { 
        Languages.LanguageSet.from((Set<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Languages$LanguageSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      assertNotNull(phoneticEngine0);
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      boolean boolean0 = linkedHashSet0.remove("cO(jvoF^|#{");
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(boolean0);
      assertFalse(linkedHashSet0.contains("cO(jvoF^|#{"));
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains("cO(jvoF^|#{"));
      
      String string0 = phoneticEngine0.encode("cO(jvoF^|#{", languages_LanguageSet0);
      assertNotNull(string0);
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals(NameType.GENERIC, phoneticEngine0.getNameType());
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals("", string0);
      assertFalse(linkedHashSet0.contains("cO(jvoF^|#{"));
      
      LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<String>();
      assertTrue(linkedHashSet1.equals((Object)linkedHashSet0));
      assertNotNull(linkedHashSet1);
      assertTrue(linkedHashSet1.isEmpty());
      assertEquals(0, linkedHashSet1.size());
      assertFalse(linkedHashSet1.contains("cO(jvoF^|#{"));
      
      boolean boolean1 = linkedHashSet1.add("ul.Q<)&yi^Al HTh");
      assertNotSame(linkedHashSet1, linkedHashSet0);
      assertFalse(linkedHashSet1.equals((Object)linkedHashSet0));
      assertFalse(boolean1 == boolean0);
      assertEquals(1, linkedHashSet1.size());
      assertFalse(linkedHashSet1.isEmpty());
      assertTrue(boolean1);
      assertFalse(linkedHashSet1.contains("cO(jvoF^|#{"));
      assertTrue(linkedHashSet1.contains("ul.Q<)&yi^Al HTh"));
      
      Languages.LanguageSet languages_LanguageSet1 = Languages.LanguageSet.from(linkedHashSet1);
      assertNotSame(linkedHashSet1, linkedHashSet0);
      assertFalse(linkedHashSet1.equals((Object)linkedHashSet0));
      assertNotNull(languages_LanguageSet1);
      assertEquals(1, linkedHashSet1.size());
      assertFalse(linkedHashSet1.isEmpty());
      assertFalse(languages_LanguageSet1.isEmpty());
      assertTrue(languages_LanguageSet1.isSingleton());
      assertFalse(linkedHashSet1.contains("cO(jvoF^|#{"));
      assertTrue(linkedHashSet1.contains("ul.Q<)&yi^Al HTh"));
      
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("", languages_LanguageSet1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, rules, ul.Q<)&yi^Al HTh.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      boolean boolean0 = languages_LanguageSet0.isEmpty();
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertTrue(boolean0);
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotNull(phoneticEngine_PhonemeBuilder0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      boolean boolean1 = languages_LanguageSet0.contains("dal");
      assertFalse(boolean1 == boolean0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(boolean1);
      assertFalse(linkedHashSet0.contains("dal"));
      
      Languages.LanguageSet languages_LanguageSet1 = Languages.LanguageSet.from(linkedHashSet0);
      assertSame(languages_LanguageSet1, languages_LanguageSet0);
      assertNotNull(languages_LanguageSet1);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains("dal"));
      
      boolean boolean2 = languages_LanguageSet0.isSingleton();
      assertSame(languages_LanguageSet0, languages_LanguageSet1);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2 == boolean0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(boolean2);
      assertFalse(linkedHashSet0.contains("dal"));
      
      boolean boolean3 = languages_LanguageSet0.contains("dal");
      assertSame(languages_LanguageSet0, languages_LanguageSet1);
      assertTrue(boolean3 == boolean1);
      assertFalse(boolean3 == boolean0);
      assertTrue(boolean3 == boolean2);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertFalse(boolean3);
      assertFalse(linkedHashSet0.contains("dal"));
      
      boolean boolean4 = linkedHashSet0.add("dal");
      assertTrue(boolean4 == boolean0);
      assertFalse(boolean4 == boolean1);
      assertFalse(boolean4 == boolean3);
      assertFalse(boolean4 == boolean2);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertTrue(boolean4);
      assertTrue(linkedHashSet0.contains("dal"));
      
      String string0 = phoneticEngine_PhonemeBuilder0.makeString();
      assertSame(languages_LanguageSet0, languages_LanguageSet1);
      assertNotNull(string0);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals("", string0);
      assertFalse(linkedHashSet0.contains(string0));
      assertTrue(linkedHashSet0.contains("dal"));
      
      phoneticEngine_PhonemeBuilder0.append("");
      assertSame(languages_LanguageSet0, languages_LanguageSet1);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertFalse(linkedHashSet0.contains(""));
      assertTrue(linkedHashSet0.contains("dal"));
      
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 1);
      assertNotNull(phoneticEngine0);
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(1, phoneticEngine0.getMaxPhonemes());
      
      String string1 = phoneticEngine0.encode("bAFXQavf?!_");
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(1, phoneticEngine0.getMaxPhonemes());
      assertEquals("bafkskaf", string1);
      
      boolean boolean5 = phoneticEngine0.isConcat();
      assertFalse(boolean5 == boolean4);
      assertTrue(boolean5 == boolean3);
      assertTrue(boolean5 == boolean1);
      assertFalse(boolean5 == boolean0);
      assertTrue(boolean5 == boolean2);
      assertEquals(NameType.SEPHARDIC, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(1, phoneticEngine0.getMaxPhonemes());
      assertFalse(boolean5);
      
      String string2 = phoneticEngine_PhonemeBuilder0.makeString();
      assertSame(languages_LanguageSet0, languages_LanguageSet1);
      assertFalse(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertNotNull(string2);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals("", string2);
      assertFalse(linkedHashSet0.contains(string1));
      assertTrue(linkedHashSet0.contains("dal"));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      int int0 = (-3871);
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-3871));
      assertNotNull(phoneticEngine0);
      assertEquals(NameType.ASHKENAZI, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals((-3871), phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
      
      boolean boolean0 = phoneticEngine0.isConcat();
      assertEquals(NameType.ASHKENAZI, phoneticEngine0.getNameType());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals((-3871), phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
      assertFalse(boolean0);
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      boolean boolean1 = languages_LanguageSet0.isEmpty();
      assertFalse(boolean1 == boolean0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      assertTrue(boolean1);
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotNull(phoneticEngine_PhonemeBuilder0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      // Undeclared exception!
      try { 
        CharBuffer.wrap((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      
      boolean boolean0 = linkedHashSet0.add("ben");
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertTrue(boolean0);
      assertTrue(linkedHashSet0.contains("ben"));
      
      boolean boolean1 = linkedHashSet0.add((String) null);
      assertTrue(boolean1 == boolean0);
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals(2, linkedHashSet0.size());
      assertTrue(boolean1);
      assertTrue(linkedHashSet0.contains("ben"));
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals(2, linkedHashSet0.size());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertTrue(linkedHashSet0.contains("ben"));
      
      String string0 = languages_LanguageSet0.getAny();
      assertNotNull(string0);
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals(2, linkedHashSet0.size());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertEquals("ben", string0);
      assertTrue(linkedHashSet0.contains("ben"));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotNull(phoneticEngine_PhonemeBuilder0);
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals(2, linkedHashSet0.size());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertTrue(linkedHashSet0.contains("ben"));
      
      String string1 = phoneticEngine_PhonemeBuilder0.makeString();
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals(2, linkedHashSet0.size());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertEquals("", string1);
      assertTrue(linkedHashSet0.contains("ben"));
      assertFalse(linkedHashSet0.contains(string1));
      
      String string2 = phoneticEngine_PhonemeBuilder0.makeString();
      assertTrue(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertNotNull(string2);
      assertFalse(linkedHashSet0.isEmpty());
      assertEquals(2, linkedHashSet0.size());
      assertFalse(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertEquals("", string2);
      assertTrue(linkedHashSet0.contains("ben"));
      assertFalse(linkedHashSet0.contains(string2));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.RULES;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 1202);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      linkedHashSet0.clear();
      assertEquals(0, linkedHashSet0.size());
      assertTrue(linkedHashSet0.isEmpty());
      
      String string0 = "di";
      boolean boolean0 = linkedHashSet0.add("di");
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertTrue(boolean0);
      assertTrue(linkedHashSet0.contains(string0));
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertTrue(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertTrue(linkedHashSet0.contains(string0));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotNull(phoneticEngine_PhonemeBuilder0);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertTrue(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertTrue(linkedHashSet0.contains(string0));
      
      NameType nameType0 = NameType.GENERIC;
      boolean boolean1 = languages_LanguageSet0.isSingleton();
      assertTrue(boolean1 == boolean0);
      assertEquals(1, linkedHashSet0.size());
      assertFalse(linkedHashSet0.isEmpty());
      assertTrue(languages_LanguageSet0.isSingleton());
      assertFalse(languages_LanguageSet0.isEmpty());
      assertTrue(boolean1);
      assertTrue(linkedHashSet0.contains(string0));
      
      RuleType ruleType0 = RuleType.RULES;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
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
  public void test24()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-67));
      assertNotNull(phoneticEngine0);
      assertEquals(NameType.ASHKENAZI, phoneticEngine0.getNameType());
      assertEquals((-67), phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      assertNotNull(linkedHashSet0);
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertNotNull(languages_LanguageSet0);
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      
      String string0 = phoneticEngine0.encode(")-(", languages_LanguageSet0);
      assertNotNull(string0);
      assertEquals(NameType.ASHKENAZI, phoneticEngine0.getNameType());
      assertEquals((-67), phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      assertEquals("-", string0);
      assertFalse(linkedHashSet0.contains(string0));
      
      NameType nameType1 = phoneticEngine0.getNameType();
      assertSame(nameType0, nameType1);
      assertSame(nameType1, nameType0);
      assertEquals(NameType.ASHKENAZI, phoneticEngine0.getNameType());
      assertEquals((-67), phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(RuleType.EXACT, phoneticEngine0.getRuleType());
      assertEquals("ash", nameType1.getName());
      assertEquals(NameType.ASHKENAZI, nameType1);
      
      boolean boolean0 = languages_LanguageSet0.contains("dos");
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      assertFalse(boolean0);
      assertFalse(linkedHashSet0.contains(string0));
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      assertNotNull(phoneticEngine_PhonemeBuilder0);
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      assertFalse(linkedHashSet0.contains(string0));
      
      Set<Rule.Phoneme> set0 = phoneticEngine_PhonemeBuilder0.getPhonemes();
      assertNotNull(set0);
      assertTrue(linkedHashSet0.isEmpty());
      assertEquals(0, linkedHashSet0.size());
      assertEquals(1, set0.size());
      assertFalse(set0.isEmpty());
      assertFalse(linkedHashSet0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 48);
      String string0 = "\\+";
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(48);
      phoneticEngine0.encode("+");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("'-gVi", languages_LanguageSet0);
      // Undeclared exception!
      try { 
        Languages.LanguageSet.from((Set<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Languages$LanguageSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      int int0 = 14;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 14);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("4^~+NA5e:\"r7QbY#BK");
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      linkedHashSet0.forEach(consumer0);
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Languages.LanguageSet.from(linkedHashSet0);
      linkedHashSet0.add("`?,Vli_mI]y");
      phoneticEngine0.encode("`?,Vli_mI]y", languages_LanguageSet0);
      Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.getRuleType();
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Languages.LanguageSet languages_LanguageSet1 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("`?,Vli_mI]y", languages_LanguageSet1);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme1, 872);
      // Undeclared exception!
      phoneticEngine0.encode("di nolangvagqznolangvagqznolangvaksqznolangvogqznolangvogqznolangvoksqznolongvagqznolongvagqznolongvygzis|nolangvagqznolangvagqznolangvaksqznolangvogqznolangvogqznolangvoksqznolongvagqznolongvagqznolongvyksis|nolangvagqznolangvagqznolangvaksqznolangvogqznolangvogqznolangvoksqznolongvagqznolongvagqznolongvagzis|nolangvagqznolangvagqznolangvaksqznolangvogqznolangvogqznolangvoksqznolongvagqznolongvagqznolongvaksis|nolangvagqznolangvagqznolangvaksqznolangvogqznolangvogqznolangvoksqznolongvagqznolongvagqznolongvogzis|nolangvagqznolangvagqznolangvaksqznolangvogqznolangvogqznolangvoksqznolongvagqznolongvagqznolongvoksis|nolangvagiznolangvagiznolangvaksiznolangvogiznolangvogiznolangvoksiznolongvagiznolongvagiznolongvaksis|nolangvagiznolangvagiznolangvaksiznolangvogiznolangvogiznolangvoksiznolongvagiznolongvagiznolongvoksis|nolangvagiznolangvagiznolangvaksiznolangvogiznolangvogiznolangvoksiznolongvagiznolongvogiznolongvaksis", languages_LanguageSet0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      linkedHashSet0.forEach(consumer0);
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("-", languages_LanguageSet0);
      boolean boolean0 = phoneticEngine0.isConcat();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      phoneticEngine0.encode("");
      phoneticEngine0.encode("");
      String string0 = "di";
      phoneticEngine0.encode("di");
      // Undeclared exception!
      try { 
        Languages.LanguageSet.from((Set<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Languages$LanguageSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-679));
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("dV[R%hM?#e");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -679
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      String string0 = phoneticEngine0.encode("p<-OPetXh-_fEP/8f", languages_LanguageSet0);
      assertEquals("b-upits-fipf", string0);
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      linkedHashSet0.add("LD!*WahuwUaYiF~8eFS");
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.makeString();
      languages_LanguageSet0.isEmpty();
      phoneticEngine_PhonemeBuilder0.getPhonemes();
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.RULES;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-735));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      linkedHashSet0.add("R,oW");
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.getPhonemes();
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      phoneticEngine_PhonemeBuilder0.makeString();
      linkedHashSet0.add("R,oW");
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 13);
      phoneticEngine0.getNameType();
      phoneticEngine0.encode("R,oW");
      PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      String string0 = phoneticEngine0.encode("R,oW");
      assertEquals("rof", string0);
      
      phoneticEngine0.encode("Malformed rule statement split into ");
      String string1 = phoneticEngine0.encode("von");
      assertEquals("fon|von", string1);
      
      phoneticEngine_PhonemeBuilder0.getPhonemes();
      phoneticEngine_PhonemeBuilder0.append("fon|von");
      phoneticEngine0.encode(">|2t!qg5jBH", languages_LanguageSet0);
      PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine0.getRuleType();
      assertEquals(13, phoneticEngine0.getMaxPhonemes());
  }
}
