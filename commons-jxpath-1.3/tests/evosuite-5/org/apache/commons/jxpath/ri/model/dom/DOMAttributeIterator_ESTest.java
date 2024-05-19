
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
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DOMAttributeIterator_ESTest extends DOMAttributeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("*");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.setAttribute(")", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
      iIOMetadataNode0.setAttribute("xPY=^xnfxt5mc", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
      NodePointer nodePointer0 = dOMAttributeIterator0.getNodePointer();
      assertEquals(0, dOMAttributeIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("*");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      QName qName1 = new QName(")", "<<unknown namespace>>");
      NodeIterator nodeIterator0 = variablePointer0.attributeIterator(qName1);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(")", "*");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.setAttribute("FP<SuZ':X|", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("*");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.setAttribute("vU|", "org.apache.ckmmons.jxpah.ri.model.dom.D<MAttributeIterator");
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
      boolean boolean0 = dOMAttributeIterator0.setPosition(1);
      assertEquals(1, dOMAttributeIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
      
      dOMAttributeIterator0.getNodePointer();
      int int0 = dOMAttributeIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
      dOMAttributeIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = dOMAttributeIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(")");
      basicVariables0.declareVariable(")", ")");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodeIterator nodeIterator0 = variablePointer0.attributeIterator(qName0);
      // Undeclared exception!
      try { 
        nodeIterator0.getPosition();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
      dOMAttributeIterator0.setPosition(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        dOMAttributeIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("*");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      variablePointer0.setValue(jXPathContext0);
      NodeIterator nodeIterator0 = variablePointer0.attributeIterator(qName0);
      // Undeclared exception!
      try { 
        nodeIterator0.getNodePointer();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMAttributeIterator dOMAttributeIterator0 = null;
      try {
        dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMAttributeIterator dOMAttributeIterator0 = null;
      try {
        dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      Object object0 = new Object();
      basicVariables0.declareVariable("c|Krv", object0);
      QName qName0 = new QName("c|Krv");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.getValuePointer();
      DOMAttributeIterator dOMAttributeIterator0 = null;
      try {
        dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
      
      boolean boolean0 = dOMAttributeIterator0.setPosition(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      DOMAttributeIterator dOMAttributeIterator0 = null;
      try {
        dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("*", "*");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.setAttribute("pl|tk", "pl|tk");
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      NodeIterator nodeIterator0 = variablePointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("*");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.setAttribute("xmlns", "xmlns");
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      NodeIterator nodeIterator0 = variablePointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("G");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("G");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, (Locale) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      NodePointer nodePointer1 = nodePointer0.createAttribute(jXPathContext0, qName0);
      assertNotNull(nodePointer1);
      
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer1, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(")");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode(")");
      variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
      int int0 = dOMAttributeIterator0.getPosition();
      assertEquals(0, int0);
  }
}