/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.ignite.testsuites;

import junit.framework.TestSuite;
import org.apache.ignite.internal.processors.cache.IgniteTopologyValidatorGridSplitCacheTest;
import org.apache.ignite.internal.processors.cache.IgniteTopologyValidatorNearPartitionedAtomicCacheTest;
import org.apache.ignite.internal.processors.cache.IgniteTopologyValidatorNearPartitionedTxCacheTest;
import org.apache.ignite.internal.processors.cache.IgniteTopologyValidatorPartitionedAtomicCacheTest;
import org.apache.ignite.internal.processors.cache.IgniteTopologyValidatorPartitionedTxCacheTest;
import org.apache.ignite.internal.processors.cache.IgniteTopologyValidatorReplicatedAtomicCacheTest;
import org.apache.ignite.internal.processors.cache.IgniteTopologyValidatorReplicatedTxCacheTest;

/**
 * Topology validator test suite.
 */
public class IgniteTopologyValidatorTestSuite extends TestSuite {
    /**
     * @return Topology validator tests suite.
     * @throws Exception If failed.
     */
    public static TestSuite suite() throws Exception {
        TestSuite suite = new TestSuite("Topology validator Test Suite");

        suite.addTest(new TestSuite(IgniteTopologyValidatorNearPartitionedAtomicCacheTest.class));
        suite.addTest(new TestSuite(IgniteTopologyValidatorNearPartitionedTxCacheTest.class));
        suite.addTest(new TestSuite(IgniteTopologyValidatorPartitionedAtomicCacheTest.class));
        suite.addTest(new TestSuite(IgniteTopologyValidatorPartitionedTxCacheTest.class));
        suite.addTest(new TestSuite(IgniteTopologyValidatorReplicatedAtomicCacheTest.class));
        suite.addTest(new TestSuite(IgniteTopologyValidatorReplicatedTxCacheTest.class));
        suite.addTest(new TestSuite(IgniteTopologyValidatorGridSplitCacheTest.class));

        return suite;
    }
}