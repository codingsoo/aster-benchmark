
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
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CollectionPointerFactory_ESTest extends CollectionPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      QName qName0 = new QName(")].x7[.kCw", "G.yE$)1Kt;1u*%\"O");
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      NodePointer nodePointer0 = collectionPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) linkedList0);
      assertFalse(nodePointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      QName qName0 = new QName("");
      Object object0 = new Object();
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = collectionPointerFactory0.createNodePointer(qName0, object0, locale0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      QName qName0 = new QName("<x");
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, locale0, locale0);
      NodePointer nodePointer1 = collectionPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) linkedList0);
      assertNull(nodePointer1.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      QName qName0 = new QName("<x");
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, locale0, locale0);
      NodePointer nodePointer1 = collectionPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) locale0);
      assertNull(nodePointer1);
      assertEquals(10, collectionPointerFactory0.getOrder());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      QName qName0 = new QName("<x");
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = collectionPointerFactory0.createNodePointer(qName0, (Object) linkedList0, locale0);
      assertTrue(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CollectionPointerFactory collectionPointerFactory0 = new CollectionPointerFactory();
      int int0 = collectionPointerFactory0.getOrder();
      assertEquals(10, int0);
  }
}