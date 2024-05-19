
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
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathCompiledExpression_ESTest extends JXPathCompiledExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      jXPathCompiledExpression0.removeAll(jXPathContext0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, nameAttributeTest0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationNotEqual0);
      String string0 = jXPathCompiledExpression0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreFunction0);
      String string0 = jXPathCompiledExpression0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant constant0 = new Constant("2Eaft7w-|z63swT");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) constant0);
      Iterator iterator0 = jXPathCompiledExpression0.iteratePointers(jXPathContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant constant0 = new Constant("");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) constant0);
      Iterator iterator0 = jXPathCompiledExpression0.iterate(jXPathContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-3184), expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, coreFunction0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, coreFunction0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, nameAttributeTest0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationLessThanOrEqual0);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("e[il+.`*fP|xE:", coreOperationOr0);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertEquals("e[il+.`*fP|xE:", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreFunction0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<Object> class0 = Object.class;
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0, class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant constant0 = new Constant("2Eaft7w-|z63swT");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) constant0);
      Class<Object> class0 = Object.class;
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0, class0);
      assertEquals("2Eaft7w-|z63swT", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant("A7y'_");
      CoreFunction coreFunction0 = new CoreFunction(1694, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreFunction0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, constant0);
      Object object0 = jXPathCompiledExpression0.getValue((JXPathContext) jXPathContextReferenceImpl0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant constant0 = new Constant("preceding");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0);
      assertEquals("preceding", object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant constant0 = new Constant("");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) constant0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathCompiledExpression0.getPointer(jXPathContext0, "");
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, (Expression) null);
      Expression expression0 = jXPathCompiledExpression0.getExpression();
      assertNull(expression0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[1] = (Expression) locationPath0;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, expressionArray0[1]);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", locationPath0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathCompiledExpression0.createPath(jXPathContextReferenceImpl0);
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName(">EyiU?0wq");
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("e[il+.`*fP|xE:", coreOperationOr0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue((JXPathContext) null, qName0);
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
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removePath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath ; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(2389, (Expression[]) null);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreFunction0, coreFunction0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", coreOperationMultiply0);
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
  public void test17()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      QName qName0 = new QName("N:6oGAC4/{<HC", "N:6oGAC4/{<HC");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(variableReference0, variableReference0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("N:6oGAC4/{<HC", coreOperationOr0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray0[2]);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: N:6oGAC4/{<HC:N:6oGAC4/{<HC
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      Step[] stepArray0 = new Step[9];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, (Expression[]) null, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", expressionPath0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, step0, (Pointer) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: :
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionPath0, expressionPath0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationMod0, coreOperationUnion0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("Z;t]12jA600L(=xF?j", coreOperationAdd0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, coreOperationSubtract0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContextReferenceImpl0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constant constant0 = new Constant("");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationMod0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
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
  public void test21()  throws Throwable  {
      QName qName0 = new QName("m^*KnK+=WFt03CZk");
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[2];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(step0).getAxis();
      doReturn((NodeTest) null, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      Short short0 = new Short((short)560);
      Constant constant0 = new Constant(short0);
      expressionArray0[1] = (Expression) constant0;
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[2] = (Expression) variableReference0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("m^*KnK+=WFt03CZk", extensionFunction0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "m^*KnK+=WFt03CZk");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: m^*KnK+=WFt03CZk
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", extensionFunction0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) qName0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreFunction coreFunction0 = new CoreFunction((-367), expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationMod0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationOr0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("_03l!xQ2Hefc8bW0");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(variableReference0, variableReference0);
      expressionArray0[1] = (Expression) coreOperationLessThanOrEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[2] = (Expression) extensionFunction0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("descendant::", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) coreOperationLessThanOrEqual0);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: _03l!xQ2Hefc8bW0
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, expressionArray0[0]);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[1], nameAttributeTest0);
      expressionArray0[2] = (Expression) coreOperationNotEqual0;
      expressionArray0[3] = (Expression) constant0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[1], expressionArray0, stepArray0);
      expressionArray0[4] = (Expression) expressionPath0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[5] = (Expression) coreOperationAdd0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      jXPathCompiledExpression0.getValue(jXPathContext0, class0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("0Cf`j?N\"$?g");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("0*`", variableReference0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: 0*`
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.compiler.Constant", (Expression) null);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue((JXPathContext) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("\u0004XB[hI ");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationEqual0, constant0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationMod0, coreOperationEqual0);
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("\u0004XB[hI ", expressionPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) stepArray0[1]);
      Class<Object> class0 = Object.class;
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
  public void test29()  throws Throwable  {
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, variableReference0);
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("aX[3%Sd<", expressionPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray0[0]);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("", "=");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", variableReference0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "=");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationNegate0, coreOperationNegate0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationSubtract0, coreOperationSubtract0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationGreaterThanOrEqual0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
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
  public void test32()  throws Throwable  {
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationEqual0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Constant constant0 = new Constant("");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, coreOperationMod0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationMultiply0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
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
  public void test34()  throws Throwable  {
      QName qName0 = new QName("", (String) null);
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, variableReference0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationDivide0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "namespace-uri");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(locationPath0, locationPath0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationUnion0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationAdd0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray0[1]);
      // Undeclared exception!
      jXPathCompiledExpression0.getPointer(jXPathContext0, "");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      QName qName0 = new QName("EaB+vib>Xrr}@+at`");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("a{", variableReference0);
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "EaB+vib>Xrr}@+at`");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath: EaB+vib>Xrr}@+at`
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationUnion0, coreOperationUnion0);
      Step[] stepArray0 = new Step[9];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationGreaterThan0, locationPath0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationAnd0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, (String) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("(8NPng\"rOD$", coreOperationAnd0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationAnd0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue(jXPathContext0, "(8NPng\"rOD$");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath (8NPng\"rOD$; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath ; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", locationPath0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, step0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue(jXPathContextReferenceImpl0, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath ; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Double double0 = new Double(0.0);
      Constant constant0 = new Constant(double0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("string", constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, jXPathCompiledExpression0);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue((JXPathContext) jXPathContextReferenceImpl0, (Class) class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMultiply0, coreOperationMultiply0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(nameAttributeTest0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationMod0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers((JXPathContext) null);
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
      Step[] stepArray0 = new Step[3];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(locationPath0, locationPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationMultiply0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locationPath0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removeAll(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(1694, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreFunction0);
      Expression expression0 = jXPathCompiledExpression0.getExpression();
      assertSame(coreFunction0, expression0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      QName qName0 = new QName("0Cf`j?N\"$?g");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("0*`", variableReference0);
      String string0 = jXPathCompiledExpression0.toString();
      assertEquals("0*`", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThan0, coreOperationGreaterThan0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNotEqual0, (Expression) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationEqual0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, nameAttributeTest0);
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
  public void test49()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationAnd0, coreOperationAnd0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationAnd0, coreOperationGreaterThanOrEqual0);
      QName qName0 = new QName("&quot;");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationAdd0, coreOperationNotEqual0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationSubtract0, extensionFunction0);
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, expressionPath0);
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
  public void test50()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.w3c.dom.Node", coreOperationAdd0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue((JXPathContext) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationAnd0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationAnd", e);
      }
  }
}
