
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParentContext_ESTest extends ParentContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[6];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ParentContext parentContext0 = new ParentContext(unionContext0, processingInstructionTest0);
      parentContext0.reset();
      assertEquals(1, parentContext0.getCurrentPosition());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[6];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ParentContext parentContext0 = new ParentContext(unionContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "pB7G%\"a-dIeG:\"v");
      unionContext0.setPosition(852);
      ParentContext parentContext0 = new ParentContext(unionContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        parentContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 851, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("j*fcjwTi8@cr");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, "j*fcjwTi8@cr");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      ParentContext parentContext0 = new ParentContext(rootContext0, nodeTypeTest0);
      boolean boolean0 = parentContext0.nextNode();
      boolean boolean1 = parentContext0.nextNode();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = parentContext0.setPosition(1);
      assertEquals(1, parentContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      boolean boolean0 = parentContext0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, parentContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("j*fcjwTi8@cr");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, "j*fcjwTi8@cr");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      ParentContext parentContext0 = new ParentContext(rootContext0, nodeTypeTest0);
      int int0 = parentContext0.getDocumentOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      NodePointer nodePointer0 = parentContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      int int0 = parentContext0.getCurrentPosition();
      assertEquals(1, int0);
  }
}
