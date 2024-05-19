
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
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;
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
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      variablePointer0.index = (-1662);
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals((-1662), variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      
      int int0 = variablePointer0.getIndex();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals((-1662), int0);
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals((-1662), variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      QName qName0 = new QName("UNKNOWN", "]dOQY.uwm(");
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      
      variablePointer0.setValue(", operation is not allowed for this type of node");
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      QName qName0 = new QName("  ", "  ");
      assertEquals("  :  ", qName0.toString());
      assertEquals("  ", qName0.getPrefix());
      assertEquals("  ", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("  :  ", qName0.toString());
      assertEquals("  ", qName0.getPrefix());
      assertEquals("  ", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      variablePointer0.setIndex((-3090));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("  :  ", qName0.toString());
      assertEquals("  ", qName0.getPrefix());
      assertEquals("  ", qName0.getName());
      assertEquals((-3090), variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      variablePointer0.remove();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      QName qName0 = new QName("WHAJ.QlLWJ_");
      assertEquals("WHAJ.QlLWJ_", qName0.getName());
      assertEquals("WHAJ.QlLWJ_", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("WHAJ.QlLWJ_", qName0.getName());
      assertEquals("WHAJ.QlLWJ_", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "\"self::\"");
      assertEquals("WHAJ.QlLWJ_", qName0.getName());
      assertEquals("WHAJ.QlLWJ_", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("\"self::\"", nodeNameTest0.getNamespaceURI());
      assertEquals("WHAJ.QlLWJ_", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(boolean0);
      assertEquals("WHAJ.QlLWJ_", qName0.getName());
      assertEquals("WHAJ.QlLWJ_", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals("\"self::\"", nodeNameTest0.getNamespaceURI());
      assertEquals("WHAJ.QlLWJ_", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("cb]Wl", "Hb1N<1");
      assertEquals("cb]Wl:Hb1N<1", qName0.toString());
      assertEquals("Hb1N<1", qName0.getName());
      assertEquals("cb]Wl", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("cb]Wl:Hb1N<1", qName0.toString());
      assertEquals("Hb1N<1", qName0.getName());
      assertEquals("cb]Wl", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("cb]Wl:Hb1N<1", qName0.toString());
      assertEquals("Hb1N<1", qName0.getName());
      assertEquals("cb]Wl", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(beanPointer0);
      
      boolean boolean0 = beanPointer0.isLeaf();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("cb]Wl:Hb1N<1", qName0.toString());
      assertEquals("Hb1N<1", qName0.getName());
      assertEquals("cb]Wl", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      QName qName0 = new QName("Could not allocate a NodePointer for object of ");
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Could not allocate a NodePointer for object of ", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Could not allocate a NodePointer for object of ", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Could not allocate a NodePointer for object of ", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Could not allocate a NodePointer for object of ", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      boolean boolean0 = variablePointer0.isContainer();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(boolean0);
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Could not allocate a NodePointer for object of ", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer1.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isAttribute());
      assertNotNull(variablePointer1);
      
      boolean boolean0 = variablePointer1.isCollection();
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer1.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      QName qName0 = new QName("_e$p~8>1");
      assertEquals("_e$p~8>1", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("_e$p~8>1", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("_e$p~8>1", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("_e$p~8>1", qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      boolean boolean0 = variablePointer0.isActual();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
      assertEquals("_e$p~8>1", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("_e$p~8>1", qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      QName qName0 = new QName("3");
      assertNull(qName0.getPrefix());
      assertEquals("3", qName0.getName());
      assertEquals("3", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.forLanguageTag("]Yj&d");
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("3", qName0.getName());
      assertEquals("3", qName0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNotNull(beanPointer0);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getValuePointer();
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("3", qName0.getName());
      assertEquals("3", qName0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer1.isNode());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isCollection());
      assertTrue(beanPointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isContainer());
      assertFalse(beanPointer1.isAttribute());
      assertNotNull(beanPointer1);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      QName qName0 = new QName("w]/3(jt!EM");
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      
      basicVariables0.declareVariable("w]/3(jt!EM", jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)variablePointer0.getRootNode();
      assertSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertNotNull(jXPathContextReferenceImpl1);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer1.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertNotNull(variablePointer1);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)variablePointer0.getNode();
      assertSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertNotNull(jXPathContextReferenceImpl1);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      QName qName0 = new QName("&d75");
      assertEquals("&d75", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("&d75", qName0.toString());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("&d75", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("&d75", qName0.toString());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNotNull(beanPointer0);
      
      String string0 = beanPointer0.getNamespaceURI((String) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("&d75", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("&d75", qName0.toString());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/jxpath.properties");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, (QName) null, evoSuiteFile0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertNotNull(beanPointer0);
      
      QName qName0 = beanPointer0.getName();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      QName qName0 = new QName("/");
      assertEquals("/", qName0.toString());
      assertEquals("/", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("/", qName0.toString());
      assertEquals("/", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      QName qName1 = variablePointer0.getName();
      assertSame(qName0, qName1);
      assertSame(qName1, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("/", qName0.toString());
      assertEquals("/", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(qName1.getPrefix());
      assertEquals("/", qName1.getName());
      assertEquals("/", qName1.toString());
      assertNotNull(qName1);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      QName qName0 = new QName("  ", "  ");
      assertEquals("  :  ", qName0.toString());
      assertEquals("  ", qName0.getName());
      assertEquals("  ", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("  :  ", qName0.toString());
      assertEquals("  ", qName0.getName());
      assertEquals("  ", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      int int0 = variablePointer0.getLength();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(0, int0);
      assertEquals("  :  ", qName0.toString());
      assertEquals("  ", qName0.getName());
      assertEquals("  ", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      QName qName0 = new QName("");
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.FRENCH;
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertNotNull(beanPointer0);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getImmediateValuePointer();
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.toString());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertTrue(beanPointer1.isNode());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isContainer());
      assertTrue(beanPointer1.isRoot());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertNotNull(beanPointer1);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      QName qName0 = new QName(")");
      assertNull(qName0.getPrefix());
      assertEquals(")", qName0.getName());
      assertEquals(")", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals(")", qName0.getName());
      assertEquals(")", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateParentPointer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals(")", qName0.getName());
      assertEquals(")", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      QName qName0 = new QName("Bi]AUsa~tEEQPI0Kh,(");
      assertEquals("Bi]AUsa~tEEQPI0Kh,(", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Bi]AUsa~tEEQPI0Kh,(", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CHINESE;
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Bi]AUsa~tEEQPI0Kh,(", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Bi]AUsa~tEEQPI0Kh,(", qName0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, locale0);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Bi]AUsa~tEEQPI0Kh,(", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Bi]AUsa~tEEQPI0Kh,(", qName0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer1.getLength());
      assertTrue(beanPointer1.isNode());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isContainer());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isAttribute());
      assertNotNull(beanPointer1);
      
      BeanPointer beanPointer2 = (BeanPointer)beanPointer1.getImmediateParentPointer();
      assertSame(beanPointer0, beanPointer2);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertNotSame(beanPointer1, beanPointer2);
      assertNotSame(beanPointer2, beanPointer1);
      assertSame(beanPointer2, beanPointer0);
      assertFalse(beanPointer0.equals((Object)beanPointer1));
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertFalse(beanPointer2.equals((Object)beanPointer1));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Bi]AUsa~tEEQPI0Kh,(", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Bi]AUsa~tEEQPI0Kh,(", qName0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer1.getLength());
      assertTrue(beanPointer1.isNode());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isContainer());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer2.isAttribute());
      assertFalse(beanPointer2.isCollection());
      assertTrue(beanPointer2.isNode());
      assertFalse(beanPointer2.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer2.getNamespaceURI());
      assertTrue(beanPointer2.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer2.getIndex());
      assertFalse(beanPointer2.isContainer());
      assertEquals(1, beanPointer2.getLength());
      assertNotNull(beanPointer2);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNotNull(beanPointer0);
      
      VariablePointer variablePointer1 = (VariablePointer)beanPointer0.getImmediateParentPointer();
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isActual());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isAttribute());
      assertNotNull(variablePointer1);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      QName qName0 = new QName(")");
      assertEquals(")", qName0.toString());
      assertEquals(")", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(")", qName0.toString());
      assertEquals(")", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) ")");
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(")", qName0.toString());
      assertEquals(")", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isActual());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertNotNull(nodePointer0);
      
      Object object0 = nodePointer0.getImmediateNode();
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(")", object0);
      assertEquals(")", qName0.toString());
      assertEquals(")", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isActual());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      QName qName0 = new QName("*");
      assertNull(qName0.getPrefix());
      assertEquals("*", qName0.toString());
      assertEquals("*", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("*", qName0.toString());
      assertEquals("*", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("*", qName0.toString());
      assertEquals("*", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(nodePointer0);
      
      Object object0 = nodePointer0.getBaseValue();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("*", qName0.toString());
      assertEquals("*", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      QName qName0 = new QName("");
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.JAPAN;
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(beanPointer0);
      
      Object object1 = beanPointer0.getBaseValue();
      assertSame(object0, object1);
      assertSame(object1, object0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", "");
      assertEquals("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      String string0 = variablePointer0.escape("");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", string0);
      assertEquals("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      QName qName0 = new QName("w]/3(jt!EM");
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) nodeNameTest0);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer1.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isNode());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertNotNull(variablePointer1);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null);
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isActual());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isContainer());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      QName qName0 = new QName("w]/3(jt!EM");
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      basicVariables0.declareVariable("w]/3(jt!EM", jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, Integer.MIN_VALUE);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertNotNull(variablePointer1);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("cb]Wl", "Hb1N<1");
      assertEquals("cb]Wl", qName0.getPrefix());
      assertEquals("cb]Wl:Hb1N<1", qName0.toString());
      assertEquals("Hb1N<1", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("cb]Wl", qName0.getPrefix());
      assertEquals("cb]Wl:Hb1N<1", qName0.toString());
      assertEquals("Hb1N<1", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("cb]Wl", qName0.getPrefix());
      assertEquals("cb]Wl:Hb1N<1", qName0.toString());
      assertEquals("Hb1N<1", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertNotNull(beanPointer0);
      
      int int0 = beanPointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(0, int0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("cb]Wl", qName0.getPrefix());
      assertEquals("cb]Wl:Hb1N<1", qName0.toString());
      assertEquals("Hb1N<1", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.clone();
      assertNotSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer1, variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isNode());
      assertFalse(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertNotNull(variablePointer1);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      QName qName0 = new QName("Mhe&7j");
      assertEquals("Mhe&7j", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Mhe&7j", qName0.getName());
      assertNotNull(qName0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("Mhe&7j", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Mhe&7j", qName0.getName());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("qZmriR");
      assertEquals("qZmriR", processingInstructionTest0.getTarget());
      assertNotNull(processingInstructionTest0);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Mhe&7j", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Mhe&7j", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) "qZmriR");
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Mhe&7j", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Mhe&7j", qName0.getName());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertNotNull(variablePointer1);
      
      BeanPointer beanPointer0 = (BeanPointer)variablePointer1.getValuePointer();
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Mhe&7j", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Mhe&7j", qName0.getName());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(beanPointer0);
      
      NodeIterator nodeIterator0 = variablePointer1.childIterator(processingInstructionTest0, true, beanPointer0);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("Mhe&7j", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Mhe&7j", qName0.getName());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("qZmriR", processingInstructionTest0.getTarget());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.JAPAN;
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(beanPointer0);
      
      BeanAttributeIterator beanAttributeIterator0 = (BeanAttributeIterator)beanPointer0.attributeIterator(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JP", locale0.getCountry());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("JPN", locale0.getISO3Country());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, beanAttributeIterator0.getPosition());
      assertNotNull(beanAttributeIterator0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      assertNull(qName0.toString());
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.toString());
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "J)]{8wp");
      assertNull(qName0.toString());
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.toString());
      assertEquals("J)]{8wp", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      // Undeclared exception!
      try { 
        variablePointer0.testNode(nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.NodeNameTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Factory did not assign a collection to variable '");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("Factory did not assign a collection to variable '", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      // Undeclared exception!
      try { 
        variablePointer0.testNode(nodeNameTest0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.setValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("Cannot compare pointers that do not belong to the same tree: '");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      QName qName0 = new QName("/");
      assertNull(qName0.getPrefix());
      assertEquals("/", qName0.toString());
      assertEquals("/", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("/", qName0.toString());
      assertEquals("/", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: /
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      QName qName0 = new QName("_e$p~8>1", "_e$p~8>1");
      assertEquals("_e$p~8>1:_e$p~8>1", qName0.toString());
      assertEquals("_e$p~8>1", qName0.getName());
      assertEquals("_e$p~8>1", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("_e$p~8>1:_e$p~8>1", qName0.toString());
      assertEquals("_e$p~8>1", qName0.getName());
      assertEquals("_e$p~8>1", qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: _e$p~8>1:_e$p~8>1
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      QName qName0 = new QName("\"..\"", "");
      assertEquals("\"..\":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("\"..\"", qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "\"..\"");
      assertEquals("\"..\":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("\"..\"", qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("\"..\":", nodeNameTest0.toString());
      assertEquals("\"..\"", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("\"..\":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("\"..\"", qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("\"..\":", nodeNameTest0.toString());
      assertEquals("\"..\"", nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("\"..\":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("\"..\"", qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("\"..\":", nodeNameTest0.toString());
      assertEquals("\"..\"", nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("\"..\":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("\"..\"", qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("\"..\":", nodeNameTest0.toString());
      assertEquals("\"..\"", nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '\"..\":'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      
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
  public void test041()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      String string0 = "U\\uE(Y,\")NS@zr(O";
      QName qName0 = new QName("b1am]}6f:}3lmw7fobd", string0);
      assertEquals("b1am]}6f:}3lmw7fobd:U\\uE(Y,\")NS@zr(O", qName0.toString());
      assertEquals("U\\uE(Y,\")NS@zr(O", qName0.getName());
      assertEquals("b1am]}6f:}3lmw7fobd", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("b1am]}6f:}3lmw7fobd:U\\uE(Y,\")NS@zr(O", qName0.toString());
      assertEquals("U\\uE(Y,\")NS@zr(O", qName0.getName());
      assertEquals("b1am]}6f:}3lmw7fobd", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'b1am]}6f:}3lmw7fobd:U\\uE(Y,\")NS@zr(O'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      QName qName0 = new QName("\b)PY!j;", "\b)PY!j;");
      assertEquals("\b)PY!j;", qName0.getPrefix());
      assertEquals("\b)PY!j;:\b)PY!j;", qName0.toString());
      assertEquals("\b)PY!j;", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("\b)PY!j;", qName0.getPrefix());
      assertEquals("\b)PY!j;:\b)PY!j;", qName0.toString());
      assertEquals("\b)PY!j;", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
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
  public void test043()  throws Throwable  {
      QName qName0 = new QName("_e$p~8>1");
      assertNull(qName0.getPrefix());
      assertEquals("_e$p~8>1", qName0.toString());
      assertEquals("_e$p~8>1", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("_e$p~8>1", qName0.toString());
      assertEquals("_e$p~8>1", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getRootNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: _e$p~8>1
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByKey(jXPathContextReferenceImpl0, "vDb}S:TKpE}F'q]z:m", "vDb}S:TKpE}F'q]z:m");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      QName qName0 = new QName("[", "[");
      assertEquals("[:[", qName0.toString());
      assertEquals("[", qName0.getPrefix());
      assertEquals("[", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("[:[", qName0.toString());
      assertEquals("[", qName0.getPrefix());
      assertEquals("[", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByID((JXPathContext) null, "l");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      QName qName0 = new QName("G/;|m\"aJo`NF*P");
      assertEquals("G/;|m\"aJo`NF*P", qName0.getName());
      assertEquals("G/;|m\"aJo`NF*P", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("G/;|m\"aJo`NF*P", qName0.getName());
      assertEquals("G/;|m\"aJo`NF*P", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: G/;|m\"aJo`NF*P
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeSetByKey((JXPathContext) null, "' and '", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("cb]Wl", "Hb1N<1");
      assertEquals("cb]Wl", qName0.getPrefix());
      assertEquals("cb]Wl:Hb1N<1", qName0.toString());
      assertEquals("Hb1N<1", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("cb]Wl", qName0.getPrefix());
      assertEquals("cb]Wl:Hb1N<1", qName0.toString());
      assertEquals("Hb1N<1", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getLength();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'cb]Wl:Hb1N<1'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("|[dzs,`-cLA,&m]\"", "|[dzs,`-cLA,&m]\"");
      assertEquals("|[dzs,`-cLA,&m]\"", qName0.getName());
      assertEquals("|[dzs,`-cLA,&m]\"", qName0.getPrefix());
      assertEquals("|[dzs,`-cLA,&m]\":|[dzs,`-cLA,&m]\"", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("|[dzs,`-cLA,&m]\"", qName0.getName());
      assertEquals("|[dzs,`-cLA,&m]\"", qName0.getPrefix());
      assertEquals("|[dzs,`-cLA,&m]\":|[dzs,`-cLA,&m]\"", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '|[dzs,`-cLA,&m]\":|[dzs,`-cLA,&m]\"'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      QName qName0 = new QName("()", "^5wKx^<o _");
      assertEquals("()", qName0.getPrefix());
      assertEquals("():^5wKx^<o _", qName0.toString());
      assertEquals("^5wKx^<o _", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("()", qName0.getPrefix());
      assertEquals("():^5wKx^<o _", qName0.toString());
      assertEquals("^5wKx^<o _", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: ():^5wKx^<o _
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("NK7)k[e#rMFD:i");
      assertEquals("NK7)k[e#rMFD", qName0.getPrefix());
      assertEquals("NK7)k[e#rMFD:i", qName0.toString());
      assertEquals("i", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("NK7)k[e#rMFD", qName0.getPrefix());
      assertEquals("NK7)k[e#rMFD:i", qName0.toString());
      assertEquals("i", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'NK7)k[e#rMFD:i'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      QName qName0 = new QName("Could not allocate a NodePointer for object of ");
      assertNull(qName0.getPrefix());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Could not allocate a NodePointer for object of ", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getPrefix());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Could not allocate a NodePointer for object of ", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getPrefix());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Could not allocate a NodePointer for object of ", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.getName());
      assertEquals("Could not allocate a NodePointer for object of ", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Could not allocate a NodePointer for object of ", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getAbstractFactory(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $Could not allocate a NodePointer for object of 
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getAbstractFactory((JXPathContext) null);
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
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      
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
  public void test057()  throws Throwable  {
      QName qName0 = new QName("3&z\"oi", "3&z\"oi");
      assertEquals("3&z\"oi:3&z\"oi", qName0.toString());
      assertEquals("3&z\"oi", qName0.getName());
      assertEquals("3&z\"oi", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("3&z\"oi:3&z\"oi", qName0.toString());
      assertEquals("3&z\"oi", qName0.getName());
      assertEquals("3&z\"oi", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("3&z\"oi:3&z\"oi", qName0.toString());
      assertEquals("3&z\"oi", qName0.getName());
      assertEquals("3&z\"oi", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $3&z\"oi:3&z\"oi
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      QName qName0 = new QName("namespace::");
      assertEquals("namespace", qName0.getPrefix());
      assertEquals(":", qName0.getName());
      assertEquals("namespace::", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("namespace", qName0.getPrefix());
      assertEquals(":", qName0.getName());
      assertEquals("namespace::", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) null, (Object) "namespace::");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      QName qName0 = new QName("w]/3(jt!EM");
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "w]/3(jt!EM");
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertEquals("w]/3(jt!EM", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertEquals("w]/3(jt!EM", nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $w]/3(jt!EM
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      QName qName0 = new QName("9|>Y'R36s}", "L{");
      assertEquals("9|>Y'R36s}", qName0.getPrefix());
      assertEquals("9|>Y'R36s}:L{", qName0.toString());
      assertEquals("L{", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("9|>Y'R36s}", qName0.getPrefix());
      assertEquals("9|>Y'R36s}:L{", qName0.toString());
      assertEquals("L{", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
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
  public void test061()  throws Throwable  {
      QName qName0 = new QName("UNKNOWN", "UNKNOWN");
      assertEquals("UNKNOWN:UNKNOWN", qName0.toString());
      assertEquals("UNKNOWN", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_CA", locale0.toString());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("UNKNOWN:UNKNOWN", qName0.toString());
      assertEquals("UNKNOWN", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_CA", locale0.toString());
      assertFalse(nullPointer0.isContainer());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isCollection());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertNotNull(nullPointer0);
      
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, qName0, 706, (Object) "UNKNOWN");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("~%_bq2Nl", "~%_bq2Nl");
      assertEquals("~%_bq2Nl:~%_bq2Nl", qName0.toString());
      assertEquals("~%_bq2Nl", qName0.getName());
      assertEquals("~%_bq2Nl", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("~%_bq2Nl:~%_bq2Nl", qName0.toString());
      assertEquals("~%_bq2Nl", qName0.getName());
      assertEquals("~%_bq2Nl", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("~%_bq2Nl:~%_bq2Nl", qName0.toString());
      assertEquals("~%_bq2Nl", qName0.getName());
      assertEquals("~%_bq2Nl", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 0, (Object) basicVariables0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '~%_bq2Nl:~%_bq2Nl'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName(")e)G2?%Y= GX_QWf9", ")e)G2?%Y= GX_QWf9");
      assertEquals(")e)G2?%Y= GX_QWf9", qName0.getName());
      assertEquals(")e)G2?%Y= GX_QWf9", qName0.getPrefix());
      assertEquals(")e)G2?%Y= GX_QWf9:)e)G2?%Y= GX_QWf9", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(")e)G2?%Y= GX_QWf9", qName0.getName());
      assertEquals(")e)G2?%Y= GX_QWf9", qName0.getPrefix());
      assertEquals(")e)G2?%Y= GX_QWf9:)e)G2?%Y= GX_QWf9", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals(")e)G2?%Y= GX_QWf9", qName0.getName());
      assertEquals(")e)G2?%Y= GX_QWf9", qName0.getPrefix());
      assertEquals(")e)G2?%Y= GX_QWf9:)e)G2?%Y= GX_QWf9", qName0.toString());
      assertEquals(")e)G2?%Y= GX_QWf9:)e)G2?%Y= GX_QWf9", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(")e)G2?%Y= GX_QWf9", qName0.getName());
      assertEquals(")e)G2?%Y= GX_QWf9", qName0.getPrefix());
      assertEquals(")e)G2?%Y= GX_QWf9:)e)G2?%Y= GX_QWf9", qName0.toString());
      assertEquals(")e)G2?%Y= GX_QWf9:)e)G2?%Y= GX_QWf9", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ')e)G2?%Y= GX_QWf9:)e)G2?%Y= GX_QWf9'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer(variablePointer0, (QName) null, (Object) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isRoot());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertNotNull(nullPointer0);
      
      // Undeclared exception!
      try { 
        nullPointer0.compareChildNodePointers(variablePointer0, nullPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) "");
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isContainer());
      assertNull(nodePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isActual());
      assertNotNull(nodePointer0);
      
      NodePointer nodePointer1 = nodePointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) basicVariables0);
      assertNotSame(variablePointer0, nodePointer1);
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertNotSame(nodePointer0, nodePointer1);
      assertNotSame(nodePointer1, variablePointer0);
      assertNotSame(nodePointer1, nodePointer0);
      assertTrue(nodePointer1.equals((Object)variablePointer0));
      assertTrue(nodePointer1.equals((Object)nodePointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isContainer());
      assertNull(nodePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isActual());
      assertTrue(nodePointer1.isActual());
      assertNull(nodePointer1.getNamespaceURI());
      assertTrue(nodePointer1.isContainer());
      assertTrue(nodePointer1.isRoot());
      assertFalse(nodePointer1.isNode());
      assertFalse(nodePointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
      assertNotNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      
      Locale locale0 = variablePointer0.getLocale();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("T/", "T/");
      assertEquals("T/:T/", qName0.toString());
      assertEquals("T/", qName0.getName());
      assertEquals("T/", qName0.getPrefix());
      assertNotNull(qName0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, (Locale) null);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("T/:T/", qName0.toString());
      assertEquals("T/", qName0.getName());
      assertEquals("T/", qName0.getPrefix());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNotNull(beanPointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)beanPointer0.getValue();
      assertSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("T/:T/", qName0.toString());
      assertEquals("T/", qName0.getName());
      assertEquals("T/", qName0.getPrefix());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertNotNull(jXPathContextReferenceImpl1);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      QName qName0 = new QName("w]/3(jt!EM");
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.JAPAN;
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("JP", locale0.getCountry());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("JP", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertNotNull(beanPointer0);
      
      boolean boolean0 = beanPointer0.isContainer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("JP", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(":", nodeNameTest0.toString());
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      Locale locale0 = Locale.GERMAN;
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(":", nodeNameTest0.toString());
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(beanPointer0);
      
      String string0 = beanPointer0.toString();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("/", string0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(":", nodeNameTest0.toString());
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, "");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getImmediateValuePointer();
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer1.isContainer());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isRoot());
      assertNotNull(beanPointer1);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeNameTest");
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(nodePointer0);
      
      nodePointer0.printPointerChain();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      QName qName0 = new QName("UNKNOWN", "]dOQY.uwm(");
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      String string0 = variablePointer0.escape(", operation is not allowed for this type of node");
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(", operation is not allowed for this type of node", string0);
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("kT]q[0.}U~v?PjwG[", "kT]q[0.}U~v?PjwG[");
      assertEquals("kT]q[0.}U~v?PjwG[", qName0.getName());
      assertEquals("kT]q[0.}U~v?PjwG[:kT]q[0.}U~v?PjwG[", qName0.toString());
      assertEquals("kT]q[0.}U~v?PjwG[", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("kT]q[0.}U~v?PjwG[", qName0.getName());
      assertEquals("kT]q[0.}U~v?PjwG[:kT]q[0.}U~v?PjwG[", qName0.toString());
      assertEquals("kT]q[0.}U~v?PjwG[", qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      String string0 = variablePointer0.escape("' and '");
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("&apos; and &apos;", string0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("kT]q[0.}U~v?PjwG[", qName0.getName());
      assertEquals("kT]q[0.}U~v?PjwG[:kT]q[0.}U~v?PjwG[", qName0.toString());
      assertEquals("kT]q[0.}U~v?PjwG[", qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      QName qName0 = new QName("UNKNOWN", "]dOQY.uwm(");
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      
      int int0 = variablePointer0.compareTo(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(0, int0);
      assertEquals("]dOQY.uwm(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]dOQY.uwm(", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("UNKNOWN:]dOQY.uwm(", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      QName qName0 = new QName("UNKNOWN", "]&dOQY.uwmt(");
      assertEquals("]&dOQY.uwmt(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]&dOQY.uwmt(", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("]&dOQY.uwmt(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]&dOQY.uwmt(", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("UNKNOWN:]&dOQY.uwmt(", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("]&dOQY.uwmt(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]&dOQY.uwmt(", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("UNKNOWN:]&dOQY.uwmt(", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals("]&dOQY.uwmt(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]&dOQY.uwmt(", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("UNKNOWN:]&dOQY.uwmt(", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("]&dOQY.uwmt(", qName0.getName());
      assertEquals("UNKNOWN", qName0.getPrefix());
      assertEquals("UNKNOWN:]&dOQY.uwmt(", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("UNKNOWN:]&dOQY.uwmt(", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
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
  public void test078()  throws Throwable  {
      QName qName0 = new QName("w]/3(jt!EM");
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      
      basicVariables0.declareVariable("w]/3(jt!EM", jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNull(qName0.getPrefix());
      assertEquals("w]/3(jt!EM", qName0.toString());
      assertEquals("w]/3(jt!EM", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("w]/3(jt!EM", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      
      // Undeclared exception!
      try { 
        variablePointer0.childIterator(nodeNameTest0, true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      QName qName0 = new QName("Mhe&7j");
      assertNull(qName0.getPrefix());
      assertEquals("Mhe&7j", qName0.toString());
      assertEquals("Mhe&7j", qName0.getName());
      assertNotNull(qName0);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(qName0.getPrefix());
      assertEquals("Mhe&7j", qName0.toString());
      assertEquals("Mhe&7j", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      
      boolean boolean0 = variablePointer0.isDefaultNamespace("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
      assertNull(qName0.getPrefix());
      assertEquals("Mhe&7j", qName0.toString());
      assertEquals("Mhe&7j", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeNameTest");
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(nodePointer0);
      
      Locale locale0 = nodePointer0.getLocale();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      boolean boolean0 = variablePointer0.testNode(nodeTypeTest0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeNameTest");
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Simultaneous operations: should not request pointer list while iterating over an EvalContext");
      assertEquals("Simultaneous operations: should not request pointer list while iterating over an EvalContext", processingInstructionTest0.getTarget());
      assertNotNull(processingInstructionTest0);
      
      boolean boolean0 = variablePointer0.testNode(processingInstructionTest0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeNameTest", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals("Simultaneous operations: should not request pointer list while iterating over an EvalContext", processingInstructionTest0.getTarget());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "'");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeNameTest0);
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "'", locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, qName0);
      assertTrue(nodePointer0.isRoot());
      
      jXPathContext0.getRelativeContext(nodePointer1);
      assertFalse(nodePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer1.isAttribute());
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      QName qName0 = new QName("w]/3(jt!EM");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeNameTest0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getRootNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'w]/3(jt!EM'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      QName qName0 = new QName("E{sH;N8", "E{sH;N8");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: E{sH;N8:E{sH;N8
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      QName qName0 = new QName("]yq", ";4XjdDGooMG1@");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, ";4XjdDGooMG1@");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      boolean boolean0 = nodePointer0.isNode();
      assertFalse(nodePointer0.isAttribute());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory", "Cannot create collection of type: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.isNode();
      assertFalse(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.isRoot();
      assertTrue(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeNameTest");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NodePointer nodePointer1 = nodePointer0.getParent();
      assertFalse(variablePointer0.isAttribute());
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("cb]Wl", "Hb1N<1");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, jXPathContext0);
      nodePointer0.getNamespaceResolver();
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeNameTest");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.getNamespaceResolver();
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      QName qName0 = new QName("Mhe&7j");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "qZmriR");
      NodePointer nodePointer1 = nodePointer0.getValuePointer();
      assertTrue(nodePointer0.isRoot());
      
      String string0 = nodePointer1.asPath();
      assertEquals("$Mhe&7j", string0);
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeNameTest");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) "org.apache.commons.jxpath.ri.compiler.NodeNameTest");
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByID(jXPathContext0, "Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      QName qName0 = new QName("j17");
      Object object0 = new Object();
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, qName0, (-3777), (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path //j17[-3776], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      QName qName0 = new QName("  ", "  ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByKey((JXPathContext) null, "  ", "#:#+q,*)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      QName qName0 = new QName("", "(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespacePointer("");
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeNameTest0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.getNamespaceURI();
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      QName qName0 = new QName("");
      Object object0 = new Object();
      Locale locale0 = Locale.JAPAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      NodePointer nodePointer1 = nodePointer0.createPath((JXPathContext) null);
      assertFalse(nodePointer1.isAttribute());
      assertTrue(nodePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      variablePointer0.setNamespaceResolver(namespaceResolver0);
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createAttribute((JXPathContext) null, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an attribute for path $/@, operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getNodeValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      variablePointer0.getDefaultNamespaceURI();
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      QName qName0 = new QName(")");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.namespaceIterator();
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      // Undeclared exception!
      try { 
        variablePointer0.isLanguage((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      QName qName0 = new QName("_e$p~8>1");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, object0);
      // Undeclared exception!
      try { 
        variablePointer0.getNodeSetByKey(jXPathContext0, "_e$p~8>1", "_e$p~8>1");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      QName qName0 = new QName("&d75");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        nodePointer0.createPath(jXPathContext0, object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeNameTest");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertTrue(variablePointer0.isRoot());
      
      variablePointer0.printPointerChain();
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      QName qName0 = new QName("]yq", ";4XjdDGooMG1@");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, ";4XjdDGooMG1@");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      boolean boolean0 = nodePointer0.isAttribute();
      assertFalse(boolean0);
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      QName qName0 = new QName(")");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeNameTest0);
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, qName0, (-1620));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path //)[-1619], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Object object0 = new Object();
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      assertNotNull(nodePointer0);
      assertFalse(nodePointer0.isAttribute());
      
      nodePointer0.setAttribute(true);
      assertTrue(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(" of ", "Zk*X%s4H:Hc:");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.compareTo(qName0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to org.apache.commons.jxpath.ri.model.NodePointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }
}
