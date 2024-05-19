
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
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OptionGroup_ESTest extends OptionGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("FcTpL", true, "FcTpL");
      optionGroup0.setSelected(option0);
      String string0 = optionGroup0.getSelected();
      assertEquals("FcTpL", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, false, (String) null);
      optionGroup0.setRequired(true);
      optionGroup0.addOption(option0);
      assertTrue(optionGroup0.isRequired());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      // Undeclared exception!
      try { 
        optionGroup0.addOption((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.OptionGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Collection<Option> collection0 = optionGroup0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("2", (String) null);
      Option option1 = new Option((String) null, "0", false, "0");
      optionGroup0.addOption(option1);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      String string0 = optionGroup1.toString();
      assertEquals("[--0 0, -2]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, "hmZ\"g-s?3W}1v@&C", false, (String) null);
      optionGroup0.setSelected(option0);
      Option option1 = new Option("2", false, (String) null);
      try { 
        optionGroup0.setSelected(option1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The option '2' was specified but an option from this group has already been selected: 'hmZ\"g-s?3W}1v@&C'
         //
         verifyException("org.apache.commons.cli.OptionGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, "hmZ\"g-s?3W}1v@&C", false, (String) null);
      optionGroup0.setSelected(option0);
      optionGroup0.setSelected(option0);
      assertFalse(optionGroup0.isRequired());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setSelected((Option) null);
      assertNull(optionGroup0.getSelected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      String string0 = optionGroup0.getSelected();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Collection<String> collection0 = optionGroup0.getNames();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      boolean boolean0 = optionGroup0.isRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      boolean boolean0 = optionGroup0.isRequired();
      assertFalse(boolean0);
  }
}
