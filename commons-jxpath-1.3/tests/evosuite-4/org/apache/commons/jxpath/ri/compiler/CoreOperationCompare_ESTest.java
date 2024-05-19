
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
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
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
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationCompare_ESTest extends CoreOperationCompare_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1548));
      Constant constant0 = new Constant(0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, true, true);
      ParentContext parentContext0 = new ParentContext(childContext0, nodeTypeTest0);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) coreOperationNotEqual0;
      expressionArray0[2] = (Expression) coreOperationNotEqual0;
      expressionArray0[3] = (Expression) constant0;
      expressionArray0[4] = (Expression) constant0;
      expressionArray0[5] = (Expression) coreOperationNotEqual0;
      expressionArray0[6] = (Expression) constant0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      boolean boolean0 = coreOperationNotEqual0.equal(parentContext0, constant0, coreOperationAdd0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant constant0 = new Constant(":3KJ;6*}$RPmhf");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "!=");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      ParentContext parentContext0 = new ParentContext(initialContext0, processingInstructionTest0);
      boolean boolean0 = coreOperationNotEqual0.findMatch(initialContext0, parentContext0);
      assertEquals(2, initialContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationAnd0, coreOperationAnd0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationAnd0, coreOperationNotEqual0);
      boolean boolean0 = coreOperationNotEqual0.equal((EvalContext) null, coreOperationAnd0, coreOperationMultiply0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("", "*X0OFS@{.~6LZ7x]a@");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Locale locale0 = new Locale("\"starts-with\"", "$:*X0OFS@{.~6LZ7x]a@", "$:*X0OFS@{.~6LZ7x]a@");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1548));
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeTypeTest0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.findMatch(attributeContext0, rootContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationEqual0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.findMatch(predicateContext0, (Iterator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("FWn.k*ZE}X, IB>3*\"}", ";c_vA@9F ,");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(variableReference0, variableReference0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMod0, coreOperationMod0);
      Object object0 = new Object();
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal(rootContext0, variableReference0, coreOperationMod0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: FWn.k*ZE}X, IB>3*\"}:;c_vA@9F ,
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("@#YH#'AkLOfC_", "41q");
      Expression[] expressionArray0 = new Expression[0];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(extensionFunction0, extensionFunction0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(extensionFunction0, coreOperationLessThanOrEqual0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationLessThanOrEqual0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal(unionContext0, coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: @#YH#'AkLOfC_:41q
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.equal((EvalContext) null, (Expression) null, (Expression) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant constant0 = new Constant("");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationNotEqual0, constant0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, coreOperationMod0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.equal((EvalContext) null, nameAttributeTest0, coreOperationMultiply0);
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
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAnd0, coreOperationAnd0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationEqual0, coreOperationAnd0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationGreaterThanOrEqual0, coreOperationEqual0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationSubtract0, coreOperationGreaterThanOrEqual0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal("org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract@0000000004 = org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual@0000000003", coreOperationAnd0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, nameAttributeTest0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.contains((Iterator) null, coreOperationNotEqual0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAdd0;
      Expression[] expressionArray1 = new Expression[7];
      expressionArray1[1] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray1);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, expressionArray1[1]);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "D98z^w*DrEAF=c");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.computeValue(rootContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, coreOperationUnion0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationUnion0, coreOperationEqual0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationEqual0, nameAttributeTest0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationSubtract0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationUnion", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Constant constant0 = new Constant(3);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, constant0);
      Object object0 = new Object();
      boolean boolean0 = nameAttributeTest0.equal((Object) null, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationOr0, coreOperationOr0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, coreOperationEqual0);
      boolean boolean0 = coreOperationNotEqual0.equal((Object) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant constant0 = new Constant(3);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      EvalContext[] evalContextArray0 = new EvalContext[2];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, constant0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, nameAttributeTest0);
      boolean boolean0 = coreOperationEqual0.equal(evalContextArray0[1], constant0, coreOperationMultiply0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Constant constant0 = new Constant("B");
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, coreOperationNegate0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNotEqual0, constant0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, coreFunction0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationLessThan0, coreOperationLessThan0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      Object object0 = coreOperationNotEqual0.computeValue((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("", "*X0OFS@{.~6LZ7x]a@");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = nameAttributeTest0.contains(evalContext0, (Object) null);
      assertEquals(2, evalContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, coreOperationUnion0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, coreOperationUnion0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      linkedList0.add((Object) nameAttributeTest0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.findMatch(listIterator0, listIterator0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constant constant0 = new Constant(3);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      EvalContext[] evalContextArray0 = new EvalContext[2];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
      AttributeContext attributeContext0 = new AttributeContext(unionContext0, nodeTypeTest0);
      ParentContext parentContext0 = new ParentContext(attributeContext0, nodeTypeTest0);
      Iterator iterator0 = coreOperationEqual0.iterate(parentContext0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, constant0);
      boolean boolean0 = nameAttributeTest0.contains(iterator0, constant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Constant constant0 = new Constant(3);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      EvalContext[] evalContextArray0 = new EvalContext[2];
      Object object0 = coreOperationEqual0.computeValue(evalContextArray0[1]);
      assertEquals(true, object0);
      
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, constant0);
      Object object1 = new Object();
      boolean boolean0 = nameAttributeTest0.equal(object1, object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("", "*X0OFS@{.~6LZ7x]a@");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      AttributeContext attributeContext0 = new AttributeContext(initialContext0, nodeTypeTest0);
      Boolean boolean0 = (Boolean)nameAttributeTest0.compute(attributeContext0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, coreOperationUnion0);
      int int0 = nameAttributeTest0.getPrecedence();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, coreOperationUnion0);
      boolean boolean0 = nameAttributeTest0.isSymmetric();
      assertTrue(boolean0);
  }
}
