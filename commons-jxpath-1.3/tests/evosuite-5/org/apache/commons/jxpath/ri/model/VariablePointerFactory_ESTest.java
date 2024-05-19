
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


package org.apache.commons.jxpath.ri.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.VariablePointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class VariablePointerFactory_ESTest extends VariablePointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      VariablePointerFactory.VariableContextWrapper variablePointerFactory_VariableContextWrapper0 = VariablePointerFactory.contextWrapper(jXPathContext0);
      QName qName0 = new QName("V.uFj:mF", "V.uFj:mF");
      NodePointer nodePointer0 = variablePointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) variablePointerFactory_VariableContextWrapper0);
      assertFalse(nodePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      Object object0 = new Object();
      QName qName0 = new QName("V.uFj:mF", "V.uFj:mF");
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = variablePointerFactory0.createNodePointer(qName0, object0, locale0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, "", locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      VariablePointerFactory.VariableContextWrapper variablePointerFactory_VariableContextWrapper0 = VariablePointerFactory.contextWrapper(jXPathContext0);
      // Undeclared exception!
      try { 
        variablePointerFactory0.createNodePointer(nodePointer0, (QName) null, (Object) variablePointerFactory_VariableContextWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      BasicVariables basicVariables0 = new BasicVariables();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      VariablePointerFactory.VariableContextWrapper variablePointerFactory_VariableContextWrapper0 = VariablePointerFactory.contextWrapper(jXPathContext0);
      // Undeclared exception!
      try { 
        variablePointerFactory0.createNodePointer((QName) null, (Object) variablePointerFactory_VariableContextWrapper0, (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      VariablePointerFactory.VariableContextWrapper variablePointerFactory_VariableContextWrapper0 = VariablePointerFactory.contextWrapper(jXPathContext0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)variablePointerFactory_VariableContextWrapper0.getContext();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      QName qName0 = new QName("</89?_D;s+\"", "</89?_D;s+\"");
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      VariablePointerFactory.VariableContextWrapper variablePointerFactory_VariableContextWrapper0 = VariablePointerFactory.contextWrapper(jXPathContext0);
      Locale locale0 = Locale.CANADA;
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.createPath(jXPathContext0, object0);
      NodePointer nodePointer0 = variablePointerFactory0.createNodePointer(qName0, (Object) variablePointerFactory_VariableContextWrapper0, locale0);
      assertTrue(nodePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      int int0 = variablePointerFactory0.getOrder();
      assertEquals(890, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      Locale locale0 = Locale.ITALY;
      QName qName0 = new QName("R/~,_VD;s+\"");
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      VariablePointerFactory.VariableContextWrapper variablePointerFactory_VariableContextWrapper0 = VariablePointerFactory.contextWrapper(jXPathContext0);
      NodePointer nodePointer0 = variablePointerFactory0.createNodePointer(qName0, (Object) variablePointerFactory_VariableContextWrapper0, locale0);
      variablePointerFactory0.createNodePointer(nodePointer0, qName0, (Object) jXPathContext0);
      assertEquals(890, variablePointerFactory0.getOrder());
      assertFalse(nodePointer0.isActual());
  }
}
