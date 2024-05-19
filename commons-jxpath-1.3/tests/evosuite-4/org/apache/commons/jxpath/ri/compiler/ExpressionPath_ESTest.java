
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExpressionPath_ESTest extends ExpressionPath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant constant0 = new Constant("");
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, locationPath0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, coreOperationLessThanOrEqual0);
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = expressionPath0.getPredicates();
      assertSame(expressionArray0, expressionArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationAnd0, coreOperationAnd0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThanOrEqual0, coreOperationAnd0);
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = expressionPath0.getPredicates();
      assertSame(expressionArray0, expressionArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, (Step[]) null);
      CoreOperationUnion coreOperationUnion1 = (CoreOperationUnion)expressionPath0.getExpression();
      assertEquals("|", coreOperationUnion1.getSymbol());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(342);
      Expression[] expressionArray0 = new Expression[3];
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[1];
      stepArray0[4] = stepArray0[1];
      stepArray0[5] = stepArray0[2];
      stepArray0[6] = stepArray0[2];
      stepArray0[7] = stepArray0[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, step0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = (PredicateContext)expressionPath0.expressionPath(evalContext0, false);
      assertEquals(0, predicateContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("contains");
      Step[] stepArray0 = new Step[5];
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      expressionArray0[1] = (Expression) constant0;
      expressionArray0[2] = (Expression) constant0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, expressionArray0[1]);
      expressionArray0[3] = (Expression) coreOperationSubtract0;
      expressionArray0[4] = (Expression) extensionFunction0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[5] = (Expression) coreOperationOr0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray0[4], expressionArray0[3]);
      expressionArray0[6] = (Expression) coreOperationEqual0;
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
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
  public void test06()  throws Throwable  {
      Constant constant0 = new Constant("");
      Expression[] expressionArray0 = new Expression[9];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, (Step[]) null);
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

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(6, expressionArray0);
      Step[] stepArray0 = new Step[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3158);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        expressionPath0.expressionPath(parentContext0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: namespace-uri(null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(30, (Expression[]) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreFunction0, coreFunction0);
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, (Expression[]) null, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: format-number()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, coreOperationMultiply0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationMod0, coreOperationMod0);
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("Cannot create the root object: ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Cannot create the root object: ");
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, true);
      PredicateContext predicateContext0 = new PredicateContext(precedingOrFollowingContext0, expressionArray0[7]);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(predicateContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationAdd0, coreOperationAdd0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, (Step[]) null);
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
  public void test11()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(30, (Expression[]) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreFunction0, coreFunction0);
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, (Expression[]) null, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.compute((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: format-number()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("v7R-Gvy", "v7R-Gvy");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(6, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, (Step[]) null);
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
  public void test13()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      DescendantContext descendantContext0 = new DescendantContext(namespaceContext0, false, (NodeTest) null);
      AncestorContext ancestorContext0 = new AncestorContext(descendantContext0, true, (NodeTest) null);
      ChildContext childContext0 = new ChildContext(ancestorContext0, (NodeTest) null, false, true);
      // Undeclared exception!
      try { 
        expressionPath0.compute(childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, coreOperationMultiply0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationMod0, coreOperationMod0);
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      EvalContext[] evalContextArray0 = new EvalContext[6];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      try { 
        expressionPath0.compute(unionContext0);
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
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, (Expression[]) null, stepArray0);
      Expression[] expressionArray0 = expressionPath0.getPredicates();
      assertNull(expressionArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(342);
      Expression[] expressionArray0 = new Expression[3];
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[1];
      stepArray0[5] = stepArray0[3];
      stepArray0[6] = step0;
      stepArray0[7] = stepArray0[5];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, stepArray0[0], (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        expressionPath0.expressionPath(evalContext0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      QName qName0 = new QName("UNKNOWN::UNKNOWN()", "mh,u^bF");
      VariableReference variableReference0 = new VariableReference(qName0);
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "UNKNOWN::UNKNOWN()", (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Float float0 = new Float((-2018.5));
      Constant constant0 = new Constant(float0);
      Expression[] expressionArray0 = new Expression[6];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, (Step[]) null);
      String string0 = expressionPath0.toString();
      assertEquals("-2018.5[null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      String string0 = expressionPath0.toString();
      assertEquals("(/null/null/null/null/null/null/null)/null/null/null/null/null/null/null", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Long long0 = new Long(910L);
      Constant constant0 = new Constant(long0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThan0, coreOperationGreaterThan0);
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Step step0 = new Step(377, nodeTypeTest0, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, (Expression[]) null, stepArray0);
      expressionPath0.isSimpleExpressionPath();
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Constant constant0 = new Constant("");
      QName qName0 = new QName("", "");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      expressionPath0.isSimpleExpressionPath();
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeTypeTest0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(descendantContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Long long0 = new Long(910L);
      Constant constant0 = new Constant(long0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThan0, coreOperationGreaterThan0);
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      QName qName0 = new QName((String) null, (String) null);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[2] = (Expression) extensionFunction0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Float float0 = new Float((-2018.5));
      Constant constant0 = new Constant(float0);
      Expression[] expressionArray0 = new Expression[6];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      expressionArray0[2] = (Expression) constant0;
      expressionArray0[3] = (Expression) constant0;
      expressionArray0[4] = (Expression) constant0;
      expressionArray0[5] = (Expression) constant0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, (Step[]) null);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Long long0 = new Long(910L);
      Constant constant0 = new Constant(long0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThan0, coreOperationGreaterThan0);
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExpressionPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("wPOcT7YMMK.", "wPOcT7YMMK.");
      Expression[] expressionArray0 = new Expression[7];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Constant constant0 = new Constant("");
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, (Expression[]) null, stepArray0);
      Expression expression0 = expressionPath0.getExpression();
      assertNull(expression0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Constant constant0 = new Constant("");
      QName qName0 = new QName("", "");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)expressionPath0.compute(rootContext0);
      assertEquals(0, initialContext0.getDocumentOrder());
  }
}
