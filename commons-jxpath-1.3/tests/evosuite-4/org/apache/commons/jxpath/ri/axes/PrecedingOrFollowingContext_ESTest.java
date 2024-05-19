
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
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PrecedingOrFollowingContext_ESTest extends PrecedingOrFollowingContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, (NodeTest) null, false);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.setPosition(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("qf/LzD", "qf/LzD");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext(namespaceContext0, evalContextArray0);
      unionContext0.getCurrentNodePointer();
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(unionContext0, nodeNameTest0, false);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.setPosition(2519);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      QName qName0 = new QName("<<unknown namespace>>", "");
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      EvalContext[] evalContextArray0 = new EvalContext[9];
      evalContextArray0[0] = evalContext0;
      evalContextArray0[1] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(unionContext0, processingInstructionTest0, true);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.nextNode();
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
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(unionContext0, basicNodeSet0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeNameTest0);
      selfContext0.getSingleNodePointer();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(selfContext0, processingInstructionTest0, true);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.beans.LangAttributePointer");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.LangAttributePointer");
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer1);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(rootContext0, nodeNameTest0, false);
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.nextNode();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.NullPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, propertyPointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(rootContext0, processingInstructionTest0, false);
      // Undeclared exception!
      precedingOrFollowingContext0.nextNode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, propertyPointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(rootContext0, processingInstructionTest0, true);
      boolean boolean0 = precedingOrFollowingContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, propertyPointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("8");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(rootContext0, processingInstructionTest0, false);
      // Undeclared exception!
      precedingOrFollowingContext0.setPosition(1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("m;L[L[Nq21");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, false, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      precedingOrFollowingContext0.nextNode();
      precedingOrFollowingContext0.reset();
      boolean boolean0 = precedingOrFollowingContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("m;L[L[Nq21");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, false, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      precedingOrFollowingContext0.nextNode();
      // Undeclared exception!
      try { 
        precedingOrFollowingContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, propertyPointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(rootContext0, processingInstructionTest0, true);
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
      
      boolean boolean0 = precedingOrFollowingContext0.setPosition(26);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("m;L[L[Nq21");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, false, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      boolean boolean0 = precedingOrFollowingContext0.setPosition(Integer.MIN_VALUE);
      assertTrue(boolean0);
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("m;L[L[Nq21");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, false, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      boolean boolean0 = precedingOrFollowingContext0.setPosition(0);
      assertTrue(boolean0);
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, true, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      int int0 = precedingOrFollowingContext0.getDocumentOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.beans.LangAttributePointer");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.LangAttributePointer");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(rootContext0, nodeNameTest0, false);
      int int0 = precedingOrFollowingContext0.getDocumentOrder();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, true, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, nodeNameTest0, true);
      precedingOrFollowingContext0.getCurrentNodePointer();
      assertEquals((-1), precedingOrFollowingContext0.getDocumentOrder());
  }
}
