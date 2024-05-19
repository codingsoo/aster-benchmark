
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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CommandLine_ESTest extends CommandLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("true", "@`{^1G9UQ(f");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('-', "D.,Q");
      assertEquals("D.,Q", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, (String) null, false, "0}w33K0");
      commandLine_Builder0.addOption(option0);
      Option option1 = new Option((String) null, "{  j\u0005`3R");
      String string0 = commandLine0.getOptionValue(option1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, (String) null);
      commandLine_Builder0.addOption(option0);
      Option option1 = new Option((String) null, false, (String) null);
      Properties properties0 = commandLine0.getOptionProperties(option1);
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.setDeprecatedHandler((Consumer<Option>) null);
      CommandLine commandLine0 = commandLine_Builder1.build();
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("c", true, "c");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption("c");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue((Option) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, (String) null);
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, (String) null);
      Supplier<Option> supplier0 = (Supplier<Option>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(option0).when(supplier0).get();
      Option option1 = commandLine0.getParsedOptionValue((String) null, supplier0);
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("49", "");
      Option option1 = commandLine0.getParsedOptionValue(")+8n+D+s-", option0);
      assertFalse(option1.hasArgs());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue('c', (Supplier<Object>) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue('-', (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("YV70n", "z", true, "org.apache.commons.cli.CommandLine$Builder");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("YV70n", "z", true, "org.apache.commons.cli.CommandLine$Builder");
      option0.processValue("z");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getOptionValues("z");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue((Option) null, supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("yx<hl}-\"").when(supplier0).get();
      String string0 = commandLine0.getOptionValue(option0, supplier0);
      assertEquals("yx<hl}-\"", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((Option) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue((Option) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue("", supplier0);
      //  // Unstable assertion: assertEquals("49", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue("E78", supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue('Q', supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue('Y', supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('m', "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("YV70n", "z", true, "org.apache.commons.cli.CommandLine$Builder");
      option0.processValue("z");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties("YV70n");
      assertEquals(1, properties0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addArg("YV70n");
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addArg("{H^p0Pe:m&<|+c");
      CommandLine commandLine0 = commandLine_Builder1.build();
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.contains("{H^p0Pe:m&<|+c"));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("vdw", false, " ,:v-`av=/m");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      // Undeclared exception!
      try { 
        commandLine0.getOptionProperties((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("49", "");
      boolean boolean0 = commandLine0.hasOption(option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("YV70n", "z", true, "org.apache.commons.cli.CommandLine$Builder");
      option0.processValue("z");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Object object0 = commandLine0.getParsedOptionValue(option0, supplier0);
      assertEquals("z", object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("c", true, "c");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<Option> supplier0 = (Supplier<Option>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Option option1 = commandLine0.getParsedOptionValue(option0, supplier0);
      assertNull(option1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue((Option) null, supplier0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("YV70n", "z", true, "org.apache.commons.cli.CommandLine$Builder");
      option0.processValue("z");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("NO_ARGS_ALLOWED", " to desired type: ", false, "NO_ARGS_ALLOWED");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      Option option1 = new Option("YV70n", "z", true, "org.apache.commons.cli.CommandLine$Builder");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getOptionValues(option1);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("lT", "lT");
      commandLine0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues((Option) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue((Option) null, supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("YV70n", "z", true, "org.apache.commons.cli.CommandLine$Builder");
      option0.processValue("z");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("z", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue("!R{\"rd{", supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption("ZlzolPt]sv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("YV70n", "z", true, "org.apache.commons.cli.CommandLine$Builder");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getOptionValues("z");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("@27hw11B", true, "@27hw11B");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      LinkedList<Option> linkedList0 = new LinkedList<Option>();
      LinkedList<Option> linkedList1 = commandLine0.getParsedOptionValue('w', linkedList0);
      assertEquals(0, linkedList1.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("YV70n", "z", true, "org.apache.commons.cli.CommandLine$Builder");
      option0.processValue("z");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertEquals(1, properties0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("c", true, "c");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption(option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("@27hw11B", true, "@27hw11B");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Option option1 = new Option("printWriter", "printWriter");
      commandLine_Builder1.addOption(option1);
      Option option2 = commandLine0.getParsedOptionValue("@27hw11B");
      assertNull(option2);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("YV70n", "z", true, "org.apache.commons.cli.CommandLine$Builder");
      option0.processValue("z");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertEquals("z", object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("@27hw11B", true, "@27hw11B");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties("@27hw11B");
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("@27hw11B", true, "@27hw11B");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = new Option("printWriter", "printWriter");
      commandLine_Builder0.addOption(option1);
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue((String) null, (Supplier<Object>) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addOption((Option) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addArg("{H^p0Pe:m&<|+c");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addArg((String) null);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("c", true, "c");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties("{H^p0Pe:m&<|+c");
      assertTrue(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption((Option) null);
      assertSame(commandLine_Builder1, commandLine_Builder0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addArg((String) null);
      assertSame(commandLine_Builder0, commandLine_Builder1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues('`');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("usage: ", "usage: ");
      assertEquals("usage: ", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(0, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      List<String> list0 = commandLine0.getArgList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue((Option) null, "#T%X2%>c^xk,sfKb");
      assertEquals("#T%X2%>c^xk,sfKb", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption('>');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getOptionObject('c');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('~');
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getOptionObject(";cxEb>0@qDy");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(";cxEb>0@qDy").when(supplier0).get();
      String string0 = commandLine0.getOptionValue('1', supplier0);
      assertEquals(";cxEb>0@qDy", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('R', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Iterator<Option> iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, (String) null);
      Supplier<Option> supplier0 = (Supplier<Option>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(option0).when(supplier0).get();
      Option option1 = commandLine0.getParsedOptionValue('R', supplier0);
      assertNull(option1.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = commandLine0.getParsedOptionValue("#T%X2%>c^xk,sfKb", (Option) null);
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue(' ');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue((String) null);
      assertNull(string0);
  }
}
