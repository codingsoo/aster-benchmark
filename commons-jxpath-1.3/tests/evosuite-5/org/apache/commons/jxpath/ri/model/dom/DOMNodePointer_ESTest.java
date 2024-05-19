
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


package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DOMNodePointer_ESTest extends DOMNodePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("arR&u*Lm[HVCZ}43?X");
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      QName qName0 = new QName((String) null, "http://www.w3.org/2000/xmlns/");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(dOMNodePointer0, qName0, iIOMetadataNode0);
      int int0 = dOMNodePointer0.compareChildNodePointers(dOMNodePointer0, nodePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
      boolean boolean0 = dOMNodePointer0.isLanguage("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
      Node node0 = iIOMetadataNode1.appendChild(iIOMetadataNode0);
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, locale0);
      String string0 = dOMNodePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      Object object0 = dOMNodePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("R&D'a1");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      Object object0 = dOMNodePointer0.getImmediateNode();
      assertSame(object0, iIOMetadataNode0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      Object object0 = dOMNodePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = DOMNodePointer.findEnclosingAttribute((Node) null, "Tnel");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("=$^W?Rymy9");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      // Undeclared exception!
      try { 
        DOMNodePointer.testNode((Node) null, (NodeTest) nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "POINTER: ");
      // Undeclared exception!
      try { 
        dOMNodePointer0.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.insertBefore(iIOMetadataNode0, iIOMetadataNode0);
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "http://www.w3.org/2000/xmlns/");
      // Undeclared exception!
      dOMNodePointer0.isLanguage("http://www.w3.org/2000/xmlns/");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.isLanguage("UZW<JpP\"dU/no7du-< ");
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
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DOMNodePointer.getPrefix((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DOMNodePointer.getNamespaceURI((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.getNamespaceURI();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
      // Undeclared exception!
      try { 
        dOMNodePointer0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode0);
      // Undeclared exception!
      DOMNodePointer.findEnclosingAttribute(node0, "");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.KOREA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dOMNodePointer0);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild(jXPathContext0, qName0, 9, (Object) jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "5}zF");
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("~%0+.4-_>");
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("~%0+.4-_>", "~%0+.4-_>");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '~%0+.4-_>:~%0+.4-_>'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("\"!LgiT1&|8V5", "\"!LgiT1&|8V5");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest@0000000002");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(nodeTypeTest0, true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: \"!LgiT1&|8V5:\"!LgiT1&|8V5
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, " ,+=Dgwy&mu&Ag*");
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "http://www.w3.org/2000/xmlns/");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dOMNodePointer0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/2000/xmlns/");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("http://www.w3.org/2000/xmlns/");
      Locale locale0 = new Locale("),cz{n", "\u0004H370bc%", "a^0mou\"Q");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("http://www.w3.org/2000/xmlns/", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(processingInstructionTest0, true, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'http://www.w3.org/2000/xmlns/:'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("`.dAo-?OF(2/");
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      QName qName0 = dOMNodePointer0.getName();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(nodeNameTest0, true, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.JXPathContextReferenceImpl cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("http://www.w3.org/2000/xmlns/");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/2000/xmlns/");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      Object object0 = nodePointer0.getValue();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("g,T:F+7");
      String string0 = DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("g,T%DR");
      String string0 = DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/2000/xmlns/");
      String string0 = DOMNodePointer.getLocalName(iIOMetadataNode0);
      assertEquals("http://www.w3.org/2000/xmlns/", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/2000/xmlns/");
      String string0 = DOMNodePointer.getPrefix(iIOMetadataNode0);
      assertEquals("http", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("d`-$c");
      String string0 = DOMNodePointer.getPrefix(iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      String string0 = dOMNodePointer0.asPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null, "[");
      String string0 = dOMNodePointer0.asPath();
      assertEquals("id('[')", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "F]s)ft?UNFXFn(U");
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) dOMNodePointer0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild(jXPathContext0, (QName) null, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: id('F]s)ft?UNFXFn(U')
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("arR&u*Lm[HVCZ}43?X");
      Locale locale0 = Locale.ITALIAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      String string0 = dOMNodePointer0.getDefaultNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode((String) null);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      dOMNodePointer0.getNamespaceURI((String) null);
      String string0 = dOMNodePointer0.getDefaultNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QName qName0 = new QName("\"!LgiT1&|8V5", "\"!LgiT1&|8V5");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest@0000000002");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
      String string0 = dOMNodePointer0.getNamespaceURI("] ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("arR&u*Lm[HVCZ}43?X");
      QName qName0 = new QName((String) null, "http://www.w3.org/2000/xmlns/");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null, "5}zF>");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.getPointerByID(jXPathContext0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dOMNodePointer0);
      QName qName0 = new QName("");
      dOMNodePointer0.createAttribute(jXPathContext0, qName0);
      NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      // Undeclared exception!
      try { 
        DOMNodePointer.getLocalName(iIOMetadataNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("arR&u*Lm[HVCZ}43?X");
      Locale locale0 = Locale.ITALIAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      boolean boolean0 = dOMNodePointer0.equals(iIOMetadataNode0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("g,T:F+7");
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "g,T:F+7");
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      String string0 = dOMNodePointer1.asPath();
      assertEquals("id('g,T:F+7')/g,T:F+7[1]", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("g,T:F+7");
      Locale locale0 = Locale.FRENCH;
      QName qName0 = new QName("g,T:F+7", "/text()");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, iIOMetadataNode0);
      String string0 = dOMNodePointer0.asPath();
      assertEquals("/g,T:F+7[1]", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QName qName0 = new QName("http://www.w3.org/2000/xmlns/");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/2000/xmlns/");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, (Node) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.createAttribute((JXPathContext) null, qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<N)RJnTq{D3(8&8");
      Locale locale0 = new Locale("nzd=SPx1pW", "8mTCG(;)bRtX", "<N)RJnTq{D3(8&8");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "$I{mtan48X-Itd");
      // Undeclared exception!
      try { 
        dOMNodePointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot remove root DOM node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dOMNodePointer0);
      QName qName0 = new QName("http://www.w3.org/2000/xmlns/", "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown namespace prefix: http://www.w3.org/2000/xmlns/
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dOMNodePointer0);
      QName qName0 = new QName("");
      dOMNodePointer0.createAttribute(jXPathContext0, qName0);
      NodePointer nodePointer0 = dOMNodePointer0.createAttribute(jXPathContext0, qName0);
      assertFalse(nodePointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      QName qName0 = new QName("http://www.w3.org/2000/xmlns/", "");
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
      // Undeclared exception!
      try { 
        dOMNodePointer0.setValue(nodeIterator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null, "5}zF>");
      dOMNodePointer0.setValue(dOMNodePointer0);
      assertTrue(dOMNodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null, "5}zF>");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      NodePointer nodePointer0 = dOMNodePointer0.createPath(jXPathContext0, (Object) null);
      assertEquals(1, nodePointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("~%0+.4-_>");
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("~%0+.4-_>", "~%0+.4-_>");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
      dOMNodePointer0.setValue(iIOMetadataNode0);
      assertFalse(dOMNodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      boolean boolean0 = dOMNodePointer0.isLanguage("&TVX]o");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<N)RJnTq{D3(8&8");
      Locale locale0 = new Locale("nzd=SPx1pW", "8mTCG(;)bRtX", "<N)RJnTq{D3(8&8");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "$I{mtan48X-Itd");
      boolean boolean0 = dOMNodePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      QName qName0 = new QName("http://www.w3.org/2000/xmlns/");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/2000/xmlns/");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null, "[");
      NodeIterator nodeIterator0 = dOMNodePointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      String string0 = dOMNodePointer0.getNamespaceURI("xmlns");
      assertEquals("http://www.w3.org/2000/xmlns/", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null, "bCl:aFJaO");
      String string0 = dOMNodePointer0.getNamespaceURI("xml");
      assertEquals("http://www.w3.org/XML/1998/namespace", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<N)RJnTq{D3(8&8");
      Locale locale0 = new Locale("nzd=SPx1pW", "8mTCG(;)bRtX", "<N)RJnTq{D3(8&8");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "$I{mtan48X-Itd");
      String string0 = dOMNodePointer0.getNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
      dOMNodePointer0.getNamespaceResolver();
      NamespaceResolver namespaceResolver0 = dOMNodePointer0.getNamespaceResolver();
      assertFalse(namespaceResolver0.isSealed());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1850);
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, (Node) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1891));
      // Undeclared exception!
      try { 
        dOMNodePointer0.testNode((NodeTest) nodeTypeTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("arR&u*Lm[HVCZ}43?X");
      Locale locale0 = Locale.ITALIAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      QName qName0 = dOMNodePointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) nodeNameTest0);
      assertEquals("arR&u*Lm[HVCZ}43?X", nodeNameTest0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("R&D'a1");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      QName qName0 = new QName("<<unknown namespace>>", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("~%0+.4-_>");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = DOMNodePointer.testNode((Node) null, (NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null, "[");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      NodeIterator nodeIterator0 = dOMNodePointer0.childIterator(nodeTypeTest0, false, dOMNodePointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null, "[");
      QName qName0 = new QName("http://www.w3.org/2000/xmlns/");
      // Undeclared exception!
      try { 
        dOMNodePointer0.attributeIterator(qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.namespaceIterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("arR&u*Lm[HVCZ}43?X");
      Locale locale0 = Locale.ITALIAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      QName qName0 = dOMNodePointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "http://www.w3.org/XML/1998/namespace");
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) nodeNameTest0);
      assertTrue(boolean0);
      assertEquals("arR&u*Lm[HVCZ}43?X", nodeNameTest0.toString());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("arR&u*Lm[HVCZ}43?X");
      Locale locale0 = Locale.ITALIAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      boolean boolean0 = dOMNodePointer0.isActual();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("/text()");
      Locale locale0 = Locale.ITALY;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, (String) null);
      dOMNodePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<N)RJnTq{D3(8&8");
      Locale locale0 = new Locale("nzd=SPx1pW", "8mTCG(;)bRtX", "<N)RJnTq{D3(8&8");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "$I{mtan48X-Itd");
      int int0 = dOMNodePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      NodePointer nodePointer0 = dOMNodePointer0.namespacePointer("[Y=7D/7nW}@/'4P\")");
      assertTrue(nodePointer0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("arR&u*Lm[HVCZ}43?X");
      Locale locale0 = Locale.ITALIAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      QName qName0 = dOMNodePointer0.getName();
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild((JXPathContext) null, qName0, (-2327), (Object) iIOMetadataNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "5}zF");
      boolean boolean0 = dOMNodePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("~%0+.4-_>");
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("~%0+.4-_>", "~%0+.4-_>");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
      String string0 = dOMNodePointer0.getLanguage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null, "5}zF>");
      Object object0 = dOMNodePointer0.getBaseValue();
      assertSame(object0, iIOMetadataNode0);
  }
}
