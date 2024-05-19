
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
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
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
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, (Step[]) null);
      Step[] stepArray0 = expressionPath0.getSteps();
      assertNull(stepArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("eEd#=d4X_3yW@B`");
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[4];
      Double double0 = Double.valueOf((double) (-1));
      Constant constant0 = new Constant(double0);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(extensionFunction0, constant0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertSame(stepArray1, stepArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) locationPath0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BeanPointer beanPointer0 = (BeanPointer)locationPath0.getSingleNodePointerForSteps(initialContext0);
      assertNull(beanPointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationOr0, locationPath0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, expressionArray0[4]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      EvalContext evalContext0 = expressionPath0.evalSteps(nodeSetContext0);
      assertSame(nodeSetContext0, evalContext0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1769);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 2, nodeTypeTest0);
      //  // Unstable assertion: assertEquals(1, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[8];
      Step step0 = new Step(5, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Step step1 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step1;
      stepArray0[4] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      DescendantContext descendantContext0 = new DescendantContext(parentContext0, false, nodeTypeTest0);
      EvalContext evalContext0 = locationPath0.buildContextChain(descendantContext0, 5, false);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationOr0, locationPath0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, expressionArray0[4]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      EvalContext evalContext0 = expressionPath0.buildContextChain(nodeSetContext0, (-1653), false);
      assertFalse(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[3];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(attributeContext0, nodeNameTest0, false);
      EvalContext evalContext0 = expressionPath0.buildContextChain(precedingOrFollowingContext0, (-1956), false);
      assertEquals(1, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[3];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(attributeContext0, nodeNameTest0, true);
      EvalContext evalContext0 = expressionPath0.buildContextChain(precedingOrFollowingContext0, (-1956), false);
      assertSame(evalContext0, precedingOrFollowingContext0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[2];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, (Step[]) null);
      // Undeclared exception!
      try { 
        expressionPath0.isSimplePath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationUnion");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.CoreOperationUnion");
      Expression[] expressionArray0 = new Expression[2];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[1], expressionArray0, stepArray0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(attributeContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, (Step[]) null);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, variableReference0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(predicateContext0, basicNodeSet0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "G%Xi8k>zzgD9[");
      // Undeclared exception!
      try { 
        expressionPath0.createContextForStep(nodeSetContext0, 1997, nodeNameTest0);
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
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAdd0;
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationOr0, locationPath0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, expressionArray0[4]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
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
  public void test15()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("No such function: ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "No such function: ");
      Step step0 = new Step(2, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = stepArray0[2];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain(initialContext0, 25, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAnd0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.areBasicPredicates(expressionArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(variableReference0, variableReference0);
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[9];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(45);
      Step step0 = new Step(45, nodeTypeTest0, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      expressionPath0.isSimpleExpressionPath();
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MAX_VALUE, expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThan0, coreFunction0);
      Step step0 = new Step(13, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(locationPath0, expressionArray0[2]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationNotEqual0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(coreFunction0);
      // Undeclared exception!
      try { 
        expressionPath0.getSingleNodePointerForSteps(initialContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[26];
      Step step0 = new Step(5, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(12);
      Step step1 = new Step(12, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      DescendantContext descendantContext0 = new DescendantContext(parentContext0, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(descendantContext0, 5, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[8];
      Step step0 = new Step(5, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(11);
      Step step1 = new Step(11, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      DescendantContext descendantContext0 = new DescendantContext(parentContext0, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(descendantContext0, 5, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(17);
      Step step0 = new Step(17, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[1];
      stepArray0[3] = stepArray0[2];
      Step step1 = new Step(10, nodeTypeTest0, expressionArray0);
      stepArray0[4] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.evalSteps((EvalContext) null);
      assertNotNull(evalContext0);
      assertEquals(1, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1131));
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, true, true);
      UnionContext unionContext0 = new UnionContext(childContext0, (EvalContext[]) null);
      EvalContext evalContext0 = locationPath0.createContextForStep(unionContext0, 3, nodeTypeTest0);
      assertEquals((-1), evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, (Step[]) null);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, (-1838), nodeNameTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, processingInstructionTest0);
      locationPath0.getSingleNodePointerForSteps(attributeContext0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(nodeSetContext0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[9];
      Constant constant0 = new Constant((Number) null);
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(locationPath0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(locationPath0, coreOperationNegate0);
      Expression[] expressionArray0 = new Expression[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = new Expression[2];
      expressionArray1[0] = (Expression) expressionPath0;
      QName qName0 = new QName("(org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001 != org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000002)[null][org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001 != org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000002][org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001 != org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000002][-org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001][][org.apache.commons.jxpath.ri.compiler.ExpressionPath@0000000007 div (org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual@0000000003)][-org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001]", "o3$");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray1);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) constant0;
      Step[] stepArray0 = new Step[8];
      Expression[] expressionArray1 = new Expression[3];
      expressionArray1[0] = (Expression) constant0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[3], expressionArray0[0]);
      expressionArray1[1] = (Expression) nameAttributeTest0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.areBasicPredicates(expressionArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Expression[] expressionArray1 = new Expression[4];
      Constant constant0 = new Constant("");
      expressionArray1[0] = (Expression) constant0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray1[0], constant0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, coreOperationMultiply0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationLessThan0);
      expressionArray0[0] = (Expression) coreOperationNegate0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray1, (Step[]) null);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = new Expression[0];
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.areBasicPredicates((Expression[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("YM[6]4]e|1(t!&\u0002?:", ", 2jf13x@4L'vC2:");
      Expression[] expressionArray0 = new Expression[0];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, extensionFunction0);
      Expression[] expressionArray1 = new Expression[0];
      Step[] stepArray0 = new Step[26];
      Step step0 = new Step(5, (NodeTest) null, expressionArray1);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray1, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(stepArray0[0]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(locationPath0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(locationPath0, coreOperationNegate0);
      Expression[] expressionArray0 = new Expression[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      QName qName0 = new QName("(org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001 != org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000002)[org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001 != org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000002][org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001 != org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000002][org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001 != org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000002][-org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001][][org.apache.commons.jxpath.ri.compiler.ExpressionPath@0000000007 div (org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual@0000000003)][-org.apache.commons.jxpath.ri.compiler.LocationPath@0000000001]", "o3$");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleStep(step0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
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
  public void test34()  throws Throwable  {
      VariableReference variableReference0 = new VariableReference((QName) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationNegate0, coreOperationNegate0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationNegate0, coreOperationGreaterThanOrEqual0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationSubtract0, coreOperationSubtract0);
      Expression[] expressionArray0 = new Expression[8];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("w");
      Step step0 = new Step(1, processingInstructionTest0, expressionArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(locationPath0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(locationPath0, coreOperationNegate0);
      Expression[] expressionArray0 = new Expression[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("#)<FS3(dQ#tE=Vq3Y ", "ph-d0R0");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "#)<FS3(dQ#tE=Vq3Y ");
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant("sPbjJMYHvZ5AnmCtc,");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationLessThan0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(expressionArray0[0], constant0);
      expressionArray0[2] = (Expression) coreOperationLessThanOrEqual0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, constant0);
      expressionArray0[3] = (Expression) nameAttributeTest0;
      Step step0 = new Step((-4600), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[3];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
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
  public void test39()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationOr0, locationPath0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, expressionArray0[4]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertSame(stepArray0, stepArray1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.evalSteps((EvalContext) null);
      assertNull(evalContext0);
  }
}
