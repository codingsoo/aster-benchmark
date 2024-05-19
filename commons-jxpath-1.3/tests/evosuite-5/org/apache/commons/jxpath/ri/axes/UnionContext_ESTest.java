
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UnionContext_ESTest extends UnionContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) initialContext0;
      evalContextArray0[1] = (EvalContext) initialContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) initialContext0;
      evalContextArray0[5] = (EvalContext) initialContext0;
      evalContextArray0[6] = (EvalContext) initialContext0;
      evalContextArray0[7] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      boolean boolean0 = unionContext0.setPosition(1);
      assertEquals(2, initialContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) initialContext0;
      evalContextArray0[1] = (EvalContext) initialContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) initialContext0;
      evalContextArray0[5] = (EvalContext) initialContext0;
      evalContextArray0[6] = (EvalContext) initialContext0;
      evalContextArray0[7] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      unionContext0.setPosition(34);
      assertEquals(34, unionContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, basicNodeSet0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        unionContext0.setPosition((-2069));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      try { 
        unionContext0.setPosition(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("@:4Jy");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      UnionContext unionContext0 = new UnionContext(rootContext0, (EvalContext[]) null);
      // Undeclared exception!
      try { 
        unionContext0.getDocumentOrder();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QName qName0 = new QName("", "3'k99do@C");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext(selfContext0, evalContextArray0);
      int int0 = unionContext0.getDocumentOrder();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[8];
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      int int0 = unionContext0.getDocumentOrder();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[1];
      evalContextArray0[0] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      unionContext0.getContextNodePointer();
      unionContext0.getSingleNodePointer();
      assertEquals(2, initialContext0.getPosition());
      assertEquals(1, unionContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(2361, expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      Constant constant0 = new Constant("uNY6#0O2.+,");
      expressionArray0[1] = (Expression) constant0;
      expressionArray0[2] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue("uNY6#0O2.+,", (Expression) coreOperationUnion0, (Object) "uNY6#0O2.+,");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath uNY6#0O2.+,; Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }
}
