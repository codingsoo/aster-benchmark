
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LocationPath_ESTest extends LocationPath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.isAbsolute();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Integer integer0 = new Integer(47);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("'j+;4JvL .2;");
      Locale locale0 = Locale.TAIWAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      BeanPointer beanPointer1 = (BeanPointer)locationPath0.computeValue(rootContext0);
      assertFalse(beanPointer1.equals((Object)beanPointer0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.LocationPath");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(98, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, stepArray0[0], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Object object0 = locationPath0.compute(rootContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1024, expressionArray0);
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[2];
      stepArray0[5] = stepArray0[1];
      stepArray0[6] = stepArray0[0];
      stepArray0[7] = stepArray0[3];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreFunction0);
      Integer integer0 = new Integer(0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.LocationPath");
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, integer0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      PredicateContext predicateContext0 = (PredicateContext)locationPath0.compute(rootContext0);
      assertEquals(0, predicateContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Step[] stepArray0 = new Step[13];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      Step step0 = new Step(114, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
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
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("8UbS;;mj7HWi1If!#7");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, coreFunction0);
      expressionArray0[1] = (Expression) coreOperationMultiply0;
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
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
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
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
  public void test07()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.isAbsolute();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      Expression[] expressionArray0 = new Expression[26];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(nameAttributeTest0, expressionArray0[1]);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationSubtract0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        locationPath0.computeValue(initialContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.compute((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.LocationPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      String string0 = locationPath0.toString();
      assertEquals("null/null/null", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      String string0 = locationPath0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Step[] stepArray0 = new Step[13];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      Step step0 = new Step(114, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      assertFalse(locationPath0.isAbsolute());
      
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }
}
