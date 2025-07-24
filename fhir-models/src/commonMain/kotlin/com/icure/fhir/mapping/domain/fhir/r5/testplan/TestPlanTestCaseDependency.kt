//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.testplan

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Required criteria to execute the test case
 *
 * The required criteria to execute the test case - e.g. preconditions, previous tests.
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of the criteria
 * @param predecessor Link to predecessor test plans
 */
@SerialName("TestPlanTestCaseDependency")
@Serializable
public data class TestPlanTestCaseDependency(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of the criteria
   */
  public val description: String? = null,
  /**
   * Link to predecessor test plans
   */
  public val predecessor: Reference? = null,
) : BackboneElement
