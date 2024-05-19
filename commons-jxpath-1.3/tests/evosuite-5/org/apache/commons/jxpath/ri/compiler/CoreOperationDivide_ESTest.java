
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
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationDivide_ESTest extends CoreOperationDivide_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction((-564), expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreFunction0, coreFunction0);
      Object object0 = coreOperationDivide0.computeValue((EvalContext) null);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      QName qName0 = new QName("string-length", "@^&=Y");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, variableReference0);
      Integer integer0 = new Integer(2055);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, fileSystemHandling0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: string-length:@^&=Y
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("84y8L$]M'E");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(extensionFunction0, extensionFunction0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationMultiply0, extensionFunction0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationEqual0, coreOperationMultiply0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) extensionFunction0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(initialContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: 84y8L$]M'E
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[2], (Expression) null);
      Constant constant0 = new Constant("");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[2], constant0);
      CoreFunction coreFunction0 = new CoreFunction((-616), expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreFunction0, coreOperationGreaterThan0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMultiply0, coreOperationMod0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(attributeContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMod0, constant0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue((EvalContext) null);
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
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      Object object0 = coreOperationDivide0.compute((EvalContext) null);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      int int0 = coreOperationDivide0.getPrecedence();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      boolean boolean0 = coreOperationDivide0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      String string0 = coreOperationDivide0.getSymbol();
      assertEquals("div", string0);
  }
}
