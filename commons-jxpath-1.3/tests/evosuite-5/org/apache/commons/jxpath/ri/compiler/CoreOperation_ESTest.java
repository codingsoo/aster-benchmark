
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperation_ESTest extends CoreOperation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAdd0, coreOperationAdd0);
      EvalContext[] evalContextArray0 = new EvalContext[9];
      Object object0 = coreOperationLessThan0.computeValue(evalContextArray0[0]);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Object object0 = coreOperationAnd0.compute((EvalContext) null);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      String string0 = coreOperationAnd0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationUnion0, coreOperationAdd0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, nameAttributeTest0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationLessThanOrEqual0);
      String string0 = coreOperationNegate0.getSymbol();
      assertEquals("-", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("N{C\"HTeE{<", "N{C\"HTeE{<");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationNegate0, coreOperationNegate0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationEqual0, coreOperationNegate0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "(org.apache.commons.jxpath.ri.compiler.CoreOperationEqual@0000000004) > org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000003");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        coreOperationGreaterThan0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: N{C\"HTeE{<:N{C\"HTeE{<
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("N{C\"H.eE+{5<>", "N{C\"H.eE+{5<>");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationNegate0, coreOperationNegate0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationEqual0, coreOperationNegate0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationGreaterThan0);
      Locale locale0 = new Locale("kh{tN$\")=,r=", "$N{C\"H.eE+{5<>:N{C\"H.eE+{5<>");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      // Undeclared exception!
      try { 
        coreOperationGreaterThan0.compute(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: N{C\"H.eE+{5<>:N{C\"H.eE+{5<>
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperation");
      Expression[] expressionArray0 = new Expression[0];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(extensionFunction0, extensionFunction0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.compiler.CoreOperation");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, processingInstructionTest0);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, extensionFunction0);
      // Undeclared exception!
      try { 
        coreOperationSubtract0.compute(predicateContext0);
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
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan((Expression) null, (Expression) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationLessThan0, coreOperationLessThan0);
      String string0 = coreOperationLessThanOrEqual0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationOr0;
      // Undeclared exception!
      try { 
        coreOperationOr0.toString();
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
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName("Wk_q^H/-eOCCAKXcs");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      String string0 = coreOperationUnion0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationAnd0, coreOperationAnd0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreOperationGreaterThan0.computeValue(parentContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationAnd", e);
      }
  }
}
