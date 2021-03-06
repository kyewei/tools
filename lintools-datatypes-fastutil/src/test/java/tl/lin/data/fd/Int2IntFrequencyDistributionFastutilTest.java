/*
 * Lintools: tools by @lintool
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package tl.lin.data.fd;

import junit.framework.JUnit4TestAdapter;

import org.junit.Test;

public class Int2IntFrequencyDistributionFastutilTest extends
    Int2IntFrequencyDistributionTestBase {

  @Test
  public void test1Fastutil() {
    Int2IntFrequencyDistribution fd = new Int2IntFrequencyDistributionFastutil();
    test1Common(fd);
  }

  @Test
  public void test2Fastutil() {
    Int2IntFrequencyDistribution fd = new Int2IntFrequencyDistributionFastutil();
    test2Common(fd);
  }

  @Test
  public void test3Fastutil() {
    Int2IntFrequencyDistribution fd = new Int2IntFrequencyDistributionFastutil();
    test3Common(fd);
  }

  @Test(expected = RuntimeException.class)
  public void testFailedDecrement1Fastutil() {
    Int2IntFrequencyDistribution fd = new Int2IntFrequencyDistributionFastutil();
    testFailedDecrement1Common(fd);
  }

  @Test(expected = RuntimeException.class)
  public void testFailedDecrement2Fastutil() {
    Int2IntFrequencyDistribution fd = new Int2IntFrequencyDistributionFastutil();
    testFailedDecrement2Common(fd);
  }

  @Test
  public void testMultiIncrementDecrementFastutil() {
    Int2IntFrequencyDistribution fd = new Int2IntFrequencyDistributionFastutil();
    testMultiIncrementDecrementCommon(fd);
  }

  @Test
  public void testGetFrequencySortedEventsFastutil() {
    Int2IntFrequencyDistribution fd = new Int2IntFrequencyDistributionFastutil();
    testGetFrequencySortedEventsCommon(fd);
  }

  @Test
  public void testGetSortedEventsFastutil() {
    Int2IntFrequencyDistribution fd = new Int2IntFrequencyDistributionFastutil();
    testGetSortedEventsCommon(fd);
  }

  @Test
  public void testIterableFastutil() {
    Int2IntFrequencyDistribution fd = new Int2IntFrequencyDistributionFastutil();
    testIterableCommon(fd);
  }

  @Test
  public void testSerialization() throws Exception {
    Int2IntFrequencyDistribution fd = new Int2IntFrequencyDistributionFastutil();
    testSerialization(fd, Int2IntFrequencyDistributionFastutil.class);
  }

  public static junit.framework.Test suite() {
    return new JUnit4TestAdapter(Int2IntFrequencyDistributionFastutilTest.class);
  }
}
