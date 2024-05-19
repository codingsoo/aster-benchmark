
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


package org.apache.commons.jxpath.ri.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class VariablePointer_ESTest extends VariablePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      VariablePointer variablePointer1 = new VariablePointer((QName) null);
      variablePointer1.index = (-1429);
      int int0 = variablePointer0.compareChildNodePointers(variablePointer1, variablePointer1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("Factory did not assign a collection to variable '");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setIndex((-1919));
      variablePointer0.hashCode();
      assertEquals((-1919), variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName(", a<omiP", ", a<omiP");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("\"..\"");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "\"..\"");
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) variablePointer0);
      variablePointer0.findVariables(jXPathContext1);
      assertFalse(variablePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        variablePointer0.createChild(jXPathContext0, qName0, 1, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn org.apache.commons.jxpath.ri.JXPathContextReferenceImpl into a collection of size 2
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3187);
      boolean boolean0 = variablePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("rZ#>$Hxs|W`F!v'", "rZ#>$Hxs|W`F!v'");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.isActual();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      QName qName0 = variablePointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)nodePointer0.getBaseValue();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      nodePointer0.setIndex(229);
      variablePointer0.createPath(jXPathContext0, (Object) variablePointer0);
      assertEquals(229, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.index = 440;
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null);
      assertTrue(nodePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      String string0 = "^/:\\uP#nw\\Tw#";
      QName qName0 = new QName(string0);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      variablePointer0.createPath((JXPathContext) null, (Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createChild(jXPathContext0, qName0, 0, (Object) variablePointer0);
      assertEquals(0, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      nodePointer0.setIndex(255);
      variablePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
      assertEquals(255, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      variablePointer0.index = 440;
      NodePointer nodePointer1 = nodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) "org.apache.commons.jxpath.ri.model.VariablePointer$1");
      assertNotNull(nodePointer1);
      
      int int0 = variablePointer0.compareChildNodePointers(nodePointer0, nodePointer1);
      assertEquals((-2147483208), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName(", a<omiP", ", a<omiP");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Factory cannot define variable '");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) ", a<omiP");
      NodeIterator nodeIterator0 = variablePointer0.childIterator(nodeNameTest0, true, nodePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("Factory did not assign a collection to variable '");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeIterator nodeIterator0 = variablePointer0.childIterator((NodeTest) null, false, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        variablePointer0.testNode(nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.NodeNameTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Uti19aKK");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      // Undeclared exception!
      try { 
        variablePointer0.testNode(nodeNameTest0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Uti19aKK'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName(";6!vN)y!vJqa<S,p", "org.apache.commons.jxpath.ri.model.VariablePointer");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.setValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      nodePointer0.setIndex((-1420));
      // Undeclared exception!
      try { 
        variablePointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index is less than 1: $:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      // Undeclared exception!
      try { 
        variablePointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("' for path: ", "^p1dx!/l@UWH@A\"");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("^p1dx!/l@UWH@A\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("W<xR2t$x_v!", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("f@!nEvWn?");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'W<xR2t$x_v!:'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("CK%/yZ", "CK%/yZ");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.namespaceIterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManager has been specified");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Cannot find an element by ID - no IdentityManager has been specified'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("1&[^?\"~F'Zd{|*");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Undefined variable: ", "Undefined variable: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Undefined variable: :Undefined variable: '
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("fx!@v#V");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'fx!@v#V'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("VSZX4w1?S12L(g", "VSZX4w1?S12L(g");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Ip&RSE]wTH", "Ip&RSE]wTH");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Ip&RSE]wTH:Ip&RSE]wTH'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("Factory did not assign a collection to variable '", "nVh/8lwjf");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, (QName) null, (Object) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodePointer0);
      // Undeclared exception!
      try { 
        variablePointer0.findVariables(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = "^/:\\uP#nw\\Tw#";
      QName qName0 = new QName(string0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) null, (Object) variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      variablePointer0.setIndex(229);
      // Undeclared exception!
      try { 
        variablePointer0.createPath(jXPathContext0, (Object) variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory:null
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QName qName0 = new QName(" could not create an object for path: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) " could not create an object for path: ");
      // Undeclared exception!
      try { 
        variablePointer0.createChild(jXPathContext0, qName0, (-5853), (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $ could not create an object for path: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QName qName0 = new QName("`Xs_k_");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, 0, (Object) qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable '' for path: $
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QName qName0 = new QName((String) null, " #<i=iH]khT>o");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, (-2000));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("S-J|MiezD*~ViYs]l", "S-J|MiezD*~ViYs]l");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        variablePointer0.createChild(jXPathContext0, qName0, 383);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'S-J|MiezD*~ViYs]l:S-J|MiezD*~ViYs]l'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.compareChildNodePointers((NodePointer) null, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName(", atomic");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Factory cannot define variable '");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) ", atomic");
      // Undeclared exception!
      try { 
        variablePointer0.childIterator(nodeNameTest0, true, nodePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      // Undeclared exception!
      try { 
        variablePointer0.childIterator(nodeTypeTest0, false, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      // Undeclared exception!
      try { 
        variablePointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "xRW*O>lCNygePv");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.attributeIterator(qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':xRW*O>lCNygePv'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.index = 440;
      // Undeclared exception!
      try { 
        variablePointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      // Undeclared exception!
      try { 
        variablePointer0.getAbstractFactory(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      String string0 = variablePointer0.asPath();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0);
      assertTrue(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      QName qName0 = new QName("Cannot replace the root object", "Cannot replace the root object");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setValue(variablePointer0);
      int int0 = variablePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getLength();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NodePointer nodePointer1 = variablePointer0.getImmediateValuePointer();
      assertSame(nodePointer1, nodePointer0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)variablePointer0.getImmediateNode();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      variablePointer0.index = 440;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)jXPathContext0.getRelativeContext(nodePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      QName qName0 = new QName("\"C`~jwq");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: \"C`~jwq
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      QName qName0 = new QName("rZ#>$Hxs|W`F!v'", "rZ#>$Hxs|W`F!v'");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      QName qName1 = variablePointer0.getName();
      assertSame(qName0, qName1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, "_aLoV");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      boolean boolean0 = variablePointer0.isActual();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      variablePointer0.index = 440;
      String string0 = nodePointer0.asPath();
      assertEquals("$:", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QName qName0 = new QName("Factory did not assign a collection to variable '");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setIndex((-1919));
      variablePointer0.asPath();
      assertEquals((-1919), variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      QName qName0 = new QName("rZ#>$Hxs|W`F!v'", "rZ#>$Hxs|W`F!v'");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      VariablePointer variablePointer1 = new VariablePointer((Variables) null, qName0);
      variablePointer1.setIndex((-4067));
      boolean boolean0 = variablePointer0.equals(variablePointer1);
      assertEquals((-4067), variablePointer1.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer1 = new VariablePointer(variables0, qName0);
      boolean boolean0 = variablePointer1.equals(variablePointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      VariablePointer variablePointer1 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.equals(variablePointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathException", "sAQAM;`z&TcR");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      boolean boolean0 = variablePointer0.equals(variablePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      boolean boolean0 = variablePointer0.equals(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("6jiy!X", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName(", a<omiP", ", a<omiP");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.createPath(jXPathContext0, (Object) ", a<omiP");
      variablePointer0.findVariables(jXPathContext0);
      assertTrue(variablePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      variablePointer0.index = 440;
      variablePointer0.remove();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      QName qName0 = new QName("q", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.remove();
      assertFalse(variablePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, qName0, 229);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn org.apache.commons.jxpath.ri.JXPathContextReferenceImpl into a collection of size 230
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      // Undeclared exception!
      try { 
        variablePointer0.createChild(jXPathContext0, qName0, (-2961), (Object) "$:");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index is less than 1: $:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      QName qName0 = new QName("q", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        variablePointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $q:null
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      QName qName0 = new QName("\"..\"");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      int int0 = variablePointer0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      variablePointer0.getImmediateValuePointer();
      boolean boolean0 = nodePointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.index = 440;
      // Undeclared exception!
      try { 
        variablePointer0.setValue(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.setValue((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      boolean boolean0 = variablePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.createPath((JXPathContext) null, (Object) null);
      boolean boolean0 = variablePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("xv_UV", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setValue("");
      boolean boolean0 = variablePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      boolean boolean0 = nodePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      QName qName0 = new QName("", "Factory could3not create object path: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :Factory could3not create object path: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      QName qName0 = new QName("Factory did not assign a collection to variable '");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Factory did not assign a collection to variable '
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeIterator nodeIterator0 = variablePointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.namespacePointer("");
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodePointer nodePointer0 = variablePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeIterator nodeIterator0 = variablePointer0.namespaceIterator();
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.namespaceIterator();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      QName qName0 = new QName("7q`yuOU", "");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      boolean boolean0 = variablePointer0.isContainer();
      assertTrue(variablePointer0.isActual());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Uti19aKK");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1171));
      // Undeclared exception!
      try { 
        variablePointer0.childIterator(nodeTypeTest0, false, (NodePointer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Uti19aKK'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        variablePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) "org.apache.commons.jxpath.ri.model.VariablePointer$1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }
}
