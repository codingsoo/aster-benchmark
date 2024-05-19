
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
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PatternOptionBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PatternOptionBuilder_ESTest extends PatternOptionBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        PatternOptionBuilder.parsePattern((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.PatternOptionBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('%');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode(':');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('<');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('!');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('#');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('/');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('@');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('9');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('+');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('*');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('>');
      assertNotNull(class0);
      assertEquals("class java.io.File", class0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType(',');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('+');
      assertNotNull(class0);
      assertEquals("class java.lang.Class", class0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('7');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('4');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('@');
      assertEquals("class java.lang.Object", class0.toString());
      assertNotNull(class0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('*');
      assertNotNull(class0);
      assertTrue(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('$');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('<');
      assertNotNull(class0);
      assertEquals("class java.io.FileInputStream", class0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('%');
      assertNotNull(class0);
      assertEquals(1025, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('#');
      assertNotNull(class0);
      assertEquals("class java.util.Date", class0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType(':');
      assertEquals("class java.lang.String", class0.toString());
      assertNotNull(class0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('/');
      assertNotNull(class0);
      assertEquals("class java.net.URL", class0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        PatternOptionBuilder.parsePattern("YX!z+`h:7:q(U8da1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '`'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = PatternOptionBuilder.parsePattern("*");
      assertNotNull(options0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('>');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('u');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('@');
      assertNotNull(object0);
      assertEquals("class java.lang.Object", object0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('?');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('=');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = PatternOptionBuilder.parsePattern("7<M");
      assertNotNull(options0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType(';');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = PatternOptionBuilder.parsePattern("Duplicate key: ");
      assertNotNull(options0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('9');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('8');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('6');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('5');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('4');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('3');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('2');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('1');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('0');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('.');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('-');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType(')');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('(');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('\'');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<?> class0 = PatternOptionBuilder.getValueType('&');
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Options options0 = PatternOptionBuilder.parsePattern("y%_EjY+");
      assertNotNull(options0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      PatternOptionBuilder patternOptionBuilder0 = new PatternOptionBuilder();
  }
}
