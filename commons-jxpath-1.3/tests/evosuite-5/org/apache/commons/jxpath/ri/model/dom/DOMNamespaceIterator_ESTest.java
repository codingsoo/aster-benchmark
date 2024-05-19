
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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DOMNamespaceIterator_ESTest extends DOMNamespaceIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      NodePointer nodePointer1 = nodePointer0.createAttribute((JXPathContext) null, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer1);
      dOMNamespaceIterator0.setPosition(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        dOMNamespaceIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("ZSzC|");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("ZSzC|");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      
      dOMNamespaceIterator0.getNodePointer();
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      NodePointer nodePointer1 = nodePointer0.createAttribute((JXPathContext) null, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer1);
      dOMNamespaceIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("xmlns", "Cannot find an element by ID - no IdentityManager has been specified");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: xmlns:Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator((NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(variablePointer0);
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
      QName qName0 = new QName("");
      Object object0 = new Object();
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      iIOMetadataNode0.setAttributeNS("xmlns", "xmlns", "xmlns");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      
      boolean boolean0 = dOMNamespaceIterator0.setPosition(1);
      assertEquals(1, dOMNamespaceIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      NodePointer nodePointer1 = nodePointer0.createAttribute((JXPathContext) null, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer1);
      boolean boolean0 = dOMNamespaceIterator0.setPosition(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, dOMNamespaceIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("ZSzC|", "ZSzC|");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("ZSzC|");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      dOMNamespaceIterator0.getNodePointer();
      // Undeclared exception!
      try { 
        dOMNamespaceIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("tims|");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.setAttributeNS("tims|", "tims|", "tims|");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("#erV|n1Go5k", "#erV|n1Go5k");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      iIOMetadataNode0.setAttributeNS("<<unknown namespace>>", "http://www.w3.org/2000/xmlns/", "<<unknown namespace>>");
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      iIOMetadataNode0.setAttributeNS("xmlns", "xmlns", "xmlns");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      NodePointer nodePointer1 = dOMNamespaceIterator0.getNodePointer();
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      assertNotNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      NodePointer nodePointer1 = nodePointer0.createAttribute((JXPathContext) null, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer1);
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(0, int0);
  }
}
