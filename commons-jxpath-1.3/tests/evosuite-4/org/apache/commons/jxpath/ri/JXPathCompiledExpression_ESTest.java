
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


package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.JXPathCompiledExpression;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
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
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathCompiledExpression_ESTest extends JXPathCompiledExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("7D2PIKlHU~", variableReference0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      jXPathCompiledExpression0.removeAll(jXPathContext0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, (Expression) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationMultiply0, coreOperationMultiply0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThan0, coreOperationGreaterThan0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, nameAttributeTest0);
      String string0 = jXPathCompiledExpression0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", (Expression) null);
      String string0 = jXPathCompiledExpression0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("}2^", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Iterator iterator0 = jXPathCompiledExpression0.iteratePointers(jXPathContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("");
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, coreOperationLessThan0);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      QName qName0 = new QName("");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionArray0[1], nodePointer0);
      Iterator iterator0 = jXPathCompiledExpression0.iterate(jXPathContextReferenceImpl0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, locationPath0);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("L3o8!AU*Xl<Ev");
      Expression[] expressionArray0 = new Expression[7];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("L3o8!AU*Xl<Ev", extensionFunction0);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertEquals("L3o8!AU*Xl<Ev", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("M]W7wFBm]", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0, class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.JXPathCompiledExpression");
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) step0);
      Class<Object> class0 = Object.class;
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0, class0);
      assertEquals("org.apache.commons.jxpath.ri.JXPathCompiledExpression", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("}2^", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant constant0 = new Constant("zH,9@Xt!AY!");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) constant0);
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0);
      assertEquals("zH,9@Xt!AY!", object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant constant0 = new Constant("\"namespace::\"");
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, coreOperationMultiply0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("TKA", coreOperationSubtract0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "TKA");
      BeanPointer beanPointer0 = (BeanPointer)jXPathCompiledExpression0.getPointer(jXPathContext0, "");
      assertTrue(beanPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, (Expression) null);
      Expression expression0 = jXPathCompiledExpression0.getExpression();
      assertNull(expression0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("");
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, coreOperationLessThan0);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      QName qName0 = new QName("");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionArray0[1], nodePointer0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathCompiledExpression0.createPath(jXPathContextReferenceImpl0);
      assertEquals(0, beanPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Float float0 = new Float(0.0);
      Constant constant0 = new Constant(float0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", coreOperationLessThanOrEqual0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue((JXPathContext) null, "org.apache.commons.jxpath.ri.JXPathCompiledExpression");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      QName qName0 = new QName("");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionArray0[1], nodePointer0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removePath(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath ; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationAnd0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removeAll(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath ; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName(":odx<n]", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(variableReference0, coreOperationUnion0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression(":odx<n]", coreOperationMod0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :odx<n]:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.JXPathCompiledExpression", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", coreOperationNegate0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: org.apache.commons.jxpath.ri.JXPathCompiledExpression:
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(locationPath0, locationPath0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(locationPath0, coreOperationMod0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationNotEqual0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locationPath0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(variableReference0, variableReference0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMultiply0, coreOperationMultiply0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationDivide0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationMultiply0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationOr0, expressionArray0[3]);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationSubtract0, coreOperationAnd0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationDivide0, expressionArray0[0]);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", coreOperationGreaterThanOrEqual0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreFunction0);
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
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
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", variableReference0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionArray0[5]);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue((JXPathContext) jXPathContextReferenceImpl0, (Class) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationOr0, coreOperationOr0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationEqual0, coreOperationEqual0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThanOrEqual0, coreOperationOr0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      QName qName0 = new QName("'VU@DWtHhzskft");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], extensionFunction0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[3], coreOperationGreaterThanOrEqual0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationNotEqual0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("'VU@DWtHhzskft", coreOperationDivide0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Float float0 = new Float(0.0);
      Constant constant0 = new Constant(float0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "org.apache.commons.jxpath.ri.JXPathCompiledExpression");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", constant0);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(89, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationOr0, coreOperationOr0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationGreaterThanOrEqual0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationOr0);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("vtY_mX#]#I?#8D");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, variableReference0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationDivide0, coreOperationDivide0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("vtY_mX#]#I?#8D", coreOperationSubtract0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationDivide0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: vtY_mX#]#I?#8D
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.LocationPath");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression(",", variableReference0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) ",");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: ,
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("cT_F<LK'", (String) null);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(extensionFunction0, extensionFunction0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      Expression[] expressionArray1 = new Expression[6];
      expressionArray1[0] = (Expression) extensionFunction0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray1);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("cT_F<LK'", coreOperationAnd0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray1[4]);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Constant constant0 = new Constant("/Ez}^/p.25(%");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMod0, coreOperationMod0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("/Ez}^/p.25(%", coreOperationLessThanOrEqual0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName("\"not\"", "s\u0004#(OUZn}");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[0], expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      Double double0 = new Double(0.0);
      Constant constant0 = new Constant(double0);
      expressionArray0[2] = (Expression) constant0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      expressionArray0[3] = (Expression) coreOperationLessThan0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[4] = (Expression) coreOperationOr0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("\"not\"", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationAdd0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "s\u0004#(OUZn}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: \"not\":s\u0004#(OUZn}
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, locationPath0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContextReferenceImpl0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath: null
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-1536), (Expression[]) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreFunction0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNotEqual0, coreOperationNotEqual0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThan0, coreFunction0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("/>L; mI", coreOperationMod0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "/>L; mI");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, (String) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Short short0 = new Short((short)1997);
      Constant constant0 = new Constant(short0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", constant0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue((JXPathContext) null, constant0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Constant constant0 = new Constant("zH,9@Xt!AY!");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) constant0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath null; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[9];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationOr0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) locationPath0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationAnd0, coreOperationAnd0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationSubtract0, coreOperationSubtract0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("YCTXcEFx'S", coreOperationNotEqual0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, jXPathCompiledExpression0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue(jXPathContextReferenceImpl0, jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath YCTXcEFx'S; Cannot set value for xpath: YCTXcEFx'S
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationOr0, coreOperationOr0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationEqual0, coreOperationEqual0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThanOrEqual0, coreOperationOr0);
      QName qName0 = new QName("'VU@DWtHhzskft");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], extensionFunction0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[3], coreOperationGreaterThanOrEqual0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationNotEqual0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("'VU@DWtHhzskft", coreOperationDivide0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", (Expression) null);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Long long0 = new Long(0L);
      Constant constant0 = new Constant(long0);
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationAdd0, expressionPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("\"preceding::\"", coreOperationLessThanOrEqual0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationAdd", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", (Expression) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Float float0 = new Float(0.0);
      Constant constant0 = new Constant(float0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("w-o@~", constant0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removeAll((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationOr0, coreOperationOr0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationEqual0, coreOperationEqual0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThanOrEqual0, coreOperationOr0);
      QName qName0 = new QName("'VU@DWtHhzskft");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], extensionFunction0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[3], coreOperationGreaterThanOrEqual0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationNotEqual0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("'VU@DWtHhzskft", coreOperationDivide0);
      CoreOperationDivide coreOperationDivide1 = (CoreOperationDivide)jXPathCompiledExpression0.getExpression();
      assertEquals("div", coreOperationDivide1.getSymbol());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", coreOperationAdd0);
      String string0 = jXPathCompiledExpression0.toString();
      assertEquals("org.apache.commons.jxpath.ri.JXPathCompiledExpression", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationUnion0, expressionArray0[1]);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationMod0, expressionArray0[6]);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThanOrEqual0, expressionArray0[5]);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("dD4{+<H]mc:=", nameAttributeTest0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("Aqdm<ip9V -WX%D*", coreOperationGreaterThan0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removePath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathInvalidAccessException");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[5];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, (Step[]) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.JXPathInvalidAccessException", expressionPath0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue(jXPathContext0, expressionPath0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath org.apache.commons.jxpath.JXPathInvalidAccessException; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAnd0, expressionArray0[1]);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("\"floor\"", coreOperationEqual0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "\"floor\"");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContextReferenceImpl0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
