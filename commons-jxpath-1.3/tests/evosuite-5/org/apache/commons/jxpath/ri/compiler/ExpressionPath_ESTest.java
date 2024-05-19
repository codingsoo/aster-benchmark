
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
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExpressionPath_ESTest extends ExpressionPath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, (Expression[]) null, stepArray0);
      Expression[] expressionArray0 = expressionPath0.getPredicates();
      assertNull(expressionArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("E3Mk7(i4oC4V`4,");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[8];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = expressionPath0.getPredicates();
      assertSame(expressionArray1, expressionArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      Expression expression0 = expressionPath0.getExpression();
      assertNull(expression0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Short short0 = new Short((short)2);
      Constant constant0 = new Constant(short0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(nameAttributeTest0);
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Step step0 = new Step((short)2, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      QName qName0 = new QName((String) null, "b[w9q");
      stepArray0[1] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nameAttributeTest0);
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, processingInstructionTest0);
      Object object0 = expressionPath0.expressionPath(ancestorContext0, true);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      UnionContext unionContext0 = (UnionContext)expressionPath0.expressionPath(rootContext0, false);
      assertFalse(unionContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationEqual0, coreOperationEqual0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationDivide0, coreOperationDivide0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[7];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(64, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[0];
      stepArray0[5] = stepArray0[1];
      stepArray0[6] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[1]);
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, expressionArray0[0], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      PredicateContext predicateContext0 = (PredicateContext)expressionPath0.compute(initialContext0);
      assertEquals(0, predicateContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationOr0, coreOperationOr0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAdd0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, expressionArray0[5]);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(nameAttributeTest0, coreOperationGreaterThanOrEqual0);
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(40);
      Expression[] expressionArray1 = new Expression[9];
      CoreFunction coreFunction0 = new CoreFunction(40, expressionArray1);
      expressionArray1[8] = (Expression) coreFunction0;
      Step step0 = new Step(40, nodeTypeTest0, expressionArray1);
      stepArray0[1] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      // Undeclared exception!
      expressionPath0.toString();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationUnion0;
      Step[] stepArray0 = new Step[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationOr0, expressionArray0[6]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleExpressionPath();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("4u273)lVKCNaX");
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, processingInstructionTest0);
      // Undeclared exception!
      try { 
        expressionPath0.expressionPath(descendantContext0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExpressionPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(1050, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, coreFunction0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, coreFunction0);
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1978);
      Expression[] expressionArray1 = new Expression[0];
      Step step0 = new Step((-3763), nodeTypeTest0, expressionArray1);
      coreOperationMultiply0.args = expressionArray1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[1]);
      QName qName0 = new QName("(org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply@0000000002 mod org.apache.commons.jxpath.ri.compiler.CoreFunction@0000000001)[null][null]/UNKNOWN::UNKNOWN()/UNKNOWN::UNKNOWN()/UNKNOWN::UNKNOWN()[null][null]/UNKNOWN::UNKNOWN()[null][null]/UNKNOWN::UNKNOWN()", "UNKNOWN::UNKNOWN()[null][null]");
      Locale locale0 = new Locale("/");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, step0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        expressionPath0.expressionPath(rootContext0, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[15];
      CoreFunction coreFunction0 = new CoreFunction(6, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[1], expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: namespace-uri(null, -org.apache.commons.jxpath.ri.compiler.CoreFunction@0000000001, null, null, null, null, null, null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(1050, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, coreFunction0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, coreFunction0);
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray1 = new Expression[0];
      coreOperationMultiply0.args = expressionArray1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant("");
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationSubtract0, coreOperationSubtract0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, coreOperationMod0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationMultiply0, coreOperationSubtract0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationOr0, coreOperationOr0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(initialContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAdd0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationOr0, coreOperationOr0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationGreaterThan0, expressionArray0[0]);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationDivide0, coreOperationOr0);
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeContextDependent();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[15];
      CoreFunction coreFunction0 = new CoreFunction(6, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[1], expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.compute((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: namespace-uri(null, -org.apache.commons.jxpath.ri.compiler.CoreFunction@0000000001, null, null, null, null, null, null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationAdd0, coreOperationAdd0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationAdd0, expressionArray0[0]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, (Step[]) null);
      // Undeclared exception!
      try { 
        expressionPath0.compute((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(1050, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, coreFunction0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, coreFunction0);
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray1 = new Expression[0];
      coreOperationMultiply0.args = expressionArray1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.compute((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(1050, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, coreFunction0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, coreFunction0);
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = expressionPath0.getPredicates();
      assertSame(expressionArray1, expressionArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Float float0 = new Float(0.0F);
      Constant constant0 = new Constant(float0);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(64);
      Step step0 = new Step(64, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) stepArray0[2]);
      QName qName0 = new QName("UNKNOWN::UNKNOWN()[0][0]");
      Locale locale0 = Locale.FRENCH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, stepArray0[0], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeTypeTest0);
      ChildContext childContext0 = (ChildContext)expressionPath0.createContextForStep(descendantContext0, 2, nodeTypeTest0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathTypeConversionException", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[1]);
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, expressionArray0[0], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      // Undeclared exception!
      try { 
        expressionPath0.compute(initialContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      String string0 = expressionPath0.toString();
      assertEquals("(/null/null/null/null/null)/null/null/null/null/null", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, (Step[]) null);
      String string0 = expressionPath0.toString();
      assertEquals("null[null][null][null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationEqual0, coreOperationEqual0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationDivide0, coreOperationDivide0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, (Expression[]) null, stepArray0);
      String string0 = expressionPath0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.ExpressionPath", "org.apache.commons.jxpath.ri.compiler.ExpressionPath");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, extensionFunction0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      Step[] stepArray0 = new Step[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Float float0 = new Float(0.0F);
      Constant constant0 = new Constant(float0);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(64);
      Step step0 = new Step(64, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      expressionPath0.isSimpleExpressionPath();
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Float float0 = new Float(0.0F);
      Constant constant0 = new Constant(float0);
      Expression[] expressionArray0 = new Expression[2];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(1050, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, coreFunction0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, coreFunction0);
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      CoreOperationMod coreOperationMod1 = (CoreOperationMod)expressionPath0.getExpression();
      assertEquals("mod", coreOperationMod1.getSymbol());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      Object object0 = expressionPath0.computeValue(rootContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, (Expression) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleExpressionPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }
}
