//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.testplan

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Test assertions or expectations
 *
 * The test assertions - the expectations of test results from the execution of the test case.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("TestPlanTestCaseAssertion")
@Serializable
public data class TestPlanTestCaseAssertion(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val type: List<CodeableConcept> = emptyList(),
  public val `object`: List<CodeableReference> = emptyList(),
  public val result: List<CodeableReference> = emptyList(),
) : BackboneElement
