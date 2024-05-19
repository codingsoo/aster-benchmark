
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
      boolean boolean0 = options0.hasShortOption("-=j6/}Y63M~H");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("-5tYk}[D\";TCF");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("--");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      List<String> list0 = options0.getMatchingOptions("-;O");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      List<Option> list0 = options0.helpOptions();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("ke", "Sh#mTX2\"", false, "Sh#mTX2\"");
      List<Option> list0 = options0.helpOptions();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Option option0 = new Option((String) null, true, (String) null);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options0.getOptionGroup(option0);
      assertNotNull(optionGroup2);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("pBrLnVj7B", true, "c,;0tIFRPkDaxR");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
      assertNotNull(optionGroup2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, "");
      Options options1 = options0.addOption(option0);
      option0.setOptionalArg(true);
      Option option1 = options1.getOption((String) null);
      assertFalse(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, "peh@Z4P", false, "O^.Y)rO}YbW&a");
      Option option0 = options1.getOption("peh@Z4P");
      assertTrue(option0.isRequired());
      assertNotNull(option0);
      assertFalse(option0.hasArg());
      assertEquals("O^.Y)rO}YbW&a", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption((String) null, "peh@Z4P", false, "O^.Y)rO}YbW&a");
      // Undeclared exception!
      try { 
        options0.getMatchingOptions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("e~BkNc0M&}P", "l]!n(~vjA;>;", true, ",h1tC");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'e~BkNc0M&}P' contains an illegal character : '~'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("", false, "Duplicate key: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("", "org.apache.commons.cli.Options", false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("AHVZg3ib=}A,hdo", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'AHVZg3ib=}A,hdo' contains an illegal character : '='.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption((String) null, (String) null, false, (String) null);
      boolean boolean0 = options0.hasOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("V", true, "k");
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null);
      Options options1 = options0.addOption(option0);
      boolean boolean0 = options1.hasShortOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("k", "wY d:ROw[ Options: [ short java.util.LinkedHashMap@0000000003 ] [ long {b^=dTP.=[ Option null b^=dTP. :: JX :: class java.lang.String ]} ]T-", false, "wY d:ROw[ Options: [ short java.util.LinkedHashMap@0000000003 ] [ long {b^=dTP.=[ Option null b^=dTP. :: JX :: class java.lang.String ]} ]T-");
      boolean boolean0 = options1.hasOption("wY d:ROw[ Options: [ short java.util.LinkedHashMap@0000000003 ] [ long {b^=dTP.=[ Option null b^=dTP. :: JX :: class java.lang.String ]} ]T-");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("T-", "T-", true, "T-");
      Options options1 = options0.addOption(option0);
      boolean boolean0 = options1.hasLongOption("T-");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("JX");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, "b^=dTP.", true, "JX");
      options0.addOption(option0);
      List<String> list0 = options0.getMatchingOptions("");
      assertEquals(1, list0.size());
      assertFalse(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("k", "wY d:ROw[ Options: [ short java.util.LinkedHashMap@0000000003 ] [ long {b^=dTP.=[ Option null b^=dTP. :: JX :: class java.lang.String ]} ]T-", false, "wY d:ROw[ Options: [ short java.util.LinkedHashMap@0000000003 ] [ long {b^=dTP.=[ Option null b^=dTP. :: JX :: class java.lang.String ]} ]T-");
      List<String> list0 = options0.getMatchingOptions("k");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("k", "ou!dtH]m", true, "k");
      List<String> list0 = options0.getMatchingOptions("ou!dtH]m");
      assertTrue(list0.contains("ou!dtH]m"));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = new Options();
      Options options2 = options0.addOptions(options1);
      Option option0 = new Option((String) null, "b^=dTP.", true, "JX");
      options2.addOption(option0);
      Options options3 = options1.addOptions(options2);
      assertFalse(options3.equals((Object)options0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null);
      Options options1 = options0.addOption(option0);
      // Undeclared exception!
      try { 
        options0.addOptions(options1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Duplicate key: null
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, (String) null, true, (String) null);
      Option option0 = options1.getOption((String) null);
      assertNotNull(option0);
      
      options1.addOption(option0);
      assertTrue(option0.isRequired());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null);
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      List<?> list0 = options0.getRequiredOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("et8Xa_Y", "et8Xa_Y");
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("et8Xa_Y", "et8Xa_Y", false, "et8Xa_Y");
      List<String> list0 = options0.getMatchingOptions("-= Z`@oS.n<+I|]k/");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("et8Xa_Y", false, "et8Xa_Y");
      assertSame(options1, options0);
  }
}
