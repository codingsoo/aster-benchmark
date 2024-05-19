
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


package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NullElementPointer_ESTest extends NullElementPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-299));
      assertEquals((-299), nullElementPointer0.getIndex());
      
      nullElementPointer0.setIndex(Integer.MIN_VALUE);
      NullElementPointer nullElementPointer1 = new NullElementPointer(variablePointer0, (-299));
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 274);
      nullElementPointer0.getValuePointer();
      assertEquals(274, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("@]&t9/@+^)E");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) basicVariables0);
      NodePointer nodePointer1 = nullElementPointer0.createPath(jXPathContext0);
      assertSame(nodePointer1, nodePointer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 58);
      variablePointer0.setIndex(58);
      // Undeclared exception!
      try { 
        nullElementPointer0.setValue("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("ocq5yA6g a^", "ocq5yA6g a^");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullElementPointer0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) "<<unknown namespace>>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $ocq5yA6g a^:ocq5yA6g a^
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("UO:|oFf", "9oI9f");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "9oI9f");
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) basicVariables0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, (-303));
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) "UO:|oFf");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index is less than 1: $UO:|oFf:9oI9f
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("?$GAWM1{iEw11vw)");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 394);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '?$GAWM1{iEw11vw)'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = new Locale(" could not create an object for path: ", "");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path ''/null[-2147483647], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("o=9Y/:dN{o");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) null);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 37);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable 'o=9Y/:dN{o' for path: $o=9Y/:dN{o
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, (-132774720));
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "\".\"");
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("/.");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("[@name='");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 3276);
      String string0 = nullElementPointer0.asPath();
      assertEquals("$[@name='[3277]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("Mr~y=@ 2Lw`");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      nullElementPointer0.getName();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("F!)?04A?hW~K/j015");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 2287);
      String string0 = nullElementPointer0.asPath();
      assertEquals("$F!)?04A?hW~K/j015[2288]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 179);
      PropertyPointer propertyPointer0 = nullElementPointer0.getPropertyPointer();
      NullElementPointer nullElementPointer1 = new NullElementPointer(propertyPointer0, 2318);
      PropertyPointer propertyPointer1 = nullElementPointer1.getPropertyPointer();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) propertyPointer0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(propertyPointer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: [180]/.[2319]
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("@]&t9/@+^)E", "@]&t9/@+^)E");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setIndex(9);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 9);
      String string0 = nullElementPointer0.asPath();
      assertEquals("$@]&t9/@+^)E:@]&t9/@+^)E[10]/.[10]", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 179);
      PropertyPointer propertyPointer0 = nullElementPointer0.getPropertyPointer();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) propertyPointer0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(propertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: [180]
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, Integer.MIN_VALUE);
      String string0 = nullElementPointer0.asPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-294));
      NullElementPointer nullElementPointer1 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertEquals((-294), nullElementPointer0.getIndex());
      assertFalse(boolean0);
      assertFalse(nullElementPointer1.equals((Object)nullElementPointer0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("VDW&$g2jwsv", "VDW&$g2jwsv");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      NullElementPointer nullElementPointer1 = (NullElementPointer)nullElementPointer0.clone();
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, nullElementPointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-299));
      NullElementPointer nullElementPointer1 = new NullElementPointer(variablePointer0, (-299));
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertEquals((-299), nullElementPointer1.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("VDW&$g2jwsv");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer0);
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("@]&t9/@+^)E", "@]&t9/@+^)E");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 9);
      boolean boolean0 = nullElementPointer0.isCollection();
      assertEquals(9, nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 58);
      nullElementPointer0.hashCode();
      assertEquals(58, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 58);
      // Undeclared exception!
      try { 
        nullElementPointer0.setValue("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Collection element does not exist: $org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer[59]
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "krR>P}b!V{J!");
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("krR>P}b!V{J!");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.isLeaf();
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "krR>P}b!V{J!");
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("krR>P}b!V{J!");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'krR>P}b!V{J!'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("i", "i");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, "i");
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      nullElementPointer0.getBaseValue();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-1));
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 58);
      int int0 = nullElementPointer0.getLength();
      assertEquals(58, nullElementPointer0.getIndex());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "krR>P}b!V{J!");
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("krR>P}b!V{J!");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.isActual();
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 58);
      PropertyPointer propertyPointer0 = nullElementPointer0.getPropertyPointer();
      boolean boolean0 = nullElementPointer0.equals(propertyPointer0);
      assertEquals(58, nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 58);
      nullElementPointer0.getImmediateNode();
      assertEquals(58, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "krR>P}b!V{J!");
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("krR>P}b!V{J!");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.isContainer();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
      assertTrue(boolean0);
  }
}
