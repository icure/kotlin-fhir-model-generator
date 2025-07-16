//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.testplan

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The actual test to be executed
 *
 * The actual test to be executed.
 *
 * @param id Unique id for inter-element referencing
 * @param narrative The narrative description of the tests
 * @param script The test cases in a structured language e.g. gherkin, Postman, or FHIR TestScript
 */
@SerialName("TestPlanTestCaseTestRun")
@Serializable
public data class TestPlanTestCaseTestRun(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The narrative description of the tests
   */
  public val narrative: String? = null,
  /**
   * The test cases in a structured language e.g. gherkin, Postman, or FHIR TestScript
   */
  public val script: TestPlanTestCaseTestRunScript? = null,
) : BackboneElement
