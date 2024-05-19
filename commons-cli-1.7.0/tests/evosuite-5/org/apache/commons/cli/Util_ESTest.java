
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
import org.apache.commons.cli.Util;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens("*gpJi#u\"DWw{");
      assertEquals("*gpJi#u\"DWw{", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens("--");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("\"4'HM\"");
      assertEquals("4'HM", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("\"8TMt!");
      assertEquals("\"8TMt!", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("\"\"4'HM\"");
      assertEquals("\"\"4'HM\"", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("$");
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("*gpJi#u\"DWw{");
      assertEquals("*gpJi#u\"DWw{", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = Util.stripLeadingHyphens("-,lC~|8ppW#%)P7Jl");
      assertEquals(",lC~|8ppW#%)P7Jl", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = Util.stripLeadingAndTrailingQuotes((String) null);
      assertNull(string0);
  }
}
