
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SimplePathInterpreter;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SimplePathInterpreter_ESTest extends SimplePathInterpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Object object1 = new Object();
      assertNotNull(object1);
      assertFalse(object1.equals((Object)object0));
      
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      assertNotNull(jXPathBasicBeanInfo0);
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertTrue(jXPathBasicBeanInfo0.isAtomic());
      
      Locale locale0 = Locale.ENGLISH;
      assertNotNull(locale0);
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      
      BeanPointer beanPointer0 = new BeanPointer((QName) null, object1, jXPathBasicBeanInfo0, locale0);
      assertNotNull(beanPointer0);
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertTrue(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(object1.equals((Object)object0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      assertNotNull(nullPropertyPointer0);
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertTrue(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getIndex());
      assertFalse(nullPropertyPointer0.isAttribute());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertFalse(nullPropertyPointer0.isActual());
      assertTrue(nullPropertyPointer0.isContainer());
      assertFalse(nullPropertyPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertFalse(nullPropertyPointer0.isRoot());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertFalse(nullPropertyPointer0.isNode());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertFalse(object1.equals((Object)object0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      assertNotNull(nullPointer0);
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContextReferenceImpl0, nullPropertyPointer0, nullPointer0);
      assertNotNull(jXPathContextReferenceImpl1);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertTrue(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getIndex());
      assertFalse(nullPropertyPointer0.isAttribute());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertFalse(nullPropertyPointer0.isActual());
      assertTrue(nullPropertyPointer0.isContainer());
      assertFalse(nullPropertyPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertFalse(nullPropertyPointer0.isRoot());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertFalse(nullPropertyPointer0.isNode());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertFalse(object0.equals((Object)object1));
      assertFalse(object1.equals((Object)object0));
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl0));
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      NullPointer nullPointer1 = new NullPointer(locale0, (String) null);
      assertNotNull(nullPointer1);
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertFalse(nullPointer1.isActual());
      assertFalse(nullPointer1.isAttribute());
      assertTrue(nullPointer1.isRoot());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer1.isNode());
      assertEquals(0, nullPointer1.getLength());
      assertFalse(nullPointer1.isContainer());
      assertFalse(nullPointer1.isCollection());
      assertTrue(nullPointer1.isLeaf());
      assertNull(nullPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertTrue(nullPointer1.equals((Object)nullPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl1, nullPointer1);
      assertNotNull(rootContext0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertTrue(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getIndex());
      assertFalse(nullPropertyPointer0.isAttribute());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertFalse(nullPropertyPointer0.isActual());
      assertTrue(nullPropertyPointer0.isContainer());
      assertFalse(nullPropertyPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertFalse(nullPropertyPointer0.isRoot());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertFalse(nullPropertyPointer0.isNode());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertFalse(nullPointer1.isActual());
      assertFalse(nullPointer1.isAttribute());
      assertTrue(nullPointer1.isRoot());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer1.isNode());
      assertEquals(0, nullPointer1.getLength());
      assertFalse(nullPointer1.isContainer());
      assertFalse(nullPointer1.isCollection());
      assertTrue(nullPointer1.isLeaf());
      assertNull(nullPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertFalse(object0.equals((Object)object1));
      assertFalse(jXPathContextReferenceImpl0.equals((Object)jXPathContextReferenceImpl1));
      assertFalse(object1.equals((Object)object0));
      assertTrue(nullPointer0.equals((Object)nullPointer1));
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl0));
      assertTrue(nullPointer1.equals((Object)nullPointer0));
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      assertNotNull(constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      
      expressionArray0[0] = (Expression) constant0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      assertNotNull(coreOperationEqual0);
      assertEquals("=", coreOperationEqual0.getSymbol());
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      
      expressionArray0[1] = (Expression) coreOperationEqual0;
      QName qName0 = new QName("<<unknown namespace>>", "xml");
      assertNotNull(qName0);
      assertEquals("<<unknown namespace>>:xml", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("xml", qName0.getName());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertEquals("<<unknown namespace>>:xml", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("xml", qName0.getName());
      assertEquals("<<unknown namespace>>:xml", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, 2).when(step0).getAxis();
      doReturn(nodeNameTest0).when(step0).getNodeTest();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      assertNotNull(nullPropertyPointer0);
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertTrue(nullPropertyPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertTrue(nullPropertyPointer0.isContainer());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getIndex());
      assertFalse(nullPropertyPointer0.isAttribute());
      assertFalse(nullPropertyPointer0.isActual());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertFalse(nullPropertyPointer0.isNode());
      assertFalse(nullPropertyPointer0.isCollection());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPropertyPointer0);
      assertNotNull(rootContext0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("*", nullPropertyPointer0.getPropertyName());
      assertTrue(nullPropertyPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertTrue(nullPropertyPointer0.isContainer());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getIndex());
      assertFalse(nullPropertyPointer0.isAttribute());
      assertFalse(nullPropertyPointer0.isActual());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertFalse(nullPropertyPointer0.isNode());
      assertFalse(nullPropertyPointer0.isCollection());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      
      Step[] stepArray0 = new Step[7];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, 6).when(step0).getAxis();
      doReturn((Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, nullPropertyPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertNotNull(initialContext0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertEquals(0, initialContext0.getPosition());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BeanPointer beanPointer0 = (BeanPointer)initialContext0.getCurrentNodePointer();
      assertNotNull(beanPointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertEquals(0, initialContext0.getPosition());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[0];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(initialContext0, beanPointer0, stepArray0, 29);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 29
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, (NodePointer) null, expressionArray0, (Step[]) null);
      assertEquals(0, expressionArray0.length);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.toString());
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, (Locale) null);
      assertNotNull(beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("<<unknown namespace>>");
      assertNotNull(constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      
      expressionArray0[0] = (Expression) constant0;
      Expression[] expressionArray1 = new Expression[4];
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      
      expressionArray1[0] = (Expression) constant0;
      expressionArray1[1] = (Expression) constant0;
      expressionArray1[2] = (Expression) constant0;
      expressionArray1[3] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(1659, (-4550), 5, 5).when(step0).getAxis();
      doReturn(nodeNameTest0, nodeNameTest0).when(step0).getNodeTest();
      doReturn((Object) expressionArray0, (Object) expressionArray1, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray1).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      NullPropertyPointer nullPropertyPointer0 = (NullPropertyPointer)SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, beanPointer0, expressionArray0, stepArray0);
      assertEquals(3, stepArray0.length);
      assertEquals(2, expressionArray0.length);
      assertNotNull(nullPropertyPointer0);
      assertNotSame(expressionArray0, expressionArray1);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertTrue(nullPropertyPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nullPropertyPointer0.getPropertyIndex());
      assertEquals("", nullPropertyPointer0.getPropertyName());
      assertEquals(0, nullPropertyPointer0.getLength());
      assertTrue(nullPropertyPointer0.isAttribute());
      assertFalse(nullPropertyPointer0.isActual());
      assertFalse(nullPropertyPointer0.isRoot());
      assertTrue(nullPropertyPointer0.isLeaf());
      assertEquals(0, nullPropertyPointer0.getIndex());
      assertFalse(nullPropertyPointer0.isNode());
      assertNull(nullPropertyPointer0.getNamespaceURI());
      assertTrue(nullPropertyPointer0.isContainer());
      assertEquals(0, nullPropertyPointer0.getPropertyCount());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(expressionArray0.equals((Object)expressionArray1));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      assertEquals(7, evalContextArray0.length);
      assertNotNull(unionContext0);
      assertEquals(1, unionContext0.getDocumentOrder());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(0, unionContext0.getPosition());
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      assertNotNull(processingInstructionTest0);
      assertEquals("", processingInstructionTest0.getTarget());
      
      DescendantContext descendantContext0 = new DescendantContext(unionContext0, true, processingInstructionTest0);
      assertEquals(7, evalContextArray0.length);
      assertNotNull(descendantContext0);
      assertEquals(1, unionContext0.getDocumentOrder());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(0, unionContext0.getPosition());
      assertEquals("", processingInstructionTest0.getTarget());
      assertEquals(1, descendantContext0.getDocumentOrder());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getPosition());
      
      ChildContext childContext0 = new ChildContext(descendantContext0, processingInstructionTest0, true, true);
      assertEquals(7, evalContextArray0.length);
      assertNotNull(childContext0);
      assertEquals(1, unionContext0.getDocumentOrder());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(0, unionContext0.getPosition());
      assertEquals("", processingInstructionTest0.getTarget());
      assertEquals(1, descendantContext0.getDocumentOrder());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getPosition());
      assertEquals(1, childContext0.getDocumentOrder());
      
      NamespaceContext namespaceContext0 = new NamespaceContext(childContext0, processingInstructionTest0);
      assertEquals(7, evalContextArray0.length);
      assertNotNull(namespaceContext0);
      assertEquals(1, unionContext0.getDocumentOrder());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(0, unionContext0.getPosition());
      assertEquals("", processingInstructionTest0.getTarget());
      assertEquals(1, descendantContext0.getDocumentOrder());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getPosition());
      assertEquals(1, childContext0.getDocumentOrder());
      assertEquals(0, namespaceContext0.getPosition());
      assertEquals(1, namespaceContext0.getDocumentOrder());
      assertTrue(namespaceContext0.isChildOrderingRequired());
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "A]RuSI0lbv8");
      assertNotNull(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals("A]RuSI0lbv8", qName0.getName());
      assertEquals(":A]RuSI0lbv8", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals("A]RuSI0lbv8", qName0.getName());
      assertEquals(":A]RuSI0lbv8", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[8];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(namespaceContext0, variablePointer0, stepArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':A]RuSI0lbv8'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      assertNotNull(jXPathBasicBeanInfo0);
      assertTrue(jXPathBasicBeanInfo0.isAtomic());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      
      Locale locale0 = Locale.ENGLISH;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      
      BeanPointer beanPointer0 = new BeanPointer((QName) null, object0, jXPathBasicBeanInfo0, locale0);
      assertNotNull(beanPointer0);
      assertTrue(jXPathBasicBeanInfo0.isAtomic());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      assertNotNull(nullPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      assertNotNull(rootContext0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertEquals(0, rootContext0.getPosition());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      assertNotNull(constant0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      
      expressionArray0[0] = (Expression) constant0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      assertNotNull(coreOperationEqual0);
      assertFalse(constant0.computeContextDependent());
      assertFalse(constant0.isContextDependent());
      assertEquals("=", coreOperationEqual0.getSymbol());
      
      expressionArray0[1] = (Expression) coreOperationEqual0;
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("@\u0005A4");
      assertNotNull(processingInstructionTest0);
      assertEquals("@\u0005A4", processingInstructionTest0.getTarget());
      
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, 2).when(step0).getAxis();
      doReturn(processingInstructionTest0).when(step0).getNodeTest();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer0, stepArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest cannot be cast to org.apache.commons.jxpath.ri.compiler.NodeNameTest
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[8];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      assertEquals(8, evalContextArray0.length);
      assertNotNull(unionContext0);
      assertEquals(0, unionContext0.getPosition());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertTrue(unionContext0.isChildOrderingRequired());
      
      QName qName0 = new QName("", "a1Gj52.8)rQ");
      assertNotNull(qName0);
      assertEquals("a1Gj52.8)rQ", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":a1Gj52.8)rQ", qName0.toString());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertEquals("a1Gj52.8)rQ", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":a1Gj52.8)rQ", qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(":a1Gj52.8)rQ", nodeNameTest0.toString());
      
      ParentContext parentContext0 = new ParentContext(unionContext0, nodeNameTest0);
      assertEquals(8, evalContextArray0.length);
      assertNotNull(parentContext0);
      assertEquals(0, unionContext0.getPosition());
      assertEquals(1, unionContext0.getDocumentOrder());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals("a1Gj52.8)rQ", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":a1Gj52.8)rQ", qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(":a1Gj52.8)rQ", nodeNameTest0.toString());
      assertEquals((-1), parentContext0.getDocumentOrder());
      assertTrue(parentContext0.isChildOrderingRequired());
      assertEquals(1, parentContext0.getCurrentPosition());
      assertEquals(0, parentContext0.getPosition());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("a1Gj52.8)rQ", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":a1Gj52.8)rQ", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      assertEquals(5, expressionArray0.length);
      assertNotNull(coreOperationAdd0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationAdd0, coreOperationAdd0);
      assertEquals(5, expressionArray0.length);
      assertNotNull(coreOperationMultiply0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertEquals("*", coreOperationMultiply0.getSymbol());
      
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationMultiply0, coreOperationMultiply0);
      assertEquals(5, expressionArray0.length);
      assertNotNull(coreOperationMod0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertEquals("*", coreOperationMultiply0.getSymbol());
      assertEquals("mod", coreOperationMod0.getSymbol());
      
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationMod0, coreOperationAdd0);
      assertEquals(5, expressionArray0.length);
      assertNotNull(coreOperationEqual0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertEquals("*", coreOperationMultiply0.getSymbol());
      assertEquals("mod", coreOperationMod0.getSymbol());
      assertEquals("=", coreOperationEqual0.getSymbol());
      
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationEqual0, expressionArray0, stepArray0);
      assertEquals(5, expressionArray0.length);
      assertEquals(3, stepArray0.length);
      assertNotNull(expressionPath0);
      assertEquals("+", coreOperationAdd0.getSymbol());
      assertEquals("*", coreOperationMultiply0.getSymbol());
      assertEquals("mod", coreOperationMod0.getSymbol());
      assertEquals("=", coreOperationEqual0.getSymbol());
      
      expressionArray0[0] = (Expression) expressionPath0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(parentContext0, variablePointer0, expressionArray0, stepArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Locale locale0 = Locale.ENGLISH;
      assertNotNull(locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      assertNotNull(nullPointer0);
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      assertNotNull(rootContext0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertEquals(0, rootContext0.getPosition());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      assertNotNull(constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      
      expressionArray0[0] = (Expression) constant0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      assertNotNull(coreOperationEqual0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertEquals("=", coreOperationEqual0.getSymbol());
      
      expressionArray0[1] = (Expression) coreOperationEqual0;
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      assertNotNull(processingInstructionTest0);
      assertEquals("<<unknown namespace>>", processingInstructionTest0.getTarget());
      
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, 2).when(step0).getAxis();
      doReturn(processingInstructionTest0).when(step0).getNodeTest();
      doReturn(expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(rootContext0, nullPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest cannot be cast to org.apache.commons.jxpath.ri.compiler.NodeNameTest
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3330);
      assertNotNull(nodeTypeTest0);
      assertEquals(3330, nodeTypeTest0.getNodeType());
      
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeTypeTest0);
      assertNotNull(descendantContext0);
      assertEquals(3330, nodeTypeTest0.getNodeType());
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getDocumentOrder());
      
      NamespaceContext namespaceContext0 = new NamespaceContext(descendantContext0, nodeTypeTest0);
      assertNotNull(namespaceContext0);
      assertEquals(3330, nodeTypeTest0.getNodeType());
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(descendantContext0.isChildOrderingRequired());
      assertEquals(0, descendantContext0.getDocumentOrder());
      assertEquals(1, namespaceContext0.getDocumentOrder());
      assertEquals(0, namespaceContext0.getPosition());
      assertTrue(namespaceContext0.isChildOrderingRequired());
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[4];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(namespaceContext0, variablePointer0, stepArray0, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[5];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE).when(step0).getAxis();
      doReturn(expressionArray0).when(step0).getPredicates();
      stepArray0[4] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer((EvalContext) null, (NodePointer) null, stepArray0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      NodePointer nodePointer0 = SimplePathInterpreter.createNullPointer((EvalContext) null, (NodePointer) null, stepArray0, 9);
      assertEquals(9, stepArray0.length);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[2];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      assertEquals(2, evalContextArray0.length);
      assertNotNull(unionContext0);
      assertEquals(0, unionContext0.getPosition());
      assertTrue(unionContext0.isChildOrderingRequired());
      assertEquals(1, unionContext0.getDocumentOrder());
      
      QName qName0 = new QName("and", "and");
      assertNotNull(qName0);
      assertEquals("and:and", qName0.toString());
      assertEquals("and", qName0.getPrefix());
      assertEquals("and", qName0.getName());
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      assertNotNull(jXPathBasicBeanInfo0);
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      
      Locale locale0 = Locale.US;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("US", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_US", locale0.toString());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("and:and", qName0.toString());
      assertEquals("and", qName0.getPrefix());
      assertEquals("and", qName0.getName());
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertEquals("", locale0.getVariant());
      assertEquals("US", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_US", locale0.toString());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[8];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(step0).getAxis();
      doReturn((NodeTest) null).when(step0).getNodeTest();
      doReturn(expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(unionContext0, beanPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      assertNotNull(nullPointer0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      assertNotNull(jXPathBasicBeanInfo0);
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertTrue(jXPathBasicBeanInfo0.isDynamic());
      
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, (QName) null, "", jXPathBasicBeanInfo0);
      assertNotNull(beanPointer0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertTrue(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[4];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(step0).getAxis();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      BeanPointer beanPointer1 = (BeanPointer)SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, beanPointer0, stepArray0);
      assertEquals(4, stepArray0.length);
      assertNotNull(beanPointer1);
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
      assertTrue(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isContainer());
      assertEquals(1, beanPointer1.getLength());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvalContext evalContext0 = null;
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.toString());
      
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, false);
      assertNotNull(childContext0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(childContext0.isChildOrderingRequired());
      assertEquals(0, childContext0.getDocumentOrder());
      assertEquals(0, childContext0.getPosition());
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, (Locale) null);
      assertNotNull(beanPointer0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("<<unknown namespace>>");
      assertNotNull(constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      
      expressionArray0[0] = (Expression) constant0;
      Expression[] expressionArray1 = new Expression[4];
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      
      expressionArray1[0] = (Expression) constant0;
      expressionArray1[1] = (Expression) constant0;
      expressionArray1[2] = (Expression) constant0;
      expressionArray1[3] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction((-4550), expressionArray1);
      assertEquals(4, expressionArray1.length);
      assertNotNull(coreFunction0);
      assertEquals((-4550), coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      
      Constant constant1 = (Constant)coreFunction0.getArg3();
      assertEquals(4, expressionArray1.length);
      assertNotNull(constant1);
      assertSame(constant1, constant0);
      assertNotSame(expressionArray1, expressionArray0);
      assertFalse(constant1.isContextDependent());
      assertFalse(constant1.computeContextDependent());
      assertEquals((-4550), coreFunction0.getFunctionCode());
      assertEquals(4, coreFunction0.getArgumentCount());
      assertFalse(expressionArray1.equals((Object)expressionArray0));
      
      expressionArray0[1] = (Expression) constant1;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(1640, (-4550), 5, 0).when(step0).getAxis();
      doReturn(nodeNameTest0).when(step0).getNodeTest();
      doReturn((Object) expressionArray0, (Object) expressionArray1, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray1).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      NullElementPointer nullElementPointer0 = (NullElementPointer)SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, beanPointer0, stepArray0);
      assertEquals(3, stepArray0.length);
      assertNotNull(nullElementPointer0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(nullElementPointer0.isNode());
      assertFalse(nullElementPointer0.isAttribute());
      assertEquals(0, nullElementPointer0.getIndex());
      assertFalse(nullElementPointer0.isActual());
      assertTrue(nullElementPointer0.isContainer());
      assertEquals(0, nullElementPointer0.getLength());
      assertFalse(nullElementPointer0.isRoot());
      assertNull(nullElementPointer0.getNamespaceURI());
      assertTrue(nullElementPointer0.isLeaf());
      assertFalse(nullElementPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(childContext0, beanPointer0, stepArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Locale locale0 = Locale.ENGLISH;
      assertNotNull(locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      assertNotNull(nullPointer0);
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      assertNotNull(rootContext0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(0, rootContext0.getPosition());
      assertEquals(0, rootContext0.getDocumentOrder());
      assertFalse(rootContext0.isChildOrderingRequired());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      assertNotNull(constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      
      expressionArray0[0] = (Expression) constant0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(rootContext0, nullPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("*0.MwI2&<|j");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("*0.MwI2&<|j", qName0.toString());
      assertEquals("*0.MwI2&<|j", qName0.getName());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "*0.MwI2&<|j");
      assertNotNull(nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("*0.MwI2&<|j", qName0.toString());
      assertEquals("*0.MwI2&<|j", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("*0.MwI2&<|j", nodeNameTest0.toString());
      assertEquals("*0.MwI2&<|j", nodeNameTest0.getNamespaceURI());
      
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      assertNotNull(attributeContext0);
      assertNull(qName0.getPrefix());
      assertEquals("*0.MwI2&<|j", qName0.toString());
      assertEquals("*0.MwI2&<|j", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("*0.MwI2&<|j", nodeNameTest0.toString());
      assertEquals("*0.MwI2&<|j", nodeNameTest0.getNamespaceURI());
      assertEquals(0, attributeContext0.getPosition());
      assertFalse(attributeContext0.isChildOrderingRequired());
      assertEquals(0, attributeContext0.getDocumentOrder());
      
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("<<unknown namespace>>");
      assertNotNull(constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      assertNotNull(coreOperationGreaterThan0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
      
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(attributeContext0, (NodePointer) null, expressionArray0, (Step[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", qName0.toString());
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, (Locale) null);
      assertNotNull(beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", qName0.toString());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant((String) null);
      assertNotNull(constant0);
      assertFalse(constant0.isContextDependent());
      assertFalse(constant0.computeContextDependent());
      
      expressionArray0[0] = (Expression) constant0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(1640).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, beanPointer0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Predicate value is null: 'null'
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      assertNotNull(processingInstructionTest0);
      assertEquals("", processingInstructionTest0.getTarget());
      
      Step[] stepArray0 = new Step[0];
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) processingInstructionTest0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("", processingInstructionTest0.getTarget());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      assertNotNull(initialContext0);
      assertEquals("", processingInstructionTest0.getTarget());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(initialContext0.isChildOrderingRequired());
      assertEquals(0, initialContext0.getPosition());
      assertEquals(0, initialContext0.getDocumentOrder());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("<<unknown namespace>>");
      assertNotNull(qName0);
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.toString());
      
      VariableReference variableReference0 = new VariableReference(qName0);
      assertNotNull(variableReference0);
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.toString());
      assertFalse(variableReference0.isContextDependent());
      assertFalse(variableReference0.computeContextDependent());
      
      expressionArray0[0] = (Expression) variableReference0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(initialContext0, (NodePointer) null, expressionArray0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: <<unknown namespace>>
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, (Locale) null);
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("<<unknown namespace>>");
      expressionArray0[0] = (Expression) constant0;
      Expression[] expressionArray1 = new Expression[4];
      expressionArray1[0] = (Expression) constant0;
      expressionArray1[1] = (Expression) constant0;
      expressionArray1[2] = (Expression) constant0;
      expressionArray1[3] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(1640, 0, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray1, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nodePointer0, stepArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, false);
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, (Locale) null);
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("<<unknown namespace>>");
      expressionArray0[0] = (Expression) constant0;
      Expression[] expressionArray1 = new Expression[4];
      expressionArray1[0] = (Expression) constant0;
      expressionArray1[1] = (Expression) constant0;
      expressionArray1[2] = (Expression) constant0;
      expressionArray1[3] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction((-4550), expressionArray1);
      Expression expression0 = coreFunction0.getArg3();
      expressionArray0[1] = expression0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(1640, (-4550), 5, 2, 0).when(step0).getAxis();
      doReturn(nodeNameTest0, nodeNameTest0).when(step0).getNodeTest();
      doReturn((Object) expressionArray0, (Object) expressionArray1, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray1).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      NodePointer nodePointer1 = SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nodePointer0, stepArray0);
      assertEquals(0, nodePointer1.getIndex());
      assertFalse(nodePointer1.isAttribute());
      
      NodePointer nodePointer2 = SimplePathInterpreter.interpretSimpleLocationPath(childContext0, nodePointer0, stepArray0);
      NodePointer nodePointer3 = SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nodePointer2, stepArray0);
      assertEquals(0, nodePointer3.getIndex());
      assertTrue(nodePointer3.equals((Object)nodePointer2));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, (Locale) null);
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      NodePointer nodePointer1 = SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nodePointer0, stepArray0);
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
      assertNotNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[0];
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "$,X9rQ2;");
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, nullPointer0, expressionArray0, stepArray0);
      assertTrue(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ChildContext childContext0 = new ChildContext((EvalContext) null, (NodeTest) null, false, true);
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step[] stepArray0 = new Step[4];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(childContext0, beanPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("^vTI(X?80F@$");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, true);
      NamespaceContext namespaceContext0 = new NamespaceContext(precedingOrFollowingContext0, processingInstructionTest0);
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleLocationPath(namespaceContext0, (NodePointer) null, (Step[]) null);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.axes.UnionContext");
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationUnion0;
      Expression[] expressionArray1 = new Expression[6];
      expressionArray1[0] = (Expression) coreOperationUnion0;
      expressionArray1[1] = (Expression) coreOperationUnion0;
      expressionArray1[2] = (Expression) coreOperationUnion0;
      expressionArray1[3] = (Expression) coreOperationUnion0;
      expressionArray1[4] = (Expression) coreOperationUnion0;
      expressionArray1[5] = (Expression) coreOperationUnion0;
      CoreFunction coreFunction0 = new CoreFunction(2282, expressionArray1);
      Expression expression0 = coreFunction0.getArg3();
      expressionArray0[1] = expression0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(step0).getAxis();
      doReturn((Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, nullPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }
}
