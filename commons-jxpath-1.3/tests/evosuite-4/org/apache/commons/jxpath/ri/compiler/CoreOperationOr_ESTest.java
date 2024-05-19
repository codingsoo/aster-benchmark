
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
import java.util.Iterator;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationOr_ESTest extends CoreOperationOr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Object object0 = coreOperationOr0.computeValue((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("\bK+Q($XNT");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue(selfContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: \bK+Q($XNT
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Expression[] expressionArray1 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(4, expressionArray1);
      expressionArray0[0] = (Expression) coreFunction0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, (NodeTest) null);
      AncestorContext ancestorContext0 = new AncestorContext(attributeContext0, false, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue(ancestorContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: id()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      VariableReference variableReference0 = new VariableReference((QName) null);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, variableReference0);
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(5314, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationMod0, coreOperationMod0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-2259), expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      QName qName0 = new QName("Vl=&nDnLGv|$ZC?", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      Iterator iterator0 = coreOperationOr0.iterate(descendantContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      boolean boolean0 = coreOperationOr0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      int int0 = coreOperationOr0.getPrecedence();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      String string0 = coreOperationOr0.getSymbol();
      assertEquals("or", string0);
  }
}
