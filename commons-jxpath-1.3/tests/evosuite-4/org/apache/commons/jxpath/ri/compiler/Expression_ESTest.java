
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
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Expression_ESTest extends Expression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("<mXwJs_", "<mXwJs_");
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], expressionArray0[0]);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[2]);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, coreOperationLessThan0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator(rootContext0);
      // Undeclared exception!
      try { 
        expression_ValueIterator0.next();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[9];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator", (String) null);
      Locale locale0 = Locale.CANADA_FRENCH;
      Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator(unionContext0, qName0, locale0);
      // Undeclared exception!
      try { 
        expression_PointerIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("<mXwJs_", "<mXwJs_");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], expressionArray0[0]);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[2]);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, coreOperationLessThan0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Iterator iterator0 = coreOperationLessThan0.iteratePointers(rootContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, nameAttributeTest0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      CoreFunction coreFunction0 = new CoreFunction(660, expressionArray0);
      boolean boolean0 = coreFunction0.isContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[5];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      boolean boolean0 = coreOperationOr0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant((String) null);
      expressionArray0[0] = (Expression) constant0;
      boolean boolean0 = expressionArray0[0].computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      QName qName0 = new QName(")(~LinF)A", ")(~LinF)A");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationUnion0.iterate(attributeContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract((Expression) null, (Expression) null);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.isContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Expression[] expressionArray0 = new Expression[7];
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      CoreFunction coreFunction0 = new CoreFunction(2189, expressionArray0);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(locationPath0, extensionFunction0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationEqual0, coreFunction0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationSubtract0, expressionArray0[4]);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(parentContext0, basicNodeSet0);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, processingInstructionTest0);
      AncestorContext ancestorContext0 = new AncestorContext(selfContext0, false, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(ancestorContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, coreOperationOr0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.compute((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(variableReference0, variableReference0);
      Expression[] expressionArray0 = new Expression[3];
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
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
  public void test11()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator");
      Iterator iterator0 = constant0.iterate((EvalContext) null);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationAnd0, coreOperationAnd0);
      boolean boolean0 = coreOperationDivide0.isContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("sjAbA+?f");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, processingInstructionTest0);
      Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator(ancestorContext0);
      // Undeclared exception!
      try { 
        expression_ValueIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression$ValueIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Constant constant0 = new Constant("");
      // Undeclared exception!
      try { 
        constant0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-655));
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeTypeTest0);
      QName qName0 = new QName("yvHN(tn@j1", ".5O HT[=V>9t]T^R6,");
      Locale locale0 = Locale.CANADA;
      Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator(descendantContext0, qName0, locale0);
      // Undeclared exception!
      try { 
        expression_PointerIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator", e);
      }
  }
}
