
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
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NullPointer_ESTest extends NullPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("~Vfy|7I((~&,Q", "~Vfy|7I((~&,Q");
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, 112, (Object) locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path //~Vfy|7I((~&,Q:~Vfy|7I((~&,Q[113], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("h+-ue", "h+-ue");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, qName0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path //h+-ue:h+-ue[1], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("1I>R{` Ub{qF.`&", "+2([;LDRf~a6");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      QName qName1 = nullPointer0.getName();
      assertEquals("+2([;LDRf~a6", qName1.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("@aNH4;FstgZ< l", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      NodePointer nodePointer0 = nullPointer0.createPath(jXPathContext0, (Object) locale0);
      assertTrue(nodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("h+-ue");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)nullPointer0.createPath((JXPathContext) null);
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("+n|S}Hw+@w;b$m0h", "II=yDx^P/82d");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(nullPointer0, qName0, nullPointer0);
      NullPointer nullPointer1 = new NullPointer(nodePointer0, qName0);
      NodePointer nodePointer1 = nullPointer1.createPath((JXPathContext) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("P");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      Locale locale0 = Locale.FRENCH;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0, (Object) nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $P
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("B4_skO3VYj5");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $B4_skO3VYj5
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("!@`");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("id(", "id(");
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, 0, (Object) "id(");
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
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, (QName) null, Integer.MIN_VALUE, (Object) locale0);
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
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName(")");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ')'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: null()
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "g;,/juA0b^Iv");
      String string0 = nullPointer0.asPath();
      assertEquals("id(g;,/juA0b^Iv)", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("lj", "*");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("", "D4%Js+%?u{fMG\"9:;w");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':D4%Js+%?u{fMG\"9:;w'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName(" reported success creating object for path: ", " reported success creating object for path: ");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(nullPointer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: null()/ reported success creating object for path: : reported success creating object for path: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("[@name='");
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPointer nullPointer1 = new NullPointer(locale0, "[@name='");
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("[@name='");
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, "[@name='");
      NullPointer nullPointer1 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName(" reported success creating object for path: ", " reported success creating object for path: ");
      QName qName1 = new QName(" reported success creating object for path: ", " reported success creating object for path: ");
      NullPointer nullPointer0 = new NullPointer(qName1, (Locale) null);
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName(" reported success creating object for path: ", " reported success creating object for path: ");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "g;,/juA0b^Iv");
      boolean boolean0 = nullPointer0.equals(nullPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("G+<w]s0\"'jx+cZx\"X");
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      boolean boolean0 = nullPointer0.equals(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "g;,/juA0b^Iv");
      nullPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("G+<w]s0\"'jx+cZx\"X");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      nullPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName(" reported success creating object for path: ", " reported success creating object for path: ");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer1.createPath((JXPathContext) null, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName(" reported success creating object for path: ", " reported success creating object for path: ");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      // Undeclared exception!
      try { 
        nullPointer0.createPath((JXPathContext) null, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName(" reported success creating object for path: ", " reported success creating object for path: ");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      int int0 = nullPointer0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "g;,/juA0b^Iv");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, (QName) null, Integer.MIN_VALUE);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id(g;,/juA0b^Iv)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("", "D4%Js+%?u{fMG\"9:;w");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      boolean boolean0 = nullPointer0.isActual();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "g;,/juA0b^Iv");
      boolean boolean0 = nullPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(")", "id(");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) ")");
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, 1878, (Object) qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '):id('
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "g;,/juA0b^Iv");
      Object object0 = nullPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, "[@name='");
      boolean boolean0 = nullPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "g;,/juA0b^Iv");
      QName qName0 = nullPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, "[@name='");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      assertTrue(propertyPointer0.isContainer());
  }
}