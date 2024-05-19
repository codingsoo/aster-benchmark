
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


package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.NamespacePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NamespacePointer_ESTest extends NamespacePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "", (String) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) namespacePointer0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(namespacePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: $/namespace::
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "", "");
      String string0 = namespacePointer0.getNamespaceURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "/\u0004q`", "/\u0004q`");
      Object object0 = namespacePointer0.getImmediateNode();
      assertEquals("/\u0004q`", object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, (String) null, "namespace::");
      // Undeclared exception!
      try { 
        namespacePointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "r@a");
      // Undeclared exception!
      try { 
        namespacePointer0.getNamespaceURI();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "text");
      // Undeclared exception!
      try { 
        namespacePointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("j-+<oxdK", "");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, (String) null, "<<unknown namespace>>");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, "j-+<oxdK");
      // Undeclared exception!
      try { 
        namespacePointer0.equals(namespacePointer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "A<]!L", "r");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, "namespace::");
      String string0 = namespacePointer1.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "A<]!L", "r");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, "namespace::");
      boolean boolean0 = namespacePointer1.equals(namespacePointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "A<]!L", "r");
      boolean boolean0 = namespacePointer0.equals(namespacePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespa1e::");
      boolean boolean0 = namespacePointer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("j-+<oxdK", "");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "K(rZiOHQ0N\u0002#0]");
      String string0 = namespacePointer0.asPath();
      assertEquals("/namespace::K(rZiOHQ0N\u0002#0]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "]O kZ=[@;;");
      String string0 = namespacePointer0.asPath();
      assertEquals("$:/namespace::]O kZ=[@;;", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespa1e::");
      String string0 = namespacePointer0.asPath();
      assertEquals("namespace::namespa1e::", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "]O kZ=[@;;");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      boolean boolean0 = namespacePointer0.testNode(nodeTypeTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespa1e::");
      QName qName0 = new QName("namespa1e::", "namespa1e::");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = namespacePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "[_JDBgMm9>y#", "[_JDBgMm9>y#");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      boolean boolean0 = namespacePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespa1e::");
      boolean boolean0 = namespacePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "A<]!L", "r");
      String string0 = namespacePointer0.getNamespaceURI();
      assertEquals("r", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespa1e::");
      Object object0 = namespacePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "A<]!L", "r");
      QName qName0 = namespacePointer0.getName();
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      int int0 = namespacePointer0.compareChildNodePointers(variablePointer0, (NodePointer) null);
      assertEquals("A<]!L", qName0.getName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("j-+<oxdK", "j-+<oxdK");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "<<unknown namespace>>");
      Object object0 = namespacePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "A<]!L", "r");
      boolean boolean0 = namespacePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "A<]!L", "r");
      boolean boolean0 = namespacePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "A<]!L", "r");
      int int0 = namespacePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, (String) null);
      // Undeclared exception!
      try { 
        namespacePointer0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("j-+<oxdK", "j-+<oxdK");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "<<unknown namespace>>");
      namespacePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("j-+<oxdK", "j-+<oxdK");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        namespacePointer0.setValue(nodePointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify DOM trees
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }
}
