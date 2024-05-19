
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
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathCompiledExpression;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.VariablePointerFactory;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContextReferenceImpl_ESTest extends JXPathContextReferenceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("/P", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: /P
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContextReferenceImpl.allocateConditionally("org.apache.commons.jxpath.ri.axes.NodeSetContext", "org.apache.commons.jxpath.ri.axes.NodeSetContext");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot allocate org.apache.commons.jxpath.ri.axes.NodeSetContext; org.apache.commons.jxpath.ri.axes.NodeSetContext
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Long long0 = new Long(0L);
      Constant constant0 = new Constant(long0);
      Iterator iterator0 = jXPathContextReferenceImpl0.iteratePointers("root", (Expression) constant0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      Step[] stepArray0 = new Step[6];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, locationPath0);
      Iterator iterator0 = jXPathContextReferenceImpl0.iterate((String) null, (Expression) coreOperationGreaterThan0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      Iterator iterator0 = jXPathContext0.iterate("t");
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContext0.getPointer("false()");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CoreOperationMod coreOperationMod0 = new CoreOperationMod((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      String string0 = jXPathContext0.getNamespaceURI("Q2RE(l");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Compiler compiler0 = jXPathContextReferenceImpl0.getCompiler();
      assertNotNull(compiler0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = (JXPathCompiledExpression)jXPathContextReferenceImpl0.compilePath("FU");
      assertEquals("FU", jXPathCompiledExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      SoftReference<Object> softReference0 = new SoftReference<Object>(variablePointerFactory0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removeAll("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers("' returns ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '\\' returns '. Invalid symbol ' ' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointerFactory0);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate("m'\"m#L");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'm\\'\\\"m#L'. Invalid symbol 'L' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction(3117, expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreFunction0, nameAttributeTest0);
      Class<ExpressionPath> class0 = ExpressionPath.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("No value for xpath: ", (Expression) coreOperationDivide0, (Class) class0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      Class<ExpressionPath> class0 = ExpressionPath.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("", (Expression) coreOperationOr0, (Class) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Constant constant0 = new Constant(":%,|(");
      Class<ExpressionPath> class0 = ExpressionPath.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue(":%,|(", (Expression) constant0, (Class) class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationUnion0;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("node", expressionArray0[3]);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("._w<W}%BUt", (Expression) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SoftReference<ExpressionPath> softReference0 = new SoftReference<ExpressionPath>((ExpressionPath) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) softReference0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue((String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext((Pointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", (Expression) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("Exception trying to create xpath ");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, coreOperationMod0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer("", (Expression) coreOperationUnion0);
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
      CoreOperationMod coreOperationMod0 = new CoreOperationMod((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer("N:[");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'N:['. Syntax error after: 'N:'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      QName qName0 = new QName("&IPrz%;GyqS./");
      Object[] objectArray0 = new Object[14];
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function &IPrz%;GyqS./; &IPrz%;GyqS
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[3];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPathAndSetValue((String) null, (Object) expressionPath0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPath(">$D3~LXf3ZzS");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '>$D3~LXf3ZzS'. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.compilePath("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>(object0, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) softReference0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.compilePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContextReferenceImpl.allocateConditionally("", "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot allocate ; 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      QName qName0 = new QName("Exception trying to remove all for xpath ", "Exception trying to remove all for xpath ");
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = null;
      try {
        jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContextReferenceImpl0, object0, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Exception trying to remove all for xpath :Exception trying to remove all for xpath 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      Expression[] expressionArray0 = new Expression[6];
      expressionArray0[5] = (Expression) constant0;
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      jXPathContextReferenceImpl0.removeAll("\"node\"", expressionArray0[5]);
      assertEquals(6, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("3h_FQF$Dv77A");
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NodePointerFactory[] nodePointerFactoryArray0 = JXPathContextReferenceImpl.getNodePointerFactories();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction((QName) null, nodePointerFactoryArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      NullPointer nullPointer0 = (NullPointer)jXPathContext0.getContextPointer();
      assertTrue(nullPointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointerFactory0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("e7I$");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      jXPathContextReferenceImpl0.getRelativeContext(variablePointer1);
      jXPathContextReferenceImpl0.setNamespaceContextPointer(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.setNamespaceContextPointer((Pointer) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, (Pointer) null);
      jXPathContext0.registerNamespace("&mOw#M", "");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      jXPathContextReferenceImpl0.registerNamespace("Rr", "3IGW*C}BkJ|]P)");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, (Pointer) null);
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("G'A&CkP", "G'A&CkP");
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction(qName0, expressionArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: G'A&CkP:G'A&CkP
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      NamespaceResolver namespaceResolver0 = jXPathContextReferenceImpl0.getNamespaceResolver();
      Pointer pointer0 = namespaceResolver0.getNamespaceContextPointer();
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getRelativeContext(pointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: null()
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, constant0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removeAll("<<unknown namespace>>", (Expression) coreOperationMod0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath <<unknown namespace>>; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Constant constant0 = new Constant("");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removePath("_L#c>2@7@s$:jeU", (Expression) nameAttributeTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath _L#c>2@7@s$:jeU; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPathAndSetValue("root", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath root; Cannot set property: /root - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) coreOperationDivide0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPathAndSetValue("\")b", expressionArray0[0], (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath \")b; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Short short0 = new Short((short)72);
      Constant constant0 = new Constant(short0);
      Expression[] expressionArray0 = new Expression[6];
      expressionArray0[0] = (Expression) constant0;
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue((String) null, expressionArray0[0], (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath null; Cannot set value for xpath: null
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("z");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath z; Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPath("", (Expression) coreOperationOr0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath ; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      NullPointer nullPointer0 = (NullPointer)jXPathContextReferenceImpl0.getPointer("<<unknown namespace>>", (Expression) coreFunction0);
      assertEquals(0, nullPointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Short short0 = new Short((short)72);
      Constant constant0 = new Constant(short0);
      Expression[] expressionArray0 = new Expression[6];
      expressionArray0[4] = (Expression) constant0;
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      Class<Object> class0 = Object.class;
      Short short1 = (Short)jXPathContextReferenceImpl0.getValue("Invalid expression type. '", expressionArray0[4], class0);
      assertEquals((short)72, (short)short1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      Byte byte0 = new Byte((byte)0);
      Constant constant0 = new Constant(byte0);
      Byte byte1 = (Byte)jXPathContextReferenceImpl0.getValue("false()", (Expression) constant0);
      assertEquals((byte)0, (byte)byte1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName("false");
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("false", (Expression) variableReference0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: false
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(500, expressionArray0);
      Class<Object> class0 = Object.class;
      Object object0 = jXPathContextReferenceImpl0.getValue("org.apache.commons.jxpath.ri.compiler.CoreOperationNegate", (Expression) coreFunction0, (Class) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Object object0 = new Object();
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>(object0, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) softReference0);
      jXPathContextReferenceImpl0.iteratePointers("DEFAULT");
      jXPathContextReferenceImpl0.removeAll("DEFAULT");
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointerFactory0);
      JXPathContextReferenceImpl.addNodePointerFactory(variablePointerFactory0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, " ");
      assertFalse(jXPathContextReferenceImpl0.equals((Object)jXPathContext0));
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      String string0 = jXPathContextReferenceImpl0.getPrefix("No value for xpath: ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue("TXwkh48", (Object) "xmlns");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath TXwkh48; Cannot set property /TXwkh48, path does not match a changeable location
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Object object0 = JXPathContextReferenceImpl.allocateConditionally("", "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, locationPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iterate((String) null, (Expression) coreOperationGreaterThan0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("Rr");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: Rr
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      JXPathContextReferenceImpl.addNodePointerFactory(variablePointerFactory0);
      NodePointerFactory[] nodePointerFactoryArray0 = JXPathContextReferenceImpl.getNodePointerFactories();
      assertNull(nodePointerFactoryArray0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Object object0 = new Object();
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>(object0, referenceQueue0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) softReference0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("DEFAULT");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath DEFAULT; No pointer for xpath: DEFAULT
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      QName qName0 = new QName("Ff");
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removePath("Ff", (Expression) variableReference0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath Ff; No pointer for xpath: Ff
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointerFactory0);
      Step[] stepArray0 = new Step[5];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(locationPath0, locationPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers("jbi$l", (Expression) coreOperationDivide0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      SoftReference<Object> softReference0 = new SoftReference<Object>(expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPathAndSetValue("/'__\"I%j|jAH", (Object) softReference0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '/\\'__\\\"I%j|jAH'. Invalid symbol 'H' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      NullPointer nullPointer0 = (NullPointer)jXPathContextReferenceImpl0.getNamespaceContextPointer();
      assertEquals(0, nullPointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iterate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[8];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }
}
