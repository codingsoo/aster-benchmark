
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
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DefaultParser_ESTest extends DefaultParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      defaultParser0.handleConcatenatedOptions("[");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      defaultParser_Builder0.setAllowPartialMatching(false);
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "*";
      stringArray0[3] = "-m6gXlj1({<9$KNutFB";
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -m6gXlj1({<9$KNutFB
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "$6b|~<s2[+(B;,";
      stringArray0[1] = " ";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "7g|";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = DefaultParser.indexOfEqual("--^Nb[W$=?2Wg+Iio_");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = DefaultParser.indexOfEqual("T<K0/cp5Z");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      String[] stringArray0 = new String[9];
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        defaultParser0.parse((Options) null, stringArray0, properties0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-+.4>-#tiX/.'_B";
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put(object0, object0);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[7];
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
  public void test08()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      Enumeration<?> enumeration0 = properties0.propertyNames();
      properties0.put(enumeration0, options0);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, (String[]) null, properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Collections$EmptyEnumeration cannot be cast to java.lang.String
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.parse((Options) null, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
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
      DefaultParser defaultParser0 = new DefaultParser(true);
      // Undeclared exception!
      try { 
        defaultParser0.handleConcatenatedOptions("Z9,");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0, false);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      defaultParser0.parse(options0, (String[]) null, true);
      defaultParser0.checkRequiredOptions();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-";
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "B@oF$/y$AAO {b(Xf";
      stringArray0[3] = "--";
      Options options0 = new Options();
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "k{DpHQTPw uT5";
      stringArray0[1] = "true";
      stringArray0[2] = "-*";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -*
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "5>=]o~a$`-qSTcaz(OE";
      stringArray0[1] = "5>=]o~a$`-qSTcaz(OE";
      stringArray0[2] = "5>=]o~a$`-qSTcaz(OE";
      stringArray0[3] = "pJ";
      stringArray0[4] = "5>=]o~a$`-qSTcaz(OE";
      stringArray0[5] = "5>=]o~a$`-qSTcaz(OE";
      stringArray0[6] = "5>=]o~a$`-qSTcaz(OE";
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put("5>=]o~a$`-qSTcaz(OE", object0);
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Default option wasn't defined
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      defaultParser0.parse(options0, stringArray0, false);
      try { 
        defaultParser0.handleConcatenatedOptions("--4ka>{Rt}`L(s)@H");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --4ka>{Rt}`L(s)@H
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "--^Nb[W$=?2Wg+Iio_";
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --^Nb[W$=?2Wg+Iio_
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      defaultParser0.handleConcatenatedOptions("");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      LinkedList<OptionGroup> linkedList0 = new LinkedList<OptionGroup>();
      defaultParser0.expectedOpts = (List) linkedList0;
      OptionGroup optionGroup0 = new OptionGroup();
      linkedList0.add(optionGroup0);
      try { 
        defaultParser0.checkRequiredOptions();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required option: []
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-+.4>-#tiX/.'_B";
      Properties properties0 = new Properties();
      defaultParser0.parse(options0, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("-+.4>-#tiX/.'_B");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setAllowPartialMatching(false);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "PCv7z:e{Q\"p*DXJU";
      stringArray0[1] = "^Nb[W$=?2Wg+Iio_";
      stringArray0[2] = "--.,*-";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --.,*-
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setDeprecatedHandler((Consumer<Option>) null);
      assertSame(defaultParser_Builder1, defaultParser_Builder0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf("org.apache.commons.cli.AmbiguousOptionException");
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      assertSame(defaultParser_Builder0, defaultParser_Builder1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "[ Options: [ short ";
      stringArray0[1] = "-5>=]o~a$`-qSTcaz(OE";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -5>=]o~a$`-qSTcaz(OE
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
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
}
