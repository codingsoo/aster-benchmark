
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ChildContext_ESTest extends ChildContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer((-4392));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) initialContext0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(269);
      ParentContext parentContext0 = new ParentContext(evalContextArray0[0], nodeTypeTest0);
      evalContextArray0[1] = (EvalContext) parentContext0;
      evalContextArray0[2] = (EvalContext) initialContext0;
      evalContextArray0[3] = (EvalContext) initialContext0;
      evalContextArray0[4] = (EvalContext) initialContext0;
      evalContextArray0[5] = (EvalContext) initialContext0;
      evalContextArray0[6] = (EvalContext) initialContext0;
      evalContextArray0[7] = (EvalContext) initialContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      ChildContext childContext0 = new ChildContext(unionContext0, nodeTypeTest0, false, false);
      childContext0.setPosition((-4392));
      boolean boolean0 = childContext0.setPosition(126);
      assertEquals(126, childContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("zl+`jk){*eo<+aTe`-");
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.setPosition(4863);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.ChildContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, nodeSet0);
      QName qName0 = new QName("jpU5", "jpU5");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      nodeSetContext0.getSingleNodePointer();
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeNameTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.setPosition(16);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("", "JLPZ+f&!4u{0");
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1889));
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeTypeTest0);
      ChildContext childContext0 = new ChildContext(descendantContext0, nodeTypeTest0, true, false);
      // Undeclared exception!
      try { 
        childContext0.nextNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :JLPZ+f&!4u{0
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[1];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      ChildContext childContext0 = new ChildContext(unionContext0, nodeNameTest0, true, false);
      // Undeclared exception!
      try { 
        childContext0.nextNode();
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
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, nodeSet0);
      QName qName0 = new QName("jpU5", "jpU5");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      nodeSetContext0.getSingleNodePointer();
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeNameTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.ChildContext");
      Locale locale0 = new Locale("$");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      ChildContext childContext0 = new ChildContext(rootContext0, nodeNameTest0, false, true);
      // Undeclared exception!
      try { 
        childContext0.getSingleNodePointer();
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
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      QName qName0 = new QName("k[t+|qx9z5uTHhD#Zx~");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "4j\"0vs)@!>cJIE<45{4");
      ChildContext childContext0 = new ChildContext(unionContext0, nodeNameTest0, true, false);
      // Undeclared exception!
      try { 
        childContext0.getCurrentNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, nodeSet0);
      QName qName0 = new QName("jpU5", "jpU5");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      nodeSetContext0.getSingleNodePointer();
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeNameTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.getCurrentNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-985));
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeTypeTest0, true, false);
      childContext0.setPosition((-1217));
      childContext0.getSingleNodePointer();
      assertEquals((-1217), childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.ChildContext");
      Locale locale0 = new Locale("$");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      ChildContext childContext0 = new ChildContext(rootContext0, nodeNameTest0, false, true);
      childContext0.getCurrentNodePointer();
      childContext0.setPosition(3651);
      assertEquals(3651, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.ChildContext");
      Locale locale0 = new Locale("$");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      ChildContext childContext0 = new ChildContext(rootContext0, nodeNameTest0, false, true);
      childContext0.getCurrentNodePointer();
      childContext0.getCurrentNodePointer();
      assertEquals(1, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("u.IT'rJ 1.s");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(evalContext0, nodeNameTest0, false, true);
      childContext0.reset();
      assertFalse(childContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(361);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(361);
      ChildContext childContext0 = new ChildContext(initialContext0, nodeTypeTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.ChildContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      ChildContext childContext0 = new ChildContext(evalContext0, nodeNameTest0, false, true);
      childContext0.setPosition(16);
      childContext0.nextNode();
      assertEquals(17, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(361);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("false()");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(initialContext0, nodeNameTest0, false, false);
      childContext0.getSingleNodePointer();
      assertEquals(2, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer(361);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(361);
      ChildContext childContext0 = new ChildContext(initialContext0, nodeTypeTest0, false, true);
      childContext0.getSingleNodePointer();
      assertEquals(1, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      ChildContext childContext0 = new ChildContext(parentContext0, nodeNameTest0, false, false);
      childContext0.getCurrentNodePointer();
      childContext0.getCurrentNodePointer();
      assertEquals(1, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("u.IT'rJ 1.s");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(evalContext0, nodeNameTest0, false, true);
      childContext0.nextNode();
      childContext0.getSingleNodePointer();
      assertEquals(1, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("jpU5", "jpU5");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(unionContext0, nodeNameTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.getSingleNodePointer();
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
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("jpU5", "jpU5");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(unionContext0, nodeNameTest0, true, true);
      // Undeclared exception!
      try { 
        childContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }
}
