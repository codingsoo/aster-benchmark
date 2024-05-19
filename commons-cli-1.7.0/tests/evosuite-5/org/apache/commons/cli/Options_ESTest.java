
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
import java.util.Collection;
import java.util.List;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Options_ESTest extends Options_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("-6+B<Yr{nt+|Mz+");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("biK", "biK", false, "--");
      List<String> list0 = options0.getMatchingOptions("--");
      assertFalse(list0.contains("--"));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      List<String> list0 = options0.getMatchingOptions("-jC-q$bH");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, "E@\"/1Db;", true, (String) null);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("", false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      List<Option> list0 = options0.helpOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("NO_ARGS_ALLOWED", "", true, "NO_ARGS_ALLOWED");
      options0.addOption(option0);
      List<Option> list0 = options0.helpOptions();
      assertTrue(list0.contains(option0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      optionGroup0.setRequired(true);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options0.getOptionGroup(option0);
      assertNotNull(optionGroup2);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null, false, (String) null);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
      assertNotNull(optionGroup2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("vIMrFd", "'1AyL=2C0", false, "vIMrFd");
      Option option0 = options1.getOption("'1AyL=2C0");
      assertNotNull(option0);
      
      options0.getOptionGroup(option0);
      assertEquals("vIMrFd", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption((String) null, (String) null, false, (String) null);
      Option option0 = options0.getOption((String) null);
      assertFalse(option0.hasArg());
      assertTrue(option0.isRequired());
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("c", "c", true, "c");
      Option option0 = options1.getOption("c");
      assertEquals(1, option0.getArgs());
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, false, (String) null);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, "E@\"/1Db;", false, "E@\"/1Db;");
      // Undeclared exception!
      try { 
        options1.getMatchingOptions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("", "", false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOptions((Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOptionGroup((OptionGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("M,", (String) null, true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'M,' contains an illegal character : ','.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("Duplicate key: ", "Duplicate key: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'Duplicate key: ' contains an illegal character : ' '.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, "");
      boolean boolean0 = options1.hasOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, "org.apache.commons.cli.Option$Builder", true, " ]S");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("vIMrFd", "'1AyL=2C0", false, "vIMrFd");
      boolean boolean0 = options1.hasShortOption("vIMrFd");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("JvZR", "d+.o Q%N8dA`V]t", true, "JvZR");
      boolean boolean0 = options1.hasOption("d+.o Q%N8dA`V]t");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("NO_ARGS_ALLOWED", "", true, "NO_ARGS_ALLOWED");
      options0.addOption(option0);
      boolean boolean0 = options0.hasLongOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("[ ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("c", "c", false, "c");
      List<String> list0 = options1.getMatchingOptions(" ]");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("c", "c", false, "c");
      List<String> list0 = options0.getMatchingOptions("c");
      assertTrue(list0.contains("c"));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = new Options();
      Option option0 = new Option("c", "c");
      Options options2 = options1.addOption(option0);
      Options options3 = options0.addOptions(options1);
      assertFalse(options3.equals((Object)options2));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("c", "c", false, "c");
      // Undeclared exception!
      try { 
        options0.addOptions(options0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Duplicate key: c
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.getOptionGroup((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      List<?> list0 = options0.getRequiredOptions();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("c", "c", false, "c");
      Option option0 = options1.getOption("c");
      options0.addOption(option0);
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.isRequired());
      assertFalse(option0.hasArg());
  }
}
