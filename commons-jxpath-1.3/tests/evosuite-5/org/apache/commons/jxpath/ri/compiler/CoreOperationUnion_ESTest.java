
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
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationUnion_ESTest extends CoreOperationUnion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant("q_)3^~q9&Bt0G");
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[1] = (Expression) variableReference0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[1]);
      Locale locale0 = Locale.ITALIAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "|", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        coreOperationUnion0.computeValue(rootContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationUnion", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      String string0 = coreOperationUnion0.getSymbol();
      assertEquals("|", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      int int0 = coreOperationUnion0.getPrecedence();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("CH4LnUz+d1<UD>rr._", "not");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) stepArray0[4]);
      Locale locale0 = new Locale("org.apache.commons.jxpath.JXPathInvalidAccessException", "b)Q.f&2o[!=`+=6");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, variableReference0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        coreOperationUnion0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: CH4LnUz+d1<UD>rr._:not
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(11, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNegate0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual0, expressionArray0, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, expressionPath0);
      // Undeclared exception!
      try { 
        coreOperationUnion0.computeValue(predicateContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: contains(org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000002 <= org.apache.commons.jxpath.ri.compiler.CoreFunction@0000000001, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("");
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAnd0;
      expressionArray0[2] = (Expression) coreOperationAnd0;
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[3] = (Expression) variableReference0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[1]);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      UnionContext unionContext0 = (UnionContext)coreOperationUnion0.computeValue(initialContext0);
      //  // Unstable assertion: assertEquals(1, unionContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      boolean boolean0 = coreOperationUnion0.isSymmetric();
      assertTrue(boolean0);
  }
}
