
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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CollectionChildNodeIterator_ESTest extends CollectionChildNodeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.GERMANY;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      QName qName0 = new QName("<<unknown namespace>>", "org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, false, collectionPointer0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(collectionPointer0, qName0, object0);
      NodeIterator nodeIterator0 = collectionChildNodeIterator0.getElementNodeIterator(nodePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, object0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeTypeTest0, false, collectionPointer0);
      NodeIterator nodeIterator0 = collectionChildNodeIterator0.getElementNodeIterator(collectionPointer0);
      assertNotSame(collectionChildNodeIterator0, nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, (NodeTest) null, true, (NodePointer) null);
      // Undeclared exception!
      try { 
        collectionChildNodeIterator0.getElementNodeIterator((NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("9uLxMrax1*y.\"$G");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, "9uLxMrax1*y.\"$G");
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, true, variablePointer0);
      // Undeclared exception!
      try { 
        collectionChildNodeIterator0.getElementNodeIterator(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '9uLxMrax1*y.\"$G'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }
}
