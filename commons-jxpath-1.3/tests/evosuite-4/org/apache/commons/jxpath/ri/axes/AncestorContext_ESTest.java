
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
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AncestorContext_ESTest extends AncestorContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1));
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeTypeTest0);
      boolean boolean0 = ancestorContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      QName qName0 = new QName("'3luhZ1&*", "'3luhZ1&*");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "'3luhZ1&*");
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, nodeNameTest0);
      ancestorContext0.reset();
      assertTrue(ancestorContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("ugtAesdm(Gr:rR=.zS");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "ugtAesdm(Gr:rR=.zS", locale0);
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, "<<unknown namespace>>");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer1);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeNameTest0);
      ancestorContext0.nextNode();
      ancestorContext0.getCurrentNodePointer();
      assertEquals(1, ancestorContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(950);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, integer0, (Locale) null);
      beanPointer0.setAttribute(true);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "0^=o6[");
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeNameTest0);
      ancestorContext0.nextNode();
      ancestorContext0.getCurrentNodePointer();
      assertEquals(1, ancestorContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("3J;wqV1{9RN_GIb]");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.axes.AncestorContext");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        ancestorContext0.setPosition(2979);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AncestorContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-552));
      nodeSetContext0.getCurrentNodePointer();
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, true, nodeTypeTest0);
      // Undeclared exception!
      try { 
        ancestorContext0.setPosition(244);
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
      QName qName0 = new QName("\"*=*", "\"*=*");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "xYZ2~YQA\"yi", nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, (NodeTest) null);
      AncestorContext ancestorContext0 = new AncestorContext(descendantContext0, false, (NodeTest) null);
      // Undeclared exception!
      try { 
        ancestorContext0.nextNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: \"*=*:\"*=*
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, "");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(unionContext0, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        ancestorContext0.nextNode();
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
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      QName qName0 = new QName("'3luhZ1&*", "'3luhZ1&*");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "'3luhZ1&*");
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, nodeNameTest0);
      ancestorContext0.nextNode();
      ancestorContext0.getCurrentNodePointer();
      assertEquals(1, ancestorContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("ugtAesdm(Gr:rR=V.zS");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "ugtAesdm(Gr:rR=V.zS", locale0);
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, "<<unknown namespace>>");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer1);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, false, nodeNameTest0);
      boolean boolean0 = ancestorContext0.nextNode();
      assertEquals(1, ancestorContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("ugtAesdm(Gr:rR=V.zS", "ugtAesdm(Gr:rR=V.zS");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "ugtAesdm(Gr:rR=V.zS", locale0);
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, "<<unknown namespace>>");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer1);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("ugtAesdm(Gr:rR=V.zS");
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, processingInstructionTest0);
      boolean boolean0 = ancestorContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(1);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("&|]Fmao'% X#", "&|]Fmao'% X#");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, nodeNameTest0);
      ancestorContext0.nextNode();
      // Undeclared exception!
      try { 
        ancestorContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AncestorContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      QName qName0 = new QName("H_cRKpM*mcva", "H_cRKpM*mcva");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "H_cRKpM*mcva");
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, nodeNameTest0);
      boolean boolean0 = ancestorContext0.setPosition(Integer.MIN_VALUE);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("\"*=*", "\"*=*");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, (NodeTest) null);
      boolean boolean0 = ancestorContext0.setPosition(254);
      assertEquals(1, ancestorContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(1);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("&|]Fmao'% X#", "&|]Fmao'% X#");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, nodeNameTest0);
      int int0 = ancestorContext0.getDocumentOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(1);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("&|]Fmao'% X#", "&|]Fmao'% X#");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, nodeNameTest0);
      NodePointer nodePointer0 = ancestorContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }
}
