
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


package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NodeNameTest_ESTest extends NodeNameTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      String string0 = nodeNameTest0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("*");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      String string0 = nodeNameTest0.toString();
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      String string0 = nodeNameTest0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("9;wvF3u2GeIS/e2", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      boolean boolean0 = nodeNameTest0.isWildcard();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      QName qName0 = nodeNameTest0.getNodeName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("*");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      String string0 = nodeNameTest0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("y'wG/oW)!N'{.u", "org.apache.commons.jxpath.ri.QName");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "=<nm5Lz77'_n2]Fvo;");
      String string0 = nodeNameTest0.getNamespaceURI();
      assertEquals("=<nm5Lz77'_n2]Fvo;", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        nodeNameTest0.isWildcard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("*");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      QName qName1 = nodeNameTest0.getNodeName();
      assertSame(qName0, qName1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      // Undeclared exception!
      try { 
        nodeNameTest0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.NodeNameTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("*");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = nodeNameTest0.isWildcard();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      String string0 = nodeNameTest0.getNamespaceURI();
      assertEquals("", string0);
  }
}
