
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


package org.apache.commons.jxpath.ri.model.container;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
import java.io.StringReader;
import java.net.URL;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.XMLDocumentContainer;
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
import org.apache.commons.jxpath.ri.model.container.ContainerPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ContainerPointer_ESTest extends ContainerPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.setIndex(331);
      containerPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodePointer nodePointer0 = containerPointer0.namespacePointer("");
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.GERMAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      Object object0 = containerPointer0.getImmediateNode();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, xMLDocumentContainer0);
      Object object0 = containerPointer0.getBaseValue();
      assertSame(xMLDocumentContainer0, object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.setIndex(331);
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      int int0 = containerPointer0.compareChildNodePointers(variablePointer0, containerPointer0);
      assertEquals(2147483317, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setIndex(0);
      int int0 = containerPointer0.compareChildNodePointers(containerPointer0, variablePointer0);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodePointer nodePointer0 = containerPointer0.namespacePointer("/");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      NodeIterator nodeIterator0 = containerPointer0.childIterator(nodeTypeTest0, true, nodePointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("q8#,m ^");
      StreamSource streamSource0 = new StreamSource(stringReader0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "q8#,m ^");
      // Undeclared exception!
      try { 
        containerPointer0.testNode(nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      MockFile mockFile0 = new MockFile("<<unknown namespace>>", "<<unknown namespace>>");
      StreamSource streamSource0 = new StreamSource(mockFile0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(nodePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.setValue(qName0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("Cannot create collection of type: ", (String) null);
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Cannot create collection of type: ", (Locale) null);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0, "text");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(nodePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.namespacePointer("Cannot create collection of type: ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: text; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("s_UO@{NWABSbu@", "s_UO@{NWABSbu@");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        containerPointer0.namespacePointer("/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("org.jdom.Document", "org.jdom.Document");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      StringReader stringReader0 = new StringReader("org.jdom.Document");
      StreamSource streamSource0 = new StreamSource(stringReader0, "");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.namespaceIterator();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ; org.xml.sax.SAXParseException; systemId: file:///Users/mkim754/IdeaProjects/aster-benchmark/commons-jxpath-1.3/; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.namespaceIterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      JXPathContextReferenceImpl.addNodePointerFactory((NodePointerFactory) null);
      // Undeclared exception!
      try { 
        containerPointer0.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("~");
      StreamSource streamSource0 = new StreamSource(stringReader0, "~");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.forLanguageTag("]tKBD4o-*[x<z");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getNamespaceURI("-");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ~; org.xml.sax.SAXParseException; systemId: file:///Users/mkim754/IdeaProjects/aster-benchmark/commons-jxpath-1.3/~; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        containerPointer0.getNamespaceURI("txI(RAEc");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      // Undeclared exception!
      try { 
        containerPointer0.getLength();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file://some/fake/but/wellformed/url; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      StreamSource streamSource0 = new StreamSource(pipedInputStream0, "");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateValuePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ; java.io.IOException: Pipe not connected
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) uRL0);
      Locale locale0 = jXPathContext0.getLocale();
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.container.ContainerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, false, containerPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.NodeNameTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("D@D@[\"w-jw+P,!+y7X");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'D@D@[\"w-jw+P,!+y7X'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.JAPAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.attributeIterator((QName) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.setIndex(331);
      Object object0 = containerPointer0.getRootNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.setIndex(0);
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      int int0 = containerPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.GERMAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      QName qName0 = containerPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      Object object0 = containerPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      String string0 = containerPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathTypeConversionException");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      String string0 = containerPointer0.asPath();
      assertEquals("$org.apache.commons.jxpath.JXPathTypeConversionException", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.setIndex(331);
      ContainerPointer containerPointer1 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(boolean0);
      assertFalse(containerPointer1.equals((Object)containerPointer0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer1 = new ContainerPointer(xMLDocumentContainer0, locale0);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.equals("<<unknown namespace>>");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.equals(containerPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      ContainerPointer containerPointer1 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      QName qName0 = new QName((String) null, (String) null);
      containerPointer0.attributeIterator(qName0);
      Object object0 = containerPointer0.getNodeValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.setIndex(0);
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      assertTrue(nodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      boolean boolean0 = containerPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      String string0 = containerPointer0.getNamespaceURI("<<unknown namespace>>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      int int0 = containerPointer0.compareChildNodePointers(containerPointer0, containerPointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodeIterator nodeIterator0 = containerPointer0.childIterator(nodeNameTest0, true, variablePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.UK;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        containerPointer0.setValue(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.container.ContainerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeIterator nodeIterator0 = containerPointer0.namespaceIterator();
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      boolean boolean0 = containerPointer0.testNode(processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      StringReader stringReader0 = new StringReader("");
      StreamSource streamSource0 = new StreamSource(stringReader0, "<<unknown namespace>>");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: <<unknown namespace>>; org.xml.sax.SAXParseException; systemId: <<unknown namespace>>; lineNumber: 1; columnNumber: 1; Premature end of file.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }
}
