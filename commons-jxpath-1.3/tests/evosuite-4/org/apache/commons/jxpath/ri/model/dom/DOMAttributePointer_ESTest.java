
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DOMAttributePointer_ESTest extends DOMAttributePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("JXPath: loaded from services: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).getNodeName();
      doReturn((String) null).when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("cy0Qy,[I[R(`)[/^", "{O|#L_by50CdwbN]");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, (Attr) null);
      Object object0 = dOMAttributePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("&9&EtVJW#sSU]&L(^7(", "&9&EtVJW#sSU]&L(^7(");
      Locale locale0 = new Locale("", "4e]*>");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, (Attr) null);
      Object object0 = dOMAttributePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("false()", "5[pw/YeD=");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, (Attr) null);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.setValue("false()");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("q", ":fcn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, (Attr) null);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, (Attr) null);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(")Z.Q4sm");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).getNodeName();
      doReturn((String) null).when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.getNamespaceURI();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("D0\"BhT");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).getNodeName();
      doReturn((String) null).when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setIndex(3014);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'META-INF/services/:META-INF/services/'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(")Z.Q4sm");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn(")Z.Q4sm").when(attr0).getValue();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      Object object0 = dOMAttributePointer0.getValue();
      assertEquals(")Z.Q4sm", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("IK-2KOw1+($)lI4D").when(attr0).getLocalName();
      doReturn("{}").when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      QName qName1 = dOMAttributePointer0.getName();
      assertNotSame(qName0, qName1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      Attr attr1 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer1 = new DOMAttributePointer(dOMAttributePointer0, attr1);
      boolean boolean0 = dOMAttributePointer0.equals(dOMAttributePointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("Fo|Ti");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      boolean boolean0 = dOMAttributePointer0.equals(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      Object object0 = dOMAttributePointer0.clone();
      boolean boolean0 = dOMAttributePointer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      boolean boolean0 = dOMAttributePointer0.equals(dOMAttributePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attr0).getLocalName();
      doReturn("D@").when(attr0).getNodeName();
      doReturn((String) null).when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      Attr attr1 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("Rg,6OI VC~").when(attr1).getLocalName();
      doReturn("D@").when(attr1).getNodeName();
      doReturn((String) null).when(attr1).getPrefix();
      DOMAttributePointer dOMAttributePointer1 = new DOMAttributePointer(dOMAttributePointer0, attr1);
      String string0 = dOMAttributePointer1.asPath();
      assertEquals("@/@Rg,6OI VC~", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((short)0).when(attr0).getNodeType();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer");
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, attr0, locale0);
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, (Attr) null);
      // Undeclared exception!
      try { 
        dOMAttributePointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("").when(attr0).getLocalName();
      doReturn("D@").when(attr0).getNodeName();
      doReturn((String) null).when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      String string0 = dOMAttributePointer0.asPath();
      assertEquals("@", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      boolean boolean0 = dOMAttributePointer0.testNode(nodeTypeTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("Fo|Ti");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      boolean boolean0 = dOMAttributePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(")Z.Q4sm");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(")Z.Q4sm");
      boolean boolean0 = dOMAttributePointer0.testNode(processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName(";F");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      boolean boolean0 = dOMAttributePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(attr0).getSpecified();
      doReturn("", "").when(attr0).getValue();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      Object object0 = dOMAttributePointer0.getValue();
      assertNull(object0);
      
      Object object1 = dOMAttributePointer0.getValue();
      assertEquals("", object1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("java.util.concurrent.atomic.AtomicInteger").when(attr0).getValue();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      dOMAttributePointer0.setValue(dOMAttributePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("Fo|Ti");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(attr0).getValue();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      Object object0 = dOMAttributePointer0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("D@").when(attr0).getNodeName();
      doReturn((String) null).when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer((NodePointer) null, attr0);
      String string0 = dOMAttributePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("{}").when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      String string0 = dOMAttributePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      int int0 = dOMAttributePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("META-INF/services/").when(attr0).toString();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      Object object0 = dOMAttributePointer0.getImmediateNode();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("META-INF/services/").when(attr0).toString();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      Object object0 = dOMAttributePointer0.getBaseValue();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn("IK-2KOw1+($)lI4D").when(attr0).getLocalName();
      doReturn("{}").when(attr0).getPrefix();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      String string0 = dOMAttributePointer0.asPath();
      assertEquals("$META-INF/services/:META-INF/services/@{}:IK-2KOw1+($)lI4D", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("Fo|Ti");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      boolean boolean0 = dOMAttributePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      doReturn(attr0).when(element0).removeAttributeNode(any(org.w3c.dom.Attr.class));
      Attr attr1 = mock(Attr.class, new ViolatedAssumptionAnswer());
      doReturn(element0).when(attr1).getOwnerElement();
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr1);
      dOMAttributePointer0.remove();
      assertFalse(dOMAttributePointer0.isCollection());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("Fo|Ti");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      boolean boolean0 = dOMAttributePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("Fo|Ti");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      int int0 = dOMAttributePointer0.compareChildNodePointers(nodePointer0, variablePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("META-INF/services/", "META-INF/services/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(variablePointer0, attr0);
      boolean boolean0 = dOMAttributePointer0.isActual();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QName qName0 = new QName("Fo|Ti");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      Attr attr0 = mock(Attr.class, new ViolatedAssumptionAnswer());
      DOMAttributePointer dOMAttributePointer0 = new DOMAttributePointer(nodePointer0, attr0);
      dOMAttributePointer0.hashCode();
  }
}