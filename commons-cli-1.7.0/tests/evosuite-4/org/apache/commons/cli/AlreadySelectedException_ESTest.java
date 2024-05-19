
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
  public void test0()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, " since ", false, (String) null);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      optionGroup0.setRequired(true);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertNull(optionGroup1.getSelected());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertSame(optionGroup0, optionGroup1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("L", false, "L");
      option0.setValueSeparator('m');
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertTrue(option1.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("NO_ARGS_ALLOWED", ">{-(uN[G>/z7TT");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setOptionalArg(true);
      Option option1 = alreadySelectedException0.getOption();
      assertSame(option1, option0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, " since ", false, (String) null);
      option0.setArgName("YB iw-X`%,h");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasArgs());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("L", false, "L");
      option0.setArgs(951);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertNull(option1.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
  public void test7()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("dIeVb(FEvc[yi5>u3L");
      OptionGroup optionGroup0 = alreadySelectedException0.getOptionGroup();
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("dIeVb(FEvc[yi5>u3L");
      Option option0 = alreadySelectedException0.getOption();
      assertNull(option0);
  }
}
