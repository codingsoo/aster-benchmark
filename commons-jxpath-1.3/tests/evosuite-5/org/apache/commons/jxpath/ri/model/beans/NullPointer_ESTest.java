
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
      Locale locale0 = Locale.GERMANY;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, locale0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, (QName) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, (QName) null, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path //null[1], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      QName qName0 = new QName("8");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nullPointer0, (Locale) null);
      NullPointer nullPointer1 = new NullPointer(nodePointer0, qName0);
      QName qName1 = nullPointer1.getName();
      assertEquals("8", qName1.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("H;]YuS6Th;z|jL$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      Object object0 = nullPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, locale0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      NodePointer nodePointer1 = nullPointer0.createPath((JXPathContext) null);
      assertNull(nodePointer1.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(" reported success creating object for path: ", "L3;");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, basicVariables0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)nullPointer0.createPath((JXPathContext) null);
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nullPointer0, (Locale) null);
      // Undeclared exception!
      try { 
        nodePointer0.hashCode();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      QName qName0 = new QName("8");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nullPointer0, (Locale) null);
      // Undeclared exception!
      try { 
        nodePointer0.getLength();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName(";]YS6Thz|jL$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath((JXPathContext) null, (Object) nullPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("H;]YuS6Th;z|jL$");
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
      QName qName0 = new QName("8");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, (Locale) null);
      // Undeclared exception!
      try { 
        nodePointer0.createPath((JXPathContext) null);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "P<|X-[U$q,");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':P<|X-[U$q,'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, qName0, 2704, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("H;]YuS6Th;z|jL$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) "H;]YuS6Th;z|jL$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, 1, (Object) jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("", "'Qd}+@5|COoD");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, qName0, (-2154));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      QName qName0 = new QName("", "<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nullPointer0, (Locale) null);
      // Undeclared exception!
      try { 
        nodePointer0.asPath();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.CHINA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
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
  public void test17()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, ";S7)N7E1&9");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) ";S7)N7E1&9");
      QName qName0 = new QName("", (String) null);
      // Undeclared exception!
      try { 
        nullPointer0.createAttribute(jXPathContext0, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an attribute for path id(;S7)N7E1&9)/@:null, operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
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
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, locale0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, (QName) null);
      String string0 = nullPointer0.asPath();
      assertEquals("/null", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "`");
      QName qName0 = new QName("8");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, (Locale) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("8");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, (Locale) null);
      QName qName1 = new QName("8");
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName1);
      boolean boolean0 = nullPointer0.equals(nodePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "`");
      QName qName0 = new QName("8");
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      boolean boolean0 = nullPointer1.equals(nullPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPointer nullPointer1 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.equals(nullPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      QName qName0 = new QName("", "<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nullPointer0, (Locale) null);
      boolean boolean0 = nullPointer0.equals(nodePointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.equals(nullPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "`");
      QName qName0 = new QName("8");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, (Locale) null);
      boolean boolean0 = nullPointer0.equals(nodePointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "`");
      nullPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("8");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, (Locale) null);
      nodePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("H;]YuS6Th;z|jL$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $H;]YuS6Th;z|jL$
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(locale0, " could not create an object for path: ");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0, (Object) " could not create an object for path: ");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: id( could not create an object for path: )
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      int int0 = nullPointer0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("//", "AT");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "//");
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createChild(jXPathContext0, qName0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '//:AT'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      boolean boolean0 = nullPointer0.isActual();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      boolean boolean0 = nullPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, locale0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, (QName) null);
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, (QName) null, 1, (Object) locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path //null[2], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("//", "AT");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      boolean boolean0 = nullPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      QName qName0 = nullPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      assertEquals(0, propertyPointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(" could not create an object for path: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      NodePointer nodePointer1 = nullPointer0.createPath(jXPathContext0);
      NodePointer nodePointer2 = nullPointer0.createPath(jXPathContext0, (Object) nodePointer1);
      assertFalse(nodePointer2.isAttribute());
  }
}
