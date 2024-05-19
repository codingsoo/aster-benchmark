
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
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationMultiply_ESTest extends CoreOperationMultiply_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QName qName0 = new QName("+gZEa#0G_$b4K1r\"5li", (String) null);
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(variableReference0, variableReference0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, variableReference0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variableReference0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-151));
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeTypeTest0);
      BasicNodeSet basicNodeSet0 = (BasicNodeSet)namespaceContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(initialContext0, basicNodeSet0);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue(nodeSetContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: +gZEa#0G_$b4K1r\"5li:null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Constant constant0 = new Constant(2);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationGreaterThanOrEqual0, constant0);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) coreOperationEqual0;
      coreOperationEqual0.args = expressionArray0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationEqual0, constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationMultiply0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply@0000000004 - (org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual@0000000002)");
      Locale locale0 = Locale.forLanguageTag("org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply@0000000004 - (org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual@0000000002)");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "*", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue(selfContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1797), expressionArray0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[0], coreFunction0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationUnion0, coreOperationGreaterThan0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationSubtract0, coreOperationSubtract0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationLessThanOrEqual0, coreOperationGreaterThan0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreFunction0);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationUnion", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreFunction0, coreFunction0);
      coreOperationMultiply0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Constant constant0 = new Constant("vga9w~");
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      int int0 = coreOperationMultiply0.getPrecedence();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Constant constant0 = new Constant("vga9w~");
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      boolean boolean0 = coreOperationMultiply0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Constant constant0 = new Constant("vga9w~");
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      String string0 = coreOperationMultiply0.getSymbol();
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Constant constant0 = new Constant("vga9w~");
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      Object object0 = coreOperationMultiply0.computeValue((EvalContext) null);
      assertEquals(Double.NaN, object0);
  }
}
