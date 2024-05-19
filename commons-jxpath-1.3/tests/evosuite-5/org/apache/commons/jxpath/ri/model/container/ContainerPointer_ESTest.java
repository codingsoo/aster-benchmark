
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
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Container;
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
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ContainerPointer_ESTest extends ContainerPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.setIndex(0);
      ContainerPointer containerPointer1 = new ContainerPointer((Container) null, (Locale) null);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(containerPointer1.equals((Object)containerPointer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.setIndex(0);
      Object object0 = containerPointer0.clone();
      boolean boolean0 = containerPointer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.setIndex((-725));
      containerPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      boolean boolean0 = containerPointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.JAPANESE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodePointer nodePointer0 = containerPointer0.namespacePointer("<<unknown namespace>>");
      assertFalse(nodePointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.XMLDocumentContainer", "org.apache.commons.jxpath.XMLDocumentContainer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      Object object0 = containerPointer0.getImmediateNode();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      Locale locale0 = Locale.GERMANY;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      Object object0 = containerPointer0.getBaseValue();
      assertSame(xMLDocumentContainer0, object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.setIndex((-726));
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      int int0 = containerPointer0.compareChildNodePointers(containerPointer0, nodePointer0);
      assertEquals(2147482922, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.FRENCH;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, containerPointer0, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      NodeIterator nodeIterator0 = containerPointer0.childIterator(processingInstructionTest0, true, nodePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1005));
      NodeIterator nodeIterator0 = containerPointer0.childIterator(nodeTypeTest0, false, containerPointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      String string0 = containerPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      InputSource inputSource0 = new InputSource();
      SAXSource sAXSource0 = new SAXSource(inputSource0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        containerPointer0.testNode(nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; java.net.MalformedURLException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      // Undeclared exception!
      try { 
        containerPointer0.testNode(processingInstructionTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource((XMLReader) null, (InputSource) null);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      Locale locale0 = Locale.KOREAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.setValue(containerPointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("M");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode((String) null);
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0, (String) null);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.namespacePointer("<<unknown namespace>>");
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
      SAXSource sAXSource0 = new SAXSource();
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.namespacePointer("<<unknown namespace>>");
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
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.namespaceIterator();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ftp://ftp.someFakeButWellFormedURL.org/fooExample; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.TAIWAN;
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
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      StreamSource streamSource0 = new StreamSource(byteArrayInputStream0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.FRANCE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
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
  public void test20()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("D+e_%9~s", "D+e_%9~s");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.getNamespaceURI("D+e_%9~s");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ftp://ftp.someFakeButWellFormedURL.org/fooExample; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.getNamespaceURI("");
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
      MockFile mockFile0 = new MockFile("", "");
      StreamSource streamSource0 = new StreamSource(mockFile0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateValuePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file:/; org.xml.sax.SAXParseException; systemId: file:/; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateValuePointer();
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
      URL uRL0 = MockURL.getHttpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = new Locale(",_7?e");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateNode();
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
      QName qName0 = new QName("Z:zCpFxBN'5", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, (Container) null);
      // Undeclared exception!
      try { 
        containerPointer0.compareChildNodePointers(variablePointer0, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.container.ContainerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.ITALY;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(processingInstructionTest0, true, containerPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file://some/fake/but/wellformed/url; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "zh-TW");
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ITALY;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, locale0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, false, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Locale cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.KOREA;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.attributeIterator((QName) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ftp://ftp.someFakeButWellFormedURL.org/fooExample; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
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
  public void test32()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.setIndex(1132);
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.setIndex((-725));
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.setIndex(0);
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("aDInK");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.getLength();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ftp://ftp.someFakeButWellFormedURL.org/fooExample; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      QName qName0 = containerPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      Object object0 = containerPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.XMLDocumentContainer", "org.apache.commons.jxpath.XMLDocumentContainer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      String string0 = containerPointer0.toString();
      assertEquals("$org.apache.commons.jxpath.XMLDocumentContainer:org.apache.commons.jxpath.XMLDocumentContainer", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      ContainerPointer containerPointer1 = new ContainerPointer((Container) null, (Locale) null);
      assertTrue(containerPointer1.equals((Object)containerPointer0));
      
      containerPointer1.setIndex((-725));
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(containerPointer1.equals((Object)containerPointer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.ITALY;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      XMLDocumentContainer xMLDocumentContainer1 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer1 = new ContainerPointer(containerPointer0, xMLDocumentContainer1);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.equals(containerPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.XMLDocumentContainer", "org.apache.commons.jxpath.XMLDocumentContainer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      Object object0 = new Object();
      boolean boolean0 = containerPointer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.XMLDocumentContainer", "org.apache.commons.jxpath.XMLDocumentContainer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      containerPointer0.getNamespaceURI("$org.apache.commons.jxpath.XMLDocumentContainer:org.apache.commons.jxpath.XMLDocumentContainer");
      NodeIterator nodeIterator0 = containerPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      containerPointer0.setIndex((-725));
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      int int0 = containerPointer0.compareChildNodePointers(nodePointer0, containerPointer0);
      assertEquals((-2147482923), int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, (Container) null);
      int int0 = containerPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.XMLDocumentContainer", "org.apache.commons.jxpath.XMLDocumentContainer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      containerPointer0.setIndex(1);
      String string0 = containerPointer0.getNamespaceURI("$org.apache.commons.jxpath.XMLDocumentContainer:org.apache.commons.jxpath.XMLDocumentContainer");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.XMLDocumentContainer", "org.apache.commons.jxpath.XMLDocumentContainer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      boolean boolean0 = containerPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, (Container) null);
      boolean boolean0 = containerPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.XMLDocumentContainer", "org.apache.commons.jxpath.XMLDocumentContainer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      containerPointer0.getNamespaceURI("?IO)KIj45");
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.XMLDocumentContainer", "org.apache.commons.jxpath.XMLDocumentContainer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      int int0 = containerPointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.XMLDocumentContainer", "org.apache.commons.jxpath.XMLDocumentContainer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, true, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'org.apache.commons.jxpath.XMLDocumentContainer:org.apache.commons.jxpath.XMLDocumentContainer'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      // Undeclared exception!
      try { 
        containerPointer0.setValue("<<unknown namespace>>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.container.ContainerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodePointer nodePointer0 = containerPointer0.namespacePointer("<<unknown namespace>>");
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeIterator nodeIterator0 = containerPointer0.namespaceIterator();
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      QName qName0 = new QName("Z:zCpFxBN'5", "");
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, (Container) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.container.ContainerPointer");
      boolean boolean0 = containerPointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.XMLDocumentContainer", "org.apache.commons.jxpath.XMLDocumentContainer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      boolean boolean0 = containerPointer0.isContainer();
      assertTrue(boolean0);
  }
}
