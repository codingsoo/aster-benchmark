
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationUnion_ESTest extends CoreOperationUnion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant(6);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationAdd0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("\"key\"", "\"key\"");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
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
      CoreFunction coreFunction0 = new CoreFunction(22, expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreFunction0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreFunction0, coreOperationNotEqual0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationUnion0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: lang(org.apache.commons.jxpath.ri.compiler.CoreFunction@0000000001 >= (org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual@0000000002), null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant(6);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      coreOperationNotEqual0.args = expressionArray0;
      QName qName0 = new QName("lib");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, true, false);
      ParentContext parentContext0 = new ParentContext(childContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationUnion0.computeValue(parentContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant(1);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(nameAttributeTest0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, coreOperationNegate0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationUnion0.computeValue((EvalContext) null);
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
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName(" - no such property");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, coreOperationUnion0, (Locale) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, coreOperationUnion0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getConstantContext((Object) null);
      UnionContext unionContext0 = (UnionContext)coreOperationUnion0.computeValue(evalContext0);
      //  // Unstable assertion: assertEquals(1, unionContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      boolean boolean0 = coreOperationUnion0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      String string0 = coreOperationUnion0.getSymbol();
      assertEquals("|", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      int int0 = coreOperationUnion0.getPrecedence();
      assertEquals(7, int0);
  }
}
