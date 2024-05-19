
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
  public void test00()  throws Throwable  {
      Option option0 = new Option((String) null, false, " ]");
      option0.setArgs((-1178));
      boolean boolean0 = option0.acceptsArg();
      assertEquals((-1178), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs(0);
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      option_Builder0.hasArg();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator('5');
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required(true);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      DeprecatedAttributes deprecatedAttributes0 = DeprecatedAttributes.DEFAULT;
      Option.Builder option_Builder1 = option_Builder0.deprecated(deprecatedAttributes0);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option option0 = new Option("Deprecated", "Deprecated");
      option0.setType((Object) null);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      option0.setRequired(true);
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option("8Y", true, "org.apache.commons.cli.Util");
      option0.processValue((String) null);
      option0.getValuesList();
      assertEquals("org.apache.commons.cli.Util", option0.getDescription());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      option0.setValueSeparator('0');
      char char0 = option0.getValueSeparator();
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Option option0 = new Option("UG", "Either opt or longOpt must be specified", false, "UG");
      option0.setValueSeparator('E');
      char char0 = option0.getValueSeparator();
      assertEquals('E', char0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Option option0 = new Option("n6K", "m\"`(tz>s!MPWomx", false, "n6K");
      String string0 = option0.getValue("Either opt or longOpt must be specified");
      assertEquals("m\"`(tz>s!MPWomx", option0.getLongOpt());
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
      assertEquals("n6K", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option option0 = new Option("8i", true, "lM'3>");
      String string0 = option0.getValue("");
      assertEquals("lM'3>", option0.getDescription());
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      String string0 = option0.getOpt();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      option_Builder0.longOpt("^@s04;]s;Y");
      Option option0 = option_Builder0.build();
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "QhWz:)|M)s3$z<`^j0");
      String string0 = option0.getDescription();
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      option0.setDescription("");
      option0.getDescription();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      Option option0 = option_Builder1.build();
      option0.getDeprecated();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs(0);
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Option option0 = new Option("U", "");
      option0.setArgs(2063);
      int int0 = option0.getArgs();
      assertEquals(2063, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.setValueSeparator('V');
      option0.setArgs((-2));
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

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.setArgs((-2));
      option0.processValue("7");
      try { 
        option0.getValue((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
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
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("IB<e$>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'IB<e$>' contains an illegal character : '<'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("u%[f{0", true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'u%[f{0' contains an illegal character : '%'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("", "", true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("");
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.isDeprecated();
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Option option0 = new Option("UG", "Either opt or longOpt must be specified", false, "UG");
      option0.isDeprecated();
      assertEquals("UG", option0.getDescription());
      assertEquals("Either opt or longOpt must be specified", option0.getLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.hasValueSeparator();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.setValueSeparator('V');
      boolean boolean0 = option0.hasValueSeparator();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      boolean boolean0 = option0.hasArgs();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("{k{X7Xkm.kS|uxtb21");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArg();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "gBS%w!)XsnD");
      option0.hasArg();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      option0.getValue();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      option0.getKey();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Option option0 = new Option("8i", true, "lM'3>");
      option0.hasOptionalArg();
      assertFalse(option0.hasLongOpt());
      assertEquals("lM'3>", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Option option0 = new Option("8i", true, "lM'3>");
      String string0 = option0.toString();
      assertEquals("[ Option 8i [ARG] :: lM'3> :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      option0.setArgs(1687);
      option0.toString();
      assertEquals(1687, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      option_Builder0.deprecated();
      Option option0 = option_Builder0.build();
      String string0 = option0.toString();
      assertEquals((-1), option0.getArgs());
      assertEquals("[ Option 8i Deprecated :: null :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      Option.Builder option_Builder1 = option_Builder0.longOpt("^@s04;]s;Y");
      Option option0 = option_Builder1.build();
      assertFalse(option0.isDeprecated());
      
      String string0 = option0.toString();
      assertEquals("[ Option 8i ^@s04;]s;Y :: null :: class java.lang.String ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      option_Builder1.longOpt("^@s04;]s;Y");
      Option option0 = option_Builder0.build();
      String string0 = option0.toDeprecatedString();
      assertEquals("Option '8i''^@s04;]s;Y': Deprecated", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      option0.processValue("7");
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs((-2));
      boolean boolean0 = option0.requiresArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("7");
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder((String) null);
      option_Builder0.hasArg();
      option_Builder0.longOpt("Either opt or longOpt must be specified");
      Option option0 = option_Builder0.build();
      option0.setValueSeparator('B');
      option0.processValue("+?|06BHOy9@");
      assertTrue(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Option option0 = new Option((String) null, "");
      // Undeclared exception!
      try { 
        option0.processValue("[ Option null ::  :: class java.lang.String ]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      String string0 = option0.toDeprecatedString();
      assertEquals((-1), option0.getArgs());
      assertEquals("", string0);
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      option_Builder0.longOpt("^@s04;]s;Y");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasLongOpt();
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Option option0 = new Option("8i", true, "lM'3>");
      boolean boolean0 = option0.hasLongOpt();
      assertEquals("lM'3>", option0.getDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("7");
      option_Builder1.numberOfArgs(78);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertEquals(78, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      Option.Builder option_Builder1 = option_Builder0.argName("8i");
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasArgName();
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      String[] stringArray0 = option0.getValues();
      assertNull(stringArray0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      option0.processValue((String) null);
      String[] stringArray0 = option0.getValues();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      option0.getValue((-1));
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      option0.getValue((String) null);
      assertTrue(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      Option option1 = new Option((String) null, false, (String) null);
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      boolean boolean0 = option0.equals(",tFg]");
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      boolean boolean0 = option0.equals(option0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder((String) null);
      option_Builder0.longOpt("Either opt or longOpt must be specified");
      Option option0 = option_Builder0.build();
      Option option1 = new Option((String) null, false, ">4L#xU3<7;d!:&v75");
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option1.getArgs());
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "");
      option0.processValue("org.apache.commons.cli.Option$1");
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
  public void test65()  throws Throwable  {
      Option option0 = new Option("8i", true, "lM'3>");
      assertTrue(option0.hasArg());
      
      option0.processValue("Either opt or longOpt must be specified");
      String string0 = option0.getValue();
      assertEquals("lM'3>", option0.getDescription());
      assertFalse(option0.hasLongOpt());
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      Option option0 = option_Builder0.build();
      option0.setOptionalArg(true);
      boolean boolean0 = option0.acceptsArg();
      assertTrue(option0.hasOptionalArg());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
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
  public void test70()  throws Throwable  {
      Option option0 = new Option("8i", true, "lM'3>");
      option0.setType((Class<?>) null);
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
      assertEquals("lM'3>", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setLongOpt("[ Option null :: null :: class java.lang.String ]");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      option0.getType();
      assertTrue(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Option option0 = new Option("n6K", "n6K", false, "n6K");
      // Undeclared exception!
      try { 
        option0.addValue("p?&Qm9s=9tLg\"");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the processValue method instead.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Option option0 = new Option("8i", true, "lM'3>");
      String string0 = option0.getLongOpt();
      assertTrue(option0.hasArg());
      assertNull(string0);
      assertEquals("lM'3>", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.hashCode();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      option0.isRequired();
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      String string0 = option0.getDescription();
      assertNull(string0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      int int0 = option0.getArgs();
      assertEquals((-1), int0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      option0.clearValues();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      option0.getDeprecated();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.setValueSeparator('V');
      option0.setArgs((-2));
      option0.processValue("7");
      assertEquals('V', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.setArgName("NO_ARGS_ALLOWED");
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Option option0 = new Option("j", false, (String) null);
      Option option1 = (Option)option0.clone();
      boolean boolean0 = option1.equals(option0);
      assertTrue(boolean0);
      assertNotSame(option1, option0);
      assertEquals((-1), option1.getArgs());
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      int int0 = option0.getId();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals(78, int0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Option option0 = new Option("n6K", "m\"`(tz>s!MPWomx", false, "n6K");
      Converter<?, ?> converter0 = option0.getConverter();
      assertNotNull(converter0);
      
      option0.setConverter(converter0);
      assertEquals("m\"`(tz>s!MPWomx", option0.getLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("n6K", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Option option0 = new Option("n6K", "m\"`(tz>s!MPWomx", false, "n6K");
      option0.getValuesList();
      assertEquals("m\"`(tz>s!MPWomx", option0.getLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("n6K", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Option option0 = new Option("8i", true, "lM'3>");
      Class<Option> class0 = Option.class;
      option0.setType(class0);
      assertEquals(1, option0.getArgs());
      assertEquals("lM'3>", option0.getDescription());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.setArgs((-2));
      option0.processValue("7");
      try { 
        option0.getValue(78);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 78, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Option option0 = new Option("8i", true, "lM'3>");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Option option0 = new Option("8i", true, "lM'3>");
      option0.getArgName();
      assertEquals("lM'3>", option0.getDescription());
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Option option0 = new Option((String) null, ",tFg]", false, (String) null);
      // Undeclared exception!
      try { 
        option0.setType((Object) ",tFg]");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Class<Option> class0 = Option.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.hasArgs();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder((String) null);
      Option.Builder option_Builder1 = option_Builder0.desc("4`^#g)K(o&7/");
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("8i");
      option_Builder0.deprecated();
      Option option0 = option_Builder0.build();
      String string0 = option0.toDeprecatedString();
      assertEquals((-1), option0.getArgs());
      assertEquals("Option '8i': Deprecated", string0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      Option option0 = new Option("n6K", "m\"`(tz>s!MPWomx", false, "n6K");
      Converter<?, ?> converter0 = option0.getConverter();
      assertNotNull(converter0);
      
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.converter(converter0);
      assertEquals("m\"`(tz>s!MPWomx", option0.getLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("n6K", option0.getDescription());
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required();
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test99()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      assertSame(option_Builder1, option_Builder0);
  }
}
