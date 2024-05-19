
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
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
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
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
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
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
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
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, expressionArray0[0]);
      Constant constant0 = new Constant(7);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      expressionArray0[3] = (Expression) coreOperationSubtract0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, coreOperationGreaterThanOrEqual0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, processingInstructionTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(namespaceContext0, basicNodeSet0);
      PredicateContext predicateContext0 = new PredicateContext(nodeSetContext0, coreOperationEqual0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(predicateContext0, processingInstructionTest0, true);
      Object object0 = expressionArray0[3].compute(precedingOrFollowingContext0);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Q)Ml2YzL/]|d0mE[Pr\"");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) parentContext0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "Q)Ml2YzL/]|d0mE[Pr\"", (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(descendantContext0, true, nodeNameTest0);
      Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator(ancestorContext0);
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
  public void test02()  throws Throwable  {
      QName qName0 = new QName("8rq");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator(listIterator0);
      Locale locale0 = Locale.CANADA;
      Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator(expression_ValueIterator0, qName0, locale0);
      // Undeclared exception!
      try { 
        expression_PointerIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("G'}Eo", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(extensionFunction0, extensionFunction0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, coreOperationMultiply0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMultiply0, coreOperationMod0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationOr0, coreOperationMod0);
      expressionArray0[3] = (Expression) coreOperationEqual0;
      boolean boolean0 = expressionArray0[3].isContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(variableReference0, variableReference0);
      boolean boolean0 = coreOperationNotEqual0.isContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, constant0);
      boolean boolean0 = coreOperationLessThanOrEqual0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Constant constant0 = new Constant("3RG}ZJ`Wha+C]");
      boolean boolean0 = constant0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationUnion0, coreOperationUnion0);
      // Undeclared exception!
      try { 
        coreOperationGreaterThanOrEqual0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationUnion", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[0], coreFunction0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMod0, expressionArray0[0]);
      // Undeclared exception!
      try { 
        coreOperationDivide0.iteratePointers((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNotEqual0, coreOperationOr0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      // Undeclared exception!
      try { 
        coreOperationGreaterThan0.iterate((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CoreOperationMod coreOperationMod0 = new CoreOperationMod((Expression) null, (Expression) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationMod0, (Expression) null);
      QName qName0 = new QName("`Yn%g");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationLessThan0.iterate(namespaceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.isContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("G'}Eo", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(extensionFunction0, extensionFunction0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, coreOperationMultiply0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMultiply0, coreOperationMod0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationUnion0;
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(selfContext0, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      UnionContext unionContext0 = new UnionContext(namespaceContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        expressionArray0[2].computeValue(unionContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("jxpathYdebug", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        variableReference0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.VariableReference", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationUnion0;
      // Undeclared exception!
      try { 
        expressionArray0[2].computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Expression[] expressionArray0 = new Expression[2];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.compute((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExtensionFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant(5);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[0], constant0);
      expressionArray0[1] = (Expression) coreOperationMultiply0;
      CoreFunction coreFunction0 = new CoreFunction(5, expressionArray0);
      expressionArray0[2] = (Expression) constant0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationMultiply0, constant0);
      expressionArray0[3] = (Expression) coreOperationSubtract0;
      expressionArray0[4] = (Expression) constant0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationSubtract0, expressionArray0[2]);
      expressionArray0[5] = (Expression) coreOperationLessThan0;
      expressionArray0[6] = (Expression) coreOperationMultiply0;
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
  public void test17()  throws Throwable  {
      Constant constant0 = new Constant("jxpath.debug");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      QName qName0 = new QName("jxpath.debug", "");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, basicNodeSet0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("!%A_9!%e >");
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, processingInstructionTest0);
      Iterator iterator0 = constant0.iteratePointers(namespaceContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      Iterator iterator0 = constant0.iteratePointers((EvalContext) null);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Constant constant0 = new Constant("jxpathYdebug");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      QName qName0 = new QName("jxpathYdebug", "");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, basicNodeSet0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      VariableReference variableReference0 = new VariableReference(qName0);
      Iterator iterator0 = variableReference0.iteratePointers(rootContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constant constant0 = new Constant("jxpathYdebug");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      QName qName0 = new QName("jxpathYdebug", "");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, basicNodeSet0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      VariableReference variableReference0 = new VariableReference(qName0);
      Iterator iterator0 = variableReference0.iterate(rootContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Constant constant0 = new Constant(5);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(5);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      Iterator iterator0 = constant0.iterate(namespaceContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator(listIterator0);
      boolean boolean0 = expression_ValueIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator(listIterator0);
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
  public void test24()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      QName qName0 = new QName(",U9Mn@WoRy4)P)K6");
      Locale locale0 = new Locale(",U9Mn@WoRy4)P)K6", ",U9Mn@WoRy4)P)K6");
      Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator(listIterator0, qName0, locale0);
      boolean boolean0 = expression_PointerIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("XL;Uq>w&hgGqqe|*");
      Locale locale0 = Locale.FRANCE;
      Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator((Iterator) null, qName0, locale0);
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
