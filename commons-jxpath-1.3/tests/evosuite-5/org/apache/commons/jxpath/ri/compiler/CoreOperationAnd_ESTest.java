
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
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationAnd_ESTest extends CoreOperationAnd_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("\"|.E.d\"BDfi=g");
      Expression[] expressionArray1 = new Expression[7];
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(variableReference0, variableReference0);
      expressionArray1[0] = (Expression) coreOperationSubtract0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray1);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray1);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, coreOperationAdd0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, coreOperationAdd0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      // Undeclared exception!
      try { 
        coreOperationAnd0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: \"|.E.d\"BDfi=g
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Float float0 = new Float(0.0);
      Constant constant0 = new Constant(float0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationEqual0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationSubtract0, constant0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAdd0;
      Step[] stepArray0 = new Step[7];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.CoreOperationAnd");
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, stepArray0[1]);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      // Undeclared exception!
      coreOperationAnd0.computeValue(initialContext0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
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
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      nameAttributeTest0.args = expressionArray0;
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationAnd0.computeValue(ancestorContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction((-459), expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[7];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step((-686), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = stepArray0[1];
      stepArray0[4] = stepArray0[3];
      stepArray0[5] = stepArray0[1];
      stepArray0[6] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[1]);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, stepArray0[3]);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      PredicateContext predicateContext0 = (PredicateContext)expressionPath0.evalSteps(rootContext0);
      // Undeclared exception!
      try { 
        coreOperationAnd0.computeValue(predicateContext0);
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
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Object object0 = coreOperationAnd0.computeValue((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("4.'JGAmVoeJTC]&:S+x");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Object object0 = coreOperationAnd0.compute((EvalContext) null);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      int int0 = coreOperationAnd0.getPrecedence();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      String string0 = coreOperationAnd0.getSymbol();
      assertEquals("and", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      boolean boolean0 = coreOperationAnd0.isSymmetric();
      assertTrue(boolean0);
  }
}
