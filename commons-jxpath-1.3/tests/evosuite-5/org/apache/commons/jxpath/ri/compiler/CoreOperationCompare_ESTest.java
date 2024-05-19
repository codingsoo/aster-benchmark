
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
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
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
public class CoreOperationCompare_ESTest extends CoreOperationCompare_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      linkedList0.add((Object) listIterator0);
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
  public void test01()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName("G _e&We1,#~X|<A");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray0[2], extensionFunction0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationUnion0, expressionArray0[5]);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, coreOperationEqual0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, coreOperationEqual0);
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, coreOperationNotEqual0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionArray0[4], nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.findMatch(evalContext0, rootContext0);
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
      Constant constant0 = new Constant("sHV");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(selfContext0, processingInstructionTest0, true, true);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.findMatch(childContext0, childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction((-1285), expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationOr0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationUnion0, coreFunction0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationLessThanOrEqual0, coreFunction0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationUnion0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      coreOperationNotEqual0.equal(initialContext0, coreOperationOr0, expressionArray0[1]);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant constant0 = new Constant("sHV");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.equal(selfContext0, constant0, coreFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: last(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.AncestorContext", "Uo(");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(variableReference0, variableReference0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.equal((EvalContext) null, variableReference0, variableReference0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.VariableReference", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, coreOperationOr0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNotEqual0, coreOperationNotEqual0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(26);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal("!=", selfContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      Object object0 = nameAttributeTest0.computeValue(rootContext0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.contains(rootContext0, object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant constant0 = new Constant("ZC-<,x6:D-");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, coreOperationEqual0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.contains((Iterator) null, nameAttributeTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, (Expression) null);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ChildContext childContext0 = new ChildContext(nodeSetContext0, processingInstructionTest0, true, true);
      AncestorContext ancestorContext0 = new AncestorContext(childContext0, true, processingInstructionTest0);
      SelfContext selfContext0 = new SelfContext(ancestorContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.computeValue(selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant constant0 = new Constant(2);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Expression[] expressionArray0 = new Expression[0];
      nameAttributeTest0.args = expressionArray0;
      // Undeclared exception!
      try { 
        nameAttributeTest0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Double double0 = Expression.ONE;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAdd0, coreOperationAdd0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.equal(coreOperationAdd0, double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, coreOperationEqual0);
      boolean boolean0 = nameAttributeTest0.equal((EvalContext) null, constant0, nameAttributeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationAnd0);
      Object object0 = new Object();
      boolean boolean0 = nameAttributeTest0.equal((Object) null, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Constant constant0 = new Constant("sHV");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      boolean boolean0 = coreOperationNotEqual0.equal(constant0, "sHV");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant constant0 = new Constant(2);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Iterator iterator0 = constant0.iterate((EvalContext) null);
      boolean boolean0 = nameAttributeTest0.contains(iterator0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Constant constant0 = new Constant(2);
      Iterator iterator0 = constant0.iterate((EvalContext) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Iterator iterator1 = constant0.iterate((EvalContext) null);
      Object object0 = nameAttributeTest0.computeValue((EvalContext) null);
      assertEquals(true, object0);
      
      boolean boolean0 = nameAttributeTest0.contains(iterator0, object0);
      boolean boolean1 = nameAttributeTest0.findMatch(iterator0, iterator1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Constant constant0 = new Constant(2);
      Iterator iterator0 = constant0.iterate((EvalContext) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Iterator iterator1 = constant0.iterate((EvalContext) null);
      boolean boolean0 = nameAttributeTest0.findMatch(iterator0, iterator1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("ql'WJ~i#mRb]", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(variableReference0, variableReference0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationEqual0, coreOperationEqual0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(attributeContext0, nodeNameTest0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, selfContext0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, selfContext0, nodePointer0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContextReferenceImpl0.getPointer("d", (Expression) coreOperationMultiply0);
      assertNull(beanPointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, coreOperationOr0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNotEqual0, coreOperationNotEqual0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      boolean boolean0 = nameAttributeTest0.equal(rootContext0, coreOperationOr0, coreOperationNotEqual0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      int int0 = coreOperationEqual0.getPrecedence();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      boolean boolean0 = coreOperationEqual0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Constant constant0 = new Constant("t'7A~UOWTVLc8%WzET");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationEqual0);
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) coreOperationNegate0;
      expressionArray0[3] = (Expression) constant0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[3], coreOperationEqual0);
      boolean boolean0 = nameAttributeTest0.equal((EvalContext) null, expressionArray0[3], expressionArray0[0]);
      assertFalse(boolean0);
  }
}
