
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
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationAnd_ESTest extends CoreOperationAnd_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant("#0wD%Q*Tav>@NT&a^Fg");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationAnd0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationAnd", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("1vs;BV_EG!");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], expressionArray0[0]);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[1]);
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, coreOperationLessThan0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      // Undeclared exception!
      try { 
        coreOperationAnd0.computeValue(initialContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 1vs;BV_EG!
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[13];
      Expression[] expressionArray1 = new Expression[13];
      CoreFunction coreFunction0 = new CoreFunction(12, expressionArray1);
      expressionArray0[0] = (Expression) coreFunction0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationAnd0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring-before(null, null, null, null, null, null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1615, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreFunction0, coreFunction0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(nameAttributeTest0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationNegate0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1615);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeTypeTest0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(descendantContext0, 1, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationAnd0.computeValue(evalContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[13];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Object object0 = coreOperationAnd0.computeValue((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("*0wiDn%Q*T2Y>@Ta^Fg");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Object object0 = coreOperationAnd0.computeValue((EvalContext) null);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      int int0 = coreOperationAnd0.getPrecedence();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      String string0 = coreOperationAnd0.getSymbol();
      assertEquals("and", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      boolean boolean0 = coreOperationAnd0.isSymmetric();
      assertTrue(boolean0);
  }
}
