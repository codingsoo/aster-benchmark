
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
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NodeTypeTest_ESTest extends NodeTypeTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      int int0 = nodeTypeTest0.getNodeType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1522));
      int int0 = nodeTypeTest0.getNodeType();
      assertEquals((-1522), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = NodeTypeTest.nodeTypeToString(3);
      assertEquals("comment", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = NodeTypeTest.nodeTypeToString(17);
      assertEquals("UNKNOWN", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = NodeTypeTest.nodeTypeToString(4);
      assertEquals("processing-instruction", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = NodeTypeTest.nodeTypeToString(2);
      assertEquals("text", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = NodeTypeTest.nodeTypeToString(1);
      assertEquals("node", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
      String string0 = nodeTypeTest0.toString();
      assertEquals("comment()", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
      int int0 = nodeTypeTest0.getNodeType();
      assertEquals(3, int0);
  }
}
