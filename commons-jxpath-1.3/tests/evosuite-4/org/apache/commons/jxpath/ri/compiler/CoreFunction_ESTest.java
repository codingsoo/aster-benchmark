
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
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
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreFunction_ESTest extends CoreFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1564, (Expression[]) null);
      assertEquals(1564, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      EvalContext[] evalContextArray0 = new EvalContext[2];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      assertEquals(0, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertNotNull(unionContext0);
      assertEquals(2, evalContextArray0.length);
      
      Object object0 = coreFunction0.functionPosition(unionContext0);
      assertEquals(0, object0);
      assertEquals(1564, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertNotNull(object0);
      assertEquals(2, evalContextArray0.length);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("+A_\"<GdYKRYKwE}");
      assertEquals("+A_\"<GdYKRYKwE}", processingInstructionTest0.getTarget());
      assertNotNull(processingInstructionTest0);
      
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, processingInstructionTest0);
      assertEquals("+A_\"<GdYKRYKwE}", processingInstructionTest0.getTarget());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getPosition());
      assertNotNull(descendantContext0);
      
      Object object0 = coreFunction0.functionTrue(descendantContext0);
      assertEquals(true, object0);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals("+A_\"<GdYKRYKwE}", processingInstructionTest0.getTarget());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getPosition());
      assertNotNull(object0);
      assertEquals(0, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(14, expressionArray0);
      assertEquals(14, coreFunction0.getFunctionCode());
      assertEquals(3, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(3, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      assertEquals((-1), coreFunction0.getFunctionCode());
      assertEquals(1, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      Step[] stepArray0 = new Step[9];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1));
      assertEquals((-1), nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      Step step0 = new Step((-1), nodeTypeTest0, expressionArray0);
      assertEquals((-1), nodeTypeTest0.getNodeType());
      assertEquals((-1), step0.getAxis());
      assertNotNull(step0);
      assertEquals(1, expressionArray0.length);
      
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[1];
      stepArray0[5] = stepArray0[2];
      stepArray0[6] = stepArray0[1];
      stepArray0[7] = step0;
      stepArray0[8] = stepArray0[2];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[0], expressionArray0, stepArray0);
      assertNotNull(expressionPath0);
      assertEquals(1, expressionArray0.length);
      assertEquals(9, stepArray0.length);
      
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      assertEquals((-1), nodeTypeTest0.getNodeType());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertEquals(0, namespaceContext0.getPosition());
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertNotNull(namespaceContext0);
      
      ChildContext childContext0 = new ChildContext(namespaceContext0, nodeTypeTest0, false, false);
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals((-1), nodeTypeTest0.getNodeType());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertEquals(0, namespaceContext0.getPosition());
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertNotNull(childContext0);
      
      EvalContext evalContext0 = expressionPath0.evalSteps(childContext0);
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals(0, evalContext0.getPosition());
      assertEquals(0, evalContext0.getDocumentOrder());
      assertFalse(evalContext0.isChildOrderingRequired());
      assertEquals((-1), nodeTypeTest0.getNodeType());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertEquals(0, namespaceContext0.getPosition());
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertNotNull(evalContext0);
      assertEquals(1, expressionArray0.length);
      assertEquals(9, stepArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-2718), expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals((-2718), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertEquals(0, initialContext0.getPosition());
      assertNotNull(initialContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI(initialContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(3090, expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals(3090, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionName((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Double double0 = new Double(0.0);
      assertEquals(0.0, (double)double0, 0.01);
      assertNotNull(double0);
      
      Constant constant0 = new Constant(double0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertNotNull(constant0);
      
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(208, expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals(208, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionLang((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Double double0 = new Double(0.0);
      assertEquals(0.0, (double)double0, 0.01);
      assertNotNull(double0);
      
      Constant constant0 = new Constant(double0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertNotNull(constant0);
      
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(208, expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals(208, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionID((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(34, expressionArray0);
      assertEquals(34, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      Object object0 = coreFunction0.functionFalse((EvalContext) null);
      assertEquals(false, object0);
      assertEquals(34, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(object0);
      assertEquals(0, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      String string0 = coreFunction0.getFunctionName();
      assertEquals("unknownFunction0()", string0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      int int0 = coreFunction0.getFunctionCode();
      assertEquals(0, int0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction((-201), expressionArray0);
      assertEquals(5, coreFunction0.getArgumentCount());
      assertEquals((-201), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(5, expressionArray0.length);
      
      int int0 = coreFunction0.getFunctionCode();
      assertEquals((-201), int0);
      assertEquals(5, coreFunction0.getArgumentCount());
      assertEquals((-201), coreFunction0.getFunctionCode());
      assertEquals(5, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      assertEquals(1, coreFunction0.getFunctionCode());
      assertEquals(2, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      int int0 = coreFunction0.getArgumentCount();
      assertEquals(2, int0);
      assertEquals(1, coreFunction0.getFunctionCode());
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(2, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.LocationPath");
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertNotNull(constant0);
      
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertNotNull(coreOperationNotEqual0);
      
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNotEqual0, constant0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      assertNotNull(coreOperationGreaterThan0);
      
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationGreaterThan0, coreOperationNotEqual0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertNotNull(coreOperationLessThanOrEqual0);
      
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, coreOperationGreaterThan0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertEquals("<", coreOperationLessThan0.getSymbol());
      assertNotNull(coreOperationLessThan0);
      
      expressionArray0[2] = (Expression) coreOperationLessThan0;
      CoreFunction coreFunction0 = new CoreFunction(30, expressionArray0);
      assertEquals(30, coreFunction0.getFunctionCode());
      assertEquals(3, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(3, expressionArray0.length);
      
      CoreOperationLessThan coreOperationLessThan1 = (CoreOperationLessThan)coreFunction0.getArg3();
      assertSame(coreOperationLessThan1, coreOperationLessThan0);
      assertEquals(30, coreFunction0.getFunctionCode());
      assertEquals(3, coreFunction0.getArgumentCount());
      assertEquals("<", coreOperationLessThan1.getSymbol());
      assertNotNull(coreOperationLessThan1);
      assertEquals(3, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      assertEquals((-1), coreFunction0.getFunctionCode());
      assertEquals(2, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      Expression expression0 = coreFunction0.getArg2();
      assertEquals((-1), coreFunction0.getFunctionCode());
      assertEquals(2, coreFunction0.getArgumentCount());
      assertNull(expression0);
      assertEquals(2, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertNotNull(coreOperationAdd0);
      assertEquals(2, expressionArray0.length);
      
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[0], coreOperationAdd0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertNotNull(coreOperationNotEqual0);
      assertEquals(2, expressionArray0.length);
      
      expressionArray0[1] = (Expression) coreOperationNotEqual0;
      CoreFunction coreFunction0 = new CoreFunction((-75), expressionArray0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals((-75), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      CoreOperationNotEqual coreOperationNotEqual1 = (CoreOperationNotEqual)coreFunction0.getArg2();
      assertSame(coreOperationNotEqual1, coreOperationNotEqual0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals((-75), coreFunction0.getFunctionCode());
      assertEquals("!=", coreOperationNotEqual1.getSymbol());
      assertNotNull(coreOperationNotEqual1);
      assertEquals(2, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Short short0 = new Short((short)1673);
      assertEquals((short)1673, (short)short0);
      assertNotNull(short0);
      
      Constant constant0 = new Constant(short0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertNotNull(constant0);
      
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertNotNull(coreOperationNotEqual0);
      
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreFunction coreFunction0 = new CoreFunction(21, expressionArray0);
      assertEquals(21, coreFunction0.getFunctionCode());
      assertEquals(1, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      QName qName0 = new QName("false");
      assertEquals("false", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("false", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "/`0\"3X'OT:KJ");
      assertEquals("false", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("false", qName0.toString());
      assertEquals("false", nodeNameTest0.toString());
      assertEquals("/`0\"3X'OT:KJ", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      assertEquals("false", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("false", qName0.toString());
      assertEquals("false", nodeNameTest0.toString());
      assertEquals("/`0\"3X'OT:KJ", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertTrue(parentContext0.isChildOrderingRequired());
      assertEquals(0, parentContext0.getPosition());
      assertEquals((-1), parentContext0.getDocumentOrder());
      assertEquals(1, parentContext0.getCurrentPosition());
      assertNotNull(parentContext0);
      
      PredicateContext predicateContext0 = new PredicateContext(parentContext0, expressionArray0[0]);
      assertEquals("false", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("false", qName0.toString());
      assertEquals("false", nodeNameTest0.toString());
      assertEquals("/`0\"3X'OT:KJ", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertTrue(parentContext0.isChildOrderingRequired());
      assertEquals(0, parentContext0.getPosition());
      assertEquals((-1), parentContext0.getDocumentOrder());
      assertEquals(1, parentContext0.getCurrentPosition());
      assertTrue(predicateContext0.isChildOrderingRequired());
      assertEquals(0, predicateContext0.getPosition());
      assertEquals(1, predicateContext0.getDocumentOrder());
      assertNotNull(predicateContext0);
      assertEquals(1, expressionArray0.length);
      
      Object object0 = coreFunction0.functionString(predicateContext0);
      assertEquals("false", object0);
      assertEquals(21, coreFunction0.getFunctionCode());
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals("false", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("false", qName0.toString());
      assertEquals("false", nodeNameTest0.toString());
      assertEquals("/`0\"3X'OT:KJ", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertTrue(parentContext0.isChildOrderingRequired());
      assertEquals(0, parentContext0.getPosition());
      assertEquals((-1), parentContext0.getDocumentOrder());
      assertEquals(1, parentContext0.getCurrentPosition());
      assertTrue(predicateContext0.isChildOrderingRequired());
      assertEquals(0, predicateContext0.getPosition());
      assertEquals(1, predicateContext0.getDocumentOrder());
      assertNotNull(object0);
      assertEquals(1, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(34, expressionArray0);
      assertEquals(34, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      Object object0 = coreFunction0.functionNull((EvalContext) null);
      assertEquals(34, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNull(object0);
      assertEquals(0, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant("8u,Is~r~_7E96Vnj");
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertNotNull(constant0);
      
      expressionArray0[0] = (Expression) constant0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertNotNull(coreOperationOr0);
      assertEquals(5, expressionArray0.length);
      
      expressionArray0[1] = (Expression) coreOperationOr0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray0[1], expressionArray0[1]);
      assertEquals("=", coreOperationEqual0.getSymbol());
      assertNotNull(coreOperationEqual0);
      assertEquals(5, expressionArray0.length);
      
      expressionArray0[2] = (Expression) coreOperationEqual0;
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[1], expressionArray0, stepArray0);
      assertNotNull(expressionPath0);
      assertEquals(5, expressionArray0.length);
      assertEquals(3, stepArray0.length);
      
      expressionArray0[3] = (Expression) expressionPath0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[1], expressionArray0[1]);
      assertEquals("=", nameAttributeTest0.getSymbol());
      assertTrue(nameAttributeTest0.computeContextDependent());
      assertNotNull(nameAttributeTest0);
      assertEquals(5, expressionArray0.length);
      
      expressionArray0[4] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction((-1056), expressionArray0);
      assertEquals((-1056), coreFunction0.getFunctionCode());
      assertEquals(5, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(5, expressionArray0.length);
      
      // Undeclared exception!
      coreFunction0.toString();
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName("count", "count");
      assertEquals("count", qName0.getPrefix());
      assertEquals("count", qName0.getName());
      assertEquals("count:count", qName0.toString());
      assertNotNull(qName0);
      
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      assertEquals("count", qName0.getPrefix());
      assertEquals("count", qName0.getName());
      assertEquals("count:count", qName0.toString());
      assertTrue(extensionFunction0.computeContextDependent());
      assertNotNull(extensionFunction0);
      assertEquals(1, expressionArray0.length);
      
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(20, expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals(20, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertNotNull(coreOperationNotEqual0);
      
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreFunction coreFunction0 = new CoreFunction(21, expressionArray0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(21, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.getArg3();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(1242, expressionArray0);
      assertEquals(1242, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.getArg3();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(10, expressionArray0);
      assertEquals(10, coreFunction0.getFunctionCode());
      assertEquals(1, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.getArg2();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.getArg1();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.getArg1();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[20];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertNotNull(coreOperationOr0);
      assertEquals(20, expressionArray0.length);
      
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[0], coreOperationOr0);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
      assertNotNull(coreOperationGreaterThanOrEqual0);
      assertEquals(20, expressionArray0.length);
      
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      assertEquals(9, coreFunction0.getFunctionCode());
      assertEquals(20, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(20, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(4205, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(4205, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionSum((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction4205()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertNotNull(coreOperationUnion0);
      assertEquals(1, expressionArray0.length);
      
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationUnion0, coreOperationUnion0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertNotNull(coreOperationLessThanOrEqual0);
      assertEquals(1, expressionArray0.length);
      
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertNotNull(coreOperationNotEqual0);
      assertEquals(1, expressionArray0.length);
      
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationNotEqual0, coreOperationUnion0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertEquals("*", coreOperationMultiply0.getSymbol());
      assertNotNull(coreOperationMultiply0);
      assertEquals(1, expressionArray0.length);
      
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      CoreFunction coreFunction0 = new CoreFunction((-34), expressionArray0);
      assertEquals((-34), coreFunction0.getFunctionCode());
      assertEquals(1, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      QName qName0 = new QName("hgxdD#8I!J$ ch");
      assertEquals("hgxdD#8I!J$ ch", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("hgxdD#8I!J$ ch", qName0.getName());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "hgxdD#8I!J$ ch");
      assertEquals("hgxdD#8I!J$ ch", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("hgxdD#8I!J$ ch", qName0.getName());
      assertEquals("hgxdD#8I!J$ ch", nodeNameTest0.getNamespaceURI());
      assertEquals("hgxdD#8I!J$ ch", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      assertEquals("hgxdD#8I!J$ ch", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("hgxdD#8I!J$ ch", qName0.getName());
      assertEquals("hgxdD#8I!J$ ch", nodeNameTest0.getNamespaceURI());
      assertEquals("hgxdD#8I!J$ ch", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals(0, ancestorContext0.getPosition());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertNotNull(ancestorContext0);
      
      SelfContext selfContext0 = new SelfContext(ancestorContext0, nodeNameTest0);
      assertEquals("hgxdD#8I!J$ ch", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("hgxdD#8I!J$ ch", qName0.getName());
      assertEquals("hgxdD#8I!J$ ch", nodeNameTest0.getNamespaceURI());
      assertEquals("hgxdD#8I!J$ ch", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals(0, ancestorContext0.getPosition());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertEquals(1, selfContext0.getDocumentOrder());
      assertTrue(selfContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getPosition());
      assertNotNull(selfContext0);
      
      ParentContext parentContext0 = new ParentContext(selfContext0, nodeNameTest0);
      assertEquals("hgxdD#8I!J$ ch", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("hgxdD#8I!J$ ch", qName0.getName());
      assertEquals("hgxdD#8I!J$ ch", nodeNameTest0.getNamespaceURI());
      assertEquals("hgxdD#8I!J$ ch", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals(0, ancestorContext0.getPosition());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertEquals(1, selfContext0.getDocumentOrder());
      assertTrue(selfContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getPosition());
      assertEquals(0, parentContext0.getPosition());
      assertEquals((-1), parentContext0.getDocumentOrder());
      assertEquals(1, parentContext0.getCurrentPosition());
      assertTrue(parentContext0.isChildOrderingRequired());
      assertNotNull(parentContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionSum(parentContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(20, expressionArray0);
      assertEquals(20, coreFunction0.getFunctionCode());
      assertEquals(1, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionSum((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-220), (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals((-220), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      QName qName0 = new QName("_^\"ut4");
      assertEquals("_^\"ut4", qName0.getName());
      assertEquals("_^\"ut4", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "_^\"ut4");
      assertEquals("_^\"ut4", qName0.getName());
      assertEquals("_^\"ut4", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("_^\"ut4", nodeNameTest0.toString());
      assertEquals("_^\"ut4", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, true);
      assertEquals("_^\"ut4", qName0.getName());
      assertEquals("_^\"ut4", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("_^\"ut4", nodeNameTest0.toString());
      assertEquals("_^\"ut4", nodeNameTest0.getNamespaceURI());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
      assertNotNull(precedingOrFollowingContext0);
      
      DescendantContext descendantContext0 = new DescendantContext(precedingOrFollowingContext0, false, nodeNameTest0);
      assertEquals("_^\"ut4", qName0.getName());
      assertEquals("_^\"ut4", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("_^\"ut4", nodeNameTest0.toString());
      assertEquals("_^\"ut4", nodeNameTest0.getNamespaceURI());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
      assertEquals(1, descendantContext0.getDocumentOrder());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getPosition());
      assertNotNull(descendantContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringBefore(descendantContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-220()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      assertFalse(locationPath0.isAbsolute());
      assertNotNull(locationPath0);
      
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, locationPath0);
      assertFalse(locationPath0.isAbsolute());
      assertEquals("*", coreOperationMultiply0.getSymbol());
      assertNotNull(coreOperationMultiply0);
      
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      CoreFunction coreFunction0 = new CoreFunction((-998), expressionArray0);
      assertEquals((-998), coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(4, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringBefore((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(496, expressionArray0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(496, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringAfter((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction496()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(16, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(16, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertEquals(0, namespaceContext0.getPosition());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertNotNull(namespaceContext0);
      
      ChildContext childContext0 = new ChildContext(namespaceContext0, (NodeTest) null, false, false);
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertEquals(0, namespaceContext0.getPosition());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getPosition());
      assertEquals(0, childContext0.getDocumentOrder());
      assertNotNull(childContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring(childContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: normalize-space()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("contains");
      assertEquals("contains", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("contains", qName0.getName());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "position");
      assertEquals("contains", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("contains", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("position", nodeNameTest0.getNamespaceURI());
      assertEquals("contains", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      Step step0 = new Step(2051, nodeNameTest0, expressionArray0);
      assertEquals("contains", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("contains", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("position", nodeNameTest0.getNamespaceURI());
      assertEquals("contains", nodeNameTest0.toString());
      assertEquals(2051, step0.getAxis());
      assertNotNull(step0);
      assertEquals(1, expressionArray0.length);
      
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      assertFalse(locationPath0.isAbsolute());
      assertNotNull(locationPath0);
      assertEquals(1, stepArray0.length);
      
      expressionArray0[0] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(2051, expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals(2051, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[0], (Expression) null);
      assertEquals("*", coreOperationMultiply0.getSymbol());
      assertNotNull(coreOperationMultiply0);
      assertEquals(4, expressionArray0.length);
      
      expressionArray0[1] = (Expression) coreOperationMultiply0;
      CoreFunction coreFunction0 = new CoreFunction((-1497), expressionArray0);
      assertEquals(4, coreFunction0.getArgumentCount());
      assertEquals((-1497), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(4, expressionArray0.length);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1497));
      assertEquals((-1497), nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      assertEquals((-1497), nodeTypeTest0.getNodeType());
      assertEquals(0, selfContext0.getPosition());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertFalse(selfContext0.isChildOrderingRequired());
      assertNotNull(selfContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionStringLength(selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(5, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(5, expressionArray0.length);
      
      QName qName0 = new QName("eP^hw/5zh0", "org.apache.commons.jxpath.ri.axes.DescendantContext");
      assertEquals("eP^hw/5zh0:org.apache.commons.jxpath.ri.axes.DescendantContext", qName0.toString());
      assertEquals("eP^hw/5zh0", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.axes.DescendantContext", qName0.getName());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.axes.DescendantContext");
      assertEquals("eP^hw/5zh0:org.apache.commons.jxpath.ri.axes.DescendantContext", qName0.toString());
      assertEquals("eP^hw/5zh0", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.axes.DescendantContext", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("org.apache.commons.jxpath.ri.axes.DescendantContext", nodeNameTest0.getNamespaceURI());
      assertEquals("eP^hw/5zh0:org.apache.commons.jxpath.ri.axes.DescendantContext", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      assertEquals("eP^hw/5zh0:org.apache.commons.jxpath.ri.axes.DescendantContext", qName0.toString());
      assertEquals("eP^hw/5zh0", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.axes.DescendantContext", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("org.apache.commons.jxpath.ri.axes.DescendantContext", nodeNameTest0.getNamespaceURI());
      assertEquals("eP^hw/5zh0:org.apache.commons.jxpath.ri.axes.DescendantContext", nodeNameTest0.toString());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertEquals(0, descendantContext0.getPosition());
      assertNotNull(descendantContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionString(descendantContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("{4P6!:I>");
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("{4P6!:I>", qName0.toString());
      assertEquals("I>", qName0.getName());
      assertNotNull(qName0);
      
      VariableReference variableReference0 = new VariableReference(qName0);
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("{4P6!:I>", qName0.toString());
      assertEquals("I>", qName0.getName());
      assertFalse(variableReference0.computeContextDependent());
      assertFalse(variableReference0.isContextDependent());
      assertNotNull(variableReference0);
      
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("{4P6!:I>", qName0.toString());
      assertEquals("I>", qName0.getName());
      assertFalse(variableReference0.computeContextDependent());
      assertFalse(variableReference0.isContextDependent());
      assertNotNull(expressionPath0);
      assertEquals(3, expressionArray0.length);
      assertEquals(5, stepArray0.length);
      
      expressionArray0[0] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      assertEquals(3, coreFunction0.getArgumentCount());
      assertEquals(13, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(3, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionString((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-1162), (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals((-1162), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionStartsWith((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1162()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("", (String) null);
      assertEquals("", qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals(":null", qName0.toString());
      assertNotNull(qName0);
      
      CoreFunction coreFunction0 = new CoreFunction(8, expressionArray0);
      assertEquals(8, coreFunction0.getFunctionCode());
      assertEquals(3, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(3, expressionArray0.length);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      assertEquals("", qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals(":null", qName0.toString());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals(":null", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      assertEquals("", qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals(":null", qName0.toString());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals(":null", nodeNameTest0.toString());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertNotNull(attributeContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionRound(attributeContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: string(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("~C=NaX8}bEg^K");
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertNotNull(qName0);
      
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertTrue(extensionFunction0.computeContextDependent());
      assertNotNull(extensionFunction0);
      assertEquals(2, expressionArray0.length);
      
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(3, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionPosition((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("~C=NaX8}bEg^K");
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertNotNull(qName0);
      
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertTrue(extensionFunction0.computeContextDependent());
      assertNotNull(extensionFunction0);
      assertEquals(2, expressionArray0.length);
      
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      assertEquals(3, coreFunction0.getFunctionCode());
      assertEquals(2, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertNotNull(attributeContext0);
      
      SelfContext selfContext0 = new SelfContext(attributeContext0, nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getPosition());
      assertFalse(selfContext0.isChildOrderingRequired());
      assertNotNull(selfContext0);
      
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(selfContext0, nodeNameTest0, true);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getPosition());
      assertFalse(selfContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
      assertNotNull(precedingOrFollowingContext0);
      
      NamespaceContext namespaceContext0 = new NamespaceContext(precedingOrFollowingContext0, nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getPosition());
      assertFalse(selfContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
      assertTrue(namespaceContext0.isChildOrderingRequired());
      assertEquals(1, namespaceContext0.getDocumentOrder());
      assertEquals(0, namespaceContext0.getPosition());
      assertNotNull(namespaceContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNull(namespaceContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(3439, (Expression[]) null);
      assertEquals(3439, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNot((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction3439()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-423), expressionArray0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals((-423), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNormalizeSpace((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-423()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertNotNull(coreOperationAdd0);
      assertEquals(1, expressionArray0.length);
      
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAdd0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertNotNull(coreOperationNegate0);
      assertEquals(1, expressionArray0.length);
      
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertEquals("=", nameAttributeTest0.getSymbol());
      assertTrue(nameAttributeTest0.computeContextDependent());
      assertNotNull(nameAttributeTest0);
      assertEquals(1, expressionArray0.length);
      
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNegate0, nameAttributeTest0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertEquals("=", nameAttributeTest0.getSymbol());
      assertTrue(nameAttributeTest0.computeContextDependent());
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertNotNull(coreOperationLessThanOrEqual0);
      assertEquals(1, expressionArray0.length);
      
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction((-889), expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals((-889), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      QName qName0 = new QName("local-name");
      assertNull(qName0.getPrefix());
      assertEquals("local-name", qName0.toString());
      assertEquals("local-name", qName0.getName());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "lang");
      assertNull(qName0.getPrefix());
      assertEquals("local-name", qName0.toString());
      assertEquals("local-name", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("lang", nodeNameTest0.getNamespaceURI());
      assertEquals("local-name", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("local-name", qName0.toString());
      assertEquals("local-name", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("lang", nodeNameTest0.getNamespaceURI());
      assertEquals("local-name", nodeNameTest0.toString());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertNotNull(attributeContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNormalizeSpace(attributeContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      assertEquals("and", coreOperationAnd0.getSymbol());
      assertNotNull(coreOperationAnd0);
      assertEquals(7, expressionArray0.length);
      
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, coreOperationAnd0);
      assertEquals("and", coreOperationAnd0.getSymbol());
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
      assertNotNull(coreOperationGreaterThanOrEqual0);
      assertEquals(7, expressionArray0.length);
      
      expressionArray0[2] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction((-2342), expressionArray0);
      assertEquals(7, coreFunction0.getArgumentCount());
      assertEquals((-2342), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(7, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNormalizeSpace((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("{4P6!:I>");
      assertEquals("I>", qName0.getName());
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("{4P6!:I>", qName0.toString());
      assertNotNull(qName0);
      
      VariableReference variableReference0 = new VariableReference(qName0);
      assertEquals("I>", qName0.getName());
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("{4P6!:I>", qName0.toString());
      assertFalse(variableReference0.isContextDependent());
      assertFalse(variableReference0.computeContextDependent());
      assertNotNull(variableReference0);
      
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      assertEquals("I>", qName0.getName());
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("{4P6!:I>", qName0.toString());
      assertFalse(variableReference0.isContextDependent());
      assertFalse(variableReference0.computeContextDependent());
      assertNotNull(expressionPath0);
      assertEquals(3, expressionArray0.length);
      assertEquals(5, stepArray0.length);
      
      expressionArray0[0] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      assertEquals(13, coreFunction0.getFunctionCode());
      assertEquals(3, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(3, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(165, expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals(165, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(165);
      assertEquals(165, nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeTypeTest0, false);
      assertEquals(165, nodeTypeTest0.getNodeType());
      assertEquals(1, precedingOrFollowingContext0.getDocumentOrder());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertNotNull(precedingOrFollowingContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionLast(precedingOrFollowingContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction165()(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1587, (Expression[]) null);
      assertEquals(1587, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionLast((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertNotNull(coreOperationUnion0);
      assertEquals(1, expressionArray0.length);
      
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertNotNull(coreOperationNotEqual0);
      assertEquals(1, expressionArray0.length);
      
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionLang((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("{4P6!:I>");
      assertEquals("{4P6!:I>", qName0.toString());
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("I>", qName0.getName());
      assertNotNull(qName0);
      
      VariableReference variableReference0 = new VariableReference(qName0);
      assertEquals("{4P6!:I>", qName0.toString());
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("I>", qName0.getName());
      assertFalse(variableReference0.isContextDependent());
      assertFalse(variableReference0.computeContextDependent());
      assertNotNull(variableReference0);
      
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      assertEquals("{4P6!:I>", qName0.toString());
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("I>", qName0.getName());
      assertFalse(variableReference0.isContextDependent());
      assertFalse(variableReference0.computeContextDependent());
      assertNotNull(expressionPath0);
      assertEquals(3, expressionArray0.length);
      assertEquals(5, stepArray0.length);
      
      expressionArray0[0] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      assertEquals(13, coreFunction0.getFunctionCode());
      assertEquals(3, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(3, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionKey((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, (Expression) null);
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
      assertNotNull(coreOperationGreaterThanOrEqual0);
      
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
      assertEquals("-", coreOperationSubtract0.getSymbol());
      assertNotNull(coreOperationSubtract0);
      
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationSubtract0, (Expression) null);
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
      assertEquals("-", coreOperationSubtract0.getSymbol());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertNotNull(coreOperationNotEqual0);
      
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreFunction coreFunction0 = new CoreFunction((-1292), expressionArray0);
      assertEquals((-1292), coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(4, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionKey((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("name");
      assertNull(qName0.getPrefix());
      assertEquals("name", qName0.toString());
      assertEquals("name", qName0.getName());
      assertNotNull(qName0);
      
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      assertNull(qName0.getPrefix());
      assertEquals("name", qName0.toString());
      assertEquals("name", qName0.getName());
      assertTrue(extensionFunction0.computeContextDependent());
      assertNotNull(extensionFunction0);
      assertEquals(5, expressionArray0.length);
      
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(105, expressionArray0);
      assertEquals(105, coreFunction0.getFunctionCode());
      assertEquals(5, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(5, expressionArray0.length);
      
      ChildContext childContext0 = new ChildContext((EvalContext) null, (NodeTest) null, false, false);
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertNotNull(childContext0);
      
      DescendantContext descendantContext0 = new DescendantContext(childContext0, false, (NodeTest) null);
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertNotNull(descendantContext0);
      
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(descendantContext0, (NodeTest) null, false);
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertEquals(1, precedingOrFollowingContext0.getDocumentOrder());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertNotNull(precedingOrFollowingContext0);
      
      AncestorContext ancestorContext0 = new AncestorContext(precedingOrFollowingContext0, false, (NodeTest) null);
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertEquals(1, precedingOrFollowingContext0.getDocumentOrder());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals(0, ancestorContext0.getPosition());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertNotNull(ancestorContext0);
      
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertEquals(1, precedingOrFollowingContext0.getDocumentOrder());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals(0, ancestorContext0.getPosition());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertEquals(0, unionContext0.getPosition());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertNotNull(unionContext0);
      assertEquals(1, evalContextArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionID(unionContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(442, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(442, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionFloor((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction442()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Float float0 = new Float(1.0);
      assertEquals(1.0F, (float)float0, 0.01F);
      assertNotNull(float0);
      
      Constant constant0 = new Constant(float0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertNotNull(constant0);
      
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[0], constant0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("mod", coreOperationMod0.getSymbol());
      assertNotNull(coreOperationMod0);
      assertEquals(6, expressionArray0.length);
      
      expressionArray0[4] = (Expression) coreOperationMod0;
      CoreFunction coreFunction0 = new CoreFunction((-572), expressionArray0);
      assertEquals((-572), coreFunction0.getFunctionCode());
      assertEquals(6, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(6, expressionArray0.length);
      
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, (NodeTest) null);
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertNotNull(descendantContext0);
      
      SelfContext selfContext0 = new SelfContext(descendantContext0, (NodeTest) null);
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertTrue(selfContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getPosition());
      assertEquals(1, selfContext0.getDocumentOrder());
      assertNotNull(selfContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionFloor(selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertNotNull(coreOperationAdd0);
      assertEquals(7, expressionArray0.length);
      
      expressionArray0[0] = (Expression) coreOperationAdd0;
      expressionArray0[1] = (Expression) coreOperationAdd0;
      expressionArray0[2] = (Expression) coreOperationAdd0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertNotNull(coreOperationOr0);
      assertEquals(7, expressionArray0.length);
      
      expressionArray0[3] = (Expression) coreOperationOr0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationAdd0, expressionArray0[0]);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertEquals("mod", coreOperationMod0.getSymbol());
      assertNotNull(coreOperationMod0);
      assertEquals(7, expressionArray0.length);
      
      expressionArray0[4] = (Expression) coreOperationMod0;
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[3], expressionArray0, stepArray0);
      assertNotNull(expressionPath0);
      assertEquals(7, expressionArray0.length);
      assertEquals(2, stepArray0.length);
      
      expressionArray0[5] = (Expression) expressionPath0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[4], expressionArray0[0]);
      assertEquals("-", coreOperationSubtract0.getSymbol());
      assertNotNull(coreOperationSubtract0);
      assertEquals(7, expressionArray0.length);
      
      expressionArray0[6] = (Expression) coreOperationSubtract0;
      CoreFunction coreFunction0 = new CoreFunction(3623, expressionArray0);
      assertEquals(3623, coreFunction0.getFunctionCode());
      assertEquals(7, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(7, expressionArray0.length);
      
      // Undeclared exception!
      coreFunction0.functionFalse((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      assertNotNull(coreOperationGreaterThan0);
      
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreFunction coreFunction0 = new CoreFunction(3045, expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals(3045, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionFalse((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(47, expressionArray0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(47, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionContains((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction47()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertNotNull(coreOperationUnion0);
      assertEquals(2, expressionArray0.length);
      
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertNotNull(coreOperationNegate0);
      assertEquals(2, expressionArray0.length);
      
      expressionArray0[0] = (Expression) coreOperationNegate0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("|Ubw,>");
      assertEquals("|Ubw,>", processingInstructionTest0.getTarget());
      assertNotNull(processingInstructionTest0);
      
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      assertEquals("|Ubw,>", processingInstructionTest0.getTarget());
      assertEquals(0, step0.getAxis());
      assertNotNull(step0);
      assertEquals(2, expressionArray0.length);
      
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertNotNull(expressionPath0);
      assertEquals(2, expressionArray0.length);
      assertEquals(1, stepArray0.length);
      
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      assertEquals("|", coreOperationUnion0.getSymbol());
      assertEquals(0, evalContext0.getPosition());
      assertFalse(evalContext0.isChildOrderingRequired());
      assertEquals(0, evalContext0.getDocumentOrder());
      assertNotNull(evalContext0);
      assertEquals(2, expressionArray0.length);
      assertEquals(1, stepArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat(evalContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-1220), expressionArray0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals((-1220), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      assertEquals(0, unionContext0.getPosition());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertNotNull(unionContext0);
      assertEquals(7, evalContextArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionCeiling(unionContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1220()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("{4P6!:I>");
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("{4P6!:I>", qName0.toString());
      assertEquals("I>", qName0.getName());
      assertNotNull(qName0);
      
      VariableReference variableReference0 = new VariableReference(qName0);
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("{4P6!:I>", qName0.toString());
      assertEquals("I>", qName0.getName());
      assertFalse(variableReference0.isContextDependent());
      assertFalse(variableReference0.computeContextDependent());
      assertNotNull(variableReference0);
      
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      assertEquals("{4P6!", qName0.getPrefix());
      assertEquals("{4P6!:I>", qName0.toString());
      assertEquals("I>", qName0.getName());
      assertFalse(variableReference0.isContextDependent());
      assertFalse(variableReference0.computeContextDependent());
      assertNotNull(expressionPath0);
      assertEquals(3, expressionArray0.length);
      assertEquals(5, stepArray0.length);
      
      expressionArray0[0] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      assertEquals(3, coreFunction0.getArgumentCount());
      assertEquals(13, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(3, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionCeiling((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      assertNotNull(expressionPath0);
      assertEquals(2, expressionArray0.length);
      assertEquals(4, stepArray0.length);
      
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(expressionPath0, (Expression) null);
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertNotNull(coreOperationLessThanOrEqual0);
      assertEquals(2, expressionArray0.length);
      assertEquals(4, stepArray0.length);
      
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(1, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationLessThanOrEqual0);
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertEquals(0, predicateContext0.getPosition());
      assertEquals(0, predicateContext0.getDocumentOrder());
      assertFalse(predicateContext0.isChildOrderingRequired());
      assertNotNull(predicateContext0);
      assertEquals(2, expressionArray0.length);
      assertEquals(4, stepArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionCeiling(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionBoolean((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertNotNull(coreOperationOr0);
      assertEquals(6, expressionArray0.length);
      
      expressionArray0[4] = (Expression) coreOperationOr0;
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      assertEquals(2, coreFunction0.getFunctionCode());
      assertEquals(6, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(6, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertNotNull(coreOperationOr0);
      assertEquals(8, expressionArray0.length);
      
      expressionArray0[0] = (Expression) coreOperationOr0;
      CoreFunction coreFunction0 = new CoreFunction(4777, expressionArray0);
      assertEquals(8, coreFunction0.getArgumentCount());
      assertEquals(4777, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(8, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.computeContextDependent();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(1, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("~C=NaX8}bEg^K");
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertNotNull(qName0);
      
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertTrue(extensionFunction0.computeContextDependent());
      assertNotNull(extensionFunction0);
      assertEquals(2, expressionArray0.length);
      
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(3, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertNotNull(attributeContext0);
      
      SelfContext selfContext0 = new SelfContext(attributeContext0, nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getPosition());
      assertFalse(selfContext0.isChildOrderingRequired());
      assertNotNull(selfContext0);
      
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(selfContext0, nodeNameTest0, true);
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getPosition());
      assertFalse(selfContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
      assertNotNull(precedingOrFollowingContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.compute(precedingOrFollowingContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertNotNull(coreOperationAdd0);
      assertEquals(8, expressionArray0.length);
      
      expressionArray0[0] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(8, expressionArray0);
      assertEquals(8, coreFunction0.getArgumentCount());
      assertEquals(8, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(8, expressionArray0.length);
      
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(":", nodeNameTest0.toString());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(":", nodeNameTest0.toString());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertNotNull(descendantContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.compute(descendantContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(16, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(16, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertEquals(0, namespaceContext0.getPosition());
      assertNotNull(namespaceContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.computeValue(namespaceContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: normalize-space()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      assertEquals(1, unionContext0.getDocumentOrder());
      assertEquals(0, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertNotNull(unionContext0);
      assertEquals(5, evalContextArray0.length);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(unionContext0, nodeNameTest0, false);
      assertEquals(1, unionContext0.getDocumentOrder());
      assertEquals(0, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals(1, precedingOrFollowingContext0.getDocumentOrder());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertNotNull(precedingOrFollowingContext0);
      assertEquals(5, evalContextArray0.length);
      
      Object object0 = coreFunction0.computeValue(precedingOrFollowingContext0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertEquals(0, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals(1, precedingOrFollowingContext0.getDocumentOrder());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertNull(object0);
      assertEquals(5, evalContextArray0.length);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(4205, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(4205, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      String string0 = coreFunction0.toString();
      assertEquals("unknownFunction4205()()", string0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(4205, coreFunction0.getFunctionCode());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(8, expressionArray0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(8, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      int int0 = coreFunction0.getArgumentCount();
      assertEquals(0, int0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(8, coreFunction0.getFunctionCode());
      assertEquals(0, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      int int0 = coreFunction0.getArgumentCount();
      assertEquals(0, int0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(41, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(41, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.getArg2();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      assertEquals(3, coreFunction0.getArgumentCount());
      assertEquals(13, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(3, expressionArray0.length);
      
      Expression expression0 = coreFunction0.getArg1();
      assertEquals(3, coreFunction0.getArgumentCount());
      assertEquals(13, coreFunction0.getFunctionCode());
      assertNull(expression0);
      assertEquals(3, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-8), expressionArray0);
      assertEquals((-8), coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      assertNotNull(basicNodeSet0);
      
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      assertFalse(nodeSetContext0.isChildOrderingRequired());
      assertEquals(0, nodeSetContext0.getDocumentOrder());
      assertEquals(0, nodeSetContext0.getPosition());
      assertNotNull(nodeSetContext0);
      
      Object object0 = coreFunction0.functionNumber(nodeSetContext0);
      assertEquals(Double.NaN, object0);
      assertEquals((-8), coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertFalse(nodeSetContext0.isChildOrderingRequired());
      assertEquals(1, nodeSetContext0.getPosition());
      assertEquals(0, nodeSetContext0.getDocumentOrder());
      assertNotNull(object0);
      assertEquals(0, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(2164, expressionArray0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(2164, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-854));
      assertEquals((-854), nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeTypeTest0, false);
      assertEquals((-854), nodeTypeTest0.getNodeType());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertEquals(1, precedingOrFollowingContext0.getDocumentOrder());
      assertNotNull(precedingOrFollowingContext0);
      
      Object object0 = coreFunction0.functionStringLength(precedingOrFollowingContext0);
      assertEquals(0.0, object0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(2164, coreFunction0.getFunctionCode());
      assertEquals((-854), nodeTypeTest0.getNodeType());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertEquals(1, precedingOrFollowingContext0.getDocumentOrder());
      assertNotNull(object0);
      assertEquals(0, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction((-2033), expressionArray0);
      assertEquals(6, coreFunction0.getArgumentCount());
      assertEquals((-2033), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(6, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionStringLength((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-2033()(null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(208, expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      assertEquals(208, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(1, expressionArray0.length);
      
      Expression[] expressionArray1 = new Expression[2];
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      
      expressionArray1[0] = (Expression) coreFunction0;
      expressionArray1[1] = (Expression) coreFunction0;
      coreFunction0.args = expressionArray1;
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(208, coreFunction0.getFunctionCode());
      
      Object object0 = coreFunction0.functionSubstring((EvalContext) null);
      assertNotSame(expressionArray0, expressionArray1);
      assertFalse(expressionArray0.equals((Object)expressionArray1));
      assertEquals("", object0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(208, coreFunction0.getFunctionCode());
      assertNotNull(object0);
      assertEquals(1, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-8), expressionArray0);
      assertEquals((-8), coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      assertNotNull(basicNodeSet0);
      
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      assertEquals(0, nodeSetContext0.getPosition());
      assertEquals(0, nodeSetContext0.getDocumentOrder());
      assertFalse(nodeSetContext0.isChildOrderingRequired());
      assertNotNull(nodeSetContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat(nodeSetContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-8()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction((-572), expressionArray0);
      assertEquals((-572), coreFunction0.getFunctionCode());
      assertEquals(6, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(6, expressionArray0.length);
      
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, (NodeTest) null);
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertNotNull(descendantContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat(descendantContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-5278), (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals((-5278), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionString((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreFunction0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertEquals(0, rootContext0.getPosition());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertNotNull(rootContext0);
      
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertEquals(0, rootContext0.getPosition());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertEquals(0, initialContext0.getPosition());
      assertNotNull(initialContext0);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeTypeTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertEquals(0, rootContext0.getPosition());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertEquals(0, initialContext0.getPosition());
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertEquals(0, attributeContext0.getPosition());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertNotNull(attributeContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionName(attributeContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      EvalContext evalContext0 = null;
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      assertEquals(2, coreFunction0.getFunctionCode());
      assertEquals(6, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(6, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionName(evalContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: position(null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      assertNull(nodeNameTest0.getNamespaceURI());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertEquals(0, ancestorContext0.getPosition());
      assertNotNull(ancestorContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI(ancestorContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      assertEquals(3, coreFunction0.getArgumentCount());
      assertEquals(13, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(3, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring-after(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-8), expressionArray0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals((-8), coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(0, expressionArray0.length);
      
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      assertNotNull(basicNodeSet0);
      
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      assertEquals(0, nodeSetContext0.getDocumentOrder());
      assertEquals(0, nodeSetContext0.getPosition());
      assertFalse(nodeSetContext0.isChildOrderingRequired());
      assertNotNull(nodeSetContext0);
      
      Object object0 = coreFunction0.functionLast(nodeSetContext0);
      assertEquals(0.0, object0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals((-8), coreFunction0.getFunctionCode());
      assertEquals(1, nodeSetContext0.getPosition());
      assertEquals(0, nodeSetContext0.getDocumentOrder());
      assertFalse(nodeSetContext0.isChildOrderingRequired());
      assertNotNull(object0);
      assertEquals(0, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(28, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(28, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      Object object0 = coreFunction0.computeValue((EvalContext) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(28, coreFunction0.getFunctionCode());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("~C=NaX8}bEg^K");
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertNotNull(qName0);
      
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      assertEquals(3, coreFunction0.getFunctionCode());
      assertEquals(2, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertNotNull(attributeContext0);
      
      SelfContext selfContext0 = new SelfContext(attributeContext0, nodeNameTest0);
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertFalse(selfContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getPosition());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertNotNull(selfContext0);
      
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(selfContext0, nodeNameTest0, true);
      assertEquals("~C=NaX8}bEg^K", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("~C=NaX8}bEg^K", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("~C=NaX8}bEg^K", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getPosition());
      assertEquals(0, attributeContext0.getDocumentOrder());
      assertFalse(selfContext0.isChildOrderingRequired());
      assertEquals(0, selfContext0.getPosition());
      assertEquals(0, selfContext0.getDocumentOrder());
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertNotNull(precedingOrFollowingContext0);
      
      // Undeclared exception!
      try { 
        coreFunction0.compute(precedingOrFollowingContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: count(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((byte)1, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(1, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertTrue(boolean0);
      assertEquals(0, coreFunction0.getArgumentCount());
      assertEquals(1, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant("Factory could not create object path: ");
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertNotNull(constant0);
      
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertTrue(nameAttributeTest0.computeContextDependent());
      assertEquals("=", nameAttributeTest0.getSymbol());
      assertNotNull(nameAttributeTest0);
      
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(6, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      assertEquals(6, expressionArray0.length);
      
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertTrue(boolean0);
      assertEquals(0, coreFunction0.getFunctionCode());
      assertEquals(6, coreFunction0.getArgumentCount());
      assertEquals(6, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(4205, (Expression[]) null);
      assertEquals(4205, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertFalse(boolean0);
      assertEquals(4205, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(30, expressionArray0);
      assertEquals(5, coreFunction0.getArgumentCount());
      assertEquals(30, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(5, expressionArray0.length);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[4]);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(5, expressionArray0.length);
      
      QName qName0 = new QName("jNW`%QBq|0^2f~y^UN", "jNW`%QBq|0^2f~y^UN");
      assertEquals("jNW`%QBq|0^2f~y^UN", qName0.getPrefix());
      assertEquals("jNW`%QBq|0^2f~y^UN:jNW`%QBq|0^2f~y^UN", qName0.toString());
      assertEquals("jNW`%QBq|0^2f~y^UN", qName0.getName());
      assertNotNull(qName0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, coreFunction0, (Locale) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(5, coreFunction0.getArgumentCount());
      assertEquals(30, coreFunction0.getFunctionCode());
      assertEquals("jNW`%QBq|0^2f~y^UN", qName0.getPrefix());
      assertEquals("jNW`%QBq|0^2f~y^UN:jNW`%QBq|0^2f~y^UN", qName0.toString());
      assertEquals("jNW`%QBq|0^2f~y^UN", qName0.getName());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(5, expressionArray0.length);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(5, coreFunction0.getArgumentCount());
      assertEquals(30, coreFunction0.getFunctionCode());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("jNW`%QBq|0^2f~y^UN", qName0.getPrefix());
      assertEquals("jNW`%QBq|0^2f~y^UN:jNW`%QBq|0^2f~y^UN", qName0.toString());
      assertEquals("jNW`%QBq|0^2f~y^UN", qName0.getName());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertNotNull(rootContext0);
      assertEquals(5, expressionArray0.length);
      
      // Undeclared exception!
      try { 
        coreFunction0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: format-number(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(28, (Expression[]) null);
      assertEquals(28, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionKey((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction28()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(21, expressionArray0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(21, coreFunction0.getFunctionCode());
      assertNotNull(coreFunction0);
      assertEquals(2, expressionArray0.length);
      
      String string0 = coreFunction0.toString();
      assertEquals("false(null, null)", string0);
      assertEquals(2, coreFunction0.getArgumentCount());
      assertEquals(21, coreFunction0.getFunctionCode());
      assertNotNull(string0);
      assertEquals(2, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(14, (Expression[]) null);
      assertEquals(14, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.functionCount((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(12, (Expression[]) null);
      assertEquals(12, coreFunction0.getFunctionCode());
      assertEquals(0, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring-before()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(10, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: starts-with(null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[20];
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: concat(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(5, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionPosition((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: local-name(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: last()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction((-2198), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTrue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-2198()(null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(2329, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionID((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction2329()(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(208, expressionArray0);
      Expression[] expressionArray1 = new Expression[2];
      expressionArray1[0] = (Expression) coreFunction0;
      coreFunction0.args = expressionArray1;
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      coreFunction0.getArg3();
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1387, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionPosition((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFalse((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      coreFunction0.compute((EvalContext) null);
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("~C=NaX8}bEg^K");
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(attributeContext0, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(selfContext0, nodeNameTest0, true);
      NamespaceContext namespaceContext0 = new NamespaceContext(precedingOrFollowingContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNull(namespaceContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: count(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }
}
