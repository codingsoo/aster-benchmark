
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
      QName qName0 = new QName("^n?X6)o");
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "^n?X6)o", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "T0hkl9b7eH9`N:lH");
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, 0, (Object) locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path '^n?X6)o'/^n?X6)o[1], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("T0hkl9b7eH9`N:lH", "^n?X6)o");
      Locale locale0 = new Locale("^n?X6)o", "^n?X6)o", "T0hkl9b7eH9`N:lH");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "^n?X6)o", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "T0hkl9b7eH9`N:lH");
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path '^n?X6)o'/T0hkl9b7eH9`N:lH:^n?X6)o[1], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      QName qName0 = nullPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      Object object0 = nullPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("TGL&ZEE\"}ZrIA!,UVy");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)nullPointer0.createPath((JXPathContext) null, (Object) "TGL&ZEE\"}ZrIA!,UVy");
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("T0hkl9b7eH9`N:lH", "^n?X6)o");
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "^n?X6)o", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)nullPointer0.createPath((JXPathContext) null);
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Cannot create the root object: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      NodePointer nodePointer1 = nullPointer0.createPath((JXPathContext) null);
      assertNull(nodePointer1.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("e}3@\"0xJZ?:>98C]T", (String) null);
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      // Undeclared exception!
      try { 
        nullPointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("FXCT", "FXCT");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0, (Object) "FXCT");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $FXCT:FXCT
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $:
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName(".|?2 1:'rbq", ".|?2 1:'rbq");
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
  public void test11()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("`");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '`'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, (QName) null, 0, (Object) nullPointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("<\"2m!A\"Vs}");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, qName0, (-1), (Object) nullPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("i>JxnfOBaV");
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      String string0 = nullPointer0.asPath();
      assertEquals("null()", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      nullPointer0.printPointerChain();
      assertTrue(nullPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("W.hU$ps'7k-5");
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer1.createPath((JXPathContext) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("`");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      String string0 = nullPointer0.asPath();
      assertEquals("$`", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName(".hU$s'7k-5");
      Locale locale0 = Locale.FRENCH;
      QName qName1 = new QName(".hU$s'7k-5");
      NullPointer nullPointer0 = new NullPointer(qName1, locale0);
      NullPointer nullPointer1 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName(".hU$s'7k-5");
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPointer nullPointer1 = new NullPointer(locale0, ".hU$s'7k-5");
      boolean boolean0 = nullPointer1.equals(nullPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("*,n[L+jP8{rBF\"#l>X", "*,n[L+jP8{rBF\"#l>X");
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPointer nullPointer1 = new NullPointer(locale0, "<<unknown namespace>>");
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("T0hkl9b7eH9`N:lH", "^n?X6)o");
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "^n?X6)o", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      NullPointer nullPointer1 = new NullPointer(nodePointer0, qName0);
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("W.hU$ps'7k-5");
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.equals(nullPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = new Locale(")");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Object object0 = new Object();
      boolean boolean0 = nullPointer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      nullPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("*,n[L+jP8{rBF\"#l>X", "*,n[L+jP8{rBF\"#l>X");
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
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
  public void test27()  throws Throwable  {
      QName qName0 = new QName("T0hkl9b7eH9`N:lH", "^n?X6)o");
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "^n?X6)o", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "T0hkl9b7eH9`N:lH");
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0, (Object) locale0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("WVhU$ps'7k-K");
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0, (Object) qName0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      int int0 = nullPointer0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, (QName) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("*,n[L+jP8{rBF\"#l>X", "*,n[L+jP8{rBF\"#l>X");
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.isActual();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("*,n[L+jP8{rBF\"#l>X", "*,n[L+jP8{rBF\"#l>X");
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("", "?$6K?8Af]T[");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':?$6K?8Af]T['
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("*,n[L+jP8{rBF\"#l>X", "*,n[L+jP8{rBF\"#l>X");
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("WVhU$ps'7k-K");
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      QName qName1 = nullPointer0.getName();
      assertSame(qName0, qName1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("`");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      assertFalse(propertyPointer0.isAttribute());
  }
}
