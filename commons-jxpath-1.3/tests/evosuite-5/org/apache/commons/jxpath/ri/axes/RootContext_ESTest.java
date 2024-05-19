
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


package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.VariablePointerFactory;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RootContext_ESTest extends RootContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicNodeSet0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      rootContext0.setRegisteredValue("\"descendant-or-self::\"");
      String string0 = (String)rootContext0.getRegisteredValue(0);
      assertEquals("\"descendant-or-self::\"", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicNodeSet0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      rootContext0.setRegisteredValue(">'o");
      Object object0 = rootContext0.getRegisteredValue(4);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = RootContext.UNKNOWN_VALUE;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("<xS4*t~z4h ^ju8", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      String string0 = rootContext0.toString();
      assertEquals("Expression context [0] $<xS4*t~z4h ^ju8::$<xS4*t~z4h ^ju8:", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Object object1 = rootContext0.getValue();
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      assertNull(jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicNodeSet0);
      QName qName0 = new QName("\"descendant-or-self::\"");
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)rootContext0.getJXPathContext();
      assertSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Function) null).when(jXPathContextReferenceImpl0).getFunction(any(org.apache.commons.jxpath.ri.QName.class) , any(java.lang.Object[].class));
      doReturn(namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Function function0 = rootContext0.getFunction(qName0, (Object[]) null);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      BeanPointer beanPointer0 = (BeanPointer)rootContext0.getCurrentNodePointer();
      assertNull(beanPointer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn(namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      variablePointer0.setAttribute(true);
      NodePointer nodePointer0 = rootContext0.getCurrentNodePointer();
      assertTrue(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("b");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeNameTest0);
      RootContext rootContext0 = namespaceContext0.getRootContext();
      BeanPointer beanPointer0 = (BeanPointer)rootContext0.getCurrentNodePointer();
      assertTrue(beanPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) namespaceResolver0);
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      assertEquals(0, initialContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      QName qName0 = new QName("B}~>", " 2c(##h8$bhJz=% X");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(ancestorContext0, nodeNameTest0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn(selfContext0).when(jXPathContextReferenceImpl0).getAbsoluteRootContext();
      doReturn(namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2883);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeTypeTest0, true);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn(precedingOrFollowingContext0).when(jXPathContextReferenceImpl0).getAbsoluteRootContext();
      doReturn(namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      assertSame(evalContext0, precedingOrFollowingContext0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = RootContext.UNKNOWN_VALUE;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        rootContext0.getVariableContext((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = RootContext.UNKNOWN_VALUE;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("<xS4*t~z4h ^ju8", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        rootContext0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: <xS4*t~z4h ^ju8:
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        rootContext0.getFunction((QName) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        rootContext0.getConstantContext((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        rootContext0.getAbsoluteRootContext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Gys:", "Gys:");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = null;
      try {
        rootContext0 = new RootContext((JXPathContextReferenceImpl) null, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicNodeSet0);
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      QName qName0 = new QName("\"descendant-or-self::\"");
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      int int0 = rootContext0.setRegisteredValue("\"descendant-or-self::\"");
      assertEquals(0, int0);
      
      rootContext0.setRegisteredValue(basicNodeSet0);
      rootContext0.setRegisteredValue(qName0);
      int int1 = rootContext0.setRegisteredValue(variablePointerFactory0);
      assertEquals(3, int1);
      
      int int2 = rootContext0.setRegisteredValue(basicNodeSet0);
      assertEquals((-1), int2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicNodeSet0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      rootContext0.setRegisteredValue("\"descendant-or-self::\"");
      Object object0 = rootContext0.getRegisteredValue((-1));
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicNodeSet0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      rootContext0.setRegisteredValue("\"descendant-or-self::\"");
      Object object0 = rootContext0.getRegisteredValue(890);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("b");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeNameTest0);
      RootContext rootContext0 = namespaceContext0.getRootContext();
      rootContext0.setRegisteredValue(jXPathContextReferenceImpl0);
      // Undeclared exception!
      try { 
        rootContext0.getRegisteredValue(Integer.MIN_VALUE);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483648
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn(namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Object object0 = rootContext0.getRegisteredValue(Integer.MIN_VALUE);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName(">'");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, qName0, (Pointer) null);
      Object object0 = new Object();
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getConstantContext(nodePointer0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      EvalContext evalContext0 = rootContext0.getConstantContext(basicNodeSet0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      QName qName0 = new QName("}e.3x^Qv");
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        rootContext0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function }e.3x^Qv; Class '}e.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      // Undeclared exception!
      try { 
        rootContext0.nextSet();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicNodeSet0);
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        rootContext0.setPosition(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName(" ", " ");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName(">'");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, qName0, (Pointer) null);
      Object object0 = new Object();
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      // Undeclared exception!
      try { 
        rootContext0.nextNode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      BeanPointer beanPointer1 = (BeanPointer)rootContext0.getValue();
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        rootContext0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      RootContext rootContext1 = rootContext0.getRootContext();
      assertSame(rootContext0, rootContext1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((EvalContext) null).when(jXPathContextReferenceImpl0).getAbsoluteRootContext();
      doReturn(namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicNodeSet0);
      QName qName0 = new QName("\"descendant-or-self::\"");
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        rootContext0.getCurrentPosition();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }
}
