
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


package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JDOMNamespacePointer_ESTest extends JDOMNamespacePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "]'1Ti:\"r", "]'1Ti:\"r");
      QName qName0 = jDOMNamespacePointer0.getName();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, "]'1Ti:\"r");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(nodePointer0, "namespace::");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jDOMNamespacePointer0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(jDOMNamespacePointer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: ']'1Ti:\"r'/namespace::namespace::
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "");
      jDOMNamespacePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "R-E9+n5i+vD;", "");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "namespace::");
      Object object0 = jDOMNamespacePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("8t2n3ukvGJeMk");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "&quot;", "<<unknown namespace>>");
      Object object0 = jDOMNamespacePointer0.getImmediateNode();
      assertNotNull(object0);
      assertEquals("<<unknown namespace>>", object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("KZ&x>%S2GTs,`9Y");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, (String) null);
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Hwi)G;Jcf`0");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, (String) null);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(variablePointer0, "\"sum\"");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.equals(jDOMNamespacePointer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Predicate value is null: ", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "$CLmE");
      variablePointer0.setIndex(2176);
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Predicate value is null: :null'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("8t2n3ukvGJeMk");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "&quot;", "<<unknown namespace>>");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertNotNull(string0);
      assertEquals("<<unknown namespace>>", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.getNamespaceURI();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("q`", "q`");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "q`", "<<unknown namespace>>");
      Object object0 = jDOMNamespacePointer0.clone();
      boolean boolean0 = jDOMNamespacePointer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("q`", "q`");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "q`", "<<unknown namespace>>");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(jDOMNamespacePointer0, "{}");
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("s", "s");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>");
      boolean boolean0 = jDOMNamespacePointer0.equals(variablePointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Hwi)G;Jcf`0");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "Hwi)G;Jcf`0");
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("#qwy2+-TFcg/lMqK", "#qwy2+-TFcg/lMqK");
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, ")HtVs}[");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, jDOMNamespacePointer0);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(nodePointer0, "");
      String string0 = jDOMNamespacePointer1.asPath();
      assertEquals("/namespace::", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("s", "s");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>");
      String string0 = jDOMNamespacePointer0.asPath();
      assertEquals("$s:s/namespace::<<unknown namespace>>", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, ")HtVs}[");
      String string0 = jDOMNamespacePointer0.toString();
      assertEquals("namespace::)HtVs}[", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("q`", "q`");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "q`", "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.setValue(qName0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a namespace
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("q`", "q`");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "q`", "<<unknown namespace>>");
      boolean boolean0 = jDOMNamespacePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("q`", "q`");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "q`", "<<unknown namespace>>");
      Object object0 = jDOMNamespacePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, (String) null);
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Hwi)G;Jcf`0");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "Hwi)G;Jcf`0");
      boolean boolean0 = jDOMNamespacePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("s", "s");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>");
      int int0 = jDOMNamespacePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("s", "s");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>");
      int int0 = jDOMNamespacePointer0.compareChildNodePointers(variablePointer0, jDOMNamespacePointer0);
      assertEquals(0, int0);
  }
}
