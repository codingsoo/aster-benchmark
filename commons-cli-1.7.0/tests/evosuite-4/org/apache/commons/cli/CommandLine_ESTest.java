
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
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, ":R.i,7P`w]A#)EGS=-Q");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('-');
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<LinkedList<Object>> supplier0 = (Supplier<LinkedList<Object>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      LinkedList<Object> linkedList0 = commandLine0.getParsedOptionValue('-', supplier0);
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("true", "true");
      Option option1 = new Option("true", true, "Either opt or longOpt must be specified");
      commandLine_Builder0.addOption(option1);
      Option option2 = commandLine0.getParsedOptionValue(option0);
      assertNull(option2);
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
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption(")12kx.5[D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = commandLine0.getParsedOptionValue((Option) null, (Option) null);
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("zA7Sk5|.Hm f70@Kr").when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue("zA7Sk5|.Hm f70@Kr", supplier0);
      assertEquals("zA7Sk5|.Hm f70@Kr", object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue((String) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(commandLine0).when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue('J', supplier0);
      assertSame(object0, commandLine0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = commandLine0.getParsedOptionValue('k', linkedList0);
      assertSame(linkedList0, linkedList1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      commandLine0.addOption(option0);
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, "EEE MMM dd HH:mm:ss zzz yyyy");
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue(option0, supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue((Option) null, supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue((Option) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("args", "TS0IL8OK(_vF", false, (String) null);
      String string0 = commandLine0.getOptionValue(option0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("true").when(supplier0).get();
      String string0 = commandLine0.getOptionValue("9!0S`x/if5/a", supplier0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue("4nZ}0DPl8{", supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("OmfM>N0#Bi|'YIC7").when(supplier0).get();
      String string0 = commandLine0.getOptionValue('z', supplier0);
      assertEquals("OmfM>N0#Bi|'YIC7", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue('z', supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('r', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('9', "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addArg("");
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg("X_I]#lRECwL-ov");
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.contains("X_I]#lRECwL-ov"));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, ":R.i,7P`w]A#)EGS=-Q");
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
  public void test26()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("TNav", true, "TNav");
      boolean boolean0 = commandLine0.hasOption(option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("pMctiC3k").when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue(option0, supplier0);
      assertEquals("pMctiC3k", object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Option> supplier0 = (Supplier<Option>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Option) null).when(supplier0).get();
      Option option0 = commandLine0.getParsedOptionValue((Option) null, supplier0);
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("A", "ef\"1&6cg;r!ml9`zkV", true, "");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      Option option1 = new Option("A", true, "Ja|1dV");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getOptionValues(option1);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues((Option) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, "Deprecated", false, ">i^FSFACJ05I$$");
      String string0 = commandLine0.getOptionValue(option0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = new Object();
      Object object1 = commandLine0.getParsedOptionValue((String) null, object0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue("org.apache.commons.cli.HelpFormatter", supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("true", "true");
      Option option1 = commandLine0.getParsedOptionValue(option0, option0);
      assertFalse(option1.hasArgName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      LinkedList<Option> linkedList0 = commandLine0.getParsedOptionValue((String) null);
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("5", "i|Vrj]KQ-3`X", true, "i|Vrj]KQ-3`X");
      commandLine_Builder0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption("i|Vrj]KQ-3`X");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues((String) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("true", "true");
      Option option1 = new Option("true", true, "Either opt or longOpt must be specified");
      commandLine_Builder0.addOption(option1);
      option1.processValue("O`p");
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertFalse(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("true", "true");
      commandLine_Builder0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption(option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("5", "i|Vrj]KQ-3`X", true, "i|Vrj]KQ-3`X");
      commandLine_Builder0.addOption(option0);
      Object object0 = commandLine0.getOptionObject("5");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("true", true, "Either opt or longOpt must be specified");
      commandLine_Builder0.addOption(option0);
      option0.processValue("O`p");
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, ":R.i,7P`w]A#)EGS=-Q");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = new Option((String) null, "W%_j/st.}R", true, "xcUk.H%M");
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("args").when(supplier0).get();
      String string0 = commandLine0.getOptionValue(option1, supplier0);
      assertEquals("args", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("5", "i|Vrj]KQ-3`X", true, "i|Vrj]KQ-3`X");
      commandLine_Builder0.addOption(option0);
      String string0 = commandLine0.getOptionValue("5", "5");
      assertEquals("5", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("pMctiC3k");
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("5", "i|Vrj]KQ-3`X", true, "i|Vrj]KQ-3`X");
      commandLine_Builder0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("5");
      assertTrue(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("5", "i|Vrj]KQ-3`X", true, "i|Vrj]KQ-3`X");
      commandLine_Builder0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("i|Vrj]KQ-3`X");
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option option0 = new Option((String) null, false, "4nZ}0DPl8{");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Properties properties0 = commandLine0.getOptionProperties((Option) null);
      assertTrue(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      LinkedList<Object> linkedList0 = commandLine0.getParsedOptionValue(">", (Supplier<LinkedList<Object>>) null);
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addOption((Option) null);
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
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption((Option) null);
      assertSame(commandLine_Builder1, commandLine_Builder0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addArg((String) null);
      assertSame(commandLine_Builder0, commandLine_Builder1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues('/');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(0, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("true", "true");
      String string0 = commandLine0.getOptionValue(option0, "Either opt or longOpt must be specified");
      assertEquals("Either opt or longOpt must be specified", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption('>');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getOptionObject('A');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue('x', supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('m', "pFW{%");
      assertEquals("pFW{%", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Iterator<Option> iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue('\"', (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue('k');
      assertNull(object0);
  }
}
