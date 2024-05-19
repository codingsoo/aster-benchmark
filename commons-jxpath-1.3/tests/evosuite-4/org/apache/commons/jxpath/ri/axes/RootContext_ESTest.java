
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
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RootContext_ESTest extends RootContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Object object0 = rootContext0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      rootContext0.setRegisteredValue((Object) null);
      Object object0 = rootContext0.getRegisteredValue((byte)0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      assertNull(jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      jXPathContextReferenceImpl0.setLenient(true);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      assertTrue(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Function) null).when(jXPathContextReferenceImpl0).getFunction(any(org.apache.commons.jxpath.ri.QName.class) , any(java.lang.Object[].class));
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Object[] objectArray0 = new Object[2];
      Function function0 = rootContext0.getFunction((QName) null, objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicNodeSet0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      NodePointer nodePointer0 = rootContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("R^ P_j](@Ja", "R^ P_j](@Ja");
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, basicNodeSet0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      BeanPointer beanPointer1 = (BeanPointer)rootContext0.getCurrentNodePointer();
      assertTrue(beanPointer1.isNode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      variablePointer0.setAttribute(true);
      NodePointer nodePointer0 = rootContext0.getCurrentNodePointer();
      assertSame(variablePointer0, nodePointer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("pf[R", "pf[R");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "pf[R");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn(ancestorContext0).when(jXPathContextReferenceImpl0).getAbsoluteRootContext();
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicNodeSet0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
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
  public void test11()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      QName qName0 = new QName("xf7{;_h7FdOBZ(5", "xf7{;_h7FdOBZ(5");
      // Undeclared exception!
      try { 
        rootContext0.getVariableContext(qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      rootContext0.setRegisteredValue(object0);
      // Undeclared exception!
      try { 
        rootContext0.getRegisteredValue((-1835));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1835
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = RootContext.UNKNOWN_VALUE;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("F/'pfn}#/kNS2|zng.F");
      Locale locale0 = Locale.GERMANY;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        rootContext0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function F/'pfn}#/kNS2|zng.F; F/'pfn}#/kNS2|zng
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("W\"hL[\"");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, jXPathContextReferenceImpl0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        rootContext0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: W\"hL[\"
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("?`u2*a{ZlOT};1");
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        rootContext0.getConstantContext(qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
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
  public void test18()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("W\"hL[\"");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, jXPathContextReferenceImpl0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      int int0 = rootContext0.setRegisteredValue(beanPointer0);
      assertEquals(0, int0);
      
      int int1 = rootContext0.setRegisteredValue(qName0);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      int int0 = rootContext0.setRegisteredValue(object0);
      assertEquals(0, int0);
      
      Object object1 = rootContext0.getRegisteredValue((-1));
      assertNotSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      rootContext0.setRegisteredValue(object0);
      Object object1 = rootContext0.getRegisteredValue((byte)83);
      assertFalse(object1.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeTypeTest0);
      RootContext rootContext0 = namespaceContext0.getRootContext();
      Object object0 = rootContext0.getRegisteredValue(13);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(variablePointer0);
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, basicNodeSet0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      EvalContext evalContext0 = rootContext0.getConstantContext(basicNodeSet0);
      //  // Unstable assertion: assertEquals(1, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Object[] objectArray0 = new Object[2];
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
  public void test25()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "lk4M|b&");
      QName qName0 = new QName("lk4M|b&", "lk4M|b&");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)rootContext0.getJXPathContext();
      assertSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
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
  public void test27()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeTypeTest0);
      RootContext rootContext0 = namespaceContext0.getRootContext();
      // Undeclared exception!
      try { 
        rootContext0.setPosition(13);
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
      QName qName0 = new QName("'l*E_i(`5\"?3pq{!+t");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodePointer0);
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
  public void test29()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Object object0 = rootContext0.getValue();
      assertSame(object0, variablePointer0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      String string0 = rootContext0.toString();
      assertEquals("Expression context [0] $null:$null", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      RootContext rootContext1 = rootContext0.getRootContext();
      assertSame(rootContext0, rootContext1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((EvalContext) null).when(jXPathContextReferenceImpl0).getAbsoluteRootContext();
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
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

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, basicNodeSet0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      QName qName0 = new QName("");
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      assertEquals(0, evalContext0.getPosition());
  }
}
