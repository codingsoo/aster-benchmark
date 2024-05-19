
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LocationPath_ESTest extends LocationPath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.isAbsolute();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn(namespaceResolver0, namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("/null/null/null/null/null", "/null/null/null/null/null");
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "/null/null/null/null/null", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, step0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      locationPath0.computeValue(evalContext0);
      assertTrue(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.FRENCH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      locationPath0.computeValue(initialContext0);
      assertFalse(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("a1kHS~nylipt!fyr:", "a1kHS~nylipt!fyr:");
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "a1kHS~nylipt!fyr:", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, stepArray0[0], nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      locationPath0.compute(evalContext0);
      assertTrue(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("&od&z;2)iU/`B;cbCqe");
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      locationPath0.compute(rootContext0);
      assertFalse(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, coreOperationUnion0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAnd0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationUnion0, expressionArray0[1]);
      expressionArray0[2] = (Expression) coreOperationLessThan0;
      expressionArray0[3] = (Expression) coreOperationLessThan0;
      expressionArray0[4] = (Expression) coreOperationLessThan0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationLessThan0, coreOperationAnd0);
      expressionArray0[5] = (Expression) coreOperationSubtract0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationEqual0, coreOperationEqual0);
      expressionArray0[6] = (Expression) coreOperationGreaterThan0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
      expressionArray0[7] = (Expression) expressionPath0;
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      locationPath0.toString();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, " rS=.P$}vT]>~FvQOA{");
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual((Expression) null, (Expression) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationLessThanOrEqual0, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.toString();
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
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAnd0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationNegate0, coreOperationAnd0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionPath0, coreOperationNotEqual0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
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
  public void test10()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
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
  public void test11()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.isAbsolute();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-9), (NodeTest) null, expressionArray0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn(namespaceResolver0, namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null", "/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null");
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, step0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        locationPath0.computeValue(evalContext0);
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
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-9), (NodeTest) null, expressionArray0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn(namespaceResolver0, namespaceResolver0).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null", "/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null");
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null/UNKNOWN::null", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, step0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        locationPath0.compute(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      String string0 = locationPath0.toString();
      assertEquals("null/null/null/null", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      locationPath0.toString();
      assertTrue(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(23, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      Expression[] expressionArray1 = new Expression[4];
      Constant constant0 = new Constant("");
      expressionArray1[0] = (Expression) constant0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray1[0], expressionArray1[0]);
      expressionArray1[1] = (Expression) nameAttributeTest0;
      Step step1 = new Step(23, nodeNameTest0, expressionArray1);
      stepArray0[4] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
      assertTrue(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      boolean boolean0 = locationPath0.isContextDependent();
      assertTrue(boolean0);
  }
}
