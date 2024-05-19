
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
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExtensionFunction_ESTest extends ExtensionFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      QName qName0 = extensionFunction0.getFunctionName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationOr0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[0], expressionArray0[1]);
      expressionArray0[2] = (Expression) coreOperationNotEqual0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[1], expressionArray0[0]);
      expressionArray0[3] = (Expression) coreOperationMultiply0;
      expressionArray0[4] = (Expression) coreOperationOr0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      // Undeclared exception!
      extensionFunction0.toString();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("6s{`@lUBn");
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, (Expression) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationMultiply0, (Expression) null);
      expressionArray0[1] = (Expression) coreOperationEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Constant constant0 = new Constant(">o3");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNotEqual0, expressionArray0[0]);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray0[1], coreOperationAdd0);
      expressionArray0[2] = (Expression) coreOperationEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      // Undeclared exception!
      extensionFunction0.computeValue((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName(":g~v|U$gn(#");
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(4, expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreFunction0, coreFunction0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationEqual0, coreOperationEqual0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationOr0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationEqual0, expressionArray0[1]);
      expressionArray0[2] = (Expression) coreOperationGreaterThan0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationGreaterThanOrEqual0);
      expressionArray0[3] = (Expression) coreOperationNegate0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[3], expressionArray0[2]);
      expressionArray0[4] = (Expression) coreOperationMultiply0;
      expressionArray0[5] = (Expression) coreOperationOr0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: id((org.apache.commons.jxpath.ri.compiler.CoreOperationEqual@0000000003) >= (org.apache.commons.jxpath.ri.compiler.CoreOperationEqual@0000000003), org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual@0000000004 or org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000005 or org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan@0000000006 or org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000007 or org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply@0000000008 or org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000005, (org.apache.commons.jxpath.ri.compiler.CoreOperationEqual@0000000003) > (org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000005), -(org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual@0000000004), org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000007 * (org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan@0000000006), org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual@0000000004 or org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000005 or org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan@0000000006 or org.apache.commons.jxpath.ri.compiler.CoreOperationNegate@0000000007 or org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply@0000000008 or org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000005)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("P}");
      Byte byte0 = new Byte((byte)111);
      Constant constant0 = new Constant(byte0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationGreaterThanOrEqual0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationGreaterThanOrEqual0, constant0);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) coreOperationNegate0;
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[2] = (Expression) constant0;
      expressionArray0[3] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[4] = (Expression) coreOperationGreaterThan0;
      Expression[] expressionArray1 = new Expression[1];
      expressionArray1[0] = (Expression) constant0;
      coreOperationGreaterThan0.args = expressionArray1;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMod0, coreOperationMod0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationNotEqual0);
      expressionArray0[0] = (Expression) coreOperationNegate0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("");
      Expression[] expressionArray0 = new Expression[4];
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(variableReference0, variableReference0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationMultiply0, expressionArray0[0]);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[0]);
      Locale locale0 = Locale.TAIWAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, coreOperationMultiply0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        extensionFunction0.compute(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("2vMt5RgK]l/x^ 9");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Function) null).when(jXPathContextReferenceImpl0).getFunction(any(org.apache.commons.jxpath.ri.QName.class) , any(java.lang.Object[].class));
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        extensionFunction0.computeValue(rootContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("2vMt5RgK]l/x^ 9");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Expression[] expressionArray0 = new Expression[8];
      Expression[] expressionArray1 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray1);
      expressionArray0[0] = (Expression) coreOperationUnion0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.compute(rootContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExtensionFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("P}");
      Constant constant0 = new Constant("P}");
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationGreaterThanOrEqual0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationGreaterThanOrEqual0, constant0);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) coreOperationNegate0;
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[2] = (Expression) constant0;
      expressionArray0[3] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[4] = (Expression) coreOperationGreaterThan0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        extensionFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExtensionFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      Expression[] expressionArray0 = new Expression[4];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      String string0 = extensionFunction0.toString();
      assertEquals("(null, null, null, null)", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      String string0 = extensionFunction0.toString();
      assertEquals(":()", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        extensionFunction0.compute(evalContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: :
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("2vMt5RgK]l/x^ 9");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      boolean boolean0 = extensionFunction0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      QName qName1 = extensionFunction0.getFunctionName();
      assertSame(qName1, qName0);
  }
}
