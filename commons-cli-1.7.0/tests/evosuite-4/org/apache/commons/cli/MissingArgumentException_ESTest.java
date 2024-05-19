
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
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MissingArgumentException_ESTest extends MissingArgumentException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MissingArgumentException missingArgumentException0 = new MissingArgumentException("");
      Option option0 = missingArgumentException0.getOption();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.setRequired(true);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasArgName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option("rWtv", "rWtv");
      option0.setValueSeparator('1');
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Option option0 = new Option((String) null, "org.apache.commons.cli.MissingArgumentException", true, "Missing argument for option: ");
      option0.setOptionalArg(true);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals(1, option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "6nIG.PNTu");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgName("6nIG.PNTu");
      Option option1 = missingArgumentException0.getOption();
      assertEquals("6nIG.PNTu", option1.getDescription());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "6nIG.PNTu");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgs(0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.isRequired());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "6nIG.PNTu");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgs((-2));
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.isDeprecated());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MissingArgumentException missingArgumentException0 = null;
      try {
        missingArgumentException0 = new MissingArgumentException((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.MissingArgumentException", e);
      }
  }
}
