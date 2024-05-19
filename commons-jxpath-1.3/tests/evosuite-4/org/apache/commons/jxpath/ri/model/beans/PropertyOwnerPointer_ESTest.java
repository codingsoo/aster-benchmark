
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
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
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PropertyOwnerPointer_ESTest extends PropertyOwnerPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("7P&~T5-");
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, (JXPathBeanInfo) null, locale0);
      beanPointer0.setIndex(0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      NullPointer nullPointer0 = new NullPointer(locale0, "<<unknown namespace>>");
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      int int0 = nullPointer0.compareChildNodePointers(variablePointer0, beanPointer0);
      assertEquals(0, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("");
      Object object0 = new Object();
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(locale0, "<<unknown namespace>>");
      BeanPointer beanPointer1 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      int int0 = nullPointer0.compareChildNodePointers(beanPointer0, beanPointer1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("gfq&eIr", "");
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      nullPointer0.setIndex(1335);
      assertEquals(1335, nullPointer0.getIndex());
      
      nullPointer0.setIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, "");
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      nullPointer0.remove();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("");
      Object object0 = new Object();
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.isValidProperty(qName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("c-", "c-");
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.isValidProperty(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      assertEquals(Integer.MIN_VALUE, propertyPointer0.getPropertyIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      QName qName0 = nullPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      QName qName1 = nullPointer0.getName();
      assertSame(qName0, qName1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      Object object0 = beanPointer0.getImmediateNode();
      assertEquals("", object0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NodeIterator nodeIterator0 = nullPointer0.createNodeIterator("id()", false, propertyPointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "PH;G>$a-Rs|", jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      int int0 = beanPointer0.compareChildNodePointers(propertyPointer0, nullPointer0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("U#d{T=m7(");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "DR<nmh+le");
      NodeIterator nodeIterator0 = nullPointer0.childIterator(nodeNameTest0, true, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      NodeIterator nodeIterator0 = nullPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathBasicBeanInfo");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "org.apache.commons.jxpath.JXPathBasicBeanInfo", jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPointer nullPointer0 = new NullPointer(propertyPointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.setValue((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: 'org.apache.commons.jxpath.JXPathBasicBeanInfo'/* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nodeNameTest0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPointer nullPointer0 = new NullPointer(locale0, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        beanPointer0.compareChildNodePointers(nullPointer0, propertyPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        nullPointer0.childIterator(nodeNameTest0, true, nullPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("], operation is not allowed for this type of node");
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      // Undeclared exception!
      try { 
        nullPointer0.childIterator(nodeNameTest0, true, nullPointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.NullPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("\"?\"sr'", (String) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, "\"?\"sr'", jXPathBasicBeanInfo0);
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
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(locale0, "Factory is not set on the JXPathContext - cannot create path: ");
      // Undeclared exception!
      try { 
        nullPointer0.isValidProperty((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("TK&luyO", "TK&luyO");
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      // Undeclared exception!
      try { 
        nullPointer0.createNodeIterator("=[J!N'f`$II(+<Z", false, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      int int0 = beanPointer0.compareChildNodePointers(propertyPointer0, nullPointer0);
      assertEquals((-16), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("6<4sE@k2a", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, "", jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer0.setValue(qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: 6<4sE@k2a:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointer$1", "");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "org.apache.commons.jxpath.ri.model.VariablePointer$1", jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(beanPointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.setValue(locale0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot setValue of an object that is not some other object's property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.JAPANESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        nullPointer0.setValue(object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      nullPointer0.setIndex(0);
      nullPointer0.getImmediateNode();
      assertEquals(0, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName((String) null, "Cannot remove an object that is not some other object's property or a collection element");
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      nullPointer0.getImmediateNode();
      Object object0 = nullPointer0.getNodeValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("7P&~T5-");
      Locale locale0 = Locale.ENGLISH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, (JXPathBeanInfo) null, locale0);
      beanPointer0.setIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("7P&~T5-");
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, (JXPathBeanInfo) null, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NodeIterator nodeIterator0 = beanPointer0.childIterator(nodeTypeTest0, true, variablePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("TK&luyO", "TK&luyO");
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "=[J!N'f`$II(+<Z");
      NodeIterator nodeIterator0 = nullPointer0.childIterator(nodeNameTest0, false, nullPointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName(", the target object is null");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      NodeIterator nodeIterator0 = nullPointer0.childIterator(processingInstructionTest0, true, variablePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      // Undeclared exception!
      try { 
        nullPointer0.attributeIterator((QName) null);
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
      QName qName0 = new QName("");
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, locale0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "/");
      // Undeclared exception!
      try { 
        nullPointer0.childIterator(nodeNameTest0, true, nodePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName((String) null, "Cannot remove an object that is not some other object's property or a collection element");
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.isDynamicPropertyDeclarationSupported();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "UtH");
      QName qName0 = new QName("<<unknown namespace>>");
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createNodeIterator("[voyF$,V.pj6%", false, nullPointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.NullPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      // Undeclared exception!
      try { 
        beanPointer0.childIterator((NodeTest) null, false, propertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }
}
