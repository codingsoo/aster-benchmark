
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
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NodePointer_ESTest extends NodePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(nullPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = ((NodePointer)nullPointer0).escape("\"preceding::\"");
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals("&quot;preceding::&quot;", string0);
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName((String) null, "/G)");
      assertEquals("/G)", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("/G)", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("/G)", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("/G)", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("/G)", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("/G)", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isRoot());
      assertNotNull(beanPointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, (-1285));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path $/G)//G)[-1284], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.remove();
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeIterator nodeIterator0 = variablePointer0.namespaceIterator();
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(nodeIterator0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getValuePointer();
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = nodePointer0.isLeaf();
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      QName qName0 = new QName("R`.(\">q&4yp", "R`.(\">q&4yp");
      assertEquals("R`.(\">q&4yp", qName0.getName());
      assertEquals("R`.(\">q&4yp:R`.(\">q&4yp", qName0.toString());
      assertEquals("R`.(\">q&4yp", qName0.getPrefix());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.KOREAN;
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("ko", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("R`.(\">q&4yp", qName0.getName());
      assertEquals("R`.(\">q&4yp:R`.(\">q&4yp", qName0.toString());
      assertEquals("R`.(\">q&4yp", qName0.getPrefix());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("ko", locale0.toString());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer0.isLeaf();
      assertEquals("R`.(\">q&4yp", qName0.getName());
      assertEquals("R`.(\">q&4yp:R`.(\">q&4yp", qName0.toString());
      assertEquals("R`.(\">q&4yp", qName0.getPrefix());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("ko", locale0.toString());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManager has been specified");
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isContainer();
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      QName qName0 = new QName("Y!'W^@`.fV60~>g", "gF\"d:c");
      assertEquals("gF\"d:c", qName0.getName());
      assertEquals("Y!'W^@`.fV60~>g:gF\"d:c", qName0.toString());
      assertEquals("Y!'W^@`.fV60~>g", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("gF\"d:c", qName0.getName());
      assertEquals("Y!'W^@`.fV60~>g:gF\"d:c", qName0.toString());
      assertEquals("Y!'W^@`.fV60~>g", qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals("gF\"d:c", qName0.getName());
      assertEquals("Y!'W^@`.fV60~>g:gF\"d:c", qName0.toString());
      assertEquals("Y!'W^@`.fV60~>g", qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = nodePointer0.isCollection();
      assertEquals("gF\"d:c", qName0.getName());
      assertEquals("Y!'W^@`.fV60~>g:gF\"d:c", qName0.toString());
      assertEquals("Y!'W^@`.fV60~>g", qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("\"position\"", "qz");
      assertEquals("qz", qName0.getName());
      assertEquals("\"position\"", qName0.getPrefix());
      assertEquals("\"position\":qz", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("qz", qName0.getName());
      assertEquals("\"position\"", qName0.getPrefix());
      assertEquals("\"position\":qz", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isActual();
      assertEquals("qz", qName0.getName());
      assertEquals("\"position\"", qName0.getPrefix());
      assertEquals("\"position\":qz", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isActual();
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      QName qName0 = new QName("'", "'");
      assertEquals("':'", qName0.toString());
      assertEquals("'", qName0.getPrefix());
      assertEquals("'", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("':'", qName0.toString());
      assertEquals("'", qName0.getPrefix());
      assertEquals("'", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("':'", qName0.toString());
      assertEquals("'", qName0.getPrefix());
      assertEquals("'", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("':'", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, nodeNameTest0);
      assertEquals("':'", qName0.toString());
      assertEquals("'", qName0.getPrefix());
      assertEquals("'", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("':'", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getValuePointer();
      assertEquals("':'", qName0.toString());
      assertEquals("'", qName0.getPrefix());
      assertEquals("'", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("':'", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer1.isContainer());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer1.getLength());
      assertTrue(beanPointer1.isNode());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertNotNull(beanPointer1);
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      QName qName0 = new QName("'");
      assertEquals("'", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("'", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("'", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("'", qName0.toString());
      assertEquals("'", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, nodeNameTest0);
      assertEquals("'", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("'", qName0.toString());
      assertEquals("'", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getValuePointer();
      assertEquals("'", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("'", qName0.toString());
      assertEquals("'", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertTrue(beanPointer1.isRoot());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isContainer());
      assertNotNull(beanPointer1);
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertNotNull(beanPointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)beanPointer0.getRootNode();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertNotNull(jXPathContextReferenceImpl1);
      assertSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      QName qName0 = new QName("W2=irbK");
      assertEquals("W2=irbK", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("W2=irbK", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("W2=irbK", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("W2=irbK", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getParent();
      assertEquals("W2=irbK", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("W2=irbK", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      QName qName0 = new QName("(");
      assertEquals("(", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("(", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("(", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("(", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName1 = variablePointer0.getName();
      assertEquals("(", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("(", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(qName1.getPrefix());
      assertEquals("(", qName1.toString());
      assertEquals("(", qName1.getName());
      assertNotNull(qName1);
      assertSame(qName0, qName1);
      assertSame(qName1, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      QName qName0 = new QName("Y!'W^@`.fV60~>g", "gF\"d:c");
      assertEquals("Y!'W^@`.fV60~>g", qName0.getPrefix());
      assertEquals("gF\"d:c", qName0.getName());
      assertEquals("Y!'W^@`.fV60~>g:gF\"d:c", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("Y!'W^@`.fV60~>g", qName0.getPrefix());
      assertEquals("gF\"d:c", qName0.getName());
      assertEquals("Y!'W^@`.fV60~>g:gF\"d:c", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = variablePointer0.getLength();
      assertEquals("Y!'W^@`.fV60~>g", qName0.getPrefix());
      assertEquals("gF\"d:c", qName0.getName());
      assertEquals("Y!'W^@`.fV60~>g:gF\"d:c", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNotNull(beanPointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = beanPointer0.getLength();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, int0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = variablePointer0.getIndex();
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, int0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("AHVcu9!", "m??n4");
      assertEquals("m??n4", qName0.getName());
      assertEquals("AHVcu9!", qName0.getPrefix());
      assertEquals("AHVcu9!:m??n4", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("m??n4", qName0.getName());
      assertEquals("AHVcu9!", qName0.getPrefix());
      assertEquals("AHVcu9!:m??n4", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateParentPointer();
      assertEquals("m??n4", qName0.getName());
      assertEquals("AHVcu9!", qName0.getPrefix());
      assertEquals("AHVcu9!:m??n4", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("Exception trying to remove all for xpath ");
      assertNull(qName0.getPrefix());
      assertEquals("Exception trying to remove all for xpath ", qName0.getName());
      assertEquals("Exception trying to remove all for xpath ", qName0.toString());
      assertNotNull(qName0);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("Exception trying to remove all for xpath ", qName0.getName());
      assertEquals("Exception trying to remove all for xpath ", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(qName0.getPrefix());
      assertEquals("Exception trying to remove all for xpath ", qName0.getName());
      assertEquals("Exception trying to remove all for xpath ", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer1.isContainer());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isNode());
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)variablePointer1.getImmediateValuePointer();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(qName0.getPrefix());
      assertEquals("Exception trying to remove all for xpath ", qName0.getName());
      assertEquals("Exception trying to remove all for xpath ", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer1.isContainer());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(beanPointer0);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer2 = (VariablePointer)beanPointer0.getImmediateParentPointer();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(qName0.getPrefix());
      assertEquals("Exception trying to remove all for xpath ", qName0.getName());
      assertEquals("Exception trying to remove all for xpath ", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer1.isContainer());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(variablePointer2.getNamespaceURI());
      assertFalse(variablePointer2.isNode());
      assertTrue(variablePointer2.isContainer());
      assertTrue(variablePointer2.isRoot());
      assertFalse(variablePointer2.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer2.getIndex());
      assertTrue(variablePointer2.isActual());
      assertNotNull(variablePointer2);
      assertSame(variablePointer0, variablePointer2);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertSame(variablePointer1, variablePointer2);
      assertSame(variablePointer2, variablePointer1);
      assertSame(variablePointer2, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      QName qName0 = new QName("'", "'");
      assertEquals("'", qName0.getPrefix());
      assertEquals("'", qName0.getName());
      assertEquals("':'", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("'", qName0.getPrefix());
      assertEquals("'", qName0.getName());
      assertEquals("':'", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("':'", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, nodeNameTest0);
      assertEquals("'", qName0.getPrefix());
      assertEquals("'", qName0.getName());
      assertEquals("':'", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("':'", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest1 = (NodeNameTest)beanPointer0.getImmediateNode();
      assertEquals("'", qName0.getPrefix());
      assertEquals("'", qName0.getName());
      assertEquals("':'", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("':'", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals("':'", nodeNameTest1.toString());
      assertNull(nodeNameTest1.getNamespaceURI());
      assertFalse(nodeNameTest1.isWildcard());
      assertNotNull(nodeNameTest1);
      assertSame(nodeNameTest0, nodeNameTest1);
      assertSame(nodeNameTest1, nodeNameTest0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      QName qName0 = new QName("R61?0-W~a8");
      assertEquals("R61?0-W~a8", qName0.toString());
      assertEquals("R61?0-W~a8", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("R61?0-W~a8", qName0.toString());
      assertEquals("R61?0-W~a8", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals("R61?0-W~a8", qName0.toString());
      assertEquals("R61?0-W~a8", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = nodePointer0.getBaseValue();
      assertEquals("R61?0-W~a8", qName0.toString());
      assertEquals("R61?0-W~a8", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(object0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      QName qName0 = new QName("Ar[");
      assertEquals("Ar[", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Ar[", qName0.getName());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.US;
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("US", locale0.getCountry());
      assertEquals("en_US", locale0.toString());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("Ar[", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Ar[", qName0.getName());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("US", locale0.getCountry());
      assertEquals("en_US", locale0.toString());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName1 = (QName)beanPointer0.getBaseValue();
      assertEquals("Ar[", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Ar[", qName0.getName());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("US", locale0.getCountry());
      assertEquals("en_US", locale0.toString());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals("Ar[", qName1.getName());
      assertNull(qName1.getPrefix());
      assertEquals("Ar[", qName1.toString());
      assertNotNull(qName1);
      assertSame(qName0, qName1);
      assertSame(qName1, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      QName qName0 = new QName("}H?XIj^JV_");
      assertNull(qName0.getPrefix());
      assertEquals("}H?XIj^JV_", qName0.getName());
      assertEquals("}H?XIj^JV_", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("}H?XIj^JV_", qName0.getName());
      assertEquals("}H?XIj^JV_", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = variablePointer0.escape("");
      assertNull(qName0.getPrefix());
      assertEquals("}H?XIj^JV_", qName0.getName());
      assertEquals("}H?XIj^JV_", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("+:Bx|Y", "+:Bx|Y");
      assertEquals("+:Bx|Y", qName0.getPrefix());
      assertEquals("+:Bx|Y", qName0.getName());
      assertEquals("+:Bx|Y:+:Bx|Y", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("+:Bx|Y", qName0.getPrefix());
      assertEquals("+:Bx|Y", qName0.getName());
      assertEquals("+:Bx|Y:+:Bx|Y", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      assertEquals("+:Bx|Y", qName0.getPrefix());
      assertEquals("+:Bx|Y", qName0.getName());
      assertEquals("+:Bx|Y:+:Bx|Y", qName0.toString());
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("+:Bx|Y:+:Bx|Y", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) nodeNameTest0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("+:Bx|Y", qName0.getPrefix());
      assertEquals("+:Bx|Y", qName0.getName());
      assertEquals("+:Bx|Y:+:Bx|Y", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("+:Bx|Y:+:Bx|Y", nodeNameTest0.toString());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(variablePointer1.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      QName qName0 = new QName("Namespace registration is not implemented by ");
      assertEquals("Namespace registration is not implemented by ", qName0.getName());
      assertEquals("Namespace registration is not implemented by ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals("Namespace registration is not implemented by ", qName0.getName());
      assertEquals("Namespace registration is not implemented by ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
      assertEquals("Namespace registration is not implemented by ", qName0.getName());
      assertEquals("Namespace registration is not implemented by ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "&apos;");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("&apos;", "%P*xbY g$E");
      assertEquals("&apos;", qName0.getPrefix());
      assertEquals("%P*xbY g$E", qName0.getName());
      assertEquals("&apos;:%P*xbY g$E", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("&apos;", qName0.getPrefix());
      assertEquals("%P*xbY g$E", qName0.getName());
      assertEquals("&apos;:%P*xbY g$E", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("&apos;", qName0.getPrefix());
      assertEquals("%P*xbY g$E", qName0.getName());
      assertEquals("&apos;:%P*xbY g$E", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertTrue(variablePointer1.isContainer());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer2 = (VariablePointer)variablePointer1.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, Integer.MIN_VALUE, (Object) "${6{k-hGj[Ni!A1g");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("&apos;", qName0.getPrefix());
      assertEquals("%P*xbY g$E", qName0.getName());
      assertEquals("&apos;:%P*xbY g$E", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertTrue(variablePointer1.isContainer());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertNull(variablePointer2.getNamespaceURI());
      assertTrue(variablePointer2.isContainer());
      assertTrue(variablePointer2.isRoot());
      assertFalse(variablePointer2.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer2.getIndex());
      assertFalse(variablePointer2.isAttribute());
      assertTrue(variablePointer2.isActual());
      assertNotNull(variablePointer2);
      assertSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer0, variablePointer2);
      assertNotSame(variablePointer1, variablePointer2);
      assertSame(variablePointer1, variablePointer0);
      assertNotSame(variablePointer2, variablePointer1);
      assertNotSame(variablePointer2, variablePointer0);
      assertTrue(variablePointer2.equals((Object)variablePointer0));
      assertTrue(variablePointer2.equals((Object)variablePointer1));
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "&apos;");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("&apos;", "%P*xbY g$E");
      assertEquals("%P*xbY g$E", qName0.getName());
      assertEquals("&apos;:%P*xbY g$E", qName0.toString());
      assertEquals("&apos;", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("%P*xbY g$E", qName0.getName());
      assertEquals("&apos;:%P*xbY g$E", qName0.toString());
      assertEquals("&apos;", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("%P*xbY g$E", qName0.getName());
      assertEquals("&apos;:%P*xbY g$E", qName0.toString());
      assertEquals("&apos;", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isRoot());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer2 = (VariablePointer)variablePointer1.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, Integer.MIN_VALUE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("%P*xbY g$E", qName0.getName());
      assertEquals("&apos;:%P*xbY g$E", qName0.toString());
      assertEquals("&apos;", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isRoot());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer2.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer2.getIndex());
      assertFalse(variablePointer2.isAttribute());
      assertTrue(variablePointer2.isActual());
      assertFalse(variablePointer2.isNode());
      assertTrue(variablePointer2.isRoot());
      assertTrue(variablePointer2.isContainer());
      assertNotNull(variablePointer2);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer0, variablePointer2);
      assertSame(variablePointer1, variablePointer0);
      assertSame(variablePointer1, variablePointer2);
      assertSame(variablePointer2, variablePointer0);
      assertSame(variablePointer2, variablePointer1);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = variablePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      QName qName0 = new QName("?4]tP;");
      assertNull(qName0.getPrefix());
      assertEquals("?4]tP;", qName0.toString());
      assertEquals("?4]tP;", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("?4]tP;", qName0.toString());
      assertEquals("?4]tP;", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.clone();
      assertNull(qName0.getPrefix());
      assertEquals("?4]tP;", qName0.toString());
      assertEquals("?4]tP;", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertFalse(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertNotNull(variablePointer1);
      assertNotSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer1, variablePointer0);
      assertTrue(variablePointer1.equals((Object)variablePointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "B%*iA");
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(":", nodeNameTest0.toString());
      assertEquals("B%*iA", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, nodeNameTest0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(":", nodeNameTest0.toString());
      assertEquals("B%*iA", nodeNameTest0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeIterator nodeIterator0 = variablePointer0.childIterator(nodeTypeTest0, false, beanPointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(":", nodeNameTest0.toString());
      assertEquals("B%*iA", nodeNameTest0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(nodeIterator0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeIterator nodeIterator0 = variablePointer0.attributeIterator(qName0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(0, nodeIterator0.getPosition());
      assertNotNull(nodeIterator0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("Cannot register namespaces on a sealed NamespaceResolver", "Cannot register namespaces on a sealed NamespaceResolver");
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver:Cannot register namespaces on a sealed NamespaceResolver", qName0.toString());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver", qName0.getName());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver:Cannot register namespaces on a sealed NamespaceResolver", qName0.toString());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver", qName0.getName());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver:Cannot register namespaces on a sealed NamespaceResolver", qName0.toString());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver", qName0.getName());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver", qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver:Cannot register namespaces on a sealed NamespaceResolver", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      // Undeclared exception!
      try { 
        variablePointer0.testNode(nodeNameTest0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Cannot register namespaces on a sealed NamespaceResolver:Cannot register namespaces on a sealed NamespaceResolver'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      QName qName0 = new QName("Kt905Y+g93p");
      assertNull(qName0.getPrefix());
      assertEquals("Kt905Y+g93p", qName0.getName());
      assertEquals("Kt905Y+g93p", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("Kt905Y+g93p", qName0.getName());
      assertEquals("Kt905Y+g93p", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Cannot create an object for path ");
      assertNull(qName0.getPrefix());
      assertEquals("Kt905Y+g93p", qName0.getName());
      assertEquals("Kt905Y+g93p", qName0.toString());
      assertEquals("Kt905Y+g93p", nodeNameTest0.toString());
      assertEquals("Cannot create an object for path ", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      // Undeclared exception!
      try { 
        variablePointer0.setValue(nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: Kt905Y+g93p
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      QName qName0 = new QName(", ", ", ");
      assertEquals(", ", qName0.getName());
      assertEquals(", :, ", qName0.toString());
      assertEquals(", ", qName0.getPrefix());
      assertNotNull(qName0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, locale_FilteringMode0);
      assertEquals(", ", qName0.getName());
      assertEquals(", :, ", qName0.toString());
      assertEquals(", ", qName0.getPrefix());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.setValue((Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      QName qName0 = new QName("D:");
      assertEquals("D:", qName0.toString());
      assertEquals("D", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ROOT;
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals("D:", qName0.toString());
      assertEquals("D", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("6lz;|b");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("zZ$Zn#dbB6");
      assertEquals("zZ$Zn#dbB6", qName0.getName());
      assertEquals("zZ$Zn#dbB6", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("zZ$Zn#dbB6", qName0.getName());
      assertEquals("zZ$Zn#dbB6", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("0\"#fg:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'zZ$Zn#dbB6'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale_FilteringMode0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespaceIterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespaceIterator();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      QName qName0 = new QName("4?l");
      assertNull(qName0.getPrefix());
      assertEquals("4?l", qName0.getName());
      assertEquals("4?l", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("4?l", qName0.getName());
      assertEquals("4?l", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 4?l
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      QName qName0 = new QName("Namespace registration is not implemented by ");
      assertEquals("Namespace registration is not implemented by ", qName0.getName());
      assertEquals("Namespace registration is not implemented by ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals("Namespace registration is not implemented by ", qName0.getName());
      assertEquals("Namespace registration is not implemented by ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("z{r^_Ilt'");
      assertEquals("z{r^_Ilt'", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("z{r^_Ilt'", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("z{r^_Ilt'", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("z{r^_Ilt'", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'z{r^_Ilt''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      QName qName0 = new QName("51fdS^(dh ~)pFrcH\"z", "Exception trying to remove xpath ");
      assertEquals("51fdS^(dh ~)pFrcH\"z", qName0.getPrefix());
      assertEquals("Exception trying to remove xpath ", qName0.getName());
      assertEquals("51fdS^(dh ~)pFrcH\"z:Exception trying to remove xpath ", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("51fdS^(dh ~)pFrcH\"z", qName0.getPrefix());
      assertEquals("Exception trying to remove xpath ", qName0.getName());
      assertEquals("51fdS^(dh ~)pFrcH\"z:Exception trying to remove xpath ", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 51fdS^(dh ~)pFrcH\"z:Exception trying to remove xpath 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      QName qName0 = new QName("' for path: ");
      assertEquals("' for path", qName0.getPrefix());
      assertEquals(" ", qName0.getName());
      assertEquals("' for path: ", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals("' for path", qName0.getPrefix());
      assertEquals(" ", qName0.getName());
      assertEquals("' for path: ", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("id('");
      assertNull(qName0.getPrefix());
      assertEquals("id('", qName0.toString());
      assertEquals("id('", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("id('", qName0.toString());
      assertEquals("id('", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'id(''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, (QName) null);
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName(";j_;Z");
      assertEquals(";j_;Z", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals(";j_;Z", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(";j_;Z", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals(";j_;Z", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ';j_;Z'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, (QName) null);
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("\"position\"", "qz");
      assertEquals("\"position\"", qName0.getPrefix());
      assertEquals("\"position\":qz", qName0.toString());
      assertEquals("qz", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("\"position\"", qName0.getPrefix());
      assertEquals("\"position\":qz", qName0.toString());
      assertEquals("qz", qName0.getName());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '\"position\":qz'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      QName qName0 = new QName("?4]tP;");
      assertEquals("?4]tP;", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("?4]tP;", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("?4]tP;", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("?4]tP;", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getRootNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: ?4]tP;
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName((String) null, (String) null);
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByKey((JXPathContext) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("] ");
      assertEquals("] ", qName0.toString());
      assertEquals("] ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("] ", qName0.toString());
      assertEquals("] ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "/H");
      assertEquals("] ", qName0.toString());
      assertEquals("] ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("] ", nodeNameTest0.toString());
      assertEquals("/H", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertEquals("] ", qName0.toString());
      assertEquals("] ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("] ", nodeNameTest0.toString());
      assertEquals("/H", nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByID(jXPathContextReferenceImpl0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; B5W*4?", "-1v]LK7; B5W*4?");
      assertEquals("-1v]LK7; B5W*4?", qName0.getName());
      assertEquals("-1v]LK7; B5W*4?:-1v]LK7; B5W*4?", qName0.toString());
      assertEquals("-1v]LK7; B5W*4?", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("-1v]LK7; B5W*4?", qName0.getName());
      assertEquals("-1v]LK7; B5W*4?:-1v]LK7; B5W*4?", qName0.toString());
      assertEquals("-1v]LK7; B5W*4?", qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: -1v]LK7; B5W*4?:-1v]LK7; B5W*4?
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeSetByKey((JXPathContext) null, ")", ")");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      QName qName0 = new QName("");
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      QName qName0 = new QName("", "3#b6H/uYN6SyLV!u%");
      assertEquals("3#b6H/uYN6SyLV!u%", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":3#b6H/uYN6SyLV!u%", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals("3#b6H/uYN6SyLV!u%", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":3#b6H/uYN6SyLV!u%", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      QName qName0 = new QName("j9v@xl");
      assertEquals("j9v@xl", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("j9v@xl", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals("j9v@xl", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("j9v@xl", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName(":eMWKU");
      assertEquals("", qName0.getPrefix());
      assertEquals("eMWKU", qName0.getName());
      assertEquals(":eMWKU", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", qName0.getPrefix());
      assertEquals("eMWKU", qName0.getName());
      assertEquals(":eMWKU", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':eMWKU'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: -1v]LK7; 5W*4?:-1v]LK7; 5W*4?
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      QName qName0 = new QName("%u", "W+(G!");
      assertEquals("W+(G!", qName0.getName());
      assertEquals("%u", qName0.getPrefix());
      assertEquals("%u:W+(G!", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("W+(G!", qName0.getName());
      assertEquals("%u", qName0.getPrefix());
      assertEquals("%u:W+(G!", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: %u:W+(G!
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("7DzO}7a]XdoB");
      assertNull(qName0.getPrefix());
      assertEquals("7DzO}7a]XdoB", qName0.getName());
      assertEquals("7DzO}7a]XdoB", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("7DzO}7a]XdoB", qName0.getName());
      assertEquals("7DzO}7a]XdoB", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '7DzO}7a]XdoB'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName((String) null, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1");
      assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.getAbstractFactory(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?");
      assertEquals("-1v]LK7; 5W*4?", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("-1v]LK7; 5W*4?", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.escape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "B%*iA");
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", nodeNameTest0.toString());
      assertEquals("B%*iA", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, nodeNameTest0);
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(":", nodeNameTest0.toString());
      assertEquals("B%*iA", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeTypeTest0);
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      // Undeclared exception!
      try { 
        beanPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      QName qName0 = new QName("yQN1)Xkq8Z}Nwa`R@}1");
      assertEquals("yQN1)Xkq8Z}Nwa`R@}1", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("yQN1)Xkq8Z}Nwa`R@}1", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("yQN1)Xkq8Z}Nwa`R@}1", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("yQN1)Xkq8Z}Nwa`R@}1", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      QName qName0 = new QName("%_L!mvh_E)u!=W|@", "");
      assertEquals("%_L!mvh_E)u!=W|@:", qName0.toString());
      assertEquals("%_L!mvh_E)u!=W|@", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("%_L!mvh_E)u!=W|@:", qName0.toString());
      assertEquals("%_L!mvh_E)u!=W|@", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, 512, (Object) variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      QName qName0 = new QName("Z1nv9*K<</p7wk");
      assertNull(qName0.getPrefix());
      assertEquals("Z1nv9*K<</p7wk", qName0.getName());
      assertEquals("Z1nv9*K<</p7wk", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("Z1nv9*K<</p7wk", qName0.getName());
      assertEquals("Z1nv9*K<</p7wk", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, (-2593));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      QName qName0 = new QName("AHVcu9!");
      assertEquals("AHVcu9!", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("AHVcu9!", qName0.toString());
      assertNotNull(qName0);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("AHVcu9!", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("AHVcu9!", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) qName0);
      assertEquals("AHVcu9!", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("AHVcu9!", qName0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'AHVcu9!'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      QName qName0 = new QName("i[46c;gPl=\"iq");
      assertEquals("i[46c;gPl=\"iq", qName0.toString());
      assertEquals("i[46c;gPl=\"iq", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("i[46c;gPl=\"iq", qName0.toString());
      assertEquals("i[46c;gPl=\"iq", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      QName qName0 = new QName("{m", "{m");
      assertEquals("{m:{m", qName0.toString());
      assertEquals("{m", qName0.getName());
      assertEquals("{m", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("{m:{m", qName0.toString());
      assertEquals("{m", qName0.getName());
      assertEquals("{m", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("{m");
      assertEquals("{m", processingInstructionTest0.getTarget());
      assertNotNull(processingInstructionTest0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, "{m");
      assertEquals("{m:{m", qName0.toString());
      assertEquals("{m", qName0.getName());
      assertEquals("{m", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.compareTo(processingInstructionTest0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest cannot be cast to org.apache.commons.jxpath.ri.model.NodePointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertNotNull(nullPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        nullPointer0.compareChildNodePointers(variablePointer0, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName((String) null, "/G)");
      assertEquals("/G)", qName0.getName());
      assertEquals("/G)", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("/G)", qName0.getName());
      assertEquals("/G)", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.attributeIterator(qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '/G)'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      QName qName0 = new QName("CannotKfind an element by ID - no IdentityManage? has been specified");
      assertNull(qName0.getPrefix());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.toString());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.getName());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "R61?0-W~a8");
      assertNull(qName0.getPrefix());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.toString());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.getName());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", nodeNameTest0.toString());
      assertEquals("R61?0-W~a8", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.toString());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.getName());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", nodeNameTest0.toString());
      assertEquals("R61?0-W~a8", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNull(qName0.getPrefix());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.toString());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.getName());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", nodeNameTest0.toString());
      assertEquals("R61?0-W~a8", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.toString());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.getName());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", nodeNameTest0.toString());
      assertEquals("R61?0-W~a8", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.setIndex(56);
      assertNull(qName0.getPrefix());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.toString());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", qName0.getName());
      assertEquals("CannotKfind an element by ID - no IdentityManage? has been specified", nodeNameTest0.toString());
      assertEquals("R61?0-W~a8", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(56, variablePointer0.getIndex());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'CannotKfind an element by ID - no IdentityManage? has been specified'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.printPointerChain();
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = nodePointer0.asPath();
      assertEquals("-1v]LK7; 5W*4?", qName0.getName());
      assertEquals("-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", qName0.toString());
      assertEquals("-1v]LK7; 5W*4?", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("$-1v]LK7; 5W*4?:-1v]LK7; 5W*4?", string0);
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      QName qName0 = new QName("PRECEDING-SIBLI");
      assertNull(qName0.getPrefix());
      assertEquals("PRECEDING-SIBLI", qName0.toString());
      assertEquals("PRECEDING-SIBLI", qName0.getName());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertNull(qName0.getPrefix());
      assertEquals("PRECEDING-SIBLI", qName0.toString());
      assertEquals("PRECEDING-SIBLI", qName0.getName());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale1 = beanPointer0.getLocale();
      assertNull(qName0.getPrefix());
      assertEquals("PRECEDING-SIBLI", qName0.toString());
      assertEquals("PRECEDING-SIBLI", qName0.getName());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals("", locale1.getVariant());
      assertEquals("CAN", locale1.getISO3Country());
      assertEquals("eng", locale1.getISO3Language());
      assertEquals("CA", locale1.getCountry());
      assertEquals("en_CA", locale1.toString());
      assertEquals("en", locale1.getLanguage());
      assertNotNull(locale1);
      assertSame(locale0, locale1);
      assertSame(locale1, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      QName qName0 = new QName(", ", ", ");
      assertEquals(", ", qName0.getPrefix());
      assertEquals(", :, ", qName0.toString());
      assertEquals(", ", qName0.getName());
      assertNotNull(qName0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, locale_FilteringMode0);
      assertEquals(", ", qName0.getPrefix());
      assertEquals(", :, ", qName0.toString());
      assertEquals(", ", qName0.getName());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = beanPointer0.getLocale();
      assertEquals(", ", qName0.getPrefix());
      assertEquals(", :, ", qName0.toString());
      assertEquals(", ", qName0.getName());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNull(locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, (QName) null);
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getRootNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      // Undeclared exception!
      try { 
        nodePointer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      QName qName0 = new QName("Namespace registration is not implemented by ");
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Namespace registration is not implemented by ", locale0);
      boolean boolean0 = nodePointer0.isContainer();
      assertFalse(nodePointer0.isAttribute());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      QName qName0 = new QName("AtHIO,wA3TI>}%", "AtHIO,wA3TI>}%");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "AtHIO,wA3TI>}%");
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.getNamespaceURI("]C");
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.toString();
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      QName qName0 = new QName("\"@f^o>{wL0", "3@e");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      NodePointer nodePointer1 = nodePointer0.getImmediateValuePointer();
      assertFalse(nodePointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      // Undeclared exception!
      try { 
        variablePointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $null
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      String string0 = variablePointer0.escape("id('");
      assertFalse(variablePointer0.isAttribute());
      assertEquals("id(&apos;", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      QName qName0 = new QName("R`.(\">q&4yp", "R`.(\">q&4yp");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, (Object) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.compareTo(nodePointer1);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(nodePointer1.isRoot());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      QName qName0 = new QName("R`.(\">q&4yp", "R`.(\">q&4yp");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, (Object) null);
      assertTrue(nodePointer0.isRoot());
      
      String string0 = nodePointer1.asPath();
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertEquals("/R`.(\">q&4yp:R`.(\">q&4yp", string0);
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      QName qName0 = new QName("3f");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.NamespaceResolver");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeNameTest0);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("org.apache.commons.jxpath.ri.NamespaceResolver");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: org.apache.commons.jxpath.ri.NamespaceResolver
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      // Undeclared exception!
      try { 
        nodePointer0.isLanguage("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "key");
      Locale locale0 = new Locale("preceding-sibling::", "J-RqUhs");
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, nodeNameTest0, locale0);
      assertNotNull(nodePointer0);
      
      boolean boolean0 = nodePointer0.isLanguage(".N6^)@w]@\"DR&LO");
      assertTrue(nodePointer0.isRoot());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(219);
      boolean boolean0 = variablePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "\")\"");
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      boolean boolean0 = nodePointer0.testNode(processingInstructionTest0);
      assertFalse(nodePointer0.isAttribute());
      assertFalse(boolean0);
      assertFalse(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      QName qName0 = new QName("'", "Y$y`I;UH`y");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      // Undeclared exception!
      try { 
        nodePointer0.getRootNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'null'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("\"position\"", "qz");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Factory is not set on the JXPathContext - cannot create path: ");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeNameTest0);
      variablePointer0.setValue(jXPathContext0);
      variablePointer0.getValue();
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      boolean boolean0 = nodePointer0.isNode();
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      boolean boolean0 = variablePointer0.isNode();
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("AHVcu9!", "m??n4");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      boolean boolean0 = variablePointer0.isRoot();
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      boolean boolean0 = nodePointer0.isRoot();
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      QName qName0 = new QName("R`.(\">q&4yp", "R`.(\">q&4yp");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, (Object) null);
      NodePointer nodePointer2 = nodePointer1.getParent();
      assertNotNull(nodePointer2);
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
      assertTrue(nodePointer2.isRoot());
      assertFalse(nodePointer2.isAttribute());
      assertEquals(Integer.MIN_VALUE, nodePointer2.getIndex());
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      QName qName0 = new QName("JXPath: found  ", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      nodePointer0.getNamespaceResolver();
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      variablePointer0.getNamespaceResolver();
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      QName qName0 = new QName("AcFiO&^O;x2~b#");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "AcFiO&^O;x2~b#", (Locale) null);
      // Undeclared exception!
      try { 
        nodePointer0.getPointerByID((JXPathContext) null, "<<unknown namespace>>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodePointer1);
      // Undeclared exception!
      try { 
        nodePointer1.createChild(jXPathContext0, qName0, 3, (Object) jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path null()/null/null[4], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("u");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "u");
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByKey(jXPathContext0, "u", "No value for xpath: ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManger has been specified");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.isDefaultNamespace("Cannot find an element by ID - no IdentityManger has been specified");
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Y[", "Y[");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setIndex(Integer.MIN_VALUE);
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      nodePointer0.namespacePointer((String) null);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      QName qName0 = new QName("Y!'W^@`.fV60~>g", "gF\"d:c");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.getNamespaceURI();
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "B%*iA");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, nodeNameTest0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeTypeTest0);
      NodePointer nodePointer1 = nodePointer0.createPath(jXPathContext0);
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
      assertFalse(nodePointer1.isAttribute());
      assertFalse(nodePointer1.isRoot());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      variablePointer0.setNamespaceResolver((NamespaceResolver) null);
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("we>4^8}2Ch", "we>4^8}2Ch");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      // Undeclared exception!
      try { 
        variablePointer0.createAttribute(jXPathContext0, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an attribute for path $we>4^8}2Ch:we>4^8}2Ch/@we>4^8}2Ch:we>4^8}2Ch, operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      QName qName0 = new QName("\"");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "\"");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeNameTest0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getNodeValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '\"'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.getDefaultNamespaceURI();
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManager has been specified");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        variablePointer0.getNodeSetByKey(jXPathContext0, "Z^Y*KAXA+0RE5Pw1", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManager has been specified");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "R61?0-W~a8");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, variablePointer0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeNameTest0);
      // Undeclared exception!
      try { 
        nodePointer0.createPath(jXPathContext0, (Object) locale0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "B%*iA");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, nodeNameTest0);
      assertTrue(variablePointer0.isRoot());
      assertNotNull(nodePointer0);
      
      nodePointer0.printPointerChain();
      assertFalse(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      QName qName0 = new QName("Namespace registration is not implemented by ");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      boolean boolean0 = variablePointer0.isAttribute();
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      QName qName0 = new QName("-1v]LK7; 5W*4?", "-1v]LK7; 5W*4?");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setAttribute(false);
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        variablePointer0.createChild(jXPathContext0, qName0, 0, (Object) qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }
}
