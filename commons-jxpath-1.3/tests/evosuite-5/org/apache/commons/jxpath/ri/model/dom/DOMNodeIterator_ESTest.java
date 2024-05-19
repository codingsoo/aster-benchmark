
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
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DOMNodeIterator_ESTest extends DOMNodeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, false, nodePointer0);
      dOMNodeIterator0.getNodePointer();
      dOMNodeIterator0.getNodePointer();
      assertEquals(1, dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName((String) null, "H]/*\b&");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      NodePointer nodePointer1 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer1, nodeTypeTest0, false, nodePointer0);
      assertEquals(0, dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("#]_n jV2");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, (NodePointer) null);
      // Undeclared exception!
      try { 
        dOMNodeIterator0.getNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("([Q-Q 1x@C<,^J6/", "([Q-Q 1x@C<,^J6/");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator(variablePointer0, processingInstructionTest0, true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: ([Q-Q 1x@C<,^J6/:([Q-Q 1x@C<,^J6/
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("Tqg{6n-8V1M&|zF&", "Tqg{6n-8V1M&|zF&");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Tqg{6n-8V1M&|zF&", locale0);
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator((NodePointer) null, (NodeTest) null, false, nodePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator(variablePointer0, nodeNameTest0, true, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(93);
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeTypeTest0, false, variablePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, false, nodePointer0);
      dOMNodeIterator0.getNodePointer();
      int int0 = dOMNodeIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, true, nodePointer0);
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        dOMNodeIterator0.setPosition(826);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, false, nodePointer0);
      dOMNodeIterator0.getNodePointer();
      // Undeclared exception!
      try { 
        dOMNodeIterator0.setPosition(5153);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, true, nodePointer0);
      boolean boolean0 = dOMNodeIterator0.setPosition(826);
      assertEquals(1, dOMNodeIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, false, nodePointer0);
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      boolean boolean0 = dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals((-2), dOMNodeIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, false, nodePointer0);
      dOMNodeIterator0.getNodePointer();
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      dOMNodeIterator0.getNodePointer();
      assertEquals(1, dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, true, nodePointer0);
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = dOMNodeIterator0.getPosition();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, false, nodePointer0);
      dOMNodeIterator0.getNodePointer();
      boolean boolean0 = dOMNodeIterator0.setPosition(1);
      assertEquals(1, dOMNodeIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, false, nodePointer0);
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      dOMNodeIterator0.getNodePointer();
      assertEquals((-1), dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, true, (NodePointer) null);
      assertEquals(0, dOMNodeIterator0.getPosition());
      
      boolean boolean0 = dOMNodeIterator0.setPosition(826);
      assertEquals(1, dOMNodeIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, true, nodePointer0);
      int int0 = dOMNodeIterator0.getPosition();
      assertEquals(0, int0);
  }
}
