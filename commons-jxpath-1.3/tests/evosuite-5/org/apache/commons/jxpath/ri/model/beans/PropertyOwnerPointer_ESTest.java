
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
import org.apache.commons.jxpath.BasicVariables;
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
      QName qName0 = new QName("xHjW", "xHjW");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setIndex(562);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, qName0, jXPathBasicBeanInfo0);
      int int0 = beanPointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = new Locale("java.util.concurrent.atomic.AtomicInteger");
      NullPointer nullPointer0 = new NullPointer(locale0, "java.util.concurrent.atomic.AtomicInteger");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyPointer propertyPointer1 = nullPointer0.getPropertyPointer();
      int int0 = nullPointer0.compareChildNodePointers(propertyPointer0, propertyPointer1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("", "_=TB)|=Q");
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      nullPointer0.setIndex(555);
      nullPointer0.setIndex(0);
      assertEquals(0, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      nullPointer0.setValue("");
      assertFalse(nullPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("}Mw4g)5{R=m_sEdrc{", "}Mw4g)5{R=m_sEdrc{");
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.isValidProperty(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      QName qName0 = nullPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("aUA+@v7B^usk]Zhd", "aUA+@v7B^usk]Zhd");
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale(";", "");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      QName qName1 = beanPointer0.getName();
      assertEquals("aUA+@v7B^usk]Zhd:aUA+@v7B^usk]Zhd", qName1.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      Object object0 = nullPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NodeIterator nodeIterator0 = nullPointer0.createNodeIterator("", false, propertyPointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "$:G;@!gHI{sj ");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      QName qName0 = new QName("$:G;@!gHI{sj ", "$:G;@!gHI{sj ");
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale0);
      int int0 = beanPointer0.compareChildNodePointers(propertyPointer0, beanPointer0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("-", "-");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.setValue("-");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: -:-
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.setValue("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setIndex((-845));
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.setValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathException");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nodeNameTest0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPointer nullPointer0 = new NullPointer(propertyPointer0, qName0);
      BeanPointer beanPointer1 = new BeanPointer(nullPointer0, qName0, nodeNameTest0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer1.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: /* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      // Undeclared exception!
      try { 
        beanPointer0.isValidProperty((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "w'&DXqLM'QB");
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, nodeNameTest0, jXPathBasicBeanInfo0, locale0);
      // Undeclared exception!
      try { 
        beanPointer0.compareChildNodePointers(beanPointer0, beanPointer0);
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
      QName qName0 = new QName("The specified collection element does not exist: ");
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale0);
      QName qName1 = new QName((String) null, "<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1);
      // Undeclared exception!
      try { 
        beanPointer0.childIterator(nodeNameTest0, false, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, locale0, jXPathBasicBeanInfo0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      // Undeclared exception!
      try { 
        nullPointer0.childIterator(nodeNameTest0, true, beanPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((QName) null, (Locale) null);
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
  public void test19()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.GERMANY;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.isValidProperty(qName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, "`q");
      boolean boolean0 = nullPointer0.isDynamicPropertyDeclarationSupported();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NullPointer nullPointer0 = new NullPointer(locale0, ">h/g|zmzJNm");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      QName qName0 = new QName(">h/g|zmzJNm", ">h/g|zmzJNm");
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale0);
      int int0 = beanPointer0.compareChildNodePointers(propertyPointer0, beanPointer0);
      assertEquals((-20), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, (Object) null, jXPathBasicBeanInfo0);
      beanPointer0.remove();
      assertFalse(beanPointer0.isCollection());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("aUA+@v7B^usk]Zhd", "aUA+@v7B^usk]Zhd");
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = new Locale(";", "");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
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
  public void test24()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathxception");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.GERMANY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nodeNameTest0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPointer nullPointer0 = new NullPointer(propertyPointer0, qName0);
      BeanPointer beanPointer1 = new BeanPointer(nullPointer0, qName0, nodeNameTest0, jXPathBasicBeanInfo0);
      beanPointer1.setIndex(6);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        beanPointer1.setValue(object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The specified collection element does not exist: /*_/org.apache.commons.jxpath.JXPathxception
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathxception");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.GERMANY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nodeNameTest0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPointer nullPointer0 = new NullPointer(propertyPointer0, qName0);
      BeanPointer beanPointer1 = new BeanPointer(nullPointer0, qName0, nodeNameTest0, jXPathBasicBeanInfo0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        beanPointer1.setValue(object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot setValue of an object that is not some other object's property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.TAIWAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", (JXPathBeanInfo) null, locale0);
      NullPointer nullPointer0 = new NullPointer(beanPointer0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "v");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        nullPointer0.createPath(jXPathContext0, (Object) nodeNameTest0);
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
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, "`q");
      nullPointer0.setIndex(0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "`q");
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: id(`q)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.TAIWAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", (JXPathBeanInfo) null, locale0);
      beanPointer0.isLeaf();
      Object object0 = beanPointer0.getImmediateNode();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      nullPointer0.setIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("}Mw4g)5{R=m_sEdrc{", "}Mw4g)5{R=m_sEdrc{");
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = new NullPointer(locale0, "}Mw4g)5{R=m_sEdrc{");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      NodeIterator nodeIterator0 = beanPointer0.childIterator(nodeTypeTest0, true, nullPointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, locale0, jXPathBasicBeanInfo0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      // Undeclared exception!
      try { 
        nullPointer0.childIterator(nodeTypeTest0, false, beanPointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.BeanPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("]A5%:&kE?8", "]A5%:&kE?8");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodeIterator nodeIterator0 = variablePointer0.childIterator(nodeNameTest0, false, variablePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, locale0, jXPathBasicBeanInfo0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      NodeIterator nodeIterator0 = beanPointer0.childIterator(processingInstructionTest0, false, nullPointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.childIterator((NodeTest) null, true, nullPointer0);
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
      QName qName0 = new QName("}Mw4g)5{R=m_sEdrc{", "}Mw4g)5{R=m_sEdrc{");
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = new NullPointer(locale0, "}Mw4g)5{R=m_sEdrc{");
      NodeIterator nodeIterator0 = nullPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QName qName0 = new QName("java.util.concurrent.atomic.AtomicInteger");
      Locale locale0 = new Locale("java.util.concurrent.atomic.AtomicInteger");
      NullPointer nullPointer0 = new NullPointer(locale0, "java.util.concurrent.atomic.AtomicInteger");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodeIterator nodeIterator0 = nullPointer0.childIterator(nodeNameTest0, false, propertyPointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QName qName0 = new QName("");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createNodeIterator("[65un", true, nullPointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.NullPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      QName qName0 = new QName("");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      // Undeclared exception!
      try { 
        nullPointer0.createNodeIterator("[65un", true, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }
}
