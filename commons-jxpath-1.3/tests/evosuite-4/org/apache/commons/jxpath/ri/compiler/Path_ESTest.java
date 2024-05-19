
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, coreOperationAdd0.args, stepArray0);
      EvalContext evalContext0 = expressionPath0.buildContextChain((EvalContext) null, (-4307), false);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationAdd0, (Expression) null);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Step[] stepArray0 = locationPath0.getSteps();
      assertNull(stepArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double double0 = new Double(1.0);
      Constant constant0 = new Constant(double0);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertSame(stepArray1, stepArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertEquals(0, stepArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, processingInstructionTest0);
      UnionContext unionContext0 = new UnionContext((EvalContext) null, (EvalContext[]) null);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(ancestorContext0, nodeSet0);
      Pointer pointer0 = locationPath0.getSingleNodePointerForSteps(nodeSetContext0);
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "1#");
      EvalContext[] evalContextArray0 = new EvalContext[6];
      ChildContext childContext0 = new ChildContext(evalContextArray0[2], nodeNameTest0, true, false);
      EvalContext evalContext0 = locationPath0.evalSteps(childContext0);
      assertFalse(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[7];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("nJ)Z");
      Step step0 = new Step(3887, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[2];
      stepArray0[5] = step0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      stepArray0[6] = stepArray0[4];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationAnd0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, expressionArray0[0]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(8, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[2];
      stepArray0[5] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Locale locale0 = new Locale("", "Cannot create the root object: ", "");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, stepArray0[0], locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, locationPath0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext evalContext1 = locationPath0.evalSteps(evalContext0);
      assertEquals(1, evalContext1.getDocumentOrder());
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathInvalidAccessException");
      VariableReference variableReference0 = new VariableReference(qName0);
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, variableReference0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1982));
      AttributeContext attributeContext0 = new AttributeContext(predicateContext0, nodeTypeTest0);
      ParentContext parentContext0 = new ParentContext(attributeContext0, nodeTypeTest0);
      EvalContext evalContext0 = locationPath0.evalSteps(parentContext0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("nJ)Z");
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, processingInstructionTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(ancestorContext0, 3887, processingInstructionTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant constant0 = new Constant("");
      Expression[] expressionArray0 = new Expression[2];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      Step[] stepArray0 = new Step[6];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      Step step0 = new Step((-13), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[2];
      stepArray0[4] = stepArray0[2];
      stepArray0[5] = stepArray0[1];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathInvalidAccessException");
      VariableReference variableReference0 = new VariableReference(qName0);
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Locale locale0 = Locale.JAPAN;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, variableReference0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      EvalContext evalContext1 = locationPath0.buildContextChain(evalContext0, Integer.MIN_VALUE, false);
      assertSame(evalContext1, evalContext0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathInvalidAccessException");
      VariableReference variableReference0 = new VariableReference(qName0);
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, variableReference0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(predicateContext0, processingInstructionTest0, true);
      ChildContext childContext0 = new ChildContext(precedingOrFollowingContext0, processingInstructionTest0, false, false);
      EvalContext evalContext0 = locationPath0.buildContextChain(childContext0, 3204, false);
      assertEquals(1, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[1];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(selfContext0, nodeTypeTest0);
      AncestorContext ancestorContext0 = new AncestorContext(namespaceContext0, true, nodeTypeTest0);
      EvalContext evalContext0 = expressionPath0.buildContextChain(ancestorContext0, 0, false);
      assertSame(ancestorContext0, evalContext0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationOr0, coreOperationUnion0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationLessThan0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(predicateContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.isSimpleStep((Step) null);
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
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName("wZQ<t-6Y$4`S");
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationAdd0, (Expression) null);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[7]);
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, expressionArray0[7], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2296));
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        expressionPath0.getSingleNodePointerForSteps(namespaceContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationOr0, expressionArray0[0]);
      Step[] stepArray0 = new Step[5];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        expressionPath0.createContextForStep(parentContext0, (-1503), nodeNameTest0);
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
      Constant constant0 = new Constant("we?h#Au.7|OXo");
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      expressionArray0[2] = (Expression) constant0;
      expressionArray0[3] = (Expression) constant0;
      expressionArray0[4] = (Expression) constant0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[5] = (Expression) coreOperationUnion0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, coreOperationOr0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationGreaterThanOrEqual0, expressionArray0[1]);
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      // Undeclared exception!
      expressionPath0.computeContextDependent();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(8);
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationUnion0;
      Step step0 = new Step(8, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.computeContextDependent();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Constant constant0 = new Constant("");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1780);
      Step step0 = new Step(16000, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      stepArray0[3] = stepArray0[2];
      stepArray0[4] = step0;
      stepArray0[5] = stepArray0[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain((EvalContext) null, 9, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationNotEqual0, coreOperationNotEqual0);
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.areBasicPredicates(expressionArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Constant constant0 = new Constant("");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1780);
      Step step0 = new Step(16000, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      Step step1 = new Step(12, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain((EvalContext) null, 9, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[13];
      Step step0 = new Step(9, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3043));
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      Step step1 = new Step(6, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) step1);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, step1, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(rootContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.Path");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 5, nodeNameTest0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(8, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[1];
      Step step1 = new Step(4, nodeNameTest0, expressionArray0);
      stepArray0[4] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Locale locale0 = new Locale("", "Cannot create the root object: ", "");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, step0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, locationPath0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        locationPath0.evalSteps(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("-");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(3, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[2];
      Step step1 = new Step(2, nodeTypeTest0, expressionArray0);
      stepArray0[5] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(selfContext0, nodeTypeTest0);
      AncestorContext ancestorContext0 = new AncestorContext(namespaceContext0, true, nodeTypeTest0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain(ancestorContext0, 873, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Expression[] expressionArray0 = new Expression[6];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "1#");
      EvalContext[] evalContextArray0 = new EvalContext[6];
      EvalContext evalContext0 = expressionPath0.createContextForStep(evalContextArray0[0], 1, nodeNameTest0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathInvalidAccessException");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      Locale locale0 = Locale.JAPAN;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      BeanPointer beanPointer0 = (BeanPointer)expressionPath0.searchForPath(rootContext0);
      assertFalse(beanPointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeTypeTest0, false);
      // Undeclared exception!
      try { 
        expressionPath0.getSingleNodePointerForSteps(precedingOrFollowingContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathInvalidAccessException");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[2];
      expressionArray0[0] = (Expression) variableReference0;
      expressionArray0[1] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      Locale locale0 = Locale.JAPAN;
      BasicVariables basicVariables0 = new BasicVariables();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn(locale0, locale0).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((JXPathContext) null).when(jXPathContextReferenceImpl0).getParentContext();
      doReturn(basicVariables0).when(jXPathContextReferenceImpl0).getVariables();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, variableReference0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      Object object0 = expressionPath0.computeValue(evalContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(8, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      stepArray0[3] = stepArray0[2];
      stepArray0[4] = stepArray0[1];
      stepArray0[5] = stepArray0[3];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = new Expression[2];
      expressionArray1[0] = (Expression) expressionPath0;
      expressionArray1[1] = (Expression) constant0;
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Expression[] expressionArray0 = new Expression[6];
      expressionArray0[0] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      Expression[] expressionArray0 = new Expression[7];
      Short short0 = new Short((short) (-1716));
      Constant constant0 = new Constant(short0);
      expressionArray0[0] = (Expression) constant0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, expressionArray0[0]);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.areBasicPredicates(expressionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("R<vR+A<JF!", "R<vR+A<JF!");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[1];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(extensionFunction0, extensionFunction0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Constant constant0 = new Constant("}");
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) constant0;
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      Expression[] expressionArray0 = new Expression[0];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, (Step[]) null);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates((Expression[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("R<vR+A<JF!", "R<vR+A<JF!");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.isSimplePath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Constant constant0 = new Constant("}");
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Step step0 = new Step(2, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, coreOperationAdd0.args, stepArray0);
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
  public void test48()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Expression[] expressionArray0 = new Expression[6];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "1#");
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, coreOperationAdd0.args, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(8, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      expressionPath0.isSimpleExpressionPath();
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("R<vR+A<JF!", "R<vR+A<JF!");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[1];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(extensionFunction0, extensionFunction0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }
}
