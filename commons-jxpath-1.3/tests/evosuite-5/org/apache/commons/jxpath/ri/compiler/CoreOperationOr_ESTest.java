
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
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationOr_ESTest extends CoreOperationOr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, stepArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionPath0, coreOperationAdd0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue(attributeContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[0], constant0);
      expressionArray0[2] = (Expression) coreOperationSubtract0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[1], expressionArray0[2]);
      expressionArray0[3] = (Expression) nameAttributeTest0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Expression[] expressionArray1 = new Expression[0];
      nameAttributeTest0.args = expressionArray1;
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant((Number) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationDivide0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationLessThanOrEqual0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationNotEqual0, coreOperationDivide0);
      expressionArray0[0] = (Expression) coreOperationMod0;
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
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[0], constant0);
      expressionArray0[2] = (Expression) coreOperationSubtract0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[1], expressionArray0[2]);
      expressionArray0[3] = (Expression) nameAttributeTest0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-90));
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      Iterator iterator0 = coreOperationOr0.iterate(namespaceContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationOr0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Object object0 = coreOperationOr0.computeValue((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      boolean boolean0 = coreOperationOr0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      int int0 = coreOperationOr0.getPrecedence();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      String string0 = coreOperationOr0.getSymbol();
      assertEquals("or", string0);
  }
}
