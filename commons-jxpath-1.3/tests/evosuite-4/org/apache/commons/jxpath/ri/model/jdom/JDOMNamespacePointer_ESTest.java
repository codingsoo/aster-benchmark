
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
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "#?g:`]) a16GMHaIlf>", "");
      String string0 = jDOMNamespacePointer0.toString();
      assertEquals("null()/namespace::#?g:`]) a16GMHaIlf>", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("+AO");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "s)O'Q|DHb)i@[/P2");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, jDOMNamespacePointer0, (Locale) null);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      String string0 = jDOMNamespacePointer1.getNamespaceURI();
      assertNotNull(string0);
      assertFalse(jDOMNamespacePointer1.equals((Object)jDOMNamespacePointer0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("wnWWy", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, (String) null, "");
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
  public void test04()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "z^&E");
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
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("No such variable: '", "No such variable: '");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, (String) null);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(jDOMNamespacePointer0, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.equals(jDOMNamespacePointer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("wnWWy", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, (String) null, "");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, (String) null);
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
  public void test08()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "<<unknow/ namespace>>", "<<unknow/ namespace>>");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer((NodePointer) null, "<<unknown namespace>>");
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer1);
      assertFalse(boolean0);
      assertFalse(jDOMNamespacePointer1.equals((Object)jDOMNamespacePointer0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("t8L9zkZ%OkK',FJMb");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>");
      boolean boolean0 = jDOMNamespacePointer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, (String) null);
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("java.util.concurrent.atomic.AtomicInteger");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "@Jz");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.createAttribute(jXPathContext0, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an attribute for path /namespace::@Jz/@java.util.concurrent.atomic.AtomicInteger, operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      jDOMNamespacePointer0.printPointerChain();
      assertFalse(jDOMNamespacePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, (String) null);
      String string0 = jDOMNamespacePointer0.asPath();
      assertEquals("namespace::null", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, (String) null);
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.setValue("<<unknown namespace>>");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a namespace
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "z^&E");
      boolean boolean0 = jDOMNamespacePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      Object object0 = jDOMNamespacePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      jDOMNamespacePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "z^&E");
      boolean boolean0 = jDOMNamespacePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      Object object0 = jDOMNamespacePointer0.getImmediateNode();
      assertEquals("<<unknown namespace>>", object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      QName qName0 = jDOMNamespacePointer0.getName();
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>");
      Object object0 = jDOMNamespacePointer1.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("t8L9zkZ%OkK',FJMb");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>");
      int int0 = jDOMNamespacePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      int int0 = jDOMNamespacePointer0.compareChildNodePointers(jDOMNamespacePointer0, jDOMNamespacePointer0);
      assertEquals(0, int0);
  }
}
