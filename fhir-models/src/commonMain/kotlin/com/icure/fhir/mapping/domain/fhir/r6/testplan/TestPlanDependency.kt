//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.testplan

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The required criteria to execute the test plan - e.g. preconditions, previous tests
 *
 * The required criteria to execute the test plan - e.g. preconditions, previous tests...
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of the dependency criterium
 * @param predecessor Link to predecessor test plans
 */
@SerialName("TestPlanDependency")
@Serializable
public data class TestPlanDependency(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of the dependency criterium
   */
  public val description: String? = null,
  /**
   * Link to predecessor test plans
   */
  public val predecessor: Reference? = null,
) : BackboneElement
