
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


package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SimplePathInterpreter;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
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
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
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
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SimplePathInterpreter_ESTest extends SimplePathInterpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertTrue(jXPathBasicBeanInfo0.isAtomic());
      assertNotNull(jXPathBasicBeanInfo0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertTrue(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertEquals(0, initialContext0.getPosition());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(initialContext0);
      
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[5];
      Expression[] expressionArray1 = new Expression[0];
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray1).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(initialContext0, beanPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1788));
      assertEquals((-1788), nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, false, false);
      assertEquals((-1788), nodeTypeTest0.getNodeType());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertFalse(childContext0.isChildOrderingRequired());
      assertNotNull(childContext0);
      
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext(childContext0, evalContextArray0);
      assertEquals(5, evalContextArray0.length);
      assertEquals((-1788), nodeTypeTest0.getNodeType());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertFalse(childContext0.isChildOrderingRequired());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(0, unionContext0.getPosition());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertNotNull(unionContext0);
      
      Constant constant0 = new Constant(">");
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertNotNull(constant0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) ">");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("", (String) null);
      assertNull(qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":null", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":null", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[4];
      Expression[] expressionArray1 = new Expression[1];
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      
      expressionArray1[0] = (Expression) constant0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-1788), 2178, 1, (-855), 2178).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray1, (Object) expressionArray1, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      NullPointer nullPointer0 = (NullPointer)SimplePathInterpreter.interpretSimpleExpressionPath(unionContext0, variablePointer0, expressionArray0, stepArray0);
      assertEquals(5, evalContextArray0.length);
      assertEquals(0, expressionArray0.length);
      assertEquals(4, stepArray0.length);
      assertEquals((-1788), nodeTypeTest0.getNodeType());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertFalse(childContext0.isChildOrderingRequired());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(0, unionContext0.getPosition());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":null", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(expressionArray0.equals((Object)expressionArray1));
      assertNotNull(nullPointer0);
      assertNotSame(expressionArray0, expressionArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(0, evalContext0.getPosition());
      assertEquals(0, evalContext0.getDocumentOrder());
      assertFalse(evalContext0.isChildOrderingRequired());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(evalContext0);
      
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = evalContext0;
      evalContextArray0[1] = evalContext0;
      evalContextArray0[2] = evalContext0;
      evalContextArray0[3] = evalContext0;
      evalContextArray0[4] = evalContext0;
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContextArray0[0], nodeNameTest0, false);
      assertEquals(8, evalContextArray0.length);
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals(1, precedingOrFollowingContext0.getDocumentOrder());
      assertEquals(0, precedingOrFollowingContext0.getPosition());
      assertTrue(precedingOrFollowingContext0.isChildOrderingRequired());
      assertNotNull(precedingOrFollowingContext0);
      
      evalContextArray0[5] = (EvalContext) precedingOrFollowingContext0;
      evalContextArray0[6] = evalContext0;
      evalContextArray0[7] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      assertEquals(8, evalContextArray0.length);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(0, evalContext0.getPosition());
      assertEquals(0, evalContext0.getDocumentOrder());
      assertFalse(evalContext0.isChildOrderingRequired());
      assertEquals(0, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(unionContext0);
      
      BeanPointer beanPointer0 = (BeanPointer)unionContext0.getCurrentNodePointer();
      assertEquals(8, evalContextArray0.length);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(2, evalContext0.getPosition());
      assertEquals(0, evalContext0.getDocumentOrder());
      assertFalse(evalContext0.isChildOrderingRequired());
      assertEquals(1, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(0, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[7];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      BeanPointer beanPointer1 = (BeanPointer)SimplePathInterpreter.interpretSimpleExpressionPath(evalContext0, beanPointer0, expressionArray0, stepArray0);
      assertEquals(0, expressionArray0.length);
      assertEquals(7, stepArray0.length);
      assertEquals(8, evalContextArray0.length);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(2, evalContext0.getPosition());
      assertEquals(0, evalContext0.getDocumentOrder());
      assertFalse(evalContext0.isChildOrderingRequired());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isAttribute());
      assertTrue(beanPointer1.isRoot());
      assertEquals(1, beanPointer1.getLength());
      assertEquals(0, beanPointer1.getIndex());
      assertFalse(beanPointer1.isContainer());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(1, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(0, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertSame(beanPointer0, beanPointer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertEquals(0, namespaceContext0.getPosition());
      assertNotNull(namespaceContext0);
      
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals(0, ancestorContext0.getPosition());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertNotNull(ancestorContext0);
      
      NodePointer nodePointer0 = ancestorContext0.getCurrentNodePointer();
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals(0, ancestorContext0.getPosition());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertNull(nodePointer0);
      
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[4];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      NodePointer nodePointer1 = SimplePathInterpreter.interpretSimpleExpressionPath(namespaceContext0, (NodePointer) null, expressionArray0, stepArray0);
      assertEquals(0, expressionArray0.length);
      assertEquals(4, stepArray0.length);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertEquals(0, namespaceContext0.getPosition());
      assertNull(nodePointer1);
      
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      assertNotNull(simplePathInterpreter0);
      
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(ancestorContext0, (NodePointer) null, stepArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertEquals(0, namespaceContext0.getPosition());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertNotNull(namespaceContext0);
      
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertEquals(0, ancestorContext0.getPosition());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertNotNull(ancestorContext0);
      
      NodePointer nodePointer0 = ancestorContext0.getCurrentNodePointer();
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertEquals(0, ancestorContext0.getPosition());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertNull(nodePointer0);
      
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[4];
      Expression[] expressionArray1 = new Expression[4];
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertNotNull(constant0);
      
      expressionArray1[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray1);
      assertEquals(4, expressionArray1.length);
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertNotNull(coreFunction0);
      
      Expression expression0 = coreFunction0.getArg1();
      assertEquals(4, expressionArray1.length);
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertFalse(expression0.computeContextDependent());
      assertFalse(expression0.isContextDependent());
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertNotNull(expression0);
      assertNotSame(expressionArray1, expressionArray0);
      assertSame(expression0, constant0);
      
      expressionArray1[1] = expression0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreFunction0, expressionArray1[0]);
      assertEquals(4, expressionArray1.length);
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertEquals("=", coreOperationEqual0.getSymbol());
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertNotNull(coreOperationEqual0);
      
      expressionArray1[2] = (Expression) coreOperationEqual0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, expressionArray1[0]);
      assertEquals(4, expressionArray1.length);
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertEquals("-", coreOperationSubtract0.getSymbol());
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertNotNull(coreOperationSubtract0);
      
      expressionArray1[3] = (Expression) coreOperationSubtract0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, 0).when(step0).getAxis();
      doReturn((Object) expressionArray1, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      NodePointer nodePointer1 = SimplePathInterpreter.interpretSimpleExpressionPath(namespaceContext0, (NodePointer) null, expressionArray0, stepArray0);
      assertEquals(0, expressionArray0.length);
      assertEquals(4, stepArray0.length);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertEquals(0, namespaceContext0.getPosition());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertFalse(expressionArray0.equals((Object)expressionArray1));
      assertNull(nodePointer1);
      assertNotSame(expressionArray0, expressionArray1);
      
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      assertNotNull(simplePathInterpreter0);
      
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(ancestorContext0, (NodePointer) null, stepArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertNotNull(jXPathBasicBeanInfo0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertEquals(0, initialContext0.getPosition());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(initialContext0);
      
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      assertEquals(4, expressionArray0.length);
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreFunction0, coreFunction0);
      assertEquals(4, expressionArray0.length);
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
      assertNotNull(coreOperationLessThanOrEqual0);
      
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      assertEquals(4, expressionArray0.length);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertNotNull(coreOperationOr0);
      
      expressionArray0[1] = (Expression) coreOperationOr0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreFunction0, expressionArray0[0]);
      assertEquals(4, expressionArray0.length);
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertEquals("*", coreOperationMultiply0.getSymbol());
      assertNotNull(coreOperationMultiply0);
      
      expressionArray0[2] = (Expression) coreOperationMultiply0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      assertEquals(4, expressionArray0.length);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertNotNull(coreOperationAdd0);
      
      expressionArray0[3] = (Expression) coreOperationAdd0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      SimplePathInterpreter.interpretSimpleLocationPath(initialContext0, beanPointer0, stepArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      QName qName0 = new QName("");
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fr_CA", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fr_CA", locale0.toString());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      Step[] stepArray0 = new Step[4];
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      assertEquals(9, expressionArray0.length);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertNotNull(coreOperationOr0);
      
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, coreOperationOr0);
      assertEquals(9, expressionArray0.length);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertNotNull(coreOperationNotEqual0);
      
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationNotEqual0);
      assertEquals(9, expressionArray0.length);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertEquals("-", coreOperationNegate0.getSymbol());
      assertNotNull(coreOperationNegate0);
      
      expressionArray0[0] = (Expression) coreOperationNegate0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-981)).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, beanPointer0, stepArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", ">80s8");
      assertEquals(":>80s8", qName0.toString());
      assertEquals(">80s8", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(":>80s8", qName0.toString());
      assertEquals(">80s8", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(":>80s8", qName0.toString());
      assertEquals(">80s8", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(rootContext0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals(":>80s8", qName0.toString());
      assertEquals(">80s8", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":>80s8", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, nodeNameTest0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(":>80s8", qName0.toString());
      assertEquals(">80s8", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(":>80s8", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals(0, namespaceContext0.getDocumentOrder());
      assertFalse(namespaceContext0.isChildOrderingRequired());
      assertEquals(0, namespaceContext0.getPosition());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(namespaceContext0);
      
      Step[] stepArray0 = new Step[9];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(namespaceContext0, variablePointer0, stepArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':>80s8'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertNotNull(jXPathBasicBeanInfo0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertEquals(0, initialContext0.getPosition());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(initialContext0);
      
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertNotNull(constant0);
      
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
      assertNotNull(coreOperationGreaterThanOrEqual0);
      
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, coreOperationGreaterThanOrEqual0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
      assertEquals("mod", coreOperationMod0.getSymbol());
      assertNotNull(coreOperationMod0);
      
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, coreOperationMod0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
      assertEquals("mod", coreOperationMod0.getSymbol());
      assertEquals("*", coreOperationMultiply0.getSymbol());
      assertNotNull(coreOperationMultiply0);
      
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(initialContext0, beanPointer0, stepArray0);
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
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      assertNotNull(simplePathInterpreter0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) simplePathInterpreter0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("bgy3Si:&/N}M:Az");
      assertEquals("bgy3Si", qName0.getPrefix());
      assertEquals("bgy3Si:&/N}M:Az", qName0.toString());
      assertEquals("&/N}M:Az", qName0.getName());
      assertNotNull(qName0);
      
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      assertTrue(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertNotNull(jXPathBasicBeanInfo0);
      
      Locale locale0 = Locale.ENGLISH;
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      assertEquals("bgy3Si", qName0.getPrefix());
      assertEquals("bgy3Si:&/N}M:Az", qName0.toString());
      assertEquals("&/N}M:Az", qName0.getName());
      assertTrue(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContextReferenceImpl0, jXPathContextReferenceImpl0, beanPointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("bgy3Si", qName0.getPrefix());
      assertEquals("bgy3Si:&/N}M:Az", qName0.toString());
      assertEquals("&/N}M:Az", qName0.getName());
      assertTrue(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl0));
      assertNotNull(jXPathContextReferenceImpl1);
      
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl1.getAbsoluteRootContext();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("bgy3Si", qName0.getPrefix());
      assertEquals("bgy3Si:&/N}M:Az", qName0.toString());
      assertEquals("&/N}M:Az", qName0.getName());
      assertTrue(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertEquals(0, initialContext0.getPosition());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.equals((Object)jXPathContextReferenceImpl1));
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl0));
      assertNotNull(initialContext0);
      assertNotSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertNotSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
      
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      assertEquals(0, stepArray0.length);
      assertTrue(locationPath0.isAbsolute());
      assertNotNull(locationPath0);
      
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(locationPath0, locationPath0);
      assertEquals(0, stepArray0.length);
      assertTrue(locationPath0.isAbsolute());
      assertEquals("=", coreOperationEqual0.getSymbol());
      assertNotNull(coreOperationEqual0);
      
      expressionArray0[0] = (Expression) coreOperationEqual0;
      expressionArray0[1] = (Expression) locationPath0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(initialContext0, beanPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Predicate value is null: 
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      assertNotNull(simplePathInterpreter0);
      
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("name");
      assertEquals("name", qName0.getName());
      assertEquals("name", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.ITALY;
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("ITA", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, simplePathInterpreter0, locale0);
      assertEquals("name", qName0.getName());
      assertEquals("name", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("ITA", locale0.getISO3Country());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      assertEquals("name", qName0.getName());
      assertEquals("name", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("ITA", locale0.getISO3Country());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertFalse(nullPropertyPointer0.isCollection());
      assertFalse(nullPropertyPointer0.isRoot());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertFalse(nullPropertyPointer0.isActual());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertFalse(nullPropertyPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getIndex());
      assertFalse(nullPropertyPointer0.isAttribute());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertTrue(nullPropertyPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      assertNotNull(nullPropertyPointer0);
      
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      assertEquals(4, expressionArray0.length);
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertNotNull(coreFunction0);
      
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreFunction0, coreFunction0);
      assertEquals(4, expressionArray0.length);
      assertEquals(Integer.MIN_VALUE, coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
      assertNotNull(coreOperationGreaterThanOrEqual0);
      
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      assertEquals(4, expressionArray0.length);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertNotNull(coreOperationAdd0);
      
      expressionArray0[1] = (Expression) coreOperationAdd0;
      // Undeclared exception!
      SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, nullPropertyPointer0, expressionArray0, stepArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      assertNotNull(simplePathInterpreter0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) simplePathInterpreter0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("i5a-i? }N&Oj?", ",(vl:MLF0Y");
      assertEquals(",(vl:MLF0Y", qName0.getName());
      assertEquals("i5a-i? }N&Oj?:,(vl:MLF0Y", qName0.toString());
      assertEquals("i5a-i? }N&Oj?", qName0.getPrefix());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.UK;
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("GB", locale0.getCountry());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("en_GB", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals(",(vl:MLF0Y", qName0.getName());
      assertEquals("i5a-i? }N&Oj?:,(vl:MLF0Y", qName0.toString());
      assertEquals("i5a-i? }N&Oj?", qName0.getPrefix());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("GB", locale0.getCountry());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("en_GB", locale0.toString());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(",(vl:MLF0Y", qName0.getName());
      assertEquals("i5a-i? }N&Oj?:,(vl:MLF0Y", qName0.toString());
      assertEquals("i5a-i? }N&Oj?", qName0.getPrefix());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("GB", locale0.getCountry());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("en_GB", locale0.toString());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(rootContext0);
      
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      assertEquals(5, evalContextArray0.length);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(",(vl:MLF0Y", qName0.getName());
      assertEquals("i5a-i? }N&Oj?:,(vl:MLF0Y", qName0.toString());
      assertEquals("i5a-i? }N&Oj?", qName0.getPrefix());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("GB", locale0.getCountry());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("en_GB", locale0.toString());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(0, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(unionContext0);
      
      Expression[] expressionArray0 = new Expression[7];
      Float float0 = new Float((double) Integer.MIN_VALUE);
      assertEquals((-2.14748365E9F), (float)float0, 0.01F);
      assertNotNull(float0);
      
      Constant constant0 = new Constant(float0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertNotNull(constant0);
      
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("<", coreOperationLessThan0.getSymbol());
      assertNotNull(coreOperationLessThan0);
      
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      Expression[] expressionArray1 = new Expression[3];
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      
      expressionArray1[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(27, expressionArray0);
      assertEquals(7, expressionArray0.length);
      assertEquals(7, coreFunction0.getArgumentCount());
      assertEquals(27, coreFunction0.getFunctionCode());
      assertFalse(expressionArray0.equals((Object)expressionArray1));
      assertNotNull(coreFunction0);
      
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray1);
      assertEquals(3, expressionArray1.length);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertNotNull(coreOperationOr0);
      
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, expressionArray1[0]);
      assertEquals(3, expressionArray1.length);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertNotNull(coreOperationNotEqual0);
      
      expressionArray0[1] = (Expression) coreOperationNotEqual0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationOr0, coreOperationLessThan0);
      assertEquals(3, expressionArray1.length);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertEquals("-", coreOperationSubtract0.getSymbol());
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("<", coreOperationLessThan0.getSymbol());
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertNotNull(coreOperationSubtract0);
      
      expressionArray0[2] = (Expression) coreOperationSubtract0;
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, stepArray0);
      assertEquals(6, stepArray0.length);
      assertEquals(7, expressionArray0.length);
      assertEquals(3, expressionArray1.length);
      assertEquals("or", coreOperationOr0.getSymbol());
      assertFalse(expressionArray0.equals((Object)expressionArray1));
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertNotNull(expressionPath0);
      
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, expressionPath0);
      assertEquals(6, stepArray0.length);
      assertEquals(7, expressionArray0.length);
      assertEquals(3, expressionArray1.length);
      assertEquals(7, coreFunction0.getArgumentCount());
      assertEquals(27, coreFunction0.getFunctionCode());
      assertEquals("or", coreOperationOr0.getSymbol());
      assertEquals("mod", coreOperationMod0.getSymbol());
      assertFalse(expressionArray0.equals((Object)expressionArray1));
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      assertNotNull(coreOperationMod0);
      
      expressionArray0[3] = (Expression) coreOperationMod0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(unionContext0, beanPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: round(org.apache.commons.jxpath.ri.compiler.Constant@0000000012 < org.apache.commons.jxpath.ri.compiler.Constant@0000000012, (org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000015) != org.apache.commons.jxpath.ri.compiler.Constant@0000000012, (org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000015) - (org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan@0000000013), org.apache.commons.jxpath.ri.compiler.CoreFunction@0000000014 mod org.apache.commons.jxpath.ri.compiler.ExpressionPath@0000000018, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[4];
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      Step[] stepArray0 = new Step[7];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(evalContextArray0[0], variablePointer0, stepArray0, 47);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(0, ancestorContext0.getPosition());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertNotNull(ancestorContext0);
      
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      assertEquals("", processingInstructionTest0.getTarget());
      assertNotNull(processingInstructionTest0);
      
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(step0).getAxis();
      doReturn(processingInstructionTest0).when(step0).getNodeTest();
      stepArray0[1] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(ancestorContext0, (NodePointer) null, stepArray0, 1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest cannot be cast to org.apache.commons.jxpath.ri.compiler.NodeNameTest
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      Locale locale0 = Locale.ROOT;
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(nullPointer0);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(rootContext0);
      
      Step[] stepArray0 = new Step[0];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(rootContext0, nullPointer0, stepArray0, 2577);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2577
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = new NullPointer(locale0, "c{@yk");
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(nullPointer0);
      
      Step[] stepArray0 = new Step[0];
      NullPointer nullPointer1 = (NullPointer)SimplePathInterpreter.createNullPointer((EvalContext) null, nullPointer0, stepArray0, 0);
      assertEquals(0, stepArray0.length);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer1.isCollection());
      assertTrue(nullPointer1.isLeaf());
      assertNull(nullPointer1.getNamespaceURI());
      assertFalse(nullPointer1.isAttribute());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer1.isNode());
      assertEquals(0, nullPointer1.getLength());
      assertTrue(nullPointer1.isRoot());
      assertFalse(nullPointer1.isActual());
      assertFalse(nullPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(nullPointer1);
      assertSame(nullPointer0, nullPointer1);
      assertSame(nullPointer1, nullPointer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("d");
      assertEquals("d", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("d", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("d", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("d", qName0.toString());
      assertEquals("d", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      assertEquals("d", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("d", qName0.toString());
      assertEquals("d", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals(0, ancestorContext0.getPosition());
      assertEquals((-1), ancestorContext0.getDocumentOrder());
      assertTrue(ancestorContext0.isChildOrderingRequired());
      assertNotNull(ancestorContext0);
      
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[4];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(step0).getAxis();
      doReturn(nodeNameTest0).when(step0).getNodeTest();
      doReturn(expressionArray0).when(step0).getPredicates();
      stepArray0[1] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(ancestorContext0, (NodePointer) null, stepArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1788));
      assertEquals((-1788), nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, false, false);
      assertEquals((-1788), nodeTypeTest0.getNodeType());
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertNotNull(childContext0);
      
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext(childContext0, evalContextArray0);
      assertEquals(5, evalContextArray0.length);
      assertEquals((-1788), nodeTypeTest0.getNodeType());
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertEquals(0, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertNotNull(unionContext0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) ">");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("", (String) null);
      assertNull(qName0.getName());
      assertEquals(":null", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(qName0.getName());
      assertEquals(":null", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[4];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-1788), 2178, Integer.MIN_VALUE, 2).when(step0).getAxis();
      doReturn(nodeTypeTest0).when(step0).getNodeTest();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(unionContext0, variablePointer0, expressionArray0, stepArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.NodeTypeTest cannot be cast to org.apache.commons.jxpath.ri.compiler.NodeNameTest
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1788));
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, false, false);
      Constant constant0 = new Constant(">");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) ">");
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Expression[] expressionArray1 = new Expression[3];
      expressionArray1[0] = (Expression) constant0;
      expressionArray1[1] = (Expression) constant0;
      expressionArray1[2] = (Expression) constant0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-1788), 2178, Integer.MIN_VALUE, (-2043), (-1997)).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray1).when(step0).getPredicates();
      Step[] stepArray0 = new Step[8];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      stepArray0[7] = step0;
      NullElementPointer nullElementPointer0 = (NullElementPointer)SimplePathInterpreter.interpretSimpleLocationPath(childContext0, variablePointer0, stepArray0);
      assertEquals(0, nullElementPointer0.getIndex());
      assertNotNull(nullElementPointer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("name");
      Locale locale0 = Locale.ITALY;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, simplePathInterpreter0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, nullPropertyPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName(".ATAzqdjjZ|T4LG");
      Object object0 = new Object();
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      Step[] stepArray0 = new Step[6];
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[0], coreOperationDivide0);
      CoreFunction coreFunction0 = new CoreFunction(31, expressionArray0);
      Expression[] expressionArray1 = new Expression[2];
      expressionArray1[0] = (Expression) nameAttributeTest0;
      expressionArray1[1] = (Expression) coreFunction0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray1).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nodePointer0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Predicate value is null: unknownFunction31()(null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[3];
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(1730).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(initialContext0, beanPointer0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThanOrEqual0, coreFunction0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step[] stepArray0 = new Step[9];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, (NodePointer) null, expressionArray0, stepArray0);
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
      Object object0 = new Object();
      QName qName0 = new QName("");
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      Step[] stepArray0 = new Step[4];
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(step0).getAxis();
      doReturn((Expression[]) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nodePointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1788));
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, false, false);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext(childContext0, evalContextArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) ">");
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[4];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(step0).getAxis();
      doReturn((NodeTest) null).when(step0).getNodeTest();
      doReturn(expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(unionContext0, variablePointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(55, 55).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nullPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[5];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      BeanPointer beanPointer1 = (BeanPointer)SimplePathInterpreter.interpretSimpleLocationPath(initialContext0, beanPointer0, stepArray0);
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertNotNull(beanPointer1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("Kz $*Ce", "Kz $*Ce");
      Expression[] expressionArray0 = new Expression[0];
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      Step[] stepArray0 = new Step[0];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, variablePointer0, expressionArray0, stepArray0);
      assertTrue(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, (NodePointer) null, stepArray0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("name");
      Locale locale0 = Locale.ITALY;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, simplePathInterpreter0, locale0);
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, nodePointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }
}
