
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
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OptionBuilder_ESTest extends OptionBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withType((Object) null);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionBuilder.withLongOpt("d$k~@");
      Option option0 = OptionBuilder.create("0oPFp");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionBuilder.hasArgs();
      Option option0 = OptionBuilder.create("0oPFp");
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionBuilder.withArgName("hK");
      Option option0 = OptionBuilder.create("hK");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(0);
      Option option0 = OptionBuilder.create((String) null);
      assertTrue(option0.hasOptionalArg());
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionBuilder.withValueSeparator('');
      Option option0 = OptionBuilder.create('');
      assertEquals((-1), option0.getArgs());
      assertEquals("", option0.getOpt());
      assertEquals('', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionBuilder.withLongOpt("Cannot add value, list full.");
      Option option0 = OptionBuilder.create('M');
      assertEquals((-1), option0.getArgs());
      assertEquals("M", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionBuilder.withArgName("org.apache.commons.cli.DeprecatedAttributes");
      Option option0 = OptionBuilder.create('M');
      assertEquals((-1), option0.getArgs());
      assertEquals("M", option0.getKey());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionBuilder.hasArgs(0);
      Option option0 = OptionBuilder.create('1');
      assertEquals(0, option0.getArgs());
      assertEquals("1", option0.getKey());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionBuilder.withLongOpt("must specify longopt");
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionBuilder.withLongOpt("must specify longopt");
      OptionBuilder.withValueSeparator();
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
      assertEquals('=', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionBuilder.withLongOpt("");
      OptionBuilder.withArgName("HMab#8");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptionBuilder.withLongOpt("");
      OptionBuilder.hasOptionalArgs(0);
      Option option0 = OptionBuilder.create();
      assertEquals(0, option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionBuilder.hasArgs(1924);
      OptionBuilder.withLongOpt("must specify longopt");
      Option option0 = OptionBuilder.create();
      assertEquals(1924, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        OptionBuilder.create('~');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '~'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        OptionBuilder.create(" for removal");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name ' '.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(true);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(false);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        OptionBuilder.create();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must specify longopt
         //
         verifyException("org.apache.commons.cli.OptionBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withDescription("!?w8B1k`b}<k");
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OptionBuilder.hasOptionalArgs();
      Option option0 = OptionBuilder.create('');
      assertEquals((-2), option0.getArgs());
      assertTrue(option0.hasOptionalArg());
      assertEquals(127, option0.getId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OptionBuilder.withValueSeparator();
      Option option0 = OptionBuilder.create((String) null);
      assertEquals((-1), option0.getArgs());
      assertEquals('=', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OptionBuilder optionBuilder0 = OptionBuilder.withType(class0);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OptionBuilder.hasOptionalArg();
      Option option0 = OptionBuilder.create("l3TX4SZd$");
      assertTrue(option0.hasOptionalArg());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OptionBuilder.isRequired(true);
      Option option0 = OptionBuilder.create('2');
      assertEquals((-1), option0.getArgs());
      assertEquals(50, option0.getId());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OptionBuilder.hasArg();
      Option option0 = OptionBuilder.create('h');
      assertEquals("h", option0.getKey());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create("Deprecated");
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        OptionBuilder.withType((Object) "?KQHZt{qDA-K@F");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.OptionBuilder", e);
      }
  }
}
