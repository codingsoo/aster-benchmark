
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InfoSetUtil_ESTest extends InfoSetUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.stringValue(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("Factory is not set on the JXPathContext - cannot create path: ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.stringValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      QName qName0 = new QName(":^^1(z");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ChildContext childContext0 = new ChildContext(nodeSetContext0, (NodeTest) null, false, true);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(childContext0, (NodeTest) null, true);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      evalContextArray0[0] = (EvalContext) nodeSetContext0;
      evalContextArray0[1] = (EvalContext) childContext0;
      evalContextArray0[2] = (EvalContext) precedingOrFollowingContext0;
      evalContextArray0[3] = (EvalContext) precedingOrFollowingContext0;
      UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(unionContext0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("<BaseChar>");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        InfoSetUtil.doubleValue(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: <BaseChar>
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.doubleValue(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Number number0 = InfoSetUtil.number((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) number0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("false");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[9];
      evalContextArray0[0] = (EvalContext) initialContext0;
      evalContextArray0[1] = (EvalContext) initialContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(unionContext0);
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
      QName qName0 = new QName("<BaseChar>");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        InfoSetUtil.doubleValue(variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = InfoSetUtil.doubleValue("java.lang.Object@5792d578");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("NaN", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: NaN:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Number number0 = InfoSetUtil.number("java.lang.Object@50f34965");
      assertEquals(Double.NaN, number0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      String string0 = InfoSetUtil.stringValue(object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      Object object0 = new Object();
      QName qName0 = new QName("|%IUV-w", "|%IUV-w");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      String string0 = InfoSetUtil.stringValue(nodePointer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = InfoSetUtil.booleanValue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("NaN", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: NaN:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = InfoSetUtil.booleanValue("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = InfoSetUtil.booleanValue("java.lang.Object@48c7895b");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      unionContext0.nextSet();
      boolean boolean0 = InfoSetUtil.booleanValue(unionContext0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = InfoSetUtil.booleanValue(evalContext0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Number number0 = InfoSetUtil.number((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) number0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("false");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[9];
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      boolean boolean0 = InfoSetUtil.booleanValue(jXPathContextReferenceImpl0.USE_SOFT_CACHE);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Double double0 = new Double(0.0);
      boolean boolean0 = InfoSetUtil.booleanValue(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      Number number0 = InfoSetUtil.number(object0);
      boolean boolean0 = InfoSetUtil.booleanValue(number0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = InfoSetUtil.booleanValue(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("java.lang.Object@4922c9a7");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "java.lang.Object@4922c9a7");
      AttributeContext attributeContext0 = new AttributeContext(unionContext0, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(attributeContext0, false, nodeNameTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(ancestorContext0, basicNodeSet0);
      double double0 = InfoSetUtil.doubleValue(nodeSetContext0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      double double0 = InfoSetUtil.doubleValue(evalContext0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double double0 = InfoSetUtil.doubleValue("");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      double double0 = InfoSetUtil.doubleValue(boolean0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      double double0 = InfoSetUtil.doubleValue(jXPathContextReferenceImpl0.USE_SOFT_CACHE);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      Number number0 = InfoSetUtil.number(object0);
      double double0 = InfoSetUtil.doubleValue(number0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("|%IUV-w", "|%IUV-w");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      Double double0 = (Double)InfoSetUtil.number(unionContext0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Number number0 = InfoSetUtil.number(evalContext0);
      assertEquals(Double.NaN, number0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ChildContext childContext0 = new ChildContext(nodeSetContext0, (NodeTest) null, false, true);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(childContext0, (NodeTest) null, true);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Boolean boolean0 = new Boolean("trgue");
      Number number0 = InfoSetUtil.number(boolean0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Number number0 = InfoSetUtil.number(jXPathContextReferenceImpl0.USE_SOFT_CACHE);
      assertEquals(1.0, number0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = new Object();
      Number number0 = InfoSetUtil.number(object0);
      Number number1 = InfoSetUtil.number(number0);
      assertEquals(Double.NaN, number1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("java.lang.Object@48c7895b", "java.lang.Object@15742533");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "java.lang.Object@48c7895b");
      DescendantContext descendantContext0 = new DescendantContext(unionContext0, false, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(descendantContext0, false, nodeNameTest0);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(ancestorContext0, nodeSet0);
      InfoSetUtil.stringValue(nodeSetContext0);
      assertEquals(1, nodeSetContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      String string0 = InfoSetUtil.stringValue(evalContext0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = InfoSetUtil.stringValue((Object) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String string0 = InfoSetUtil.stringValue(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = InfoSetUtil.stringValue(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Double double0 = new Double(0.0);
      String string0 = InfoSetUtil.stringValue(double0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = new Object();
      Number number0 = InfoSetUtil.number(object0);
      String string0 = InfoSetUtil.stringValue(number0);
      assertEquals("NaN", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = InfoSetUtil.stringValue("java.lang.Object@48c7895b");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object object0 = new Object();
      double double0 = InfoSetUtil.doubleValue(object0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
  }
}
