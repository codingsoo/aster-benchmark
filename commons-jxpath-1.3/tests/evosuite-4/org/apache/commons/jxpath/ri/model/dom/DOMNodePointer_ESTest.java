
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
      QName qName0 = new QName("", "Cannot setValue of an object that is not some other object's property");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(nodePointer0, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :Cannot setValue of an object that is not some other object's property
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode("' and '");
      Node node0 = iIOMetadataNode0.insertBefore(iIOMetadataNode1, iIOMetadataNode0);
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, locale0, "/7['r_&TY./x4PQ");
      String string0 = dOMNodePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.ITALY;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("d^]Fjw5");
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      boolean boolean0 = dOMNodePointer0.isLanguage("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode(";'`Yg9");
      String string0 = DOMNodePointer.getLocalName(iIOMetadataNode0);
      assertEquals(";'`Yg9", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      String string0 = dOMNodePointer0.getLanguage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("F_IaIy$/o(ms/t5(u_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, (Node) null);
      Object object0 = dOMNodePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.JXPathInvalidAccessException");
      Locale locale0 = Locale.CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      Object object0 = dOMNodePointer0.getImmediateNode();
      assertSame(iIOMetadataNode0, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      Object object0 = dOMNodePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      String string0 = DOMNodePointer.findEnclosingAttribute(iIOMetadataNode0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      QName qName0 = new QName("ZA", "_Thm?EzWGl6{6y;6");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodeIterator nodeIterator0 = dOMNodePointer0.childIterator(nodeNameTest0, false, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("@].*A,&{ak(`*3]XW'");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
      NodeIterator nodeIterator0 = dOMNodePointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("' and '");
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      String string0 = dOMNodePointer0.asPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, (Node) null);
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
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, (String) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.namespaceIterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null, "y%oY'}P:r&/+6P");
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
  public void test16()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("wMy0?.");
      Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode0);
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, locale0);
      // Undeclared exception!
      dOMNodePointer0.isLanguage("wMy0?.");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, ":91tW{E");
      // Undeclared exception!
      try { 
        dOMNodePointer0.isLanguage((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "g<;'4OJ<A!");
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
  public void test19()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      // Undeclared exception!
      try { 
        DOMNodePointer.getPrefix(iIOMetadataNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      // Undeclared exception!
      try { 
        DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
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
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Node node0 = iIOMetadataNode0.insertBefore(iIOMetadataNode0, iIOMetadataNode0);
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, locale0, "/7['r_&TY./x4PQ");
      // Undeclared exception!
      dOMNodePointer0.getNamespaceURI("\" at line ");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("@].*A,&{ak(`*3]XW'");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
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
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dOMNodePointer0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild(jXPathContext0, (QName) null, 1185, (Object) jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild((JXPathContext) null, (QName) null, (-57));
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
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "Cannot set value of an element of a ");
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
  public void test26()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("text", "<<unknown namespace>>");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'text:<<unknown namespace>>'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("java.util.Locale@0000000002", "java.util.Locale@0000000002");
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "java.util.Locale@0000000002", locale0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, (Node) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(nodePointer0, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      QName qName0 = new QName("4G!^W|t", "4G!^W|t");
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        nodePointer0.childIterator(nodeTypeTest0, true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 4G!^W|t:4G!^W|t
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("077^gS/PpYSN+!");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) processingInstructionTest0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("V", "077^gS/PpYSN+!");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(processingInstructionTest0, true, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'V:077^gS/PpYSN+!'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      Object object0 = dOMNodePointer0.getValue();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("' and '");
      String string0 = DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("s&{p.\"7V_&3,V{aht:");
      String string0 = DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      String string0 = DOMNodePointer.getLocalName(iIOMetadataNode0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode((String) null);
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
  public void test35()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("PINTER:");
      String string0 = DOMNodePointer.getPrefix(iIOMetadataNode0);
      assertEquals("PINTER", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("z n");
      String string0 = DOMNodePointer.getPrefix(iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      basicVariables0.declareVariable("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, (Node) null);
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
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("FW8_nwI>(sjf|&R");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "/processing-instruction('");
      String string0 = dOMNodePointer0.asPath();
      assertEquals("id('/processing-instruction(&apos;')", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "org.apache.commons.jxpath.PackageFunctions");
      String string0 = dOMNodePointer0.getDefaultNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "/7['r_&TY./x4PQ");
      String string0 = dOMNodePointer0.getNamespaceURI("POINTER: ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.GERMAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      int int0 = dOMNodePointer0.compareChildNodePointers(dOMNodePointer0, dOMNodePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("/{1");
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "/{1");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.getPointerByID(jXPathContext0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      Object object0 = dOMNodePointer0.clone();
      boolean boolean0 = object0.equals(dOMNodePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, (Node) null);
      boolean boolean0 = dOMNodePointer0.equals(iIOMetadataNode0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("|}>NmnpGZjx");
      Locale locale0 = Locale.GERMAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) iIOMetadataNode0);
      QName qName0 = new QName("");
      // Undeclared exception!
      try { 
        dOMNodePointer1.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: id('')/|}>NmnpGZjx[1]
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "org.apache.commons.jxpath.PackageFunctions");
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
  public void test49()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.GERMAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      iIOMetadataNode0.insertBefore(iIOMetadataNode0, iIOMetadataNode0);
      dOMNodePointer0.remove();
      assertTrue(dOMNodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      QName qName0 = new QName("4G!^W|t");
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      NodePointer nodePointer1 = nodePointer0.createAttribute(jXPathContext0, qName0);
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.createAttribute((JXPathContext) null, (QName) null);
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
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null, "Jeb/");
      NodePointer nodePointer0 = dOMNodePointer0.createPath((JXPathContext) null, (Object) dOMNodePointer0);
      assertTrue(nodePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      QName qName0 = new QName("4G!^W|t", "4G!^W|t");
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      // Undeclared exception!
      try { 
        nodePointer0.setValue(processingInstructionTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("/{1");
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode1, locale0, "/{1");
      iIOMetadataNode0.insertBefore(iIOMetadataNode1, iIOMetadataNode1);
      // Undeclared exception!
      try { 
        dOMNodePointer0.setValue(iIOMetadataNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, ":91tW{E");
      dOMNodePointer0.setValue((Object) null);
      assertEquals(1, dOMNodePointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, ":91tW{E");
      dOMNodePointer0.setValue(iIOMetadataNode0);
      assertEquals(Integer.MIN_VALUE, dOMNodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("/{1");
      iIOMetadataNode0.setAttribute("<<unknown namespace>>", "JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates");
      String string0 = DOMNodePointer.findEnclosingAttribute(iIOMetadataNode0, "<<unknown namespace>>");
      assertEquals("JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      QName qName0 = new QName("@].*A,&{ak(`*3]XW'");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
      boolean boolean0 = dOMNodePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      dOMNodePointer0.getDefaultNamespaceURI();
      String string0 = dOMNodePointer0.getDefaultNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, ":91tW{E");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("http://www.w3.org/2000/xmlns/", "AeQ_:X8EP%-h$YFui@");
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
  public void test61()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/XML/1998/namespace");
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "i'^");
      String string0 = dOMNodePointer0.getNamespaceURI("xmlns");
      assertNotNull(string0);
      assertEquals("http://www.w3.org/2000/xmlns/", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xml");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xmlns");
      String string0 = dOMNodePointer0.getNamespaceURI("xml");
      assertEquals("http://www.w3.org/XML/1998/namespace", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      String string0 = dOMNodePointer0.getNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, (Node) null);
      dOMNodePointer0.getNamespaceURI(" of ");
      String string0 = dOMNodePointer0.getNamespaceURI(" of ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.KOREA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      String string0 = dOMNodePointer0.getNamespaceURI((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      dOMNodePointer0.getNamespaceResolver();
      NamespaceResolver namespaceResolver0 = dOMNodePointer0.getNamespaceResolver();
      assertFalse(namespaceResolver0.isSealed());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("ht3([4f(D");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1983936790));
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, (Node) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(93);
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
  public void test69()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("' and '");
      QName qName0 = new QName("&]$R@X[}qL", "' and '");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "' and '");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("' and '");
      QName qName0 = new QName("&]$R@X[}qL", "' and '");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/XML/1998/namespace");
      QName qName0 = new QName("http://www.w3.org/2000/xmlns/");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "http://www.w3.org/XML/1998/namespace");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/XML/1998/namespace");
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "')");
      QName qName0 = dOMNodePointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "http://www.w3.org/XML/1998/namespace");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertEquals("http:http://www.w3.org/XML/1998/namespace", nodeNameTest0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("xw5~E)-SwFs^8P@/");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      QName qName0 = new QName((String) null, "xml:space");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "\",7e[2l)o&,s;[,@FI_");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(dOMNodePointer0, qName0, qName0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(nodeNameTest0, false, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.GERMAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, ":91tW{E");
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("\"ank7");
      Locale locale0 = Locale.CHINA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "\"ank7");
      boolean boolean0 = dOMNodePointer0.isActual();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("wMy0?.");
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      dOMNodePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("/{1");
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "/{1");
      int int0 = dOMNodePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      NodePointer nodePointer0 = dOMNodePointer0.namespacePointer((String) null);
      assertTrue(nodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = new Locale("", "");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, (String) null);
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
  public void test83()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      basicVariables0.declareVariable("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, (Node) null);
      boolean boolean0 = dOMNodePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.GERMAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      boolean boolean0 = dOMNodePointer0.isLanguage("xml");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("/{1");
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "/{1");
      Object object0 = dOMNodePointer0.getBaseValue();
      assertSame(object0, iIOMetadataNode0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "x,DpfXzab1CAm` W");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "x,DpfXzab1CAm` W");
      QName qName0 = new QName("<<unknown namespace>>");
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) "VQ;7UDw;l!^+\"o_`hl");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: id('x,DpfXzab1CAm` W')
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }
}
