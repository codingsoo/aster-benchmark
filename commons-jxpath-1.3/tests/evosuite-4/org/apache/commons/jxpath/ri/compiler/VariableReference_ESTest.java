
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class VariableReference_ESTest extends VariableReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableReference variableReference0 = new VariableReference((QName) null);
      QName qName0 = variableReference0.getVariableName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = new QName("~d'eYXZiP3 ]6(", "~d'eYXZiP3 ]6(");
      VariableReference variableReference0 = new VariableReference(qName0);
      Integer integer0 = new Integer(0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, integer0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Object object0 = variableReference0.computeValue(evalContext0);
      assertNotSame(evalContext0, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.VariableReference", "org.apache.commons.jxpath.ri.compiler.VariableReference");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) qName0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)variableReference0.compute(rootContext0);
      assertEquals(0, initialContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QName qName0 = new QName("8@.E]ij", (String) null);
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        variableReference0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.VariableReference", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QName qName0 = new QName("clg2 p%&v01DL");
      VariableReference variableReference0 = new VariableReference(qName0);
      String string0 = variableReference0.toString();
      assertEquals("$clg2 p%&v01DL", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QName qName0 = new QName("clg2 p%&v01DL");
      VariableReference variableReference0 = new VariableReference(qName0);
      boolean boolean0 = variableReference0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QName qName0 = new QName("clg2 p%&v01DL");
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        variableReference0.compute((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.VariableReference", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      QName qName0 = new QName("clg2 p%&v01DL");
      VariableReference variableReference0 = new VariableReference(qName0);
      boolean boolean0 = variableReference0.isContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      QName qName0 = new QName("clg2 p%&v01DL");
      VariableReference variableReference0 = new VariableReference(qName0);
      QName qName1 = variableReference0.getVariableName();
      assertEquals("clg2 p%&v01DL", qName1.getName());
  }
}
