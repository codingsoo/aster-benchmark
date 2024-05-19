
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PredicateContext_ESTest extends PredicateContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("o|14ce%E");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "7V.p33F'rV_rc8ii");
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, true, nodeNameTest0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate((Expression) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationNegate0, coreOperationNegate0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationEqual0, coreOperationEqual0);
      PredicateContext predicateContext0 = new PredicateContext(ancestorContext0, coreOperationGreaterThanOrEqual0);
      boolean boolean0 = predicateContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-3180));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant("#/");
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, constant0);
      predicateContext0.reset();
      assertEquals(0, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nullPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, (Expression) null);
      boolean boolean0 = predicateContext0.nextSet();
      boolean boolean1 = predicateContext0.nextSet();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) fileSystemHandling0);
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("R6LuT}J+4t$)nC/0,=D");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(variableReference0, variableReference0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAnd0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationAnd0, expressionArray0[1]);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContextReferenceImpl0.getPointer("", (Expression) coreOperationGreaterThanOrEqual0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      SelfContext selfContext0 = new SelfContext(rootContext0, (NodeTest) null);
      PredicateContext predicateContext0 = new PredicateContext(selfContext0, coreOperationDivide0);
      predicateContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
      assertEquals(1, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("GbXI?l7,9:X$66[b3", "GbXI?l7,9:X$66[b3");
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-19), expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreFunction0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(1107);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, locationPath0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(91);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationAnd0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, nameAttributeTest0);
      // Undeclared exception!
      try { 
        predicateContext0.nextSet();
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
      Byte byte0 = new Byte((byte)34);
      Constant constant0 = new Constant(byte0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMod0, constant0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationNotEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.nextSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer((-3180));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName(",4hG", "ZV]_%L#D>'j0b");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationOr0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: ,4hG:ZV]_%L#D>'j0b
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, constant0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, false);
      Long long0 = new Long(2036L);
      Constant constant0 = new Constant(long0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, nameAttributeTest0);
      PredicateContext predicateContext0 = new PredicateContext(precedingOrFollowingContext0, coreOperationDivide0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer((-3180));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("/");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(extensionFunction0, extensionFunction0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: /
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      EvalContext[] evalContextArray0 = new EvalContext[2];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      Constant constant0 = new Constant("2q,^2sJ<");
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionPath0, expressionArray0[3]);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationMod0, coreOperationAdd0);
      PredicateContext predicateContext0 = new PredicateContext(unionContext0, coreOperationLessThan0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("Jn &");
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, jXPathContextReferenceImpl0, jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(jXPathBasicBeanInfo0);
      Expression[] expressionArray0 = new Expression[8];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(extensionFunction0, extensionFunction0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationDivide0, coreOperationDivide0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationAnd0, expressionArray0[0]);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, expressionArray0[6]);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, coreOperationAnd0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationNotEqual0, coreOperationLessThanOrEqual0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationMod0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Expression[] expressionArray0 = new Expression[4];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, extensionFunction0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      Integer integer0 = new Integer((-1));
      Constant constant0 = new Constant(integer0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, coreOperationEqual0);
      nodeSetContext0.hasNext();
      PredicateContext predicateContext0 = new PredicateContext(nodeSetContext0, nameAttributeTest0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, coreOperationLessThan0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, nameAttributeTest0);
      boolean boolean0 = predicateContext0.setPosition(954);
      assertFalse(boolean0);
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-3180));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant("#/");
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, constant0);
      boolean boolean0 = predicateContext0.nextNode();
      assertEquals(1, initialContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) fileSystemHandling0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(variableReference0, variableReference0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationNotEqual0);
      predicateContext0.nextNode();
      assertEquals(2, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, coreOperationLessThan0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, nameAttributeTest0);
      NullPointer nullPointer0 = (NullPointer)predicateContext0.getCurrentNodePointer();
      assertNull(nullPointer0);
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationAnd0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, nameAttributeTest0);
      boolean boolean0 = predicateContext0.setPosition((-2085));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, coreOperationLessThan0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, nameAttributeTest0);
      boolean boolean0 = predicateContext0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean0);
      
      boolean boolean1 = predicateContext0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) fileSystemHandling0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(variableReference0, variableReference0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationNotEqual0);
      boolean boolean0 = predicateContext0.setPosition(16777216);
      assertEquals(2, initialContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-3180));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant("#/");
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, constant0);
      predicateContext0.getCurrentNodePointer();
      predicateContext0.getCurrentNodePointer();
      assertEquals(1, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) fileSystemHandling0);
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("R6LuT}J+4t$)nC/0,=D");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(variableReference0, variableReference0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAnd0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationAnd0, expressionArray0[1]);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationDivide0, coreOperationAnd0);
      expressionArray0[3] = (Expression) coreOperationSubtract0;
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, expressionArray0[3]);
      predicateContext0.nextNode();
      boolean boolean0 = predicateContext0.nextNode();
      assertEquals(1, predicateContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) fileSystemHandling0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, variableReference0);
      Pointer pointer0 = predicateContext0.getSingleNodePointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan((Expression) null, (Expression) null);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationLessThan0);
      // Undeclared exception!
      try { 
        predicateContext0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }
}
