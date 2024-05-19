
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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NameAttributeTest_ESTest extends NameAttributeTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Expression[] expressionArray0 = new Expression[3];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(extensionFunction0, expressionArray0[1]);
      Expression expression0 = nameAttributeTest0.getNameTestExpression();
      assertNull(expression0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Constant constant0 = new Constant(2);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      nameAttributeTest0.args = null;
      // Undeclared exception!
      try { 
        nameAttributeTest0.getNameTestExpression();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.NameAttributeTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("Rf");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      Expression[] expressionArray0 = new Expression[1];
      nameAttributeTest0.args = expressionArray0;
      // Undeclared exception!
      try { 
        nameAttributeTest0.getNameTestExpression();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.NameAttributeTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QName qName0 = new QName("JXPath: found system property");
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, coreOperationAnd0);
      boolean boolean0 = nameAttributeTest0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QName qName0 = new QName("JXPath: found system property");
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, coreOperationAnd0);
      Expression expression0 = nameAttributeTest0.getNameTestExpression();
      assertSame(coreOperationAnd0, expression0);
  }
}
