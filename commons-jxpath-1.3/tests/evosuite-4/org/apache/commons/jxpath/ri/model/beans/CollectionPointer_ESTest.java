
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


package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CollectionPointer_ESTest extends CollectionPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(4);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(4, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, (QName) null, Integer.MIN_VALUE);
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(4, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(nodePointer0.isNode());
      assertFalse(nodePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = ((CollectionPointer) nodePointer0).equals(collectionPointer0);
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(4, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(nodePointer0.isNode());
      assertFalse(nodePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("/.", "<<unknown namespace>>");
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 4, (Object) "");
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertTrue(nodePointer0.isContainer());
      assertNull(nodePointer0.getNamespaceURI());
      assertEquals(4, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isNode());
      assertFalse(nodePointer0.isAttribute());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(4);
      assertTrue(collectionPointer0.equals((Object)nodePointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals(4, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = ((CollectionPointer) nodePointer0).equals(collectionPointer0);
      assertTrue(collectionPointer0.equals((Object)nodePointer0));
      assertTrue(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals(4, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertTrue(nodePointer0.isContainer());
      assertNull(nodePointer0.getNamespaceURI());
      assertEquals(4, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isNode());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(4);
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(4, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.hashCode();
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(4, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("| RUo7:");
      assertEquals("| RUo7:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("| RUo7", qName0.getPrefix());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.CHINA;
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals("| RUo7:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("| RUo7", qName0.getPrefix());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("| RUo7:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("| RUo7", qName0.getPrefix());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) null, qName0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 2
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.UK;
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_GB", locale0.toString());
      assertEquals("GB", locale0.getCountry());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_GB", locale0.toString());
      assertEquals("GB", locale0.getCountry());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setAttribute(true);
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_GB", locale0.toString());
      assertEquals("GB", locale0.getCountry());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.getValuePointer();
      assertSame(collectionPointer0, nodePointer0);
      assertSame(nodePointer0, collectionPointer0);
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_GB", locale0.toString());
      assertEquals("GB", locale0.getCountry());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isContainer());
      assertTrue(nodePointer0.isNode());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = collectionPointer0.getLength();
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = Locale.GERMANY;
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de_DE", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) variablePointer0, locale0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de_DE", locale0.toString());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)collectionPointer0.getBaseValue();
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de_DE", locale0.toString());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isActual());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("], operation is not allowed for this type of node", "], operation is not allowed for this type of node");
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer1 = new VariablePointer(basicVariables0, qName0);
      assertFalse(variablePointer1.equals((Object)variablePointer0));
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer1, variablePointer0);
      assertFalse(variablePointer0.equals((Object)variablePointer1));
      assertFalse(variablePointer1.equals((Object)variablePointer0));
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.createPath((JXPathContext) null, (Object) basicVariables0);
      assertFalse(variablePointer0.equals((Object)variablePointer1));
      assertFalse(variablePointer1.equals((Object)variablePointer0));
      assertNotSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer1, variablePointer0);
      assertSame(collectionPointer0, nodePointer0);
      assertSame(nodePointer0, collectionPointer0);
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertTrue(nodePointer0.isNode());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isContainer());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isRoot());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.GERMAN;
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex((-1548));
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals((-1548), collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      collectionPointer0.setAttribute(true);
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isAttribute());
      assertEquals((-1548), collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) "/");
      assertSame(collectionPointer0, collectionPointer1);
      assertSame(collectionPointer1, collectionPointer0);
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isAttribute());
      assertEquals((-1548), collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isCollection());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isAttribute());
      assertEquals((-1548), collectionPointer1.getIndex());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ROOT;
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "/");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, 0);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(0, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isRoot());
      assertFalse(collectionPointer1.isAttribute());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isContainer());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer2 = (CollectionPointer)collectionPointer1.createPath((JXPathContext) jXPathContextReferenceImpl0, object0);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(collectionPointer2.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer0, collectionPointer2);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertSame(collectionPointer1, collectionPointer2);
      assertSame(collectionPointer2, collectionPointer1);
      assertNotSame(collectionPointer2, collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(0, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isRoot());
      assertFalse(collectionPointer1.isAttribute());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isContainer());
      assertTrue(collectionPointer2.isCollection());
      assertFalse(collectionPointer2.isAttribute());
      assertEquals(0, collectionPointer2.getIndex());
      assertNull(collectionPointer2.getNamespaceURI());
      assertTrue(collectionPointer2.isRoot());
      assertFalse(collectionPointer2.isNode());
      assertTrue(collectionPointer2.isContainer());
      assertNotNull(collectionPointer2);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.UK;
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GB", locale0.getCountry());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GB", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("node");
      assertEquals("node", qName0.getName());
      assertEquals("node", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(collectionPointer0, qName0, object0);
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GB", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("node", qName0.getName());
      assertEquals("node", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = new CollectionPointer(beanPointer0, qName0);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GB", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("node", qName0.getName());
      assertEquals("node", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(collectionPointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isCollection());
      assertNull(collectionPointer1.getNamespaceURI());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GB", locale0.getCountry());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer2 = (CollectionPointer)collectionPointer1.createPath((JXPathContext) jXPathContextReferenceImpl0);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(collectionPointer2.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer0, collectionPointer2);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertSame(collectionPointer1, collectionPointer2);
      assertSame(collectionPointer2, collectionPointer1);
      assertNotSame(collectionPointer2, collectionPointer0);
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GB", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("node", qName0.getName());
      assertEquals("node", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(collectionPointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isCollection());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer2.isCollection());
      assertFalse(collectionPointer2.isRoot());
      assertNull(collectionPointer2.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer2.getIndex());
      assertFalse(collectionPointer2.isContainer());
      assertFalse(collectionPointer2.isAttribute());
      assertTrue(collectionPointer2.isNode());
      assertNotNull(collectionPointer2);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.UK;
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("GB", locale0.getCountry());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("GB", locale0.getCountry());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setAttribute(true);
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("GB", locale0.getCountry());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
      assertSame(collectionPointer0, collectionPointer1);
      assertSame(collectionPointer1, collectionPointer0);
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("GB", locale0.getCountry());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer1.isAttribute());
      assertFalse(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isNode());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ROOT;
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "/");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, 0);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer1.isContainer());
      assertFalse(collectionPointer1.isAttribute());
      assertTrue(collectionPointer1.isRoot());
      assertFalse(collectionPointer1.isNode());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(0, collectionPointer1.getIndex());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer2 = (CollectionPointer)collectionPointer1.createPath((JXPathContext) jXPathContextReferenceImpl0);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(collectionPointer2.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer2);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertSame(collectionPointer1, collectionPointer2);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertSame(collectionPointer2, collectionPointer1);
      assertNotSame(collectionPointer2, collectionPointer0);
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer1.isContainer());
      assertFalse(collectionPointer1.isAttribute());
      assertTrue(collectionPointer1.isRoot());
      assertFalse(collectionPointer1.isNode());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(0, collectionPointer1.getIndex());
      assertFalse(collectionPointer2.isNode());
      assertNull(collectionPointer2.getNamespaceURI());
      assertTrue(collectionPointer2.isContainer());
      assertFalse(collectionPointer2.isAttribute());
      assertEquals(0, collectionPointer2.getIndex());
      assertTrue(collectionPointer2.isRoot());
      assertTrue(collectionPointer2.isCollection());
      assertNotNull(collectionPointer2);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("/.", "<<unknown namespace>>");
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 4, (Object) "");
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertTrue(nodePointer0.isContainer());
      assertEquals(4, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = collectionPointer0.getBaseValue();
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNull(object0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = new CollectionPointer(nodePointer0, (Object) null);
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertFalse(collectionPointer1.equals((Object)nodePointer0));
      assertTrue(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertTrue(nodePointer0.isContainer());
      assertEquals(4, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertTrue(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isCollection());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isContainer());
      assertFalse(collectionPointer1.isRoot());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer1 = collectionPointer1.createChild((JXPathContext) null, (QName) null, Integer.MIN_VALUE, object0);
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertTrue(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)nodePointer0));
      assertTrue(collectionPointer1.equals((Object)collectionPointer0));
      assertTrue(nodePointer1.equals((Object)collectionPointer1));
      assertTrue(nodePointer1.equals((Object)collectionPointer0));
      assertFalse(nodePointer1.equals((Object)nodePointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer0, nodePointer1);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotSame(nodePointer0, nodePointer1);
      assertNotSame(nodePointer0, collectionPointer1);
      assertNotSame(collectionPointer1, nodePointer0);
      assertNotSame(collectionPointer1, nodePointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotSame(nodePointer1, collectionPointer0);
      assertNotSame(nodePointer1, nodePointer0);
      assertNotSame(nodePointer1, collectionPointer1);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertTrue(nodePointer0.isContainer());
      assertEquals(4, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertTrue(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isCollection());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isContainer());
      assertFalse(collectionPointer1.isRoot());
      assertTrue(nodePointer1.isNode());
      assertNull(nodePointer1.getNamespaceURI());
      assertFalse(nodePointer1.isRoot());
      assertFalse(nodePointer1.isAttribute());
      assertFalse(nodePointer1.isContainer());
      assertTrue(nodePointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
      assertNotNull(nodePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, (QName) null, 0, object0);
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertEquals(0, nodePointer0.getIndex());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Locale locale0 = Locale.CHINA;
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = new CollectionPointer(variablePointer0, collectionPointer0);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer1.isNode());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isRoot());
      assertFalse(collectionPointer1.isContainer());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer2 = (CollectionPointer)collectionPointer1.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, Integer.MIN_VALUE);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertTrue(collectionPointer2.equals((Object)collectionPointer1));
      assertFalse(collectionPointer2.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer0, collectionPointer2);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotSame(collectionPointer1, collectionPointer2);
      assertNotSame(collectionPointer2, collectionPointer0);
      assertNotSame(collectionPointer2, collectionPointer1);
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer1.isNode());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isRoot());
      assertFalse(collectionPointer1.isContainer());
      assertFalse(collectionPointer2.isRoot());
      assertTrue(collectionPointer2.isCollection());
      assertFalse(collectionPointer2.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer2.getIndex());
      assertFalse(collectionPointer2.isAttribute());
      assertNull(collectionPointer2.getNamespaceURI());
      assertTrue(collectionPointer2.isNode());
      assertNotNull(collectionPointer2);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.JAPANESE;
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setAttribute(true);
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "/");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, Integer.MIN_VALUE);
      assertTrue(collectionPointer1.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isAttribute());
      assertTrue(collectionPointer1.isCollection());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isRoot());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("/.", "<<unknown namespace>>");
      assertEquals("/.", qName0.getPrefix());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 2147483644);
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isNode());
      assertEquals(2147483644, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("/.", "<<unknown namespace>>");
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 4, (Object) "");
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals(4, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertTrue(nodePointer0.isRoot());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = collectionPointer0.compareChildNodePointers(collectionPointer0, nodePointer0);
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals(4, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertTrue(nodePointer0.isRoot());
      assertEquals(2147483644, int0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, (Locale) null);
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      collectionPointer0.setIndex(2071);
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(2071, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, (-3263), object0);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(2071, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isAttribute());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isRoot());
      assertEquals((-3263), collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isContainer());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = collectionPointer0.compareChildNodePointers(collectionPointer1, collectionPointer0);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(2071, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isAttribute());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isRoot());
      assertEquals((-3263), collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isContainer());
      assertEquals((-5334), int0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(0, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("vq4f1Ol8__6,&#");
      assertEquals("vq4f1Ol8__6,&#", processingInstructionTest0.getTarget());
      assertNotNull(processingInstructionTest0);
      
      NodeIterator nodeIterator0 = collectionPointer0.childIterator(processingInstructionTest0, false, collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(0, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("vq4f1Ol8__6,&#", processingInstructionTest0.getTarget());
      assertNull(nodeIterator0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.UK;
      assertEquals("en_GB", locale0.toString());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("GB", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("en_GB", locale0.toString());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("GB", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("node");
      assertEquals("node", qName0.toString());
      assertEquals("node", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(collectionPointer0, qName0, object0);
      assertEquals("en_GB", locale0.toString());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("GB", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("node", qName0.toString());
      assertEquals("node", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = new CollectionPointer(beanPointer0, qName0);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals("en_GB", locale0.toString());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("GB", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("node", qName0.toString());
      assertEquals("node", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(collectionPointer1.isContainer());
      assertFalse(collectionPointer1.isAttribute());
      assertTrue(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isCollection());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer1.setValue(collectionPointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot setValue of an object that is not some other object's property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertNotNull(locale0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(jXPathContextReferenceImpl0, locale0);
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertNotNull(collectionPointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex((-4337));
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals((-4337), collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        collectionPointer0.namespacePointer("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("], operation is not allowed for this type of node", "], operation is not allowed for this type of node");
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) collectionPointer0);
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, (-1696), object0);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isNode());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isContainer());
      assertEquals((-1696), collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isAttribute());
      assertFalse(collectionPointer1.isRoot());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer1.getValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("f=wi+d", "f=wi+d");
      assertEquals("f=wi+d:f=wi+d", qName0.toString());
      assertEquals("f=wi+d", qName0.getName());
      assertEquals("f=wi+d", qName0.getPrefix());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.GERMAN;
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "f=wi+d", locale0);
      assertEquals("f=wi+d:f=wi+d", qName0.toString());
      assertEquals("f=wi+d", qName0.getName());
      assertEquals("f=wi+d", qName0.getPrefix());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, qName0);
      assertEquals("f=wi+d:f=wi+d", qName0.toString());
      assertEquals("f=wi+d", qName0.getName());
      assertEquals("f=wi+d", qName0.getPrefix());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) qName0);
      assertEquals("f=wi+d:f=wi+d", qName0.toString());
      assertEquals("f=wi+d", qName0.getName());
      assertEquals("f=wi+d", qName0.getPrefix());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) null, (Object) jXPathContextReferenceImpl0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) collectionPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("aB5", "8w+=7D<");
      assertEquals("8w+=7D<", qName0.getName());
      assertEquals("aB5", qName0.getPrefix());
      assertEquals("aB5:8w+=7D<", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("8w+=7D<", qName0.getName());
      assertEquals("aB5", qName0.getPrefix());
      assertEquals("aB5:8w+=7D<", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.setIndex(6);
      assertEquals("8w+=7D<", qName0.getName());
      assertEquals("aB5", qName0.getPrefix());
      assertEquals("aB5:8w+=7D<", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(6, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      assertEquals("8w+=7D<", qName0.getName());
      assertEquals("aB5", qName0.getPrefix());
      assertEquals("aB5:8w+=7D<", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(6, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'aB5:8w+=7D<'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ITALIAN;
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionPointer0);
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, 10, (Object) jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 11
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("DcHlTNgX`K", "DcHlTNgX`K");
      assertEquals("DcHlTNgX`K", qName0.getName());
      assertEquals("DcHlTNgX`K", qName0.getPrefix());
      assertEquals("DcHlTNgX`K:DcHlTNgX`K", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("DcHlTNgX`K", qName0.getName());
      assertEquals("DcHlTNgX`K", qName0.getPrefix());
      assertEquals("DcHlTNgX`K:DcHlTNgX`K", qName0.toString());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, qName0);
      assertEquals("DcHlTNgX`K", qName0.getName());
      assertEquals("DcHlTNgX`K", qName0.getPrefix());
      assertEquals("DcHlTNgX`K:DcHlTNgX`K", qName0.toString());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, Integer.MIN_VALUE, object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, (Locale) null);
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, Integer.MIN_VALUE, (Object) collectionPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Locale locale0 = jXPathContextReferenceImpl0.getLocale();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertNotNull(collectionPointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = collectionPointer0.getName();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertNull(qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 8);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 9
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("ko_KR", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("ko_KR", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, 2844);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("en_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("en_CA", locale0.toString());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.compareChildNodePointers((NodePointer) null, collectionPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = Locale.GERMANY;
      assertEquals("de_DE", locale0.toString());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) variablePointer0, locale0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(1650);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(1650, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.childIterator(nodeNameTest0, false, beanPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("], operation is not allowed for this type of node", "], operation is not allowed for this type of node");
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer1 = new VariablePointer(basicVariables0, qName0);
      assertFalse(variablePointer1.equals((Object)variablePointer0));
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer1.setIndex(1650);
      assertFalse(variablePointer1.equals((Object)variablePointer0));
      assertNotSame(variablePointer1, variablePointer0);
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals(1650, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer1, variablePointer0);
      assertFalse(variablePointer0.equals((Object)variablePointer1));
      assertFalse(variablePointer1.equals((Object)variablePointer0));
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(1650, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '], operation is not allowed for this type of node:], operation is not allowed for this type of node'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(4);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(4, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.createPath((JXPathContext) null);
      assertSame(collectionPointer0, nodePointer0);
      assertSame(nodePointer0, collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(4, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isCollection());
      assertTrue(nodePointer0.isContainer());
      assertNull(nodePointer0.getNamespaceURI());
      assertEquals(4, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, (Locale) null);
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex((-93));
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals((-93), collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)collectionPointer0.getValuePointer();
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals((-93), collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("/.", "<<unknown namespace>>");
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 4, (Object) "");
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isRoot());
      assertEquals(4, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NullPointer nullPointer0 = (NullPointer)nodePointer0.getValuePointer();
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isRoot());
      assertEquals(4, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isActual());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isNode());
      assertNotNull(nullPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.UK;
      assertEquals("GB", locale0.getCountry());
      assertEquals("en_GB", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("GB", locale0.getCountry());
      assertEquals("en_GB", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(collectionPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(4);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertEquals(4, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setValue((Object) null);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertEquals(4, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(4);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(4, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = collectionPointer0.getImmediateNode();
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(4, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNull(object0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.createPath((JXPathContext) null, object0);
      assertSame(collectionPointer0, nodePointer0);
      assertSame(nodePointer0, collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(4, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertEquals(4, nodePointer0.getIndex());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isRoot());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QName qName0 = new QName("");
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = Locale.GERMANY;
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) variablePointer0, locale0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)collectionPointer0.getImmediateNode();
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isActual());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(4);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(4, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = collectionPointer0.asPath();
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(4, collectionPointer0.getIndex());
      assertEquals("/.[5]", string0);
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("], operation is not allowed for this type of node", "], operation is not allowed for this type of node");
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) collectionPointer0);
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, (-1696), object0);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertEquals("], operation is not allowed for this type of node", qName0.getName());
      assertEquals("], operation is not allowed for this type of node", qName0.getPrefix());
      assertEquals("], operation is not allowed for this type of node:], operation is not allowed for this type of node", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer1.isAttribute());
      assertEquals((-1696), collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isRoot());
      assertFalse(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isCollection());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isContainer());
      assertNotNull(collectionPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer1.createAttribute((JXPathContext) null, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an attribute for path $], operation is not allowed for this type of node:], operation is not allowed for this type of node[-1695]/@], operation is not allowed for this type of node:], operation is not allowed for this type of node, operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, beanPointer0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = collectionPointer0.asPath();
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals("$", string0);
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = collectionPointer0.asPath();
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals("/", string0);
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = new Locale("");
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      boolean boolean0 = collectionPointer0.testNode(nodeTypeTest0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.GERMAN;
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      assertEquals("<<unknown namespace>>", processingInstructionTest0.getTarget());
      assertNotNull(processingInstructionTest0);
      
      boolean boolean0 = collectionPointer0.testNode(processingInstructionTest0);
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertEquals("<<unknown namespace>>", processingInstructionTest0.getTarget());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.UK;
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("GB", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_GB", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("GB", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_GB", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      assertEquals(1, nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      boolean boolean0 = collectionPointer0.testNode(nodeTypeTest0);
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("GB", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_GB", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals(1, nodeTypeTest0.getNodeType());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.GERMAN;
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = collectionPointer0.testNode((NodeTest) null);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QName qName0 = new QName("");
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = Locale.GERMANY;
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("DE", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) variablePointer0, locale0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("DE", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      boolean boolean0 = collectionPointer0.testNode(nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("DE", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("/.", "<<unknown namespace>>");
      assertEquals("/.", qName0.getPrefix());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 4, (Object) "");
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertTrue(nodePointer0.isCollection());
      assertEquals(4, nodePointer0.getIndex());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      boolean boolean0 = nodePointer0.testNode(nodeNameTest0);
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertTrue(nodePointer0.isCollection());
      assertEquals(4, nodePointer0.getIndex());
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ROOT;
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.toString());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.namespacePointer("<<unknown namespace>>");
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.toString());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.GERMAN;
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex((-1548));
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals((-1548), collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.namespacePointer("<<unknown namespace>>");
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals((-1548), collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeIterator nodeIterator0 = collectionPointer0.namespaceIterator();
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(nodeIterator0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNotNull(collectionPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("/.", "<<unknown namespace>>");
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertNotNull(qName0);
      
      NodeIterator nodeIterator0 = collectionPointer0.attributeIterator(qName0);
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals("/.:<<unknown namespace>>", qName0.toString());
      assertEquals("/.", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals(0, nodeIterator0.getPosition());
      assertNotNull(nodeIterator0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.GERMANY;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) variablePointer0, locale0);
      collectionPointer0.setIndex(1650);
      // Undeclared exception!
      try { 
        collectionPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ROOT;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      QName qName0 = new QName("=C:#t|1x{0Y'", "/");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "/");
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodeIterator nodeIterator0 = collectionPointer0.childIterator(nodeNameTest0, true, variablePointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      Locale locale0 = Locale.GERMANY;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) variablePointer0, locale0);
      collectionPointer0.setIndex(1650);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      // Undeclared exception!
      try { 
        collectionPointer0.childIterator(nodeNameTest0, false, nodePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ROOT;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      Object object1 = new Object();
      CollectionPointer collectionPointer1 = new CollectionPointer(collectionPointer0, object1);
      boolean boolean0 = collectionPointer0.equals(collectionPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ROOT;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      boolean boolean0 = collectionPointer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setIndex(4);
      collectionPointer0.namespaceIterator();
      boolean boolean0 = collectionPointer0.isLeaf();
      assertEquals(4, collectionPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      QName qName0 = new QName("], operation is not allowed for this type of node", "], operation is not allowed for this type of node");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      BasicVariables basicVariables0 = new BasicVariables();
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) null, (Object) basicVariables0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: ], operation is not allowed for this type of node:], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setIndex(4);
      boolean boolean0 = collectionPointer0.isContainer();
      assertEquals(4, collectionPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ROOT;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.isContainer();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, basicVariables0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, "<<unknown namespace>>");
      boolean boolean0 = collectionPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      QName qName0 = new QName("], operation is not allowed for this type of node", "], operation is not allowed for this type of node");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      boolean boolean0 = collectionPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      int int0 = collectionPointer0.compareChildNodePointers(collectionPointer0, collectionPointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, (Locale) null);
      boolean boolean0 = collectionPointer0.isCollection();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("/.", "<<unknown namespace>>");
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 4, (Object) "");
      boolean boolean0 = ((CollectionPointer) nodePointer0).equals(collectionPointer0);
      assertFalse(boolean0);
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertEquals(4, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.UK;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      int int0 = collectionPointer0.getLength();
      assertEquals(1, int0);
  }
}
