
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
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationMod_ESTest extends CoreOperationMod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constant constant0 = new Constant(6);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThanOrEqual0, constant0);
      Object object0 = coreOperationMod0.computeValue((EvalContext) null);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Long long0 = new Long(4257L);
      Constant constant0 = new Constant(long0);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationAdd0, expressionArray0[0]);
      Object object0 = coreOperationMod0.computeValue((EvalContext) null);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("rXx;G", "rXx;G");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, extensionFunction0);
      String string0 = coreOperationMod0.getSymbol();
      assertEquals("mod", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QName qName0 = new QName("rXx;G", "rXx;G");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, extensionFunction0);
      int int0 = coreOperationMod0.getPrecedence();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QName qName0 = new QName("rXx;G", "rXx;G");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, extensionFunction0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "mod");
      Object object0 = new Object();
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      AttributeContext attributeContext0 = new AttributeContext(rootContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreOperationMod0.computeValue(attributeContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: rXx;G:rXx;G
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VariableReference variableReference0 = new VariableReference((QName) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(variableReference0, variableReference0);
      // Undeclared exception!
      try { 
        coreOperationMod0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.VariableReference", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Long long0 = new Long(4257L);
      Constant constant0 = new Constant(long0);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationAdd0, expressionArray0[0]);
      coreOperationMod0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationMod0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.xpath.ri.compiler.CoreOperationMod");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(nameAttributeTest0, nameAttributeTest0);
      boolean boolean0 = coreOperationMod0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.xpath.ri.compiler.CoreOperationMod");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(nameAttributeTest0, nameAttributeTest0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, nameAttributeTest0);
      // Undeclared exception!
      try { 
        coreOperationMod0.computeValue(predicateContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }
}
