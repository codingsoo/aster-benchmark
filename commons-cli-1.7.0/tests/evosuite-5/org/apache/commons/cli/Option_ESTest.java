
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


package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Converter;
import org.apache.commons.cli.DeprecatedAttributes;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Option_ESTest extends Option_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs((-698));
      boolean boolean0 = option0.requiresArg();
      assertEquals((-698), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Option option0 = new Option("Deprecated", "Deprecated", true, "HinvA%u3W");
      option0.setArgs((-31));
      // Undeclared exception!
      try { 
        option0.processValue("Deprecated");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.hasArgs();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator('T');
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("x]4]IZq,s");
      option_Builder0.required(true);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      option0.setOptionalArg(true);
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Option option0 = new Option("o-", "o-", true, "");
      option0.processValue("");
      option0.getValuesList();
      assertEquals("o-", option0.getLongOpt());
      assertFalse(option0.hasValueSeparator());
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.setValueSeparator('G');
      char char0 = option0.getValueSeparator();
      assertEquals('G', char0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getValue((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder1.hasArg();
      Option option0 = option_Builder1.build();
      option0.processValue("");
      String string0 = option0.getValue();
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("");
      Option option0 = option_Builder0.build();
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Option option0 = new Option("Tjg", "Z.z('`[4wy 0U*PS(");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("Tjg");
      option0.getLongOpt();
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setDescription("");
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder0.deprecated();
      Option option0 = option_Builder1.build();
      option0.getDeprecated();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder1.hasArg();
      Option option0 = option_Builder1.build();
      int int0 = option0.getArgs();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Option option0 = new Option((String) null, "u`MN]QX!y;+", false, "e-*s'V&");
      option0.setArgName("8,~*f<|J`94$A");
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
      assertEquals("e-*s'V&", option0.getDescription());
      assertEquals("u`MN]QX!y;+", option0.getLongOpt());
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Option option0 = new Option("03$YAstzGgO", "");
      option0.setArgName("");
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Option option0 = new Option("cyz", "cyz", true, "arW");
      // Undeclared exception!
      try { 
        option0.setType((Object) "cyz");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder1.hasArg();
      Option option0 = option_Builder1.build();
      option0.processValue("");
      try { 
        option0.getValue(2810);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2810, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Option option0 = new Option((String) null, "", false, (String) null);
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Option option0 = new Option((String) null, "");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("[ ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '['.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("EEE MMM dd HH:mm:ss zzz yyyy", true, ":UI");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'EEE MMM dd HH:mm:ss zzz yyyy' contains an illegal character : ' '.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("[ARG...]", "", true, "V8{[oU#?mSsB}@BVn}'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '['.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("I?uo", "^1x5.^`%p");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'I?uo' contains an illegal character : '?'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      Option.Builder option_Builder2 = option_Builder1.option("vM4");
      Option option0 = option_Builder2.build();
      boolean boolean0 = option0.isDeprecated();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Option option0 = new Option("w$", true, "X1Qwcgc");
      option0.isDeprecated();
      assertFalse(option0.hasLongOpt());
      assertEquals("X1Qwcgc", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Option option0 = new Option("03$YAstzGgO", "");
      boolean boolean0 = option0.hasValueSeparator();
      assertFalse(boolean0);
      assertEquals("", option0.getDescription());
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder1.valueSeparator();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasValueSeparator();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
      assertEquals('=', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Option option0 = new Option("03$YAstzGgO", "");
      boolean boolean0 = option0.hasArgs();
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, "9@rl{J/tNOT-");
      option0.setArgs(0);
      boolean boolean0 = option0.hasArg();
      assertEquals(0, option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, "9@rl{J/tNOT-");
      option0.hasArg();
      assertEquals("9@rl{J/tNOT-", option0.getDescription());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      option_Builder1.longOpt("");
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasArg();
      assertTrue(option0.hasArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option.Builder option_Builder2 = option_Builder1.longOpt("");
      Option option0 = option_Builder2.build();
      option0.processValue("org.apache.commons.cli.DeprecatedAttributes");
      String string0 = option0.getValue();
      assertTrue(option0.hasArg());
      assertNotNull(string0);
      assertTrue(option0.hasArgs());
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("vM4");
      Option option0 = option_Builder1.build();
      String string0 = option0.getKey();
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      option0.hasOptionalArg();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Option option0 = new Option("Deprecated", "Deprecated", true, "HinvA%u3W");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertEquals("HinvA%u3W", option0.getDescription());
      assertEquals("Deprecated", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option.Builder option_Builder2 = option_Builder1.longOpt("[ARG...]");
      Option option0 = option_Builder2.build();
      String string0 = option0.toString();
      assertEquals("[ Option null [ARG...][ARG...] :: null :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      Option.Builder option_Builder2 = option_Builder1.longOpt("[ARG...]");
      Option option0 = option_Builder2.build();
      String string0 = option0.toString();
      assertEquals("[ Option null [ARG...] Deprecated :: null :: class java.lang.String ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Option option0 = new Option("Deprecated", "Deprecated", true, "HinvA%u3W");
      String string0 = option0.toString();
      assertEquals("[ Option Deprecated Deprecated [ARG] :: HinvA%u3W :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, "9@rl{J/tNOT-");
      assertFalse(option0.isDeprecated());
      
      String string0 = option0.toString();
      assertEquals("[ Option Deprecated [ARG] :: 9@rl{J/tNOT- :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option.Builder option_Builder2 = option_Builder1.longOpt("");
      Option option0 = option_Builder2.build();
      option0.processValue("org.apache.commons.cli.DeprecatedAttributes");
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasArg());
      assertTrue(option0.hasArgs());
      assertFalse(option0.hasValueSeparator());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option.Builder option_Builder2 = option_Builder1.longOpt("");
      Option option0 = option_Builder2.build();
      boolean boolean0 = option0.requiresArg();
      assertTrue(boolean0);
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("jz");
      option_Builder0.valueSeparator();
      Option.Builder option_Builder2 = option_Builder1.hasArg();
      Option option0 = option_Builder2.build();
      assertTrue(option0.hasArg());
      
      option0.processValue("=");
      assertEquals('=', option0.getValueSeparator());
      assertTrue(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      option_Builder1.longOpt("jz");
      option_Builder1.valueSeparator();
      Option option0 = option_Builder0.build();
      option0.processValue("=");
      assertTrue(option0.hasArg());
      assertEquals("", option0.getValue());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Option option0 = new Option("Deprecated", "HinvA%u3W");
      // Undeclared exception!
      try { 
        option0.processValue("c2e7Ub%s#'>vX>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder0.deprecated();
      Option option0 = option_Builder1.build();
      String string0 = option0.toDeprecatedString();
      assertEquals((-1), option0.getArgs());
      assertEquals("Option 'null''': Deprecated", string0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "9o");
      String string0 = option0.toDeprecatedString();
      assertEquals("", string0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("x]4]IZq,s");
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasLongOpt();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Option option0 = new Option("Tjg", "Z.z('`[4wy 0U*PS(");
      boolean boolean0 = option0.hasLongOpt();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertEquals("Z.z('`[4wy 0U*PS(", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      option_Builder1.longOpt("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Option option0 = new Option("Tjg", "Z.z('`[4wy 0U*PS(");
      option0.setArgs(46);
      boolean boolean0 = option0.hasArgs();
      assertEquals(46, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("[ ");
      option_Builder0.argName("");
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Option option0 = new Option("converterMap", "79O(i|#,w{0\"j}/TrI");
      boolean boolean0 = option0.hasArgName();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
      assertEquals("79O(i|#,w{0\"j}/TrI", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      String[] stringArray0 = option0.getValues();
      assertNull(stringArray0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Option option0 = new Option("o-", "o-", true, "");
      option0.processValue("");
      String[] stringArray0 = option0.getValues();
      assertFalse(option0.hasValueSeparator());
      assertEquals("", option0.getDescription());
      assertNotNull(stringArray0);
      assertEquals("o-", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      String string0 = option0.getValue("4?(`");
      assertNotNull(string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, "9@rl{J/tNOT-");
      option0.getValue(80);
      assertEquals("9@rl{J/tNOT-", option0.getDescription());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder1.hasArg();
      Option option0 = option_Builder1.build();
      option0.processValue("");
      try { 
        option0.getValue((-2832));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      option0.getValue();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Option option0 = new Option("o-", "o-", true, "");
      option0.processValue("");
      String string0 = option0.getValue("#XFQZPUVO*x}");
      assertEquals("", string0);
      assertEquals("", option0.getDescription());
      assertEquals("o-", option0.getLongOpt());
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      String string0 = option0.getKey();
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt(")");
      Option option0 = option_Builder1.build();
      Option option1 = new Option((String) null, ")", false, (String) null);
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option0.getArgs());
      assertEquals((-1), option1.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "9o");
      Option.Builder option_Builder0 = Option.builder("9o");
      option_Builder0.longOpt("$ 5RfGIA(Vb9");
      Option option1 = option_Builder0.build();
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option1.getArgs());
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "9o");
      Option.Builder option_Builder0 = Option.builder("9o");
      Option option1 = option_Builder0.build();
      boolean boolean0 = option0.equals(option1);
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Option option0 = new Option("Deprecated", false, "Deprecated");
      boolean boolean0 = option0.equals(option0);
      assertTrue(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Option option0 = new Option("o-", "o-", true, "");
      Object object0 = new Object();
      boolean boolean0 = option0.equals(object0);
      assertEquals("o-", option0.getLongOpt());
      assertEquals("", option0.getDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder1.hasArg();
      Option option0 = option_Builder1.build();
      option0.processValue((String) null);
      // Undeclared exception!
      try { 
        option0.processValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setOptionalArg(true);
      boolean boolean0 = option0.acceptsArg();
      assertTrue(option0.hasOptionalArg());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Option option0 = new Option("o-", "o-", true, "");
      assertTrue(option0.hasArg());
      
      option0.processValue("");
      boolean boolean0 = option0.acceptsArg();
      assertFalse(boolean0);
      assertEquals("o-", option0.getLongOpt());
      assertFalse(option0.hasValueSeparator());
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(true);
      Option.Builder option_Builder2 = option_Builder1.optionalArg(true);
      assertSame(option_Builder2, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      // Undeclared exception!
      try { 
        option_Builder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Either opt or longOpt must be specified
         //
         verifyException("org.apache.commons.cli.Option$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Option option0 = new Option("o-", "o-", true, "");
      option0.getOpt();
      assertEquals(1, option0.getArgs());
      assertEquals("", option0.getDescription());
      assertEquals("o-", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Option option0 = new Option("o-", "o-", true, "");
      option0.getType();
      assertEquals("o-", option0.getLongOpt());
      assertEquals("", option0.getDescription());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Option option0 = new Option("Deprecated", false, "Deprecated");
      // Undeclared exception!
      try { 
        option0.addValue(">TxC");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the processValue method instead.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Option option0 = new Option("Tjg", "Z.z('`[4wy 0U*PS(");
      option0.hashCode();
      assertEquals("Z.z('`[4wy 0U*PS(", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("x]4]IZq,s");
      Option option0 = option_Builder1.build();
      option0.isRequired();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Option option0 = new Option("Tjg", "Z.z('`[4wy 0U*PS(");
      String string0 = option0.getDescription();
      assertEquals((-1), option0.getArgs());
      assertEquals("Z.z('`[4wy 0U*PS(", string0);
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Option option0 = new Option("converterMap", "79O(i|#,w{0\"j}/TrI");
      int int0 = option0.getArgs();
      assertEquals("79O(i|#,w{0\"j}/TrI", option0.getDescription());
      assertEquals((-1), int0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Option option0 = new Option((String) null, "");
      option0.clearValues();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getDeprecated();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      boolean boolean0 = option0.requiresArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Option option0 = new Option("o-", "o-", true, "");
      option0.setArgName("o-");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "9o");
      Option option1 = (Option)option0.clone();
      assertFalse(option1.hasLongOpt());
      assertNotSame(option1, option0);
      assertTrue(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Option option0 = new Option("o-", "o-", true, "");
      int int0 = option0.getId();
      assertEquals(111, int0);
      assertEquals("", option0.getDescription());
      assertEquals("o-", option0.getLongOpt());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, "9@rl{J/tNOT-");
      Converter<?, ?> converter0 = option0.getConverter();
      assertNotNull(converter0);
      
      option0.setConverter(converter0);
      assertEquals(1, option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals("9@rl{J/tNOT-", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Option option0 = new Option("Tjg", "Z.z('`[4wy 0U*PS(");
      option0.getValuesList();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("Z.z('`[4wy 0U*PS(", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setRequired(false);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      option0.setOptionalArg(true);
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasOptionalArg());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Option option0 = new Option((String) null, "u`MN]QX!y;+", false, "e-*s'V&");
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
      assertEquals("u`MN]QX!y;+", option0.getKey());
      assertTrue(option0.hasLongOpt());
      assertEquals("e-*s'V&", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.setType((Object) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Class<Option> class0 = Option.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.desc("Tjg");
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      Option.Builder option_Builder2 = option_Builder1.option("vM4");
      Option option0 = option_Builder2.build();
      String string0 = option0.toDeprecatedString();
      assertEquals("Option 'vM4': Deprecated", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs((-1));
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      DeprecatedAttributes deprecatedAttributes0 = DeprecatedAttributes.DEFAULT;
      Option.Builder option_Builder1 = option_Builder0.deprecated(deprecatedAttributes0);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      Converter<?, ?> converter0 = option0.getConverter();
      assertNotNull(converter0);
      
      option_Builder0.converter(converter0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required();
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.valueSeparator();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder1.hasArg();
      Option option0 = option_Builder1.build();
      // Undeclared exception!
      try { 
        option0.processValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }
}
