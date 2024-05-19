
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationDivide_ESTest extends CoreOperationDivide_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant constant0 = new Constant(4);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, coreOperationNotEqual0);
      Object object0 = coreOperationDivide0.computeValue((EvalContext) null);
      assertEquals(4.0, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      Object object0 = coreOperationDivide0.computeValue((EvalContext) null);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      boolean boolean0 = coreOperationDivide0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      String string0 = coreOperationDivide0.getSymbol();
      assertEquals("div", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      int int0 = coreOperationDivide0.getPrecedence();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("6_:Ku8FGSm)", "6_:Ku8FGSm)");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, variableReference0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationDivide0);
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 6_:Ku8FGSm):6_:Ku8FGSm)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant((Number) null);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[1] = (Expression) extensionFunction0;
      Expression[] expressionArray1 = new Expression[9];
      expressionArray1[0] = (Expression) extensionFunction0;
      expressionArray1[6] = (Expression) coreOperationMultiply0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray1);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<Number>");
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationAnd0, expressionArray1[6]);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationGreaterThan0, coreOperationOr0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(parentContext0, processingInstructionTest0, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      ChildContext childContext0 = new ChildContext(nodeSetContext0, processingInstructionTest0, true, false);
      // Undeclared exception!
      coreOperationDivide0.computeValue(childContext0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(29, (Expression[]) null);
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("AQk/ef");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionPath0, expressionArray0[0]);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationEqual0, expressionArray0[4]);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(ancestorContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: key()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      QName qName0 = new QName("div");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "z]R");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, false);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(precedingOrFollowingContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) constant0;
      coreOperationDivide0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.model.container.ContainerPointer");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMod0, coreOperationMod0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(nameAttributeTest0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationGreaterThanOrEqual0, coreOperationMod0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "(org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual@0000000004) div (org.apache.commons.jxpath.ri.compiler.CoreOperationMod@0000000002)");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(parentContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }
}
