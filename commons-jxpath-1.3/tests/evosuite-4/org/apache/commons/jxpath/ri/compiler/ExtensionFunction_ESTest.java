
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


package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExtensionFunction_ESTest extends ExtensionFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      QName qName0 = extensionFunction0.getFunctionName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      boolean boolean0 = extensionFunction0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction((-62), expressionArray0);
      expressionArray0[5] = (Expression) coreFunction0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      // Undeclared exception!
      extensionFunction0.toString();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[9];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step(1136, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("JXPath: loaded from services: ", "[I*FU]");
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, coreFunction0);
      expressionArray0[1] = (Expression) coreOperationMultiply0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("");
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, nameAttributeTest0);
      expressionArray0[2] = (Expression) coreOperationMultiply0;
      expressionArray0[3] = (Expression) constant0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, expressionArray0[2]);
      expressionArray0[4] = (Expression) coreOperationSubtract0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nameAttributeTest0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeNameTest0);
      BasicNodeSet basicNodeSet0 = (BasicNodeSet)namespaceContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(initialContext0, basicNodeSet0);
      // Undeclared exception!
      try { 
        extensionFunction0.computeValue(nodeSetContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathTypeConversionException", "nW Dd{*G");
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationUnion0, coreOperationUnion0);
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationUnion0, expressionPath0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationGreaterThanOrEqual0);
      expressionArray0[0] = (Expression) coreOperationNegate0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("", "");
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction((-238), expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, coreFunction0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationLessThan0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationNegate0, coreOperationNegate0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMod0, coreOperationMod0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray0[1] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationMod coreOperationMod1 = new CoreOperationMod(coreOperationLessThanOrEqual0, coreFunction0);
      expressionArray0[2] = (Expression) coreOperationMod1;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeTest", "zBIR1Jed");
      Expression[] expressionArray0 = new Expression[9];
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(variableReference0, variableReference0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationEqual0, variableReference0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationDivide0, coreOperationEqual0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "zBIR1Jed");
      Object object0 = new Object();
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      // Undeclared exception!
      try { 
        extensionFunction0.compute(initialContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.compiler.NodeTest:zBIR1Jed
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName((String) null, " o2r5NGn/S");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) " o2r5NGn/S");
      Locale locale0 = new Locale("org.apache.commons.jxpath.ri.compiler.NodeNameTest", "org.apache.commons.jxpath.ri.compiler.NodeNameTest", " o2r5NGn/S");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(extensionFunction0);
      // Undeclared exception!
      try { 
        extensionFunction0.compute(initialContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function:  o2r5NGn/S
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction((-395), expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.compute(unionContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant("");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nameAttributeTest0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeNameTest0);
      BasicNodeSet basicNodeSet0 = (BasicNodeSet)namespaceContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(initialContext0, basicNodeSet0);
      // Undeclared exception!
      try { 
        extensionFunction0.computeValue(nodeSetContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExtensionFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Function) null).when(jXPathContextReferenceImpl0).getFunction(any(org.apache.commons.jxpath.ri.QName.class) , any(java.lang.Object[].class));
      doReturn(namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        extensionFunction0.computeValue(rootContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName(")crK5suTe{", ";0");
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      Expression[] expressionArray0 = new Expression[6];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      expressionArray0[2] = (Expression) constant0;
      expressionArray0[3] = (Expression) constant0;
      expressionArray0[4] = (Expression) constant0;
      expressionArray0[5] = (Expression) constant0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.compute((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExtensionFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName(")crK5suTe{", ";0");
      Expression[] expressionArray0 = new Expression[6];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      String string0 = extensionFunction0.toString();
      assertEquals(")crK5suTe{:;0(null, null, null, null, null, null)", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      String string0 = extensionFunction0.toString();
      assertEquals("()", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      QName qName1 = extensionFunction0.getFunctionName();
      assertEquals("", qName1.getName());
  }
}
