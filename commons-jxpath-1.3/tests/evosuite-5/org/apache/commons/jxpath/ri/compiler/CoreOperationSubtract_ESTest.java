
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationSubtract_ESTest extends CoreOperationSubtract_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[17];
      Constant constant0 = new Constant(46);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreFunction coreFunction0 = new CoreFunction(46, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreOperationLessThan0);
      Object object0 = coreOperationSubtract0.computeValue((EvalContext) null);
      assertEquals((-1.0), object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant(2);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreFunction coreFunction0 = new CoreFunction(29, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreOperationLessThan0);
      String string0 = coreOperationSubtract0.getSymbol();
      assertEquals("-", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract", "org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(extensionFunction0, extensionFunction0);
      int int0 = coreOperationSubtract0.getPrecedence();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant((String) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationGreaterThan0, constant0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationGreaterThanOrEqual0, coreOperationOr0);
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      QName qName0 = new QName("]q(EXm@a33BU");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMultiply0, expressionArray0[2]);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMultiply0, nameAttributeTest0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationDivide0, expressionArray0[4]);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[3]);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, extensionFunction0, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      ChildContext childContext0 = new ChildContext(initialContext0, nodeNameTest0, true, true);
      // Undeclared exception!
      coreOperationSubtract0.computeValue(childContext0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant(2);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreFunction coreFunction0 = new CoreFunction(29, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreOperationLessThan0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: key(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract", "org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(extensionFunction0, extensionFunction0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(4);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue(parentContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant(2);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreFunction coreFunction0 = new CoreFunction(47, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreOperationLessThan0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationSubtract0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNegate0, coreOperationSubtract0);
      CoreOperationSubtract coreOperationSubtract1 = new CoreOperationSubtract(coreOperationGreaterThan0, constant0);
      coreOperationGreaterThan0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationSubtract1.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[17];
      Constant constant0 = new Constant(46);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreFunction coreFunction0 = new CoreFunction(46, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreOperationLessThan0);
      boolean boolean0 = coreOperationSubtract0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationAdd0, coreOperationAdd0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAdd0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationDivide0, coreOperationNegate0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationMod0, coreOperationDivide0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }
}
