
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
import org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DOMAttributeIterator_ESTest extends DOMAttributeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("vUy}+{7{HW1UEZ^");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      dOMAttributeIterator0.setPosition(721);
      // Undeclared exception!
      try { 
        dOMAttributeIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 720, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName(" ");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode(" ");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      dOMAttributeIterator0.setPosition((-2656));
      // Undeclared exception!
      try { 
        dOMAttributeIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("T)", "*");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*");
      Locale locale0 = Locale.ITALIAN;
      iIOMetadataNode0.setAttribute("*", "Wjvk.w2l{;k >Ie");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("xmlns", "xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.TAIWAN;
      iIOMetadataNode0.setAttribute("xmlns", "xmlns");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      boolean boolean0 = dOMAttributeIterator0.setPosition(1);
      assertEquals(1, dOMAttributeIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("vUy}+{7{HW1UEZ^");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("vUy}+{7{HW1UEZ^");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
      
      dOMAttributeIterator0.getNodePointer();
      int int0 = dOMAttributeIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("CUy}+{7{HW1+EZ^");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("CUy}+{7{HW1+EZ^");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      dOMAttributeIterator0.setPosition((-553));
      int int0 = dOMAttributeIterator0.getPosition();
      assertEquals((-553), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("; ", "vUy}+{7{HW1UEZ^");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      dOMAttributeIterator0.getNodePointer();
      // Undeclared exception!
      try { 
        dOMAttributeIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      DOMAttributeIterator dOMAttributeIterator0 = null;
      try {
        dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, (QName) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = null;
      try {
        dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, (QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMAttributeIterator dOMAttributeIterator0 = null;
      try {
        dOMAttributeIterator0 = new DOMAttributeIterator(variablePointer0, qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':null'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("JXPath: found  ", "JXPath: found  ");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "JXPath: found  ", locale0);
      DOMAttributeIterator dOMAttributeIterator0 = null;
      try {
        dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("xmlns", "xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
      
      boolean boolean0 = dOMAttributeIterator0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("xmlns", "xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.TAIWAN;
      iIOMetadataNode0.setAttribute("xmlns", "xmlns");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      NodePointer nodePointer1 = dOMAttributeIterator0.getNodePointer();
      assertNotNull(nodePointer1);
      assertEquals(0, dOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("xmlns", "xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.TAIWAN;
      iIOMetadataNode0.setAttribute("|[P:7?{", "jX");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("*", "*");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*");
      Locale locale0 = Locale.ITALIAN;
      iIOMetadataNode0.setAttribute("xmlns", "Wjvk.w2l{;k >Ie");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("*", "*");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*");
      Locale locale0 = Locale.ITALIAN;
      iIOMetadataNode0.setAttribute(":*@~zp!l)w", "Wjvk.w2l{;k >Ie");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("*");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*");
      Locale locale0 = Locale.ITALIAN;
      iIOMetadataNode0.setAttribute("xm_ns", "Wjvk.w2l{;k >Ie");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName(" ");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode(" ");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodePointer nodePointer1 = nodePointer0.createAttribute((JXPathContext) null, qName0);
      assertNotNull(nodePointer1);
      
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer1, qName0);
      assertEquals(0, dOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("*");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMAttributeIterator dOMAttributeIterator0 = new DOMAttributeIterator(nodePointer0, qName0);
      int int0 = dOMAttributeIterator0.getPosition();
      assertEquals(0, int0);
  }
}
