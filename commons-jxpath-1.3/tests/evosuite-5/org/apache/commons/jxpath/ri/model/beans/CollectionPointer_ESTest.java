
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
      QName qName0 = new QName("V*~D>R\"+ssR|_9U", "");
      assertNotNull(qName0);
      assertEquals("V*~D>R\"+ssR|_9U", qName0.getPrefix());
      assertEquals("V*~D>R\"+ssR|_9U:", qName0.toString());
      assertEquals("", qName0.getName());
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, object0);
      assertNotNull(collectionPointer0);
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, (-403));
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals("V*~D>R\"+ssR|_9U", qName0.getPrefix());
      assertEquals("V*~D>R\"+ssR|_9U:", qName0.toString());
      assertEquals("", qName0.getName());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isContainer());
      assertEquals((-403), nodePointer0.getIndex());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = collectionPointer0.equals(nodePointer0);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertFalse(boolean0);
      assertEquals("V*~D>R\"+ssR|_9U", qName0.getPrefix());
      assertEquals("V*~D>R\"+ssR|_9U:", qName0.toString());
      assertEquals("", qName0.getName());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isContainer());
      assertEquals((-403), nodePointer0.getIndex());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, (Locale) null);
      assertNotNull(collectionPointer0);
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(22);
      assertEquals(22, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.hashCode();
      assertEquals(22, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("^nTOpNGgJZV!");
      assertNotNull(locale0);
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.getValuePointer();
      assertSame(collectionPointer0, nodePointer0);
      assertSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isContainer());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("5iTu)uZmrYE?A");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "5iTu)uZmrYE?A");
      assertNotNull(collectionPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setAttribute(true);
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.getValuePointer();
      assertSame(collectionPointer0, nodePointer0);
      assertSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isAttribute());
      assertFalse(nodePointer0.isContainer());
      assertTrue(nodePointer0.isNode());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      assertNotNull(locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = collectionPointer0.getLength();
      assertEquals(0, int0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNotNull(variablePointer0);
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, (Object) null);
      assertNotNull(collectionPointer0);
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = collectionPointer0.getImmediateNode();
      assertNull(object0);
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("^nTOpNGgJZV!");
      assertNotNull(locale0);
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = collectionPointer0.getBaseValue();
      assertNull(object0);
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("^nTOpNGgJZV!");
      assertNotNull(locale0);
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getCountry());
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionPointer0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, 0, (Object) null);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isAttribute());
      assertTrue(collectionPointer1.isContainer());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(0, collectionPointer1.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer2 = (CollectionPointer)collectionPointer1.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) null);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer0, collectionPointer2);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertSame(collectionPointer1, collectionPointer2);
      assertNotSame(collectionPointer2, collectionPointer0);
      assertSame(collectionPointer2, collectionPointer1);
      assertNotNull(collectionPointer2);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(collectionPointer2.equals((Object)collectionPointer0));
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isAttribute());
      assertTrue(collectionPointer1.isContainer());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(0, collectionPointer1.getIndex());
      assertEquals(0, collectionPointer2.getIndex());
      assertFalse(collectionPointer2.isAttribute());
      assertTrue(collectionPointer2.isCollection());
      assertNull(collectionPointer2.getNamespaceURI());
      assertFalse(collectionPointer2.isNode());
      assertTrue(collectionPointer2.isContainer());
      assertTrue(collectionPointer2.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      assertNotNull(collectionPointer0);
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, 2229, (Object) null);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isContainer());
      assertEquals(2229, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isAttribute());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer2 = (CollectionPointer)collectionPointer1.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) "r(c|b\"wAD?");
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer0, collectionPointer2);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertSame(collectionPointer1, collectionPointer2);
      assertNotSame(collectionPointer2, collectionPointer0);
      assertSame(collectionPointer2, collectionPointer1);
      assertNotNull(collectionPointer2);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(collectionPointer2.equals((Object)collectionPointer0));
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isContainer());
      assertEquals(2229, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isAttribute());
      assertFalse(collectionPointer2.isNode());
      assertFalse(collectionPointer2.isAttribute());
      assertTrue(collectionPointer2.isRoot());
      assertEquals(2229, collectionPointer2.getIndex());
      assertTrue(collectionPointer2.isContainer());
      assertTrue(collectionPointer2.isCollection());
      assertNull(collectionPointer2.getNamespaceURI());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = new CollectionPointer(collectionPointer0, collectionPointer0);
      assertNotNull(collectionPointer1);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isRoot());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isAttribute());
      assertFalse(collectionPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(24);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(24, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer1.createPath((JXPathContext) null, (Object) null);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertSame(collectionPointer1, nodePointer0);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertSame(nodePointer0, collectionPointer1);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr_FR", locale0.toString());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(24, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isRoot());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isAttribute());
      assertFalse(collectionPointer1.isContainer());
      assertFalse(nodePointer0.isContainer());
      assertTrue(nodePointer0.isNode());
      assertFalse(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isCollection());
      assertNull(nodePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale.LanguageRange locale_LanguageRange0 = new Locale.LanguageRange("O");
      assertNotNull(locale_LanguageRange0);
      
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(locale_LanguageRange0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = new CollectionPointer(collectionPointer0, "O");
      assertNotNull(collectionPointer1);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isAttribute());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer2 = (CollectionPointer)collectionPointer1.createPath((JXPathContext) jXPathContextReferenceImpl0);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer0, collectionPointer2);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertSame(collectionPointer1, collectionPointer2);
      assertNotSame(collectionPointer2, collectionPointer0);
      assertSame(collectionPointer2, collectionPointer1);
      assertNotNull(collectionPointer2);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(collectionPointer2.equals((Object)collectionPointer0));
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isAttribute());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isContainer());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(Integer.MIN_VALUE, collectionPointer2.getIndex());
      assertTrue(collectionPointer2.isCollection());
      assertNull(collectionPointer2.getNamespaceURI());
      assertFalse(collectionPointer2.isContainer());
      assertFalse(collectionPointer2.isRoot());
      assertTrue(collectionPointer2.isNode());
      assertFalse(collectionPointer2.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertNotNull(locale0);
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setAttribute(true);
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.createPath((JXPathContext) null);
      assertSame(collectionPointer0, nodePointer0);
      assertSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isContainer());
      assertTrue(nodePointer0.isCollection());
      assertTrue(nodePointer0.isNode());
      assertTrue(nodePointer0.isAttribute());
      assertNull(nodePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      assertNotNull(collectionPointer0);
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setAttribute(true);
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, (QName) null, (-1), (Object) null);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertTrue(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isCollection());
      assertEquals((-1), nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "");
      assertNotNull(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      assertNotNull(collectionPointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, object0);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      assertTrue(nodePointer0.equals((Object)collectionPointer0));
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isRoot());
      assertTrue(nodePointer0.isNode());
      assertFalse(nodePointer0.isContainer());
      assertTrue(nodePointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      assertNotNull(locale0);
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, locale0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) beanPointer0, (Object) locale0);
      assertNotNull(collectionPointer0);
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, Integer.MIN_VALUE);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
      assertTrue(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer1.isAttribute());
      assertFalse(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isNode());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, (Locale) null);
      assertNotNull(collectionPointer0);
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, 0);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer1.isContainer());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isAttribute());
      assertTrue(collectionPointer1.isRoot());
      assertEquals(0, collectionPointer1.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      assertNotNull(collectionPointer0);
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, 4102);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer1.isCollection());
      assertTrue(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isContainer());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isAttribute());
      assertEquals(4102, collectionPointer1.getIndex());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = collectionPointer0.getName();
      assertNull(qName0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex((-3716));
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertEquals((-3716), collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer(collectionPointer0, qName0, qName0);
      assertNotNull(nullPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertEquals((-3716), collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isAttribute());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isRoot());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = collectionPointer0.compareChildNodePointers(nullPointer0, collectionPointer0);
      assertEquals((-2147479932), int0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertEquals((-3716), collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isAttribute());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isRoot());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      assertNotNull(collectionPointer0);
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, 2229, (Object) null);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(2229, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isAttribute());
      assertTrue(collectionPointer1.isRoot());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isContainer());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(64);
      assertNotNull(nodeTypeTest0);
      assertEquals(64, nodeTypeTest0.getNodeType());
      
      NodeIterator nodeIterator0 = collectionPointer1.childIterator(nodeTypeTest0, true, collectionPointer1);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNull(nodeIterator0);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(2229, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isAttribute());
      assertTrue(collectionPointer1.isRoot());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isNode());
      assertTrue(collectionPointer1.isContainer());
      assertEquals(64, nodeTypeTest0.getNodeType());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      collectionPointer0.setIndex(24);
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(24, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, (String) null);
      assertNotNull(nodeNameTest0);
      assertNull(nodeNameTest0.getNamespaceURI());
      
      // Undeclared exception!
      try { 
        collectionPointer0.testNode(nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNotNull(variablePointer0);
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      assertNotNull(collectionPointer0);
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(collectionPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.PRC;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, object0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, (Object) null);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      collectionPointer0.setIndex(5);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(5, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.namespacePointer("EqEK<");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      collectionPointer0.setIndex(5);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(5, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.namespaceIterator();
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
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fr_FR", locale0.toString());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fr_FR", locale0.toString());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      collectionPointer0.setIndex(5);
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fr_FR", locale0.toString());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(5, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.isLeaf();
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
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      collectionPointer0.setIndex(24);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals(24, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.getValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("{object of type ");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      assertEquals("{object of type ", qName0.toString());
      
      Locale locale0 = Locale.CHINESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "{object of type ", locale0);
      assertNotNull(beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      assertEquals("{object of type ", qName0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) beanPointer0, (Object) locale0);
      assertNotNull(collectionPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      assertEquals("{object of type ", qName0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) collectionPointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(24);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(24, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 25
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      collectionPointer0.setIndex(24);
      assertEquals("fr_FR", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(24, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ITALY;
      assertNotNull(locale0);
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("Fzg~B^!E`LS;)}G}Hw", "<<unknown namespace>>");
      assertNotNull(qName0);
      assertEquals("Fzg~B^!E`LS;)}G}Hw:<<unknown namespace>>", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("Fzg~B^!E`LS;)}G}Hw", qName0.getPrefix());
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) null, qName0, 1373, (Object) locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 1374
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("{object of type ");
      assertNotNull(qName0);
      assertEquals("{object of type ", qName0.toString());
      assertEquals("{object of type ", qName0.getName());
      assertNull(qName0.getPrefix());
      
      Locale locale0 = Locale.CHINESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "{object of type ", locale0);
      assertNotNull(beanPointer0);
      assertEquals("{object of type ", qName0.toString());
      assertEquals("{object of type ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) beanPointer0, (Object) locale0);
      assertNotNull(collectionPointer0);
      assertEquals("{object of type ", qName0.toString());
      assertEquals("{object of type ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
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
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) null, (QName) null, 595, (Object) collectionPointer0);
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
      
      Locale locale0 = Locale.US;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_US", locale0.toString());
      assertEquals("US", locale0.getCountry());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_US", locale0.toString());
      assertEquals("US", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionPointer0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("", locale0.getVariant());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_US", locale0.toString());
      assertEquals("US", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("Hb");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("Hb", qName0.toString());
      assertEquals("Hb", qName0.getName());
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 542);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 543
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("FR", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("FR", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      QName qName0 = new QName("<<unknown namespace>>", "3x~yS}GhgQ-I]AFf");
      assertNotNull(qName0);
      assertEquals("3x~yS}GhgQ-I]AFf", qName0.getName());
      assertEquals("<<unknown namespace>>:3x~yS}GhgQ-I]AFf", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) null, qName0, 615);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      assertNotNull(collectionPointer0);
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QName qName0 = new QName("{object of type ");
      assertNotNull(qName0);
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      
      Locale locale0 = Locale.CHINESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "{object of type ", locale0);
      assertNotNull(beanPointer0);
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) beanPointer0, (Object) locale0);
      assertNotNull(collectionPointer0);
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(309);
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(309, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.childIterator((NodeTest) null, true, collectionPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, (Locale) null);
      assertNotNull(collectionPointer0);
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(22);
      assertEquals(22, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
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
  public void test38()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.setIndex(1);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(1, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "");
      assertNotNull(collectionPointer0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(1, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        collectionPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.GERMANY;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de_DE", locale0.toString());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de_DE", locale0.toString());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object1 = collectionPointer0.getValue();
      assertSame(object0, object1);
      assertSame(object1, object0);
      assertNotNull(object1);
      assertEquals("", locale0.getVariant());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de_DE", locale0.toString());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.GERMANY;
      assertNotNull(locale0);
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("de_DE", locale0.toString());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
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
  public void test41()  throws Throwable  {
      Locale.LanguageRange locale_LanguageRange0 = new Locale.LanguageRange("O");
      assertNotNull(locale_LanguageRange0);
      
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(locale_LanguageRange0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setValue(collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale.LanguageRange locale_LanguageRange0 = new Locale.LanguageRange("O");
      assertNotNull(locale_LanguageRange0);
      
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(locale_LanguageRange0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(0, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)jXPathContextReferenceImpl0.getRelativeContext(collectionPointer0);
      assertNotSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertNotSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
      assertNotNull(jXPathContextReferenceImpl1);
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl0));
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(0, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Locale.LanguageRange locale_LanguageRange0 = new Locale.LanguageRange("O");
      assertNotNull(locale_LanguageRange0);
      
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(locale_LanguageRange0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = collectionPointer0.getImmediateNode();
      assertSame(locale_LanguageRange0, object0);
      assertSame(object0, locale_LanguageRange0);
      assertNotNull(object0);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale.LanguageRange locale_LanguageRange0 = new Locale.LanguageRange("O");
      assertNotNull(locale_LanguageRange0);
      
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(locale_LanguageRange0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = collectionPointer0.getBaseValue();
      assertSame(locale_LanguageRange0, object0);
      assertSame(object0, locale_LanguageRange0);
      assertNotNull(object0);
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(24);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals(24, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = collectionPointer0.toString();
      assertNotNull(string0);
      assertEquals("/.[25]", string0);
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals(24, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      QName qName0 = new QName("{object of type ");
      assertNotNull(qName0);
      assertEquals("{object of type ", qName0.getName());
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      
      Locale locale0 = Locale.CHINESE;
      assertNotNull(locale0);
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "{object of type ", locale0);
      assertNotNull(beanPointer0);
      assertEquals("{object of type ", qName0.getName());
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) beanPointer0, (Object) locale0);
      assertNotNull(collectionPointer0);
      assertEquals("{object of type ", qName0.getName());
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(309);
      assertEquals("{object of type ", qName0.getName());
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(309, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = collectionPointer0.asPath();
      assertNotNull(string0);
      assertEquals("'{object of type '[310]", string0);
      assertEquals("{object of type ", qName0.getName());
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("zh", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(309, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer1 = new CollectionPointer(collectionPointer0, collectionPointer0);
      assertNotNull(collectionPointer1);
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isAttribute());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = collectionPointer1.asPath();
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotNull(string0);
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals("/", string0);
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer1.isRoot());
      assertTrue(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isAttribute());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = collectionPointer0.asPath();
      assertNotNull(string0);
      assertEquals("/", string0);
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ENGLISH;
      assertNotNull(locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      assertNotNull(processingInstructionTest0);
      assertEquals("", processingInstructionTest0.getTarget());
      
      boolean boolean0 = collectionPointer0.testNode(processingInstructionTest0);
      assertFalse(boolean0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertEquals("", processingInstructionTest0.getTarget());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.GERMANY;
      assertNotNull(locale0);
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de_DE", locale0.toString());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de_DE", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      assertNotNull(qName0);
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:<<unknown namespace>>", qName0.toString());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      assertNotNull(nodeNameTest0);
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:<<unknown namespace>>", qName0.toString());
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("<<unknown namespace>>:<<unknown namespace>>", nodeNameTest0.toString());
      
      boolean boolean0 = collectionPointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("DE", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de_DE", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:<<unknown namespace>>", qName0.toString());
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("<<unknown namespace>>:<<unknown namespace>>", nodeNameTest0.toString());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QName qName0 = new QName("{object of type ");
      assertNotNull(qName0);
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      
      Locale locale0 = Locale.CHINESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "{object of type ", locale0);
      assertNotNull(beanPointer0);
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) beanPointer0, (Object) locale0);
      assertNotNull(collectionPointer0);
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = collectionPointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
      assertEquals("{object of type ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("{object of type ", qName0.getName());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("zh", locale0.toString());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertNotNull(locale0);
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-9));
      assertNotNull(nodeTypeTest0);
      assertEquals((-9), nodeTypeTest0.getNodeType());
      
      boolean boolean0 = collectionPointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals((-9), nodeTypeTest0.getNodeType());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      QName qName0 = new QName("5iTu)uZmrYE?A");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "5iTu)uZmrYE?A");
      assertNotNull(collectionPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.namespacePointer("<<unknown namespace>>");
      assertNull(nodePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.FRANCE;
      assertNotNull(locale0);
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertNotNull(collectionPointer0);
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setIndex(5);
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(5, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = collectionPointer0.namespacePointer("EqEK<");
      assertNull(nodePointer0);
      assertEquals("FR", locale0.getCountry());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_FR", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("FRA", locale0.getISO3Country());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(5, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      QName qName0 = new QName("5iTu)uZmrYE?A");
      assertNotNull(qName0);
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "5iTu)uZmrYE?A");
      assertNotNull(collectionPointer0);
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeIterator nodeIterator0 = collectionPointer0.namespaceIterator();
      assertNull(nodeIterator0);
      assertEquals("5iTu)uZmrYE?A", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("5iTu)uZmrYE?A", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      QName qName0 = new QName("5iTu)u*mrYE?A");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "5iTu)u*mrYE?A");
      NodeIterator nodeIterator0 = collectionPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = new Locale("Wa9<VEKx3A#h6", "Wa9<VEKx3A#h6", "Wa9<VEKx3A#h6");
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      QName qName0 = new QName("Wa9<VEKx3A#h6");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodeIterator nodeIterator0 = collectionPointer0.childIterator(nodeNameTest0, false, collectionPointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setIndex(24);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      // Undeclared exception!
      try { 
        collectionPointer0.childIterator(nodeNameTest0, true, collectionPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setIndex(24);
      CollectionPointer collectionPointer1 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer1);
      assertEquals(24, collectionPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      CollectionPointer collectionPointer1 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      CollectionPointer collectionPointer1 = new CollectionPointer(collectionPointer0, collectionPointer0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      QName qName0 = new QName("5iTu)u*mrYE?A");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "5iTu)u*mrYE?A");
      Object object0 = new Object();
      boolean boolean0 = collectionPointer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setIndex(24);
      boolean boolean0 = collectionPointer0.isContainer();
      assertEquals(24, collectionPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.isContainer();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ENGLISH;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      QName qName0 = new QName("5iTu)u*mrYE?A");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "5iTu)u*mrYE?A");
      collectionPointer0.isLeaf();
      NodePointer nodePointer0 = collectionPointer0.getValuePointer();
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      boolean boolean0 = collectionPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      NodePointer nodePointer0 = collectionPointer0.createChild(jXPathContext0, (QName) null, (-1));
      int int0 = collectionPointer0.compareChildNodePointers(nodePointer0, collectionPointer0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      QName qName0 = new QName("5iTu)u*mrYE?A");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "5iTu)u*mrYE?A");
      int int0 = collectionPointer0.compareChildNodePointers(variablePointer0, collectionPointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      NodePointer nodePointer0 = collectionPointer0.createChild(jXPathContext0, (QName) null, 2229, (Object) null);
      NodePointer nodePointer1 = nodePointer0.createPath(jXPathContext0);
      assertEquals(2229, nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      QName qName0 = new QName("5iTu)u*mrYE?A");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "5iTu)u*mrYE?A");
      boolean boolean0 = collectionPointer0.isCollection();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      QName qName0 = new QName("5iTu)u*mrYE?A");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "5iTu)u*mrYE?A");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionPointer0);
      // Undeclared exception!
      try { 
        collectionPointer0.createPath(jXPathContext0, (Object) collectionPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: 5iTu)u*mrYE?A
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      int int0 = collectionPointer0.getLength();
      assertEquals(1, int0);
  }
}
