
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
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PredicateContext_ESTest extends PredicateContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "AhHAjf*^:^0F}sAt");
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, false);
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(8, expressionArray0);
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, coreFunction0);
      PredicateContext predicateContext0 = new PredicateContext(childContext0, coreOperationMod0);
      boolean boolean0 = predicateContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAdd0, coreOperationAdd0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationLessThan0);
      boolean boolean0 = predicateContext0.nextSet();
      boolean boolean1 = predicateContext0.nextSet();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Integer integer0 = new Integer(55);
      QName qName0 = new QName("\n", "\n");
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, jXPathContext0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, integer0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[6];
      Expression[] expressionArray1 = new Expression[8];
      Constant constant0 = new Constant("");
      expressionArray1[0] = (Expression) constant0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray1[0], constant0);
      expressionArray1[1] = (Expression) coreOperationNotEqual0;
      Step[] stepArray0 = new Step[9];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      stepArray0[7] = step0;
      stepArray0[8] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray1[0], expressionArray0, stepArray0);
      expressionArray1[2] = (Expression) expressionPath0;
      Expression[] expressionArray2 = new Expression[2];
      expressionArray2[0] = (Expression) constant0;
      expressionArray1[3] = (Expression) expressionPath0;
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray1[4] = (Expression) variableReference0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(variableReference0, expressionArray1[4]);
      expressionArray1[5] = (Expression) coreOperationEqual0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionArray2[0]);
      expressionArray1[6] = (Expression) coreOperationNegate0;
      expressionArray1[7] = (Expression) variableReference0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray1);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationUnion0, variableReference0);
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, coreOperationDivide0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(55);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         // :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(0);
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, integer0, nullPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationAnd0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(2161);
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
      Constant constant0 = new Constant("");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationDivide0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(989);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.model.VariablePointerFactory");
      nodeSetContext0.getSingleNodePointer();
      nodeSetContext0.getSingleNodePointer();
      nodeSetContext0.getCurrentNodePointer();
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, processingInstructionTest0);
      PredicateContext predicateContext0 = new PredicateContext(selfContext0, (Expression) null);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(674);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationAdd0);
      // Undeclared exception!
      try { 
        predicateContext0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(183);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("");
      Locale locale0 = Locale.FRENCH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      Constant constant0 = new Constant("");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(nameAttributeTest0, nameAttributeTest0);
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[8];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, expressionPath0);
      // Undeclared exception!
      try { 
        predicateContext0.nextSet();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationUnion0);
      // Undeclared exception!
      try { 
        predicateContext0.nextSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Expression[] expressionArray0 = new Expression[6];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationOr0, extensionFunction0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationMod0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, variableReference0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, nameAttributeTest0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeTypeTest0);
      QName qName0 = new QName("CTd_5F4f#I");
      descendantContext0.nextSet();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(descendantContext0, nodeNameTest0, false, false);
      VariableReference variableReference0 = new VariableReference(qName0);
      PredicateContext predicateContext0 = new PredicateContext(childContext0, variableReference0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("N_", "N_");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, coreOperationAnd0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("^e,i;P");
      Integer integer0 = new Integer(2987);
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, integer0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(variableReference0, variableReference0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationSubtract0, variableReference0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(nameAttributeTest0, nameAttributeTest0);
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, coreOperationMultiply0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: ^e,i;P
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("7Og:");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationOr0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(locationPath0, locationPath0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationEqual0, locationPath0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationGreaterThanOrEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("N_", "N_");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, coreOperationAnd0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(jXPathContext0, object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant("<<unknown namespace>>");
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, constant0);
      boolean boolean0 = predicateContext0.nextNode();
      assertEquals(1, predicateContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("^e,iX;P", "^e,iX;P");
      Integer integer0 = new Integer(2987);
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, integer0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[3];
      evalContextArray0[0] = evalContext0;
      evalContextArray0[1] = evalContext0;
      evalContextArray0[2] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      VariableReference variableReference0 = new VariableReference(qName0);
      PredicateContext predicateContext0 = new PredicateContext(unionContext0, variableReference0);
      predicateContext0.nextNode();
      assertEquals(1, unionContext0.getPosition());
      assertEquals(2, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAdd0, coreOperationAdd0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationLessThan0);
      predicateContext0.reset();
      assertEquals(0, predicateContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("^e,i;P");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[3];
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      VariableReference variableReference0 = new VariableReference(qName0);
      PredicateContext predicateContext0 = new PredicateContext(unionContext0, variableReference0);
      boolean boolean0 = predicateContext0.setPosition(Integer.MIN_VALUE);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(jXPathContext0, object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant("@_h>T^n(V");
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, constant0);
      predicateContext0.getCurrentNodePointer();
      predicateContext0.getCurrentNodePointer();
      assertEquals(1, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant("");
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, constant0);
      predicateContext0.nextNode();
      assertEquals(2, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("^e,i;P");
      Integer integer0 = new Integer(2987);
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, integer0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[3];
      evalContextArray0[0] = evalContext0;
      evalContextArray0[1] = evalContext0;
      evalContextArray0[2] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      VariableReference variableReference0 = new VariableReference(qName0);
      PredicateContext predicateContext0 = new PredicateContext(unionContext0, variableReference0);
      predicateContext0.getCurrentNodePointer();
      assertEquals(1, unionContext0.getPosition());
      assertEquals(2, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(544);
      QName qName0 = new QName("Cannot compare pointers that do not belong to the same tree: '");
      Locale locale0 = new Locale("Cannot compare pointers that do not belong to the same tree: '");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, integer0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, integer0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, locationPath0);
      predicateContext0.nextNode();
      // Undeclared exception!
      try { 
        predicateContext0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(parentContext0, nodeNameTest0, false, false);
      Expression[] expressionArray0 = new Expression[12];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationUnion0, coreOperationNegate0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMod0, coreOperationNegate0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, coreOperationLessThanOrEqual0);
      PredicateContext predicateContext0 = new PredicateContext(childContext0, nameAttributeTest0);
      boolean boolean0 = predicateContext0.setPosition(1);
      assertEquals(2, childContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(23);
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, nodeTypeTest0);
      ChildContext childContext0 = new ChildContext(descendantContext0, nodeTypeTest0, false, false);
      Step[] stepArray0 = new Step[9];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(locationPath0, locationPath0);
      PredicateContext predicateContext0 = new PredicateContext(childContext0, coreOperationMultiply0);
      Consumer<Integer> consumer0 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      predicateContext0.forEachRemaining(consumer0);
      // Undeclared exception!
      try { 
        predicateContext0.nextSet();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
