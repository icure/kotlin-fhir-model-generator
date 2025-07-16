//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.testplan

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The test cases that constitute this plan
 *
 * The individual test cases that are part of this plan, when they they are made explicit.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Sequence of test case in the test plan
 */
@SerialName("TestPlanTestCase")
@Serializable
public data class TestPlanTestCase(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Sequence of test case in the test plan
   */
  public val sequence: Int? = null,
  public val scope: List<Reference> = emptyList(),
  public val dependency: List<TestPlanTestCaseDependency> = emptyList(),
  public val testRun: List<TestPlanTestCaseTestRun> = emptyList(),
  public val testData: List<TestPlanTestCaseTestData> = emptyList(),
  public val assertion: List<TestPlanTestCaseAssertion> = emptyList(),
) : BackboneElement
