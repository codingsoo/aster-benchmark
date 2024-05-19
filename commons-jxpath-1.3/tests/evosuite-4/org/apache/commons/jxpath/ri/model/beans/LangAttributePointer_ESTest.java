
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
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.LangAttributePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LangAttributePointer_ESTest extends LangAttributePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      String string0 = langAttributePointer0.asPath();
      assertEquals("null()/@xml:lang", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      Object object0 = langAttributePointer0.getImmediateNode();
      assertEquals("fr", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LangAttributePointer langAttributePointer0 = new LangAttributePointer((NodePointer) null);
      boolean boolean0 = langAttributePointer0.equals(langAttributePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LangAttributePointer langAttributePointer0 = new LangAttributePointer((NodePointer) null);
      // Undeclared exception!
      try { 
        langAttributePointer0.getBaseValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      variablePointer0.setIndex((-2140));
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      // Undeclared exception!
      try { 
        langAttributePointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setIndex((-1152));
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      // Undeclared exception!
      try { 
        langAttributePointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("U]fN8o}1");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, basicVariables0, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      Object object0 = langAttributePointer0.getBaseValue();
      assertEquals("ja-JP", object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("U]fN8o}1");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, basicVariables0, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      String string0 = langAttributePointer0.asPath();
      assertEquals("/@xml:lang", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("=|RCn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      langAttributePointer0.printPointerChain();
      assertTrue(langAttributePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LangAttributePointer langAttributePointer0 = new LangAttributePointer((NodePointer) null);
      langAttributePointer0.printPointerChain();
      assertNull(langAttributePointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("=|RCn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      QName qName1 = langAttributePointer0.getName();
      assertEquals("xml:lang", qName1.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LangAttributePointer langAttributePointer0 = new LangAttributePointer((NodePointer) null);
      String string0 = langAttributePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("=|RCn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = langAttributePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("=|RCn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      boolean boolean0 = langAttributePointer0.equals(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("=|RCn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      int int0 = langAttributePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("=|RCn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      boolean boolean0 = langAttributePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("=|RCn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      int int0 = langAttributePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("U]fN8o}1");
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, basicVariables0, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      // Undeclared exception!
      try { 
        langAttributePointer0.setValue(basicVariables0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot change locale using the 'lang' attribute
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("=|RCn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      // Undeclared exception!
      try { 
        langAttributePointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("=|RCn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      boolean boolean0 = langAttributePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("=|RCn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      langAttributePointer0.hashCode();
  }
}
