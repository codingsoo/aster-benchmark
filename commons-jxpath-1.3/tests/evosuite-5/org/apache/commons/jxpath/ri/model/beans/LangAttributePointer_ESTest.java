
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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
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
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
      String string0 = langAttributePointer0.asPath();
      assertEquals("$null/@xml:lang", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, (QName) null, nodePointer0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer1);
      Object object0 = langAttributePointer0.getBaseValue();
      assertEquals("ja-JP", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("PRG");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "PRG", (Locale) null);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      boolean boolean0 = langAttributePointer0.equals(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
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
  public void test04()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(variablePointer0);
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
  public void test05()  throws Throwable  {
      QName qName0 = new QName("+R", "+R");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      String string0 = langAttributePointer0.asPath();
      assertEquals("/@xml:lang", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      String string0 = langAttributePointer0.asPath();
      assertEquals("null()/@xml:lang", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LangAttributePointer langAttributePointer0 = new LangAttributePointer((NodePointer) null);
      String string0 = langAttributePointer0.asPath();
      assertEquals("@xml:lang", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LangAttributePointer langAttributePointer0 = new LangAttributePointer((NodePointer) null);
      QName qName0 = langAttributePointer0.getName();
      assertEquals("xml:lang", qName0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LangAttributePointer langAttributePointer0 = new LangAttributePointer((NodePointer) null);
      String string0 = langAttributePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("+R", "+R");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      boolean boolean0 = langAttributePointer0.testNode(processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      boolean boolean0 = langAttributePointer0.equals(langAttributePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LangAttributePointer langAttributePointer0 = new LangAttributePointer((NodePointer) null);
      int int0 = langAttributePointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      boolean boolean0 = langAttributePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      int int0 = langAttributePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      // Undeclared exception!
      try { 
        langAttributePointer0.setValue(langAttributePointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot change locale using the 'lang' attribute
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      Object object0 = langAttributePointer0.getImmediateNode();
      assertEquals("en-CA", object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LangAttributePointer langAttributePointer0 = new LangAttributePointer((NodePointer) null);
      boolean boolean0 = langAttributePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("+R", "+R");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      LangAttributePointer langAttributePointer0 = new LangAttributePointer(nodePointer0);
      langAttributePointer0.hashCode();
  }
}
