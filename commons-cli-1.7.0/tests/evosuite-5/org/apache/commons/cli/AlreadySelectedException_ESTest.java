
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
import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AlreadySelectedException_ESTest extends AlreadySelectedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("a40RRU", "a40RRU", true, "a40RRU");
      optionGroup0.setRequired(true);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertSame(optionGroup0, optionGroup1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("u3vw", "u3vw");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertSame(optionGroup1, optionGroup0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("V7q");
      Option option0 = alreadySelectedException0.getOption();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("hPA", true, "");
      option0.setRequired(true);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("dOA7BYBv", "dOA7BYBv");
      option0.setValueSeparator('_');
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertNull(option1.getArgName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null, false, (String) null);
      option0.setOptionalArg(true);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.setLongOpt("");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertEquals((-2), Option.UNLIMITED_VALUES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs(320);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("hPA", true, "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setArgName("[-hPA ]");
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.isDeprecated());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setArgs(0);
      Option option1 = alreadySelectedException0.getOption();
      assertSame(option1, option0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      AlreadySelectedException alreadySelectedException0 = null;
      try {
        alreadySelectedException0 = new AlreadySelectedException(optionGroup0, (Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.AlreadySelectedException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("V7q");
      OptionGroup optionGroup0 = alreadySelectedException0.getOptionGroup();
      assertNull(optionGroup0);
  }
}