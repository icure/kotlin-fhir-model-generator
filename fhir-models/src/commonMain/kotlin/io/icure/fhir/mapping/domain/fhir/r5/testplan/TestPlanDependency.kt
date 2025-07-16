//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.testplan

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
