
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
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.JXPathCompiledExpression;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
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
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.VariablePointerFactory;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.parser.TokenMgrError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContextReferenceImpl_ESTest extends JXPathContextReferenceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("IcqN", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: IcqN
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("xml");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: xml
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(1409, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationNegate0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationNegate0, expressionArray0[0]);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationUnion0, expressionArray0[2]);
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      Iterator iterator0 = jXPathContextReferenceImpl0.iterate("=}i", (Expression) coreOperationSubtract0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Constant constant0 = new Constant("C");
      Class<Object> class0 = Object.class;
      String string0 = (String)jXPathContextReferenceImpl0.getValue("<<unknown namespace>>", (Expression) constant0, (Class) class0);
      assertEquals("C", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      String string0 = jXPathContext0.getPrefix((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NodePointerFactory[] nodePointerFactoryArray0 = JXPathContextReferenceImpl.getNodePointerFactories();
      assertEquals(6, nodePointerFactoryArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Compiler compiler0 = jXPathContextReferenceImpl0.getCompiler();
      assertNotNull(compiler0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = (JXPathCompiledExpression)jXPathContextReferenceImpl0.compilePath("kR9lS");
      assertEquals("kR9lS", jXPathCompiledExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TokenMgrError tokenMgrError0 = (TokenMgrError)JXPathContextReferenceImpl.allocateConditionally("org.apache.commons.jxpath.ri.parser.TokenMgrError", "org.apache.commons.jxpath.ri.parser.TokenMgrError");
      assertEquals(0, tokenMgrError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      jXPathContext0.setValue("(", (Object) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "Invalid argument type for 'sum': ");
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("Invalid argument type for 'sum': ", (Object) expressionPath0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'Invalid argument type for \\'sum\\': '. Syntax error after: 'I'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removePath("Exception trying to set value with xpath ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'Exception trying to set value with xpath '. Syntax error after: 'E'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath((String) null);
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
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("HOs-biI6e$U;IQ`N", "HOs-biI6e$U;IQ`N");
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationOr0, coreOperationOr0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMultiply0, coreOperationMultiply0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers((String) null, (Expression) extensionFunction0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers("", (Expression) coreOperationNotEqual0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.iteratePointers("No value for xpath: ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'No value for xpath: '. Syntax error after: 'N'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("Undefined function: ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationOr0, coreOperationOr0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, expressionPath0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(nameAttributeTest0, coreOperationUnion0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationDivide0, expressionArray0[5]);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iterate("SLaB5fID62z$/T0{%vm", (Expression) coreOperationMultiply0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationAnd0, expressionArray0[2]);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationGreaterThanOrEqual0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNegate0, coreFunction0);
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iterate("7,/po=TsDE%{J", (Expression) expressionPath0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate("8POX=Zw*>yiD6n");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '8POX=Zw*>yiD6n'. Syntax error after: '8'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getVariablePointer((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("<Ideographic>");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[9];
      expressionArray0[4] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionArray0[4]);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("<<unknown namespace>>", (Expression) coreOperationNegate0, (Class) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: <Ideographic>
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("Na$8VwsR>G2-[s$", (Expression) coreOperationAdd0, (Class) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationAdd", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) softReference0);
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, (Step[]) null);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationAdd0, coreOperationAdd0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationGreaterThanOrEqual0, expressionArray0[0]);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("N-\"I\"", (Expression) coreOperationMultiply0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("9.G$i", (Expression) null);
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
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
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
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getRelativeContext((Pointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationAnd0, coreOperationNegate0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationSubtract0, coreOperationAnd0);
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", (Expression) expressionPath0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("org.jdom.Document");
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function org.jdom.Document; Class 'org/jdom.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction((QName) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPathAndSetValue("yrLkL(H.-R", (Object) expressionPath0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'yrLkL(H.-R'. Syntax error after: 'y'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
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
  public void test32()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.compilePath("h\"-AI<tD\"<Y7[6PBm{&");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'h\\\"-AI<tD\\\"<Y7[6PBm{&'. Syntax error after: 'h'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContextReferenceImpl.allocateConditionally("R.D'37eNbx&SM", "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot allocate R.D'37eNbx&SM; Class 'R/D'37eNbx&SM.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, stepArray0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, expressionPath0, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JXPathContextReferenceImpl.addNodePointerFactory((NodePointerFactory) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("<UnicodeDigit>", "<UnicodeDigit>");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '<UnicodeDigit>:<UnicodeDigit>'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JXPathContextReferenceImpl.addNodePointerFactory((NodePointerFactory) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      QName qName0 = new QName("Cannot create a relative context for a non-existent node: ", "Cannot create a relative context for a non-existent node: ");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[2] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      jXPathContextReferenceImpl0.removeAll("Cannot create a relative context for a non-existent node: ", expressionArray0[2]);
      assertEquals(7, expressionArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Integer integer0 = new Integer((-767));
      Constant constant0 = new Constant(integer0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContextReferenceImpl0.getPointer("ih!2pKa}9s@ipF`}w|l", (Expression) constant0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Constant constant0 = new Constant("ih!2pKa}9s@ipF`}w|l");
      String string0 = (String)jXPathContextReferenceImpl0.getValue("^p99CmNdOt", (Expression) constant0);
      assertEquals("ih!2pKa}9s@ipF`}w|l", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, (Expression[]) null, stepArray0);
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<ExpressionPath> softReference0 = new SoftReference<ExpressionPath>(expressionPath0, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) softReference0);
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      Object object0 = new Object();
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = null;
      try {
        jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContextReferenceImpl0, (Object) null, beanPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = JXPathContextReferenceImpl.allocateConditionally("", "");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      Constant constant0 = new Constant("3%7");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, coreOperationEqual0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iterate("WmNTq~s@PSbU", (Expression) coreOperationMod0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      NullPointer nullPointer0 = (NullPointer)jXPathContextReferenceImpl0.getContextPointer();
      assertEquals(0, nullPointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContextReferenceImpl0, (Object) null);
      jXPathContextReferenceImpl0.setNamespaceContextPointer((Pointer) null);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      jXPathContextReferenceImpl0.setNamespaceContextPointer((Pointer) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[3];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      jXPathContextReferenceImpl0.getNamespaceResolver();
      jXPathContextReferenceImpl0.registerNamespace((String) null, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      jXPathContextReferenceImpl0.registerNamespace("_{- )", "");
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object object0 = JXPathContextReferenceImpl.allocateConditionally("", "");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, object0);
      QName qName0 = new QName("");
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("HC'?YJ", (String) null);
      Expression[] expressionArray0 = new Expression[0];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("true", (Expression) extensionFunction0, (Class) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: HC'?YJ:null
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      QName qName0 = new QName("Y$'V8j7I`(F#k(A\"J", "IED|");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getRelativeContext(nodePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: null()
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      Locale locale0 = Locale.CHINA;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, variablePointerFactory0);
      QName qName0 = new QName("", "UNKNOWN()");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, variablePointerFactory0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)jXPathContextReferenceImpl0.getRelativeContext(nodePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removeAll("bq|a:w6Rx$-T3_ZO", (Expression) coreOperationAdd0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath bq|a:w6Rx$-T3_ZO; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.removeAll("text");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      QName qName0 = new QName("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      Constant constant0 = new Constant("ze%oKX#p$MHl>");
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue(".C?/,rqZ.ap8EnML", (Expression) constant0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath .C?/,rqZ.ap8EnML; Cannot set value for xpath: .C?/,rqZ.ap8EnML
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("#\"7=");
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue("=", (Expression) variableReference0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath =; Cannot set undefined variable: #\"7=
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Integer integer0 = new Integer((-767));
      Constant constant0 = new Constant(integer0);
      Iterator iterator0 = jXPathContextReferenceImpl0.iteratePointers("t:~N ", (Expression) constant0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPathAndSetValue("V^u3kU~q60aP5uGq", (Expression) constant0, (Object) iterator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath V^u3kU~q60aP5uGq; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Constant constant0 = new Constant("new");
      Expression[] expressionArray0 = new Expression[5];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, (Step[]) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("new");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath new; Factory is not set on the JXPathContext - cannot create path: /new
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Expression[] expressionArray0 = new Expression[3];
      Constant constant0 = new Constant("C");
      expressionArray0[2] = (Expression) constant0;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPath("C", expressionArray0[2]);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath C; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant("IcqN");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(expressionArray0[0], constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationDivide0, coreOperationDivide0);
      expressionArray0[1] = (Expression) coreOperationNotEqual0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationDivide0);
      expressionArray0[2] = (Expression) coreOperationNegate0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, expressionArray0[1]);
      expressionArray0[3] = (Expression) coreOperationSubtract0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationNotEqual0, coreOperationNotEqual0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationEqual0, expressionArray0[3]);
      expressionArray0[4] = (Expression) coreOperationLessThan0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationSubtract0, coreOperationDivide0);
      expressionArray0[5] = (Expression) nameAttributeTest0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removePath("XbEhAV8=NV", (Expression) coreOperationUnion0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath XbEhAV8=NV; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContext0.getPointer("1");
      assertEquals(1, beanPointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("_{- )", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer("org.apache.commons.jxpath.BasicNodeSet", (Expression) variableReference0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath: org.apache.commons.jxpath.BasicNodeSet
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("_{- )", "z");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(variableReference0, variableReference0);
      Boolean boolean0 = (Boolean)jXPathContextReferenceImpl0.getValue("6e ", (Expression) coreOperationEqual0, (Class) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("_{- )", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue((String) null, (Expression) variableReference0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: null
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      QName qName0 = new QName("eCya&", (String) null);
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      Object object0 = new Object();
      Locale locale0 = Locale.ITALY;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, (Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0, nodePointer1);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("root", (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath root; Cannot set property null()/root, path does not match a changeable location
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNotEqual0, coreOperationNotEqual0);
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, (Expression[]) null, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      String string0 = jXPathContext0.getNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      QName qName0 = new QName("Cannot create a relative context for a non-existent node: ", "Cannot create a relative context for a non-existent node: ");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      Iterator iterator0 = jXPathContext0.iterate("false");
      Iterator iterator1 = jXPathContext0.iteratePointers("false");
      assertFalse(iterator1.equals((Object)iterator0));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll("PRY+D`yb!'HW:@2%");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'PRY\\u007f+D`yb!\\'HW:@2%'. Invalid symbol '\\u007f' after: 'PRY'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Long long0 = new Long(1167L);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) long0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("org.apache.commons.jxpath.util.TypeUtils");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath org.apache.commons.jxpath.util.TypeUtils; No pointer for xpath: org.apache.commons.jxpath.util.TypeUtils
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("org.apache.commons.jxpath.BasicNodeSet", (Object) "org.apache.commons.jxpath.BasicNodeSet");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath org.apache.commons.jxpath.BasicNodeSet; Cannot set property: /org.apache.commons.jxpath.BasicNodeSet - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNotEqual0, coreOperationNotEqual0);
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, (Expression[]) null, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        jXPathContext0.setValue((String) null, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      QName qName0 = new QName("Cannot create a relative context for a non-existent node: ", "Cannot create a relative context for a non-existent node: ");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      QName qName0 = new QName("Cannot create a relative context for a non-existent node: ", "Cannot create a relative context for a non-existent node: ");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer("/processing-instruction('");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '/processing-instruction(\\''. Invalid symbol '\\'' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("3bGl0(w3'0Xcf}TWP", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '3bGl0(w3\\'0Xcf}TWP'. Syntax error after: '3'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
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
  public void test78()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      ReferenceQueue<ExpressionPath> referenceQueue0 = new ReferenceQueue<ExpressionPath>();
      SoftReference<ExpressionPath> softReference0 = new SoftReference<ExpressionPath>(expressionPath0, referenceQueue0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) softReference0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContext0.getNamespaceContextPointer();
      assertFalse(beanPointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ReferenceQueue<ExpressionPath> referenceQueue0 = new ReferenceQueue<ExpressionPath>();
      SoftReference<ExpressionPath> softReference0 = new SoftReference<ExpressionPath>((ExpressionPath) null, referenceQueue0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) softReference0);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAnd0);
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, (Expression[]) null, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("};");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '};'. Invalid symbol '}' at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }
}
