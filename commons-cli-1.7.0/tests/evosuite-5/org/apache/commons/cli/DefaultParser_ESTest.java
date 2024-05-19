
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Properties;
import java.util.function.Consumer;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DefaultParser_ESTest extends DefaultParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      defaultParser0.handleConcatenatedOptions("");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "H:5&QSf$Pvtc de:";
      defaultParser0.parse(options0, stringArray0, true);
      defaultParser0.checkRequiredOptions();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-\"F]pCcj";
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = DefaultParser.indexOfEqual("=q");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = DefaultParser.indexOfEqual("J5o2kOmvA=;");
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = DefaultParser.indexOfEqual("org.apache.commons.cli.DefaultParser$Builder");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        defaultParser0.parse((Options) null, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "";
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put(object0, object0);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[2];
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        defaultParser0.parse((Options) null, stringArray0, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "yoZ7+(GX`j`~*N8^g";
      stringArray0[1] = "+A,*qs'p}R}i?jxKI;";
      stringArray0[2] = "";
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put(object0, object0);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DefaultParser.indexOfEqual((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "3\u0006|*C(:J\"^LUN";
      stringArray0[1] = "3\u0006|*C(:J\"^LUN";
      stringArray0[2] = "R3.qLrGw6?y:/4%&e[";
      stringArray0[3] = "C";
      stringArray0[4] = "]r+@;M}  Rr:!'po";
      stringArray0[5] = "+.^";
      stringArray0[6] = "=IQuK";
      Properties properties0 = new Properties();
      defaultParser0.parse(options0, stringArray0, properties0);
      try { 
        defaultParser0.handleConcatenatedOptions("-org.apache.commons.cli.DefaultParser");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -org.apache.commons.cli.DefaultParser
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      // Undeclared exception!
      try { 
        defaultParser0.handleConcatenatedOptions("[3/8");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      // Undeclared exception!
      try { 
        defaultParser0.checkRequiredOptions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("1", true, "1");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "C";
      stringArray0[1] = "R3.qLrGw6?y:/4%&e[";
      stringArray0[2] = "C";
      stringArray0[3] = "R3.qLrGw6?y:/4%&e[";
      stringArray0[4] = "R3.qLrGw6?y:/4%&e[";
      stringArray0[5] = "-=q";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -=q
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-";
      stringArray0[1] = "r$h/-";
      stringArray0[2] = "BxZQb{.Dk2";
      stringArray0[3] = "<163;";
      stringArray0[4] = "FG&d#A";
      stringArray0[5] = "org.apache.commons.cli.Option$1";
      stringArray0[6] = "(&7d[HDU@<8Yo;+`";
      stringArray0[7] = "fF2z,K4";
      stringArray0[8] = "-I";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -I
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put("", object0);
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Default option wasn't defined
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "org.apache.commons.cli.DefaultParser";
      stringArray0[1] = "--=q";
      Properties properties0 = new Properties();
      options0.addOption("1", "true", true, "--=q");
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "3\u0006|*C(:J\"^LUN";
      stringArray0[1] = "--org.apache.commons.cli.Option$1";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --org.apache.commons.cli.Option$1
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "3\u0006|*C(:J\"^LUN";
      Properties properties0 = new Properties();
      defaultParser0.parse(options0, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("-org.apache.commons.cli.DefaultParser");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "1";
      stringArray0[1] = "-8*;";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -8*;
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setAllowPartialMatching(true);
      assertSame(defaultParser_Builder0, defaultParser_Builder1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Consumer<Option> consumer0 = (Consumer<Option>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setDeprecatedHandler(consumer0);
      assertSame(defaultParser_Builder0, defaultParser_Builder1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf(true);
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      assertSame(defaultParser_Builder1, defaultParser_Builder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      defaultParser0.handleConcatenatedOptions("-");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "=q";
      stringArray0[1] = "true";
      stringArray0[2] = "I";
      stringArray0[3] = "org.apache.commons.cli.Option$1";
      stringArray0[4] = "-wyBW|Q:W/h";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -wyBW|Q:W/h
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      options0.addRequiredOption("L", "L", false, "L");
      try { 
        defaultParser0.parse(options0, (String[]) null, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required option: L
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}
