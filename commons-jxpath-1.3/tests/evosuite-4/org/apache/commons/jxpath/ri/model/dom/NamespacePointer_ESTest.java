
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
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
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
      QName qName0 = new QName("Cannot remove an object that is not some other object's property or a collection element", "Cannot remove an object that is not some other object's property or a collection element");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "org.apache.commons.jxpath.ri.model.dom.NamespacePointer");
      String string0 = namespacePointer0.asPath();
      assertEquals("$Cannot remove an object that is not some other object's property or a collection element:Cannot remove an object that is not some other object's property or a collection element/namespace::org.apache.commons.jxpath.ri.model.dom.NamespacePointer", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("Cannot remove an object that is not some other object's property or a collection element", "Cannot remove an object that is not some other object's property or a collection element");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "\"d\"vD$x%6-", "org.apache.commons.jxpath.ri.model.dom.NamespacePointer");
      String string0 = namespacePointer0.getNamespaceURI();
      assertNotNull(string0);
      assertEquals("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName(")", ")");
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "org.apache.commons.jxpath.ri.NamespaceResolver");
      Object object0 = namespacePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("`w");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, namespacePointer0, locale0);
      NamespacePointer namespacePointer1 = new NamespacePointer(nodePointer0, (String) null);
      // Undeclared exception!
      try { 
        namespacePointer1.hashCode();
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
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "<<unknown namespace>>");
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
      QName qName0 = new QName("namespace::");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
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
  public void test06()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "h]~.q&");
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
  public void test07()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, "<<unknown namespace>>");
      String string0 = namespacePointer1.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("RyQ", "RyQ");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "vu<N!J", "");
      String string0 = namespacePointer0.getNamespaceURI();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "\"s!V{g<Zzl?", "<<unknown namespace>>");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, "<<unknown namespace>>");
      boolean boolean0 = namespacePointer0.equals(namespacePointer1);
      assertFalse(boolean0);
      assertFalse(namespacePointer1.equals((Object)namespacePointer0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "\"s!V{g<Zzl?", "<<unknown namespace>>");
      boolean boolean0 = namespacePointer0.equals(namespacePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "FL40SkTdrmg94gd", "FL40SkTdrmg94gd");
      boolean boolean0 = namespacePointer0.equals("<<unknown namespace>>");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("RyQ", "RyQ");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "vu<N!J", "");
      String string0 = namespacePointer0.asPath();
      assertEquals("/namespace::vu<N!J", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "\"s!V{g<Zzl?", "<<unknown namespace>>");
      String string0 = namespacePointer0.asPath();
      assertEquals("$$:$/namespace::\"s!V{g<Zzl?", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "FL40SkTdrmg94gd", "FL40SkTdrmg94gd");
      String string0 = namespacePointer0.asPath();
      assertEquals("namespace::FL40SkTdrmg94gd", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "\"s!V{g<Zzl?", "<<unknown namespace>>");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      boolean boolean0 = namespacePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "FL40SkTdrmg94gd", "FL40SkTdrmg94gd");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      boolean boolean0 = namespacePointer0.testNode(processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("\"s!V{g<Zzl?");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      boolean boolean0 = namespacePointer0.testNode(nodeTypeTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("#Q.[%");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "#Q.[%");
      boolean boolean0 = namespacePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "\"s!V{g<Zzl?", "<<unknown namespace>>");
      Object object0 = namespacePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "\"s!V{g<Zzl?", "<<unknown namespace>>");
      int int0 = namespacePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      Object object0 = namespacePointer0.getImmediateNode();
      assertEquals("<<unknown namespace>>", object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      boolean boolean0 = namespacePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName(", properies = ", ", properies = ");
      Locale locale0 = new Locale(", properies = ", ", properies = ");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, ", properies = ", "<<unknown namespace>>");
      boolean boolean0 = namespacePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("\"s!V{g<Zzl?");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>");
      int int0 = namespacePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("`w");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "");
      QName qName1 = namespacePointer0.getName();
      assertEquals("<<unknown namespace>>", qName1.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      namespacePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("#Q.[%");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "#Q.[%");
      // Undeclared exception!
      try { 
        namespacePointer0.setValue((Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify DOM trees
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }
}
