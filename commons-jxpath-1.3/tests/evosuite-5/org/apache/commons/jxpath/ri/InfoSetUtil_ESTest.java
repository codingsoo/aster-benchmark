
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


package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InfoSetUtil_ESTest extends InfoSetUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(40, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreFunction0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationSubtract0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationNegate0, coreFunction0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationNegate0, coreOperationSubtract0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationGreaterThanOrEqual0);
      Double double0 = (Double)jXPathContextReferenceImpl0.getValue("b8`h>A!^k", (Expression) coreOperationDivide0);
      String string0 = InfoSetUtil.stringValue(double0);
      assertEquals("Infinity", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = new Double(1828);
      double double1 = InfoSetUtil.doubleValue(double0);
      assertEquals(1828.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, processingInstructionTest0);
      RootContext rootContext0 = namespaceContext0.getRootContext();
      QName qName0 = new QName("b8`h>A!^k");
      InitialContext initialContext1 = (InitialContext)rootContext0.getVariableContext(qName0);
      // Undeclared exception!
      try { 
        InfoSetUtil.stringValue(initialContext1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: b8`h>A!^k
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) initialContext0;
      evalContextArray0[1] = (EvalContext) initialContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      ParentContext parentContext0 = new ParentContext(initialContext0, nodeTypeTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(parentContext0, nodeTypeTest0);
      RootContext rootContext0 = namespaceContext0.getRootContext();
      evalContextArray0[3] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.stringValue(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnionContext unionContext0 = new UnionContext((EvalContext) null, (EvalContext[]) null);
      // Undeclared exception!
      try { 
        InfoSetUtil.stringValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("true");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      ChildContext childContext0 = new ChildContext(rootContext0, nodeTypeTest0, true, false);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) childContext0;
      UnionContext unionContext0 = new UnionContext(childContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("true");
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, false, processingInstructionTest0);
      DescendantContext descendantContext0 = new DescendantContext(ancestorContext0, false, processingInstructionTest0);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      evalContextArray0[0] = (EvalContext) nodeSetContext0;
      evalContextArray0[1] = (EvalContext) nodeSetContext0;
      evalContextArray0[2] = (EvalContext) ancestorContext0;
      evalContextArray0[3] = (EvalContext) descendantContext0;
      evalContextArray0[4] = (EvalContext) descendantContext0;
      UnionContext unionContext0 = new UnionContext(descendantContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(unionContext0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[5];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, processingInstructionTest0);
      RootContext rootContext0 = namespaceContext0.getRootContext();
      QName qName0 = new QName("b8`h>A!^k", "");
      InitialContext initialContext1 = (InitialContext)rootContext0.getVariableContext(qName0);
      evalContextArray0[0] = (EvalContext) initialContext1;
      // Undeclared exception!
      try { 
        InfoSetUtil.doubleValue(evalContextArray0[0]);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: b8`h>A!^k:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(object0);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.doubleValue(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext(attributeContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.doubleValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, processingInstructionTest0);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      QName qName0 = new QName("", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, extensionFunction0);
      evalContextArray0[0] = (EvalContext) predicateContext0;
      UnionContext unionContext0 = new UnionContext(namespaceContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(unionContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: :
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnionContext unionContext0 = new UnionContext((EvalContext) null, (EvalContext[]) null);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("n~-OLfxfE<Nc", ".");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      SelfContext selfContext0 = new SelfContext(ancestorContext0, processingInstructionTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      NodeSetContext nodeSetContext0 = new NodeSetContext(selfContext0, basicNodeSet0);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(nodeSetContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'n~-OLfxfE<Nc:.'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = InfoSetUtil.doubleValue("");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = InfoSetUtil.doubleValue("java.lang.Object@202c3d91");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Number number0 = InfoSetUtil.number("");
      assertEquals(Double.NaN, number0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      String string0 = InfoSetUtil.stringValue(object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(15, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreFunction0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationSubtract0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationNegate0, coreFunction0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationNegate0, coreOperationSubtract0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationGreaterThanOrEqual0);
      Double double0 = (Double)jXPathContextReferenceImpl0.getValue("b8`h>A!^k", (Expression) coreOperationDivide0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = InfoSetUtil.stringValue((Object) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = InfoSetUtil.booleanValue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, processingInstructionTest0);
      RootContext rootContext0 = namespaceContext0.getRootContext();
      QName qName0 = new QName("b8`h>A!^k", "");
      InitialContext initialContext1 = (InitialContext)rootContext0.getVariableContext(qName0);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(initialContext1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: b8`h>A!^k:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      boolean boolean0 = InfoSetUtil.booleanValue(infoSetUtil0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = InfoSetUtil.booleanValue("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = InfoSetUtil.booleanValue("java.lang.Object@19d9114d");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      boolean boolean0 = InfoSetUtil.booleanValue(unionContext0);
      assertEquals(1, unionContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Double double0 = new Double(0.0);
      boolean boolean0 = InfoSetUtil.booleanValue(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Double double0 = new Double(Double.NaN);
      boolean boolean0 = InfoSetUtil.booleanValue(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = InfoSetUtil.booleanValue(initialContext0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[5];
      evalContextArray0[0] = (EvalContext) initialContext0;
      initialContext0.getNodeSet();
      evalContextArray0[1] = (EvalContext) initialContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      double double0 = InfoSetUtil.doubleValue(unionContext0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(40, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreFunction0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationSubtract0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationNegate0, coreFunction0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationNegate0, coreOperationSubtract0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationGreaterThanOrEqual0);
      Double double0 = (Double)jXPathContextReferenceImpl0.getValue("b8`h>A!^k", (Expression) coreOperationDivide0);
      assertEquals(Double.POSITIVE_INFINITY, (double)double0, 0.01);
      
      boolean boolean0 = InfoSetUtil.booleanValue(double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(locationPath0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationNegate0, locationPath0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationDivide0, locationPath0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContextReferenceImpl0.getPointer("b8`h>A!^k", (Expression) coreOperationMultiply0);
      assertFalse(beanPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      Number number0 = InfoSetUtil.number(unionContext0);
      assertEquals(Double.NaN, number0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Double double0 = (Double)InfoSetUtil.number(initialContext0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[9];
      UnionContext unionContext0 = new UnionContext(evalContextArray0[0], evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      Number number0 = InfoSetUtil.number(infoSetUtil0);
      Number number1 = InfoSetUtil.number(number0);
      assertEquals(Double.NaN, number1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) infoSetUtil0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[5];
      evalContextArray0[0] = (EvalContext) initialContext0;
      evalContextArray0[1] = (EvalContext) initialContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      InfoSetUtil.doubleValue(unionContext0);
      InfoSetUtil.stringValue(unionContext0);
      assertEquals(0, unionContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Double double0 = new Double(0.0);
      String string0 = InfoSetUtil.stringValue(double0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = InfoSetUtil.stringValue("java.lang.Object@4918bf94");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      Number number0 = InfoSetUtil.number(infoSetUtil0);
      String string0 = InfoSetUtil.stringValue(number0);
      assertEquals("NaN", string0);
  }
}
